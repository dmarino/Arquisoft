
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main(message)/*12.15*/ {_display_(Seq[Any](format.raw/*12.17*/("""

"""),format.raw/*14.1*/("""<div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li>
                <a href=""""),_display_(/*18.27*/routes/*18.33*/.PacienteController.lista()),format.raw/*18.60*/("""" style="color: #fff"><i class="fa fa-male fa-fw"></i> Ver Listado de Pacientes</a>
            </li>
            <li>
                <a href=""""),_display_(/*21.27*/routes/*21.33*/.PacienteController.detalle(1L)),format.raw/*21.64*/("""" style="color: #fff"><i class="fa fa-search fa-fw"></i> Buscar Paciente <span class="fa arrow"></span> </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#" style="color: #fff">Buscar paciente por nombre</a>
                    </li>
                    <li>
                        <a href="#" style="color: #fff">Buscar paciente por documento</a>
                    </li>
                    <li>
                        <a href="#" style="color: #fff">Buscar paciente por correo electronico</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.MedicionController.lista()),format.raw/*35.60*/("""" style="color: #fff"><i class="fa fa-bar-chart fa-fw"></i> Historial de mediciones <span class="fa arrow"></span> </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#" style="color: #fff">Ver todas las mediciones</a>
                    </li>
                    <li>
                        <a href="#" style="color: #fff">Ver mediciones en rango</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href=""""),_display_(/*46.27*/routes/*46.33*/.MedicoController.lista()),format.raw/*46.58*/("""" style="color: #fff"><i class="fa fa-user-md fa-fw"></i> Buscar Colegas</a>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
</nav>

<div id="page-wrapper">
    <div class="container">
        <div class="container" align="center">
            <img src="http://adagiohospice.com/secure/wp-content/uploads/2014/11/Nurse-Evaluation-270x250.png" />
        </div>

        <div class="container" align="center">
            <h1> ¡Bienvenida doctora """),_display_(/*62.39*/message),format.raw/*62.46*/("""! </h1>
            <h4> Para continuar seleccione una opción del menú</h4>
        </div>
    </div>
</div>
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon May 15 07:08:07 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/index.scala.html
                  HASH: 4a3cdc3ab5945b8566c423948b5d262f8edb5bb4
                  MATRIX: 837->99|949->116|980->318|1009->321|1031->334|1071->336|1102->340|1361->572|1376->578|1424->605|1599->753|1614->759|1666->790|2378->1475|2393->1481|2441->1508|3003->2043|3018->2049|3064->2074|3618->2601|3646->2608|3791->2723
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->14|44->18|44->18|44->18|47->21|47->21|47->21|61->35|61->35|61->35|72->46|72->46|72->46|88->62|88->62|93->67
                  -- GENERATED --
              */
          