
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object changePassword_Scope0 {
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

class changePassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
      """),format.raw/*2.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<!doctype html>
<html ng-app>
<head>
  <meta charset="utf-8">
  <title>Here There</title>
  <script>
      document.write('<base href="' + document.location + '" />');
    </script>
  <link rel="stylesheet" href="style.css">
  <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css" rel="stylesheet">
  <script src="http://code.angularjs.org/1.1.5/angular.js"></script>
  <style type="text/css">
    
      #inputId"""),format.raw/*16.15*/("""{"""),format.raw/*16.16*/("""

        """),format.raw/*18.9*/("""margin-left: 22px;
      """),format.raw/*19.7*/("""}"""),format.raw/*19.8*/("""

      """),format.raw/*21.7*/("""#selectTagId"""),format.raw/*21.19*/("""{"""),format.raw/*21.20*/("""
        """),format.raw/*22.9*/("""margin-left: 22px;
      """),format.raw/*23.7*/("""}"""),format.raw/*23.8*/("""

      """),format.raw/*25.7*/("""#submitButtonId"""),format.raw/*25.22*/("""{"""),format.raw/*25.23*/("""
        """),format.raw/*26.9*/("""margin-left: 29%;
      """),format.raw/*27.7*/("""}"""),format.raw/*27.8*/("""

      """),format.raw/*29.7*/("""#h4Id"""),format.raw/*29.12*/("""{"""),format.raw/*29.13*/("""
        """),format.raw/*30.9*/("""margin-left: 22px;

      """),format.raw/*32.7*/("""}"""),format.raw/*32.8*/("""

  """),format.raw/*34.3*/("""</style>
</head>
<body  >
  <div class="well" style="margin-top: 2%; size: 50%; width: 55%; height: 50%; overflow: hidden; margin-right:  10%; margin-left: 10%;  float:left;  "   >
    <div  class="well" style="margin-top: 10px; width: 50%%; overflow: hidden; margin-left: 1%; background: white ;  float:left; margin-right:5px;  ">
      <form class="form-search" style="margin-left: 10px;" action="/hereThere"> 
          

          <h1 style="color: #ECF0F1  " id="h1" >  """),_display_(/*42.52*/message),format.raw/*42.59*/("""   """),format.raw/*42.62*/("""</h1>

       
      <input   type="password" style="color:#191c1a" name="employeeNewPin"  placeholder="Enter Employee new Pin" required pattern="[0-9]+" minlength="5"   maxlength="5"><br>
      <input   type="password"  style="color:#191c1a" name="employeeConformPin"  placeholder="Enter Employee conform Pin" required pattern="[0-9]+" minlength="5"   maxlength="5"><br>
     <input  class="btn btn-danger" style="background-color: lightblue"  type="submit" value="Change" name="back" style="color: #8c449f">
      </form>
    </div>


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

/**/
object changePassword extends changePassword_Scope0.changePassword
              /*
                  -- GENERATED --
                  DATE: Sat Mar 25 10:33:50 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/changePassword.scala.html
                  HASH: 5c2b2aa4ea71ba63a0c641b8caa8e9c69f35b50f
                  MATRIX: 763->1|875->18|908->25|1463->552|1492->553|1529->563|1581->588|1609->589|1644->597|1684->609|1713->610|1749->619|1801->644|1829->645|1864->653|1907->668|1936->669|1972->678|2023->702|2051->703|2086->711|2119->716|2148->717|2184->726|2237->752|2265->753|2296->757|2799->1233|2827->1240|2858->1243
                  LINES: 27->1|32->1|33->2|47->16|47->16|49->18|50->19|50->19|52->21|52->21|52->21|53->22|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|63->32|63->32|65->34|73->42|73->42|73->42
                  -- GENERATED --
              */
          