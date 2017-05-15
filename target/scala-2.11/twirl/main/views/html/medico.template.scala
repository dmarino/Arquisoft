
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object medico_Scope0 {
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

class medico extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Medico,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(medico: Medico)(nombre: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main(nombre)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

"""),format.raw/*5.1*/("""<div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li>
                <a href="#" style="color: #fff"> Editar Informacion personal</a>
            </li>
            <li>
                <a href="#" style="color: #fff"> Ver Historial de Pacientes atendidos</a>
            </li>
            <li>
                <a href="#" style="color: #fff"> Ver Historial de comentarios realizados</a>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
</nav>

<div id="page-wrapper">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*26.42*/routes/*26.48*/.HomeController.index()),format.raw/*26.71*/("""">inicio</a> - perfil</p>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-3" align="center">
                <img src="http://adagiohospice.com/secure/wp-content/uploads/2014/11/Nurse-Evaluation-270x250.png" />
            </div>
            <div class="col-md-1">

            </div>
            <div class="col-md-6">
                <div class="panel panel-primary">
                    <div class="panel-heading"></div>
                    <div class="panel-body">
                        <table class="table">
                            <tbody>
                            <tr>
                                <td>Id:</td>
                                <td>"""),_display_(/*45.38*/medico/*45.44*/.getIdMedico()),format.raw/*45.58*/("""</td>
                            </tr>
                            <tr>
                                <td>Nombre:</td>
                                <td>"""),_display_(/*49.38*/medico/*49.44*/.getNombreMedico()),format.raw/*49.62*/("""</td>
                            </tr>
                            <tr>
                                <td>Email:</td>
                                <td>"""),_display_(/*53.38*/medico/*53.44*/.getEmail()),format.raw/*53.55*/("""</td>
                            </tr>
                            <tr>
                                <td>Tipo:</td>
                                <td>"""),_display_(/*57.38*/medico/*57.44*/.getTipo()),format.raw/*57.54*/("""</td>
                            </tr>
                            <tr>
                                <td>Especialidad:</td>
                                <td>"""),_display_(/*61.38*/medico/*61.44*/.getEspecialidadMedico()),format.raw/*61.68*/("""</td>
                            </tr>
                            <tr>
                                <td>Descripcion:</td>
                                <td>"""),_display_(/*65.38*/medico/*65.44*/.getDescripcionMedico()),format.raw/*65.67*/("""</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-md-2">
            </div>
        </div>
    </div>
</div>

""")))}),format.raw/*78.2*/("""
"""))
      }
    }
  }

  def render(medico:Medico,nombre:String): play.twirl.api.HtmlFormat.Appendable = apply(medico)(nombre)

  def f:((Medico) => (String) => play.twirl.api.HtmlFormat.Appendable) = (medico) => (nombre) => apply(medico)(nombre)

  def ref: this.type = this

}


}

/**/
object medico extends medico_Scope0.medico
              /*
                  -- GENERATED --
                  DATE: Mon May 15 07:26:59 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/medico.scala.html
                  HASH: 27f80d49847bed8017ec6990c251b50f595ff607
                  MATRIX: 754->1|881->33|911->38|931->50|970->52|1000->56|1797->826|1812->832|1856->855|2617->1589|2632->1595|2667->1609|2857->1772|2872->1778|2911->1796|3100->1958|3115->1964|3147->1975|3335->2136|3350->2142|3381->2152|3577->2321|3592->2327|3637->2351|3832->2519|3847->2525|3891->2548|4202->2829
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|57->26|57->26|57->26|76->45|76->45|76->45|80->49|80->49|80->49|84->53|84->53|84->53|88->57|88->57|88->57|92->61|92->61|92->61|96->65|96->65|96->65|109->78
                  -- GENERATED --
              */
          