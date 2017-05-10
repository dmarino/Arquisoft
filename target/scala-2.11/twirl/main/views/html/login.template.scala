
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hospital Cardiologico de Santa Fe")/*1.43*/ {_display_(Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*3.1*/("""<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-primary btn-block" type="submit">Sign in</button>
    </form>

</div> <!-- /container -->

<footer class="footer">
    <div class="container">
        <p class="text-muted"> <a href=""""),_display_(/*23.42*/routes/*23.48*/.HomeController.index()),format.raw/*23.71*/("""">inicio</a> - login </p>
    </div>
</footer>

""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/login.scala.html
                  HASH: 8487c244c9417429cc27fbec0f28f27dcc0d5c09
                  MATRIX: 827->1|876->42|915->44|945->48|1837->913|1852->919|1896->942|1979->995
                  LINES: 32->1|32->1|32->1|34->3|54->23|54->23|54->23|58->27
                  -- GENERATED --
              */
          