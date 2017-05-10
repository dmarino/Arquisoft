
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mediciones_Scope0 {
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

class mediciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Medicion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mediciones: List[Medicion]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Hospital Cardiologico de Santa Fe")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*5.1*/("""<div class="container">
    <div id="page-wrapper">
        <div class="panel panel-default">
            <h1>&nbsp;</h1>
            <div class="panel-body">
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
                    """),_display_(/*22.22*/for(medicion <- mediciones) yield /*22.49*/ {_display_(Seq[Any](format.raw/*22.51*/("""
                    """),format.raw/*23.21*/("""<tr>
                        <td>"""),_display_(/*24.30*/medicion/*24.38*/.getReferencia()),format.raw/*24.54*/("""</td>
                        <td>"""),_display_(/*25.30*/medicion/*25.38*/.getFecha().getTime()),format.raw/*25.59*/("""</td>
                        <td>"""),_display_(/*26.30*/medicion/*26.38*/.getFrecuencia()),format.raw/*26.54*/("""</td>
                        <td>"""),_display_(/*27.30*/medicion/*27.38*/.getPresion()),format.raw/*27.51*/("""</td>
                        <td>"""),_display_(/*28.30*/medicion/*28.38*/.getEstres()),format.raw/*28.50*/("""</td>
                        <td>"""),_display_(/*29.30*/medicion/*29.38*/.getEstado()),format.raw/*29.50*/("""</td>
                    </tr>
                    """)))}),format.raw/*31.22*/("""
                    """),format.raw/*32.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</div>
</div> <!-- /container -->
<footer class="footer">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*42.42*/routes/*42.48*/.HomeController.index()),format.raw/*42.71*/("""">inicio</a> - mediciones</p>
    </div>
</footer>

""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(mediciones:List[Medicion]): play.twirl.api.HtmlFormat.Appendable = apply(mediciones)

  def f:((List[Medicion]) => play.twirl.api.HtmlFormat.Appendable) = (mediciones) => apply(mediciones)

  def ref: this.type = this

}


}

/**/
object mediciones extends mediciones_Scope0.mediciones
              /*
                  -- GENERATED --
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/mediciones.scala.html
                  HASH: 31b178a5fe69fad6f2f838deeaf19216d73a06ca
                  MATRIX: 763->1|886->29|916->34|965->75|1004->77|1034->81|1767->787|1810->814|1850->816|1900->838|1962->873|1979->881|2016->897|2079->933|2096->941|2138->962|2201->998|2218->1006|2255->1022|2318->1058|2335->1066|2369->1079|2432->1115|2449->1123|2482->1135|2545->1171|2562->1179|2595->1191|2681->1246|2731->1268|2981->1491|2996->1497|3040->1520|3127->1577
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|62->31|63->32|73->42|73->42|73->42|77->46
                  -- GENERATED --
              */
          