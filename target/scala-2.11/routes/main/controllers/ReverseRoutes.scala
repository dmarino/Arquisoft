
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/conf/routes
// @DATE:Mon May 15 07:53:49 COT 2017

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

  // @LINE:23
  class ReverseMedicionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def deleteMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "medicion/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:44
    def getByFechas(inicio:String, fin:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicion/enRango/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("inicio", inicio)), Some(implicitly[QueryStringBindable[String]].unbind("fin", fin)))))
    }
  
    // @LINE:43
    def getMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicion/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:23
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/mediciones")
    }
  
    // @LINE:47
    def updateMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medicion/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:42
    def getMediciones(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicion")
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

  // @LINE:17
  class ReversePacienteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def agregarConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/consejo")
    }
  
    // @LINE:18
    def detalle(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/pacientes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:19
    def detalleMediciones(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/pacientes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/Medicion")
    }
  
    // @LINE:45
    def agregarMedicion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/medicion")
    }
  
    // @LINE:31
    def deletePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:32
    def updatePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:29
    def getPacienteByName(nombre:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/porNombre/" + implicitly[PathBindable[String]].unbind("nombre", dynamicString(nombre)))
    }
  
    // @LINE:17
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/pacientes")
    }
  
    // @LINE:56
    def asignarMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/medico")
    }
  
    // @LINE:30
    def createPaciente(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente")
    }
  
    // @LINE:28
    def getPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:27
    def getPacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente")
    }
  
  }

  // @LINE:59
  class ReverseUrgenciaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def updateUrgencia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "urgencia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:60
    def getUrgencia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "urgencia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:59
    def getUrgencias(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "urgencias")
    }
  
    // @LINE:62
    def deleteUrgencia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "eliminarUrgencia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:61
    def createUrgencia(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "urgencia")
    }
  
  }

  // @LINE:14
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def loaderio(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "loaderio-6d160b83d57d4302825f8e2854f38ddc/")
    }
  
    // @LINE:69
    def enviar(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "enviar")
    }
  
    // @LINE:14
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe")
    }
  
    // @LINE:16
    def perfil(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/perfil")
    }
  
    // @LINE:15
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/login")
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

  // @LINE:35
  class ReverseSensorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def updateSensor(idSensor:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("idSensor", idSensor))
    }
  
    // @LINE:38
    def deleteSensor(idSensor:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("idSensor", idSensor))
    }
  
    // @LINE:37
    def createSensor(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sensor")
    }
  
    // @LINE:36
    def getSensor(idSensor:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("idSensor", idSensor))
    }
  
    // @LINE:35
    def getSensores(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sensor")
    }
  
  }

  // @LINE:22
  class ReverseConsejoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def deleteConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:74
    def getConsejos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "consejo")
    }
  
    // @LINE:78
    def updateConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:22
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/consejos")
    }
  
    // @LINE:75
    def getConsejo(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:71
  class ReverseHireFireController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def recibir(hirefire:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "hirefire/" + implicitly[PathBindable[String]].unbind("hirefire", dynamicString(hirefire)) + "/info")
    }
  
  }

  // @LINE:20
  class ReverseMedicoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def detalle(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/medicos/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:51
    def getMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:50
    def getMedicos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico")
    }
  
    // @LINE:52
    def getMedicoByEmail(email:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:55
    def updateMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:53
    def createMedico(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medico")
    }
  
    // @LINE:54
    def deleteMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:20
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "HospitalSantaFe/medicos")
    }
  
  }


}
