
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/morris.css")),format.raw/*15.103*/("""">

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
                <a class="navbar-brand" style="color: #fff" href=""""),_display_(/*30.68*/routes/*30.74*/.HomeController.index()),format.raw/*30.97*/("""">Hospital Santa Fe</a>
            </div>
            <!-- /.navbar-header -->
            <ul class="nav navbar-top-links navbar-left">
                <li>
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.PacienteController.lista()),format.raw/*35.64*/("""" style="color: #fff">Pacientes</a>
                </li>
                <li>
                    <a href=""""),_display_(/*38.31*/routes/*38.37*/.MedicionController.lista()),format.raw/*38.64*/("""" style="color: #fff">Hospital</a>
                </li>
                <li>
                    <a href=""""),_display_(/*41.31*/routes/*41.37*/.MedicoController.lista()),format.raw/*41.62*/("""" style="color: #fff">Medicos</a>
                </li>
            </ul>
            <ul class="nav navbar-top-links navbar-right">
                <li style="color: #fff">
                    """),_display_(/*46.22*/nombre),format.raw/*46.28*/("""
                """),format.raw/*47.17*/("""</li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user-circle fa-fw" style="color: #fff"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href=""""),_display_(/*53.39*/routes/*53.45*/.MedicoController.detalle(1L)),format.raw/*53.74*/(""""><i class="fa fa-user fa-fw"></i>Ver perfil</a>
                        </li>
                        <li><a href=""""),_display_(/*55.39*/routes/*55.45*/.MedicoController.detalle(1L)),format.raw/*55.74*/(""""><i class="fa fa-bell fa-fw"></i> Notificaciones<i class="fa fa-exclamation-circle fa-fw"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i>Opciones</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-question-circle fa-fw"></i>Ayuda</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href=""""),_display_(/*63.39*/routes/*63.45*/.HomeController.login()),format.raw/*63.68*/(""""><i class="fa fa-sign-out fa-fw"></i>Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->
            """),_display_(/*71.14*/content),format.raw/*71.21*/("""
        """),format.raw/*72.9*/("""<!-- /.row (nested) -->
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
    <script  src=""""),_display_(/*86.20*/routes/*86.26*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*86.72*/(""""></script>
    <script  src=""""),_display_(/*87.20*/routes/*87.26*/.Assets.versioned("javascripts/bootstrap2.min.js")),format.raw/*87.76*/("""" ></script>
    <script  src=""""),_display_(/*88.20*/routes/*88.26*/.Assets.versioned("javascripts/metisMenu.min.js")),format.raw/*88.75*/("""" ></script>
    <script  src=""""),_display_(/*89.20*/routes/*89.26*/.Assets.versioned("javascripts/raphael.min.js")),format.raw/*89.73*/("""" ></script>
    <script  src=""""),_display_(/*90.20*/routes/*90.26*/.Assets.versioned("javascripts/morris.min.js")),format.raw/*90.72*/("""" ></script>
    <script  src=""""),_display_(/*91.20*/routes/*91.26*/.Assets.versioned("javascripts/morris-data.js")),format.raw/*91.73*/("""" ></script>
    <script  src=""""),_display_(/*92.20*/routes/*92.26*/.Assets.versioned("javascripts/sb-admin-2.js")),format.raw/*92.72*/("""" ></script>
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
                  DATE: Mon May 15 06:58:55 COT 2017
                  SOURCE: C:/Users/PANA/Documents/arquisoft/proyecto/Arquisoft/app/views/main.scala.html
                  HASH: cb294ca96c362ebecddd050a882e5d38bba72439
                  MATRIX: 748->1|874->32|904->36|1250->355|1265->361|1338->412|1422->469|1437->475|1509->525|1593->582|1608->588|1683->641|1767->698|1782->704|1851->751|1935->808|1950->814|2015->857|2727->1542|2742->1548|2786->1571|3007->1765|3022->1771|3070->1798|3209->1910|3224->1916|3272->1943|3410->2054|3425->2060|3471->2085|3698->2285|3725->2291|3771->2309|4136->2647|4151->2653|4201->2682|4347->2801|4362->2807|4412->2836|4953->3350|4968->3356|5012->3379|5326->3666|5354->3673|5391->3683|5681->3946|5696->3952|5763->3998|5822->4030|5837->4036|5908->4086|5968->4119|5983->4125|6053->4174|6113->4207|6128->4213|6196->4260|6256->4293|6271->4299|6338->4345|6398->4378|6413->4384|6481->4431|6541->4464|6556->4470|6623->4516
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|66->35|66->35|66->35|69->38|69->38|69->38|72->41|72->41|72->41|77->46|77->46|78->47|84->53|84->53|84->53|86->55|86->55|86->55|94->63|94->63|94->63|102->71|102->71|103->72|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92
                  -- GENERATED --
              */
          