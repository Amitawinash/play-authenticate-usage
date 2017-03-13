
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _passwordPartial_Scope0 {
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

class _passwordPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(f: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.75*/("""

             """),_display_(/*6.15*/inputPassword(
                f("password"),
                '_label -> Messages("playauthenticate.login.password.placeholder")
             )),format.raw/*9.15*/("""

             """),_display_(/*11.15*/inputPassword(
                f("repeatPassword"),
                '_label -> Messages("playauthenticate.login.password.repeat"),
                '_showConstraints -> false,
                '_error -> f.error("password")
             )),format.raw/*16.15*/("""
"""))
      }
    }
  }

  def render(f:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(f)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (f) => apply(f)

  def ref: this.type = this

}


}

/**/
object _passwordPartial extends _passwordPartial_Scope0._passwordPartial
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/_passwordPartial.scala.html
                  HASH: 2c449be7db6e965559e85df9fc9b2ef640069bb0
                  MATRIX: 839->1|953->33|985->57|1064->13|1093->106|1135->122|1298->265|1341->281|1598->517
                  LINES: 29->1|33->4|33->4|34->1|36->4|38->6|41->9|43->11|48->16
                  -- GENERATED --
              */
          