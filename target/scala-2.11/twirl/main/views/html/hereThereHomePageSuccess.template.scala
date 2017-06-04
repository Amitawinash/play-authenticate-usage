
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hereThereHomePageSuccess_Scope0 {
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

     object hereThereHomePageSuccess_Scope1 {
import service.UserProvider

class hereThereHomePageSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider , message : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.49*/("""



"""),_display_(/*6.2*/main(userProvider, Messages("playauthenticate.index.title"))/*6.62*/ {_display_(Seq[Any](format.raw/*6.64*/("""
"""),format.raw/*7.1*/("""<style type="text/css">
        

  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*10.46*/("""{"""),format.raw/*10.47*/("""
    """),format.raw/*11.5*/("""float:left;
  """),format.raw/*12.3*/("""}"""),format.raw/*12.4*/("""
  """),format.raw/*13.3*/(""".child_div_1"""),format.raw/*13.15*/("""{"""),format.raw/*13.16*/("""
    """),format.raw/*14.5*/("""float:left;
    margin-right:15px;
  """),format.raw/*16.3*/("""}"""),format.raw/*16.4*/("""
"""),format.raw/*17.1*/("""</style>
<link rel="stylesheet" href=""""),_display_(/*18.31*/routes/*18.37*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*18.89*/("""">
<link href=""""),_display_(/*19.14*/routes/*19.20*/.Assets.versioned("css/main.css")),format.raw/*19.53*/("""" rel="stylesheet">
<body style="padding-top: 0%">
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
  <ul class="nav navbar-nav" style="background-color:#E0FDF7 ">
      <li class=""><a href="/">Home</a></li>
      <li class=""><a href="/restricted">Admin</a></li>
      
  </ul>
 </div>
      <h2 style="border-color: pink ">Welcome to <b style="color: #E57196">HereThere</b>  <small style="color: #D6C8CD">courier service</small></h2>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%;padding-top: 5px;padding-bottom: 5px">
  <div class="child_div_1" style="background-color: #8D8D93  ;border-radius: 10px;margin: 1px;">
            <form action="getAllOrderId" style="margin: 2px; position: all;">
              <h4 style="color: white"><b>"""),_display_(/*32.44*/message),format.raw/*32.51*/("""</b></h4>
            </form>
  </div>
        <div id='parent_div_1'>

        <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
             <form action="/newUser" style="margin: 25px; margin-bottom: 0%"  >
               <h5 style="box-shadow: currentColor;">New user</h5>
               <input class="form-control" type="email" name="userEmailId" placeholder="Enter User Email Id"  maxlength="29" required / >
               <input class="form-control" type="password" name="password" placeholder="Enter password" minlength="8" maxlength="10" required / >
               <input class="form-control" type="password" name="confirmPassword" placeholder="Enter Confirm Password" minlength="8" maxlength="10" required / >
               <h6 style="color: red">Sequrity Question</h6>
               <h6>In which year you were born ?</h6>
               
               <input class="form-control" type="password" name="sequrityAnswer" placeholder="Enter Answer" pattern="[0-9]+" minlength="4" maxlength="4" required / >
               <br>
               <input class="form-control" style="background-color: #9FB0F9  " type="submit" name="action" value="Register">
          </form>
          <div>
            <form action="/forgetPassword" style="margin: 25px; margin-top: 0%;margin-bottom: 0%">
                 <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Forget Password">
            </form>
          </div>
          <div>
            <form action="/changePassword" style="margin: 25px; margin-top: 0%">
                 <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Change Password">
            </form>
          </div>
          </div>
          <div class="child_div_1" style="background-color: #BFD3F0 ;border-radius: 10px ">
           <form action="/sendSomething"  style="margin: 25px;"  method="POST">
            <h5 style="box-shadow: currentColor; ">Login</h5>
            <input class="form-control" type="email" name="emailId" placeholder="Sender email Id"   required/  >
            <input class="form-control" type="password" name="password" placeholder="Enter password" minlength="8" maxlength="10" required / >
            <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="" value="Send" >
          </form>
         

          </div>
          <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
             <form action="/orderStatus" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Track Your Order</h5>
               <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Order Number"  maxlength="24" required / >
               <br>
               <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Track">
               <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action"  value="Estimated Date">
               
          </form>
          <div class="child_div_1" style="background-color: #BFD3F0;border-radius: 10px;margin: 15px;">
             <form action="getAllOrderId" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Find Order Number</h5>
               
               <input class="form-control" type="email" name="userEmailId" placeholder="Enter User Email Id"  maxlength="29" required / >
              
               <input class="form-control" style="background-color: #F3EC97 ;" type="submit" name="action"  value="Get all order Id">
          </form>
          </div>
          </div>
           
        </div>
      </div>
     
</body>
""")))}))
      }
    }
  }

  def render(userProvider:UserProvider,message:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,message)

  def f:((UserProvider,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,message) => apply(userProvider,message)

  def ref: this.type = this

}


}
}

/**/
object hereThereHomePageSuccess extends hereThereHomePageSuccess_Scope0.hereThereHomePageSuccess_Scope1.hereThereHomePageSuccess
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 04:40:24 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/hereThereHomePageSuccess.scala.html
                  HASH: 224b7781872b89be3ad3da25708373b2f8018b0f
                  MATRIX: 871->30|1013->77|1043->82|1111->142|1150->144|1177->145|1284->224|1313->225|1345->230|1386->244|1414->245|1444->248|1484->260|1513->261|1545->266|1609->303|1637->304|1665->305|1731->344|1746->350|1819->402|1862->418|1877->424|1931->457|2766->1265|2794->1272
                  LINES: 30->2|35->2|39->6|39->6|39->6|40->7|43->10|43->10|44->11|45->12|45->12|46->13|46->13|46->13|47->14|49->16|49->16|50->17|51->18|51->18|51->18|52->19|52->19|52->19|65->32|65->32
                  -- GENERATED --
              */
          