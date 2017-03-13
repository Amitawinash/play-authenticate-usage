
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import service.UserProvider

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.index.title"))/*4.62*/ {_display_(Seq[Any](format.raw/*4.64*/("""
      """),format.raw/*5.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>"""),_display_(/*7.14*/Messages("playauthenticate.index.intro")),format.raw/*7.54*/("""</h1>
        <p>"""),_display_(/*8.13*/Messages("playauthenticate.index.intro_2")),format.raw/*8.55*/(""" """),format.raw/*8.56*/("""<br/>"""),_display_(/*8.62*/Messages("playauthenticate.index.intro_3")),format.raw/*8.104*/("""</p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="col-xs-6 col-sm-4">
          <br>
          <br>
          <br>
        </div>
        <div class="col-xs-6 col-sm-4">
          <br>
          <br>
          <br>
       </div>
        <div class="col-xs-6 col-sm-4">
          <br>
          <br>
          <br>
        </div>
      </div>
    """)))}),format.raw/*29.6*/("""
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
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 16:55:51 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/index.scala.html
                  HASH: e75a28bc6945a844be56850104b6047de347e3cd
                  MATRIX: 807->30|930->58|958->61|1026->121|1065->123|1098->130|1241->247|1301->287|1345->305|1407->347|1435->348|1467->354|1530->396|1958->794
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|40->7|40->7|41->8|41->8|41->8|41->8|41->8|62->29
                  -- GENERATED --
              */
          