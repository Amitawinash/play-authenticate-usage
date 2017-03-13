
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _providerPartial_Scope0 {
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

class _providerPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[com.feth.play.module.pa.PlayAuthenticate,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, skipCurrent: Boolean = true):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script type="text/javascript">
function askOpenID(url) """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
	"""),format.raw/*7.2*/("""var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
		"""),format.raw/*9.3*/("""window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</script>
<ul class="providers">
	"""),_display_(/*14.3*/forProviders(playAuth, skipCurrent)/*14.38*/ { p =>_display_(Seq[Any](format.raw/*14.45*/("""
		"""),format.raw/*15.3*/("""<li>
		"""),_display_(/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			"""),format.raw/*17.4*/("""<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(/*17.55*/p/*17.56*/.getUrl()),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			"""),format.raw/*19.4*/("""<a href=""""),_display_(/*19.14*/p/*19.15*/.getUrl()),format.raw/*19.24*/("""">
		""")))}),format.raw/*20.4*/("""
		"""),_display_(/*21.4*/_providerIcon(p.getKey())),format.raw/*21.29*/("""</a>
		</li>
	""")))}),format.raw/*23.3*/("""
"""),format.raw/*24.1*/("""</ul>"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,skipCurrent:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,skipCurrent)

  def f:((com.feth.play.module.pa.PlayAuthenticate,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,skipCurrent) => apply(playAuth,skipCurrent)

  def ref: this.type = this

}


}

/**/
object _providerPartial extends _providerPartial_Scope0._providerPartial
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/_providerPartial.scala.html
                  HASH: a766a2560130e384775378f26e73d544c9e2eec3
                  MATRIX: 809->1|1028->82|1056->129|1083->130|1166->186|1194->187|1222->189|1336->276|1364->277|1393->280|1486->346|1514->347|1542->348|1570->349|1598->350|1659->385|1703->420|1748->427|1778->430|1812->438|1847->464|1887->466|1918->470|1996->521|2006->522|2036->531|2063->541|2076->546|2115->547|2146->551|2183->561|2193->562|2223->571|2259->577|2289->581|2335->606|2380->621|2408->622
                  LINES: 27->1|32->1|34->4|35->5|36->6|36->6|37->7|38->8|38->8|39->9|40->10|40->10|41->11|41->11|42->12|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|49->19|50->20|51->21|51->21|53->23|54->24
                  -- GENERATED --
              */
          