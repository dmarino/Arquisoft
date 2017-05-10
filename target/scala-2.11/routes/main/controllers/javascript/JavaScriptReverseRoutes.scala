
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/conf/routes
// @DATE:Fri May 05 11:30:31 COT 2017

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

  // @LINE:22
  class ReverseMedicionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def deleteMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.deleteMedicion",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:43
    def getByFechas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.getByFechas",
      """
        function(inicio0,fin1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/enRango/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("inicio", inicio0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("fin", fin1)])})
        }
      """
    )
  
    // @LINE:42
    def getMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.getMedicion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:22
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/mediciones"})
        }
      """
    )
  
    // @LINE:46
    def updateMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.updateMedicion",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:41
    def getMediciones: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicionController.getMediciones",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicion"})
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

  // @LINE:17
  class ReversePacienteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def agregarConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.agregarConsejo",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/consejo"})
        }
      """
    )
  
    // @LINE:18
    def detalle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.detalle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/pacientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:44
    def agregarMedicion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.agregarMedicion",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/medicion"})
        }
      """
    )
  
    // @LINE:30
    def deletePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.deletePaciente",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:31
    def updatePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.updatePaciente",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:28
    def getPacienteByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacienteByName",
      """
        function(nombre0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/porNombre/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nombre", encodeURIComponent(nombre0))})
        }
      """
    )
  
    // @LINE:17
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/pacientes"})
        }
      """
    )
  
    // @LINE:29
    def createPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.createPaciente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente"})
        }
      """
    )
  
    // @LINE:27
    def getPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:26
    def getPacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente"})
        }
      """
    )
  
  }

  // @LINE:56
  class ReverseUrgenciaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def updateUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.updateUrgencia",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:57
    def getUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.getUrgencia",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:56
    def getUrgencias: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.getUrgencias",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencias"})
        }
      """
    )
  
    // @LINE:59
    def deleteUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.deleteUrgencia",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarUrgencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:58
    def createUrgencia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UrgenciaController.createUrgencia",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "urgencia"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def loaderio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loaderio",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loaderio-6d160b83d57d4302825f8e2854f38ddc/"})
        }
      """
    )
  
    // @LINE:66
    def enviar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.enviar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enviar"})
        }
      """
    )
  
    // @LINE:14
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe"})
        }
      """
    )
  
    // @LINE:16
    def perfil: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.perfil",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/perfil"})
        }
      """
    )
  
    // @LINE:15
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/login"})
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

  // @LINE:34
  class ReverseSensorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def updateSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.updateSensor",
      """
        function(idSensor0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idSensor", idSensor0)})
        }
      """
    )
  
    // @LINE:37
    def deleteSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.deleteSensor",
      """
        function(idSensor0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idSensor", idSensor0)})
        }
      """
    )
  
    // @LINE:36
    def createSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.createSensor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor"})
        }
      """
    )
  
    // @LINE:35
    def getSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.getSensor",
      """
        function(idSensor0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idSensor", idSensor0)})
        }
      """
    )
  
    // @LINE:34
    def getSensores: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.getSensores",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseConsejoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def deleteConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.deleteConsejo",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:71
    def getConsejos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.getConsejos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo"})
        }
      """
    )
  
    // @LINE:75
    def updateConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.updateConsejo",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:21
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/consejos"})
        }
      """
    )
  
    // @LINE:72
    def getConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.getConsejo",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:68
  class ReverseHireFireController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def recibir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HireFireController.recibir",
      """
        function(hirefire0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hirefire/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("hirefire", encodeURIComponent(hirefire0)) + "/info"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseMedicoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def detalle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.detalle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HospitalSantaFe/medicos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:50
    def getMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedico",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:49
    def getMedicos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedicos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico"})
        }
      """
    )
  
    // @LINE:53
    def updateMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.updateMedico",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:51
    def createMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.createMedico",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medico"})
        }
      """
    )
  
    // @LINE:52
    def deleteMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.deleteMedico",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:19
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
