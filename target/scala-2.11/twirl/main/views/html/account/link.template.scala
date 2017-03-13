
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object link_Scope0 {
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

     object link_Scope1 {
import service.UserProvider

class link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,com.feth.play.module.pa.PlayAuthenticate,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider, playAuth: com.feth.play.module.pa.PlayAuthenticate):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.82*/("""

"""),_display_(/*4.2*/main(userProvider, Messages("playauthenticate.link.account.title"))/*4.69*/ {_display_(Seq[Any](format.raw/*4.71*/("""
    
    """),format.raw/*6.5*/("""<h1>"""),_display_(/*6.10*/Messages("playauthenticate.link.account.title")),format.raw/*6.57*/("""</h1>
    
    <p>
	"""),_display_(/*9.3*/_providerPartial(playAuth)),format.raw/*9.29*/("""
    """),format.raw/*10.5*/("""<br/>
    </p>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,playAuth:com.feth.play.module.pa.PlayAuthenticate): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,playAuth)

  def f:((UserProvider,com.feth.play.module.pa.PlayAuthenticate) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,playAuth) => apply(userProvider,playAuth)

  def ref: this.type = this

}


}
}

/**/
object link extends link_Scope0.link_Scope1.link
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/link.scala.html
                  HASH: 8713f937fc552a16e15af9e34607663b5e98d847
                  MATRIX: 853->30|1028->110|1056->113|1131->180|1170->182|1206->192|1237->197|1304->244|1350->265|1396->291|1428->296|1474->312
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|39->6|39->6|42->9|42->9|43->10|45->12
                  -- GENERATED --
              */
          