
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object getAllOrderId_Scope0 {
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

class getAllOrderId extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userEmailId: String , numberOfOrders: String , listOfOrders: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""
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
  <script type="text/javascript">
    

    
  </script>
</head>
<body  >
  <div class="well" style="margin-top: 2%; size: 50%; width: 55%; height: 50%; overflow: hidden; margin-right:  10%; margin-left: 10%;  float:left;  "   >
    <div  class="well" style="margin-top: 10px; width: 50%%; overflow: hidden; margin-left: 1%; background: white ;  float:left; margin-right:5px;  ">
      <form class="form-search" style="margin-left: 10px;" action="/hereThere"> 
          

          <h3 style="color: black  " id="h1" > User with email id " """),_display_(/*47.70*/userEmailId),format.raw/*47.81*/(""" """),format.raw/*47.82*/("""" has Ordered """),_display_(/*47.97*/numberOfOrders),format.raw/*47.111*/("""  """),format.raw/*47.113*/("""orders </h3>
          <h4>They are :- </h4>
          <div id="orderTable">
			<table id="list" border="1px">
				<thead>
					<tr>
						<td>Order Id</td>
						<td>Tracking link</td>
					</tr>
				</thead>

				<tbody>
					"""),_display_(/*59.7*/for(listOfOrder <- listOfOrders) yield /*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""
						"""),format.raw/*60.7*/("""<tr>
							<td>"""),_display_(/*61.13*/listOfOrder),format.raw/*61.24*/("""</td>
							<td><a href="orderStatus?orderNumber="""),_display_(/*62.46*/listOfOrder),format.raw/*62.57*/("""&action=Track">"""),_display_(/*62.73*/listOfOrder),format.raw/*62.84*/("""</td>
	
						</tr>
					""")))}),format.raw/*65.7*/("""
				"""),format.raw/*66.5*/("""</tbody>
			</table>
		</div>

       
      
     <input  class="btn btn-danger" style="background-color: red"  type="submit" value="Back" name="back" style="color: red">
      </form>
    </div>


 </div>
</body>
</html>"""))
      }
    }
  }

  def render(userEmailId:String,numberOfOrders:String,listOfOrders:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(userEmailId,numberOfOrders,listOfOrders)

  def f:((String,String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (userEmailId,numberOfOrders,listOfOrders) => apply(userEmailId,numberOfOrders,listOfOrders)

  def ref: this.type = this

}


}

/**/
object getAllOrderId extends getAllOrderId_Scope0.getAllOrderId
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 20:55:33 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/getAllOrderId.scala.html
                  HASH: 0378a8454de4f584f7f391c2bfee968112aca9f8
                  MATRIX: 781->1|951->76|984->83|1539->610|1568->611|1605->621|1657->646|1685->647|1720->655|1760->667|1789->668|1825->677|1877->702|1905->703|1940->711|1983->726|2012->727|2048->736|2099->760|2127->761|2162->769|2195->774|2224->775|2260->784|2313->810|2341->811|2372->815|2950->1366|2982->1377|3011->1378|3053->1393|3089->1407|3120->1409|3375->1638|3423->1670|3463->1672|3497->1679|3541->1696|3573->1707|3651->1758|3683->1769|3726->1785|3758->1796|3814->1822|3846->1827
                  LINES: 27->1|32->1|33->2|47->16|47->16|49->18|50->19|50->19|52->21|52->21|52->21|53->22|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|63->32|63->32|65->34|78->47|78->47|78->47|78->47|78->47|78->47|90->59|90->59|90->59|91->60|92->61|92->61|93->62|93->62|93->62|93->62|96->65|97->66
                  -- GENERATED --
              */
          