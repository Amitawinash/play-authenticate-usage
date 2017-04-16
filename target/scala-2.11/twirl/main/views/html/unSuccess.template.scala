
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object unSuccess_Scope0 {
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

     object unSuccess_Scope1 {
import service.UserProvider

class unSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

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
          <div class="child_div_1" style="background-color: #FB2773  ;border-radius: 10px;margin-top: 5%">
            <form action="/findOrderId" style="margin: 25px;"  >
            <h1 style="color: white"><b>"""),_display_(/*72.42*/message),format.raw/*72.49*/("""</b></h1>
            </form>
          </div>
        </div>
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
object unSuccess extends unSuccess_Scope0.unSuccess_Scope1.unSuccess
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 19:24:42 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/unSuccess.scala.html
                  HASH: fdbf2018f3f2486e67cb5645cb828eeb0db7f585
                  MATRIX: 826->124|967->170|995->173|1063->233|1102->235|1133->240|1492->572|1507->578|1569->619|1653->676|1668->682|1740->732|1824->789|1839->795|1881->816|2004->911|2033->912|2065->917|2106->931|2134->932|2164->935|2204->947|2233->948|2265->953|2329->990|2357->991|2385->992|2451->1031|2466->1037|2539->1089|2582->1105|2597->1111|2651->1144|5468->3934|5496->3941
                  LINES: 30->6|35->6|37->8|37->8|37->8|38->9|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|48->19|48->19|49->20|50->21|50->21|51->22|51->22|51->22|52->23|54->25|54->25|55->26|56->27|56->27|56->27|57->28|57->28|57->28|101->72|101->72
                  -- GENERATED --
              */
          