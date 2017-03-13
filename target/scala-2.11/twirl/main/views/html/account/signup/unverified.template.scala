
package views.html.account.signup

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

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.verify.email.title"))/*4.69*/ {_display_(Seq[Any](format.raw/*4.71*/("""

	"""),format.raw/*6.2*/("""<h1>"""),_display_(/*6.7*/Messages("playauthenticate.verify.email.title")),format.raw/*6.54*/("""</h1>
	<p>
		"""),_display_(/*8.4*/Messages("playauthenticate.verify.email.requirement")),format.raw/*8.57*/("""</br>
		"""),_display_(/*9.4*/Messages("playauthenticate.verify.email.cta")),format.raw/*9.49*/("""
	"""),format.raw/*10.2*/("""<br/>
	
	</p>
""")))}),format.raw/*13.2*/("""
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
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/unverified.scala.html
                  HASH: 05fb8d03a3ee713e6c08a85e4962266c01110884
                  MATRIX: 837->30|960->58|988->61|1063->128|1102->130|1131->133|1161->138|1228->185|1267->199|1340->252|1374->261|1439->306|1468->308|1513->323
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|41->8|41->8|42->9|42->9|43->10|46->13
                  -- GENERATED --
              */
          