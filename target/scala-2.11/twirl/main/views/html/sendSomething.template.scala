
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sendSomething_Scope0 {
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

     object sendSomething_Scope1 {
import service.UserProvider

class sendSomething extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[UserProvider,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userProvider: UserProvider , emailId: String , password: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.67*/("""

"""),_display_(/*8.2*/main(userProvider, Messages("playauthenticate.index.title"))/*8.62*/ {_display_(Seq[Any](format.raw/*8.64*/("""
      """),format.raw/*9.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
 <style type="text/css">
        

  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*13.46*/("""{"""),format.raw/*13.47*/("""
    """),format.raw/*14.5*/("""float:left;
  """),format.raw/*15.3*/("""}"""),format.raw/*15.4*/("""
  """),format.raw/*16.3*/(""".child_div_1"""),format.raw/*16.15*/("""{"""),format.raw/*16.16*/("""
    """),format.raw/*17.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*19.3*/("""}"""),format.raw/*19.4*/("""
"""),format.raw/*20.1*/("""</style>
      <h2 style="border-color: pink ">Welcome to <b style="color: #E57196">HereThere</b>  <small style="color: #D6C8CD">courier service</small></h2>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%;">
        <div id='parent_div_1' style="margin: 0%">

        
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px;margin-right:0% ">
           <form action="/checkAvailability"  style="margin-right:0%">
            <div id='child_div_1' style="margin:0px">
              <div class="child_div_1" style="border-radius:  10px; padding: 0%;margin-right:0%;">
                <input class="form-control" type="text-center" name="fromPincode" placeholder="Pick up location pincode" maxlength="6"  required pattern="[0-9]+" minlength="6"  required/>
                <input type="text-center" class="form-control" style="color:#191c1a" name="senderName" maxlength="25" placeholder="Sender Name" required>
              
          <select class="form-control" style="background-color: #EFF3E4" name="state" required/ >
             <option value="Karnataka">Karnataka</option>
             <option value="Delhi">Delhi</option>
             <option value="Kerala">Kerala</option>
             <option value="Goa">Goa</option>
             <option value="Maharashtra">Maharashtra</option>
             <option value="Nagaland">Nagaland</option>
             <option value="Odisha">Odisha</option>
             <option value="Punjab">Punjab</option>
             <option value="Rajasthan">Rajasthan</option>
             <option value="Sikkim">Sikkim</option>
             <option value="Tamil Nadu">Tamil Nadu</option>
             <option value="Telangana">Telangana</option>
             <option value="Tripura">Tripura</option>
             <option value="Uttar Pradesh">Uttar Pradesh</option>
             <option value="Uttarakhand">Uttarakhand</option>
             <option value="West Bengal">West Bengal</option> 
             <option value="Andhra Pradesh">Andhra Pradesh</option>
             <option value="Bihar">Bihar</option>
             <option value="Gujarat">Gujarat</option>
             <option value="Jharkhand">Jharkhand</option>
          </select>
                <input type="text-center" class="form-control" style="color:#191c1a" name="senderArea" maxlength="20" placeholder="Sender Area" required>
                <input type="text-center" class="form-control" style="color:#191c1a" name="senderStreet" maxlength="20" placeholder="Sender Street" required>
                <input type="text-center" class="form-control" style="color:#191c1a" name="senderNumber" maxlength="15" placeholder="Sender House Number" required>
                <input type="text-center" class="form-control" style="color:#191c1a" name="senderContactNumber" maxlength="10" minlength="10" pattern="[0-9]+" placeholder="Sender Contact Number" required>
                 <a href=""""),_display_(/*59.28*/routes/*59.34*/.Application.termsAndCondition()),format.raw/*59.66*/("""" style="color: black">please accept terms and condition <input type="checkbox" name="password" value=""""),_display_(/*59.170*/password),format.raw/*59.178*/("""" required/></a>
              </div>
              <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius:10px;margin-right:0%">
               
                <input class="form-control" type="text-center" name="toPincode" placeholder="Drop off location pincode"  pattern="[0-9]+" maxlength="6"  minlength="6" required/>
                <select class="form-control"   name="shipmentType"  required="value" />
                 <option value="parcel">Parcel</option>
                 <option value="household">Household</option>
                 <option value="food">Food</option>
                </selecn>
                <input type="text-center" class="form-control" style="color:#191c1a" name="reciverName" maxlength="25" placeholder="Reciver Name" required>
               
          <select class="form-control" style="background-color: #EFF3E4" name="state" required/ >
             <option value="Karnataka">Karnataka</option>
             <option value="Delhi">Delhi</option>
             <option value="Kerala">Kerala</option>
             <option value="Goa">Goa</option>
             <option value="Maharashtra">Maharashtra</option>
             <option value="Nagaland">Nagaland</option>
             <option value="Odisha">Odisha</option>
             <option value="Punjab">Punjab</option>
             <option value="Rajasthan">Rajasthan</option>
             <option value="Sikkim">Sikkim</option>
             <option value="Tamil Nadu">Tamil Nadu</option>
             <option value="Telangana">Telangana</option>
             <option value="Tripura">Tripura</option>
             <option value="Uttar Pradesh">Uttar Pradesh</option>
             <option value="Uttarakhand">Uttarakhand</option>
             <option value="West Bengal">West Bengal</option> 
             <option value="Andhra Pradesh">Andhra Pradesh</option>
             <option value="Bihar">Bihar</option>
             <option value="Gujarat">Gujarat</option>
             <option value="Jharkhand">Jharkhand</option>
          </select>
                <input type="text-center" class="form-control" style="color:#191c1a" name="area" maxlength="20" placeholder="Reciver Area" required>
                <input type="text-center" class="form-control" style="color:#191c1a" name="street" maxlength="20" placeholder="Reciver Street" required>
                <input type="text-center" class="form-control" style="color:#191c1a" name="houseNumber" maxlength="15" placeholder="Reciver House Number" required>
                <input type="text-center" class="form-control" style="color:#191c1a" name="contactNumber" maxlength="10" minlength="10" pattern="[0-9]+" placeholder="Reciver Contact Number" required>
              </div>
            </div>
            <button class="form-control" style="background-color: #F3EC97 ; margin-bottom: 6%;width: 25%;margin-left:24% " name="emailId" value=""""),_display_(/*99.147*/emailId),format.raw/*99.154*/("""">Next</button>
          </form>
          </div>
          <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px;margin-right: 0% " >
             <form action="/orderStatus" style="margin: 15px;"  >
               <h5 style="box-shadow: currentColor;">Track Your Order</h5>
               <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Order Number"  maxlength="24"  required  / >
               <br>
               <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Track" >
               <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action"  value="Estimated Date">
               
          </form>
          <div class="child_div_1" style="background-color: #BFD3F0;border-radius: 10px;margin: 15px;">
             <form action="getAllOrderId" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Find order Number</h5>
               
               <input class="form-control" type="email" name="userEmailId" placeholder="Enter User Email Id"  maxlength="29" required / >
              
               <input class="form-control" style="background-color: #F3EC97  " type="submit" name="action"  value="Get all order Id">
          </form>
          </div>
          </div>
        </div>
      </div>
""")))}))
      }
    }
  }

  def render(userProvider:UserProvider,emailId:String,password:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,emailId,password)

  def f:((UserProvider,String,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,emailId,password) => apply(userProvider,emailId,password)

  def ref: this.type = this

}


}
}

/**/
object sendSomething extends sendSomething_Scope0.sendSomething_Scope1.sendSomething
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 11:16:33 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/sendSomething.scala.html
                  HASH: 5b447bcf90b4521223e6ba7ac579494925c1e242
                  MATRIX: 845->34|1005->99|1033->102|1101->162|1140->164|1173->171|1355->325|1384->326|1416->331|1457->345|1485->346|1515->349|1555->361|1584->362|1616->367|1680->404|1708->405|1736->406|4720->3363|4735->3369|4788->3401|4920->3505|4950->3513|7877->6412|7906->6419
                  LINES: 30->6|35->6|37->8|37->8|37->8|38->9|42->13|42->13|43->14|44->15|44->15|45->16|45->16|45->16|46->17|48->19|48->19|49->20|88->59|88->59|88->59|88->59|88->59|128->99|128->99
                  -- GENERATED --
              */
          