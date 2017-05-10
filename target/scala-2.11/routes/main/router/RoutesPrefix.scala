
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/conf/routes
// @DATE:Fri May 05 11:30:31 COT 2017


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
