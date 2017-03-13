
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object no_token_or_invalid_Scope0 {
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

     object no_token_or_invalid_Scope1 {
import service.UserProvider

class no_token_or_invalid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.token.error.title"))/*4.68*/ {_display_(Seq[Any](format.raw/*4.70*/("""
	"""),format.raw/*5.2*/("""<h1>"""),_display_(/*5.7*/Messages("playauthenticate.token.error.title")),format.raw/*5.53*/("""</h1>
	<p>"""),_display_(/*6.6*/Messages("playauthenticate.token.error.message")),format.raw/*6.54*/("""</p>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider): play.twirl.api.HtmlFormat.Appendable = apply(userProvider)

  def f:((UserProvider) => play.twirl.api.HtmlFormat.Appendable) = (userProvider) => apply(userProvider)

  def ref: this.type = this

}


}
}

/**/
object no_token_or_invalid extends no_token_or_invalid_Scope0.no_token_or_invalid_Scope1.no_token_or_invalid
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/no_token_or_invalid.scala.html
                  HASH: 3ac4254a8b83d1aa9ee271e196c3f79e8acc805a
                  MATRIX: 864->30|987->58|1015->61|1089->127|1128->129|1156->131|1186->136|1252->182|1288->193|1356->241|1391->247
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|38->5|38->5|39->6|39->6|40->7
                  -- GENERATED --
              */
          