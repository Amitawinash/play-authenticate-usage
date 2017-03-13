
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object oAuthDenied_Scope0 {
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

     object oAuthDenied_Scope1 {
import service.UserProvider

class oAuthDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.51*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.oauth.access.denied.title"))/*4.76*/ {_display_(Seq[Any](format.raw/*4.78*/("""

	"""),format.raw/*6.2*/("""<h1>"""),_display_(/*6.7*/Messages("playauthenticate.oauth.access.denied.title")),format.raw/*6.61*/("""</h1>
	<p>
		"""),_display_(/*8.4*/Messages("playauthenticate.oauth.access.denied.explanation")),format.raw/*8.64*/("""<br/>
	</p>
	<p>
		"""),_display_(/*11.4*/Messages("playauthenticate.oauth.access.denied.alternative")),format.raw/*11.64*/(""" """),format.raw/*11.65*/("""<a href=""""),_display_(/*11.75*/routes/*11.81*/.Application.signup),format.raw/*11.100*/("""">"""),_display_(/*11.103*/Messages("playauthenticate.oauth.access.denied.alternative.cta")),format.raw/*11.167*/("""</a>.
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,providerKey)

  def f:((UserProvider,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,providerKey) => apply(userProvider,providerKey)

  def ref: this.type = this

}


}
}

/**/
object oAuthDenied extends oAuthDenied_Scope0.oAuthDenied_Scope1.oAuthDenied
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/oAuthDenied.scala.html
                  HASH: 67aba61b018b487078072ff6f915762ad7e5798d
                  MATRIX: 847->30|991->79|1019->82|1101->156|1140->158|1169->161|1199->166|1273->220|1312->234|1392->294|1438->314|1519->374|1548->375|1585->385|1600->391|1641->410|1672->413|1758->477|1795->484
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|41->8|41->8|44->11|44->11|44->11|44->11|44->11|44->11|44->11|44->11|45->12
                  -- GENERATED --
              */
          