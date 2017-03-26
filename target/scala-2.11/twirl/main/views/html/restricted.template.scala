
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
      """),format.raw/*5.7*/("""<style type="text/css">
     #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*6.49*/("""{"""),format.raw/*6.50*/("""
    """),format.raw/*7.5*/("""float:left;
  """),format.raw/*8.3*/("""}"""),format.raw/*8.4*/("""
  """),format.raw/*9.3*/(""".child_div_1"""),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
    """),format.raw/*10.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*12.3*/("""}"""),format.raw/*12.4*/("""
      """),format.raw/*13.7*/("""</style>
      
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
                   

  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%">
      <div>
        <div id='parent_div_1'>
        <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
             <form action="/findOrderId" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Find order Id</h5>
               <select class="form-control"   name="findByKey"  required="value" />
               <option value="findByEmail">Find By Email</option>
               <option value="findByState">Find By State</option>
               <option value="findByPincode">Find By Pincode</option>
              </select>
               <input class="form-control" type="text-center" name="value" placeholder="Enter Email/State/Pincode"    maxlength="24" required >
              
               <input class="form-control" type="submit" name="action"  value="Get all order Id">
          </form>
          </div>
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
           <form action="/updateOrderStatus"  style="margin: 25px;" >
              <h5 style="box-shadow: currentColor; ">Update Order Status</h5>
              <input class="form-control" type="text-center" name="orderNumber" placeholder="Order Number"    maxlength="24" required >
              <select class="form-control"   name="shipmentStatus"  required="value" />
               <option value="Airport">Airport</option>
               <option value="warehouse">Warehouse</option>
               <option value="delivered">Delivered</option>
               <option value="addressNotFound">Address Not Found</option>
              </select>
              <input class="form-control" type="submit" name="" value="Send" />
            </form>
          </div>
          <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px ">
             <form action="/estimatedDate" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Estimated Date Of Shipment</h5>
               <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Order Number" required  maxlength="24">
               <input  class="form-control" type="Date" name="estimatedDate" required/>
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






""")))}),format.raw/*89.2*/("""
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
                  DATE: Sun Mar 26 20:11:57 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/restricted.scala.html
                  HASH: c8f5a3a1b8a6b429ddfb227474581a72b510a2c2
                  MATRIX: 834->30|988->89|1016->92|1108->176|1147->178|1180->185|1279->257|1307->258|1338->263|1378->277|1405->278|1434->281|1473->293|1501->294|1533->299|1597->336|1625->337|1659->344|4740->3395
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|39->6|39->6|40->7|41->8|41->8|42->9|42->9|42->9|43->10|45->12|45->12|46->13|122->89
                  -- GENERATED --
              */
          