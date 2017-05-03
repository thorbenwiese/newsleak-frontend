
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wiese/Documents/UHH/Master/2.Semester/Projekt/newsleak-frontend/conf/routes
// @DATE:Thu Apr 27 13:29:11 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.util.Binders._

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:47
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:47
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vassets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseDocumentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def getKeywordsById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getKeywordsById",
      """
        function(id0,size1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getKeywordsById" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("size", size1)])})
        }
      """
    )
  
    // @LINE:18
    def getDocs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getDocs",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getDocs" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4)])})
        }
      """
    )
  
    // @LINE:19
    def getDocsByIds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getDocsByIds",
      """
        function(ids0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getDocsByIds" + _qS([(""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("ids", ids0)])})
        }
      """
    )
  
    // @LINE:13
    def getTagLabels: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getTagLabels",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getLabels"})
        }
      """
    )
  
    // @LINE:14
    def addTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.addTag",
      """
        function(id0,label1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addTag" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("label", label1)])})
        }
      """
    )
  
    // @LINE:15
    def removeTagById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.removeTagById",
      """
        function(tagId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeTag" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("tagId", tagId0)])})
        }
      """
    )
  
    // @LINE:12
    def getDocsByLabel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getDocsByLabel",
      """
        function(label0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getDocsByLabel" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("label", label0)])})
        }
      """
    )
  
    // @LINE:16
    def getTagsByDocId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getTagsByDocId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTagsByDocId" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseNetworkController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def induceSubgraph: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.induceSubgraph",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,nodeFraction5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "induceSubgraph" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[Map[String,String]]].javascriptUnbind + """)("nodeFraction", nodeFraction5)])})
        }
      """
    )
  
    // @LINE:26
    def getNeighbors: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.getNeighbors",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,currentNetwork5,focalNode6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getNeighbors" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("currentNetwork", currentNetwork5), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("focalNode", focalNode6)])})
        }
      """
    )
  
    // @LINE:28
    def changeEntityTypeById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.changeEntityTypeById",
      """
        function(id0,newType1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changeEntityTypeById" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("newType", newType1)])})
        }
      """
    )
  
    // @LINE:23
    def mergeEntitiesById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.mergeEntitiesById",
      """
        function(focalId0,duplicates1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mergeEntitiesById" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("focalId", focalId0), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("duplicates", duplicates1)])})
        }
      """
    )
  
    // @LINE:27
    def changeEntityNameById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.changeEntityNameById",
      """
        function(id0,newName1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changeEntityNameById" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("newName", newName1)])})
        }
      """
    )
  
    // @LINE:21
    def addNodes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.addNodes",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,currentNetwork5,nodes6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addNode" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("currentNetwork", currentNetwork5), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("nodes", nodes6)])})
        }
      """
    )
  
    // @LINE:25
    def getNeighborCounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.getNeighborCounts",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,nodeId5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getNeighborCounts" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("nodeId", nodeId5)])})
        }
      """
    )
  
    // @LINE:22
    def blacklistEntitiesById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.blacklistEntitiesById",
      """
        function(ids0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blacklistEntitiesById" + _qS([(""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("ids", ids0)])})
        }
      """
    )
  
    // @LINE:24
    def getEdgeKeywords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NetworkController.getEdgeKeywords",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,first5,second6,numberOfTerms7) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getEdgeKeywords" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("first", first5), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("second", second6), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("numberOfTerms", numberOfTerms7)])})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def changeDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.changeDataset",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changeDataset" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:10
    def getDatasets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getDatasets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getDatasets"})
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:46
    def jsRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/jsroutes.js"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseEntityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getEntityTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.getEntityTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getEntityTypes"})
        }
      """
    )
  
    // @LINE:29
    def getEntitiesByType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.getEntitiesByType",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,size5,entityType6,filter7) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getEntities" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("size", size5), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("entityType", entityType6), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("filter", filter7)])})
        }
      """
    )
  
    // @LINE:33
    def undoBlacklistingByIds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.undoBlacklistingByIds",
      """
        function(ids0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "undoBlacklisting" + _qS([(""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("ids", ids0)])})
        }
      """
    )
  
    // @LINE:34
    def undoMergeByIds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.undoMergeByIds",
      """
        function(focalIds0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "undoMerge" + _qS([(""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("focalIds", focalIds0)])})
        }
      """
    )
  
    // @LINE:32
    def getMergedEntities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.getMergedEntities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getMerged"})
        }
      """
    )
  
    // @LINE:35
    def getEntitiesByDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.getEntitiesByDoc",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getEntitiesByDoc" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:31
    def getBlacklistedEntities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntityController.getBlacklistedEntities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getBlacklisted"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseMetadataController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getSpecificMetadata: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MetadataController.getSpecificMetadata",
      """
        function(fullText0,key1,generic2,entities3,instances4,timeRange5,timeExprRange6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getSpecificMetadata" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("key", key1), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic2), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities3), (""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("instances", instances4), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange5), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange6)])})
        }
      """
    )
  
    // @LINE:37
    def getMetadataTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MetadataController.getMetadataTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getMetadataTypes"})
        }
      """
    )
  
    // @LINE:36
    def getMetadata: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MetadataController.getMetadata",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getMetadata" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4)])})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseHistogramController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def getTimeExprTimeline: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HistogramController.getTimeExprTimeline",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,lod5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTimeExprTimeline" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lod", lod5)])})
        }
      """
    )
  
    // @LINE:41
    def getTimelineLOD: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HistogramController.getTimelineLOD",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTimelineLOD"})
        }
      """
    )
  
    // @LINE:39
    def getTimeline: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HistogramController.getTimeline",
      """
        function(fullText0,generic1,entities2,timeRange3,timeExprRange4,lod5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTimeline" + _qS([(""" + implicitly[QueryStringBindable[List[String]]].javascriptUnbind + """)("fullText", fullText0), (""" + implicitly[QueryStringBindable[Map[String,List[String]]]].javascriptUnbind + """)("generic", generic1), (""" + implicitly[QueryStringBindable[List[Long]]].javascriptUnbind + """)("entities", entities2), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeRange", timeRange3), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("timeExprRange", timeExprRange4), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lod", lod5)])})
        }
      """
    )
  
  }


}
