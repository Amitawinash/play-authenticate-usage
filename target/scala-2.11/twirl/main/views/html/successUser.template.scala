
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object successUser_Scope0 {
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

class successUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    <div  class="well" style="margin-top: 10px; width: 50%%; overflow: hidden; margin-left: 1%; background: #CAA3CE  ;  float:left; margin-right:5px;  ">
      <form class="form-search" style="margin-left: 10px;" action="/hereThere"> 
          

          <h1  id="h1" >  """),_display_(/*46.28*/message),format.raw/*46.35*/("""   """),format.raw/*46.38*/("""</h1>

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
object successUser extends successUser_Scope0.successUser
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 21:26:26 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/successUser.scala.html
                  HASH: 314c7522f43301213a5842ceb41a989cf51a649d
                  MATRIX: 757->1|869->18|901->24|1382->477|1411->478|1448->488|1500->513|1528->514|1563->522|1603->534|1632->535|1668->544|1720->569|1748->570|1783->578|1826->593|1855->594|1891->603|1942->627|1970->628|2005->636|2038->641|2067->642|2103->651|2156->677|2184->678|2215->682|2697->1137|2725->1144|2756->1147
                  LINES: 27->1|32->1|38->7|51->20|51->20|53->22|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|69->38|77->46|77->46|77->46
                  -- GENERATED --
              */
          