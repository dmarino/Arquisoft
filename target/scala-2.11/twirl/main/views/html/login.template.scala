
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
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please Sign In</h3>
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
                            <a href="index.html" class="btn btn-lg btn-success btn-block">Login</a>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->
<script  src=""""),_display_(/*49.16*/routes/*49.22*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*49.68*/(""""></script>
<script  src=""""),_display_(/*50.16*/routes/*50.22*/.Assets.versioned("javascripts/bootstrap2.min.js")),format.raw/*50.72*/("""" ></script>
<script  src=""""),_display_(/*51.16*/routes/*51.22*/.Assets.versioned("javascripts/metisMenu.min.js")),format.raw/*51.71*/("""" ></script>
<script  src=""""),_display_(/*52.16*/routes/*52.22*/.Assets.versioned("javascripts/sb-admin-2.js")),format.raw/*52.68*/("""" ></script>
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
                  DATE: Sun May 14 15:10:58 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/login.scala.html
                  HASH: d7d8be814f7407e13020a726ab7ebba926968a81
                  MATRIX: 827->0|1200->346|1215->352|1288->403|1368->456|1383->462|1455->512|1535->565|1550->571|1625->624|1705->677|1720->683|1789->730|3329->2243|3344->2249|3411->2295|3466->2323|3481->2329|3552->2379|3608->2408|3623->2414|3693->2463|3749->2492|3764->2498|3831->2544
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52
                  -- GENERATED --
              */
          