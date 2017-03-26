
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

class selectCourierService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String , orderId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.37*/("""


"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Here There</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .jumbotron """),format.raw/*19.14*/("""{"""),format.raw/*19.15*/("""
      """),format.raw/*20.7*/("""background-color: #f4511e;
      color: #fff;
      padding: 100px 25px ;

  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""
  """),format.raw/*25.3*/(""".bg-grey """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/("""
      """),format.raw/*26.7*/("""background-color: #f6f6f6;
  """),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
  """),format.raw/*28.3*/(""".container-fluid """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
      """),format.raw/*29.7*/("""padding: 60px 50px;
  """),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""


   """),format.raw/*33.4*/("""#parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*33.47*/("""{"""),format.raw/*33.48*/("""
    """),format.raw/*34.5*/("""float:left;
  """),format.raw/*35.3*/("""}"""),format.raw/*35.4*/("""
  """),format.raw/*36.3*/(""".child_div_1"""),format.raw/*36.15*/("""{"""),format.raw/*36.16*/("""
    """),format.raw/*37.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*39.3*/("""}"""),format.raw/*39.4*/("""
  """),format.raw/*40.3*/("""</style>

 
  </script>
</head>
<body>



<div class="jumbotron text-center">

<div id='parent_div_1'>

  <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px ;margin-right: 0%" >
<h5 style="color: black">Princing</h><br>
<h4 style="color: black">DHL = 100 &#x20B9</h4>
<h4 style="color: black">DTDC = 200 &#x20B9</h4>
<h4 style="color: black">AirPost = 300 &#x20B9</h4>
<h4></h4>
<h4></h4>
  </div>
  </div>
<form   action="/payment" method="GET" >

    <h4>These are the courier service provider corporate : </h4>
    <h3>"""),_display_(/*65.10*/message),format.raw/*65.17*/("""</h2>
    <h6 style="color: red">Please select courier service provider </h6>
    <select class="form-control"   name="shipmentType"  required="value" />
             <option value="DHL">DHL</option>
             <option value="DTDC">DTDC</option>
             <option value="AirPost">AirPost</option>
    </select>

    <h3>Your order number is : """),_display_(/*73.33*/orderId),format.raw/*73.40*/("""</h3>
    

    <br>
    <button class="btn btn-danger" value=""""),_display_(/*77.44*/orderId),format.raw/*77.51*/("""" name="orderId">Next</button>
   
  </form>
  
</div>



</body>


</html>"""))
      }
    }
  }

  def render(message:String,orderId:String): play.twirl.api.HtmlFormat.Appendable = apply(message,orderId)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,orderId) => apply(message,orderId)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object selectCourierService extends selectCourierService_Scope0.selectCourierService
              /*
                  -- GENERATED --
                  DATE: Sun Mar 26 16:05:18 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/selectCourierService.scala.html
                  HASH: 78885d9f84cd5aba181bb5cbe1b9d84a33acd8c7
                  MATRIX: 871->95|1001->130|1030->133|1591->666|1620->667|1654->674|1758->751|1786->752|1816->755|1853->764|1882->765|1916->772|1972->801|2000->802|2030->805|2075->822|2104->823|2138->830|2187->852|2215->853|2248->859|2319->902|2348->903|2380->908|2421->922|2449->923|2479->926|2519->938|2548->939|2580->944|2644->981|2672->982|2702->985|3280->1536|3308->1543|3684->1892|3712->1899|3803->1963|3831->1970
                  LINES: 30->5|35->5|38->8|49->19|49->19|50->20|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|63->33|63->33|63->33|64->34|65->35|65->35|66->36|66->36|66->36|67->37|69->39|69->39|70->40|95->65|95->65|103->73|103->73|107->77|107->77
                  -- GENERATED --
              */
          