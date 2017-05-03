
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wiese/Documents/UHH/Master/2.Semester/Projekt/newsleak-frontend/conf/routes
// @DATE:Thu Apr 27 13:29:11 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDocumentController DocumentController = new controllers.ReverseDocumentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseNetworkController NetworkController = new controllers.ReverseNetworkController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEntityController EntityController = new controllers.ReverseEntityController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMetadataController MetadataController = new controllers.ReverseMetadataController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHistogramController HistogramController = new controllers.ReverseHistogramController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDocumentController DocumentController = new controllers.javascript.ReverseDocumentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseNetworkController NetworkController = new controllers.javascript.ReverseNetworkController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEntityController EntityController = new controllers.javascript.ReverseEntityController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMetadataController MetadataController = new controllers.javascript.ReverseMetadataController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHistogramController HistogramController = new controllers.javascript.ReverseHistogramController(RoutesPrefix.byNamePrefix());
  }

}
