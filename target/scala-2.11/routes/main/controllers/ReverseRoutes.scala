
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wiese/Documents/UHH/Master/2.Semester/Projekt/newsleak-frontend/conf/routes
// @DATE:Thu Apr 27 13:29:11 CEST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.util.Binders._

// @LINE:8
package controllers {

  // @LINE:47
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:47
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "vassets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseDocumentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def getKeywordsById(id:Int, size:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getKeywordsById" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)), Some(implicitly[QueryStringBindable[Int]].unbind("size", size)))))
    }
  
    // @LINE:18
    def getDocs(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getDocs" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)))))
    }
  
    // @LINE:19
    def getDocsByIds(ids:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getDocsByIds" + queryString(List(Some(implicitly[QueryStringBindable[List[Long]]].unbind("ids", ids)))))
    }
  
    // @LINE:13
    def getTagLabels(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getLabels")
    }
  
    // @LINE:14
    def addTag(id:Int, label:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addTag" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("label", label)))))
    }
  
    // @LINE:15
    def removeTagById(tagId:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "removeTag" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("tagId", tagId)))))
    }
  
    // @LINE:12
    def getDocsByLabel(label:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getDocsByLabel" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("label", label)))))
    }
  
    // @LINE:16
    def getTagsByDocId(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getTagsByDocId" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
    }
  
  }

  // @LINE:20
  class ReverseNetworkController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def induceSubgraph(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, nodeFraction:Map[String,String]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "induceSubgraph" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[Map[String,String]]].unbind("nodeFraction", nodeFraction)))))
    }
  
    // @LINE:26
    def getNeighbors(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, currentNetwork:List[Long], focalNode:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getNeighbors" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("currentNetwork", currentNetwork)), Some(implicitly[QueryStringBindable[Long]].unbind("focalNode", focalNode)))))
    }
  
    // @LINE:28
    def changeEntityTypeById(id:Long, newType:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "changeEntityTypeById" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("newType", newType)))))
    }
  
    // @LINE:23
    def mergeEntitiesById(focalId:Long, duplicates:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mergeEntitiesById" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("focalId", focalId)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("duplicates", duplicates)))))
    }
  
    // @LINE:27
    def changeEntityNameById(id:Long, newName:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "changeEntityNameById" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("newName", newName)))))
    }
  
    // @LINE:21
    def addNodes(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, currentNetwork:List[Long], nodes:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addNode" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("currentNetwork", currentNetwork)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("nodes", nodes)))))
    }
  
    // @LINE:25
    def getNeighborCounts(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, nodeId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getNeighborCounts" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[Long]].unbind("nodeId", nodeId)))))
    }
  
    // @LINE:22
    def blacklistEntitiesById(ids:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "blacklistEntitiesById" + queryString(List(Some(implicitly[QueryStringBindable[List[Long]]].unbind("ids", ids)))))
    }
  
    // @LINE:24
    def getEdgeKeywords(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, first:Long, second:Long, numberOfTerms:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getEdgeKeywords" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[Long]].unbind("first", first)), Some(implicitly[QueryStringBindable[Long]].unbind("second", second)), Some(implicitly[QueryStringBindable[Int]].unbind("numberOfTerms", numberOfTerms)))))
    }
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def changeDataset(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "changeDataset" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:10
    def getDatasets(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getDatasets")
    }
  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:46
    def jsRoutes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/jsroutes.js")
    }
  
  }

  // @LINE:29
  class ReverseEntityController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getEntityTypes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getEntityTypes")
    }
  
    // @LINE:29
    def getEntitiesByType(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, size:Int, entityType:String, filter:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getEntities" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[Int]].unbind("size", size)), Some(implicitly[QueryStringBindable[String]].unbind("entityType", entityType)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("filter", filter)))))
    }
  
    // @LINE:33
    def undoBlacklistingByIds(ids:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "undoBlacklisting" + queryString(List(Some(implicitly[QueryStringBindable[List[Long]]].unbind("ids", ids)))))
    }
  
    // @LINE:34
    def undoMergeByIds(focalIds:List[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "undoMerge" + queryString(List(Some(implicitly[QueryStringBindable[List[Long]]].unbind("focalIds", focalIds)))))
    }
  
    // @LINE:32
    def getMergedEntities(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getMerged")
    }
  
    // @LINE:35
    def getEntitiesByDoc(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getEntitiesByDoc" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:31
    def getBlacklistedEntities(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getBlacklisted")
    }
  
  }

  // @LINE:36
  class ReverseMetadataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getSpecificMetadata(fullText:List[String], key:String, generic:Map[String,List[String]], entities:List[Long], instances:List[String], timeRange:String, timeExprRange:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getSpecificMetadata" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[String]].unbind("key", key)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[List[String]]].unbind("instances", instances)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)))))
    }
  
    // @LINE:37
    def getMetadataTypes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getMetadataTypes")
    }
  
    // @LINE:36
    def getMetadata(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getMetadata" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)))))
    }
  
  }

  // @LINE:39
  class ReverseHistogramController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def getTimeExprTimeline(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, lod:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getTimeExprTimeline" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[String]].unbind("lod", lod)))))
    }
  
    // @LINE:41
    def getTimelineLOD(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getTimelineLOD")
    }
  
    // @LINE:39
    def getTimeline(fullText:List[String], generic:Map[String,List[String]], entities:List[Long], timeRange:String, timeExprRange:String, lod:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getTimeline" + queryString(List(Some(implicitly[QueryStringBindable[List[String]]].unbind("fullText", fullText)), Some(implicitly[QueryStringBindable[Map[String,List[String]]]].unbind("generic", generic)), Some(implicitly[QueryStringBindable[List[Long]]].unbind("entities", entities)), Some(implicitly[QueryStringBindable[String]].unbind("timeRange", timeRange)), Some(implicitly[QueryStringBindable[String]].unbind("timeExprRange", timeExprRange)), Some(implicitly[QueryStringBindable[String]].unbind("lod", lod)))))
    }
  
  }


}
