
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
 <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="This page is for Admin">
        <meta name="author" content="Amit">

        <script type="text/javascript" src=""""),_display_(/*8.46*/routes/*8.52*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*9.46*/routes/*9.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*9.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*10.46*/routes/*10.52*/.Application.jsRoutes),format.raw/*10.73*/("""" defer="defer"></script>
<style type="text/css">
  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*12.46*/("""{"""),format.raw/*12.47*/("""
    """),format.raw/*13.5*/("""float:left;
  """),format.raw/*14.3*/("""}"""),format.raw/*14.4*/("""
  """),format.raw/*15.3*/(""".child_div_1"""),format.raw/*15.15*/("""{"""),format.raw/*15.16*/("""
    """),format.raw/*16.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*18.3*/("""}"""),format.raw/*18.4*/("""
"""),format.raw/*19.1*/("""</style>
<link rel="stylesheet" href=""""),_display_(/*20.31*/routes/*20.37*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*20.89*/("""">
<link href=""""),_display_(/*21.14*/routes/*21.20*/.Assets.versioned("css/main.css")),format.raw/*21.53*/("""" rel="stylesheet">
      
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
                   
<body>
 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/">Home</a></li>
                        <li class=""><a href="/restricted">Restricted page</a></li>
                        <li class=""><a href="/signup">Sign up</a></li>
                    </ul>
                        <a href="/login" class=" navbar-right btn btn-default navbar-btn ">Log in</a>
                </div>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 98%;border-radius: 15px">
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
               <select class="form-control"   name="shipmentStatus"  required="value" />
               <option value="findByEmail">Find By Email</option>
               <option value="findByState">Find By State</option>
               <option value="delivered">Find By Pincode</option>
              </select>
              <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Email/State/Pincode"    maxlength="24" required >
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
</body>"""))
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
                  DATE: Sun Mar 26 04:16:38 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/findOrderId.scala.html
                  HASH: 83275a60c60deb07541c10213fdfbe7736a88318
                  MATRIX: 764->1|891->33|924->40|1282->372|1296->378|1357->419|1440->476|1454->482|1525->532|1609->589|1624->595|1666->616|1789->711|1818->712|1850->717|1891->731|1919->732|1949->735|1989->747|2018->748|2050->753|2114->790|2142->791|2170->792|2236->831|2251->837|2324->889|2367->905|2382->911|2436->944
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|44->13|45->14|45->14|46->15|46->15|46->15|47->16|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21
                  -- GENERATED --
              */
          