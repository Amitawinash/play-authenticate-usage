
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object aboutUs_Scope0 {
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

     object aboutUs_Scope1 {
import service.UserProvider

class aboutUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(userProvider: UserProvider , email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.46*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.index.title"))/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
      
"""),format.raw/*13.1*/("""<center>
<div>
  <h3><b>Contact Us</b></h3>
<h2>We are team of two members responsible for all technical and non-technical of HERE THERE courier services </h2>
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
object aboutUs extends aboutUs_Scope0.aboutUs_Scope1.aboutUs
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 11:06:35 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/aboutUs.scala.html
                  HASH: 9fd5c16f8017b3f914597cb993116e890ca9d88c
                  MATRIX: 820->127|959->171|988->174|1057->234|1097->236|1132->244
                  LINES: 30->9|35->9|37->11|37->11|37->11|39->13
                  -- GENERATED --
              */
          