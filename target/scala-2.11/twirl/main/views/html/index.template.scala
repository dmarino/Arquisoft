
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main(message)/*12.15*/ {_display_(Seq[Any](format.raw/*12.17*/("""
"""),format.raw/*13.1*/("""<div class="container">
   <div class="container" align="center">
       <img src="http://adagiohospice.com/secure/wp-content/uploads/2014/11/Nurse-Evaluation-270x250.png" />
   </div>

   <div class="container" align="center">
        <h1> ¡Bienvenida doctora """),_display_(/*19.35*/message),format.raw/*19.42*/("""! </h1>
        <h4> Para continuar seleccione una opción del menú</h4>
   </div>
</div>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun May 14 19:23:42 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/index.scala.html
                  HASH: bee800f6deaff267e989f0afeb05847d31a4a984
                  MATRIX: 837->99|949->116|980->318|1009->321|1031->334|1071->336|1100->338|1395->606|1423->613|1547->707
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|39->13|45->19|45->19|49->23
                  -- GENERATED --
              */
          