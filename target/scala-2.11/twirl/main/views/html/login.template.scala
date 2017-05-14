
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


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hospital Cardiologico De Santa Fe</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=0.7">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*9.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/bootstrap-responsive.css")),format.raw/*10.113*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*11.109*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/custom.css")),format.raw/*12.99*/("""">
</head>
<body>
<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="brand" href=""""),_display_(/*24.41*/routes/*24.47*/.HomeController.index()),format.raw/*24.70*/(""""><i class="fa fa-home"></i></a>
                <div class="nav-collapse collapse">
                    <div class="custom-navbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user-circle"></i><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li style="float: left"><a href=""""),_display_(/*31.71*/routes/*31.77*/.HomeController.perfil()),format.raw/*31.101*/(""""><i class="fa fa-info-circle"></i> Contactenos &emsp;</a></li>
                                    <li style="float: left"><a href=""""),_display_(/*32.71*/routes/*32.77*/.HomeController.index()),format.raw/*32.100*/(""""><i class="fa fa-question-circle"></i> ayuda &emsp;</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!--/.nav-collapse -->
        </div>
    </div>

    <div class="box">

    </div>

</div>
<!--java script -->
<script  src=""""),_display_(/*48.16*/routes/*48.22*/.Assets.versioned("javascripts/jquery-1.9.1.min.js")),format.raw/*48.74*/(""""></script>


</body>
</html>
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
                  DATE: Sun May 14 10:43:23 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/login.scala.html
                  HASH: e8839f8b32a99d144a98975ffb35754f59f91404
                  MATRIX: 827->0|1164->311|1178->317|1249->367|1329->420|1344->426|1423->483|1503->536|1518->542|1593->595|1673->648|1688->654|1752->697|2288->1206|2303->1212|2347->1235|2908->1769|2923->1775|2969->1799|3131->1934|3146->1940|3191->1963|3593->2338|3608->2344|3681->2396
                  LINES: 32->1|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|55->24|55->24|55->24|62->31|62->31|62->31|63->32|63->32|63->32|79->48|79->48|79->48
                  -- GENERATED --
              */
          