
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object unverified_Scope0 {
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

     object unverified_Scope1 {
import service.UserProvider

class unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.verify.account.title"))/*4.71*/ {_display_(Seq[Any](format.raw/*4.73*/("""

	"""),format.raw/*6.2*/("""<h1>"""),_display_(/*6.7*/Messages("playauthenticate.verify.account.title")),format.raw/*6.56*/("""</h1>
	<p>
	"""),_display_(/*8.3*/Messages("playauthenticate.verify.account.before")),format.raw/*8.53*/(""" """),format.raw/*8.54*/("""<a href=""""),_display_(/*8.64*/routes/*8.70*/.Account.verifyEmail),format.raw/*8.90*/("""">"""),_display_(/*8.93*/Messages("playauthenticate.verify.account.first")),format.raw/*8.142*/("""</a>.<br/>
	</p>
""")))}),format.raw/*10.2*/("""
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
object unverified extends unverified_Scope0.unverified_Scope1.unverified
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/unverified.scala.html
                  HASH: 03d8fe1dfd8e9903901e626d08f0b16397b17e07
                  MATRIX: 830->30|953->58|981->61|1058->130|1097->132|1126->135|1156->140|1225->189|1263->202|1333->252|1361->253|1397->263|1411->269|1451->289|1480->292|1550->341|1598->359
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|41->8|41->8|41->8|41->8|41->8|41->8|41->8|41->8|43->10
                  -- GENERATED --
              */
          