
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
        <title>HereThere</title>

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
                    <a class="navbar-brand" href=""""),_display_(/*37.52*/routes/*37.58*/.Application.index()),format.raw/*37.78*/("""">HereThere</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class=""""),_display_(/*43.37*/("active".when(nav == ""))),format.raw/*43.63*/(""""><a href=""""),_display_(/*43.75*/routes/*43.81*/.Application.index()),format.raw/*43.101*/("""">"""),_display_(/*43.104*/Messages("playauthenticate.navigation.home")),format.raw/*43.148*/("""</a></li>
                        <li class=""""),_display_(/*44.37*/("active".when(nav == "restricted"))),format.raw/*44.73*/(""""><a href=""""),_display_(/*44.85*/routes/*44.91*/.Application.restricted()),format.raw/*44.116*/("""">"""),_display_(/*44.119*/Messages("playauthenticate.navigation.restricted")),format.raw/*44.169*/("""</a></li>

                        """),_display_(/*46.26*/subjectNotPresent()/*46.45*/ {_display_(Seq[Any](format.raw/*46.47*/("""
                            """),format.raw/*47.29*/("""<li class=""""),_display_(/*47.41*/("active".when(nav == "signup"))),format.raw/*47.73*/(""""><a href=""""),_display_(/*47.85*/routes/*47.91*/.Application.signup()),format.raw/*47.112*/("""">"""),_display_(/*47.115*/Messages("playauthenticate.navigation.signup")),format.raw/*47.161*/("""</a></li>
                        """)))}),format.raw/*48.26*/("""
                    """),format.raw/*49.21*/("""</ul>

                    """),_display_(/*51.22*/subjectPresentOr()/*51.40*/ {_display_(Seq[Any](format.raw/*51.42*/("""
                        """),format.raw/*52.25*/("""<ul class="nav navbar-nav navbar-right">
                        """),_display_(/*53.26*/defining(userProvider.getUser(session()))/*53.67*/ { user =>_display_(Seq[Any](format.raw/*53.77*/("""
                            """),format.raw/*54.29*/("""<li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> """),_display_(/*55.134*/user/*55.138*/.name),format.raw/*55.143*/(""" """),format.raw/*55.144*/("""<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class=""""),_display_(/*57.49*/("active".when(nav == "profile"))),format.raw/*57.82*/(""""><a href=""""),_display_(/*57.94*/routes/*57.100*/.Application.profile()),format.raw/*57.122*/("""">"""),_display_(/*57.125*/Messages("playauthenticate.navigation.profile")),format.raw/*57.172*/("""</a></li>
                                    <li><a href=""""),_display_(/*58.51*/routes/*58.57*/.Account.link()),format.raw/*58.72*/("""">"""),_display_(/*58.75*/Messages("playauthenticate.navigation.link_more")),format.raw/*58.124*/("""</a></li>
                                    <li class="divider"></li>
                                    <li><a href=""""),_display_(/*60.51*/com/*60.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*60.115*/(""""><i class="icon-off"></i> """),_display_(/*60.143*/Messages("playauthenticate.index.intro_2")),format.raw/*60.185*/("""</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*63.26*/("""
                        """),format.raw/*64.25*/("""</ul>
                    """)))}/*65.22*/ {_display_(Seq[Any](format.raw/*65.24*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/routes/*66.41*/.Application.login()),format.raw/*66.61*/("""" class=" navbar-right btn btn-default navbar-btn """),_display_(/*66.112*/("disabled".when(nav == "login"))),format.raw/*66.145*/("""">"""),_display_(/*66.148*/Messages("playauthenticate.navigation.login")),format.raw/*66.193*/("""</a>
                    """)))}),format.raw/*67.22*/("""

                """),format.raw/*69.17*/("""</div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <div class="container">
            """),_display_(/*75.14*/if(flash.contains(Application.FLASH_ERROR_KEY))/*75.61*/ {_display_(Seq[Any](format.raw/*75.63*/("""
                """),format.raw/*76.17*/("""<div class="alert alert-danger" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*79.22*/flash()/*79.29*/.get(Application.FLASH_ERROR_KEY)),format.raw/*79.62*/("""
                """),format.raw/*80.17*/("""</div>
            """)))}),format.raw/*81.14*/("""
            """),_display_(/*82.14*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*82.63*/ {_display_(Seq[Any](format.raw/*82.65*/("""
                """),format.raw/*83.17*/("""<div class="alert alert-success" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*86.22*/flash()/*86.29*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*86.64*/("""
                """),format.raw/*87.17*/("""</div>
            """)))}),format.raw/*88.14*/("""
            """),_display_(/*89.14*/content),format.raw/*89.21*/("""

            """),format.raw/*91.13*/("""<hr>

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
                  DATE: Wed Mar 08 11:45:33 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/main.scala.html
                  HASH: 1b77aa8441b7b434b2ff1aefd7134fd5b7ad286e
                  MATRIX: 823->30|1096->106|1124->213|1151->214|1206->243|1220->249|1247->256|1659->641|1674->647|1736->688|1820->745|1835->751|1907->801|1991->858|2006->864|2048->885|2140->950|2155->956|2228->1008|2279->1032|2294->1038|2348->1071|3133->1829|3148->1835|3189->1855|3519->2158|3566->2184|3605->2196|3620->2202|3662->2222|3693->2225|3759->2269|3832->2315|3889->2351|3928->2363|3943->2369|3990->2394|4021->2397|4093->2447|4156->2483|4184->2502|4224->2504|4281->2533|4320->2545|4373->2577|4412->2589|4427->2595|4470->2616|4501->2619|4569->2665|4635->2700|4684->2721|4739->2749|4766->2767|4806->2769|4859->2794|4952->2860|5002->2901|5050->2911|5107->2940|5290->3095|5304->3099|5331->3104|5361->3105|5539->3256|5593->3289|5632->3301|5648->3307|5692->3329|5723->3332|5792->3379|5879->3439|5894->3445|5930->3460|5960->3463|6031->3512|6180->3634|6192->3637|6275->3698|6331->3726|6395->3768|6533->3875|6586->3900|6632->3927|6672->3929|6725->3954|6762->3964|6777->3970|6818->3990|6897->4041|6952->4074|6983->4077|7050->4122|7107->4148|7153->4166|7320->4306|7376->4353|7416->4355|7461->4372|7740->4624|7756->4631|7810->4664|7855->4681|7906->4701|7947->4715|8005->4764|8045->4766|8090->4783|8370->5036|8386->5043|8442->5078|8487->5095|8538->5115|8579->5129|8607->5136|8649->5150
                  LINES: 30->2|36->2|38->6|39->7|40->8|40->8|40->8|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|69->37|69->37|69->37|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|78->46|78->46|78->46|79->47|79->47|79->47|79->47|79->47|79->47|79->47|79->47|80->48|81->49|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|87->55|87->55|87->55|87->55|89->57|89->57|89->57|89->57|89->57|89->57|89->57|90->58|90->58|90->58|90->58|90->58|92->60|92->60|92->60|92->60|92->60|95->63|96->64|97->65|97->65|98->66|98->66|98->66|98->66|98->66|98->66|98->66|98->66|99->67|101->69|107->75|107->75|107->75|108->76|111->79|111->79|111->79|112->80|113->81|114->82|114->82|114->82|115->83|118->86|118->86|118->86|119->87|120->88|121->89|121->89|123->91
                  -- GENERATED --
              */
          