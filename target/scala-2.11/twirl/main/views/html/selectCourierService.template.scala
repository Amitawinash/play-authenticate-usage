
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

class selectCourierService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String , orderId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
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
      
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
                   
<body>
 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/">Home</a></li>
                        <li class=""><a href="/restricted">Restricted page</a></li>
                        <li class=""><a href="/signup">Sign up</a></li>
                    </ul>
                        <a href="/login" class=" navbar-right btn btn-default navbar-btn ">Log in</a>
                </div>

                <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px ;margin-right: 0%" >
<h5 style="color: black">Princing</h><br>
<h4 style="color: black">DHL = 100 &#x20B9</h4>
<h4 style="color: black">DTDC = 200 &#x20B9</h4>
<h4 style="color: black">AirPost = 300 &#x20B9</h4>
<h4></h4>
<h4></h4>
  </div>
  </div>
<form   action="/payment" method="GET" >

    <h4>These are the courier service provider corporate : </h4>
    <h3 id="message"  >  """),_display_(/*47.27*/message),format.raw/*47.34*/(""" """),format.raw/*47.35*/("""</h2>
    <h6 style="color: red">Please select courier service provider </h6>
    <select class="form-control"   name="shipmentType"  required="value" />
             <option value="DHL">DHL</option>
             <option value="DTDC">DTDC</option>
             <option value="AirPost">AirPost</option>
    </select>

    <h3>Your order number is : """),_display_(/*55.33*/orderId),format.raw/*55.40*/("""</h3>
    

    <br>
    <button class="btn btn-danger" value=""""),_display_(/*59.44*/orderId),format.raw/*59.51*/("""" name="orderId">Next</button>
   
  </form>
  
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

  def render(message:String,orderId:String): play.twirl.api.HtmlFormat.Appendable = apply(message,orderId)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,orderId) => apply(message,orderId)

  def ref: this.type = this

}


}

/**/
object selectCourierService extends selectCourierService_Scope0.selectCourierService
              /*
                  -- GENERATED --
                  DATE: Sat Apr 01 14:16:04 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/selectCourierService.scala.html
                  HASH: 8ce3b3245d563c501cb5db03b4b87e46c5c055f6
                  MATRIX: 782->1|912->36|945->43|1303->375|1317->381|1378->422|1461->479|1475->485|1546->535|1630->592|1645->598|1687->619|1810->714|1839->715|1871->720|1912->734|1940->735|1970->738|2010->750|2039->751|2071->756|2135->793|2163->794|2191->795|2257->834|2272->840|2345->892|2388->908|2403->914|2457->947|3595->2058|3623->2065|3652->2066|4028->2415|4056->2422|4147->2486|4175->2493
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|44->13|45->14|45->14|46->15|46->15|46->15|47->16|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|78->47|78->47|78->47|86->55|86->55|90->59|90->59
                  -- GENERATED --
              */
          