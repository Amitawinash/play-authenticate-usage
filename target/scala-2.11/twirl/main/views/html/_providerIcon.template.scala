
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _providerIcon_Scope0 {
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

class _providerIcon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<img alt=""""),_display_(/*2.12*/providerKey),format.raw/*2.23*/(""" """),format.raw/*2.24*/("""icon" title=""""),_display_(/*2.38*/providerKey),format.raw/*2.49*/("""" src=""""),_display_(/*2.57*/routes/*2.63*/.Assets.versioned("icons/"+providerKey+"-24x24.png")),format.raw/*2.115*/("""">"""))
      }
    }
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}


}

/**/
object _providerIcon extends _providerIcon_Scope0._providerIcon
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/_providerIcon.scala.html
                  HASH: 0b5a1b4f4fe4f3c817444b7900c0337ccaa99633
                  MATRIX: 761->1|877->22|904->23|941->34|972->45|1000->46|1040->60|1071->71|1105->79|1119->85|1192->137
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|33->2|33->2|33->2|33->2|33->2
                  -- GENERATED --
              */
          