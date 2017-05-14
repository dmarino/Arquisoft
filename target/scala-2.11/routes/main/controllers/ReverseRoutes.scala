
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/conf/routes
// @DATE:Sun May 14 12:45:14 COT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:10
        case (file)  =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:19
  class ReverseMedicionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def deleteMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "medicion/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:40
    def getByFechas(inicio:String, fin:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicion/enRango/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("inicio", inicio)), Some(implicitly[QueryStringBindable[String]].unbind("fin", fin)))))
    }
  
    // @LINE:39
    def getMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicion/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:19
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/mediciones")
    }
  
    // @LINE:43
    def updateMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medicion/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:38
    def getMediciones(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicion")
    }
  
  }

  // @LINE:92
  class ReverseSubjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def subjectPresent_notLoggedIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rhp_out")
    }
  
    // @LINE:92
    def subjectPresent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rhp_in")
    }
  
    // @LINE:95
    def subjectNotPresent_loggedIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rhnp_in")
    }
  
    // @LINE:94
    def subjectNotPresent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rhnp_out")
    }
  
  }

  // @LINE:97
  class ReverseDeferredController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def deferredSubjectNotPresent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deferredSubjectNotPresent")
    }
  
    // @LINE:100
    def deferredDynamic(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deferredDynamic")
    }
  
    // @LINE:97
    def deferredRestrict(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deferredRestrict")
    }
  
    // @LINE:99
    def deferredPattern(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deferredPattern")
    }
  
    // @LINE:101
    def deferredSubjectPresent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deferredSubjectPresent")
    }
  
    // @LINE:98
    def deferredRestrictions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deferredRestrictions")
    }
  
  }

  // @LINE:6
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:14
  class ReversePacienteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def agregarConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/consejo")
    }
  
    // @LINE:15
    def detalle(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/pacientes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:41
    def agregarMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/medicion")
    }
  
    // @LINE:27
    def deletePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:28
    def updatePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:25
    def getPacienteByName(nombre:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/porNombre/" + implicitly[PathBindable[String]].unbind("nombre", dynamicString(nombre)))
    }
  
    // @LINE:14
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/pacientes")
    }
  
    // @LINE:52
    def asignarMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/medico")
    }
  
    // @LINE:26
    def createPaciente(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente")
    }
  
    // @LINE:24
    def getPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:23
    def getPacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente")
    }
  
  }

  // @LINE:77
  class ReverseRestrictController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def restrictOne(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restrict1")
    }
  
    // @LINE:81
    def restrictFour(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restrict4")
    }
  
    // @LINE:83
    def customRestrictOne(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "customRestrict1")
    }
  
    // @LINE:84
    def customRestrictTwo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "customRestrict2")
    }
  
    // @LINE:82
    def restrictFive(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restrict5")
    }
  
    // @LINE:79
    def restrictTwo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restrict2")
    }
  
    // @LINE:77
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restrictIndex")
    }
  
    // @LINE:80
    def restrictThree(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restrict3")
    }
  
  }

  // @LINE:55
  class ReverseUrgenciaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def updateUrgencia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "urgencia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:56
    def getUrgencia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "urgencia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:55
    def getUrgencias(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "urgencias")
    }
  
    // @LINE:58
    def deleteUrgencia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "eliminarUrgencia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:57
    def createUrgencia(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "urgencia")
    }
  
  }

  // @LINE:64
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def enviar(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "enviar")
    }
  
    // @LINE:64
    def loaderio(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "loaderio-6d160b83d57d4302825f8e2854f38ddc/")
    }
  
  }

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:96
  class ReverseEdgeCaseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:96
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bug")
    }
  
  }

  // @LINE:31
  class ReverseSensorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def updateSensor(idSensor:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("idSensor", idSensor))
    }
  
    // @LINE:34
    def deleteSensor(idSensor:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("idSensor", idSensor))
    }
  
    // @LINE:33
    def createSensor(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sensor")
    }
  
    // @LINE:32
    def getSensor(idSensor:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("idSensor", idSensor))
    }
  
    // @LINE:31
    def getSensores(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sensor")
    }
  
  }

  // @LINE:89
  class ReversePatternController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:89
    def editPrinter(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "editPrinter")
    }
  
    // @LINE:91
    def editPrinterRegex(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "editAnythingRegex")
    }
  
    // @LINE:90
    def detonatePrinter(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "detonatePrinter")
    }
  
  }

  // @LINE:85
  class ReverseDynamicRestrictionsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def viewProfile(userName:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewProfile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
    }
  
    // @LINE:87
    def noWayJose(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noWayJose")
    }
  
    // @LINE:86
    def pureLuck(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pureLuck")
    }
  
    // @LINE:85
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
  }

  // @LINE:18
  class ReverseConsejoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def deleteConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:70
    def getConsejos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "consejo")
    }
  
    // @LINE:74
    def updateConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/consejos")
    }
  
    // @LINE:71
    def getConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:103
  class ReverseUnrestrictedController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "unrestrictedIndex")
    }
  
    // @LINE:104
    def unrestrictedWithinAConstrainedController(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "unrestrictedOpen")
    }
  
  }

  // @LINE:67
  class ReverseHireFireController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def recibir(hirefire:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "hirefire/" + implicitly[PathBindable[String]].unbind("hirefire", dynamicString(hirefire)) + "/info")
    }
  
  }

  // @LINE:16
  class ReverseMedicoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def detalle(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/medicos/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:47
    def getMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:46
    def getMedicos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico")
    }
  
    // @LINE:48
    def getMedicoByEmail(email:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:51
    def updateMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:49
    def createMedico(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medico")
    }
  
    // @LINE:50
    def deleteMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:16
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/medicos")
    }
  
  }


}
