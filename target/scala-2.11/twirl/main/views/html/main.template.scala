
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
                    <img src="hereThereLogoSmall.jpeg"  height="42" width="42">
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
                <p>&copy;
                    2016-2017 HereThere! Authenticate. Version 2.0. View details <a href="https://github.com/Amitawinash/MVCExampleWithAngularAndPlayFramework">
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
                  DATE: Sun Apr 16 03:53:01 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/main.scala.html
                  HASH: b0ca43a9dcfb3fc9bc1e38aee2b5c21d184b02f7
                  MATRIX: 823->30|1096->106|1124->213|1151->214|1206->243|1220->249|1247->256|1304->286|1330->291|1704->638|1719->644|1781->685|1865->742|1880->748|1952->798|2036->855|2051->861|2093->882|2185->947|2200->953|2273->1005|2324->1029|2339->1035|2393->1068|3494->2142|3541->2168|3580->2180|3595->2186|3641->2210|3672->2213|3738->2257|3811->2303|3868->2339|3907->2351|3922->2357|3969->2382|4000->2385|4072->2435|4146->2482|4193->2508|4232->2520|4247->2526|4293->2550|4324->2553|4395->2602|4469->2649|4516->2675|4555->2687|4570->2693|4614->2715|4645->2718|4714->2765|4778->2802|4806->2821|4846->2823|4903->2852|4942->2864|4995->2896|5034->2908|5049->2914|5092->2935|5123->2938|5191->2984|5257->3019|5306->3040|5361->3068|5388->3086|5428->3088|5481->3113|5574->3179|5624->3220|5672->3230|5729->3259|5912->3414|5926->3418|5953->3423|5983->3424|6161->3575|6215->3608|6254->3620|6270->3626|6314->3648|6345->3651|6414->3698|6538->3795|6550->3798|6633->3859|6689->3887|6757->3933|6895->4040|6948->4065|6994->4092|7034->4094|7087->4119|7155->4160|7170->4166|7211->4186|7290->4237|7345->4270|7376->4273|7443->4318|7500->4344|7546->4362|7713->4502|7769->4549|7809->4551|7854->4568|8133->4820|8149->4827|8203->4860|8248->4877|8299->4897|8340->4911|8398->4960|8438->4962|8483->4979|8763->5232|8779->5239|8835->5274|8880->5291|8931->5311|8972->5325|9000->5332|9045->5349
                  LINES: 30->2|36->2|38->6|39->7|40->8|40->8|40->8|42->10|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|77->45|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|81->49|81->49|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|83->51|84->52|86->54|86->54|86->54|87->55|88->56|88->56|88->56|89->57|90->58|90->58|90->58|90->58|92->60|92->60|92->60|92->60|92->60|92->60|92->60|94->62|94->62|94->62|94->62|94->62|97->65|98->66|99->67|99->67|100->68|100->68|100->68|100->68|100->68|100->68|100->68|100->68|101->69|103->71|109->77|109->77|109->77|110->78|113->81|113->81|113->81|114->82|115->83|116->84|116->84|116->84|117->85|120->88|120->88|120->88|121->89|122->90|123->91|123->91|124->92
                  -- GENERATED --
              */
          