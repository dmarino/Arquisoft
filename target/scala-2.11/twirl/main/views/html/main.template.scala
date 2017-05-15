
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

  /**/
  def apply/*1.2*/(nombre: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Hospital Santa Fe</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/bootstrap2.min.css")),format.raw/*11.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/metisMenu.min.css")),format.raw/*12.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.113*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/sb-admin-2.css")),format.raw/*14.107*/("""">

    </head>
    <body>
    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style=" background-color: rgb(12,120,159)">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" style="color: #fff" href=""""),_display_(/*29.68*/routes/*29.74*/.HomeController.index()),format.raw/*29.97*/("""">Hospital Santa Fe</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li style="color: #fff">
                    """),_display_(/*35.22*/nombre),format.raw/*35.28*/("""
                """),format.raw/*36.17*/("""</li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user-circle fa-fw" style="color: #fff"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href=""""),_display_(/*42.39*/routes/*42.45*/.MedicoController.detalle(1L)),format.raw/*42.74*/(""""><i class="fa fa-user fa-fw"></i>Ver perfil</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i>Opciones</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-question-circle fa-fw"></i>Ayuda</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href=""""),_display_(/*50.39*/routes/*50.45*/.HomeController.index()),format.raw/*50.68*/(""""><i class="fa fa-sign-out fa-fw"></i>Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation" style=" background-color: rgb(150,196,216)">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href=""""),_display_(/*63.39*/routes/*63.45*/.PacienteController.lista()),format.raw/*63.72*/("""" style="color: #fff"><i class="fa fa-male fa-fw"></i> Ver Listado de Pacientes</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*66.39*/routes/*66.45*/.PacienteController.detalle(1L)),format.raw/*66.76*/("""" style="color: #fff"><i class="fa fa-search fa-fw"></i> Buscar Paciente</a>
                        </li>
                        <li>
                            <a href="tables.html" style="color: #fff"><i class="fa fa-bar-chart fa-fw"></i> Ver historial de mediciones</a>
                        </li>
                        <li>
                            <a href="forms.html" style="color: #fff"><i class="fa fa-edit fa-fw"></i> Buscar Colegas</a>
                        </li>
                        <li>
                            <a href="#" style="color: #fff"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="panels-wells.html" style="color: #fff">Panels and Wells</a>
                                </li>
                                <li>
                                    <a href="buttons.html" style="color: #fff">Buttons</a>
                                </li>
                                <li>
                                    <a href="notifications.html" style="color: #fff">Notifications</a>
                                </li>
                                <li>
                                    <a href="typography.html" style="color: #fff">Typography</a>
                                </li>
                                <li>
                                    <a href="icons.html" style="color: #fff"> Icons</a>
                                </li>
                                <li>
                                    <a href="grid.html" style="color: #fff">Grid</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            """),_display_(/*106.14*/content),format.raw/*106.21*/("""
        """),format.raw/*107.9*/("""</div>
        <!-- /.row (nested) -->
    </div>
    <!-- /.panel-body -->
    </div>
    <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->

    </div>
<!--java script -->
    <script  src=""""),_display_(/*122.20*/routes/*122.26*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*122.72*/(""""></script>
    <script  src=""""),_display_(/*123.20*/routes/*123.26*/.Assets.versioned("javascripts/bootstrap2.min.js")),format.raw/*123.76*/("""" ></script>
    <script  src=""""),_display_(/*124.20*/routes/*124.26*/.Assets.versioned("javascripts/metisMenu.min.js")),format.raw/*124.75*/("""" ></script>
    <script  src=""""),_display_(/*125.20*/routes/*125.26*/.Assets.versioned("javascripts/sb-admin-2.js")),format.raw/*125.72*/("""" ></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(nombre:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(nombre)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (nombre) => (content) => apply(nombre)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun May 14 21:28:10 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/main.scala.html
                  HASH: a7c4f8ece8558203edadf8f19a5e793d7fe43342
                  MATRIX: 748->1|874->32|904->36|1250->355|1265->361|1338->412|1422->469|1437->475|1509->525|1593->582|1608->588|1683->641|1767->698|1782->704|1851->751|2563->1436|2578->1442|2622->1465|2857->1673|2884->1679|2930->1697|3295->2035|3310->2041|3360->2070|3850->2533|3865->2539|3909->2562|4504->3130|4519->3136|4567->3163|4778->3347|4793->3353|4845->3384|6985->5496|7014->5503|7052->5513|7359->5792|7375->5798|7443->5844|7503->5876|7519->5882|7591->5932|7652->5965|7668->5971|7739->6020|7800->6053|7816->6059|7884->6105
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|60->29|60->29|60->29|66->35|66->35|67->36|73->42|73->42|73->42|81->50|81->50|81->50|94->63|94->63|94->63|97->66|97->66|97->66|137->106|137->106|138->107|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125
                  -- GENERATED --
              */
          