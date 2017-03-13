
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_forgot_Scope0 {
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

     object password_forgot_Scope1 {
import service.UserProvider

class password_forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.100*/("""

"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main(userProvider, Messages("playauthenticate.password.forgot.title"))/*7.72*/ {_display_(Seq[Any](format.raw/*7.74*/("""

	"""),format.raw/*9.2*/("""<h1>"""),_display_(/*9.7*/Messages("playauthenticate.password.forgot.title")),format.raw/*9.57*/("""</h1>
	<p>
	"""),_display_(/*11.3*/form(routes.Signup.doForgotPassword, 'class -> "form-inline", 'role -> "form")/*11.81*/ {_display_(Seq[Any](format.raw/*11.83*/("""

            """),_display_(/*13.14*/if(emailForm.hasGlobalErrors)/*13.43*/ {_display_(Seq[Any](format.raw/*13.45*/("""
		        """),format.raw/*14.11*/("""<p class="alert alert-danger">
		          """),_display_(/*15.14*/emailForm/*15.23*/.globalError.message),format.raw/*15.43*/("""
		     	"""),format.raw/*16.9*/("""</p>
            """)))}),format.raw/*17.14*/("""

	   """),_display_(/*19.6*/_emailPartial(emailForm)),format.raw/*19.30*/("""

    """),format.raw/*21.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*21.52*/Messages("playauthenticate.password.forgot.cta")),format.raw/*21.100*/("""</button>
	""")))}),format.raw/*22.3*/("""
	"""),format.raw/*23.2*/("""</p>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,emailForm)

  def f:((UserProvider,Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,emailForm) => apply(userProvider,emailForm)

  def ref: this.type = this

}


}
}

/**/
object password_forgot extends password_forgot_Scope0.password_forgot_Scope1.password_forgot
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/password_forgot.scala.html
                  HASH: 26c9ef5abb426b30f7194ab2f05658181afe42a3
                  MATRIX: 910->30|1110->148|1142->172|1222->128|1251->221|1279->224|1357->294|1396->296|1425->299|1455->304|1525->354|1564->367|1651->445|1691->447|1733->462|1771->491|1811->493|1850->504|1921->548|1939->557|1980->577|2016->586|2065->604|2098->611|2143->635|2176->641|2250->688|2320->736|2362->748|2391->750|2427->756
                  LINES: 30->2|34->5|34->5|35->2|37->5|39->7|39->7|39->7|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|51->19|53->21|53->21|53->21|54->22|55->23|56->24
                  -- GENERATED --
              */
          