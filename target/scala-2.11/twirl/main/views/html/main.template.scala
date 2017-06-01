
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

     object main_Scope1 {
import service.UserProvider

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserProvider,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.java.utils.TemplateUtils._

Seq[Any](format.raw/*2.78*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*8.14*/lang()/*8.20*/.code()),format.raw/*8.27*/("""">
    <head>
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
        <meta name="author" content="The Play Authenticate Team">

        <script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*17.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*18.46*/routes/*18.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*18.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Application.jsRoutes),format.raw/*19.73*/("""" defer="defer"></script>

        <link rel="stylesheet" href=""""),_display_(/*21.39*/routes/*21.45*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*21.97*/("""">
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.versioned("css/main.css")),format.raw/*22.61*/("""" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
            <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <img src="/assets/icons/logo.gif"  height="45" width="42">
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class=""""),_display_(/*43.37*/("active".when(nav == ""))),format.raw/*43.63*/(""""><a href=""""),_display_(/*43.75*/routes/*43.81*/.Application.hereThere()),format.raw/*43.105*/("""">"""),_display_(/*43.108*/Messages("playauthenticate.navigation.home")),format.raw/*43.152*/("""</a></li>
                        <li class=""""),_display_(/*44.37*/("active".when(nav == "restricted"))),format.raw/*44.73*/(""""><a href=""""),_display_(/*44.85*/routes/*44.91*/.Application.restricted()),format.raw/*44.116*/("""">"""),_display_(/*44.119*/Messages("playauthenticate.navigation.restricted")),format.raw/*44.169*/("""</a></li>
                         <li class=""""),_display_(/*45.38*/("active".when(nav == ""))),format.raw/*45.64*/(""""><a href=""""),_display_(/*45.76*/routes/*45.82*/.Application.contactUs()),format.raw/*45.106*/("""">"""),_display_(/*45.109*/Messages("playauthenticate.navigation.contactUs")),format.raw/*45.158*/("""</a></li>
                         <li class=""""),_display_(/*46.38*/("active".when(nav == ""))),format.raw/*46.64*/(""""><a href=""""),_display_(/*46.76*/routes/*46.82*/.Application.aboutUs()),format.raw/*46.104*/("""">"""),_display_(/*46.107*/Messages("playauthenticate.navigation.aboutUs")),format.raw/*46.154*/("""</a></li>


                        """),_display_(/*49.26*/subjectNotPresent()/*49.45*/ {_display_(Seq[Any](format.raw/*49.47*/("""
                            """),format.raw/*50.29*/("""<li class=""""),_display_(/*50.41*/("active".when(nav == "signup"))),format.raw/*50.73*/(""""><a href=""""),_display_(/*50.85*/routes/*50.91*/.Application.signup()),format.raw/*50.112*/("""">"""),_display_(/*50.115*/Messages("playauthenticate.navigation.signup")),format.raw/*50.161*/("""</a></li>
                        """)))}),format.raw/*51.26*/("""
                    """),format.raw/*52.21*/("""</ul>

                    """),_display_(/*54.22*/subjectPresentOr()/*54.40*/ {_display_(Seq[Any](format.raw/*54.42*/("""
                        """),format.raw/*55.25*/("""<ul class="nav navbar-nav navbar-right">
                        """),_display_(/*56.26*/defining(userProvider.getUser(session()))/*56.67*/ { user =>_display_(Seq[Any](format.raw/*56.77*/("""
                            """),format.raw/*57.29*/("""<li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> """),_display_(/*58.134*/user/*58.138*/.name),format.raw/*58.143*/(""" """),format.raw/*58.144*/("""<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class=""""),_display_(/*60.49*/("active".when(nav == "profile"))),format.raw/*60.82*/(""""><a href=""""),_display_(/*60.94*/routes/*60.100*/.Application.profile()),format.raw/*60.122*/("""">"""),_display_(/*60.125*/Messages("playauthenticate.navigation.profile")),format.raw/*60.172*/("""</a></li>
                                    
                                    <li><a href=""""),_display_(/*62.51*/com/*62.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*62.115*/(""""><i class="icon-off"></i> """),_display_(/*62.143*/Messages("playauthenticate.navigation.logout")),format.raw/*62.189*/("""</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*65.26*/("""
                        """),format.raw/*66.25*/("""</ul>
                    """)))}/*67.22*/ {_display_(Seq[Any](format.raw/*67.24*/("""
                        """),format.raw/*68.25*/("""<a style=" ; border-radius: 10px" href=""""),_display_(/*68.66*/routes/*68.72*/.Application.login()),format.raw/*68.92*/("""" class=" navbar-right btn btn-default navbar-btn """),_display_(/*68.143*/("disabled".when(nav == "login"))),format.raw/*68.176*/("""">"""),_display_(/*68.179*/Messages("playauthenticate.navigation.login")),format.raw/*68.224*/("""</a>
                    """)))}),format.raw/*69.22*/("""

                """),format.raw/*71.17*/("""</div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <div class="container">
            """),_display_(/*77.14*/if(flash.contains(Application.FLASH_ERROR_KEY))/*77.61*/ {_display_(Seq[Any](format.raw/*77.63*/("""
                """),format.raw/*78.17*/("""<div class="alert alert-danger" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*81.22*/flash()/*81.29*/.get(Application.FLASH_ERROR_KEY)),format.raw/*81.62*/("""
                """),format.raw/*82.17*/("""</div>
            """)))}),format.raw/*83.14*/("""
            """),_display_(/*84.14*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*84.63*/ {_display_(Seq[Any](format.raw/*84.65*/("""
                """),format.raw/*85.17*/("""<div class="alert alert-success" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*88.22*/flash()/*88.29*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*88.64*/("""
                """),format.raw/*89.17*/("""</div>
            """)))}),format.raw/*90.14*/("""
            """),_display_(/*91.14*/content),format.raw/*91.21*/("""
                """),format.raw/*92.17*/("""<hr>

            <footer>
                <p>&copy;2016-2017 HereThere! Authenticate. Version 2.0. View details <a href="https://github.com/Amitawinash/MVCExampleWithAngularAndPlayFramework">
                        here</a>.</p>
                <p>
                    <small>
                        Provider icons by <a href="https://github.com/Amitawinash" target="_blank">
                            Amit Kumar</a></small></p>
            </footer>
        </div> <!-- /container -->

           

        
    </body>
</html>
"""))
      }
    }
  }

  def render(userProvider:UserProvider,title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,title,nav)(content)

  def f:((UserProvider,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,title,nav) => (content) => apply(userProvider,title,nav)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 23:05:25 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/main.scala.html
                  HASH: 093321e25caceb0a2c247b7061eb56020a4cfc03
                  MATRIX: 823->30|1096->106|1124->213|1151->214|1206->243|1220->249|1247->256|1304->286|1330->291|1704->638|1719->644|1781->685|1865->742|1880->748|1952->798|2036->855|2051->861|2093->882|2185->947|2200->953|2273->1005|2324->1029|2339->1035|2393->1068|3493->2141|3540->2167|3579->2179|3594->2185|3640->2209|3671->2212|3737->2256|3810->2302|3867->2338|3906->2350|3921->2356|3968->2381|3999->2384|4071->2434|4145->2481|4192->2507|4231->2519|4246->2525|4292->2549|4323->2552|4394->2601|4468->2648|4515->2674|4554->2686|4569->2692|4613->2714|4644->2717|4713->2764|4777->2801|4805->2820|4845->2822|4902->2851|4941->2863|4994->2895|5033->2907|5048->2913|5091->2934|5122->2937|5190->2983|5256->3018|5305->3039|5360->3067|5387->3085|5427->3087|5480->3112|5573->3178|5623->3219|5671->3229|5728->3258|5911->3413|5925->3417|5952->3422|5982->3423|6160->3574|6214->3607|6253->3619|6269->3625|6313->3647|6344->3650|6413->3697|6537->3794|6549->3797|6632->3858|6688->3886|6756->3932|6894->4039|6947->4064|6993->4091|7033->4093|7086->4118|7154->4159|7169->4165|7210->4185|7289->4236|7344->4269|7375->4272|7442->4317|7499->4343|7545->4361|7712->4501|7768->4548|7808->4550|7853->4567|8132->4819|8148->4826|8202->4859|8247->4876|8298->4896|8339->4910|8397->4959|8437->4961|8482->4978|8762->5231|8778->5238|8834->5273|8879->5290|8930->5310|8971->5324|8999->5331|9044->5348
                  LINES: 30->2|36->2|38->6|39->7|40->8|40->8|40->8|42->10|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|77->45|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|81->49|81->49|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|83->51|84->52|86->54|86->54|86->54|87->55|88->56|88->56|88->56|89->57|90->58|90->58|90->58|90->58|92->60|92->60|92->60|92->60|92->60|92->60|92->60|94->62|94->62|94->62|94->62|94->62|97->65|98->66|99->67|99->67|100->68|100->68|100->68|100->68|100->68|100->68|100->68|100->68|101->69|103->71|109->77|109->77|109->77|110->78|113->81|113->81|113->81|114->82|115->83|116->84|116->84|116->84|117->85|120->88|120->88|120->88|121->89|122->90|123->91|123->91|124->92
                  -- GENERATED --
              */
          