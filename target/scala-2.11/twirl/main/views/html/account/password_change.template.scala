
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_change_Scope0 {
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

     object password_change_Scope1 {
import service.UserProvider

class password_change extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,Form[controllers.Account.PasswordChange],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, changeForm: Form[controllers.Account.PasswordChange]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.84*/("""

"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main(userProvider, Messages("playauthenticate.change.password.title"))/*7.72*/ {_display_(Seq[Any](format.raw/*7.74*/("""

	"""),format.raw/*9.2*/("""<h1>"""),_display_(/*9.7*/Messages("playauthenticate.change.password.title")),format.raw/*9.57*/("""</h1>
	<p>
	"""),_display_(/*11.3*/form(routes.Account.doChangePassword, 'class -> "form-inline", 'role -> "form")/*11.82*/ {_display_(Seq[Any](format.raw/*11.84*/("""

       """),_display_(/*13.9*/if(changeForm.hasGlobalErrors)/*13.39*/ {_display_(Seq[Any](format.raw/*13.41*/("""
        """),format.raw/*14.9*/("""<p class="alert alert-danger">
          """),_display_(/*15.12*/changeForm/*15.22*/.globalError.message),format.raw/*15.42*/("""
     	"""),format.raw/*16.7*/("""</p>
       """)))}),format.raw/*17.9*/("""

	   """),_display_(/*19.6*/_passwordPartial(changeForm)),format.raw/*19.34*/("""

    """),format.raw/*21.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*21.52*/Messages("playauthenticate.change.password.cta")),format.raw/*21.100*/("""</button>
	""")))}),format.raw/*22.3*/("""
	"""),format.raw/*23.2*/("""</p>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,changeForm:Form[controllers.Account.PasswordChange]): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,changeForm)

  def f:((UserProvider,Form[controllers.Account.PasswordChange]) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,changeForm) => apply(userProvider,changeForm)

  def ref: this.type = this

}


}
}

/**/
object password_change extends password_change_Scope0.password_change_Scope1.password_change
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/password_change.scala.html
                  HASH: 1748ce9cbe9d1a9e11180933365660391c5db3c8
                  MATRIX: 886->30|1070->132|1102->156|1181->112|1210->205|1238->208|1316->278|1355->280|1384->283|1414->288|1484->338|1523->351|1611->430|1651->432|1687->442|1726->472|1766->474|1802->483|1871->525|1890->535|1931->555|1965->562|2008->575|2041->582|2090->610|2123->616|2197->663|2267->711|2309->723|2338->725|2374->731
                  LINES: 30->2|34->5|34->5|35->2|37->5|39->7|39->7|39->7|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|51->19|53->21|53->21|53->21|54->22|55->23|56->24
                  -- GENERATED --
              */
          