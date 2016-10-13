
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Thu Oct 13 22:16:34 CEST 2016


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
