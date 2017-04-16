
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

     object findOrderId_Scope1 {
import service.UserProvider

class findOrderId extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserProvider,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(userProvider: UserProvider , key: String , numberOfOrders: String , listOfOrders: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.92*/("""

"""),_display_(/*13.2*/main(userProvider, Messages("playauthenticate.index.title"))/*13.62*/ {_display_(Seq[Any](format.raw/*13.64*/("""

      """),format.raw/*15.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
 <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="This page is for Admin">
        <meta name="author" content="Amit">

        <script type="text/javascript" src=""""),_display_(/*21.46*/routes/*21.52*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*21.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*22.46*/routes/*22.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*22.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*23.46*/routes/*23.52*/.Application.jsRoutes),format.raw/*23.73*/("""" defer="defer"></script>
<style type="text/css">
  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*25.46*/("""{"""),format.raw/*25.47*/("""
    """),format.raw/*26.5*/("""float:left;
  """),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
  """),format.raw/*28.3*/(""".child_div_1"""),format.raw/*28.15*/("""{"""),format.raw/*28.16*/("""
    """),format.raw/*29.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*31.3*/("""}"""),format.raw/*31.4*/("""
"""),format.raw/*32.1*/("""</style>
<link rel="stylesheet" href=""""),_display_(/*33.31*/routes/*33.37*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*33.89*/("""">
<link href=""""),_display_(/*34.14*/routes/*34.20*/.Assets.versioned("css/main.css")),format.raw/*34.53*/("""" rel="stylesheet">
      
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
                   
<body>
 
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 98%;border-radius: 15px">
      <div>
        <div id='parent_div_1'>
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
            <form action="/findOrderId" style="margin: 25px;"  >
                <h5 style="box-shadow: currentColor;">Get all order Id</h5>
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
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px;margin-top: 5%">
            <form action="/findOrderId" style="margin: 25px;"  >

            <h3 style="color: black  " id="h1" > Value  " """),_display_(/*79.60*/key),format.raw/*79.63*/(""" """),format.raw/*79.64*/("""" has Ordered """),_display_(/*79.79*/numberOfOrders),format.raw/*79.93*/("""  """),format.raw/*79.95*/("""orders </h3>
            <h4>They are :- </h4>
            <h6>"""),_display_(/*81.18*/listOfOrders),format.raw/*81.30*/("""</h6>
            </form>
          </div>
        </div>
      </div>
      <br>
      </div>


""")))}))
      }
    }
  }

  def render(userProvider:UserProvider,key:String,numberOfOrders:String,listOfOrders:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,key,numberOfOrders,listOfOrders)

  def f:((UserProvider,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,key,numberOfOrders,listOfOrders) => apply(userProvider,key,numberOfOrders,listOfOrders)

  def ref: this.type = this

}


}
}

/**/
object findOrderId extends findOrderId_Scope0.findOrderId_Scope1.findOrderId
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 19:26:35 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/findOrderId.scala.html
                  HASH: f775ee7a563c369100c741432bffdddb4bb34f4a
                  MATRIX: 847->129|1033->219|1062->222|1131->282|1171->284|1206->292|1565->624|1580->630|1642->671|1726->728|1741->734|1813->784|1897->841|1912->847|1954->868|2077->963|2106->964|2138->969|2179->983|2207->984|2237->987|2277->999|2306->1000|2338->1005|2402->1042|2430->1043|2458->1044|2524->1083|2539->1089|2612->1141|2655->1157|2670->1163|2724->1196|5559->4004|5583->4007|5612->4008|5654->4023|5689->4037|5719->4039|5810->4103|5843->4115
                  LINES: 30->11|35->11|37->13|37->13|37->13|39->15|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|49->25|49->25|50->26|51->27|51->27|52->28|52->28|52->28|53->29|55->31|55->31|56->32|57->33|57->33|57->33|58->34|58->34|58->34|103->79|103->79|103->79|103->79|103->79|103->79|105->81|105->81
                  -- GENERATED --
              */
          