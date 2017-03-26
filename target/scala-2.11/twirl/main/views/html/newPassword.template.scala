
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newPassword_Scope0 {
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

class newPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
      """),format.raw/*2.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="This page is for User">
        <meta name="author" content="Amit">

        <script type="text/javascript" src=""""),_display_(/*8.46*/routes/*8.52*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*9.46*/routes/*9.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*9.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*10.46*/routes/*10.52*/.Application.jsRoutes),format.raw/*10.73*/("""" defer="defer"></script>
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*11.97*/("""">
        <link href=""""),_display_(/*12.22*/routes/*12.28*/.Assets.versioned("css/main.css")),format.raw/*12.61*/("""" rel="stylesheet">
</head>
<style type="text/css">
        

  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*17.46*/("""{"""),format.raw/*17.47*/("""
    """),format.raw/*18.5*/("""float:left;
  """),format.raw/*19.3*/("""}"""),format.raw/*19.4*/("""
  """),format.raw/*20.3*/(""".child_div_1"""),format.raw/*20.15*/("""{"""),format.raw/*20.16*/("""
    """),format.raw/*21.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*23.3*/("""}"""),format.raw/*23.4*/("""
"""),format.raw/*24.1*/("""</style>
      <h2 style="border-color: pink ">Welcome to HereThere courier service</h2>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%">
      <div>
        <div id='parent_div_1'>

        <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
          <form action="/newUser" style="margin: 25px; margin-bottom: 0%"  >
            <h2>Recover Password</h2>
            <input class="form-control" type="email" name="userEmailId" placeholder="Enter your email Id"  maxlength="29" required  >
            <input class="form-control" type="password" name="oldPassword" placeholder="Enter old password"  maxlength="24">
            <h3>Or</h3>
            <h6>In which Year you were born ?</h6>
            <input class="form-control" type="password" name="sequrityAnswer" placeholder="Enter Answer"  maxlength="4">
            <input class="form-control" type="submit" name="action" value="Recover Password">
          </form>
          
        </div>
          
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
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object newPassword extends newPassword_Scope0.newPassword
              /*
                  -- GENERATED --
                  DATE: Sun Mar 26 04:33:36 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/newPassword.scala.html
                  HASH: cf169c7d0a549a1f68268b62686af79d25f1aa3b
                  MATRIX: 757->1|869->18|902->25|1236->333|1250->339|1311->380|1394->437|1408->443|1479->493|1563->550|1578->556|1620->577|1711->641|1726->647|1799->699|1850->723|1865->729|1919->762|2054->869|2083->870|2115->875|2156->889|2184->890|2214->893|2254->905|2283->906|2315->911|2379->948|2407->949|2435->950
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|48->17|48->17|49->18|50->19|50->19|51->20|51->20|51->20|52->21|54->23|54->23|55->24
                  -- GENERATED --
              */
          