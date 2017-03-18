
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hereThereHomePage_Scope0 {
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

     object hereThereHomePage_Scope1 {
import service.UserProvider

class hereThereHomePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[UserProvider,play.twirl.api.HtmlFormat.Appendable] {

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
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
           <form action="/address"  style="margin: 25px;" >
            <h5 style="box-shadow: currentColor; ">Send Somthing</h5>

            <input class="form-control" type="text-center" name="toPincode" placeholder="Drop off location pincode"  pattern="[0-9]+" maxlength="6"  minlength="6" required/>
            <input class="form-control" type="text-center" name="fromPincode" placeholder="Pick up location pincode" maxlength="6"  required pattern="[0-9]+" minlength="6"  required/>
            <select class="form-control"   name="shipmentType"  required="value" />
             <option value="parcel">Parcel</option>
             <option value="household">Household</option>
             <option value="food">Food</option>
            </select>
            <input class="form-control"  id="inputId" type="email" name="emailId" placeholder="Sender email Id"   required/  >
            <input class="form-control" type="submit" name="" value="Send" >
          </form>
          </div>
          <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
             <form action="/orderStatus" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Track Your Order</h5>
               <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Order Number"  maxlength="24" required / >
               <input class="form-control" type="submit" name="action" value="Track">
               <input class="form-control" type="submit" name="action"  value="Estimated Date">
          </form>
          </div>
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
object hereThereHomePage extends hereThereHomePage_Scope0.hereThereHomePage_Scope1.hereThereHomePage
              /*
                  -- GENERATED --
                  DATE: Sat Mar 18 23:24:39 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/hereThereHomePage.scala.html
                  HASH: 5c029fd928eaa5728742e3e95955175dc80568c4
                  MATRIX: 843->127|966->155|995->158|1064->218|1104->220|1138->227|1320->381|1349->382|1381->387|1422->401|1450->402|1480->405|1520->417|1549->418|1581->423|1645->460|1673->461|1701->462
                  LINES: 30->9|35->9|37->11|37->11|37->11|38->12|43->17|43->17|44->18|45->19|45->19|46->20|46->20|46->20|47->21|49->23|49->23|50->24
                  -- GENERATED --
              */
          