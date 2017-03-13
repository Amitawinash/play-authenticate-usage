
package views.html.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_es_Scope0 {
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

class verify_email_es extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Hola """),_display_(/*2.7*/name),format.raw/*2.11*/(""",
<br />
<br />
<p>
	Se acaba de apuntar a PlayAuthenticate.<br />
	<br />
	Siga el siguiente enlace para <a href=""""),_display_(/*8.42*/verificationUrl),format.raw/*8.57*/("""">activar su cuenta</a>.
</p>
<br />
<p>
	Saludos,<br /> 
	<i>El equipo de PlayAuthenticate</i>
</p>
"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_es extends verify_email_es_Scope0.verify_email_es
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/email/verify_email_es.scala.html
                  HASH: 78e128dcaa9ac026ab38da926f802674bf4bbd7d
                  MATRIX: 807->1|971->70|998->71|1029->77|1053->81|1195->197|1230->212
                  LINES: 27->1|32->1|33->2|33->2|33->2|39->8|39->8
                  -- GENERATED --
              */
          