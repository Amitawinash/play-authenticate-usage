
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pl_Scope0 {
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

class verify_email_pl extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Cześć """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Aby zweryfikować konto, <a href=""""),_display_(/*6.39*/verificationUrl),format.raw/*6.54*/("""">użyj ten link</a>.
</p>
<br />
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_pl extends verify_email_pl_Scope0.verify_email_pl
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/verify_email_pl.scala.html
                  HASH: a7cab6c08da6bc9b77c10eead2c748c1081e45f8
                  MATRIX: 800->1|964->70|991->71|1023->78|1047->82|1131->140|1166->155
                  LINES: 27->1|32->1|33->2|33->2|33->2|37->6|37->6
                  -- GENERATED --
              */
          