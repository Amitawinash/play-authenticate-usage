
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

class selectCourierService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfcourier: List[String] , orderId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
      """),format.raw/*2.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
 <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="This page is for Admin">
        <meta name="author" content="Amit">

        <script type="text/javascript" src=""""),_display_(/*8.46*/routes/*8.52*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*9.46*/routes/*9.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*9.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*10.46*/routes/*10.52*/.Application.jsRoutes),format.raw/*10.73*/("""" defer="defer"></script>
<style type="text/css">
  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*12.46*/("""{"""),format.raw/*12.47*/("""
    """),format.raw/*13.5*/("""float:left;
  """),format.raw/*14.3*/("""}"""),format.raw/*14.4*/("""
  """),format.raw/*15.3*/(""".child_div_1"""),format.raw/*15.15*/("""{"""),format.raw/*15.16*/("""
    """),format.raw/*16.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*18.3*/("""}"""),format.raw/*18.4*/("""
"""),format.raw/*19.1*/("""</style>
<link rel="stylesheet" href=""""),_display_(/*20.31*/routes/*20.37*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*20.89*/("""">
<link href=""""),_display_(/*21.14*/routes/*21.20*/.Assets.versioned("css/main.css")),format.raw/*21.53*/("""" rel="stylesheet">
      
     
                   
<body style="background-color: #f4511e">
 <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/">Home</a></li>
                        
                        
                    </ul>
                        
                </div>

  <div class="parent_div_1">
    <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px ;margin-right: 0%">
        <h5 style="color: black">Princing</h><br>
        <h4 style="color: black">DHL = 100 &#x20B9</h4>
        <h4 style="color: black">DTDC = 200 &#x20B9</h4>
        <h4 style="color: black">AirPost = 300 &#x20B9</h4>
        <h4></h4>
        <h4></h4>
    </div>
        <div class="child_div_1" style="margin-left: 15%;background-color: skyblue">
        <center>
          <form   action="/payment" method="GET" >

            <h4>These are the courier service provider corporate : </h4>
           <table id="list" border="1px">
        <thead>
          <tr>
            
            <td>courier service provider</td>
          </tr>
        </thead>

        <tbody >

          """),_display_(/*60.12*/for(listOfOrder <- listOfcourier) yield /*60.45*/ {_display_(Seq[Any](format.raw/*60.47*/("""
          """),format.raw/*61.11*/("""<center>
            <tr>
              <td>"""),_display_(/*63.20*/listOfOrder),format.raw/*63.31*/("""</td> 
            </tr>
            </center>
          """)))}),format.raw/*66.12*/("""
        """),format.raw/*67.9*/("""</tbody>
      </table>

            <h6 style="color: red">Please select courier service provider </h6>
            <select class="btn btn-danger" name="shipmentType"  required="value" />
              <option value="DHL">DHL</option>
              <option value="DTDC">DTDC</option>
              <option value="AirPost">AirPost</option>
            </select>

            <h3>Your order number is : """),_display_(/*77.41*/orderId),format.raw/*77.48*/("""</h3>
            

            <br>
            <button class="btn btn-danger" value=""""),_display_(/*81.52*/orderId),format.raw/*81.59*/("""" name="orderId">Next</button>
           
          </form>
          </center>

        </div>

            <br/>
            <br/>
            
            <br />
            <!-- Example row of columns -->
            <div class="row">
              <div class="col-xs-6 col-sm-4">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
              </div>
              <div class="col-xs-6 col-sm-4">
                <br>
                <br>
                <br>
             </div>
              <div class="col-xs-6 col-sm-4">
                <br>
                <br>
                <br>
              </div>
            </div>
</body>"""))
      }
    }
  }

  def render(listOfcourier:List[String],orderId:String): play.twirl.api.HtmlFormat.Appendable = apply(listOfcourier,orderId)

  def f:((List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (listOfcourier,orderId) => apply(listOfcourier,orderId)

  def ref: this.type = this

}


}

/**/
object selectCourierService extends selectCourierService_Scope0.selectCourierService
              /*
                  -- GENERATED --
                  DATE: Thu Apr 06 19:02:50 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/selectCourierService.scala.html
                  HASH: cd4ff396e66d66889a2bc426fe7abf42b268dda5
                  MATRIX: 788->1|930->48|963->55|1321->387|1335->393|1396->434|1479->491|1493->497|1564->547|1648->604|1663->610|1705->631|1828->726|1857->727|1889->732|1930->746|1958->747|1988->750|2028->762|2057->763|2089->768|2153->805|2181->806|2209->807|2275->846|2290->852|2363->904|2406->920|2421->926|2475->959|3811->2268|3860->2301|3900->2303|3939->2314|4011->2359|4043->2370|4132->2428|4168->2437|4598->2840|4626->2847|4741->2935|4769->2942
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|44->13|45->14|45->14|46->15|46->15|46->15|47->16|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|91->60|91->60|91->60|92->61|94->63|94->63|97->66|98->67|108->77|108->77|112->81|112->81
                  -- GENERATED --
              */
          