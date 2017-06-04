
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactUs_Scope0 {
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

     object contactUs_Scope1 {
import service.UserProvider

class contactUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(userProvider: UserProvider , email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.46*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.index.title"))/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
      
"""),format.raw/*13.1*/("""<center>
<div>
  <h3><b>Contact Us</b></h3>
  <h5>"""),_display_(/*16.8*/email),format.raw/*16.13*/("""</h5>
</div>

<div>
  <a href="https://www.facebook.com/amit.awinash">
    <img src="/assets/icons/facebook-24x24.png" >
  </a>
  <br>
  <br>
  <br>
  <br>

  <br><br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>

  <br><br>
  <br>
  <br>
</div>
</center>
      
    """)))}))
      }
    }
  }

  def render(userProvider:UserProvider,email:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,email)

  def f:((UserProvider,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,email) => apply(userProvider,email)

  def ref: this.type = this

}


}
}

/**/
object contactUs extends contactUs_Scope0.contactUs_Scope1.contactUs
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 19:49:42 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/contactUs.scala.html
                  HASH: b240f5b0cde1de371ad02e08f3a68b479cf3f0c6
                  MATRIX: 826->127|965->171|994->174|1063->234|1103->236|1138->244|1215->295|1241->300
                  LINES: 30->9|35->9|37->11|37->11|37->11|39->13|42->16|42->16
                  -- GENERATED --
              */
          