
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object termsAndCondition_Scope0 {
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

     object termsAndCondition_Scope1 {
import service.UserProvider

class termsAndCondition extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(userProvider: UserProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.30*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.index.title"))/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
      """),format.raw/*12.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div>
  
  <h1>By this you are accepted that</h1>
</div>

    """)))}))
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
object termsAndCondition extends termsAndCondition_Scope0.termsAndCondition_Scope1.termsAndCondition
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 13:08:30 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/termsAndCondition.scala.html
                  HASH: ca9c1c12aee40f10f9a313916554734919d716fd
                  MATRIX: 843->127|966->155|995->158|1064->218|1104->220|1138->227
                  LINES: 30->9|35->9|37->11|37->11|37->11|38->12
                  -- GENERATED --
              */
          