
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
                    <a class="brand" href=""""),_display_(/*33.45*/routes/*33.51*/.HomeController.index()),format.raw/*33.74*/(""""><i class="fa fa-home"></i></a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li><a href=""""),_display_(/*36.43*/routes/*36.49*/.PacienteController.lista()),format.raw/*36.76*/("""">Pacientes</a></li>
                            <li><a href=""""),_display_(/*37.43*/routes/*37.49*/.MedicoController.lista()),format.raw/*37.74*/("""">Medicos</a></li>
                            <li><a href=""""),_display_(/*38.43*/routes/*38.49*/.ConsejoController.lista()),format.raw/*38.75*/("""">Consejos</a></li>
                            <li><a href=""""),_display_(/*39.43*/routes/*39.49*/.MedicionController.lista()),format.raw/*39.76*/("""">Mediciones</a></li>
                        </ul>
                        <div class="custom-navbar">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user-circle"></i><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li style="float: left"><a href=""""),_display_(/*46.75*/routes/*46.81*/.HomeController.login()),format.raw/*46.104*/(""""><i class="fa fa-sign-in"></i>  Iniciar Sesion &emsp;</a></li>
                                        <li style="float: left"><a href=""""),_display_(/*47.75*/routes/*47.81*/.HomeController.perfil()),format.raw/*47.105*/(""""><i class="fa fa-id-card-o"></i>  Ver Perfil &emsp; &emsp;</a></li>
                                        <li style="float: left"><a href=""""),_display_(/*48.75*/routes/*48.81*/.HomeController.index()),format.raw/*48.104*/(""""><i class="fa fa-power-off"></i>  Cerrar Sesion &emsp;</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div><!--/.nav-collapse -->
            </div>
        </div>
"""),_display_(/*57.2*/content),format.raw/*57.9*/("""
    """),format.raw/*58.5*/("""</div>
<!--java script -->
<script  src=""""),_display_(/*60.16*/routes/*60.22*/.Assets.versioned("javascripts/jquery-1.9.1.min.js")),format.raw/*60.74*/(""""></script>
<script  src=""""),_display_(/*61.16*/routes/*61.22*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*61.71*/("""" ></script>
<script  src=""""),_display_(/*62.16*/routes/*62.22*/.Assets.versioned("javascripts/bootstrap-transition.js")),format.raw/*62.78*/(""""></script>
<script  src=""""),_display_(/*63.16*/routes/*63.22*/.Assets.versioned("javascripts/bootstrap-alert.js")),format.raw/*63.73*/(""""></script>
<script  src=""""),_display_(/*64.16*/routes/*64.22*/.Assets.versioned("javascripts/bootstrap-modal.js")),format.raw/*64.73*/(""""></script>
<script  src=""""),_display_(/*65.16*/routes/*65.22*/.Assets.versioned("javascripts/bootstrap-scrollspy.js")),format.raw/*65.77*/(""""></script>
<script  src=""""),_display_(/*66.16*/routes/*66.22*/.Assets.versioned("javascripts/bootstrap-tab.js")),format.raw/*66.71*/(""""></script>
<script  src=""""),_display_(/*67.16*/routes/*67.22*/.Assets.versioned("javascripts/bootstrap-tooltip.js")),format.raw/*67.75*/(""""></script>
<script  src=""""),_display_(/*68.16*/routes/*68.22*/.Assets.versioned("javascripts/bootstrap-popover.js")),format.raw/*68.75*/(""""></script>
<script  src=""""),_display_(/*69.16*/routes/*69.22*/.Assets.versioned("javascripts/bootstrap-button.js")),format.raw/*69.74*/(""""></script>
<script  src=""""),_display_(/*70.16*/routes/*70.22*/.Assets.versioned("javascripts/bootstrap-collapse.js")),format.raw/*70.76*/(""""></script>
<script  src=""""),_display_(/*71.16*/routes/*71.22*/.Assets.versioned("javascripts/bootstrap-carousel.js")),format.raw/*71.76*/(""""></script>
    <script  src=""""),_display_(/*72.20*/routes/*72.26*/.Assets.versioned("javascripts/bootstrap-typeahead.js")),format.raw/*72.81*/(""""></script>
    <script  src=""""),_display_(/*73.20*/routes/*73.26*/.Assets.versioned("javascripts/sweetalert2.js")),format.raw/*73.73*/(""""></script>
<script>
    $(document).ready(function () """),format.raw/*75.35*/("""{"""),format.raw/*75.36*/("""
        """),format.raw/*76.9*/("""$('.dropdown-toggle').dropdown();
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""");
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
                  DATE: Sat May 13 19:47:37 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/main.scala.html
                  HASH: ece6c48868c8235c9e45f0dec5adabc53dae6b11
                  MATRIX: 1007->266|1132->296|1162->300|1284->395|1310->400|1545->608|1560->614|1632->664|1716->721|1731->727|1810->784|1894->841|1909->847|1984->900|2068->957|2083->963|2148->1006|2232->1063|2247->1069|2317->1117|2889->1662|2904->1668|2948->1691|3150->1866|3165->1872|3213->1899|3304->1963|3319->1969|3365->1994|3454->2056|3469->2062|3516->2088|3606->2151|3621->2157|3669->2184|4217->2705|4232->2711|4277->2734|4443->2873|4458->2879|4504->2903|4675->3047|4690->3053|4735->3076|5087->3402|5114->3409|5147->3415|5218->3459|5233->3465|5306->3517|5361->3545|5376->3551|5446->3600|5502->3629|5517->3635|5594->3691|5649->3719|5664->3725|5736->3776|5791->3804|5806->3810|5878->3861|5933->3889|5948->3895|6024->3950|6079->3978|6094->3984|6164->4033|6219->4061|6234->4067|6308->4120|6363->4148|6378->4154|6452->4207|6507->4235|6522->4241|6595->4293|6650->4321|6665->4327|6740->4381|6795->4409|6810->4415|6885->4469|6944->4501|6959->4507|7035->4562|7094->4594|7109->4600|7177->4647|7262->4704|7291->4705|7328->4715|7394->4754|7422->4755
                  LINES: 32->7|37->7|39->9|43->13|43->13|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|63->33|63->33|63->33|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|87->57|87->57|88->58|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|103->73|103->73|103->73|105->75|105->75|106->76|107->77|107->77
                  -- GENERATED --
              */
          