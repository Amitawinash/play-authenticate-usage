
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_merge_Scope0 {
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

     object ask_merge_Scope1 {
import service.UserProvider

class ask_merge extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserProvider,Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*7.2*/label/*7.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.11*/("""
	"""),_display_(/*8.3*/Messages("playauthenticate.merge.accounts.question",aUser,bUser)),format.raw/*8.67*/("""
""")))};implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.156*/("""

"""),format.raw/*5.75*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.merge.accounts.title"))/*11.71*/ {_display_(Seq[Any](format.raw/*11.73*/("""

	"""),format.raw/*13.2*/("""<h1>"""),_display_(/*13.7*/Messages("playauthenticate.merge.accounts.title")),format.raw/*13.56*/("""</h1>
	<p>
	"""),_display_(/*15.3*/form(routes.Account.doMerge, 'class -> "form-horizontal", 'role -> "form")/*15.77*/ {_display_(Seq[Any](format.raw/*15.79*/("""

            """),_display_(/*17.14*/if(acceptForm.hasGlobalErrors)/*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
		        """),format.raw/*18.11*/("""<p class="alert alert-danger">
		          """),_display_(/*19.14*/acceptForm/*19.24*/.globalError.message),format.raw/*19.44*/("""
		     	"""),format.raw/*20.9*/("""</p>
            """)))}),format.raw/*21.14*/("""

	   """),_display_(/*23.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.merge.accounts.true"),
            	"false"->Messages("playauthenticate.merge.accounts.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        )),format.raw/*31.10*/("""

    """),format.raw/*33.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*33.52*/Messages("playauthenticate.merge.accounts.ok")),format.raw/*33.98*/("""</button>
	""")))}),format.raw/*34.3*/("""
	"""),format.raw/*35.2*/("""</p>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,acceptForm,aUser,bUser)

  def f:((UserProvider,Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,acceptForm,aUser,bUser) => apply(userProvider,acceptForm,aUser,bUser)

  def ref: this.type = this

}


}
}

/**/
object ask_merge extends ask_merge_Scope0.ask_merge_Scope1.ask_merge
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/ask_merge.scala.html
                  HASH: dde5f228a2ad469e28e8d9cb9ace6c30cfa906f7
                  MATRIX: 924->30|1171->280|1183->285|1263->289|1291->292|1375->356|1408->204|1440->228|1520->184|1549->277|1577->358|1606->361|1684->430|1724->432|1754->435|1785->440|1855->489|1894->502|1977->576|2017->578|2059->593|2098->623|2138->625|2177->636|2248->680|2267->690|2308->710|2344->719|2393->737|2426->744|2762->1059|2795->1065|2869->1112|2936->1158|2978->1170|3007->1172|3043->1178
                  LINES: 30->2|34->7|34->7|36->7|37->8|37->8|38->5|38->5|39->2|41->5|43->9|45->11|45->11|45->11|47->13|47->13|47->13|49->15|49->15|49->15|51->17|51->17|51->17|52->18|53->19|53->19|53->19|54->20|55->21|57->23|65->31|67->33|67->33|67->33|68->34|69->35|70->36
                  -- GENERATED --
              */
          