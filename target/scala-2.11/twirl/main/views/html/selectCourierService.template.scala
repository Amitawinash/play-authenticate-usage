
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object selectCourierService_Scope0 {
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

     object selectCourierService_Scope1 {
import service.UserProvider

class selectCourierService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[UserProvider,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(userProvider: UserProvider , listOfcourier: List[String] , orderId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.78*/("""

"""),_display_(/*11.2*/main(userProvider, Messages("playauthenticate.index.title"))/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
"""),format.raw/*12.1*/("""<style type="text/css">
        

  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*15.46*/("""{"""),format.raw/*15.47*/("""
    """),format.raw/*16.5*/("""float:left;
  """),format.raw/*17.3*/("""}"""),format.raw/*17.4*/("""
  """),format.raw/*18.3*/(""".child_div_1"""),format.raw/*18.15*/("""{"""),format.raw/*18.16*/("""
    """),format.raw/*19.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""
"""),format.raw/*22.1*/("""</style>
      <h2 style="border-color: pink ">Welcome to <b style="color: #E57196">HereThere</b>  <small style="color: #D6C8CD">courier service</small></h2>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%;">
  <div class="child_div_1" style="background-color: #8D8D93  ;border-radius: 10px;margin: 1px;">
            <form action="getAllOrderId" style="margin: 2px; position: all;">
              <h4 style="color: white"><b> Your order number is : """),_display_(/*27.68*/orderId),format.raw/*27.75*/("""</b></h4>
            </form>
  </div>
        <div id='parent_div_1'>
        

        <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px; " >
             <form action="/newUser" style="margin: 25px; margin-bottom: 0%"  >
               <h5 style="box-shadow: currentColor;">New user</h5>
               <input class="form-control" type="email" name="userEmailId" placeholder="Enter User Email Id"  maxlength="29" required / >
               <input class="form-control" type="password" name="password" placeholder="Enter password" minlength="8" maxlength="10" required / >
               <input class="form-control" type="password" name="confirmPassword" placeholder="Enter Confirm Password" minlength="8" maxlength="10" required / >
               <h6 style="color: red">Sequrity Question</h6>
               <h6>In which year you were born ?</h6>
               
               <input class="form-control" type="password" name="sequrityAnswer" placeholder="Enter Answer" pattern="[0-9]+" minlength="4" maxlength="4" required / >
               <br>
               <input class="form-control" style="background-color: #9FB0F9  " type="submit" name="action" value="Register">
          </form>
          <div>
            <form action="/forgetPassword" style="margin: 25px; margin-top: 0%;margin-bottom: 0%">
                 <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Forget Password">
            </form>
          </div>
          <div>
            <form action="/changePassword" style="margin: 25px; margin-top: 0%">
                 <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Change Password">
            </form>
          </div>
          </div>
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
           <form action="/payment"  style="margin: 25px;">
            <h5 style="box-shadow: currentColor; "><b>Select Courier Service</b></h5>
              <table id="list" border="1px">
        <thead>
          <tr>
            
            <td>courier service provider</td>
          </tr>
        </thead>

        <tbody>
          """),_display_(/*69.12*/for(listOfOrder <- listOfcourier) yield /*69.45*/ {_display_(Seq[Any](format.raw/*69.47*/("""
            """),format.raw/*70.13*/("""<tr>
              
                <td>"""),_display_(/*72.22*/listOfOrder),format.raw/*72.33*/("""</td> 
              
            </tr>
          """)))}),format.raw/*75.12*/("""
        """),format.raw/*76.9*/("""</tbody>
      </table>

            <h6 style="color: red">Please select courier service provider </h6>
            <center>
              <select class="form-control" name="shipmentType"  required="value" />
                <option value="DHL">DHL = 100 &#x20B9</option>
                <option value="DTDC">DTDC = 200 &#x20B9</option>
                <option value="AirPost">AirPost = 300 &#x20B9</option>
              </select>
            </center>
            <center>
              <button class="form-control" style="margin-top: 4%" value=""""),_display_(/*88.75*/orderId),format.raw/*88.82*/("""" name="orderId">Next</button>
            </center>
           
          </form>
          </div>
          <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
             <form action="/orderStatus" style="margin: 25px;"  >
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


""")))}),format.raw/*116.2*/("""




"""))
      }
    }
  }

  def render(userProvider:UserProvider,listOfcourier:List[String],orderId:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,listOfcourier,orderId)

  def f:((UserProvider,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,listOfcourier,orderId) => apply(userProvider,listOfcourier,orderId)

  def ref: this.type = this

}


}
}

/**/
object selectCourierService extends selectCourierService_Scope0.selectCourierService_Scope1.selectCourierService
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 14:11:24 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/selectCourierService.scala.html
                  HASH: 572b033fc5f2c7bb512705ccced45daf3105d1b2
                  MATRIX: 872->127|1043->203|1072->206|1141->266|1181->268|1209->269|1316->348|1345->349|1377->354|1418->368|1446->369|1476->372|1516->384|1545->385|1577->390|1641->427|1669->428|1697->429|2216->921|2244->928|4502->3159|4551->3192|4591->3194|4632->3207|4700->3248|4732->3259|4814->3310|4850->3319|5427->3869|5455->3876|6909->5299
                  LINES: 30->9|35->9|37->11|37->11|37->11|38->12|41->15|41->15|42->16|43->17|43->17|44->18|44->18|44->18|45->19|47->21|47->21|48->22|53->27|53->27|95->69|95->69|95->69|96->70|98->72|98->72|101->75|102->76|114->88|114->88|142->116
                  -- GENERATED --
              */
          