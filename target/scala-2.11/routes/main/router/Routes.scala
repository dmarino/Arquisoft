
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/conf/routes
// @DATE:Sun May 14 12:45:14 COT 2017

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
  CountController_4: controllers.CountController,
  // @LINE:8
  AsyncController_9: controllers.AsyncController,
  // @LINE:10
  Assets_13: controllers.Assets,
  // @LINE:14
  PacienteController_3: controllers.PacienteController,
  // @LINE:16
  MedicoController_17: controllers.MedicoController,
  // @LINE:18
  ConsejoController_2: controllers.ConsejoController,
  // @LINE:19
  MedicionController_15: controllers.MedicionController,
  // @LINE:31
  SensorController_14: controllers.SensorController,
  // @LINE:55
  UrgenciaController_12: controllers.UrgenciaController,
  // @LINE:64
  HomeController_7: controllers.HomeController,
  // @LINE:67
  HireFireController_8: controllers.HireFireController,
  // @LINE:77
  RestrictController_10: controllers.RestrictController,
  // @LINE:85
  DynamicRestrictionsController_5: controllers.DynamicRestrictionsController,
  // @LINE:89
  PatternController_1: controllers.PatternController,
  // @LINE:92
  SubjectController_16: controllers.SubjectController,
  // @LINE:96
  EdgeCaseController_11: controllers.EdgeCaseController,
  // @LINE:97
  DeferredController_6: controllers.DeferredController,
  // @LINE:103
  UnrestrictedController_0: controllers.UnrestrictedController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    CountController_4: controllers.CountController,
    // @LINE:8
    AsyncController_9: controllers.AsyncController,
    // @LINE:10
    Assets_13: controllers.Assets,
    // @LINE:14
    PacienteController_3: controllers.PacienteController,
    // @LINE:16
    MedicoController_17: controllers.MedicoController,
    // @LINE:18
    ConsejoController_2: controllers.ConsejoController,
    // @LINE:19
    MedicionController_15: controllers.MedicionController,
    // @LINE:31
    SensorController_14: controllers.SensorController,
    // @LINE:55
    UrgenciaController_12: controllers.UrgenciaController,
    // @LINE:64
    HomeController_7: controllers.HomeController,
    // @LINE:67
    HireFireController_8: controllers.HireFireController,
    // @LINE:77
    RestrictController_10: controllers.RestrictController,
    // @LINE:85
    DynamicRestrictionsController_5: controllers.DynamicRestrictionsController,
    // @LINE:89
    PatternController_1: controllers.PatternController,
    // @LINE:92
    SubjectController_16: controllers.SubjectController,
    // @LINE:96
    EdgeCaseController_11: controllers.EdgeCaseController,
    // @LINE:97
    DeferredController_6: controllers.DeferredController,
    // @LINE:103
    UnrestrictedController_0: controllers.UnrestrictedController
  ) = this(errorHandler, CountController_4, AsyncController_9, Assets_13, PacienteController_3, MedicoController_17, ConsejoController_2, MedicionController_15, SensorController_14, UrgenciaController_12, HomeController_7, HireFireController_8, RestrictController_10, DynamicRestrictionsController_5, PatternController_1, SubjectController_16, EdgeCaseController_11, DeferredController_6, UnrestrictedController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CountController_4, AsyncController_9, Assets_13, PacienteController_3, MedicoController_17, ConsejoController_2, MedicionController_15, SensorController_14, UrgenciaController_12, HomeController_7, HireFireController_8, RestrictController_10, DynamicRestrictionsController_5, PatternController_1, SubjectController_16, EdgeCaseController_11, DeferredController_6, UnrestrictedController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico""", """controllers.MedicoController.getMedicoByEmail(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico""", """controllers.MedicoController.createMedico()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.deleteMedico(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.updateMedico(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/medico""", """controllers.PacienteController.asignarMedico(id:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restrictIndex""", """controllers.RestrictController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restrict1""", """controllers.RestrictController.restrictOne"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restrict2""", """controllers.RestrictController.restrictTwo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restrict3""", """controllers.RestrictController.restrictThree"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restrict4""", """controllers.RestrictController.restrictFour"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restrict5""", """controllers.RestrictController.restrictFive"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customRestrict1""", """controllers.RestrictController.customRestrictOne"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customRestrict2""", """controllers.RestrictController.customRestrictTwo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.DynamicRestrictionsController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pureLuck""", """controllers.DynamicRestrictionsController.pureLuck"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noWayJose""", """controllers.DynamicRestrictionsController.noWayJose"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewProfile""", """controllers.DynamicRestrictionsController.viewProfile(userName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editPrinter""", """controllers.PatternController.editPrinter"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detonatePrinter""", """controllers.PatternController.detonatePrinter"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editAnythingRegex""", """controllers.PatternController.editPrinterRegex"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rhp_in""", """controllers.SubjectController.subjectPresent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rhp_out""", """controllers.SubjectController.subjectPresent_notLoggedIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rhnp_out""", """controllers.SubjectController.subjectNotPresent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rhnp_in""", """controllers.SubjectController.subjectNotPresent_loggedIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bug""", """controllers.EdgeCaseController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deferredRestrict""", """controllers.DeferredController.deferredRestrict"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deferredRestrictions""", """controllers.DeferredController.deferredRestrictions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deferredPattern""", """controllers.DeferredController.deferredPattern"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deferredDynamic""", """controllers.DeferredController.deferredDynamic"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deferredSubjectPresent""", """controllers.DeferredController.deferredSubjectPresent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deferredSubjectNotPresent""", """controllers.DeferredController.deferredSubjectNotPresent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unrestrictedIndex""", """controllers.UnrestrictedController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unrestrictedOpen""", """controllers.UnrestrictedController.unrestrictedWithinAConstrainedController"""),
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
    CountController_4.count,
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
    AsyncController_9.message,
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
    Assets_13.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_PacienteController_lista3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/pacientes")))
  )
  private[this] lazy val controllers_PacienteController_lista3_invoker = createInvoker(
    PacienteController_3.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "lista",
      Nil,
      "GET",
      """Interfaz""",
      this.prefix + """HospitalSantaFe/pacientes"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PacienteController_detalle4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/pacientes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_detalle4_invoker = createInvoker(
    PacienteController_3.detalle(fakeValue[Long]),
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

  // @LINE:16
  private[this] lazy val controllers_MedicoController_lista5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/medicos")))
  )
  private[this] lazy val controllers_MedicoController_lista5_invoker = createInvoker(
    MedicoController_17.lista(),
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

  // @LINE:17
  private[this] lazy val controllers_MedicoController_detalle6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/medicos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_detalle6_invoker = createInvoker(
    MedicoController_17.detalle(fakeValue[Long]),
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

  // @LINE:18
  private[this] lazy val controllers_ConsejoController_lista7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/consejos")))
  )
  private[this] lazy val controllers_ConsejoController_lista7_invoker = createInvoker(
    ConsejoController_2.lista(),
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

  // @LINE:19
  private[this] lazy val controllers_MedicionController_lista8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HospitalSantaFe/mediciones")))
  )
  private[this] lazy val controllers_MedicionController_lista8_invoker = createInvoker(
    MedicionController_15.lista(),
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

  // @LINE:23
  private[this] lazy val controllers_PacienteController_getPacientes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_getPacientes9_invoker = createInvoker(
    PacienteController_3.getPacientes(),
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

  // @LINE:24
  private[this] lazy val controllers_PacienteController_getPaciente10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPaciente10_invoker = createInvoker(
    PacienteController_3.getPaciente(fakeValue[Long]),
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

  // @LINE:25
  private[this] lazy val controllers_PacienteController_getPacienteByName11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/porNombre/"), DynamicPart("nombre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPacienteByName11_invoker = createInvoker(
    PacienteController_3.getPacienteByName(fakeValue[String]),
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

  // @LINE:26
  private[this] lazy val controllers_PacienteController_createPaciente12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_createPaciente12_invoker = createInvoker(
    PacienteController_3.createPaciente(),
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

  // @LINE:27
  private[this] lazy val controllers_PacienteController_deletePaciente13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_deletePaciente13_invoker = createInvoker(
    PacienteController_3.deletePaciente(fakeValue[Long]),
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

  // @LINE:28
  private[this] lazy val controllers_PacienteController_updatePaciente14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente14_invoker = createInvoker(
    PacienteController_3.updatePaciente(fakeValue[Long]),
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

  // @LINE:31
  private[this] lazy val controllers_SensorController_getSensores15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor")))
  )
  private[this] lazy val controllers_SensorController_getSensores15_invoker = createInvoker(
    SensorController_14.getSensores(),
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

  // @LINE:32
  private[this] lazy val controllers_SensorController_getSensor16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("idSensor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_getSensor16_invoker = createInvoker(
    SensorController_14.getSensor(fakeValue[Long]),
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

  // @LINE:33
  private[this] lazy val controllers_SensorController_createSensor17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor")))
  )
  private[this] lazy val controllers_SensorController_createSensor17_invoker = createInvoker(
    SensorController_14.createSensor(),
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

  // @LINE:34
  private[this] lazy val controllers_SensorController_deleteSensor18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("idSensor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_deleteSensor18_invoker = createInvoker(
    SensorController_14.deleteSensor(fakeValue[Long]),
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

  // @LINE:35
  private[this] lazy val controllers_SensorController_updateSensor19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("idSensor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_updateSensor19_invoker = createInvoker(
    SensorController_14.updateSensor(fakeValue[Long]),
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

  // @LINE:38
  private[this] lazy val controllers_MedicionController_getMediciones20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion")))
  )
  private[this] lazy val controllers_MedicionController_getMediciones20_invoker = createInvoker(
    MedicionController_15.getMediciones(),
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

  // @LINE:39
  private[this] lazy val controllers_MedicionController_getMedicion21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicionController_getMedicion21_invoker = createInvoker(
    MedicionController_15.getMedicion(fakeValue[Long]),
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

  // @LINE:40
  private[this] lazy val controllers_MedicionController_getByFechas22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/enRango/")))
  )
  private[this] lazy val controllers_MedicionController_getByFechas22_invoker = createInvoker(
    MedicionController_15.getByFechas(fakeValue[String], fakeValue[String]),
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

  // @LINE:41
  private[this] lazy val controllers_PacienteController_agregarMedicion23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/medicion")))
  )
  private[this] lazy val controllers_PacienteController_agregarMedicion23_invoker = createInvoker(
    PacienteController_3.agregarMedicion(fakeValue[Long]),
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

  // @LINE:42
  private[this] lazy val controllers_MedicionController_deleteMedicion24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicionController_deleteMedicion24_invoker = createInvoker(
    MedicionController_15.deleteMedicion(fakeValue[Long]),
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

  // @LINE:43
  private[this] lazy val controllers_MedicionController_updateMedicion25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicionController_updateMedicion25_invoker = createInvoker(
    MedicionController_15.updateMedicion(fakeValue[Long]),
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

  // @LINE:46
  private[this] lazy val controllers_MedicoController_getMedicos26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_getMedicos26_invoker = createInvoker(
    MedicoController_17.getMedicos(),
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

  // @LINE:47
  private[this] lazy val controllers_MedicoController_getMedico27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_getMedico27_invoker = createInvoker(
    MedicoController_17.getMedico(fakeValue[Long]),
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

  // @LINE:48
  private[this] lazy val controllers_MedicoController_getMedicoByEmail28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_getMedicoByEmail28_invoker = createInvoker(
    MedicoController_17.getMedicoByEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "getMedicoByEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """medico"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_MedicoController_createMedico29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_createMedico29_invoker = createInvoker(
    MedicoController_17.createMedico(),
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

  // @LINE:50
  private[this] lazy val controllers_MedicoController_deleteMedico30_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_deleteMedico30_invoker = createInvoker(
    MedicoController_17.deleteMedico(fakeValue[Long]),
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

  // @LINE:51
  private[this] lazy val controllers_MedicoController_updateMedico31_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_updateMedico31_invoker = createInvoker(
    MedicoController_17.updateMedico(fakeValue[Long]),
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

  // @LINE:52
  private[this] lazy val controllers_PacienteController_asignarMedico32_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/medico")))
  )
  private[this] lazy val controllers_PacienteController_asignarMedico32_invoker = createInvoker(
    PacienteController_3.asignarMedico(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "asignarMedico",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/medico"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UrgenciaController_getUrgencias33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencias")))
  )
  private[this] lazy val controllers_UrgenciaController_getUrgencias33_invoker = createInvoker(
    UrgenciaController_12.getUrgencias(),
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

  // @LINE:56
  private[this] lazy val controllers_UrgenciaController_getUrgencia34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UrgenciaController_getUrgencia34_invoker = createInvoker(
    UrgenciaController_12.getUrgencia(fakeValue[Long]),
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

  // @LINE:57
  private[this] lazy val controllers_UrgenciaController_createUrgencia35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencia")))
  )
  private[this] lazy val controllers_UrgenciaController_createUrgencia35_invoker = createInvoker(
    UrgenciaController_12.createUrgencia(),
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

  // @LINE:58
  private[this] lazy val controllers_UrgenciaController_deleteUrgencia36_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarUrgencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UrgenciaController_deleteUrgencia36_invoker = createInvoker(
    UrgenciaController_12.deleteUrgencia(fakeValue[Long]),
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

  // @LINE:59
  private[this] lazy val controllers_UrgenciaController_updateUrgencia37_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("urgencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UrgenciaController_updateUrgencia37_invoker = createInvoker(
    UrgenciaController_12.updateUrgencia(fakeValue[Long]),
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

  // @LINE:63
  private[this] lazy val controllers_Assets_versioned38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned38_invoker = createInvoker(
    Assets_13.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:64
  private[this] lazy val controllers_HomeController_loaderio39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loaderio-6d160b83d57d4302825f8e2854f38ddc/")))
  )
  private[this] lazy val controllers_HomeController_loaderio39_invoker = createInvoker(
    HomeController_7.loaderio(),
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

  // @LINE:65
  private[this] lazy val controllers_HomeController_enviar40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enviar")))
  )
  private[this] lazy val controllers_HomeController_enviar40_invoker = createInvoker(
    HomeController_7.enviar(),
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

  // @LINE:67
  private[this] lazy val controllers_HireFireController_recibir41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hirefire/"), DynamicPart("hirefire", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_HireFireController_recibir41_invoker = createInvoker(
    HireFireController_8.recibir(fakeValue[String]),
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

  // @LINE:70
  private[this] lazy val controllers_ConsejoController_getConsejos42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo")))
  )
  private[this] lazy val controllers_ConsejoController_getConsejos42_invoker = createInvoker(
    ConsejoController_2.getConsejos(),
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

  // @LINE:71
  private[this] lazy val controllers_ConsejoController_getConsejo43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_getConsejo43_invoker = createInvoker(
    ConsejoController_2.getConsejo(fakeValue[Long]),
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

  // @LINE:72
  private[this] lazy val controllers_PacienteController_agregarConsejo44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/consejo")))
  )
  private[this] lazy val controllers_PacienteController_agregarConsejo44_invoker = createInvoker(
    PacienteController_3.agregarConsejo(fakeValue[Long]),
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

  // @LINE:73
  private[this] lazy val controllers_ConsejoController_deleteConsejo45_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_deleteConsejo45_invoker = createInvoker(
    ConsejoController_2.deleteConsejo(fakeValue[Long]),
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

  // @LINE:74
  private[this] lazy val controllers_ConsejoController_updateConsejo46_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_updateConsejo46_invoker = createInvoker(
    ConsejoController_2.updateConsejo(fakeValue[Long]),
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

  // @LINE:77
  private[this] lazy val controllers_RestrictController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restrictIndex")))
  )
  private[this] lazy val controllers_RestrictController_index47_invoker = createInvoker(
    RestrictController_10.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "index",
      Nil,
      "GET",
      """Seguridad""",
      this.prefix + """restrictIndex"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_RestrictController_restrictOne48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restrict1")))
  )
  private[this] lazy val controllers_RestrictController_restrictOne48_invoker = createInvoker(
    RestrictController_10.restrictOne,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "restrictOne",
      Nil,
      "GET",
      """""",
      this.prefix + """restrict1"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_RestrictController_restrictTwo49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restrict2")))
  )
  private[this] lazy val controllers_RestrictController_restrictTwo49_invoker = createInvoker(
    RestrictController_10.restrictTwo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "restrictTwo",
      Nil,
      "GET",
      """""",
      this.prefix + """restrict2"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_RestrictController_restrictThree50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restrict3")))
  )
  private[this] lazy val controllers_RestrictController_restrictThree50_invoker = createInvoker(
    RestrictController_10.restrictThree,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "restrictThree",
      Nil,
      "GET",
      """""",
      this.prefix + """restrict3"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_RestrictController_restrictFour51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restrict4")))
  )
  private[this] lazy val controllers_RestrictController_restrictFour51_invoker = createInvoker(
    RestrictController_10.restrictFour,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "restrictFour",
      Nil,
      "GET",
      """""",
      this.prefix + """restrict4"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_RestrictController_restrictFive52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restrict5")))
  )
  private[this] lazy val controllers_RestrictController_restrictFive52_invoker = createInvoker(
    RestrictController_10.restrictFive,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "restrictFive",
      Nil,
      "GET",
      """""",
      this.prefix + """restrict5"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_RestrictController_customRestrictOne53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customRestrict1")))
  )
  private[this] lazy val controllers_RestrictController_customRestrictOne53_invoker = createInvoker(
    RestrictController_10.customRestrictOne,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "customRestrictOne",
      Nil,
      "GET",
      """""",
      this.prefix + """customRestrict1"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_RestrictController_customRestrictTwo54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customRestrict2")))
  )
  private[this] lazy val controllers_RestrictController_customRestrictTwo54_invoker = createInvoker(
    RestrictController_10.customRestrictTwo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestrictController",
      "customRestrictTwo",
      Nil,
      "GET",
      """""",
      this.prefix + """customRestrict2"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_DynamicRestrictionsController_index55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_DynamicRestrictionsController_index55_invoker = createInvoker(
    DynamicRestrictionsController_5.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DynamicRestrictionsController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """index"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_DynamicRestrictionsController_pureLuck56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pureLuck")))
  )
  private[this] lazy val controllers_DynamicRestrictionsController_pureLuck56_invoker = createInvoker(
    DynamicRestrictionsController_5.pureLuck,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DynamicRestrictionsController",
      "pureLuck",
      Nil,
      "GET",
      """""",
      this.prefix + """pureLuck"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_DynamicRestrictionsController_noWayJose57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noWayJose")))
  )
  private[this] lazy val controllers_DynamicRestrictionsController_noWayJose57_invoker = createInvoker(
    DynamicRestrictionsController_5.noWayJose,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DynamicRestrictionsController",
      "noWayJose",
      Nil,
      "GET",
      """""",
      this.prefix + """noWayJose"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_DynamicRestrictionsController_viewProfile58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewProfile")))
  )
  private[this] lazy val controllers_DynamicRestrictionsController_viewProfile58_invoker = createInvoker(
    DynamicRestrictionsController_5.viewProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DynamicRestrictionsController",
      "viewProfile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """viewProfile"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_PatternController_editPrinter59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editPrinter")))
  )
  private[this] lazy val controllers_PatternController_editPrinter59_invoker = createInvoker(
    PatternController_1.editPrinter,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatternController",
      "editPrinter",
      Nil,
      "GET",
      """""",
      this.prefix + """editPrinter"""
    )
  )

  // @LINE:90
  private[this] lazy val controllers_PatternController_detonatePrinter60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detonatePrinter")))
  )
  private[this] lazy val controllers_PatternController_detonatePrinter60_invoker = createInvoker(
    PatternController_1.detonatePrinter,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatternController",
      "detonatePrinter",
      Nil,
      "GET",
      """""",
      this.prefix + """detonatePrinter"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_PatternController_editPrinterRegex61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editAnythingRegex")))
  )
  private[this] lazy val controllers_PatternController_editPrinterRegex61_invoker = createInvoker(
    PatternController_1.editPrinterRegex,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatternController",
      "editPrinterRegex",
      Nil,
      "GET",
      """""",
      this.prefix + """editAnythingRegex"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_SubjectController_subjectPresent62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rhp_in")))
  )
  private[this] lazy val controllers_SubjectController_subjectPresent62_invoker = createInvoker(
    SubjectController_16.subjectPresent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectController",
      "subjectPresent",
      Nil,
      "GET",
      """""",
      this.prefix + """rhp_in"""
    )
  )

  // @LINE:93
  private[this] lazy val controllers_SubjectController_subjectPresent_notLoggedIn63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rhp_out")))
  )
  private[this] lazy val controllers_SubjectController_subjectPresent_notLoggedIn63_invoker = createInvoker(
    SubjectController_16.subjectPresent_notLoggedIn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectController",
      "subjectPresent_notLoggedIn",
      Nil,
      "GET",
      """""",
      this.prefix + """rhp_out"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_SubjectController_subjectNotPresent64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rhnp_out")))
  )
  private[this] lazy val controllers_SubjectController_subjectNotPresent64_invoker = createInvoker(
    SubjectController_16.subjectNotPresent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectController",
      "subjectNotPresent",
      Nil,
      "GET",
      """""",
      this.prefix + """rhnp_out"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_SubjectController_subjectNotPresent_loggedIn65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rhnp_in")))
  )
  private[this] lazy val controllers_SubjectController_subjectNotPresent_loggedIn65_invoker = createInvoker(
    SubjectController_16.subjectNotPresent_loggedIn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectController",
      "subjectNotPresent_loggedIn",
      Nil,
      "GET",
      """""",
      this.prefix + """rhnp_in"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_EdgeCaseController_index66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bug")))
  )
  private[this] lazy val controllers_EdgeCaseController_index66_invoker = createInvoker(
    EdgeCaseController_11.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdgeCaseController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """bug"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_DeferredController_deferredRestrict67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deferredRestrict")))
  )
  private[this] lazy val controllers_DeferredController_deferredRestrict67_invoker = createInvoker(
    DeferredController_6.deferredRestrict,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeferredController",
      "deferredRestrict",
      Nil,
      "GET",
      """""",
      this.prefix + """deferredRestrict"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_DeferredController_deferredRestrictions68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deferredRestrictions")))
  )
  private[this] lazy val controllers_DeferredController_deferredRestrictions68_invoker = createInvoker(
    DeferredController_6.deferredRestrictions,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeferredController",
      "deferredRestrictions",
      Nil,
      "GET",
      """""",
      this.prefix + """deferredRestrictions"""
    )
  )

  // @LINE:99
  private[this] lazy val controllers_DeferredController_deferredPattern69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deferredPattern")))
  )
  private[this] lazy val controllers_DeferredController_deferredPattern69_invoker = createInvoker(
    DeferredController_6.deferredPattern,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeferredController",
      "deferredPattern",
      Nil,
      "GET",
      """""",
      this.prefix + """deferredPattern"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_DeferredController_deferredDynamic70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deferredDynamic")))
  )
  private[this] lazy val controllers_DeferredController_deferredDynamic70_invoker = createInvoker(
    DeferredController_6.deferredDynamic,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeferredController",
      "deferredDynamic",
      Nil,
      "GET",
      """""",
      this.prefix + """deferredDynamic"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_DeferredController_deferredSubjectPresent71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deferredSubjectPresent")))
  )
  private[this] lazy val controllers_DeferredController_deferredSubjectPresent71_invoker = createInvoker(
    DeferredController_6.deferredSubjectPresent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeferredController",
      "deferredSubjectPresent",
      Nil,
      "GET",
      """""",
      this.prefix + """deferredSubjectPresent"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_DeferredController_deferredSubjectNotPresent72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deferredSubjectNotPresent")))
  )
  private[this] lazy val controllers_DeferredController_deferredSubjectNotPresent72_invoker = createInvoker(
    DeferredController_6.deferredSubjectNotPresent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeferredController",
      "deferredSubjectNotPresent",
      Nil,
      "GET",
      """""",
      this.prefix + """deferredSubjectNotPresent"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_UnrestrictedController_index73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unrestrictedIndex")))
  )
  private[this] lazy val controllers_UnrestrictedController_index73_invoker = createInvoker(
    UnrestrictedController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnrestrictedController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """unrestrictedIndex"""
    )
  )

  // @LINE:104
  private[this] lazy val controllers_UnrestrictedController_unrestrictedWithinAConstrainedController74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unrestrictedOpen")))
  )
  private[this] lazy val controllers_UnrestrictedController_unrestrictedWithinAConstrainedController74_invoker = createInvoker(
    UnrestrictedController_0.unrestrictedWithinAConstrainedController,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnrestrictedController",
      "unrestrictedWithinAConstrainedController",
      Nil,
      "GET",
      """""",
      this.prefix + """unrestrictedOpen"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_CountController_count0_route(params) =>
      call { 
        controllers_CountController_count0_invoker.call(CountController_4.count)
      }
  
    // @LINE:8
    case controllers_AsyncController_message1_route(params) =>
      call { 
        controllers_AsyncController_message1_invoker.call(AsyncController_9.message)
      }
  
    // @LINE:10
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_13.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_PacienteController_lista3_route(params) =>
      call { 
        controllers_PacienteController_lista3_invoker.call(PacienteController_3.lista())
      }
  
    // @LINE:15
    case controllers_PacienteController_detalle4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_detalle4_invoker.call(PacienteController_3.detalle(id))
      }
  
    // @LINE:16
    case controllers_MedicoController_lista5_route(params) =>
      call { 
        controllers_MedicoController_lista5_invoker.call(MedicoController_17.lista())
      }
  
    // @LINE:17
    case controllers_MedicoController_detalle6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_detalle6_invoker.call(MedicoController_17.detalle(id))
      }
  
    // @LINE:18
    case controllers_ConsejoController_lista7_route(params) =>
      call { 
        controllers_ConsejoController_lista7_invoker.call(ConsejoController_2.lista())
      }
  
    // @LINE:19
    case controllers_MedicionController_lista8_route(params) =>
      call { 
        controllers_MedicionController_lista8_invoker.call(MedicionController_15.lista())
      }
  
    // @LINE:23
    case controllers_PacienteController_getPacientes9_route(params) =>
      call { 
        controllers_PacienteController_getPacientes9_invoker.call(PacienteController_3.getPacientes())
      }
  
    // @LINE:24
    case controllers_PacienteController_getPaciente10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_getPaciente10_invoker.call(PacienteController_3.getPaciente(id))
      }
  
    // @LINE:25
    case controllers_PacienteController_getPacienteByName11_route(params) =>
      call(params.fromPath[String]("nombre", None)) { (nombre) =>
        controllers_PacienteController_getPacienteByName11_invoker.call(PacienteController_3.getPacienteByName(nombre))
      }
  
    // @LINE:26
    case controllers_PacienteController_createPaciente12_route(params) =>
      call { 
        controllers_PacienteController_createPaciente12_invoker.call(PacienteController_3.createPaciente())
      }
  
    // @LINE:27
    case controllers_PacienteController_deletePaciente13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_deletePaciente13_invoker.call(PacienteController_3.deletePaciente(id))
      }
  
    // @LINE:28
    case controllers_PacienteController_updatePaciente14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente14_invoker.call(PacienteController_3.updatePaciente(id))
      }
  
    // @LINE:31
    case controllers_SensorController_getSensores15_route(params) =>
      call { 
        controllers_SensorController_getSensores15_invoker.call(SensorController_14.getSensores())
      }
  
    // @LINE:32
    case controllers_SensorController_getSensor16_route(params) =>
      call(params.fromPath[Long]("idSensor", None)) { (idSensor) =>
        controllers_SensorController_getSensor16_invoker.call(SensorController_14.getSensor(idSensor))
      }
  
    // @LINE:33
    case controllers_SensorController_createSensor17_route(params) =>
      call { 
        controllers_SensorController_createSensor17_invoker.call(SensorController_14.createSensor())
      }
  
    // @LINE:34
    case controllers_SensorController_deleteSensor18_route(params) =>
      call(params.fromPath[Long]("idSensor", None)) { (idSensor) =>
        controllers_SensorController_deleteSensor18_invoker.call(SensorController_14.deleteSensor(idSensor))
      }
  
    // @LINE:35
    case controllers_SensorController_updateSensor19_route(params) =>
      call(params.fromPath[Long]("idSensor", None)) { (idSensor) =>
        controllers_SensorController_updateSensor19_invoker.call(SensorController_14.updateSensor(idSensor))
      }
  
    // @LINE:38
    case controllers_MedicionController_getMediciones20_route(params) =>
      call { 
        controllers_MedicionController_getMediciones20_invoker.call(MedicionController_15.getMediciones())
      }
  
    // @LINE:39
    case controllers_MedicionController_getMedicion21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicionController_getMedicion21_invoker.call(MedicionController_15.getMedicion(id))
      }
  
    // @LINE:40
    case controllers_MedicionController_getByFechas22_route(params) =>
      call(params.fromQuery[String]("inicio", None), params.fromQuery[String]("fin", None)) { (inicio, fin) =>
        controllers_MedicionController_getByFechas22_invoker.call(MedicionController_15.getByFechas(inicio, fin))
      }
  
    // @LINE:41
    case controllers_PacienteController_agregarMedicion23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_agregarMedicion23_invoker.call(PacienteController_3.agregarMedicion(id))
      }
  
    // @LINE:42
    case controllers_MedicionController_deleteMedicion24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicionController_deleteMedicion24_invoker.call(MedicionController_15.deleteMedicion(id))
      }
  
    // @LINE:43
    case controllers_MedicionController_updateMedicion25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicionController_updateMedicion25_invoker.call(MedicionController_15.updateMedicion(id))
      }
  
    // @LINE:46
    case controllers_MedicoController_getMedicos26_route(params) =>
      call { 
        controllers_MedicoController_getMedicos26_invoker.call(MedicoController_17.getMedicos())
      }
  
    // @LINE:47
    case controllers_MedicoController_getMedico27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_getMedico27_invoker.call(MedicoController_17.getMedico(id))
      }
  
    // @LINE:48
    case controllers_MedicoController_getMedicoByEmail28_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_MedicoController_getMedicoByEmail28_invoker.call(MedicoController_17.getMedicoByEmail(email))
      }
  
    // @LINE:49
    case controllers_MedicoController_createMedico29_route(params) =>
      call { 
        controllers_MedicoController_createMedico29_invoker.call(MedicoController_17.createMedico())
      }
  
    // @LINE:50
    case controllers_MedicoController_deleteMedico30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_deleteMedico30_invoker.call(MedicoController_17.deleteMedico(id))
      }
  
    // @LINE:51
    case controllers_MedicoController_updateMedico31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_updateMedico31_invoker.call(MedicoController_17.updateMedico(id))
      }
  
    // @LINE:52
    case controllers_PacienteController_asignarMedico32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_asignarMedico32_invoker.call(PacienteController_3.asignarMedico(id))
      }
  
    // @LINE:55
    case controllers_UrgenciaController_getUrgencias33_route(params) =>
      call { 
        controllers_UrgenciaController_getUrgencias33_invoker.call(UrgenciaController_12.getUrgencias())
      }
  
    // @LINE:56
    case controllers_UrgenciaController_getUrgencia34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UrgenciaController_getUrgencia34_invoker.call(UrgenciaController_12.getUrgencia(id))
      }
  
    // @LINE:57
    case controllers_UrgenciaController_createUrgencia35_route(params) =>
      call { 
        controllers_UrgenciaController_createUrgencia35_invoker.call(UrgenciaController_12.createUrgencia())
      }
  
    // @LINE:58
    case controllers_UrgenciaController_deleteUrgencia36_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UrgenciaController_deleteUrgencia36_invoker.call(UrgenciaController_12.deleteUrgencia(id))
      }
  
    // @LINE:59
    case controllers_UrgenciaController_updateUrgencia37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UrgenciaController_updateUrgencia37_invoker.call(UrgenciaController_12.updateUrgencia(id))
      }
  
    // @LINE:63
    case controllers_Assets_versioned38_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned38_invoker.call(Assets_13.versioned(path, file))
      }
  
    // @LINE:64
    case controllers_HomeController_loaderio39_route(params) =>
      call { 
        controllers_HomeController_loaderio39_invoker.call(HomeController_7.loaderio())
      }
  
    // @LINE:65
    case controllers_HomeController_enviar40_route(params) =>
      call { 
        controllers_HomeController_enviar40_invoker.call(HomeController_7.enviar())
      }
  
    // @LINE:67
    case controllers_HireFireController_recibir41_route(params) =>
      call(params.fromPath[String]("hirefire", None)) { (hirefire) =>
        controllers_HireFireController_recibir41_invoker.call(HireFireController_8.recibir(hirefire))
      }
  
    // @LINE:70
    case controllers_ConsejoController_getConsejos42_route(params) =>
      call { 
        controllers_ConsejoController_getConsejos42_invoker.call(ConsejoController_2.getConsejos())
      }
  
    // @LINE:71
    case controllers_ConsejoController_getConsejo43_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConsejoController_getConsejo43_invoker.call(ConsejoController_2.getConsejo(id))
      }
  
    // @LINE:72
    case controllers_PacienteController_agregarConsejo44_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_agregarConsejo44_invoker.call(PacienteController_3.agregarConsejo(id))
      }
  
    // @LINE:73
    case controllers_ConsejoController_deleteConsejo45_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConsejoController_deleteConsejo45_invoker.call(ConsejoController_2.deleteConsejo(id))
      }
  
    // @LINE:74
    case controllers_ConsejoController_updateConsejo46_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConsejoController_updateConsejo46_invoker.call(ConsejoController_2.updateConsejo(id))
      }
  
    // @LINE:77
    case controllers_RestrictController_index47_route(params) =>
      call { 
        controllers_RestrictController_index47_invoker.call(RestrictController_10.index)
      }
  
    // @LINE:78
    case controllers_RestrictController_restrictOne48_route(params) =>
      call { 
        controllers_RestrictController_restrictOne48_invoker.call(RestrictController_10.restrictOne)
      }
  
    // @LINE:79
    case controllers_RestrictController_restrictTwo49_route(params) =>
      call { 
        controllers_RestrictController_restrictTwo49_invoker.call(RestrictController_10.restrictTwo)
      }
  
    // @LINE:80
    case controllers_RestrictController_restrictThree50_route(params) =>
      call { 
        controllers_RestrictController_restrictThree50_invoker.call(RestrictController_10.restrictThree)
      }
  
    // @LINE:81
    case controllers_RestrictController_restrictFour51_route(params) =>
      call { 
        controllers_RestrictController_restrictFour51_invoker.call(RestrictController_10.restrictFour)
      }
  
    // @LINE:82
    case controllers_RestrictController_restrictFive52_route(params) =>
      call { 
        controllers_RestrictController_restrictFive52_invoker.call(RestrictController_10.restrictFive)
      }
  
    // @LINE:83
    case controllers_RestrictController_customRestrictOne53_route(params) =>
      call { 
        controllers_RestrictController_customRestrictOne53_invoker.call(RestrictController_10.customRestrictOne)
      }
  
    // @LINE:84
    case controllers_RestrictController_customRestrictTwo54_route(params) =>
      call { 
        controllers_RestrictController_customRestrictTwo54_invoker.call(RestrictController_10.customRestrictTwo)
      }
  
    // @LINE:85
    case controllers_DynamicRestrictionsController_index55_route(params) =>
      call { 
        controllers_DynamicRestrictionsController_index55_invoker.call(DynamicRestrictionsController_5.index)
      }
  
    // @LINE:86
    case controllers_DynamicRestrictionsController_pureLuck56_route(params) =>
      call { 
        controllers_DynamicRestrictionsController_pureLuck56_invoker.call(DynamicRestrictionsController_5.pureLuck)
      }
  
    // @LINE:87
    case controllers_DynamicRestrictionsController_noWayJose57_route(params) =>
      call { 
        controllers_DynamicRestrictionsController_noWayJose57_invoker.call(DynamicRestrictionsController_5.noWayJose)
      }
  
    // @LINE:88
    case controllers_DynamicRestrictionsController_viewProfile58_route(params) =>
      call(params.fromQuery[String]("userName", None)) { (userName) =>
        controllers_DynamicRestrictionsController_viewProfile58_invoker.call(DynamicRestrictionsController_5.viewProfile(userName))
      }
  
    // @LINE:89
    case controllers_PatternController_editPrinter59_route(params) =>
      call { 
        controllers_PatternController_editPrinter59_invoker.call(PatternController_1.editPrinter)
      }
  
    // @LINE:90
    case controllers_PatternController_detonatePrinter60_route(params) =>
      call { 
        controllers_PatternController_detonatePrinter60_invoker.call(PatternController_1.detonatePrinter)
      }
  
    // @LINE:91
    case controllers_PatternController_editPrinterRegex61_route(params) =>
      call { 
        controllers_PatternController_editPrinterRegex61_invoker.call(PatternController_1.editPrinterRegex)
      }
  
    // @LINE:92
    case controllers_SubjectController_subjectPresent62_route(params) =>
      call { 
        controllers_SubjectController_subjectPresent62_invoker.call(SubjectController_16.subjectPresent)
      }
  
    // @LINE:93
    case controllers_SubjectController_subjectPresent_notLoggedIn63_route(params) =>
      call { 
        controllers_SubjectController_subjectPresent_notLoggedIn63_invoker.call(SubjectController_16.subjectPresent_notLoggedIn)
      }
  
    // @LINE:94
    case controllers_SubjectController_subjectNotPresent64_route(params) =>
      call { 
        controllers_SubjectController_subjectNotPresent64_invoker.call(SubjectController_16.subjectNotPresent)
      }
  
    // @LINE:95
    case controllers_SubjectController_subjectNotPresent_loggedIn65_route(params) =>
      call { 
        controllers_SubjectController_subjectNotPresent_loggedIn65_invoker.call(SubjectController_16.subjectNotPresent_loggedIn)
      }
  
    // @LINE:96
    case controllers_EdgeCaseController_index66_route(params) =>
      call { 
        controllers_EdgeCaseController_index66_invoker.call(EdgeCaseController_11.index)
      }
  
    // @LINE:97
    case controllers_DeferredController_deferredRestrict67_route(params) =>
      call { 
        controllers_DeferredController_deferredRestrict67_invoker.call(DeferredController_6.deferredRestrict)
      }
  
    // @LINE:98
    case controllers_DeferredController_deferredRestrictions68_route(params) =>
      call { 
        controllers_DeferredController_deferredRestrictions68_invoker.call(DeferredController_6.deferredRestrictions)
      }
  
    // @LINE:99
    case controllers_DeferredController_deferredPattern69_route(params) =>
      call { 
        controllers_DeferredController_deferredPattern69_invoker.call(DeferredController_6.deferredPattern)
      }
  
    // @LINE:100
    case controllers_DeferredController_deferredDynamic70_route(params) =>
      call { 
        controllers_DeferredController_deferredDynamic70_invoker.call(DeferredController_6.deferredDynamic)
      }
  
    // @LINE:101
    case controllers_DeferredController_deferredSubjectPresent71_route(params) =>
      call { 
        controllers_DeferredController_deferredSubjectPresent71_invoker.call(DeferredController_6.deferredSubjectPresent)
      }
  
    // @LINE:102
    case controllers_DeferredController_deferredSubjectNotPresent72_route(params) =>
      call { 
        controllers_DeferredController_deferredSubjectNotPresent72_invoker.call(DeferredController_6.deferredSubjectNotPresent)
      }
  
    // @LINE:103
    case controllers_UnrestrictedController_index73_route(params) =>
      call { 
        controllers_UnrestrictedController_index73_invoker.call(UnrestrictedController_0.index)
      }
  
    // @LINE:104
    case controllers_UnrestrictedController_unrestrictedWithinAConstrainedController74_route(params) =>
      call { 
        controllers_UnrestrictedController_unrestrictedWithinAConstrainedController74_invoker.call(UnrestrictedController_0.unrestrictedWithinAConstrainedController)
      }
  }
}
