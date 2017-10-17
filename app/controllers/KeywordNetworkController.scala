/*
 * Copyright (C) 2016 Language Technology Group and Interactive Graphics Systems Group, Technische Universität Darmstadt, Germany
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package controllers

import javax.inject.Inject

import models.services.{ EntityService, KeywordNetworkService }
import models.{ Facets, KeyTerm, KeywordNetwork, KeywordRelationship }
import org.elasticsearch.search.SearchHitField
import org.elasticsearch.search.internal.InternalSearchHitField
import play.api.libs.json.Json.toJson
import play.api.libs.json.{ JsObject, Json }
import play.api.mvc._
import scalikejdbc._
import util.DateUtils
import util.SessionUtils.currentDataset

import scala.collection.mutable.ListBuffer

/**
 * Provides network related actions.
 * @param entityService the service for entity backend operations.
 * @param keywordNetworkService the service for KeywordNetwork backend operations.
 * @param dateUtils common helper for date and time operations.
 */
class KeywordNetworkController @Inject() (
    entityService: EntityService,
    keywordNetworkService: KeywordNetworkService,
    dateUtils: DateUtils
) extends Controller {

  private val db = (index: String) => NamedDB(Symbol(index))
  private val numberOfNeighbors = 200

  /**
   * Accumulates the number of entities that fall in a certain entity type and co-occur with the given entity.
   *
   * @param fullText match documents that contain the given expression in the document body.
   * @param generic a map linking from document metadata keys to a list of instances for this metadata.
   * @param entities a list of entity ids that should occur in the document.
   * @param timeRange a string representing a time range for the document creation date.
   * @param timeExprRange a string representing a time range for the document time expression.
   * @param nodeId the entity id.
   * @return mapping from unique entity types to the number of neighbors of that type.
   */
  def getNeighborCountsKeyword(
    fullText: List[String],
    generic: Map[String, List[String]],
    entities: List[Long],
    timeRange: String,
    timeExprRange: String,
    nodeId: Long
  ) = Action { implicit request =>

    val (from, to) = dateUtils.parseTimeRange(timeRange)
    val (timeExprFrom, timeExprTo) = dateUtils.parseTimeRange(timeExprRange)
    val facets = Facets(fullText, generic, entities, List(), from, to, timeExprFrom, timeExprTo)

    val res = keywordNetworkService.getNeighborCountsPerTypeKeyword(facets, nodeId)(currentDataset)
    val counts = res.map { case (t, c) => Json.obj("type" -> t, "count" -> c) }
    Ok(Json.toJson(counts)).as("application/json")
  }

  /**
   * Returns a co-occurrence network matching the given search query.
   *
   * @param fullText match documents that contain the given expression in the document body.
   * @param generic a map linking from document metadata keys to a list of instances for this metadata.
   * @param entities a list of entity ids that should occur in the document.
   * @param timeRange a string representing a time range for the document creation date.
   * @param timeExprRange a string representing a time range for the document time expression.
   * @param nodeFraction a map linking from entity types to the number of nodes to request for each type.
   * @return a network consisting of the nodes and relationships of the created co-occurrence network.
   */
  def induceSubgraphKeyword(
    fullText: List[String],
    generic: Map[String, List[String]],
    entities: List[Long],
    keywords: List[String],
    timeRange: String,
    timeExprRange: String,
    nodeFraction: Map[String, String]
  ) = Action { implicit request =>
    val (from, to) = dateUtils.parseTimeRange(timeRange)
    val (timeExprFrom, timeExprTo) = dateUtils.parseTimeRange(timeExprRange)
    val facets = Facets(fullText, generic, entities, keywords, from, to, timeExprFrom, timeExprTo)
    val sizes = nodeFraction.mapValues(_.toInt)

    val blacklistedKeywords: List[String] = entityService.getBlacklistedKeywords()(currentDataset)

    val KeywordNetwork(nodes, relations) = keywordNetworkService.createNetworkKeyword(facets, sizes, blacklistedKeywords)(currentDataset)

    if (nodes.isEmpty) {
      Ok(Json.obj("entities" -> List[JsObject](), "relations" -> List[JsObject]())).as("application/json")
    } else {
      val graphEntities = nodesToJsonKeyword(nodes)
      // Ignore relations that connect blacklisted nodes
      val graphRelations = relations.filterNot { case KeywordRelationship(source, target, _) => blacklistedKeywords.contains(source) && blacklistedKeywords.contains(target) }

      Ok(Json.obj("entities" -> graphEntities, "relations" -> graphRelations)).as("application/json")
    }
  }

  /**
   * Adds new nodes to the current network matching the given search query.
   *
   * @param fullText match documents that contain the given expression in the document body.
   * @param generic a map linking from document metadata keys to a list of instances for this metadata.
   * @param entities a list of entity ids that should occur in the document.
   * @param timeRange a string representing a time range for the document creation date.
   * @param timeExprRange a string representing a time range for the document time expression.
   * @param currentNetwork the entity ids of the current network.
   * @param nodes new entities to be added to the network.
   * @return a network consisting of the nodes and relationships of the created co-occurrence network.
   */
  def addNodesKeyword(
    fullText: List[String],
    generic: Map[String, List[String]],
    entities: List[Long],
    timeRange: String,
    timeExprRange: String,
    currentNetwork: List[String],
    nodes: List[String]
  ) = Action { implicit request =>
    val (from, to) = dateUtils.parseTimeRange(timeRange)
    val (timeExprFrom, timeExprTo) = dateUtils.parseTimeRange(timeExprRange)
    val facets = Facets(fullText, generic, entities, List(), from, to, timeExprFrom, timeExprTo)

    val KeywordNetwork(buckets, relations) = keywordNetworkService.induceNetworkKeyword(facets, currentNetwork, nodes)(currentDataset)

    Ok(Json.obj("entities" -> nodesToJsonKeyword(buckets), "relations" -> relations)).as("application/json")
  }

  private def nodesToJsonKeyword(nodes: List[KeyTerm])(implicit request: Request[AnyContent]): List[JsObject] = {
    val termsArray: Array[JsObject] = new Array[JsObject](nodes.length)

    for (i <- 0 to nodes.length - 1) termsArray(i) = Json.obj(
      "id" -> i,
      "label" -> nodes(i).term,
      "count" -> nodes(i).score,
      "termType" -> nodes(i).termType
    )

    val terms: List[JsObject] = termsArray.toList
    terms
  }

  /** Marks the entities associated with the given ids as blacklisted. */
  def blacklistEntitiesByIdKeyword(ids: List[Long]) = Action { implicit request =>
    Ok(Json.obj("result" -> entityService.blacklist(ids)(currentDataset))).as("application/json")
  }

  /**
   * Marks the keyword associated with the given term as blacklisted.
   * @param keyword
   * @return
   */
  def blacklistKeywordByKeyTerm(keyword: String) = Action { implicit request =>
    Ok(Json.obj("result" -> entityService.blacklistKeyword(keyword)(currentDataset))).as("application/json")
  }

  /**
   * Merges multiple nodes in a given focal node.
   *
   * @param focalId the central entity id.
   * @param duplicates entity ids referring to similar textual mentions of the focal id.
   */
  def mergeKeywords(focalId: String, duplicates: List[String]) = Action { implicit request =>
    entityService.mergeKeywords(focalId, duplicates)(currentDataset)
    Ok("success").as("Text")
  }

  /** Changes the name of the entity corresponding to the given entity id. */
  def changeEntityNameByIdKeyword(id: Long, newName: String) = Action { implicit request =>
    Ok(Json.obj("result" -> entityService.changeName(id, newName)(currentDataset))).as("application/json")
  }

  /** Changes the type of the entity corresponding to the given entity id. */
  def changeEntityTypeByIdKeyword(id: Long, newType: String) = Action { implicit request =>
    Ok(Json.obj("result" -> entityService.changeType(id, newType)(currentDataset))).as("application/json")
  }

  def undoBlacklistingKeywords(blacklistedKeywords: List[String]) = Action { implicit request =>
    keywordNetworkService.undoBlacklistingKeywords(blacklistedKeywords)(currentDataset)
    Ok("success").as("Text")
  }

  def toggleTags(state: Boolean) = Action { implicit request =>
    keywordNetworkService.toggleTags(state)
    Ok("success").as("Text")
  }

  def getTags() = Action { implicit request =>
    Ok(Json.obj("result" -> keywordNetworkService.getAllTags()(currentDataset))).as("application/json")
  }

  def setTagKeywordRelation(tag: String, keywords: List[String], frequencies: List[Long]) = Action { implicit request =>

    var keyTerms: ListBuffer[KeyTerm] = ListBuffer()
    var count: Int = 0
    for (keyword <- keywords) {
      keyTerms.append(KeyTerm(keyword, frequencies(count), "KEYWORD"))
    }

    keywordNetworkService.setTagKeywordRelation(tag, keyTerms.toList)
    Ok("success").as("Text")
  }

  def resetTagKeywordRelation() = Action { implicit request =>
    keywordNetworkService.resetTagKeywordRelation()
    Ok("success").as("Text")
  }

  def getHostAddress() = Action { implicit request =>
    Ok(keywordNetworkService.getHostAddress()).as("Text")
  }

  def searchKeywordsByDocIdES(id: Long) = Action { implicit request =>
    val query =
      s"""
        {
          "query" : {
            "match" : {
              "_id": $id
            }
          }
        }
      """

    val list: ListBuffer[String] = ListBuffer()
    list.append("Keywords.Keyword.raw")
    list.append("Keywords.TermFrequency")

    val fields = list.toList
    val response = keywordNetworkService.executeQuery(query, fields)(currentDataset)
    val test = response.getHits.getAt(0)
    val result: ListBuffer[KeyTerm] = ListBuffer()
    val it = response.getHits.hits()(0).fields().values().iterator()
    val it2 = response.getHits.hits()(0).fields().values().toArray.toList
    val i1 = it2(0)
    val i2 = it2(1)

    if (it.hasNext) {
      val item = it.next()
      val vals = item.values().iterator()
      while (vals.hasNext) {
        val v = vals.next()
        v
        // result += KeyTerm(vals.next().toString
      }
    }

    // val res = Json.obj("keywords" -> i1, "frequencies" -> i2)
    // Ok(Json.obj("keywords" -> i1.toString, "freqs" -> i2.toString)).as("application/json")
    // Ok(Json.toJson("keywords" -> it2)).as("application/json")
    // Ok(Json.toJson("keywords" -> Json.toJson(it2))).as("application/json")
    // Results.Ok(Json.toJson(Json.obj("keywords" -> Json.toJson(it2)))).as("application/json")
    // Ok(Json.toJson(res))
    Ok(Json.toJson(test))
  }
}
