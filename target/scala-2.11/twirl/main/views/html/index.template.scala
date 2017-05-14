
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[be.objectify.deadbolt.java.models.Subject,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subject: be.objectify.deadbolt.java.models.Subject):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""
"""),format.raw/*5.4*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Hospital Santa Fe")/*12.27*/ {_display_(Seq[Any](format.raw/*12.29*/("""

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

  def render(subject:be.objectify.deadbolt.java.models.Subject): play.twirl.api.HtmlFormat.Appendable = apply(subject)

  def f:((be.objectify.deadbolt.java.models.Subject) => play.twirl.api.HtmlFormat.Appendable) = (subject) => apply(subject)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun May 14 12:40:06 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/index.scala.html
                  HASH: 53583052e1051027ae189433e4271e659f81cab1
                  MATRIX: 780->1|927->53|955->151|986->353|1015->356|1049->381|1089->383|1120->387|2931->2168
                  LINES: 27->1|32->1|33->5|35->11|36->12|36->12|36->12|38->14|74->50
                  -- GENERATED --
              */
          