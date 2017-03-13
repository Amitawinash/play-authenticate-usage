
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exists_Scope0 {
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

     object exists_Scope1 {
import service.UserProvider

class exists extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.user.exists.title"))/*4.68*/ {_display_(Seq[Any](format.raw/*4.70*/("""
	"""),format.raw/*5.2*/("""<h1>"""),_display_(/*5.7*/Messages("playauthenticate.user.exists.title")),format.raw/*5.53*/("""</h1>
	<p>"""),_display_(/*6.6*/Messages("playauthenticate.user.exists.message")),format.raw/*6.54*/("""</p>
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
object exists extends exists_Scope0.exists_Scope1.exists
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/exists.scala.html
                  HASH: 5ab6bbf9a1b5beb48e91c699fc50042935da47b8
                  MATRIX: 825->30|948->58|976->61|1050->127|1089->129|1117->131|1147->136|1213->182|1249->193|1317->241|1352->247
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|38->5|38->5|39->6|39->6|40->7
                  -- GENERATED --
              */
          