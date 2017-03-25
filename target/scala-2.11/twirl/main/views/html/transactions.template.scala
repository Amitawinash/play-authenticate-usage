
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transactions_Scope0 {
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

class transactions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*7.2*/(status: String , fromPincode: String , toPincode: String , shipmentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.83*/("""


"""),format.raw/*10.1*/("""<!DOCTYPE html>
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
  .jumbotron """),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""
      """),format.raw/*22.7*/("""background-color: #f4511e;
      color: #fff;
      padding: 100px 25px ;

  """),format.raw/*26.3*/("""}"""),format.raw/*26.4*/("""
  """),format.raw/*27.3*/(""".bg-grey """),format.raw/*27.12*/("""{"""),format.raw/*27.13*/("""
      """),format.raw/*28.7*/("""background-color: #f6f6f6;
  """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
   """),format.raw/*30.4*/("""h4"""),format.raw/*30.6*/("""{"""),format.raw/*30.7*/("""
    """),format.raw/*31.5*/("""color: black;
  """),format.raw/*32.3*/("""}"""),format.raw/*32.4*/("""
   
  """),format.raw/*34.3*/(""".container-fluid """),format.raw/*34.20*/("""{"""),format.raw/*34.21*/("""
      """),format.raw/*35.7*/("""padding: 60px 50px;
  """),format.raw/*36.3*/("""}"""),format.raw/*36.4*/("""


   """),format.raw/*39.4*/("""#parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*39.47*/("""{"""),format.raw/*39.48*/("""
    """),format.raw/*40.5*/("""float:left;
  """),format.raw/*41.3*/("""}"""),format.raw/*41.4*/("""
  """),format.raw/*42.3*/(""".child_div_1"""),format.raw/*42.15*/("""{"""),format.raw/*42.16*/("""
    """),format.raw/*43.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*45.3*/("""}"""),format.raw/*45.4*/("""
  """),format.raw/*46.3*/("""</style>

 
  </script>
</head>
<body>



<div class="jumbotron text-center">

<div id='parent_div_1'>

  <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
  <form action="/hereThere">
    <h1 style="color: black">Transactions Details</h1><br>
    
<h4>Status  of order :     Payment has done</h4>
<h4>Sender Pincode   :    """),_display_(/*64.28*/fromPincode),format.raw/*64.39*/("""</h4>
<h4>Reciver Pincode  :   """),_display_(/*65.27*/toPincode),format.raw/*65.36*/("""</h4>
<h4>Shipment Type :    """),_display_(/*66.25*/shipmentType),format.raw/*66.37*/("""</h4>
    <button class="btn btn-danger" value="value" name="submitDetails">HomePage</button>
   
  </form>
  
</div>



</body>


</html>"""))
      }
    }
  }

  def render(status:String,fromPincode:String,toPincode:String,shipmentType:String): play.twirl.api.HtmlFormat.Appendable = apply(status,fromPincode,toPincode,shipmentType)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (status,fromPincode,toPincode,shipmentType) => apply(status,fromPincode,toPincode,shipmentType)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object transactions extends transactions_Scope0.transactions
              /*
                  -- GENERATED --
                  DATE: Fri Mar 24 23:53:00 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/transactions.scala.html
                  HASH: 39a47e499972094365f88b1a51712594a5358d56
                  MATRIX: 869->97|1045->178|1075->181|1636->714|1665->715|1699->722|1803->799|1831->800|1861->803|1898->812|1927->813|1961->820|2017->849|2045->850|2076->854|2105->856|2133->857|2165->862|2208->878|2236->879|2270->886|2315->903|2344->904|2378->911|2427->933|2455->934|2488->940|2559->983|2588->984|2620->989|2661->1003|2689->1004|2719->1007|2759->1019|2788->1020|2820->1025|2884->1062|2912->1063|2942->1066|3327->1424|3359->1435|3418->1467|3448->1476|3505->1506|3538->1518
                  LINES: 30->7|35->7|38->10|49->21|49->21|50->22|54->26|54->26|55->27|55->27|55->27|56->28|57->29|57->29|58->30|58->30|58->30|59->31|60->32|60->32|62->34|62->34|62->34|63->35|64->36|64->36|67->39|67->39|67->39|68->40|69->41|69->41|70->42|70->42|70->42|71->43|73->45|73->45|74->46|92->64|92->64|93->65|93->65|94->66|94->66
                  -- GENERATED --
              */
          