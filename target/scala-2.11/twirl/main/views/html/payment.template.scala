
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

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""


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
 
  <form action="/orderSubmitDetail"> 
  <h2>"""),_display_(/*43.8*/message),format.raw/*43.15*/("""</h2>
<h1>Enter Card Details</h1>
  <input type="text-center" class="form-control" style="color:#191c1a" name="price" size="5" placeholder="Price" required>  

  <input type="text-center" class="form-control" style="color:#191c1a" name="cardNumber" size="5" placeholder="Card Number" required> 

   <input type="text-center" class="form-control" style="color:#191c1a" name="cardNumber" size="5" placeholder="Card Holder Name" required> 

    <input type="text-center" class="form-control" style="color:#191c1a" name="cardNumber" size="5" placeholder="CCV" required> 
     <input type="text-center" class="form-control" style="color:#191c1a" name="cardNumber" size="5" placeholder="Valid Through" required> 

      <input type="text-center" class="form-control" style="color:#191c1a" name="cardNumber" size="5" placeholder="Visa/master/Rupee" required> 

  <input type="submit" name="Button" value="Make Payment" style="color: #8c449f">     
  
  </form>  
</div>



</body>


</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

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
                  DATE: Mon Mar 13 17:27:58 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/payment.scala.html
                  HASH: 62918cab7777a9bb8af0ba53f25a38814e095ce1
                  MATRIX: 838->95|950->112|979->115|1540->648|1569->649|1603->656|1706->732|1734->733|1764->736|1801->745|1830->746|1864->753|1920->782|1948->783|1978->786|2023->803|2052->804|2086->811|2135->833|2163->834|2195->839|2344->962|2372->969
                  LINES: 30->5|35->5|38->8|49->19|49->19|50->20|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|63->33|73->43|73->43
                  -- GENERATED --
              */
          