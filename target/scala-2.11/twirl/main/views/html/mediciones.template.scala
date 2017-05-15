
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

class mediciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Medicion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nombre: String)(mediciones: List[Medicion]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("nombre")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-area-chart fa-fw"></i> Ver total de mediciones</a>
            </li>
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-ple-char fa-fw"></i> Ver mediciones por estado</a>
            </li>
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-line-char fa-fw"></i> Ver mediciones por fecha</a>
            </li>
            <li>
                <a href="#" style="color: #fff"><i class="fa fa-bar-chart fa-fw"></i> Ver meddiciones por tratamiento</a>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
</nav>

<div id="page-wrapper">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*29.42*/routes/*29.48*/.HomeController.index()),format.raw/*29.71*/("""">inicio</a> - mediciones</p>
    </div>

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
        """),_display_(/*44.10*/for(medicion <- mediciones) yield /*44.37*/ {_display_(Seq[Any](format.raw/*44.39*/("""
        """),format.raw/*45.9*/("""<tr>
            <td>"""),_display_(/*46.18*/medicion/*46.26*/.getReferencia()),format.raw/*46.42*/("""</td>
            <td>"""),_display_(/*47.18*/medicion/*47.26*/.getFecha().getTime()),format.raw/*47.47*/("""</td>
            <td>"""),_display_(/*48.18*/medicion/*48.26*/.getFrecuencia()),format.raw/*48.42*/("""</td>
            <td>"""),_display_(/*49.18*/medicion/*49.26*/.getPresion()),format.raw/*49.39*/("""</td>
            <td>"""),_display_(/*50.18*/medicion/*50.26*/.getEstres()),format.raw/*50.38*/("""</td>
            <td>"""),_display_(/*51.18*/medicion/*51.26*/.getEstado()),format.raw/*51.38*/("""</td>
        </tr>
        """)))}),format.raw/*53.10*/("""
        """),format.raw/*54.9*/("""</tbody>
    </table>
</div>

""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(nombre:String,mediciones:List[Medicion]): play.twirl.api.HtmlFormat.Appendable = apply(nombre)(mediciones)

  def f:((String) => (List[Medicion]) => play.twirl.api.HtmlFormat.Appendable) = (nombre) => (mediciones) => apply(nombre)(mediciones)

  def ref: this.type = this

}


}

/**/
object mediciones extends mediciones_Scope0.mediciones
              /*
                  -- GENERATED --
                  DATE: Mon May 15 08:17:33 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/mediciones.scala.html
                  HASH: 62cb7060174cb0db249ad843dc431e821b4ae31f
                  MATRIX: 770->1|909->45|939->50|961->64|1000->66|1030->70|2068->1081|2083->1087|2127->1110|2585->1541|2628->1568|2668->1570|2705->1580|2755->1603|2772->1611|2809->1627|2860->1651|2877->1659|2919->1680|2970->1704|2987->1712|3024->1728|3075->1752|3092->1760|3126->1773|3177->1797|3194->1805|3227->1817|3278->1841|3295->1849|3328->1861|3390->1892|3427->1902|3492->1937
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|60->29|60->29|60->29|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|84->53|85->54|89->58
                  -- GENERATED --
              */
          