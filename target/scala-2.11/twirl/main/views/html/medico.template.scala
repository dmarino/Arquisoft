
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

class medico extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Medico,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(medico: Medico):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("Hospital Cardiologico de Santa Fe")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""
"""),format.raw/*4.1*/("""<div class="container">
    <div id="page-wrapper">

        <div class="container">
            <h1>&nbsp;</h1>
            <h1>&nbsp;</h1>
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

        <div class="container">

        </div>
    </div>
</div>

<footer class="footer">
    <div class="container" align="center">
        <p class="text-muted"> <a href=""""),_display_(/*45.42*/routes/*45.48*/.HomeController.index()),format.raw/*45.71*/("""">inicio</a> - <a href=""""),_display_(/*45.96*/routes/*45.102*/.MedicoController.lista()),format.raw/*45.127*/("""">medicos</a> - """),_display_(/*45.144*/medico/*45.150*/.getNombreMedico()),format.raw/*45.168*/("""</p>
    </div>
</footer>
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(medico:Medico): play.twirl.api.HtmlFormat.Appendable = apply(medico)

  def f:((Medico) => play.twirl.api.HtmlFormat.Appendable) = (medico) => apply(medico)

  def ref: this.type = this

}


}

/**/
object medico extends medico_Scope0.medico
              /*
                  -- GENERATED --
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/medico.scala.html
                  HASH: cf696ad8c9dd4af7249b11b9c75ca212bb793f17
                  MATRIX: 747->1|858->17|888->22|937->63|976->65|1004->67|1215->251|1230->257|1269->275|1737->716|1752->722|1787->736|1951->873|1966->879|2011->903|2174->1039|2189->1045|2233->1068|2571->1379|2586->1385|2630->1408|2682->1433|2698->1439|2745->1464|2790->1481|2806->1487|2846->1505|2906->1535
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|41->10|41->10|41->10|53->22|53->22|53->22|57->26|57->26|57->26|61->30|61->30|61->30|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|79->48
                  -- GENERATED --
              */
          