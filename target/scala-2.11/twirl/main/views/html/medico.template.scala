
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
"""),format.raw/*4.1*/("""<div class="container">
    <p class="text-muted"> <a href=""""),_display_(/*5.38*/routes/*5.44*/.HomeController.index()),format.raw/*5.67*/("""">inicio</a> - perfil</p>
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
                        <td>"""),_display_(/*24.30*/medico/*24.36*/.getIdMedico()),format.raw/*24.50*/("""</td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td>"""),_display_(/*28.30*/medico/*28.36*/.getNombreMedico()),format.raw/*28.54*/("""</td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td>"""),_display_(/*32.30*/medico/*32.36*/.getEmail()),format.raw/*32.47*/("""</td>
                    </tr>
                    <tr>
                        <td>Tipo:</td>
                        <td>"""),_display_(/*36.30*/medico/*36.36*/.getTipo()),format.raw/*36.46*/("""</td>
                    </tr>
                    <tr>
                        <td>Especialidad:</td>
                        <td>"""),_display_(/*40.30*/medico/*40.36*/.getEspecialidadMedico()),format.raw/*40.60*/("""</td>
                    </tr>
                    <tr>
                        <td>Descripcion:</td>
                        <td>"""),_display_(/*44.30*/medico/*44.36*/.getDescripcionMedico()),format.raw/*44.59*/("""</td>
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

""")))}),format.raw/*56.2*/("""
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
                  DATE: Sun May 14 20:48:27 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/medico.scala.html
                  HASH: 7b9b8497e8f89879d781f3f5f8e1095a96a4de0e
                  MATRIX: 754->1|881->33|911->38|931->50|970->52|998->54|1086->116|1100->122|1143->145|1804->779|1819->785|1854->799|2012->930|2027->936|2066->954|2223->1084|2238->1090|2270->1101|2426->1230|2441->1236|2472->1246|2636->1383|2651->1389|2696->1413|2859->1549|2874->1555|2918->1578|3161->1791
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|55->24|55->24|55->24|59->28|59->28|59->28|63->32|63->32|63->32|67->36|67->36|67->36|71->40|71->40|71->40|75->44|75->44|75->44|87->56
                  -- GENERATED --
              */
          