
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

class paciente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Paciente,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paciente: Paciente):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/main("Hospital Cardiologico de Santa Fe")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""
"""),format.raw/*4.1*/("""<div class="container-fluid">
    <div id="page-wrapper">
        <div class="container">
            <h1>&nbsp;</h1>
            <h2 class="panel-title">"""),_display_(/*8.38*/paciente/*8.46*/.getNombre()),format.raw/*8.58*/("""</h2>
        </div>

        <div class="row">
            <div class="span3">
                <ul id="sidebar" class="nav nav-stacked affix">
                    <li><a href="#">Dar un consejo</a></li>
                    <li><a href="#">Editar Informacion</a></li>
                    <li><a href="#">Cambiar Marcapasos</a></li>
                    <li><a href="#">Mediciones Historicas</a></li>
                </ul>
            </div>
            <div class="span3">
                <img src="http://www.zenithholidays.com/img/icon4.png" />
            </div>
            <div class="span6">
                <table class="table table-user-information">
                    <tbody>
                    <tr>
                        <td>Documento:</td>
                        <td>"""),_display_(/*28.30*/paciente/*28.38*/.getDocumento()),format.raw/*28.53*/("""</td>
                    </tr>
                    <tr>
                        <td>pais:</td>
                        <td>"""),_display_(/*32.30*/paciente/*32.38*/.getPais()),format.raw/*32.48*/("""</td>
                    </tr>
                    <tr>
                        <td>Ciudad:</td>
                        <td>"""),_display_(/*36.30*/paciente/*36.38*/.getCiudad()),format.raw/*36.50*/("""</td>
                    </tr>

                    <tr>
                    <tr>
                        <td>Telefono:</td>
                        <td>"""),_display_(/*42.30*/paciente/*42.38*/.getTelefono()),format.raw/*42.52*/("""</td>
                    </tr>
                    <tr>
                        <td>Tipo Sangre:</td>
                        <td>"""),_display_(/*46.30*/paciente/*46.38*/.getTipoSangre()),format.raw/*46.54*/("""</td>
                    </tr>
                    <tr>
                        <td>Tratamientos:</td>
                        <td>"""),_display_(/*50.30*/paciente/*50.38*/.getTratamientos()),format.raw/*50.56*/("""</td>

                    </tr>
                    <tr>
                        <td>Examenes:</td>
                        <td>"""),_display_(/*55.30*/paciente/*55.38*/.getExamenes()),format.raw/*55.52*/("""</td>

                    </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="container">
            <h3 class="panel-title">Mediciones</h3>
        </div>

        <div class="row">
            <div class="span2">
            </div>
            <div class="span10">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                    <tr>
                        <th>Referencia</th>
                        <th>Fecha</th>
                        <th>Frecuencia Cardiaca</th>
                        <th>Presion</th>
                        <th>Estres</th>
                        <th>Estado</th>
                    </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*83.22*/for(medicion <- paciente.getMedicionesHistoricas()) yield /*83.73*/ {_display_(Seq[Any](format.raw/*83.75*/("""
                    """),format.raw/*84.21*/("""<tr>
                        <td>"""),_display_(/*85.30*/medicion/*85.38*/.getReferencia()),format.raw/*85.54*/("""</td>
                        <td>"""),_display_(/*86.30*/medicion/*86.38*/.getFecha().getTime()),format.raw/*86.59*/("""</td>
                        <td>"""),_display_(/*87.30*/medicion/*87.38*/.getFrecuencia()),format.raw/*87.54*/("""</td>
                        <td>"""),_display_(/*88.30*/medicion/*88.38*/.getPresion()),format.raw/*88.51*/("""</td>
                        <td>"""),_display_(/*89.30*/medicion/*89.38*/.getEstres()),format.raw/*89.50*/("""</td>
                        <td>"""),_display_(/*90.30*/medicion/*90.38*/.getEstado()),format.raw/*90.50*/("""</td>
                    </tr>
                    """)))}),format.raw/*92.22*/("""
                    """),format.raw/*93.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<footer class="footer">
    <div class="container" align="center">
        <p class="text-muted"> <a href=""""),_display_(/*102.42*/routes/*102.48*/.HomeController.index()),format.raw/*102.71*/("""">inicio</a> - <a href=""""),_display_(/*102.96*/routes/*102.102*/.PacienteController.lista()),format.raw/*102.129*/("""">pacientes</a> - """),_display_(/*102.148*/paciente/*102.156*/.getNombre()),format.raw/*102.168*/("""</p>
    </div>
</footer>
""")))}),format.raw/*105.2*/("""
"""))
      }
    }
  }

  def render(paciente:Paciente): play.twirl.api.HtmlFormat.Appendable = apply(paciente)

  def f:((Paciente) => play.twirl.api.HtmlFormat.Appendable) = (paciente) => apply(paciente)

  def ref: this.type = this

}


}

/**/
object paciente extends paciente_Scope0.paciente
              /*
                  -- GENERATED --
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/paciente.scala.html
                  HASH: 15aa5e6b23c4dfa2f7dc19834f5d67c5e7db7ced
                  MATRIX: 753->1|868->21|898->26|947->67|986->69|1014->71|1199->230|1215->238|1247->250|2078->1054|2095->1062|2131->1077|2287->1206|2304->1214|2335->1224|2493->1355|2510->1363|2543->1375|2731->1536|2748->1544|2783->1558|2946->1694|2963->1702|3000->1718|3164->1855|3181->1863|3220->1881|3382->2016|3399->2024|3434->2038|4351->2928|4418->2979|4458->2981|4508->3003|4570->3038|4587->3046|4624->3062|4687->3098|4704->3106|4746->3127|4809->3163|4826->3171|4863->3187|4926->3223|4943->3231|4977->3244|5040->3280|5057->3288|5090->3300|5153->3336|5170->3344|5203->3356|5289->3411|5339->3433|5571->3637|5587->3643|5632->3666|5685->3691|5702->3697|5752->3724|5800->3743|5819->3751|5854->3763|5915->3793
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|59->28|59->28|59->28|63->32|63->32|63->32|67->36|67->36|67->36|73->42|73->42|73->42|77->46|77->46|77->46|81->50|81->50|81->50|86->55|86->55|86->55|114->83|114->83|114->83|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|123->92|124->93|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|136->105
                  -- GENERATED --
              */
          