
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object payment_Scope0 {
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

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(orderId: String , cost: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.34*/("""


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
      padding: 200px 25px;

  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""
  """),format.raw/*25.3*/(""".bg-grey """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/("""
      """),format.raw/*26.7*/("""background-color: #f6f6f6;
  """),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
  """),format.raw/*28.3*/(""".container-fluid """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
      """),format.raw/*29.7*/("""padding: 30px 50px;
  """),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""


  """),format.raw/*33.3*/("""</style>

 
  </script>
</head>
<body>

<div class="jumbotron text-center">
 
  <form action="/transactions"> 
  <h4>Total cost for order id """),_display_(/*43.32*/orderId),format.raw/*43.39*/(""" """),format.raw/*43.40*/("""</h4>
  
  <h1>"""),_display_(/*45.8*/cost),format.raw/*45.12*/(""" """),format.raw/*45.13*/("""&#x20B9</h1>
  <h4>accept terms and conditions</h4>
  <br>
  <input type="checkbox" name="orderId" value=""""),_display_(/*48.49*/orderId),format.raw/*48.56*/("""" required/>
  <br>
  <button class="btn btn-danger" name="action" data-value3="value3" data-value="value2" value="Make Payment">Make Payment</button>
  <button  class="btn btn-danger" name="action" data-value3="value3" data-value="value2" value="Cancle Order">Cancle Order</button> 
  
  </form>  
</div>



</body>


</html>"""))
      }
    }
  }

  def render(orderId:String,cost:String): play.twirl.api.HtmlFormat.Appendable = apply(orderId,cost)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (orderId,cost) => apply(orderId,cost)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object payment extends payment_Scope0.payment
              /*
                  -- GENERATED --
                  DATE: Fri Mar 24 22:24:32 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/payment.scala.html
                  HASH: 339fdbdb5b5b4c0be8ca04aacf01cea07093eb2d
                  MATRIX: 845->95|972->127|1001->130|1562->663|1591->664|1625->671|1728->747|1756->748|1786->751|1823->760|1852->761|1886->768|1942->797|1970->798|2000->801|2045->818|2074->819|2108->826|2157->848|2185->849|2217->854|2386->996|2414->1003|2443->1004|2485->1020|2510->1024|2539->1025|2673->1132|2701->1139
                  LINES: 30->5|35->5|38->8|49->19|49->19|50->20|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|63->33|73->43|73->43|73->43|75->45|75->45|75->45|78->48|78->48
                  -- GENERATED --
              */
          