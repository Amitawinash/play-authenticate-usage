
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restricted_Scope0 {
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

     object restricted_Scope1 {
import service.UserProvider

class restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.61*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.navigation.restricted"), "restricted")/*4.86*/ {_display_(Seq[Any](format.raw/*4.88*/("""
    
    """),format.raw/*6.5*/("""<h1>"""),_display_(/*6.10*/Messages("playauthenticate.navigation.restricted")),format.raw/*6.60*/("""</h1>
    <p>
        """),_display_(/*8.10*/Messages("playauthenticate.restricted.secrets")),format.raw/*8.57*/("""
    """),format.raw/*9.5*/("""</p>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,localUser)

  def f:((UserProvider,models.User) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,localUser) => apply(userProvider,localUser)

  def ref: this.type = this

}


}
}

/**/
object restricted extends restricted_Scope0.restricted_Scope1.restricted
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/restricted.scala.html
                  HASH: 90fae99a0d07dcf8baa9dd611bc6708eac9c307f
                  MATRIX: 834->30|988->89|1016->92|1108->176|1147->178|1183->188|1214->193|1284->243|1333->266|1400->313|1431->318|1467->324
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|41->8|41->8|42->9|43->10
                  -- GENERATED --
              */
          