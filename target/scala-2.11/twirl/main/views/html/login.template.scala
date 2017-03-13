
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

     object login_Scope1 {
import service.UserProvider

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[com.feth.play.module.pa.PlayAuthenticate,UserProvider,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, userProvider: UserProvider, loginForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import com.feth.play.module.pa.views.html._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.102*/("""

"""),format.raw/*5.75*/("""
"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main(userProvider, Messages("playauthenticate.login.title"),"login")/*8.70*/ {_display_(Seq[Any](format.raw/*8.72*/("""

  """),format.raw/*10.3*/("""<div class="row">
    <div class="col-xs-6 col-sm-4">
      <h1>"""),_display_(/*12.12*/Messages("playauthenticate.login.title")),format.raw/*12.52*/("""</h1>
    </div>
  </div>

  <div id="login" class="row">

    <div class="col-xs-6 col-sm-4">
      """),format.raw/*19.43*/("""
    	"""),_display_(/*20.7*/helper/*20.13*/.form(routes.Application.doLogin, 'class -> "form-horizontal", 'role -> "form")/*20.92*/ {_display_(Seq[Any](format.raw/*20.94*/("""

        """),_display_(/*22.10*/if(loginForm.hasGlobalErrors)/*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""
          	"""),format.raw/*23.12*/("""<p class="alert alert-danger">
	          """),_display_(/*24.13*/loginForm/*24.22*/.globalError.message),format.raw/*24.42*/("""
	     	"""),format.raw/*25.8*/("""</p>
        """)))}),format.raw/*26.10*/("""

        """),_display_(/*28.10*/_emailPartial(loginForm)),format.raw/*28.34*/("""

        """),_display_(/*30.10*/inputPassword(
          loginForm("password"),
          '_showConstraints -> false,
          '_label -> Messages("playauthenticate.login.password.placeholder")
        )),format.raw/*34.10*/("""

            """),format.raw/*36.13*/("""<button type="submit" class="btn btn-default">"""),_display_(/*36.60*/Messages("playauthenticate.login.now")),format.raw/*36.98*/("""</button>

        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(/*38.158*/Messages("playauthenticate.login.forgot.password")),format.raw/*38.208*/("""</a>

    	""")))}),format.raw/*40.7*/("""
    """),format.raw/*41.5*/("""</div>

   

  </div>

""")))}),format.raw/*47.2*/("""

"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,userProvider:UserProvider,loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,userProvider,loginForm)

  def f:((com.feth.play.module.pa.PlayAuthenticate,UserProvider,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,userProvider,loginForm) => apply(playAuth,userProvider,loginForm)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 16:56:53 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/login.scala.html
                  HASH: 4e2a0b16a15b6d7d42f4e26fc373d62727a2128c
                  MATRIX: 927->30|1173->150|1205->174|1285->130|1314->223|1341->269|1368->271|1444->339|1483->341|1514->345|1606->410|1667->450|1796->587|1829->594|1844->600|1932->679|1972->681|2010->692|2048->721|2088->723|2128->735|2198->778|2216->787|2257->807|2292->815|2337->829|2375->840|2420->864|2458->875|2651->1047|2693->1061|2767->1108|2826->1146|3022->1314|3094->1364|3136->1376|3168->1381|3222->1405
                  LINES: 32->2|37->5|37->5|38->2|40->5|41->7|42->8|42->8|42->8|44->10|46->12|46->12|53->19|54->20|54->20|54->20|54->20|56->22|56->22|56->22|57->23|58->24|58->24|58->24|59->25|60->26|62->28|62->28|64->30|68->34|70->36|70->36|70->36|72->38|72->38|74->40|75->41|81->47
                  -- GENERATED --
              */
          