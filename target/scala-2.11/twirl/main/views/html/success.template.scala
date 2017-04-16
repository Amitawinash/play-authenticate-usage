
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object success_Scope0 {
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

     object success_Scope1 {
import service.UserProvider

class success extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userProvider: UserProvider , message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.48*/("""

"""),_display_(/*8.2*/main(userProvider, Messages("playauthenticate.index.title"))/*8.62*/ {_display_(Seq[Any](format.raw/*8.64*/("""
    """),format.raw/*9.5*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
 <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="This page is for Admin">
        <meta name="author" content="Amit">

        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*15.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*16.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Application.jsRoutes),format.raw/*17.73*/("""" defer="defer"></script>
<style type="text/css">
  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*19.46*/("""{"""),format.raw/*19.47*/("""
    """),format.raw/*20.5*/("""float:left;
  """),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""
  """),format.raw/*22.3*/(""".child_div_1"""),format.raw/*22.15*/("""{"""),format.raw/*22.16*/("""
    """),format.raw/*23.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""
"""),format.raw/*26.1*/("""</style>
<link rel="stylesheet" href=""""),_display_(/*27.31*/routes/*27.37*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*27.89*/("""">
<link href=""""),_display_(/*28.14*/routes/*28.20*/.Assets.versioned("css/main.css")),format.raw/*28.53*/("""" rel="stylesheet">
      
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
          <div class="child_div_1" style="background-color: #8D8D93  ;border-radius: 10px;margin-top: 5%">
            <form action="/findOrderId" style="margin: 25px;"  >
            <h1 style="color: white">"""),_display_(/*72.39*/message),format.raw/*72.46*/("""</h1>
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
""")))}))
      }
    }
  }

  def render(userProvider:UserProvider,message:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,message)

  def f:((UserProvider,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,message) => apply(userProvider,message)

  def ref: this.type = this

}


}
}

/**/
object success extends success_Scope0.success_Scope1.success
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 17:53:42 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/success.scala.html
                  HASH: 284bf53baca41fa3057ac40cb949cb03a9c04036
                  MATRIX: 820->124|961->170|989->173|1057->233|1096->235|1127->240|1486->572|1501->578|1563->619|1647->676|1662->682|1734->732|1818->789|1833->795|1875->816|1998->911|2027->912|2059->917|2100->931|2128->932|2158->935|2198->947|2227->948|2259->953|2323->990|2351->991|2379->992|2445->1031|2460->1037|2533->1089|2576->1105|2591->1111|2645->1144|5459->3931|5487->3938
                  LINES: 30->6|35->6|37->8|37->8|37->8|38->9|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|48->19|48->19|49->20|50->21|50->21|51->22|51->22|51->22|52->23|54->25|54->25|55->26|56->27|56->27|56->27|57->28|57->28|57->28|101->72|101->72
                  -- GENERATED --
              */
          