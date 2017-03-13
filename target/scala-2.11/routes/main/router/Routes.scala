
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/conf/routes
// @DATE:Mon Mar 13 22:21:22 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_3: controllers.Application,
  // @LINE:15
  Authenticate_4: com.feth.play.module.pa.controllers.Authenticate,
  // @LINE:34
  Signup_0: controllers.Signup,
  // @LINE:43
  Account_1: controllers.Account,
  // @LINE:60
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: controllers.Application,
    // @LINE:15
    Authenticate_4: com.feth.play.module.pa.controllers.Authenticate,
    // @LINE:34
    Signup_0: controllers.Signup,
    // @LINE:43
    Account_1: controllers.Account,
    // @LINE:60
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_3, Authenticate_4, Signup_0, Account_1, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, Authenticate_4, Signup_0, Account_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restricted""", """controllers.Application.restricted"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""", """controllers.Application.jsRoutes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Application.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """com.feth.play.module.pa.controllers.Authenticate.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Application.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Application.doSignup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hereThere""", """controllers.Application.hereThere"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address""", """controllers.Application.checkAvailability"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.Application.orderAddress"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderStatus""", """controllers.Application.orderStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateOrderStatus""", """controllers.Application.updateOrderStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shipment""", """controllers.Application.shipment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/unverified""", """controllers.Signup.unverified"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>/denied""", """controllers.Signup.oAuthDenied(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/verify/""" + "$" + """token<[^/]+>""", """controllers.Signup.verify(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/exists""", """controllers.Signup.exists"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/reset/""" + "$" + """token<[^/]+>""", """controllers.Signup.resetPassword(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/reset""", """controllers.Signup.doResetPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/change""", """controllers.Account.changePassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/change""", """controllers.Account.doChangePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/verify""", """controllers.Account.verifyEmail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/add""", """controllers.Account.link"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/link""", """controllers.Account.askLink"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/link""", """controllers.Account.doLink"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/merge""", """controllers.Account.askMerge"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/merge""", """controllers.Account.doMerge"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/password/forgot""", """controllers.Signup.forgotPassword(email:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/password/forgot""", """controllers.Signup.doForgotPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_restricted1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restricted")))
  )
  private[this] lazy val controllers_Application_restricted1_invoker = createInvoker(
    Application_3.restricted,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "restricted",
      Nil,
      "GET",
      """""",
      this.prefix + """restricted"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_jsRoutes2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascript/routes.js")))
  )
  private[this] lazy val controllers_Application_jsRoutes2_invoker = createInvoker(
    Application_3.jsRoutes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsRoutes",
      Nil,
      "GET",
      """""",
      this.prefix + """assets/javascript/routes.js"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_profile3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Application_profile3_invoker = createInvoker(
    Application_3.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login4_invoker = createInvoker(
    Application_3.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_doLogin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_doLogin5_invoker = createInvoker(
    Application_3.doLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "doLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout6_invoker = createInvoker(
    Authenticate_4.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.feth.play.module.pa.controllers.Authenticate",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:16
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate7_invoker = createInvoker(
    Authenticate_4.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.feth.play.module.pa.controllers.Authenticate",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_signup8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_signup8_invoker = createInvoker(
    Application_3.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_doSignup9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_doSignup9_invoker = createInvoker(
    Application_3.doSignup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "doSignup",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_hereThere10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hereThere")))
  )
  private[this] lazy val controllers_Application_hereThere10_invoker = createInvoker(
    Application_3.hereThere,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "hereThere",
      Nil,
      "GET",
      """""",
      this.prefix + """hereThere"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_checkAvailability11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address")))
  )
  private[this] lazy val controllers_Application_checkAvailability11_invoker = createInvoker(
    Application_3.checkAvailability,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "checkAvailability",
      Nil,
      "GET",
      """""",
      this.prefix + """address"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_orderAddress12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_Application_orderAddress12_invoker = createInvoker(
    Application_3.orderAddress,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "orderAddress",
      Nil,
      "GET",
      """""",
      this.prefix + """payment"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_orderStatus13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderStatus")))
  )
  private[this] lazy val controllers_Application_orderStatus13_invoker = createInvoker(
    Application_3.orderStatus,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "orderStatus",
      Nil,
      "GET",
      """""",
      this.prefix + """orderStatus"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_updateOrderStatus14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateOrderStatus")))
  )
  private[this] lazy val controllers_Application_updateOrderStatus14_invoker = createInvoker(
    Application_3.updateOrderStatus,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateOrderStatus",
      Nil,
      "GET",
      """""",
      this.prefix + """updateOrderStatus"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_shipment15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shipment")))
  )
  private[this] lazy val controllers_Application_shipment15_invoker = createInvoker(
    Application_3.shipment,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "shipment",
      Nil,
      "GET",
      """""",
      this.prefix + """shipment"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Signup_unverified16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/unverified")))
  )
  private[this] lazy val controllers_Signup_unverified16_invoker = createInvoker(
    Signup_0.unverified,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "unverified",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/unverified"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Signup_oAuthDenied17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true), StaticPart("/denied")))
  )
  private[this] lazy val controllers_Signup_oAuthDenied17_invoker = createInvoker(
    Signup_0.oAuthDenied(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "oAuthDenied",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>/denied"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Signup_verify18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_verify18_invoker = createInvoker(
    Signup_0.verify(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "verify",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """accounts/verify/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Signup_exists19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/exists")))
  )
  private[this] lazy val controllers_Signup_exists19_invoker = createInvoker(
    Signup_0.exists,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "exists",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/exists"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Signup_resetPassword20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_resetPassword20_invoker = createInvoker(
    Signup_0.resetPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "resetPassword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """accounts/password/reset/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Signup_doResetPassword21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/reset")))
  )
  private[this] lazy val controllers_Signup_doResetPassword21_invoker = createInvoker(
    Signup_0.doResetPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "doResetPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/password/reset"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Account_changePassword22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/change")))
  )
  private[this] lazy val controllers_Account_changePassword22_invoker = createInvoker(
    Account_1.changePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "changePassword",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/password/change"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Account_doChangePassword23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/change")))
  )
  private[this] lazy val controllers_Account_doChangePassword23_invoker = createInvoker(
    Account_1.doChangePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doChangePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/password/change"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Account_verifyEmail24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/verify")))
  )
  private[this] lazy val controllers_Account_verifyEmail24_invoker = createInvoker(
    Account_1.verifyEmail,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "verifyEmail",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/verify"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Account_link25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/add")))
  )
  private[this] lazy val controllers_Account_link25_invoker = createInvoker(
    Account_1.link,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "link",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/add"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Account_askLink26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/link")))
  )
  private[this] lazy val controllers_Account_askLink26_invoker = createInvoker(
    Account_1.askLink,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "askLink",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/link"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Account_doLink27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/link")))
  )
  private[this] lazy val controllers_Account_doLink27_invoker = createInvoker(
    Account_1.doLink,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doLink",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/link"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Account_askMerge28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/merge")))
  )
  private[this] lazy val controllers_Account_askMerge28_invoker = createInvoker(
    Account_1.askMerge,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "askMerge",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/merge"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Account_doMerge29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/merge")))
  )
  private[this] lazy val controllers_Account_doMerge29_invoker = createInvoker(
    Account_1.doMerge,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doMerge",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/merge"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Signup_forgotPassword30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/password/forgot")))
  )
  private[this] lazy val controllers_Signup_forgotPassword30_invoker = createInvoker(
    Signup_0.forgotPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "forgotPassword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """login/password/forgot"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Signup_doForgotPassword31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/password/forgot")))
  )
  private[this] lazy val controllers_Signup_doForgotPassword31_invoker = createInvoker(
    Signup_0.doForgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "doForgotPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """login/password/forgot"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Assets_versioned32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned32_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_3.index)
      }
  
    // @LINE:7
    case controllers_Application_restricted1_route(params) =>
      call { 
        controllers_Application_restricted1_invoker.call(Application_3.restricted)
      }
  
    // @LINE:8
    case controllers_Application_jsRoutes2_route(params) =>
      call { 
        controllers_Application_jsRoutes2_invoker.call(Application_3.jsRoutes)
      }
  
    // @LINE:10
    case controllers_Application_profile3_route(params) =>
      call { 
        controllers_Application_profile3_invoker.call(Application_3.profile)
      }
  
    // @LINE:12
    case controllers_Application_login4_route(params) =>
      call { 
        controllers_Application_login4_invoker.call(Application_3.login)
      }
  
    // @LINE:13
    case controllers_Application_doLogin5_route(params) =>
      call { 
        controllers_Application_doLogin5_invoker.call(Application_3.doLogin)
      }
  
    // @LINE:15
    case com_feth_play_module_pa_controllers_Authenticate_logout6_route(params) =>
      call { 
        com_feth_play_module_pa_controllers_Authenticate_logout6_invoker.call(Authenticate_4.logout)
      }
  
    // @LINE:16
    case com_feth_play_module_pa_controllers_Authenticate_authenticate7_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        com_feth_play_module_pa_controllers_Authenticate_authenticate7_invoker.call(Authenticate_4.authenticate(provider))
      }
  
    // @LINE:18
    case controllers_Application_signup8_route(params) =>
      call { 
        controllers_Application_signup8_invoker.call(Application_3.signup)
      }
  
    // @LINE:19
    case controllers_Application_doSignup9_route(params) =>
      call { 
        controllers_Application_doSignup9_invoker.call(Application_3.doSignup)
      }
  
    // @LINE:22
    case controllers_Application_hereThere10_route(params) =>
      call { 
        controllers_Application_hereThere10_invoker.call(Application_3.hereThere)
      }
  
    // @LINE:23
    case controllers_Application_checkAvailability11_route(params) =>
      call { 
        controllers_Application_checkAvailability11_invoker.call(Application_3.checkAvailability)
      }
  
    // @LINE:24
    case controllers_Application_orderAddress12_route(params) =>
      call { 
        controllers_Application_orderAddress12_invoker.call(Application_3.orderAddress)
      }
  
    // @LINE:25
    case controllers_Application_orderStatus13_route(params) =>
      call { 
        controllers_Application_orderStatus13_invoker.call(Application_3.orderStatus)
      }
  
    // @LINE:26
    case controllers_Application_updateOrderStatus14_route(params) =>
      call { 
        controllers_Application_updateOrderStatus14_invoker.call(Application_3.updateOrderStatus)
      }
  
    // @LINE:27
    case controllers_Application_shipment15_route(params) =>
      call { 
        controllers_Application_shipment15_invoker.call(Application_3.shipment)
      }
  
    // @LINE:34
    case controllers_Signup_unverified16_route(params) =>
      call { 
        controllers_Signup_unverified16_invoker.call(Signup_0.unverified)
      }
  
    // @LINE:35
    case controllers_Signup_oAuthDenied17_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Signup_oAuthDenied17_invoker.call(Signup_0.oAuthDenied(provider))
      }
  
    // @LINE:37
    case controllers_Signup_verify18_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify18_invoker.call(Signup_0.verify(token))
      }
  
    // @LINE:38
    case controllers_Signup_exists19_route(params) =>
      call { 
        controllers_Signup_exists19_invoker.call(Signup_0.exists)
      }
  
    // @LINE:40
    case controllers_Signup_resetPassword20_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword20_invoker.call(Signup_0.resetPassword(token))
      }
  
    // @LINE:41
    case controllers_Signup_doResetPassword21_route(params) =>
      call { 
        controllers_Signup_doResetPassword21_invoker.call(Signup_0.doResetPassword)
      }
  
    // @LINE:43
    case controllers_Account_changePassword22_route(params) =>
      call { 
        controllers_Account_changePassword22_invoker.call(Account_1.changePassword)
      }
  
    // @LINE:44
    case controllers_Account_doChangePassword23_route(params) =>
      call { 
        controllers_Account_doChangePassword23_invoker.call(Account_1.doChangePassword)
      }
  
    // @LINE:46
    case controllers_Account_verifyEmail24_route(params) =>
      call { 
        controllers_Account_verifyEmail24_invoker.call(Account_1.verifyEmail)
      }
  
    // @LINE:48
    case controllers_Account_link25_route(params) =>
      call { 
        controllers_Account_link25_invoker.call(Account_1.link)
      }
  
    // @LINE:50
    case controllers_Account_askLink26_route(params) =>
      call { 
        controllers_Account_askLink26_invoker.call(Account_1.askLink)
      }
  
    // @LINE:51
    case controllers_Account_doLink27_route(params) =>
      call { 
        controllers_Account_doLink27_invoker.call(Account_1.doLink)
      }
  
    // @LINE:53
    case controllers_Account_askMerge28_route(params) =>
      call { 
        controllers_Account_askMerge28_invoker.call(Account_1.askMerge)
      }
  
    // @LINE:54
    case controllers_Account_doMerge29_route(params) =>
      call { 
        controllers_Account_doMerge29_invoker.call(Account_1.doMerge)
      }
  
    // @LINE:56
    case controllers_Signup_forgotPassword30_route(params) =>
      call(params.fromQuery[String]("email", Some(""))) { (email) =>
        controllers_Signup_forgotPassword30_invoker.call(Signup_0.forgotPassword(email))
      }
  
    // @LINE:57
    case controllers_Signup_doForgotPassword31_route(params) =>
      call { 
        controllers_Signup_doForgotPassword31_invoker.call(Signup_0.doForgotPassword)
      }
  
    // @LINE:60
    case controllers_Assets_versioned32_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned32_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
