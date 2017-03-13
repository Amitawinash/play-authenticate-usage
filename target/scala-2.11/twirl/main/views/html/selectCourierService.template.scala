
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
      padding: 100px 25px;

  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""
  """),format.raw/*25.3*/(""".bg-grey """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/("""
      """),format.raw/*26.7*/("""background-color: #f6f6f6;
  """),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
  """),format.raw/*28.3*/(""".container-fluid """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
      """),format.raw/*29.7*/("""padding: 60px 50px;
  """),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""
  """),format.raw/*31.3*/("""</style>

 
  </script>
</head>
<body>

<div class="jumbotron text-center">
  
<form  class="jumbotron text-center" action="/payment" method="GET" >
    <h3>These are the courier service provider corporate : </h3>
    <h1>"""),_display_(/*42.10*/message),format.raw/*42.17*/("""</h1>
    <input type="radio" name="book">
    <h1>Enter Order Destination details : </h1>
    <input type="text-center" class="form-control" style="color:#191c1a" name="reciverName" maxlength="25" placeholder="Reciver Name" required>
    <input type="text-center" class="form-control" style="color:#191c1a" name="state" maxlength="25" placeholder="State" required>
    <input type="text-center" class="form-control" style="color:#191c1a" name="area" maxlength="20" placeholder="Area" required>
    <input type="text-center" class="form-control" style="color:#191c1a" name="street" maxlength="20" placeholder="Street" required>
    <input type="text-center" class="form-control" style="color:#191c1a" name="houseNumber" maxlength="15" placeholder="House Number" required>
    <input type="text-center" class="form-control" style="color:#191c1a" name="contactNumber" maxlength="10" minlength="10" pattern="[0-9]+" placeholder="Contact Number" required>

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
                  DATE: Mon Mar 13 12:32:16 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/selectCourierService.scala.html
                  HASH: 771c571a1b2764d17954f629a05a34dc6998b4ce
                  MATRIX: 864->95|976->112|1005->115|1566->648|1595->649|1629->656|1732->732|1760->733|1790->736|1827->745|1856->746|1890->753|1946->782|1974->783|2004->786|2049->803|2078->804|2112->811|2161->833|2189->834|2219->837|2469->1060|2497->1067
                  LINES: 30->5|35->5|38->8|49->19|49->19|50->20|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|61->31|72->42|72->42
                  -- GENERATED --
              */
          