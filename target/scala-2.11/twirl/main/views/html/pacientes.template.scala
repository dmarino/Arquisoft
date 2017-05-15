
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

"""),_display_(/*3.2*/main(nombre)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li>
                <a href=""""),_display_(/*8.27*/routes/*8.33*/.PacienteController.lista()),format.raw/*8.60*/("""" style="color: #fff"><i class="fa fa-male fa-fw"></i> Ver Listado de Pacientes</a>
            </li>
            <li>
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.PacienteController.detalle(1L)),format.raw/*11.64*/("""" style="color: #fff"><i class="fa fa-search fa-fw"></i> Buscar Paciente <span class="fa arrow"></span> </a>
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
                <a href=""""),_display_(/*25.27*/routes/*25.33*/.MedicionController.lista()),format.raw/*25.60*/("""" style="color: #fff"><i class="fa fa-bar-chart fa-fw"></i> Historial de mediciones <span class="fa arrow"></span> </a>
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
                <a href=""""),_display_(/*36.27*/routes/*36.33*/.MedicoController.lista()),format.raw/*36.58*/("""" style="color: #fff"><i class="fa fa-user-md fa-fw"></i> Buscar Colegas</a>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
</nav>

<div id="page-wrapper">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*47.42*/routes/*47.48*/.HomeController.index()),format.raw/*47.71*/("""">inicio</a> - pacientes</p>
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
            """),_display_(/*58.14*/for(paciente <- pacientes) yield /*58.40*/ {_display_(Seq[Any](format.raw/*58.42*/("""
            """),format.raw/*59.13*/("""<tr>
                <td><a href="../HospitalSantaFe/pacientes/"""),_display_(/*60.60*/paciente/*60.68*/.getDocumento),format.raw/*60.81*/("""">"""),_display_(/*60.84*/paciente/*60.92*/.getDocumento()),format.raw/*60.107*/("""</a></td>
                <td>"""),_display_(/*61.22*/paciente/*61.30*/.getNombre()),format.raw/*61.42*/("""</td>
            </tr>
            """)))}),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""</tbody>
        </table>
    </div> <!-- /container -->
</div>
""")))}),format.raw/*68.2*/("""
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
                  DATE: Mon May 15 07:57:50 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/pacientes.scala.html
                  HASH: db35609e0f6e3747aa846b54386a7c12ab568ff4
                  MATRIX: 768->1|905->43|935->48|955->60|994->62|1022->64|1280->296|1294->302|1341->329|1516->477|1531->483|1583->514|2295->1199|2310->1205|2358->1232|2920->1767|2935->1773|2981->1798|3309->2099|3324->2105|3368->2128|3758->2491|3800->2517|3840->2519|3882->2533|3974->2598|3991->2606|4025->2619|4055->2622|4072->2630|4109->2645|4168->2677|4185->2685|4218->2697|4288->2736|4330->2750|4429->2819
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|42->11|42->11|42->11|56->25|56->25|56->25|67->36|67->36|67->36|78->47|78->47|78->47|89->58|89->58|89->58|90->59|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|94->63|95->64|99->68
                  -- GENERATED --
              */
          