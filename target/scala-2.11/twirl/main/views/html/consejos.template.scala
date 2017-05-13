
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consejos_Scope0 {
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

class consejos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Consejo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(consejos: List[Consejo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Hospital Cardiologico de Santa Fe")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*5.1*/("""<div class="container">
    <div id="page-wrapper">
        <h1>&nbsp;</h1>
        <div class="panel panel-default">
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                    <tr>
                        <th>Tema</th>
                        <th>Consejo</th>
                    </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*18.22*/for(consejo <- consejos) yield /*18.46*/ {_display_(Seq[Any](format.raw/*18.48*/("""
                    """),format.raw/*19.21*/("""<tr>
                        <td>"""),_display_(/*20.30*/consejo/*20.37*/.getTema()),format.raw/*20.47*/("""</td>
                        <td>"""),_display_(/*21.30*/consejo/*21.37*/.getConsejo()),format.raw/*21.50*/("""</td>
                    </tr>
                    """)))}),format.raw/*23.22*/("""
                    """),format.raw/*24.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</div>
</div> <!-- /container -->
<footer class="footer">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*34.42*/routes/*34.48*/.HomeController.index()),format.raw/*34.71*/("""">inicio</a> - consejos</p>
    </div>
</footer>

""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(consejos:List[Consejo]): play.twirl.api.HtmlFormat.Appendable = apply(consejos)

  def f:((List[Consejo]) => play.twirl.api.HtmlFormat.Appendable) = (consejos) => apply(consejos)

  def ref: this.type = this

}


}

/**/
object consejos extends consejos_Scope0.consejos
              /*
                  -- GENERATED --
                  DATE: Thu May 11 00:35:28 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/consejos.scala.html
                  HASH: 3274e8af14a91d32aace0ca3400ea8adb5411420
                  MATRIX: 758->1|878->26|908->31|957->72|996->74|1026->78|1573->598|1613->622|1653->624|1703->646|1765->681|1781->688|1812->698|1875->734|1891->741|1925->754|2011->809|2061->831|2311->1054|2326->1060|2370->1083|2455->1138
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|65->34|65->34|65->34|69->38
                  -- GENERATED --
              */
          