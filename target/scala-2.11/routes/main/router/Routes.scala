
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/conf/routes
// @DATE:Fri May 05 11:30:31 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  CountController_2: controllers.CountController,
  // @LINE:8
  AsyncController_5: controllers.AsyncController,
  // @LINE:10
  Assets_7: controllers.Assets,
  // @LINE:14
  HomeController_3: controllers.HomeController,
  // @LINE:17
  PacienteController_1: controllers.PacienteController,
  // @LINE:19
  MedicoController_10: controllers.MedicoController,
  // @LINE:21
  ConsejoController_0: controllers.ConsejoController,
  // @LINE:22
  MedicionController_9: controllers.MedicionController,
  // @LINE:34
  SensorController_8: controllers.SensorController,
  // @LINE:56
  UrgenciaController_6: controllers.UrgenciaController,
  // @LINE:68
  HireFireController_4: controllers.HireFireController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    CountController_2: controllers.CountController,
    // @LINE:8
    AsyncController_5: controllers.AsyncController,
    // @LINE:10
    Assets_7: controllers.Assets,
    // @LINE:14
    HomeController_3: controllers.HomeController,
    // @LINE:17
    PacienteController_1: controllers.PacienteController,
    // @LINE:19
    MedicoController_10: controllers.MedicoController,
    // @LINE:21
    ConsejoController_0: controllers.ConsejoController,
    // @LINE:22
    MedicionController_9: controllers.MedicionController,
    // @LINE:34
    SensorController_8: controllers.SensorController,
    // @LINE:56
    UrgenciaController_6: controllers.UrgenciaController,
    // @LINE:68
    HireFireController_4: controllers.HireFireController
  ) = this(errorHandler, CountController_2, AsyncController_5, Assets_7, HomeController_3, PacienteController_1, MedicoController_10, ConsejoController_0, MedicionController_9, SensorController_8, UrgenciaController_6, HireFireController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CountController_2, AsyncController_5, Assets_7, HomeController_3, PacienteController_1, MedicoController_10, ConsejoController_0, MedicionController_9, SensorController_8, UrgenciaController_6, HireFireController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/login""", """controllers.HomeController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/perfil""", """controllers.HomeController.perfil()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/pacientes""", """controllers.PacienteController.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/pacientes/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.detalle(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/medicos""", """controllers.MedicoController.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/medicos/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.detalle(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/consejos""", """controllers.ConsejoController.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HospitalSantaFe/mediciones""", """controllers.MedicionController.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente""", """controllers.PacienteController.getPacientes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.getPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/porNombre/""" + "$" + """nombre<[^/]+>""", """controllers.PacienteController.getPacienteByName(nombre:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente""", """controllers.PacienteController.createPaciente()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.deletePaciente(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor""", """controllers.SensorController.getSensores()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor/""" + "$" + """idSensor<[^/]+>""", """controllers.SensorController.getSensor(idSensor:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor""", """controllers.SensorController.createSensor()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor/""" + "$" + """idSensor<[^/]+>""", """controllers.SensorController.deleteSensor(idSensor:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor/""" + "$" + """idSensor<[^/]+>""", """controllers.SensorController.updateSensor(idSensor:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicion""", """controllers.MedicionController.getMediciones()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicion/""" + "$" + """id<[^/]+>""", """controllers.MedicionController.getMedicion(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicion/enRango/""", """controllers.MedicionController.getByFechas(inicio:String, fin:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/medicion""", """controllers.PacienteController.agregarMedicion(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicion/""" + "$" + """id<[^/]+>""", """controllers.MedicionController.deleteMedicion(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicion/""" + "$" + """id<[^/]+>""", """controllers.MedicionController.updateMedicion(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico""", """controllers.MedicoController.getMedicos()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.getMedico(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico""", """controllers.MedicoController.createMedico()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.deleteMedico(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.updateMedico(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """urgencias""", """controllers.UrgenciaController.getUrgencias()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """urgencia/""" + "$" + """id<[^/]+>""", """controllers.UrgenciaController.getUrgencia(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """urgencia""", """controllers.UrgenciaController.createUrgencia()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarUrgencia/""" + "$" + """id<[^/]+>""", """controllers.UrgenciaController.deleteUrgencia(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """urgencia/""" + "$" + """id<[^/]+>""", """controllers.UrgenciaController.updateUrgencia(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loaderio-6d160b83d57d4302825f8e2854f38ddc/""", """controllers.HomeController.loaderio()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enviar""", """controllers.HomeController.enviar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hirefire/""" + "$" + """hirefire<[^/]+>/info""", """controllers.HireFireController.recibir(hirefire:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejo""", """controllers.ConsejoController.getConsejos()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejo/""" + "$" + """id<[^/]+>""", """controllers.ConsejoController.getConsejo(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/consejo""", """controllers.PacienteController.agregarConsejo(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejo/""" + "$" + """id<[^/]+>""", """controllers.ConsejoController.deleteConsejo(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejo/""" + "$" + """id<[^/]+>""", """controllers.ConsejoController.updateConsejo(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_CountController_count0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count0_invoker = createInvoker(
    CountController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AsyncController_message1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message1_invoker = createInvoker(
    AsyncController_5.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe")))
  )
  private[this] lazy val controllers_HomeController_index3_invoker = createInvoker(
    HomeController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """Interfaz""",
      this.prefix + """HospitalSantaFe"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/login")))
  )
  private[this] lazy val controllers_HomeController_login4_invoker = createInvoker(
    HomeController_3.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_perfil5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/perfil")))
  )
  private[this] lazy val controllers_HomeController_perfil5_invoker = createInvoker(
    HomeController_3.perfil(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "perfil",
      Nil,
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/perfil"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PacienteController_lista6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/pacientes")))
  )
  private[this] lazy val controllers_PacienteController_lista6_invoker = createInvoker(
    PacienteController_1.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "lista",
      Nil,
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/pacientes"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PacienteController_detalle7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/pacientes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_detalle7_invoker = createInvoker(
    PacienteController_1.detalle(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "detalle",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/pacientes/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MedicoController_lista8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/medicos")))
  )
  private[this] lazy val controllers_MedicoController_lista8_invoker = createInvoker(
    MedicoController_10.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "lista",
      Nil,
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/medicos"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_MedicoController_detalle9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/medicos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_detalle9_invoker = createInvoker(
    MedicoController_10.detalle(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "detalle",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/medicos/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ConsejoController_lista10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/consejos")))
  )
  private[this] lazy val controllers_ConsejoController_lista10_invoker = createInvoker(
    ConsejoController_0.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "lista",
      Nil,
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/consejos"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_MedicionController_lista11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/mediciones")))
  )
  private[this] lazy val controllers_MedicionController_lista11_invoker = createInvoker(
    MedicionController_9.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicionController",
      "lista",
      Nil,
      "GET",
      """""",
      this.prefix + """HospitalSantaFe/mediciones"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PacienteController_getPacientes12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_getPacientes12_invoker = createInvoker(
    PacienteController_1.getPacientes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPacientes",
      Nil,
      "GET",
      """paciente""",
      this.prefix + """paciente"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PacienteController_getPaciente13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPaciente13_invoker = createInvoker(
    PacienteController_1.getPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PacienteController_getPacienteByName14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/porNombre/"), DynamicPart("nombre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPacienteByName14_invoker = createInvoker(
    PacienteController_1.getPacienteByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPacienteByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """paciente/porNombre/""" + "$" + """nombre<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PacienteController_createPaciente15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_createPaciente15_invoker = createInvoker(
    PacienteController_1.createPaciente(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "createPaciente",
      Nil,
      "POST",
      """""",
      this.prefix + """paciente"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PacienteController_deletePaciente16_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_deletePaciente16_invoker = createInvoker(
    PacienteController_1.deletePaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "deletePaciente",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_PacienteController_updatePaciente17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente17_invoker = createInvoker(
    PacienteController_1.updatePaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "updatePaciente",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_SensorController_getSensores18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor")))
  )
  private[this] lazy val controllers_SensorController_getSensores18_invoker = createInvoker(
    SensorController_8.getSensores(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "getSensores",
      Nil,
      "GET",
      """sensor""",
      this.prefix + """sensor"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_SensorController_getSensor19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("idSensor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_getSensor19_invoker = createInvoker(
    SensorController_8.getSensor(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "getSensor",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """sensor/""" + "$" + """idSensor<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_SensorController_createSensor20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor")))
  )
  private[this] lazy val controllers_SensorController_createSensor20_invoker = createInvoker(
    SensorController_8.createSensor(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "createSensor",
      Nil,
      "POST",
      """""",
      this.prefix + """sensor"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_SensorController_deleteSensor21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("idSensor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_deleteSensor21_invoker = createInvoker(
    SensorController_8.deleteSensor(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "deleteSensor",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """sensor/""" + "$" + """idSensor<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_SensorController_updateSensor22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("idSensor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_updateSensor22_invoker = createInvoker(
    SensorController_8.updateSensor(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "updateSensor",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """sensor/""" + "$" + """idSensor<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_MedicionController_getMediciones23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion")))
  )
  private[this] lazy val controllers_MedicionController_getMediciones23_invoker = createInvoker(
    MedicionController_9.getMediciones(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicionController",
      "getMediciones",
      Nil,
      "GET",
      """Medicion""",
      this.prefix + """medicion"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_MedicionController_getMedicion24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicionController_getMedicion24_invoker = createInvoker(
    MedicionController_9.getMedicion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicionController",
      "getMedicion",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """medicion/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_MedicionController_getByFechas25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/enRango/")))
  )
  private[this] lazy val controllers_MedicionController_getByFechas25_invoker = createInvoker(
    MedicionController_9.getByFechas(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicionController",
      "getByFechas",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """medicion/enRango/"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_PacienteController_agregarMedicion26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/medicion")))
  )
  private[this] lazy val controllers_PacienteController_agregarMedicion26_invoker = createInvoker(
    PacienteController_1.agregarMedicion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "agregarMedicion",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/medicion"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_MedicionController_deleteMedicion27_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicionController_deleteMedicion27_invoker = createInvoker(
    MedicionController_9.deleteMedicion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicionController",
      "deleteMedicion",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """medicion/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_MedicionController_updateMedicion28_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicionController_updateMedicion28_invoker = createInvoker(
    MedicionController_9.updateMedicion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicionController",
      "updateMedicion",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """medicion/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_MedicoController_getMedicos29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_getMedicos29_invoker = createInvoker(
    MedicoController_10.getMedicos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "getMedicos",
      Nil,
      "GET",
      """Medico""",
      this.prefix + """medico"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_MedicoController_getMedico30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_getMedico30_invoker = createInvoker(
    MedicoController_10.getMedico(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "getMedico",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """medico/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_MedicoController_createMedico31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_createMedico31_invoker = createInvoker(
    MedicoController_10.createMedico(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "createMedico",
      Nil,
      "POST",
      """""",
      this.prefix + """medico"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_MedicoController_deleteMedico32_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_deleteMedico32_invoker = createInvoker(
    MedicoController_10.deleteMedico(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "deleteMedico",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """medico/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_MedicoController_updateMedico33_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_updateMedico33_invoker = createInvoker(
    MedicoController_10.updateMedico(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "updateMedico",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """medico/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_UrgenciaController_getUrgencias34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencias")))
  )
  private[this] lazy val controllers_UrgenciaController_getUrgencias34_invoker = createInvoker(
    UrgenciaController_6.getUrgencias(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UrgenciaController",
      "getUrgencias",
      Nil,
      "GET",
      """Urgencias""",
      this.prefix + """urgencias"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_UrgenciaController_getUrgencia35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UrgenciaController_getUrgencia35_invoker = createInvoker(
    UrgenciaController_6.getUrgencia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UrgenciaController",
      "getUrgencia",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """urgencia/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_UrgenciaController_createUrgencia36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencia")))
  )
  private[this] lazy val controllers_UrgenciaController_createUrgencia36_invoker = createInvoker(
    UrgenciaController_6.createUrgencia(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UrgenciaController",
      "createUrgencia",
      Nil,
      "POST",
      """""",
      this.prefix + """urgencia"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_UrgenciaController_deleteUrgencia37_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarUrgencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UrgenciaController_deleteUrgencia37_invoker = createInvoker(
    UrgenciaController_6.deleteUrgencia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UrgenciaController",
      "deleteUrgencia",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """eliminarUrgencia/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_UrgenciaController_updateUrgencia38_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UrgenciaController_updateUrgencia38_invoker = createInvoker(
    UrgenciaController_6.updateUrgencia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UrgenciaController",
      "updateUrgencia",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """urgencia/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Assets_versioned39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned39_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_HomeController_loaderio40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loaderio-6d160b83d57d4302825f8e2854f38ddc/")))
  )
  private[this] lazy val controllers_HomeController_loaderio40_invoker = createInvoker(
    HomeController_3.loaderio(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loaderio",
      Nil,
      "GET",
      """""",
      this.prefix + """loaderio-6d160b83d57d4302825f8e2854f38ddc/"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_HomeController_enviar41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enviar")))
  )
  private[this] lazy val controllers_HomeController_enviar41_invoker = createInvoker(
    HomeController_3.enviar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "enviar",
      Nil,
      "GET",
      """""",
      this.prefix + """enviar"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_HireFireController_recibir42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hirefire/"), DynamicPart("hirefire", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_HireFireController_recibir42_invoker = createInvoker(
    HireFireController_4.recibir(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HireFireController",
      "recibir",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """hirefire/""" + "$" + """hirefire<[^/]+>/info"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_ConsejoController_getConsejos43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo")))
  )
  private[this] lazy val controllers_ConsejoController_getConsejos43_invoker = createInvoker(
    ConsejoController_0.getConsejos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "getConsejos",
      Nil,
      "GET",
      """Consejo""",
      this.prefix + """consejo"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_ConsejoController_getConsejo44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_getConsejo44_invoker = createInvoker(
    ConsejoController_0.getConsejo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "getConsejo",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """consejo/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_PacienteController_agregarConsejo45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/consejo")))
  )
  private[this] lazy val controllers_PacienteController_agregarConsejo45_invoker = createInvoker(
    PacienteController_1.agregarConsejo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "agregarConsejo",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/consejo"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_ConsejoController_deleteConsejo46_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_deleteConsejo46_invoker = createInvoker(
    ConsejoController_0.deleteConsejo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "deleteConsejo",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """consejo/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_ConsejoController_updateConsejo47_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_updateConsejo47_invoker = createInvoker(
    ConsejoController_0.updateConsejo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "updateConsejo",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """consejo/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_CountController_count0_route(params) =>
      call { 
        controllers_CountController_count0_invoker.call(CountController_2.count)
      }
  
    // @LINE:8
    case controllers_AsyncController_message1_route(params) =>
      call { 
        controllers_AsyncController_message1_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:10
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_HomeController_index3_route(params) =>
      call { 
        controllers_HomeController_index3_invoker.call(HomeController_3.index())
      }
  
    // @LINE:15
    case controllers_HomeController_login4_route(params) =>
      call { 
        controllers_HomeController_login4_invoker.call(HomeController_3.login())
      }
  
    // @LINE:16
    case controllers_HomeController_perfil5_route(params) =>
      call { 
        controllers_HomeController_perfil5_invoker.call(HomeController_3.perfil())
      }
  
    // @LINE:17
    case controllers_PacienteController_lista6_route(params) =>
      call { 
        controllers_PacienteController_lista6_invoker.call(PacienteController_1.lista())
      }
  
    // @LINE:18
    case controllers_PacienteController_detalle7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_detalle7_invoker.call(PacienteController_1.detalle(id))
      }
  
    // @LINE:19
    case controllers_MedicoController_lista8_route(params) =>
      call { 
        controllers_MedicoController_lista8_invoker.call(MedicoController_10.lista())
      }
  
    // @LINE:20
    case controllers_MedicoController_detalle9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_detalle9_invoker.call(MedicoController_10.detalle(id))
      }
  
    // @LINE:21
    case controllers_ConsejoController_lista10_route(params) =>
      call { 
        controllers_ConsejoController_lista10_invoker.call(ConsejoController_0.lista())
      }
  
    // @LINE:22
    case controllers_MedicionController_lista11_route(params) =>
      call { 
        controllers_MedicionController_lista11_invoker.call(MedicionController_9.lista())
      }
  
    // @LINE:26
    case controllers_PacienteController_getPacientes12_route(params) =>
      call { 
        controllers_PacienteController_getPacientes12_invoker.call(PacienteController_1.getPacientes())
      }
  
    // @LINE:27
    case controllers_PacienteController_getPaciente13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_getPaciente13_invoker.call(PacienteController_1.getPaciente(id))
      }
  
    // @LINE:28
    case controllers_PacienteController_getPacienteByName14_route(params) =>
      call(params.fromPath[String]("nombre", None)) { (nombre) =>
        controllers_PacienteController_getPacienteByName14_invoker.call(PacienteController_1.getPacienteByName(nombre))
      }
  
    // @LINE:29
    case controllers_PacienteController_createPaciente15_route(params) =>
      call { 
        controllers_PacienteController_createPaciente15_invoker.call(PacienteController_1.createPaciente())
      }
  
    // @LINE:30
    case controllers_PacienteController_deletePaciente16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_deletePaciente16_invoker.call(PacienteController_1.deletePaciente(id))
      }
  
    // @LINE:31
    case controllers_PacienteController_updatePaciente17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente17_invoker.call(PacienteController_1.updatePaciente(id))
      }
  
    // @LINE:34
    case controllers_SensorController_getSensores18_route(params) =>
      call { 
        controllers_SensorController_getSensores18_invoker.call(SensorController_8.getSensores())
      }
  
    // @LINE:35
    case controllers_SensorController_getSensor19_route(params) =>
      call(params.fromPath[Long]("idSensor", None)) { (idSensor) =>
        controllers_SensorController_getSensor19_invoker.call(SensorController_8.getSensor(idSensor))
      }
  
    // @LINE:36
    case controllers_SensorController_createSensor20_route(params) =>
      call { 
        controllers_SensorController_createSensor20_invoker.call(SensorController_8.createSensor())
      }
  
    // @LINE:37
    case controllers_SensorController_deleteSensor21_route(params) =>
      call(params.fromPath[Long]("idSensor", None)) { (idSensor) =>
        controllers_SensorController_deleteSensor21_invoker.call(SensorController_8.deleteSensor(idSensor))
      }
  
    // @LINE:38
    case controllers_SensorController_updateSensor22_route(params) =>
      call(params.fromPath[Long]("idSensor", None)) { (idSensor) =>
        controllers_SensorController_updateSensor22_invoker.call(SensorController_8.updateSensor(idSensor))
      }
  
    // @LINE:41
    case controllers_MedicionController_getMediciones23_route(params) =>
      call { 
        controllers_MedicionController_getMediciones23_invoker.call(MedicionController_9.getMediciones())
      }
  
    // @LINE:42
    case controllers_MedicionController_getMedicion24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicionController_getMedicion24_invoker.call(MedicionController_9.getMedicion(id))
      }
  
    // @LINE:43
    case controllers_MedicionController_getByFechas25_route(params) =>
      call(params.fromQuery[String]("inicio", None), params.fromQuery[String]("fin", None)) { (inicio, fin) =>
        controllers_MedicionController_getByFechas25_invoker.call(MedicionController_9.getByFechas(inicio, fin))
      }
  
    // @LINE:44
    case controllers_PacienteController_agregarMedicion26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_agregarMedicion26_invoker.call(PacienteController_1.agregarMedicion(id))
      }
  
    // @LINE:45
    case controllers_MedicionController_deleteMedicion27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicionController_deleteMedicion27_invoker.call(MedicionController_9.deleteMedicion(id))
      }
  
    // @LINE:46
    case controllers_MedicionController_updateMedicion28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicionController_updateMedicion28_invoker.call(MedicionController_9.updateMedicion(id))
      }
  
    // @LINE:49
    case controllers_MedicoController_getMedicos29_route(params) =>
      call { 
        controllers_MedicoController_getMedicos29_invoker.call(MedicoController_10.getMedicos())
      }
  
    // @LINE:50
    case controllers_MedicoController_getMedico30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_getMedico30_invoker.call(MedicoController_10.getMedico(id))
      }
  
    // @LINE:51
    case controllers_MedicoController_createMedico31_route(params) =>
      call { 
        controllers_MedicoController_createMedico31_invoker.call(MedicoController_10.createMedico())
      }
  
    // @LINE:52
    case controllers_MedicoController_deleteMedico32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_deleteMedico32_invoker.call(MedicoController_10.deleteMedico(id))
      }
  
    // @LINE:53
    case controllers_MedicoController_updateMedico33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_updateMedico33_invoker.call(MedicoController_10.updateMedico(id))
      }
  
    // @LINE:56
    case controllers_UrgenciaController_getUrgencias34_route(params) =>
      call { 
        controllers_UrgenciaController_getUrgencias34_invoker.call(UrgenciaController_6.getUrgencias())
      }
  
    // @LINE:57
    case controllers_UrgenciaController_getUrgencia35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UrgenciaController_getUrgencia35_invoker.call(UrgenciaController_6.getUrgencia(id))
      }
  
    // @LINE:58
    case controllers_UrgenciaController_createUrgencia36_route(params) =>
      call { 
        controllers_UrgenciaController_createUrgencia36_invoker.call(UrgenciaController_6.createUrgencia())
      }
  
    // @LINE:59
    case controllers_UrgenciaController_deleteUrgencia37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UrgenciaController_deleteUrgencia37_invoker.call(UrgenciaController_6.deleteUrgencia(id))
      }
  
    // @LINE:60
    case controllers_UrgenciaController_updateUrgencia38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UrgenciaController_updateUrgencia38_invoker.call(UrgenciaController_6.updateUrgencia(id))
      }
  
    // @LINE:64
    case controllers_Assets_versioned39_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned39_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:65
    case controllers_HomeController_loaderio40_route(params) =>
      call { 
        controllers_HomeController_loaderio40_invoker.call(HomeController_3.loaderio())
      }
  
    // @LINE:66
    case controllers_HomeController_enviar41_route(params) =>
      call { 
        controllers_HomeController_enviar41_invoker.call(HomeController_3.enviar())
      }
  
    // @LINE:68
    case controllers_HireFireController_recibir42_route(params) =>
      call(params.fromPath[String]("hirefire", None)) { (hirefire) =>
        controllers_HireFireController_recibir42_invoker.call(HireFireController_4.recibir(hirefire))
      }
  
    // @LINE:71
    case controllers_ConsejoController_getConsejos43_route(params) =>
      call { 
        controllers_ConsejoController_getConsejos43_invoker.call(ConsejoController_0.getConsejos())
      }
  
    // @LINE:72
    case controllers_ConsejoController_getConsejo44_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConsejoController_getConsejo44_invoker.call(ConsejoController_0.getConsejo(id))
      }
  
    // @LINE:73
    case controllers_PacienteController_agregarConsejo45_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_agregarConsejo45_invoker.call(PacienteController_1.agregarConsejo(id))
      }
  
    // @LINE:74
    case controllers_ConsejoController_deleteConsejo46_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConsejoController_deleteConsejo46_invoker.call(ConsejoController_0.deleteConsejo(id))
      }
  
    // @LINE:75
    case controllers_ConsejoController_updateConsejo47_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConsejoController_updateConsejo47_invoker.call(ConsejoController_0.updateConsejo(id))
      }
  }
}
