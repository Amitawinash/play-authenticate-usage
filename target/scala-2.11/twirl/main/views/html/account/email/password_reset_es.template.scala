
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_es_Scope0 {
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

class password_reset_es extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Hola """),_display_(/*2.7*/name),format.raw/*2.11*/(""",
<br />
<br />
<p>
Alguien ha solicitado restablecer la contraseña de su cuenta.<br />
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.<br />
</p>
<p>
Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir este <a href=""""),_display_(/*10.97*/url),format.raw/*10.100*/("""">enlace para restablecer su contraseña</a>.
</p>

<p>
Atentamente,<br /> 
<i>El equipo de PlayAuthenticate</i>
</p>
"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_es extends password_reset_es_Scope0.password_reset_es
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/password_reset_es.scala.html
                  HASH: d902656bde7b683b7160cfc24819bef97ad8ca56
                  MATRIX: 804->1|956->58|983->59|1014->65|1038->69|1349->353|1374->356
                  LINES: 27->1|32->1|33->2|33->2|33->2|41->10|41->10
                  -- GENERATED --
              */
          