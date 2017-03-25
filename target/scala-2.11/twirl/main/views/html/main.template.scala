
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
                    <a class="navbar-brand" href=""""),_display_(/*37.52*/routes/*37.58*/.Application.hereThere()),format.raw/*37.82*/("""">Here There</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
                    <ul class="nav navbar-nav">
                        <li class=""""),_display_(/*43.37*/("active".when(nav == ""))),format.raw/*43.63*/(""""><a href=""""),_display_(/*43.75*/routes/*43.81*/.Application.hereThere()),format.raw/*43.105*/("""">"""),_display_(/*43.108*/Messages("playauthenticate.navigation.home")),format.raw/*43.152*/("""</a></li>
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
                                    
                                    <li><a href=""""),_display_(/*59.51*/com/*59.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*59.115*/(""""><i class="icon-off"></i> """),_display_(/*59.143*/Messages("playauthenticate.navigation.logout")),format.raw/*59.189*/("""</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*62.26*/("""
                        """),format.raw/*63.25*/("""</ul>
                    """)))}/*64.22*/ {_display_(Seq[Any](format.raw/*64.24*/("""
                        """),format.raw/*65.25*/("""<a href=""""),_display_(/*65.35*/routes/*65.41*/.Application.login()),format.raw/*65.61*/("""" class=" navbar-right btn btn-default navbar-btn """),_display_(/*65.112*/("disabled".when(nav == "login"))),format.raw/*65.145*/("""">"""),_display_(/*65.148*/Messages("playauthenticate.navigation.login")),format.raw/*65.193*/("""</a>
                    """)))}),format.raw/*66.22*/("""

                """),format.raw/*68.17*/("""</div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <div class="container">
            """),_display_(/*74.14*/if(flash.contains(Application.FLASH_ERROR_KEY))/*74.61*/ {_display_(Seq[Any](format.raw/*74.63*/("""
                """),format.raw/*75.17*/("""<div class="alert alert-danger" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*78.22*/flash()/*78.29*/.get(Application.FLASH_ERROR_KEY)),format.raw/*78.62*/("""
                """),format.raw/*79.17*/("""</div>
            """)))}),format.raw/*80.14*/("""
            """),_display_(/*81.14*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*81.63*/ {_display_(Seq[Any](format.raw/*81.65*/("""
                """),format.raw/*82.17*/("""<div class="alert alert-success" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*85.22*/flash()/*85.29*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*85.64*/("""
                """),format.raw/*86.17*/("""</div>
            """)))}),format.raw/*87.14*/("""
            """),_display_(/*88.14*/content),format.raw/*88.21*/("""

            """),format.raw/*90.13*/("""<hr>

            
        </div> <!-- /container -->

    </body>
</html>"""))
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
                  DATE: Sat Mar 25 00:31:21 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/main.scala.html
                  HASH: 36b1ab31d214ab361aaa9a5d4307e3c3ed549207
                  MATRIX: 823->30|1096->106|1124->213|1151->214|1206->243|1220->249|1247->256|1304->286|1330->291|1704->638|1719->644|1781->685|1865->742|1880->748|1952->798|2036->855|2051->861|2093->882|2185->947|2200->953|2273->1005|2324->1029|2339->1035|2393->1068|3178->1826|3193->1832|3238->1856|3570->2161|3617->2187|3656->2199|3671->2205|3717->2229|3748->2232|3814->2276|3887->2322|3944->2358|3983->2370|3998->2376|4045->2401|4076->2404|4148->2454|4211->2490|4239->2509|4279->2511|4336->2540|4375->2552|4428->2584|4467->2596|4482->2602|4525->2623|4556->2626|4624->2672|4690->2707|4739->2728|4794->2756|4821->2774|4861->2776|4914->2801|5007->2867|5057->2908|5105->2918|5162->2947|5345->3102|5359->3106|5386->3111|5416->3112|5594->3263|5648->3296|5687->3308|5703->3314|5747->3336|5778->3339|5847->3386|5971->3483|5983->3486|6066->3547|6122->3575|6190->3621|6328->3728|6381->3753|6427->3780|6467->3782|6520->3807|6557->3817|6572->3823|6613->3843|6692->3894|6747->3927|6778->3930|6845->3975|6902->4001|6948->4019|7115->4159|7171->4206|7211->4208|7256->4225|7535->4477|7551->4484|7605->4517|7650->4534|7701->4554|7742->4568|7800->4617|7840->4619|7885->4636|8165->4889|8181->4896|8237->4931|8282->4948|8333->4968|8374->4982|8402->4989|8444->5003
                  LINES: 30->2|36->2|38->6|39->7|40->8|40->8|40->8|42->10|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|69->37|69->37|69->37|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|78->46|78->46|78->46|79->47|79->47|79->47|79->47|79->47|79->47|79->47|79->47|80->48|81->49|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|87->55|87->55|87->55|87->55|89->57|89->57|89->57|89->57|89->57|89->57|89->57|91->59|91->59|91->59|91->59|91->59|94->62|95->63|96->64|96->64|97->65|97->65|97->65|97->65|97->65|97->65|97->65|97->65|98->66|100->68|106->74|106->74|106->74|107->75|110->78|110->78|110->78|111->79|112->80|113->81|113->81|113->81|114->82|117->85|117->85|117->85|118->86|119->87|120->88|120->88|122->90
                  -- GENERATED --
              */
          