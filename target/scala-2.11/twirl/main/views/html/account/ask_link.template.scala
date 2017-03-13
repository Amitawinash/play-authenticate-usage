
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_link_Scope0 {
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

     object ask_link_Scope1 {
import service.UserProvider

class ask_link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[UserProvider,Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*7.2*/label/*7.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.11*/("""
	"""),_display_(/*8.3*/_providerIcon(newAccount.getProvider())),format.raw/*8.42*/(""" """),_display_(/*8.44*/Messages("playauthenticate.link.account.question",newAccount)),format.raw/*8.105*/("""
""")))};implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.115*/("""

"""),format.raw/*5.75*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.link.account.title"))/*11.69*/ {_display_(Seq[Any](format.raw/*11.71*/("""

	"""),format.raw/*13.2*/("""<h1>"""),_display_(/*13.7*/Messages("playauthenticate.link.account.title")),format.raw/*13.54*/("""</h1>
	<p>
	"""),_display_(/*15.3*/form(routes.Account.doLink, 'class -> "form-horizontal", 'role -> "form")/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""

            """),_display_(/*17.14*/if(acceptForm.hasGlobalErrors)/*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
		        """),format.raw/*18.11*/("""<p class="alert alert-danger">
		          """),_display_(/*19.14*/acceptForm/*19.24*/.globalError.message),format.raw/*19.44*/("""
		     	"""),format.raw/*20.9*/("""</p>
            """)))}),format.raw/*21.14*/("""

	   """),_display_(/*23.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.link.account.true"),
            	"false"->Messages("playauthenticate.link.account.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        )),format.raw/*31.10*/("""

    """),format.raw/*33.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*33.52*/Messages("playauthenticate.link.account.ok")),format.raw/*33.96*/("""</button>
	""")))}),format.raw/*34.3*/("""
	"""),format.raw/*35.2*/("""</p>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,acceptForm,newAccount)

  def f:((UserProvider,Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,acceptForm,newAccount) => apply(userProvider,acceptForm,newAccount)

  def ref: this.type = this

}


}
}

/**/
object ask_link extends ask_link_Scope0.ask_link_Scope1.ask_link
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/ask_link.scala.html
                  HASH: 009a6833324e554166734cfc25cebe5ed2aa5d35
                  MATRIX: 883->30|1089->239|1101->244|1181->248|1209->251|1268->290|1296->292|1378->353|1411->163|1443->187|1523->143|1552->236|1580->355|1609->358|1685->425|1725->427|1755->430|1786->435|1854->482|1893->495|1975->568|2015->570|2057->585|2096->615|2136->617|2175->628|2246->672|2265->682|2306->702|2342->711|2391->729|2424->736|2756->1047|2789->1053|2863->1100|2928->1144|2970->1156|2999->1158|3035->1164
                  LINES: 30->2|34->7|34->7|36->7|37->8|37->8|37->8|37->8|38->5|38->5|39->2|41->5|43->9|45->11|45->11|45->11|47->13|47->13|47->13|49->15|49->15|49->15|51->17|51->17|51->17|52->18|53->19|53->19|53->19|54->20|55->21|57->23|65->31|67->33|67->33|67->33|68->34|69->35|70->36
                  -- GENERATED --
              */
          