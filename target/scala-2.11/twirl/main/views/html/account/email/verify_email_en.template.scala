
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_en_Scope0 {
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

class verify_email_en extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Howdy """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
	To verify your e-mail address, <a href=""""),_display_(/*6.43*/verificationUrl),format.raw/*6.58*/("""">now follow this link</a>.
</p>
<br />
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
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
object verify_email_en extends verify_email_en_Scope0.verify_email_en
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/verify_email_en.scala.html
                  HASH: e2903d06a861ac93b8aa8a2f88d9b504485448a9
                  MATRIX: 800->1|964->70|991->71|1023->78|1047->82|1135->144|1170->159
                  LINES: 27->1|32->1|33->2|33->2|33->2|37->6|37->6
                  -- GENERATED --
              */
          