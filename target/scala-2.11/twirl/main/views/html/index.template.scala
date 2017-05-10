
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

"""),format.raw/*14.1*/("""<div class="container">

 <!-- Main hero unit for a primary marketing message or call to action -->
 <div class="hero-unit">
  <h1>Hello, world!</h1>
  <p>This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
  <p><a href="#" class="btn btn-primary btn-large">Learn more &raquo;</a></p>
 </div>

 <!-- Example row of columns -->
 <div class="row">
  <div class="span4">
   <h2>Heading</h2>
   <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
   <p><a class="btn" href="#">View details &raquo;</a></p>
  </div>
  <div class="span4">
   <h2>Heading</h2>
   <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
   <p><a class="btn" href="#">View details &raquo;</a></p>
  </div>
  <div class="span4">
   <h2>Heading</h2>
   <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
   <p><a class="btn" href="#">View details &raquo;</a></p>
  </div>
 </div>

 <hr>
</div> <!-- /container -->

<footer class="footer">
 <div class="container">
  <p class="text-muted"> Arquisoft ~ Grupo3 </p>
 </div>
</footer>
""")))}),format.raw/*50.2*/("""
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
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/index.scala.html
                  HASH: 971f9b8e1367bd9358d717dab4304121818de488
                  MATRIX: 837->99|949->116|980->318|1009->321|1031->334|1071->336|1102->340|2913->2121
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->14|76->50
                  -- GENERATED --
              */
          