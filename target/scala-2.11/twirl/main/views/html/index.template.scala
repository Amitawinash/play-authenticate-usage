
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import service.UserProvider

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserProvider,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userProvider: UserProvider , msg : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.45*/("""



"""),_display_(/*6.2*/main(userProvider, Messages("playauthenticate.index.title"))/*6.62*/ {_display_(Seq[Any](format.raw/*6.64*/("""
      """),format.raw/*7.7*/("""<style type="text/css">
        

  #parent_div_1, #parent_div_2, #parent_div_3"""),format.raw/*10.46*/("""{"""),format.raw/*10.47*/("""
    """),format.raw/*11.5*/("""float:left;
  """),format.raw/*12.3*/("""}"""),format.raw/*12.4*/("""
  """),format.raw/*13.3*/(""".child_div_1"""),format.raw/*13.15*/("""{"""),format.raw/*13.16*/("""
    """),format.raw/*14.5*/("""float:left;
    margin-right:55px;
  """),format.raw/*16.3*/("""}"""),format.raw/*16.4*/("""
"""),format.raw/*17.1*/("""</style>
      <h2 style="border-color: pink ">"""),_display_(/*18.40*/msg),format.raw/*18.43*/(""" """),format.raw/*18.44*/("""Welcome to <b style="color: #E57196">HereThere</b>  <small style="color: #D6C8CD">courier service</small></h2>
  <div class="jumbotron" id='parent_div_1' style="background-color: #FAEEAF ;width: 100%;">
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
            <input class="form-control" type="email" name="emailId" placeholder="Sender email Id"  required /  >
            <input class="form-control" type="password" name="password" placeholder="Enter password" minlength="8" maxlength="10" required  / >
            <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="" value="Send" >
          </form>
          </div>
          <div class="child_div_1" style="background-color: #E0FDF7 ;border-radius: 10px " >
             <form action="/orderStatus" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Track Your Order</h5>
               <input class="form-control" type="text-center" name="orderNumber" placeholder="Enter Order Number"  maxlength="24"  required  / >
               <br>
               <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action" value="Track" >
               <input class="form-control" style="background-color: #F3EC97  "  type="submit" name="action"  value="Estimated Date">
               
          </form>
          <div class="child_div_1" style="background-color: #BFD3F0;border-radius: 10px;margin: 15px;">
             <form action="getAllOrderId" style="margin: 25px;"  >
               <h5 style="box-shadow: currentColor;">Find order Number</h5>
               
               <input class="form-control" type="email" name="userEmailId" placeholder="Enter User Email Id"  maxlength="29" required / >
              
               <input class="form-control" style="background-color: #F3EC97  " type="submit" name="action"  value="Get all order Id">
          </form>
          </div>
          </div>
        </div>
      </div>
     
    """)))}),format.raw/*76.6*/("""
"""))
      }
    }
  }

  def render(userProvider:UserProvider,msg:String): play.twirl.api.HtmlFormat.Appendable = apply(userProvider,msg)

  def f:((UserProvider,String) => play.twirl.api.HtmlFormat.Appendable) = (userProvider,msg) => apply(userProvider,msg)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Sun Apr 16 02:58:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/index.scala.html
                  HASH: a344d5c48983a594a8da5faa7b8aa348e94c4c29
                  MATRIX: 814->30|952->73|982->78|1050->138|1089->140|1122->147|1229->226|1258->227|1290->232|1331->246|1359->247|1389->250|1429->262|1458->263|1490->268|1554->305|1582->306|1610->307|1685->355|1709->358|1738->359|5691->4282
                  LINES: 30->2|35->2|39->6|39->6|39->6|40->7|43->10|43->10|44->11|45->12|45->12|46->13|46->13|46->13|47->14|49->16|49->16|50->17|51->18|51->18|51->18|109->76
                  -- GENERATED --
              */
          