
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

class pacientes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Paciente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nombre:String)(pacientes: List[Paciente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

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

  def render(nombre:String,pacientes:List[Paciente]): play.twirl.api.HtmlFormat.Appendable = apply(nombre)(pacientes)

  def f:((String) => (List[Paciente]) => play.twirl.api.HtmlFormat.Appendable) = (nombre) => (pacientes) => apply(nombre)(pacientes)

  def ref: this.type = this

}


}

/**/
object pacientes extends pacientes_Scope0.pacientes
              /*
                  -- GENERATED --
                  DATE: Sun May 14 21:43:51 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/pacientes.scala.html
                  HASH: 7e7a2d5984fc055f8696ad60c9d33c184c062c27
                  MATRIX: 768->1|905->43|935->48|984->89|1023->91|1053->95|1692->707|1734->733|1774->735|1832->765|1940->846|1957->854|1991->867|2022->870|2040->878|2077->893|2152->941|2169->949|2202->961|2304->1032|2362->1062|2656->1329|2671->1335|2715->1358|2801->1414
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|65->34|65->34|65->34|69->38
                  -- GENERATED --
              */
          