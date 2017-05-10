
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap-responsive.css")),format.raw/*18.117*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*19.113*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/custom.css")),format.raw/*20.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/sweetalert2.css")),format.raw/*21.108*/("""">
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
            <a class="brand" href=""""),_display_(/*33.37*/routes/*33.43*/.HomeController.index()),format.raw/*33.66*/(""""><i class="fa fa-home"></i></a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li><a href=""""),_display_(/*36.35*/routes/*36.41*/.PacienteController.lista()),format.raw/*36.68*/("""">Pacientes</a></li>
                    <li><a href=""""),_display_(/*37.35*/routes/*37.41*/.MedicoController.lista()),format.raw/*37.66*/("""">Medicos</a></li>
                    <li><a href=""""),_display_(/*38.35*/routes/*38.41*/.ConsejoController.lista()),format.raw/*38.67*/("""">Consejos</a></li>
                    <li><a href=""""),_display_(/*39.35*/routes/*39.41*/.MedicionController.lista()),format.raw/*39.68*/("""">Mediciones</a></li>
                </ul>
                <div class="custom-navbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user-circle"></i><b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li></li>
                                <li><a href=""""),_display_(/*47.47*/routes/*47.53*/.HomeController.login()),format.raw/*47.76*/(""""><i class="fa fa-sign-in"></i>Sign In &emsp;</a></li>
                                <li><a href=""""),_display_(/*48.47*/routes/*48.53*/.HomeController.perfil()),format.raw/*48.77*/(""""><i class="fa fa-id-card-o"></i>Ver Perfil &emsp;</a></li>
                                <li class="divider"></li>
                                <li><a href=""""),_display_(/*50.47*/routes/*50.53*/.HomeController.index()),format.raw/*50.76*/(""""><i class="fa fa-sing-out"></i>log off &emsp;</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
            </div><!--/.nav-collapse -->
    </div>
    </div>


"""),_display_(/*61.2*/content),format.raw/*61.9*/("""
    """),format.raw/*62.5*/("""</div>
<!--java script -->
<script  src=""""),_display_(/*64.16*/routes/*64.22*/.Assets.versioned("javascripts/jquery-1.9.1.min.js")),format.raw/*64.74*/(""""></script>
<script  src=""""),_display_(/*65.16*/routes/*65.22*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*65.71*/("""" ></script>
<script  src=""""),_display_(/*66.16*/routes/*66.22*/.Assets.versioned("javascripts/bootstrap-transition.js")),format.raw/*66.78*/(""""></script>
<script  src=""""),_display_(/*67.16*/routes/*67.22*/.Assets.versioned("javascripts/bootstrap-alert.js")),format.raw/*67.73*/(""""></script>
<script  src=""""),_display_(/*68.16*/routes/*68.22*/.Assets.versioned("javascripts/bootstrap-modal.js")),format.raw/*68.73*/(""""></script>
<script  src=""""),_display_(/*69.16*/routes/*69.22*/.Assets.versioned("javascripts/bootstrap-dropdown.js")),format.raw/*69.76*/(""""></script>
<script  src=""""),_display_(/*70.16*/routes/*70.22*/.Assets.versioned("javascripts/bootstrap-scrollspy.js")),format.raw/*70.77*/(""""></script>
<script  src=""""),_display_(/*71.16*/routes/*71.22*/.Assets.versioned("javascripts/bootstrap-tab.js")),format.raw/*71.71*/(""""></script>
<script  src=""""),_display_(/*72.16*/routes/*72.22*/.Assets.versioned("javascripts/bootstrap-tooltip.js")),format.raw/*72.75*/(""""></script>
<script  src=""""),_display_(/*73.16*/routes/*73.22*/.Assets.versioned("javascripts/bootstrap-popover.js")),format.raw/*73.75*/(""""></script>
<script  src=""""),_display_(/*74.16*/routes/*74.22*/.Assets.versioned("javascripts/bootstrap-button.js")),format.raw/*74.74*/(""""></script>
<script  src=""""),_display_(/*75.16*/routes/*75.22*/.Assets.versioned("javascripts/bootstrap-collapse.js")),format.raw/*75.76*/(""""></script>
<script  src=""""),_display_(/*76.16*/routes/*76.22*/.Assets.versioned("javascripts/bootstrap-carousel.js")),format.raw/*76.76*/(""""></script>
<script  src=""""),_display_(/*77.16*/routes/*77.22*/.Assets.versioned("javascripts/bootstrap-typeahead.js")),format.raw/*77.77*/(""""></script>
    <script  src=""""),_display_(/*78.20*/routes/*78.26*/.Assets.versioned("javascripts/sweetalert2.js")),format.raw/*78.73*/(""""></script>
<script>
    $(document).ready(function () """),format.raw/*80.35*/("""{"""),format.raw/*80.36*/("""
        """),format.raw/*81.9*/("""$('.dropdown-toggle').dropdown();
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""");
</script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon May 01 23:40:35 COT 2017
                  SOURCE: C:/Users/Juan/Documents/Arquisoft/Proyecto/ProyectoNuevo2/Arquisoft/app/views/main.scala.html
                  HASH: 06e5c880bf1d0c965ffaf05600565465d046e58c
                  MATRIX: 1007->266|1132->296|1162->300|1284->395|1310->400|1545->608|1560->614|1632->664|1716->721|1731->727|1810->784|1894->841|1909->847|1984->900|2068->957|2083->963|2148->1006|2232->1063|2247->1069|2317->1117|2829->1602|2844->1608|2888->1631|3066->1782|3081->1788|3129->1815|3212->1871|3227->1877|3273->1902|3354->1956|3369->1962|3416->1988|3498->2043|3513->2049|3561->2076|4080->2568|4095->2574|4139->2597|4268->2699|4283->2705|4328->2729|4521->2895|4536->2901|4580->2924|4871->3189|4898->3196|4931->3202|5002->3246|5017->3252|5090->3304|5145->3332|5160->3338|5230->3387|5286->3416|5301->3422|5378->3478|5433->3506|5448->3512|5520->3563|5575->3591|5590->3597|5662->3648|5717->3676|5732->3682|5807->3736|5862->3764|5877->3770|5953->3825|6008->3853|6023->3859|6093->3908|6148->3936|6163->3942|6237->3995|6292->4023|6307->4029|6381->4082|6436->4110|6451->4116|6524->4168|6579->4196|6594->4202|6669->4256|6724->4284|6739->4290|6814->4344|6869->4372|6884->4378|6960->4433|7019->4465|7034->4471|7102->4518|7187->4575|7216->4576|7253->4586|7319->4625|7347->4626
                  LINES: 32->7|37->7|39->9|43->13|43->13|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|63->33|63->33|63->33|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|77->47|77->47|77->47|78->48|78->48|78->48|80->50|80->50|80->50|91->61|91->61|92->62|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|106->76|106->76|106->76|107->77|107->77|107->77|108->78|108->78|108->78|110->80|110->80|111->81|112->82|112->82
                  -- GENERATED --
              */
          