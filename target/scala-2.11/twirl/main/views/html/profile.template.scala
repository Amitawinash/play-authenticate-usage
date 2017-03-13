
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

     object profile_Scope1 {
import service.UserProvider

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[com.feth.play.module.pa.PlayAuthenticate,UserProvider,models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, userProvider: UserProvider, localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*2.113*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(userProvider, Messages("playauthenticate.profile.title"),"profile")/*6.74*/ {_display_(Seq[Any](format.raw/*6.76*/("""

    """),format.raw/*8.5*/("""<h1>"""),_display_(/*8.10*/Messages("playauthenticate.profile.title")),format.raw/*8.52*/("""</h1>
    <p>
    Your name is """),_display_(/*10.19*/localUser/*10.28*/.name),format.raw/*10.33*/(""" """),format.raw/*10.34*/("""and your email address is """),_display_(/*10.61*/if(!localUser.email)/*10.81*/ {_display_(Seq[Any](format.raw/*10.83*/("""<em>&lt;unknown&gt;</em>.""")))}/*10.110*/else/*10.115*/{_display_(Seq[Any](format.raw/*10.116*/("""
    	"""),_display_(/*11.7*/localUser/*11.16*/.email),format.raw/*11.22*/(""".
	    <i>
	    """),_display_(/*13.7*/if(!localUser.emailValidated && localUser.email)/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""
	      """),format.raw/*14.8*/("""(<a href=""""),_display_(/*14.19*/routes/*14.25*/.Account.verifyEmail),format.raw/*14.45*/("""">unverified - click to verify</a>)
	    """)))}/*15.8*/else/*15.13*/{_display_(Seq[Any](format.raw/*15.14*/("""
	      """),format.raw/*16.8*/("""(verified)
	    """)))}),format.raw/*17.7*/("""</i>
    """)))}),format.raw/*18.6*/("""
    """),format.raw/*19.5*/("""<br />
        """),_display_(/*20.10*/if(localUser.firstName && localUser.lastName)/*20.55*/ {_display_(Seq[Any](format.raw/*20.57*/("""
            """),format.raw/*21.13*/("""Your first name is """),_display_(/*21.33*/localUser/*21.42*/.firstName),format.raw/*21.52*/(""" """),format.raw/*21.53*/("""and your last name is """),_display_(/*21.76*/localUser/*21.85*/.lastName),format.raw/*21.94*/("""
            """),format.raw/*22.13*/("""<br/>
        """)))}),format.raw/*23.10*/("""
    """),_display_(/*24.6*/defining(localUser.getProviders())/*24.40*/ { providers =>_display_(Seq[Any](format.raw/*24.55*/("""
        """),_display_(/*25.10*/if(providers.size() > 0)/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
        """),_display_(/*26.10*/if(providers.size() ==1)/*26.34*/ {_display_(Seq[Any](format.raw/*26.36*/("""
            """),_display_(/*27.14*/Messages("playauthenticate.profile.providers_one")),format.raw/*27.64*/("""
        """)))}/*28.11*/else/*28.16*/{_display_(Seq[Any](format.raw/*28.17*/("""
            """),_display_(/*29.14*/Messages("playauthenticate.profile.providers_many",providers.size().toString())),format.raw/*29.93*/("""
        """)))}),format.raw/*30.10*/("""
        """),_display_(/*31.10*/for(p <- providers) yield /*31.29*/ {_display_(Seq[Any](format.raw/*31.31*/("""
            """),_display_(/*32.14*/_providerIcon(p)),format.raw/*32.30*/("""
        """)))}),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""<br/>
        """)))}),format.raw/*35.10*/("""
    """)))}),format.raw/*36.6*/("""

    """),format.raw/*38.5*/("""<br/>
    """),_display_(/*39.6*/currentAuth(playAuth)/*39.27*/ { auth =>_display_(Seq[Any](format.raw/*39.37*/("""
        """),_display_(/*40.10*/Messages("playauthenticate.profile.logged")),format.raw/*40.53*/(""" """),_display_(/*40.55*/_providerIcon(auth.getProvider())),format.raw/*40.88*/("""<br/>
        """),_display_(/*41.10*/if(auth.expires() != -1)/*41.34*/{_display_(Seq[Any](format.raw/*41.35*/("""
            """),_display_(/*42.14*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires()))),format.raw/*42.117*/("""
        """)))}/*43.11*/else/*43.16*/{_display_(Seq[Any](format.raw/*43.17*/("""
            """),_display_(/*44.14*/Messages("playauthenticate.profile.session_endless", auth.getId())),format.raw/*44.80*/("""
        """)))}),format.raw/*45.10*/("""
    """)))}),format.raw/*46.6*/("""
    """),format.raw/*47.5*/("""<br/>
    <ul>
    	<li><a href=""""),_display_(/*49.20*/routes/*49.26*/.Account.changePassword),format.raw/*49.49*/("""">"""),_display_(/*49.52*/Messages("playauthenticate.profile.password_change")),format.raw/*49.104*/("""</a></li>
    </ul>
    </p>
""")))}),format.raw/*52.2*/("""
"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,userProvider:UserProvider,localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,userProvider,localUser)

  def f:((com.feth.play.module.pa.PlayAuthenticate,UserProvider,models.User) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,userProvider,localUser) => apply(playAuth,userProvider,localUser)

  def ref: this.type = this

}


}
}

/**/
object profile extends profile_Scope0.profile_Scope1.profile
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/profile.scala.html
                  HASH: 12eb28c91948b8ca25640fff2ca63eb125e7d6f8
                  MATRIX: 866->30|1116->141|1144->188|1171->190|1251->262|1290->264|1322->270|1353->275|1415->317|1474->349|1492->358|1518->363|1547->364|1601->391|1630->411|1670->413|1716->440|1730->445|1770->446|1803->453|1821->462|1848->468|1891->485|1948->533|1988->535|2023->543|2061->554|2076->560|2117->580|2177->623|2190->628|2229->629|2264->637|2311->654|2351->664|2383->669|2426->685|2480->730|2520->732|2561->745|2608->765|2626->774|2657->784|2686->785|2736->808|2754->817|2784->826|2825->839|2871->854|2903->860|2946->894|2999->909|3036->919|3069->943|3109->945|3146->955|3179->979|3219->981|3260->995|3331->1045|3360->1056|3373->1061|3412->1062|3453->1076|3553->1155|3594->1165|3631->1175|3666->1194|3706->1196|3747->1210|3784->1226|3825->1236|3861->1245|3907->1260|3943->1266|3976->1272|4013->1283|4043->1304|4091->1314|4128->1324|4192->1367|4221->1369|4275->1402|4317->1417|4350->1441|4389->1442|4430->1456|4555->1559|4584->1570|4597->1575|4636->1576|4677->1590|4764->1656|4805->1666|4841->1672|4873->1677|4934->1711|4949->1717|4993->1740|5023->1743|5097->1795|5157->1825
                  LINES: 30->2|35->2|37->5|38->6|38->6|38->6|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|45->13|45->13|45->13|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17|50->18|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|54->22|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|60->28|60->28|60->28|61->29|61->29|62->30|63->31|63->31|63->31|64->32|64->32|65->33|66->34|67->35|68->36|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|77->45|78->46|79->47|81->49|81->49|81->49|81->49|81->49|84->52
                  -- GENERATED --
              */
          