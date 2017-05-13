
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object medicos_Scope0 {
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

class medicos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Medico],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(medicos: List[Medico]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Hospital Cardiologico de Santa Fe")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*5.1*/("""<div class="container">
    <div id="page-wrapper">
        <h1>&nbsp;</h1>
        """),_display_(/*8.10*/for(medico <- medicos) yield /*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
        """),format.raw/*9.9*/("""<div class="container">
            <h3 class="panel-title">"""),_display_(/*10.38*/medico/*10.44*/.getNombreMedico()),format.raw/*10.62*/("""</h3>
        </div>

        <div class="row">
            <div class="span3">
                <img src="http://adagiohospice.com/secure/wp-content/uploads/2014/11/Nurse-Evaluation-270x250.png" />
            </div>
            <div class="span9">
                <table class="table table-user-information">
                    <tbody>
                    <tr>
                        <td>Id:</td>
                        <td>"""),_display_(/*22.30*/medico/*22.36*/.getIdMedico()),format.raw/*22.50*/("""</td>
                    </tr>
                    <tr>
                        <td>Especialidad:</td>
                        <td>"""),_display_(/*26.30*/medico/*26.36*/.getEspecialidadMedico()),format.raw/*26.60*/("""</td>
                    </tr>
                    <tr>
                        <td>Descripcion:</td>
                        <td>"""),_display_(/*30.30*/medico/*30.36*/.getDescripcionMedico()),format.raw/*30.59*/("""</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        """)))}),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</div>
</div>

<footer class="footer">
    <div class="container" align="center">
        <p class="text-muted"> <a href=""""),_display_(/*42.42*/routes/*42.48*/.HomeController.index()),format.raw/*42.71*/("""">inicio</a> - medicos</p>
    </div>
</footer>

""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(medicos:List[Medico]): play.twirl.api.HtmlFormat.Appendable = apply(medicos)

  def f:((List[Medico]) => play.twirl.api.HtmlFormat.Appendable) = (medicos) => apply(medicos)

  def ref: this.type = this

}


}

/**/
object medicos extends medicos_Scope0.medicos
              /*
                  -- GENERATED --
                  DATE: Thu May 11 00:35:28 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/medicos.scala.html
                  HASH: 6e550012746c79aff76e296e8923820196b276fb
                  MATRIX: 755->1|873->24|903->29|952->70|991->72|1021->76|1135->164|1172->186|1211->188|1247->198|1336->260|1351->266|1390->284|1858->725|1873->731|1908->745|2072->882|2087->888|2132->912|2295->1048|2310->1054|2354->1077|2520->1212|2553->1218|2708->1346|2723->1352|2767->1375|2851->1429
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|40->9|41->10|41->10|41->10|53->22|53->22|53->22|57->26|57->26|57->26|61->30|61->30|61->30|67->36|68->37|73->42|73->42|73->42|77->46
                  -- GENERATED --
              */
          