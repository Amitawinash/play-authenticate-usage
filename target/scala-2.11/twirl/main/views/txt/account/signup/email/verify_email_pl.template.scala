
package views.txt.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pl_Scope0 {
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

class verify_email_pl extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Cześć """),_display_(/*1.78*/name),format.raw/*1.82*/(""",


Twoje konto w PlayAuthenticate zostało utworzone.

Aby je aktywować, użyj ten link
"""),_display_(/*7.2*/verificationUrl),format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""Pozdrawiamy,
Ekipa PlayAuthenticate"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_pl extends verify_email_pl_Scope0.verify_email_pl
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:47 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/signup/email/verify_email_pl.scala.txt
                  HASH: 570ba850c5f888e3164b7e4f52b138c560a661a9
                  MATRIX: 801->1|964->70|997->77|1021->81|1134->169|1169->184|1197->186
                  LINES: 27->1|32->1|32->1|32->1|38->7|38->7|40->9
                  -- GENERATED --
              */
          