
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_es_Scope0 {
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

class verify_email_es extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Hola """),_display_(/*1.77*/name),format.raw/*1.81*/(""", 


Para validar su email siga el siguiente enlace:
"""),_display_(/*5.2*/verificationUrl),format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""Le saluda,
El equipo de PlayAuthenticate.
"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_es extends verify_email_es_Scope0.verify_email_es
              /*
                  -- GENERATED --
                  DATE: Sun Mar 05 11:59:48 IST 2017
                  SOURCE: /home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/app/views/account/email/verify_email_es.scala.txt
                  HASH: 5b3314bbe62a46225085110e020dc9f4221feef3
                  MATRIX: 794->1|957->70|989->76|1013->80|1092->134|1127->149|1155->151
                  LINES: 27->1|32->1|32->1|32->1|36->5|36->5|38->7
                  -- GENERATED --
              */
          