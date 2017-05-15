
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

class medicos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Medico],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nombre: String)(medicos: List[Medico]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main("nombre")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li>
                <a href=""""),_display_(/*8.27*/routes/*8.33*/.MedicoController.lista()),format.raw/*8.58*/("""" style="color: #fff"><i class="fa fa-male fa-fw"></i> Ver Listado de Medicos</a>
            </li>
            <li>
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.MedicoController.detalle(1L)),format.raw/*11.62*/("""" style="color: #fff"><i class="fa fa-search fa-fw"></i> Buscar Medico <span class="fa arrow"></span> </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#" style="color: #fff">Buscar medico por nombre</a>
                    </li>
                    <li>
                        <a href="#" style="color: #fff">Buscar medico por documento</a>
                    </li>
                    <li>
                        <a href="#" style="color: #fff">Buscar medico por correo electronico</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
</nav>

<div id="page-wrapper">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*33.42*/routes/*33.48*/.HomeController.index()),format.raw/*33.71*/("""">inicio</a> - pacientes</p>
    </div>
    <div class="container">
        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
            <thead>
            <tr>
                <th>Documento</th>
                <th>Nombre</th>
            </tr>
            </thead>
            <tbody>
            """),_display_(/*44.14*/for(medico <- medicos) yield /*44.36*/ {_display_(Seq[Any](format.raw/*44.38*/("""
            """),format.raw/*45.13*/("""<tr>
                <td><a href="../HospitalSantaFe/medicos/"""),_display_(/*46.58*/medico/*46.64*/.getIdMedico),format.raw/*46.76*/("""">"""),_display_(/*46.79*/medico/*46.85*/.getIdMedico()),format.raw/*46.99*/("""</a></td>
                <td>"""),_display_(/*47.22*/medico/*47.28*/.getNombreMedico()),format.raw/*47.46*/("""</td>
            </tr>
            """)))}),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""</tbody>
        </table>
    </div> <!-- /container -->
</div>
""")))}),format.raw/*54.2*/("""
"""))
      }
    }
  }

  def render(nombre:String,medicos:List[Medico]): play.twirl.api.HtmlFormat.Appendable = apply(nombre)(medicos)

  def f:((String) => (List[Medico]) => play.twirl.api.HtmlFormat.Appendable) = (nombre) => (medicos) => apply(nombre)(medicos)

  def ref: this.type = this

}


}

/**/
object medicos extends medicos_Scope0.medicos
              /*
                  -- GENERATED --
                  DATE: Mon May 15 08:32:22 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/medicos.scala.html
                  HASH: 4b7b717db2221fff35426a482df79dd9cb89e9a6
                  MATRIX: 762->1|896->40|926->45|948->59|987->61|1015->63|1273->295|1287->301|1332->326|1505->472|1520->478|1570->507|2434->1344|2449->1350|2493->1373|2883->1736|2921->1758|2961->1760|3003->1774|3093->1837|3108->1843|3141->1855|3171->1858|3186->1864|3221->1878|3280->1910|3295->1916|3334->1934|3404->1973|3446->1987|3545->2056
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|42->11|42->11|42->11|64->33|64->33|64->33|75->44|75->44|75->44|76->45|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50|85->54
                  -- GENERATED --
              */
          