
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paciente_Scope0 {
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

class paciente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Paciente,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nombre: String)(paciente: Paciente):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(nombre)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

"""),format.raw/*5.1*/("""<div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-id-card fa-fw"></i> Ver informacion personal</a>
            </li>
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-search fa-fw"></i> ver ultima medicion</a>
            </li>
            <li>
                <a href=""""),_display_(/*15.27*/routes/*15.33*/.PacienteController.detalleMediciones(1L)),format.raw/*15.74*/("""" style="color: #fff"><i class="fa fa-search fa-fw"></i> ver historial de mediciones</a>
            </li>
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-search fa-fw"></i> ver consejos</a>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
</nav>

<div id="page-wrapper">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*29.42*/routes/*29.48*/.HomeController.index()),format.raw/*29.71*/("""">inicio</a> - <a href=""""),_display_(/*29.96*/routes/*29.102*/.PacienteController.lista()),format.raw/*29.129*/("""">pacientes</a> - perfil</p>
    </div>

    <h2>"""),_display_(/*32.10*/paciente/*32.18*/.getNombre()),format.raw/*32.30*/("""</h2>

    <div class="container" align="right">
            <a class="btn btn-primary"> Aconsejar</a>
    </div>

    <div class="row">
        <div class="col-md-3" align="center">
            <img src="http://i1.wp.com/www.cheerforacure.org/assets/images/icon-user-3.png" class="img-circle" alt="Cinque Terre" width="250" height="250">
        </div>
        <div class="col-md-9">
            <div class="panel default-panel">
                <div class="panel-heading">
                </div>
                <div class="panel-body">
                    <table class="table">
                        <tbody>
                        <tr>
                            <td>Documento:</td>
                            <td>"""),_display_(/*51.34*/paciente/*51.42*/.getDocumento()),format.raw/*51.57*/("""</td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td>"""),_display_(/*55.34*/paciente/*55.42*/.getEmail()),format.raw/*55.53*/("""</td>
                        </tr>
                        <tr>
                            <td>pais:</td>
                            <td>"""),_display_(/*59.34*/paciente/*59.42*/.getPais()),format.raw/*59.52*/("""</td>
                        </tr>
                        <tr>
                            <td>Ciudad:</td>
                            <td>"""),_display_(/*63.34*/paciente/*63.42*/.getCiudad()),format.raw/*63.54*/("""</td>
                        </tr>

                        <tr>
                        <tr>
                            <td>Telefono:</td>
                            <td>"""),_display_(/*69.34*/paciente/*69.42*/.getTelefono()),format.raw/*69.56*/("""</td>
                        </tr>
                        <tr>
                            <td>Tipo Sangre:</td>
                            <td>"""),_display_(/*73.34*/paciente/*73.42*/.getTipoSangre()),format.raw/*73.58*/("""</td>
                        </tr>
                        <tr>
                            <td>Marcapasos:</td>
                            <td>"""),_display_(/*77.34*/paciente/*77.42*/.getMarcapasos()),format.raw/*77.58*/("""</td>
                        </tr>
                        <tr>
                            <td>Tratamientos:</td>
                            <td>"""),_display_(/*81.34*/paciente/*81.42*/.getTratamientos()),format.raw/*81.60*/("""</td>

                        </tr>
                        <tr>
                            <td>Examenes:</td>
                            <td>"""),_display_(/*86.34*/paciente/*86.42*/.getExamenes()),format.raw/*86.56*/("""</td>

                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

</div>
""")))}),format.raw/*97.2*/("""
"""))
      }
    }
  }

  def render(nombre:String,paciente:Paciente): play.twirl.api.HtmlFormat.Appendable = apply(nombre)(paciente)

  def f:((String) => (Paciente) => play.twirl.api.HtmlFormat.Appendable) = (nombre) => (paciente) => apply(nombre)(paciente)

  def ref: this.type = this

}


}

/**/
object paciente extends paciente_Scope0.paciente
              /*
                  -- GENERATED --
                  DATE: Mon May 15 08:22:32 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/paciente.scala.html
                  HASH: a952e108ea1815f2884dabe070c271a3456d376f
                  MATRIX: 760->1|891->37|921->42|941->54|980->56|1010->60|1565->588|1580->594|1642->635|2120->1086|2135->1092|2179->1115|2231->1140|2247->1146|2296->1173|2376->1226|2393->1234|2426->1246|3195->1988|3212->1996|3248->2011|3421->2157|3438->2165|3470->2176|3642->2321|3659->2329|3690->2339|3864->2486|3881->2494|3914->2506|4122->2687|4139->2695|4174->2709|4353->2861|4370->2869|4407->2885|4585->3036|4602->3044|4639->3060|4819->3213|4836->3221|4875->3239|5053->3390|5070->3398|5105->3412|5322->3599
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|46->15|46->15|46->15|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|82->51|82->51|82->51|86->55|86->55|86->55|90->59|90->59|90->59|94->63|94->63|94->63|100->69|100->69|100->69|104->73|104->73|104->73|108->77|108->77|108->77|112->81|112->81|112->81|117->86|117->86|117->86|128->97
                  -- GENERATED --
              */
          