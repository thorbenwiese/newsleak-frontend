
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wiese/Documents/UHH/Master/2.Semester/Projekt/newsleak-frontend/conf/routes
// @DATE:Thu Apr 27 13:29:11 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
