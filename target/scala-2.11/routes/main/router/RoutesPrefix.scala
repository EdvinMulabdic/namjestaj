
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Sun May 15 23:50:58 CEST 2016


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
