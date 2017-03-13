
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object twitterBootstrapBasic_Scope0 {
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

class twitterBootstrapBasic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.1*/("""<div class="form-group """),_display_(/*2.25*/if(elements.hasErrors)/*2.47*/ {_display_(Seq[Any](format.raw/*2.49*/("""has-error""")))}),format.raw/*2.59*/("""">
    <label for=""""),_display_(/*3.18*/elements/*3.26*/.id),format.raw/*3.29*/("""" class="control-label">"""),_display_(/*3.54*/elements/*3.62*/.label),format.raw/*3.68*/("""</label>
    <div class="row">
        <div class=""""),_display_(/*5.22*/elements/*5.30*/.args.toMap.get('inputDivClass).getOrElse("col-md-5")),format.raw/*5.83*/("""">
        """),_display_(/*6.10*/if(elements.input.toString().contains("class="))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
        """),_display_(/*7.10*/Html(elements.input.toString().replaceFirst("(class=[\"'])", "$1form-control "))),format.raw/*7.90*/("""
        """)))}/*8.11*/else/*8.16*/{_display_(Seq[Any](format.raw/*8.17*/("""
        """),_display_(/*9.10*/Html(elements.input.toString().replaceFirst("(<\\w+ )", "$1class=\"form-control\" "))),format.raw/*9.95*/("""
        """)))}),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</div>
</div>
<span class="help-block text-muted">"""),_display_(/*13.38*/elements/*13.46*/.infos.mkString(", ")),format.raw/*13.67*/("""</span>
"""),_display_(/*14.2*/if(elements.hasErrors)/*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
"""),format.raw/*15.1*/("""<span class="help-block">"""),_display_(/*15.27*/elements/*15.35*/.errors.mkString(", ")),format.raw/*15.57*/("""</span>
""")))}),format.raw/*16.2*/("""
"""),format.raw/*17.1*/("""</div>
"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object twitterBootstrapBasic extends twitterBootstrapBasic_Scope0.twitterBootstrapBasic
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/twitterBootstrapBasic.scala.html
                  HASH: a9390792a0d88813b9d6c7674dcb26fa935964e4
                  MATRIX: 791->1|918->33|945->34|995->58|1025->80|1064->82|1104->92|1150->112|1166->120|1189->123|1240->148|1256->156|1282->162|1360->214|1376->222|1449->275|1487->287|1543->335|1582->337|1618->347|1718->427|1746->438|1758->443|1796->444|1832->454|1937->539|1978->549|2010->554|2088->605|2105->613|2147->634|2182->643|2213->665|2253->667|2281->668|2334->694|2351->702|2394->724|2433->733|2461->734
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|33->2|34->3|34->3|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|42->11|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|48->17
                  -- GENERATED --
              */
          