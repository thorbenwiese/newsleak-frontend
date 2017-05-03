
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wiese/Documents/UHH/Master/2.Semester/Projekt/newsleak-frontend/conf/routes
// @DATE:Thu Apr 27 13:29:11 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.util.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Application_4: controllers.Application,
  // @LINE:12
  DocumentController_5: controllers.DocumentController,
  // @LINE:20
  NetworkController_6: controllers.NetworkController,
  // @LINE:29
  EntityController_3: controllers.EntityController,
  // @LINE:36
  MetadataController_1: controllers.MetadataController,
  // @LINE:39
  HistogramController_0: controllers.HistogramController,
  // @LINE:47
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Application_4: controllers.Application,
    // @LINE:12
    DocumentController_5: controllers.DocumentController,
    // @LINE:20
    NetworkController_6: controllers.NetworkController,
    // @LINE:29
    EntityController_3: controllers.EntityController,
    // @LINE:36
    MetadataController_1: controllers.MetadataController,
    // @LINE:39
    HistogramController_0: controllers.HistogramController,
    // @LINE:47
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_4, DocumentController_5, NetworkController_6, EntityController_3, MetadataController_1, HistogramController_0, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, DocumentController_5, NetworkController_6, EntityController_3, MetadataController_1, HistogramController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDatasets""", """controllers.Application.getDatasets()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changeDataset""", """controllers.Application.changeDataset(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDocsByLabel""", """controllers.DocumentController.getDocsByLabel(label:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getLabels""", """controllers.DocumentController.getTagLabels()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTag""", """controllers.DocumentController.addTag(id:Int, label:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeTag""", """controllers.DocumentController.removeTagById(tagId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTagsByDocId""", """controllers.DocumentController.getTagsByDocId(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getKeywordsById""", """controllers.DocumentController.getKeywordsById(id:Int, size:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDocs""", """controllers.DocumentController.getDocs(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDocsByIds""", """controllers.DocumentController.getDocsByIds(ids:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """induceSubgraph""", """controllers.NetworkController.induceSubgraph(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, nodeFraction:Map[String,String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addNode""", """controllers.NetworkController.addNodes(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, currentNetwork:List[Long], nodes:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blacklistEntitiesById""", """controllers.NetworkController.blacklistEntitiesById(ids:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mergeEntitiesById""", """controllers.NetworkController.mergeEntitiesById(focalId:Long, duplicates:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getEdgeKeywords""", """controllers.NetworkController.getEdgeKeywords(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, first:Long, second:Long, numberOfTerms:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getNeighborCounts""", """controllers.NetworkController.getNeighborCounts(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, nodeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getNeighbors""", """controllers.NetworkController.getNeighbors(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, currentNetwork:List[Long], focalNode:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changeEntityNameById""", """controllers.NetworkController.changeEntityNameById(id:Long, newName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changeEntityTypeById""", """controllers.NetworkController.changeEntityTypeById(id:Long, newType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getEntities""", """controllers.EntityController.getEntitiesByType(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, size:Int, entityType:String, filter:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getEntityTypes""", """controllers.EntityController.getEntityTypes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getBlacklisted""", """controllers.EntityController.getBlacklistedEntities"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getMerged""", """controllers.EntityController.getMergedEntities"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """undoBlacklisting""", """controllers.EntityController.undoBlacklistingByIds(ids:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """undoMerge""", """controllers.EntityController.undoMergeByIds(focalIds:List[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getEntitiesByDoc""", """controllers.EntityController.getEntitiesByDoc(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getMetadata""", """controllers.MetadataController.getMetadata(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getMetadataTypes""", """controllers.MetadataController.getMetadataTypes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getSpecificMetadata""", """controllers.MetadataController.getSpecificMetadata(fullText:List[String], key:String, generic:Map[String,List[String]], entities:List[Long], instances:List[String], timeRange:String, timeExprRange:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTimeline""", """controllers.HistogramController.getTimeline(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, lod:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTimeExprTimeline""", """controllers.HistogramController.getTimeExprTimeline(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, lod:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTimelineLOD""", """controllers.HistogramController.getTimelineLOD"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/jsroutes.js""", """controllers.Application.jsRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vassets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#
 PAGES                                                                                         #
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_getDatasets1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDatasets")))
  )
  private[this] lazy val controllers_Application_getDatasets1_invoker = createInvoker(
    Application_4.getDatasets(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getDatasets",
      Nil,
      "GET",
      """""",
      this.prefix + """getDatasets"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_changeDataset2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changeDataset")))
  )
  private[this] lazy val controllers_Application_changeDataset2_invoker = createInvoker(
    Application_4.changeDataset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "changeDataset",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """changeDataset"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DocumentController_getDocsByLabel3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDocsByLabel")))
  )
  private[this] lazy val controllers_DocumentController_getDocsByLabel3_invoker = createInvoker(
    DocumentController_5.getDocsByLabel(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocsByLabel",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getDocsByLabel"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DocumentController_getTagLabels4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getLabels")))
  )
  private[this] lazy val controllers_DocumentController_getTagLabels4_invoker = createInvoker(
    DocumentController_5.getTagLabels(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getTagLabels",
      Nil,
      "GET",
      """""",
      this.prefix + """getLabels"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DocumentController_addTag5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTag")))
  )
  private[this] lazy val controllers_DocumentController_addTag5_invoker = createInvoker(
    DocumentController_5.addTag(fakeValue[Int], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "addTag",
      Seq(classOf[Int], classOf[String]),
      "GET",
      """""",
      this.prefix + """addTag"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DocumentController_removeTagById6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeTag")))
  )
  private[this] lazy val controllers_DocumentController_removeTagById6_invoker = createInvoker(
    DocumentController_5.removeTagById(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "removeTagById",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """removeTag"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DocumentController_getTagsByDocId7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTagsByDocId")))
  )
  private[this] lazy val controllers_DocumentController_getTagsByDocId7_invoker = createInvoker(
    DocumentController_5.getTagsByDocId(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getTagsByDocId",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """getTagsByDocId"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_DocumentController_getKeywordsById8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getKeywordsById")))
  )
  private[this] lazy val controllers_DocumentController_getKeywordsById8_invoker = createInvoker(
    DocumentController_5.getKeywordsById(fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getKeywordsById",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """getKeywordsById"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_DocumentController_getDocs9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDocs")))
  )
  private[this] lazy val controllers_DocumentController_getDocs9_invoker = createInvoker(
    DocumentController_5.getDocs(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocs",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """getDocs"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_DocumentController_getDocsByIds10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDocsByIds")))
  )
  private[this] lazy val controllers_DocumentController_getDocsByIds10_invoker = createInvoker(
    DocumentController_5.getDocsByIds(fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocsByIds",
      Seq(classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """getDocsByIds"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_NetworkController_induceSubgraph11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("induceSubgraph")))
  )
  private[this] lazy val controllers_NetworkController_induceSubgraph11_invoker = createInvoker(
    NetworkController_6.induceSubgraph(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[Map[String,String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "induceSubgraph",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[Map[String,String]]),
      "GET",
      """""",
      this.prefix + """induceSubgraph"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_NetworkController_addNodes12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addNode")))
  )
  private[this] lazy val controllers_NetworkController_addNodes12_invoker = createInvoker(
    NetworkController_6.addNodes(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[List[Long]], fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "addNodes",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[List[Long]], classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """addNode"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_NetworkController_blacklistEntitiesById13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blacklistEntitiesById")))
  )
  private[this] lazy val controllers_NetworkController_blacklistEntitiesById13_invoker = createInvoker(
    NetworkController_6.blacklistEntitiesById(fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "blacklistEntitiesById",
      Seq(classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """blacklistEntitiesById"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_NetworkController_mergeEntitiesById14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mergeEntitiesById")))
  )
  private[this] lazy val controllers_NetworkController_mergeEntitiesById14_invoker = createInvoker(
    NetworkController_6.mergeEntitiesById(fakeValue[Long], fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "mergeEntitiesById",
      Seq(classOf[Long], classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """mergeEntitiesById"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_NetworkController_getEdgeKeywords15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getEdgeKeywords")))
  )
  private[this] lazy val controllers_NetworkController_getEdgeKeywords15_invoker = createInvoker(
    NetworkController_6.getEdgeKeywords(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[Long], fakeValue[Long], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "getEdgeKeywords",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[Long], classOf[Long], classOf[Int]),
      "GET",
      """""",
      this.prefix + """getEdgeKeywords"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_NetworkController_getNeighborCounts16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getNeighborCounts")))
  )
  private[this] lazy val controllers_NetworkController_getNeighborCounts16_invoker = createInvoker(
    NetworkController_6.getNeighborCounts(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "getNeighborCounts",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[Long]),
      "GET",
      """""",
      this.prefix + """getNeighborCounts"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_NetworkController_getNeighbors17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getNeighbors")))
  )
  private[this] lazy val controllers_NetworkController_getNeighbors17_invoker = createInvoker(
    NetworkController_6.getNeighbors(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[List[Long]], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "getNeighbors",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[List[Long]], classOf[Long]),
      "GET",
      """""",
      this.prefix + """getNeighbors"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_NetworkController_changeEntityNameById18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changeEntityNameById")))
  )
  private[this] lazy val controllers_NetworkController_changeEntityNameById18_invoker = createInvoker(
    NetworkController_6.changeEntityNameById(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "changeEntityNameById",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """changeEntityNameById"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_NetworkController_changeEntityTypeById19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changeEntityTypeById")))
  )
  private[this] lazy val controllers_NetworkController_changeEntityTypeById19_invoker = createInvoker(
    NetworkController_6.changeEntityTypeById(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NetworkController",
      "changeEntityTypeById",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """changeEntityTypeById"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_EntityController_getEntitiesByType20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getEntities")))
  )
  private[this] lazy val controllers_EntityController_getEntitiesByType20_invoker = createInvoker(
    EntityController_3.getEntitiesByType(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "getEntitiesByType",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """getEntities"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_EntityController_getEntityTypes21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getEntityTypes")))
  )
  private[this] lazy val controllers_EntityController_getEntityTypes21_invoker = createInvoker(
    EntityController_3.getEntityTypes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "getEntityTypes",
      Nil,
      "GET",
      """""",
      this.prefix + """getEntityTypes"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_EntityController_getBlacklistedEntities22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getBlacklisted")))
  )
  private[this] lazy val controllers_EntityController_getBlacklistedEntities22_invoker = createInvoker(
    EntityController_3.getBlacklistedEntities,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "getBlacklistedEntities",
      Nil,
      "GET",
      """""",
      this.prefix + """getBlacklisted"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_EntityController_getMergedEntities23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getMerged")))
  )
  private[this] lazy val controllers_EntityController_getMergedEntities23_invoker = createInvoker(
    EntityController_3.getMergedEntities,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "getMergedEntities",
      Nil,
      "GET",
      """""",
      this.prefix + """getMerged"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_EntityController_undoBlacklistingByIds24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("undoBlacklisting")))
  )
  private[this] lazy val controllers_EntityController_undoBlacklistingByIds24_invoker = createInvoker(
    EntityController_3.undoBlacklistingByIds(fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "undoBlacklistingByIds",
      Seq(classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """undoBlacklisting"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_EntityController_undoMergeByIds25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("undoMerge")))
  )
  private[this] lazy val controllers_EntityController_undoMergeByIds25_invoker = createInvoker(
    EntityController_3.undoMergeByIds(fakeValue[List[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "undoMergeByIds",
      Seq(classOf[List[Long]]),
      "GET",
      """""",
      this.prefix + """undoMerge"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_EntityController_getEntitiesByDoc26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getEntitiesByDoc")))
  )
  private[this] lazy val controllers_EntityController_getEntitiesByDoc26_invoker = createInvoker(
    EntityController_3.getEntitiesByDoc(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntityController",
      "getEntitiesByDoc",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """getEntitiesByDoc"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_MetadataController_getMetadata27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getMetadata")))
  )
  private[this] lazy val controllers_MetadataController_getMetadata27_invoker = createInvoker(
    MetadataController_1.getMetadata(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MetadataController",
      "getMetadata",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """getMetadata"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_MetadataController_getMetadataTypes28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getMetadataTypes")))
  )
  private[this] lazy val controllers_MetadataController_getMetadataTypes28_invoker = createInvoker(
    MetadataController_1.getMetadataTypes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MetadataController",
      "getMetadataTypes",
      Nil,
      "GET",
      """""",
      this.prefix + """getMetadataTypes"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_MetadataController_getSpecificMetadata29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getSpecificMetadata")))
  )
  private[this] lazy val controllers_MetadataController_getSpecificMetadata29_invoker = createInvoker(
    MetadataController_1.getSpecificMetadata(fakeValue[List[String]], fakeValue[String], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[List[String]], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MetadataController",
      "getSpecificMetadata",
      Seq(classOf[List[String]], classOf[String], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[List[String]], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """getSpecificMetadata"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HistogramController_getTimeline30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTimeline")))
  )
  private[this] lazy val controllers_HistogramController_getTimeline30_invoker = createInvoker(
    HistogramController_0.getTimeline(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HistogramController",
      "getTimeline",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """getTimeline"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HistogramController_getTimeExprTimeline31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTimeExprTimeline")))
  )
  private[this] lazy val controllers_HistogramController_getTimeExprTimeline31_invoker = createInvoker(
    HistogramController_0.getTimeExprTimeline(fakeValue[List[String]], fakeValue[Map[String,List[String]]], fakeValue[List[Long]], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HistogramController",
      "getTimeExprTimeline",
      Seq(classOf[List[String]], classOf[Map[String,List[String]]], classOf[List[Long]], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """getTimeExprTimeline"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HistogramController_getTimelineLOD32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTimelineLOD")))
  )
  private[this] lazy val controllers_HistogramController_getTimelineLOD32_invoker = createInvoker(
    HistogramController_0.getTimelineLOD,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HistogramController",
      "getTimelineLOD",
      Nil,
      "GET",
      """""",
      this.prefix + """getTimelineLOD"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_jsRoutes33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/jsroutes.js")))
  )
  private[this] lazy val controllers_Application_jsRoutes33_invoker = createInvoker(
    Application_4.jsRoutes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsRoutes",
      Nil,
      "GET",
      """~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#
 JS ROUTING AND RESOURCES                                                                      #
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#""",
      this.prefix + """assets/javascripts/jsroutes.js"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_versioned34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vassets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned34_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """vassets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_at35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at35_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index)
      }
  
    // @LINE:10
    case controllers_Application_getDatasets1_route(params) =>
      call { 
        controllers_Application_getDatasets1_invoker.call(Application_4.getDatasets())
      }
  
    // @LINE:11
    case controllers_Application_changeDataset2_route(params) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_Application_changeDataset2_invoker.call(Application_4.changeDataset(name))
      }
  
    // @LINE:12
    case controllers_DocumentController_getDocsByLabel3_route(params) =>
      call(params.fromQuery[String]("label", None)) { (label) =>
        controllers_DocumentController_getDocsByLabel3_invoker.call(DocumentController_5.getDocsByLabel(label))
      }
  
    // @LINE:13
    case controllers_DocumentController_getTagLabels4_route(params) =>
      call { 
        controllers_DocumentController_getTagLabels4_invoker.call(DocumentController_5.getTagLabels())
      }
  
    // @LINE:14
    case controllers_DocumentController_addTag5_route(params) =>
      call(params.fromQuery[Int]("id", None), params.fromQuery[String]("label", None)) { (id, label) =>
        controllers_DocumentController_addTag5_invoker.call(DocumentController_5.addTag(id, label))
      }
  
    // @LINE:15
    case controllers_DocumentController_removeTagById6_route(params) =>
      call(params.fromQuery[Int]("tagId", None)) { (tagId) =>
        controllers_DocumentController_removeTagById6_invoker.call(DocumentController_5.removeTagById(tagId))
      }
  
    // @LINE:16
    case controllers_DocumentController_getTagsByDocId7_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_DocumentController_getTagsByDocId7_invoker.call(DocumentController_5.getTagsByDocId(id))
      }
  
    // @LINE:17
    case controllers_DocumentController_getKeywordsById8_route(params) =>
      call(params.fromQuery[Int]("id", None), params.fromQuery[Int]("size", None)) { (id, size) =>
        controllers_DocumentController_getKeywordsById8_invoker.call(DocumentController_5.getKeywordsById(id, size))
      }
  
    // @LINE:18
    case controllers_DocumentController_getDocs9_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None)) { (fullText, generic, entities, timeRange, timeExprRange) =>
        controllers_DocumentController_getDocs9_invoker.call(DocumentController_5.getDocs(fullText, generic, entities, timeRange, timeExprRange))
      }
  
    // @LINE:19
    case controllers_DocumentController_getDocsByIds10_route(params) =>
      call(params.fromQuery[List[Long]]("ids", None)) { (ids) =>
        controllers_DocumentController_getDocsByIds10_invoker.call(DocumentController_5.getDocsByIds(ids))
      }
  
    // @LINE:20
    case controllers_NetworkController_induceSubgraph11_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[Map[String,String]]("nodeFraction", None)) { (fullText, generic, entities, timeRange, timeExprRange, nodeFraction) =>
        controllers_NetworkController_induceSubgraph11_invoker.call(NetworkController_6.induceSubgraph(fullText, generic, entities, timeRange, timeExprRange, nodeFraction))
      }
  
    // @LINE:21
    case controllers_NetworkController_addNodes12_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[List[Long]]("currentNetwork", None), params.fromQuery[List[Long]]("nodes", None)) { (fullText, generic, entities, timeRange, timeExprRange, currentNetwork, nodes) =>
        controllers_NetworkController_addNodes12_invoker.call(NetworkController_6.addNodes(fullText, generic, entities, timeRange, timeExprRange, currentNetwork, nodes))
      }
  
    // @LINE:22
    case controllers_NetworkController_blacklistEntitiesById13_route(params) =>
      call(params.fromQuery[List[Long]]("ids", None)) { (ids) =>
        controllers_NetworkController_blacklistEntitiesById13_invoker.call(NetworkController_6.blacklistEntitiesById(ids))
      }
  
    // @LINE:23
    case controllers_NetworkController_mergeEntitiesById14_route(params) =>
      call(params.fromQuery[Long]("focalId", None), params.fromQuery[List[Long]]("duplicates", None)) { (focalId, duplicates) =>
        controllers_NetworkController_mergeEntitiesById14_invoker.call(NetworkController_6.mergeEntitiesById(focalId, duplicates))
      }
  
    // @LINE:24
    case controllers_NetworkController_getEdgeKeywords15_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[Long]("first", None), params.fromQuery[Long]("second", None), params.fromQuery[Int]("numberOfTerms", None)) { (fullText, generic, entities, timeRange, timeExprRange, first, second, numberOfTerms) =>
        controllers_NetworkController_getEdgeKeywords15_invoker.call(NetworkController_6.getEdgeKeywords(fullText, generic, entities, timeRange, timeExprRange, first, second, numberOfTerms))
      }
  
    // @LINE:25
    case controllers_NetworkController_getNeighborCounts16_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[Long]("nodeId", None)) { (fullText, generic, entities, timeRange, timeExprRange, nodeId) =>
        controllers_NetworkController_getNeighborCounts16_invoker.call(NetworkController_6.getNeighborCounts(fullText, generic, entities, timeRange, timeExprRange, nodeId))
      }
  
    // @LINE:26
    case controllers_NetworkController_getNeighbors17_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[List[Long]]("currentNetwork", None), params.fromQuery[Long]("focalNode", None)) { (fullText, generic, entities, timeRange, timeExprRange, currentNetwork, focalNode) =>
        controllers_NetworkController_getNeighbors17_invoker.call(NetworkController_6.getNeighbors(fullText, generic, entities, timeRange, timeExprRange, currentNetwork, focalNode))
      }
  
    // @LINE:27
    case controllers_NetworkController_changeEntityNameById18_route(params) =>
      call(params.fromQuery[Long]("id", None), params.fromQuery[String]("newName", None)) { (id, newName) =>
        controllers_NetworkController_changeEntityNameById18_invoker.call(NetworkController_6.changeEntityNameById(id, newName))
      }
  
    // @LINE:28
    case controllers_NetworkController_changeEntityTypeById19_route(params) =>
      call(params.fromQuery[Long]("id", None), params.fromQuery[String]("newType", None)) { (id, newType) =>
        controllers_NetworkController_changeEntityTypeById19_invoker.call(NetworkController_6.changeEntityTypeById(id, newType))
      }
  
    // @LINE:29
    case controllers_EntityController_getEntitiesByType20_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[Int]("size", None), params.fromQuery[String]("entityType", None), params.fromQuery[List[Long]]("filter", None)) { (fullText, generic, entities, timeRange, timeExprRange, size, entityType, filter) =>
        controllers_EntityController_getEntitiesByType20_invoker.call(EntityController_3.getEntitiesByType(fullText, generic, entities, timeRange, timeExprRange, size, entityType, filter))
      }
  
    // @LINE:30
    case controllers_EntityController_getEntityTypes21_route(params) =>
      call { 
        controllers_EntityController_getEntityTypes21_invoker.call(EntityController_3.getEntityTypes)
      }
  
    // @LINE:31
    case controllers_EntityController_getBlacklistedEntities22_route(params) =>
      call { 
        controllers_EntityController_getBlacklistedEntities22_invoker.call(EntityController_3.getBlacklistedEntities)
      }
  
    // @LINE:32
    case controllers_EntityController_getMergedEntities23_route(params) =>
      call { 
        controllers_EntityController_getMergedEntities23_invoker.call(EntityController_3.getMergedEntities)
      }
  
    // @LINE:33
    case controllers_EntityController_undoBlacklistingByIds24_route(params) =>
      call(params.fromQuery[List[Long]]("ids", None)) { (ids) =>
        controllers_EntityController_undoBlacklistingByIds24_invoker.call(EntityController_3.undoBlacklistingByIds(ids))
      }
  
    // @LINE:34
    case controllers_EntityController_undoMergeByIds25_route(params) =>
      call(params.fromQuery[List[Long]]("focalIds", None)) { (focalIds) =>
        controllers_EntityController_undoMergeByIds25_invoker.call(EntityController_3.undoMergeByIds(focalIds))
      }
  
    // @LINE:35
    case controllers_EntityController_getEntitiesByDoc26_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_EntityController_getEntitiesByDoc26_invoker.call(EntityController_3.getEntitiesByDoc(id))
      }
  
    // @LINE:36
    case controllers_MetadataController_getMetadata27_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None)) { (fullText, generic, entities, timeRange, timeExprRange) =>
        controllers_MetadataController_getMetadata27_invoker.call(MetadataController_1.getMetadata(fullText, generic, entities, timeRange, timeExprRange))
      }
  
    // @LINE:37
    case controllers_MetadataController_getMetadataTypes28_route(params) =>
      call { 
        controllers_MetadataController_getMetadataTypes28_invoker.call(MetadataController_1.getMetadataTypes)
      }
  
    // @LINE:38
    case controllers_MetadataController_getSpecificMetadata29_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[String]("key", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[List[String]]("instances", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None)) { (fullText, key, generic, entities, instances, timeRange, timeExprRange) =>
        controllers_MetadataController_getSpecificMetadata29_invoker.call(MetadataController_1.getSpecificMetadata(fullText, key, generic, entities, instances, timeRange, timeExprRange))
      }
  
    // @LINE:39
    case controllers_HistogramController_getTimeline30_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[String]("lod", None)) { (fullText, generic, entities, timeRange, timeExprRange, lod) =>
        controllers_HistogramController_getTimeline30_invoker.call(HistogramController_0.getTimeline(fullText, generic, entities, timeRange, timeExprRange, lod))
      }
  
    // @LINE:40
    case controllers_HistogramController_getTimeExprTimeline31_route(params) =>
      call(params.fromQuery[List[String]]("fullText", None), params.fromQuery[Map[String,List[String]]]("generic", None), params.fromQuery[List[Long]]("entities", None), params.fromQuery[String]("timeRange", None), params.fromQuery[String]("timeExprRange", None), params.fromQuery[String]("lod", None)) { (fullText, generic, entities, timeRange, timeExprRange, lod) =>
        controllers_HistogramController_getTimeExprTimeline31_invoker.call(HistogramController_0.getTimeExprTimeline(fullText, generic, entities, timeRange, timeExprRange, lod))
      }
  
    // @LINE:41
    case controllers_HistogramController_getTimelineLOD32_route(params) =>
      call { 
        controllers_HistogramController_getTimelineLOD32_invoker.call(HistogramController_0.getTimelineLOD)
      }
  
    // @LINE:46
    case controllers_Application_jsRoutes33_route(params) =>
      call { 
        controllers_Application_jsRoutes33_invoker.call(Application_4.jsRoutes())
      }
  
    // @LINE:47
    case controllers_Assets_versioned34_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned34_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:48
    case controllers_Assets_at35_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at35_invoker.call(Assets_2.at(path, file))
      }
  }
}
