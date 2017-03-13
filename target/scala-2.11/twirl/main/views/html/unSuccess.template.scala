
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

class unSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""





"""),format.raw/*7.1*/("""<!doctype html>
<html ng-app>
<head>
  <meta charset="utf-8">
  <title>Restaurant Management</title>
  <script>
      document.write('<base href="' + document.location + '" />');
    </script>
  <link rel="stylesheet" href="style.css">
  <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css" rel="stylesheet">
  <script src="http://code.angularjs.org/1.1.5/angular.js"></script>
  <style type="text/css">
    
      #inputId"""),format.raw/*20.15*/("""{"""),format.raw/*20.16*/("""

        """),format.raw/*22.9*/("""margin-left: 22px;
      """),format.raw/*23.7*/("""}"""),format.raw/*23.8*/("""

      """),format.raw/*25.7*/("""#selectTagId"""),format.raw/*25.19*/("""{"""),format.raw/*25.20*/("""
        """),format.raw/*26.9*/("""margin-left: 22px;
      """),format.raw/*27.7*/("""}"""),format.raw/*27.8*/("""

      """),format.raw/*29.7*/("""#submitButtonId"""),format.raw/*29.22*/("""{"""),format.raw/*29.23*/("""
        """),format.raw/*30.9*/("""margin-left: 29%;
      """),format.raw/*31.7*/("""}"""),format.raw/*31.8*/("""

      """),format.raw/*33.7*/("""#h4Id"""),format.raw/*33.12*/("""{"""),format.raw/*33.13*/("""
        """),format.raw/*34.9*/("""margin-left: 22px;

      """),format.raw/*36.7*/("""}"""),format.raw/*36.8*/("""

  """),format.raw/*38.3*/("""</style>
</head>
<body  >
  <div class="well" style="margin-top: 2%; size: 50%; width: 55%; height: 50%; overflow: hidden; margin-right:  10%; margin-left: 10%;  float:left;  "   >
    <div  class="well" style="margin-top: 10px; width: 50%%; overflow: hidden; margin-left: 1%; background: #E74C3C ;  float:left; margin-right:5px;  ">
      <form class="form-search" style="margin-left: 10px;" action="/hereThere"> 
          

          <h1 style="color: #ECF0F1  " id="h1" >  """),_display_(/*46.52*/message),format.raw/*46.59*/("""   """),format.raw/*46.62*/("""</h1>


          <input id="submitButtonId"  type="submit" value="Back To Home Main Page" name="workerDetailButton" >
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
object unSuccess extends unSuccess_Scope0.unSuccess
              /*
                  -- GENERATED --
                  DATE: Mon Mar 13 19:24:24 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/unSuccess.scala.html
                  HASH: 7f56d3b18b430ea3b48d3a55f2f82014fdde885e
                  MATRIX: 753->1|865->18|897->24|1389->488|1418->489|1455->499|1507->524|1535->525|1570->533|1610->545|1639->546|1675->555|1727->580|1755->581|1790->589|1833->604|1862->605|1898->614|1949->638|1977->639|2012->647|2045->652|2074->653|2110->662|2163->688|2191->689|2222->693|2727->1171|2755->1178|2786->1181
                  LINES: 27->1|32->1|38->7|51->20|51->20|53->22|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|69->38|77->46|77->46|77->46
                  -- GENERATED --
              */
          