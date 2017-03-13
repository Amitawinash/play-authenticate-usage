
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

     object signup_Scope1 {
import service.UserProvider

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[com.feth.play.module.pa.PlayAuthenticate,UserProvider,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, userProvider: UserProvider, signupForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*2.103*/("""

"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main(userProvider, Messages("playauthenticate.signup.title"),"signup")/*7.72*/ {_display_(Seq[Any](format.raw/*7.74*/("""

  """),format.raw/*9.3*/("""<div class="row">
    <div class="col-xs-12 col-sm-6 col-md-8">
      <h1>"""),_display_(/*11.12*/Messages("playauthenticate.signup.title")),format.raw/*11.53*/("""</h1>
    </div>
  </div>

  <div id="signup" class="row">

    <div class="col-xs-6 col-md-4">
        """),format.raw/*18.45*/("""
    	"""),_display_(/*19.7*/helper/*19.13*/.form(routes.Application.doSignup, 'class -> "form-horizontal", 'role -> "form")/*19.93*/ {_display_(Seq[Any](format.raw/*19.95*/("""

            """),_display_(/*21.14*/if(signupForm.hasGlobalErrors)/*21.44*/ {_display_(Seq[Any](format.raw/*21.46*/("""
		        """),format.raw/*22.11*/("""<p class="alert alert-danger">
		          """),_display_(/*23.14*/signupForm/*23.24*/.globalError.message),format.raw/*23.44*/("""
		     	"""),format.raw/*24.9*/("""</p>
            """)))}),format.raw/*25.14*/("""

             """),_display_(/*27.15*/inputText(
                signupForm("name"),
                '_label -> Messages("playauthenticate.signup.name")
             )),format.raw/*30.15*/("""

             """),_display_(/*32.15*/_emailPartial(signupForm)),format.raw/*32.40*/("""

             """),_display_(/*34.15*/_passwordPartial(signupForm)),format.raw/*34.43*/("""

            """),format.raw/*36.13*/("""<button type="submit" class="btn btn-default">"""),_display_(/*36.60*/Messages("playauthenticate.signup.now")),format.raw/*36.99*/("""</button>
    	""")))}),format.raw/*37.7*/("""
    """),format.raw/*38.5*/("""</div>

   

  </div>

""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,userProvider:UserProvider,signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,userProvider,signupForm)

  def f:((com.feth.play.module.pa.PlayAuthenticate,UserProvider,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,userProvider,signupForm) => apply(playAuth,userProvider,signupForm)

  def ref: this.type = this

}


}
}

/**/
object signup extends signup_Scope0.signup_Scope1.signup
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 16:58:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/signup.scala.html
                  HASH: c011a764ae15059efb87457a16b7140ebf94b021
                  MATRIX: 930->30|1133->151|1165->175|1245->131|1274->224|1302->227|1380->297|1419->299|1449->303|1551->378|1613->419|1745->559|1778->566|1793->572|1882->652|1922->654|1964->669|2003->699|2043->701|2082->712|2153->756|2172->766|2213->786|2249->795|2298->813|2341->829|2491->958|2534->974|2580->999|2623->1015|2672->1043|2714->1057|2788->1104|2848->1143|2894->1159|2926->1164|2980->1188
                  LINES: 32->2|36->5|36->5|37->2|39->5|41->7|41->7|41->7|43->9|45->11|45->11|52->18|53->19|53->19|53->19|53->19|55->21|55->21|55->21|56->22|57->23|57->23|57->23|58->24|59->25|61->27|64->30|66->32|66->32|68->34|68->34|70->36|70->36|70->36|71->37|72->38|78->44
                  -- GENERATED --
              */
          