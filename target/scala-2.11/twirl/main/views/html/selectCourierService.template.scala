
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

class selectCourierService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

  <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
<h5 style="color: black">Princing</h><br>
<h4 style="color: black">DHL = 100 &#x20B9</h4>
<h4 style="color: black">DTDC = 200 &#x20B9</h4>
<h4 style="color: black">AirPost = 300 &#x20B9</h4>
<h4></h4>
<h4></h4>
  </div>
  </div>
<form  class="jumbotron text-center" action="/payment" method="GET" >
    <h2>These are the courier service provider corporate : </h2>
    <h1>"""),_display_(/*64.10*/message),format.raw/*64.17*/("""</h1>
    
    
    <input type="text-center" class="form-control" style="color:#191c1a" name="serviceProvider" maxlength="25" placeholder="Enter Service provider Name" required />
    

    <br>
    <input class="btn btn-danger" type="submit" name="submitDetails" placeholder="payment" value="Submit Details">
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
object selectCourierService extends selectCourierService_Scope0.selectCourierService
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 01:41:24 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/selectCourierService.scala.html
                  HASH: 95e4b6dee4e5f09b86a48ffc14f16a0b4e5cee49
                  MATRIX: 864->95|976->112|1005->115|1566->648|1595->649|1629->656|1733->733|1761->734|1791->737|1828->746|1857->747|1891->754|1947->783|1975->784|2005->787|2050->804|2079->805|2113->812|2162->834|2190->835|2223->841|2294->884|2323->885|2355->890|2396->904|2424->905|2454->908|2494->920|2523->921|2555->926|2619->963|2647->964|2677->967|3266->1529|3294->1536
                  LINES: 30->5|35->5|38->8|49->19|49->19|50->20|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|63->33|63->33|63->33|64->34|65->35|65->35|66->36|66->36|66->36|67->37|69->39|69->39|70->40|94->64|94->64
                  -- GENERATED --
              */
          