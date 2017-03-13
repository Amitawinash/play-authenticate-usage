
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_en_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
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

class password_reset_en extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Howdy """),_display_(/*1.66*/name),format.raw/*1.70*/(""",


You or someone else requested a password reset for your account.
If this was not you or your intention, just relax and ignore this email.

If you wish to reset your password, all you need to do is follow this link to reset your password:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Cheers,
The PlayAuthenticate Team"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_en extends password_reset_en_Scope0.password_reset_en
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/password_reset_en.scala.txt
                  HASH: 9e3a41d20b401f2492a08abf6b9204d9c1fecb3d
                  MATRIX: 798->1|949->58|982->65|1006->69|1274->312|1296->315|1325->317
                  LINES: 27->1|32->1|32->1|32->1|39->8|39->8|41->10
                  -- GENERATED --
              */
          