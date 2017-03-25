
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object unSuccessUser_Scope0 {
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

class unSuccessUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""





"""),format.raw/*7.1*/("""<!doctype html>
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
object unSuccessUser extends unSuccessUser_Scope0.unSuccessUser
              /*
                  -- GENERATED --
                  DATE: Fri Mar 24 17:37:21 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/unSuccessUser.scala.html
                  HASH: ac60c525589384893f11028cd99ab11f25f29554
                  MATRIX: 761->1|873->18|905->24|1386->477|1415->478|1452->488|1504->513|1532->514|1567->522|1607->534|1636->535|1672->544|1724->569|1752->570|1787->578|1830->593|1859->594|1895->603|1946->627|1974->628|2009->636|2042->641|2071->642|2107->651|2160->677|2188->678|2219->682|2724->1160|2752->1167|2783->1170
                  LINES: 27->1|32->1|38->7|51->20|51->20|53->22|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|69->38|77->46|77->46|77->46
                  -- GENERATED --
              */
          