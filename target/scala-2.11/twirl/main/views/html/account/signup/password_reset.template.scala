
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_Scope0 {
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

     object password_reset_Scope1 {
import service.UserProvider

class password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,Form[controllers.Signup.PasswordReset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, resetForm: Form[controllers.Signup.PasswordReset]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.81*/("""

"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main(userProvider, Messages("playauthenticate.password.reset.title"))/*7.71*/ {_display_(Seq[Any](format.raw/*7.73*/("""

	"""),format.raw/*9.2*/("""<h1>"""),_display_(/*9.7*/Messages("playauthenticate.password.reset.title")),format.raw/*9.56*/("""</h1>
	<p>
	"""),_display_(/*11.3*/form(routes.Signup.doResetPassword, 'class -> "form-horizontal", 'role -> "form")/*11.84*/ {_display_(Seq[Any](format.raw/*11.86*/("""

       """),_display_(/*13.9*/if(resetForm.hasGlobalErrors)/*13.38*/ {_display_(Seq[Any](format.raw/*13.40*/("""

     	"""),format.raw/*15.7*/("""<p class="alert alert-danger">
          """),_display_(/*16.12*/resetForm/*16.21*/.globalError.message),format.raw/*16.41*/("""
     	"""),format.raw/*17.7*/("""</p>
       """)))}),format.raw/*18.9*/("""

        """),_display_(/*20.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false

   		)/*25.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*25.36*/("""
		    """),format.raw/*26.7*/("""<input type="hidden" value=""""),_display_(/*26.36*/value),format.raw/*26.41*/("""" name=""""),_display_(/*26.50*/name),format.raw/*26.54*/("""" id=""""),_display_(/*26.61*/id),format.raw/*26.63*/("""" """),_display_(/*26.66*/toHtmlArgs(args)),format.raw/*26.82*/(""">
		""")))}),format.raw/*27.4*/("""

	   """),_display_(/*29.6*/_passwordPartial(resetForm)),format.raw/*29.33*/("""

    """),format.raw/*31.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*31.52*/Messages("playauthenticate.password.reset.cta")),format.raw/*31.99*/("""</button>
	""")))}),format.raw/*32.3*/("""
	"""),format.raw/*33.2*/("""</p>
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,resetForm:Form[controllers.Signup.PasswordReset]): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,resetForm)

  def f:((UserProvider,Form[controllers.Signup.PasswordReset]) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,resetForm) => apply(userProvider,resetForm)

  def ref: this.type = this

}


}
}

/**/
object password_reset extends password_reset_Scope0.password_reset_Scope1.password_reset
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/password_reset.scala.html
                  HASH: 0213473afe654b346a3a66661a8a24188989f13d
                  MATRIX: 888->30|1069->129|1101->153|1180->109|1209->202|1237->205|1314->274|1353->276|1382->279|1412->284|1481->333|1520->346|1610->427|1650->429|1686->439|1724->468|1764->470|1799->478|1868->520|1886->529|1927->549|1961->556|2004->569|2042->580|2144->674|2211->703|2245->710|2301->739|2327->744|2363->753|2388->757|2422->764|2445->766|2475->769|2512->785|2547->790|2580->797|2628->824|2661->830|2735->877|2803->924|2845->936|2874->938|2910->944
                  LINES: 30->2|34->5|34->5|35->2|37->5|39->7|39->7|39->7|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|47->15|48->16|48->16|48->16|49->17|50->18|52->20|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|61->29|61->29|63->31|63->31|63->31|64->32|65->33|66->34
                  -- GENERATED --
              */
          