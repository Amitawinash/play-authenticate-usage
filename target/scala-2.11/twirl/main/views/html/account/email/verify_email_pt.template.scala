
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pt_Scope0 {
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

class verify_email_pt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Olá """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Para verificar o seu endereço de email, <a href=""""),_display_(/*6.52*/verificationUrl),format.raw/*6.67*/("""">siga esta ligação</a>.
</p>
<br />
<p>
	Obrigado,<br /> 
	<i>A equipa do PlayAuthenticate</i>
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
object verify_email_pt extends verify_email_pt_Scope0.verify_email_pt
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/verify_email_pt.scala.html
                  HASH: c59f886a71c03547db77d92283b17ae8c7a513e2
                  MATRIX: 800->1|964->70|992->72|1022->77|1046->81|1147->156|1182->171
                  LINES: 27->1|32->1|33->2|33->2|33->2|37->6|37->6
                  -- GENERATED --
              */
          