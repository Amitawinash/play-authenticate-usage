
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_pl_Scope0 {
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

class password_reset_pl extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Cześć """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Poproszono o zmianę hasła dla Twojego konta.<br />
    Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.<br />
</p>
<p>
    Jeśli jednak naprawdę chcesz zmienić hasło <a href=""""),_display_(/*10.58*/url),format.raw/*10.61*/("""">skorzystaj z tego linku aby to zrobić</a>.
</p>
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_pl extends password_reset_pl_Scope0.password_reset_pl
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/password_reset_pl.scala.html
                  HASH: 73e3b63f4eb7056f5d9cf8ee6accecdff882d023
                  MATRIX: 804->1|956->58|983->59|1015->66|1039->70|1273->277|1297->280
                  LINES: 27->1|32->1|33->2|33->2|33->2|41->10|41->10
                  -- GENERATED --
              */
          