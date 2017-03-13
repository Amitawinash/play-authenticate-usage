
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _emailPartial_Scope0 {
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

class _emailPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(f: Form[_], constraints: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*4.75*/("""

"""),_display_(/*6.2*/inputText(
  f("email"),
  '_showConstraints -> constraints,
  '_label -> Messages("playauthenticate.login.email.placeholder")
)),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(f:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},constraints:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(f,constraints)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean) => play.twirl.api.HtmlFormat.Appendable) = (f,constraints) => apply(f,constraints)

  def ref: this.type = this

}


}

/**/
object _emailPartial extends _emailPartial_Scope0._emailPartial
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/_emailPartial.scala.html
                  HASH: 9ee10128c4ebc8555e3a27831c97f9ba74e16313
                  MATRIX: 841->1|985->63|1017->87|1096->43|1125->136|1153->139|1301->267
                  LINES: 29->1|33->4|33->4|34->1|36->4|38->6|42->10
                  -- GENERATED --
              */
          