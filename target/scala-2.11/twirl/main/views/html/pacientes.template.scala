
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pacientes_Scope0 {
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

class pacientes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Paciente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pacientes: List[Paciente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main("Hospital Cardiologico de Santa Fe")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*5.1*/("""<div class="container">
    <div id="page-wrapper">
        <h1>&nbsp;</h1>
                <div class="panel panel-default">
                    <div class="panel-body">
                        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                            <thead>
                            <tr>
                                <th>Documento</th>
                                <th>Nombre</th>
                            </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*18.30*/for(paciente <- pacientes) yield /*18.56*/ {_display_(Seq[Any](format.raw/*18.58*/("""
                            """),format.raw/*19.29*/("""<tr>
                                <td><a href="../HospitalSantaFe/pacientes/"""),_display_(/*20.76*/paciente/*20.84*/.getDocumento),format.raw/*20.97*/("""">"""),_display_(/*20.100*/paciente/*20.108*/.getDocumento()),format.raw/*20.123*/("""</a></td>
                                <td>"""),_display_(/*21.38*/paciente/*21.46*/.getNombre()),format.raw/*21.58*/("""</td>
                            </tr>
                            """)))}),format.raw/*23.30*/("""
                            """),format.raw/*24.29*/("""</tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div> <!-- /container -->
<footer class="footer">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*34.42*/routes/*34.48*/.HomeController.index()),format.raw/*34.71*/("""">inicio</a> - pacientes</p>
    </div>
</footer>

""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(pacientes:List[Paciente]): play.twirl.api.HtmlFormat.Appendable = apply(pacientes)

  def f:((List[Paciente]) => play.twirl.api.HtmlFormat.Appendable) = (pacientes) => apply(pacientes)

  def ref: this.type = this

}


}

/**/
object pacientes extends pacientes_Scope0.pacientes
              /*
                  -- GENERATED --
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/pacientes.scala.html
                  HASH: f7a0eabdca87b819aea1a0ac5af5c6b4c8b58cc1
                  MATRIX: 761->1|883->28|913->33|962->74|1001->76|1031->80|1670->692|1712->718|1752->720|1810->750|1918->831|1935->839|1969->852|2000->855|2018->863|2055->878|2130->926|2147->934|2180->946|2282->1017|2340->1047|2634->1314|2649->1320|2693->1343|2779->1399
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|65->34|65->34|65->34|69->38
                  -- GENERATED --
              */
          