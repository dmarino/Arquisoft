
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
                                        <li style="float: left"><a href=""""),_display_(/*46.75*/routes/*46.81*/.HomeController.perfil()),format.raw/*46.105*/(""""><i class="fa fa-id-card-o"></i>  Ver Perfil &emsp;</a></li>
                                        <li style="float: left"><a href=""""),_display_(/*47.75*/routes/*47.81*/.HomeController.index()),format.raw/*47.104*/(""""><i class="fa fa-power-off"></i>  Cerrar Sesion &emsp;</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div><!--/.nav-collapse -->
            </div>
        </div>
"""),_display_(/*56.2*/content),format.raw/*56.9*/("""
    """),format.raw/*57.5*/("""</div>
<!--java script -->
<script  src=""""),_display_(/*59.16*/routes/*59.22*/.Assets.versioned("javascripts/jquery-1.9.1.min.js")),format.raw/*59.74*/(""""></script>
<script  src=""""),_display_(/*60.16*/routes/*60.22*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*60.71*/("""" ></script>
<script  src=""""),_display_(/*61.16*/routes/*61.22*/.Assets.versioned("javascripts/bootstrap-transition.js")),format.raw/*61.78*/(""""></script>
<script  src=""""),_display_(/*62.16*/routes/*62.22*/.Assets.versioned("javascripts/bootstrap-alert.js")),format.raw/*62.73*/(""""></script>
<script  src=""""),_display_(/*63.16*/routes/*63.22*/.Assets.versioned("javascripts/bootstrap-modal.js")),format.raw/*63.73*/(""""></script>
<script  src=""""),_display_(/*64.16*/routes/*64.22*/.Assets.versioned("javascripts/bootstrap-scrollspy.js")),format.raw/*64.77*/(""""></script>
<script  src=""""),_display_(/*65.16*/routes/*65.22*/.Assets.versioned("javascripts/bootstrap-tab.js")),format.raw/*65.71*/(""""></script>
<script  src=""""),_display_(/*66.16*/routes/*66.22*/.Assets.versioned("javascripts/bootstrap-tooltip.js")),format.raw/*66.75*/(""""></script>
<script  src=""""),_display_(/*67.16*/routes/*67.22*/.Assets.versioned("javascripts/bootstrap-popover.js")),format.raw/*67.75*/(""""></script>
<script  src=""""),_display_(/*68.16*/routes/*68.22*/.Assets.versioned("javascripts/bootstrap-button.js")),format.raw/*68.74*/(""""></script>
<script  src=""""),_display_(/*69.16*/routes/*69.22*/.Assets.versioned("javascripts/bootstrap-collapse.js")),format.raw/*69.76*/(""""></script>
<script  src=""""),_display_(/*70.16*/routes/*70.22*/.Assets.versioned("javascripts/bootstrap-carousel.js")),format.raw/*70.76*/(""""></script>
    <script  src=""""),_display_(/*71.20*/routes/*71.26*/.Assets.versioned("javascripts/bootstrap-typeahead.js")),format.raw/*71.81*/(""""></script>
    <script  src=""""),_display_(/*72.20*/routes/*72.26*/.Assets.versioned("javascripts/sweetalert2.js")),format.raw/*72.73*/(""""></script>
<script>
    $(document).ready(function () """),format.raw/*74.35*/("""{"""),format.raw/*74.36*/("""
        """),format.raw/*75.9*/("""$('.dropdown-toggle').dropdown();
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""");
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
                  DATE: Sun May 14 10:42:24 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/main.scala.html
                  HASH: 9e8b2af7af6cc2bb44793ce5f6a3e73dd59dc73a
                  MATRIX: 1007->266|1132->296|1162->300|1284->395|1310->400|1545->608|1560->614|1632->664|1716->721|1731->727|1810->784|1894->841|1909->847|1984->900|2068->957|2083->963|2148->1006|2232->1063|2247->1069|2317->1117|2889->1662|2904->1668|2948->1691|3150->1866|3165->1872|3213->1899|3304->1963|3319->1969|3365->1994|3454->2056|3469->2062|3516->2088|3606->2151|3621->2157|3669->2184|4217->2705|4232->2711|4278->2735|4442->2872|4457->2878|4502->2901|4854->3227|4881->3234|4914->3240|4985->3284|5000->3290|5073->3342|5128->3370|5143->3376|5213->3425|5269->3454|5284->3460|5361->3516|5416->3544|5431->3550|5503->3601|5558->3629|5573->3635|5645->3686|5700->3714|5715->3720|5791->3775|5846->3803|5861->3809|5931->3858|5986->3886|6001->3892|6075->3945|6130->3973|6145->3979|6219->4032|6274->4060|6289->4066|6362->4118|6417->4146|6432->4152|6507->4206|6562->4234|6577->4240|6652->4294|6711->4326|6726->4332|6802->4387|6861->4419|6876->4425|6944->4472|7029->4529|7058->4530|7095->4540|7161->4579|7189->4580
                  LINES: 32->7|37->7|39->9|43->13|43->13|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|63->33|63->33|63->33|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|76->46|76->46|76->46|77->47|77->47|77->47|86->56|86->56|87->57|89->59|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|104->74|104->74|105->75|106->76|106->76
                  -- GENERATED --
              */
          