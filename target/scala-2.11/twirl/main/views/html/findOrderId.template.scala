
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object findOrderId_Scope0 {
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

class findOrderId extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(orderId: String , cost: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
      """),format.raw/*2.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->

      <style type="text/css">
        

          #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*7.54*/("""{"""),format.raw/*7.55*/("""
    """),format.raw/*8.5*/("""float:left;
  """),format.raw/*9.3*/("""}"""),format.raw/*9.4*/("""
  """),format.raw/*10.3*/(""".child_div_1"""),format.raw/*10.15*/("""{"""),format.raw/*10.16*/("""
    """),format.raw/*11.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""
      """),format.raw/*14.7*/("""</style>
      
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
                   

  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%">
      <div>
        <div id='parent_div_1'>
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
             <form action="/orderStatus" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Estimated Date Of Shipment</h5>
               <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Order Number" required  maxlength="24">
               <input  class="form-control" type="Date" name="estimatedDate" required/>
               <input class="form-control" type="submit" name="action"  value="Estimated Date">
          </form>
          </div>
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
             <form action="/orderStatus" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Get all order Id</h5>
               
              
               <input class="form-control" type="submit" name="action"  value="Get all order Id">
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
"""))
      }
    }
  }

  def render(orderId:String,cost:String): play.twirl.api.HtmlFormat.Appendable = apply(orderId,cost)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (orderId,cost) => apply(orderId,cost)

  def ref: this.type = this

}


}

/**/
object findOrderId extends findOrderId_Scope0.findOrderId
              /*
                  -- GENERATED --
                  DATE: Fri Mar 24 17:28:04 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/findOrderId.scala.html
                  HASH: 94ac85e88b8d30f455a3491ec6fac7452f019294
                  MATRIX: 764->1|891->33|924->40|1119->208|1147->209|1178->214|1218->228|1245->229|1275->232|1315->244|1344->245|1376->250|1440->287|1468->288|1502->295
                  LINES: 27->1|32->1|33->2|38->7|38->7|39->8|40->9|40->9|41->10|41->10|41->10|42->11|44->13|44->13|45->14
                  -- GENERATED --
              */
          