
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


Seq[Any](format.raw/*1.1*/("""<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>prueba</title>

    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/bootstrap2.min.css")),format.raw/*11.107*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/metisMenu.min.css")),format.raw/*12.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.109*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/sb-admin-2.css")),format.raw/*14.103*/("""">

</head>
<body>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style=" background-color: rgb(12,120,159)">
    <div class="navbar-header">
        <a class="navbar-brand" style="color: #fff">Hospital Santa Fe</a>
    </div>
</nav>
<div class="container">
    <h1 style="text-align: center">Bienvenido al hospital Cardiológico de Santa Fe</h1>
    <h3 style="text-align: center">Para ingresar, por favor inicie sesión</h3>
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h5>&emsp;</h5>
                </div>
                <div class="panel-body">
                    <form role="form">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name="password" type="password" value="">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <a href=""""),_display_(/*47.39*/routes/*47.45*/.HomeController.index()),format.raw/*47.68*/("""" class="btn btn-lg btn-primary btn-block">Login</a>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->
<script  src=""""),_display_(/*56.16*/routes/*56.22*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*56.68*/(""""></script>
<script  src=""""),_display_(/*57.16*/routes/*57.22*/.Assets.versioned("javascripts/bootstrap2.min.js")),format.raw/*57.72*/("""" ></script>
<script  src=""""),_display_(/*58.16*/routes/*58.22*/.Assets.versioned("javascripts/metisMenu.min.js")),format.raw/*58.71*/("""" ></script>
<script  src=""""),_display_(/*59.16*/routes/*59.22*/.Assets.versioned("javascripts/sb-admin-2.js")),format.raw/*59.68*/("""" ></script>
</body>"""))
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
                  DATE: Sun May 14 18:44:42 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/login.scala.html
                  HASH: c823dc22138a6578be1bc5404629313de4bd3fb7
                  MATRIX: 827->0|1200->346|1215->352|1288->403|1368->456|1383->462|1455->512|1535->565|1550->571|1625->624|1705->677|1720->683|1789->730|3470->2384|3485->2390|3529->2413|3791->2648|3806->2654|3873->2700|3928->2728|3943->2734|4014->2784|4070->2813|4085->2819|4155->2868|4211->2897|4226->2903|4293->2949
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|78->47|78->47|78->47|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59
                  -- GENERATED --
              */
          