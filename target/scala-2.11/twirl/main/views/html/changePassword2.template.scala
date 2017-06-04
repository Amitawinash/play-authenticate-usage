
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object changePassword2_Scope0 {
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

     object changePassword2_Scope1 {
import service.UserProvider

class changePassword2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(userProvider: UserProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.30*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.index.title"))/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
      """),format.raw/*12.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->

<style type="text/css">
        

  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*17.46*/("""{"""),format.raw/*17.47*/("""
    """),format.raw/*18.5*/("""float:left;
  """),format.raw/*19.3*/("""}"""),format.raw/*19.4*/("""
  """),format.raw/*20.3*/(""".child_div_1"""),format.raw/*20.15*/("""{"""),format.raw/*20.16*/("""
    """),format.raw/*21.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*23.3*/("""}"""),format.raw/*23.4*/("""
"""),format.raw/*24.1*/("""</style>
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%">
      <div>
        <div id='parent_div_1'>

        <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
          <form action="/newPassword" style="margin: 25px;"  >
            <h2>Recover Password</h2>
            <input class="form-control" type="email" name="userEmailId" placeholder="Enter your email Id"  maxlength="29" required  >
            <input class="form-control" type="password" name="oldPassword" placeholder="Enter old password" maxlength="24">
            <br>
            <input class="form-control" type="submit" name="action" value="Recover Password">
          </form>
          
        </div>
          
      </div>
      <br/>
      <br/>
      <br />
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
object changePassword2 extends changePassword2_Scope0.changePassword2_Scope1.changePassword2
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 07:52:30 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/changePassword2.scala.html
                  HASH: 358628b011bdb9d56919c7a7b95a83c86d9c0ee1
                  MATRIX: 837->127|960->155|989->158|1058->218|1098->220|1132->227|1314->381|1343->382|1375->387|1416->401|1444->402|1474->405|1514->417|1543->418|1575->423|1639->460|1667->461|1695->462
                  LINES: 30->9|35->9|37->11|37->11|37->11|38->12|43->17|43->17|44->18|45->19|45->19|46->20|46->20|46->20|47->21|49->23|49->23|50->24
                  -- GENERATED --
              */
          