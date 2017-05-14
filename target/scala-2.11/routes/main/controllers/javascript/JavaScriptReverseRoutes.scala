
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/conf/routes
// @DATE:Sun May 14 12:45:14 COT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseMedicionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def deleteMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.deleteMedicion",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:40
    def getByFechas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.getByFechas",
      """
        function(inicio0,fin1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/enRango/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("inicio", inicio0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("fin", fin1)])})
        }
      """
    )
  
    // @LINE:39
    def getMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.getMedicion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:19
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/mediciones"})
        }
      """
    )
  
    // @LINE:43
    def updateMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.updateMedicion",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:38
    def getMediciones: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.getMediciones",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion"})
        }
      """
    )
  
  }

  // @LINE:92
  class ReverseSubjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def subjectPresent_notLoggedIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.subjectPresent_notLoggedIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rhp_out"})
        }
      """
    )
  
    // @LINE:92
    def subjectPresent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.subjectPresent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rhp_in"})
        }
      """
    )
  
    // @LINE:95
    def subjectNotPresent_loggedIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.subjectNotPresent_loggedIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rhnp_in"})
        }
      """
    )
  
    // @LINE:94
    def subjectNotPresent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.subjectNotPresent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rhnp_out"})
        }
      """
    )
  
  }

  // @LINE:97
  class ReverseDeferredController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def deferredSubjectNotPresent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DeferredController.deferredSubjectNotPresent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deferredSubjectNotPresent"})
        }
      """
    )
  
    // @LINE:100
    def deferredDynamic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DeferredController.deferredDynamic",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deferredDynamic"})
        }
      """
    )
  
    // @LINE:97
    def deferredRestrict: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DeferredController.deferredRestrict",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deferredRestrict"})
        }
      """
    )
  
    // @LINE:99
    def deferredPattern: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DeferredController.deferredPattern",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deferredPattern"})
        }
      """
    )
  
    // @LINE:101
    def deferredSubjectPresent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DeferredController.deferredSubjectPresent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deferredSubjectPresent"})
        }
      """
    )
  
    // @LINE:98
    def deferredRestrictions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DeferredController.deferredRestrictions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deferredRestrictions"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReversePacienteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def agregarConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.agregarConsejo",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/consejo"})
        }
      """
    )
  
    // @LINE:15
    def detalle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.detalle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/pacientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:41
    def agregarMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.agregarMedicion",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/medicion"})
        }
      """
    )
  
    // @LINE:27
    def deletePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.deletePaciente",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:28
    def updatePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.updatePaciente",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def getPacienteByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacienteByName",
      """
        function(nombre0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/porNombre/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nombre", encodeURIComponent(nombre0))})
        }
      """
    )
  
    // @LINE:14
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/pacientes"})
        }
      """
    )
  
    // @LINE:52
    def asignarMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.asignarMedico",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/medico"})
        }
      """
    )
  
    // @LINE:26
    def createPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.createPaciente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente"})
        }
      """
    )
  
    // @LINE:24
    def getPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:23
    def getPacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente"})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseRestrictController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def restrictOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.restrictOne",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restrict1"})
        }
      """
    )
  
    // @LINE:81
    def restrictFour: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.restrictFour",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restrict4"})
        }
      """
    )
  
    // @LINE:83
    def customRestrictOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.customRestrictOne",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customRestrict1"})
        }
      """
    )
  
    // @LINE:84
    def customRestrictTwo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.customRestrictTwo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customRestrict2"})
        }
      """
    )
  
    // @LINE:82
    def restrictFive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.restrictFive",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restrict5"})
        }
      """
    )
  
    // @LINE:79
    def restrictTwo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.restrictTwo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restrict2"})
        }
      """
    )
  
    // @LINE:77
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restrictIndex"})
        }
      """
    )
  
    // @LINE:80
    def restrictThree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestrictController.restrictThree",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restrict3"})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseUrgenciaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def updateUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.updateUrgencia",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:56
    def getUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.getUrgencia",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:55
    def getUrgencias: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.getUrgencias",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencias"})
        }
      """
    )
  
    // @LINE:58
    def deleteUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.deleteUrgencia",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarUrgencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:57
    def createUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.createUrgencia",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencia"})
        }
      """
    )
  
  }

  // @LINE:64
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def enviar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.enviar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enviar"})
        }
      """
    )
  
    // @LINE:64
    def loaderio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loaderio",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loaderio-6d160b83d57d4302825f8e2854f38ddc/"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:96
  class ReverseEdgeCaseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:96
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdgeCaseController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseSensorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def updateSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.updateSensor",
      """
        function(idSensor0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idSensor", idSensor0)})
        }
      """
    )
  
    // @LINE:34
    def deleteSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.deleteSensor",
      """
        function(idSensor0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idSensor", idSensor0)})
        }
      """
    )
  
    // @LINE:33
    def createSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.createSensor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor"})
        }
      """
    )
  
    // @LINE:32
    def getSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.getSensor",
      """
        function(idSensor0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idSensor", idSensor0)})
        }
      """
    )
  
    // @LINE:31
    def getSensores: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.getSensores",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor"})
        }
      """
    )
  
  }

  // @LINE:89
  class ReversePatternController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:89
    def editPrinter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PatternController.editPrinter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editPrinter"})
        }
      """
    )
  
    // @LINE:91
    def editPrinterRegex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PatternController.editPrinterRegex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editAnythingRegex"})
        }
      """
    )
  
    // @LINE:90
    def detonatePrinter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PatternController.detonatePrinter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "detonatePrinter"})
        }
      """
    )
  
  }

  // @LINE:85
  class ReverseDynamicRestrictionsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def viewProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DynamicRestrictionsController.viewProfile",
      """
        function(userName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewProfile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName0)])})
        }
      """
    )
  
    // @LINE:87
    def noWayJose: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DynamicRestrictionsController.noWayJose",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noWayJose"})
        }
      """
    )
  
    // @LINE:86
    def pureLuck: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DynamicRestrictionsController.pureLuck",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pureLuck"})
        }
      """
    )
  
    // @LINE:85
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DynamicRestrictionsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseConsejoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def deleteConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.deleteConsejo",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:70
    def getConsejos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.getConsejos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo"})
        }
      """
    )
  
    // @LINE:74
    def updateConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.updateConsejo",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/consejos"})
        }
      """
    )
  
    // @LINE:71
    def getConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.getConsejo",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:103
  class ReverseUnrestrictedController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnrestrictedController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unrestrictedIndex"})
        }
      """
    )
  
    // @LINE:104
    def unrestrictedWithinAConstrainedController: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnrestrictedController.unrestrictedWithinAConstrainedController",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unrestrictedOpen"})
        }
      """
    )
  
  }

  // @LINE:67
  class ReverseHireFireController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def recibir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HireFireController.recibir",
      """
        function(hirefire0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hirefire/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("hirefire", encodeURIComponent(hirefire0)) + "/info"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseMedicoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def detalle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.detalle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/medicos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:47
    def getMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedico",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:46
    def getMedicos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedicos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico"})
        }
      """
    )
  
    // @LINE:48
    def getMedicoByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedicoByEmail",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:51
    def updateMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.updateMedico",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:49
    def createMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.createMedico",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medico"})
        }
      """
    )
  
    // @LINE:50
    def deleteMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.deleteMedico",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/medicos"})
        }
      """
    )
  
  }


}
