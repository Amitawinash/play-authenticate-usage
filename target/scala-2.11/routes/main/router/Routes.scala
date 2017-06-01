
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/conf/routes
// @DATE:Sun Apr 16 21:17:51 IST 2017

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
  // @LINE:16
  Authenticate_4: com.feth.play.module.pa.controllers.Authenticate,
  // @LINE:58
  Signup_0: controllers.Signup,
  // @LINE:67
  Account_1: controllers.Account,
  // @LINE:84
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: controllers.Application,
    // @LINE:16
    Authenticate_4: com.feth.play.module.pa.controllers.Authenticate,
    // @LINE:58
    Signup_0: controllers.Signup,
    // @LINE:67
    Account_1: controllers.Account,
    // @LINE:84
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
    ("""GET""", this.prefix, """controllers.Application.hereThere"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temp""", """controllers.Application.index"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendSomething""", """controllers.Application.sendSomething"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkAvailability""", """controllers.Application.checkAvailability"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.Application.payment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderStatus""", """controllers.Application.orderStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateOrderStatus""", """controllers.Application.updateOrderStatus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shipment""", """controllers.Application.shipment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estimatedDate""", """controllers.Application.estimatedDate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUser""", """controllers.Application.newUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactions""", """controllers.Application.transactions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """findOrderId""", """controllers.Application.findOrderId"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgetPassword""", """controllers.Application.forgetPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changePassword""", """controllers.Application.changePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newPassword""", """controllers.Application.newPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """success""", """controllers.Application.success"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllOrderId""", """controllers.Application.getAllOrderId"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactUs""", """controllers.Application.contactUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.Application.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsAndCondition""", """controllers.Application.termsAndCondition"""),
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
  private[this] lazy val controllers_Application_hereThere0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_hereThere0_invoker = createInvoker(
    Application_3.hereThere,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "hereThere",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temp")))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    Application_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """temp"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_restricted2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restricted")))
  )
  private[this] lazy val controllers_Application_restricted2_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_Application_jsRoutes3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascript/routes.js")))
  )
  private[this] lazy val controllers_Application_jsRoutes3_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_Application_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Application_profile4_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_Application_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login5_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_Application_doLogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_doLogin6_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout7_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate8_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_Application_signup9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_signup9_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_Application_doSignup10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_doSignup10_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Application_hereThere11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hereThere")))
  )
  private[this] lazy val controllers_Application_hereThere11_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Application_sendSomething12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendSomething")))
  )
  private[this] lazy val controllers_Application_sendSomething12_invoker = createInvoker(
    Application_3.sendSomething,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sendSomething",
      Nil,
      "POST",
      """""",
      this.prefix + """sendSomething"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_checkAvailability13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkAvailability")))
  )
  private[this] lazy val controllers_Application_checkAvailability13_invoker = createInvoker(
    Application_3.checkAvailability,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "checkAvailability",
      Nil,
      "GET",
      """""",
      this.prefix + """checkAvailability"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_payment14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_Application_payment14_invoker = createInvoker(
    Application_3.payment,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "payment",
      Nil,
      "GET",
      """""",
      this.prefix + """payment"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_orderStatus15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderStatus")))
  )
  private[this] lazy val controllers_Application_orderStatus15_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Application_updateOrderStatus16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateOrderStatus")))
  )
  private[this] lazy val controllers_Application_updateOrderStatus16_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Application_shipment17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shipment")))
  )
  private[this] lazy val controllers_Application_shipment17_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Application_estimatedDate18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estimatedDate")))
  )
  private[this] lazy val controllers_Application_estimatedDate18_invoker = createInvoker(
    Application_3.estimatedDate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "estimatedDate",
      Nil,
      "GET",
      """""",
      this.prefix + """estimatedDate"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_newUser19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUser")))
  )
  private[this] lazy val controllers_Application_newUser19_invoker = createInvoker(
    Application_3.newUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """newUser"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_transactions20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactions")))
  )
  private[this] lazy val controllers_Application_transactions20_invoker = createInvoker(
    Application_3.transactions,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "transactions",
      Nil,
      "GET",
      """""",
      this.prefix + """transactions"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_findOrderId21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("findOrderId")))
  )
  private[this] lazy val controllers_Application_findOrderId21_invoker = createInvoker(
    Application_3.findOrderId,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findOrderId",
      Nil,
      "GET",
      """""",
      this.prefix + """findOrderId"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_forgetPassword22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgetPassword")))
  )
  private[this] lazy val controllers_Application_forgetPassword22_invoker = createInvoker(
    Application_3.forgetPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "forgetPassword",
      Nil,
      "GET",
      """""",
      this.prefix + """forgetPassword"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_changePassword23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changePassword")))
  )
  private[this] lazy val controllers_Application_changePassword23_invoker = createInvoker(
    Application_3.changePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "changePassword",
      Nil,
      "GET",
      """""",
      this.prefix + """changePassword"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_newPassword24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newPassword")))
  )
  private[this] lazy val controllers_Application_newPassword24_invoker = createInvoker(
    Application_3.newPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newPassword",
      Nil,
      "GET",
      """""",
      this.prefix + """newPassword"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_success25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("success")))
  )
  private[this] lazy val controllers_Application_success25_invoker = createInvoker(
    Application_3.success,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "success",
      Nil,
      "GET",
      """""",
      this.prefix + """success"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_getAllOrderId26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllOrderId")))
  )
  private[this] lazy val controllers_Application_getAllOrderId26_invoker = createInvoker(
    Application_3.getAllOrderId,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllOrderId",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllOrderId"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_contactUs27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactUs")))
  )
  private[this] lazy val controllers_Application_contactUs27_invoker = createInvoker(
    Application_3.contactUs,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contactUs",
      Nil,
      "GET",
      """""",
      this.prefix + """contactUs"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_aboutUs28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_Application_aboutUs28_invoker = createInvoker(
    Application_3.aboutUs,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "aboutUs",
      Nil,
      "GET",
      """""",
      this.prefix + """aboutUs"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_termsAndCondition29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsAndCondition")))
  )
  private[this] lazy val controllers_Application_termsAndCondition29_invoker = createInvoker(
    Application_3.termsAndCondition,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "termsAndCondition",
      Nil,
      "GET",
      """""",
      this.prefix + """termsAndCondition"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Signup_unverified30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/unverified")))
  )
  private[this] lazy val controllers_Signup_unverified30_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_Signup_oAuthDenied31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true), StaticPart("/denied")))
  )
  private[this] lazy val controllers_Signup_oAuthDenied31_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_Signup_verify32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_verify32_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_Signup_exists33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/exists")))
  )
  private[this] lazy val controllers_Signup_exists33_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_Signup_resetPassword34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_resetPassword34_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_Signup_doResetPassword35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/reset")))
  )
  private[this] lazy val controllers_Signup_doResetPassword35_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_Account_changePassword36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/change")))
  )
  private[this] lazy val controllers_Account_changePassword36_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_Account_doChangePassword37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/change")))
  )
  private[this] lazy val controllers_Account_doChangePassword37_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_Account_verifyEmail38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/verify")))
  )
  private[this] lazy val controllers_Account_verifyEmail38_invoker = createInvoker(
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

  // @LINE:72
  private[this] lazy val controllers_Account_link39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/add")))
  )
  private[this] lazy val controllers_Account_link39_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_Account_askLink40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/link")))
  )
  private[this] lazy val controllers_Account_askLink40_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_Account_doLink41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/link")))
  )
  private[this] lazy val controllers_Account_doLink41_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_Account_askMerge42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/merge")))
  )
  private[this] lazy val controllers_Account_askMerge42_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_Account_doMerge43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/merge")))
  )
  private[this] lazy val controllers_Account_doMerge43_invoker = createInvoker(
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

  // @LINE:80
  private[this] lazy val controllers_Signup_forgotPassword44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/password/forgot")))
  )
  private[this] lazy val controllers_Signup_forgotPassword44_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val controllers_Signup_doForgotPassword45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/password/forgot")))
  )
  private[this] lazy val controllers_Signup_doForgotPassword45_invoker = createInvoker(
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

  // @LINE:84
  private[this] lazy val controllers_Assets_versioned46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned46_invoker = createInvoker(
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
    case controllers_Application_hereThere0_route(params) =>
      call { 
        controllers_Application_hereThere0_invoker.call(Application_3.hereThere)
      }
  
    // @LINE:7
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(Application_3.index)
      }
  
    // @LINE:8
    case controllers_Application_restricted2_route(params) =>
      call { 
        controllers_Application_restricted2_invoker.call(Application_3.restricted)
      }
  
    // @LINE:9
    case controllers_Application_jsRoutes3_route(params) =>
      call { 
        controllers_Application_jsRoutes3_invoker.call(Application_3.jsRoutes)
      }
  
    // @LINE:11
    case controllers_Application_profile4_route(params) =>
      call { 
        controllers_Application_profile4_invoker.call(Application_3.profile)
      }
  
    // @LINE:13
    case controllers_Application_login5_route(params) =>
      call { 
        controllers_Application_login5_invoker.call(Application_3.login)
      }
  
    // @LINE:14
    case controllers_Application_doLogin6_route(params) =>
      call { 
        controllers_Application_doLogin6_invoker.call(Application_3.doLogin)
      }
  
    // @LINE:16
    case com_feth_play_module_pa_controllers_Authenticate_logout7_route(params) =>
      call { 
        com_feth_play_module_pa_controllers_Authenticate_logout7_invoker.call(Authenticate_4.logout)
      }
  
    // @LINE:17
    case com_feth_play_module_pa_controllers_Authenticate_authenticate8_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        com_feth_play_module_pa_controllers_Authenticate_authenticate8_invoker.call(Authenticate_4.authenticate(provider))
      }
  
    // @LINE:19
    case controllers_Application_signup9_route(params) =>
      call { 
        controllers_Application_signup9_invoker.call(Application_3.signup)
      }
  
    // @LINE:20
    case controllers_Application_doSignup10_route(params) =>
      call { 
        controllers_Application_doSignup10_invoker.call(Application_3.doSignup)
      }
  
    // @LINE:23
    case controllers_Application_hereThere11_route(params) =>
      call { 
        controllers_Application_hereThere11_invoker.call(Application_3.hereThere)
      }
  
    // @LINE:24
    case controllers_Application_sendSomething12_route(params) =>
      call { 
        controllers_Application_sendSomething12_invoker.call(Application_3.sendSomething)
      }
  
    // @LINE:25
    case controllers_Application_checkAvailability13_route(params) =>
      call { 
        controllers_Application_checkAvailability13_invoker.call(Application_3.checkAvailability)
      }
  
    // @LINE:26
    case controllers_Application_payment14_route(params) =>
      call { 
        controllers_Application_payment14_invoker.call(Application_3.payment)
      }
  
    // @LINE:27
    case controllers_Application_orderStatus15_route(params) =>
      call { 
        controllers_Application_orderStatus15_invoker.call(Application_3.orderStatus)
      }
  
    // @LINE:28
    case controllers_Application_updateOrderStatus16_route(params) =>
      call { 
        controllers_Application_updateOrderStatus16_invoker.call(Application_3.updateOrderStatus)
      }
  
    // @LINE:29
    case controllers_Application_shipment17_route(params) =>
      call { 
        controllers_Application_shipment17_invoker.call(Application_3.shipment)
      }
  
    // @LINE:30
    case controllers_Application_estimatedDate18_route(params) =>
      call { 
        controllers_Application_estimatedDate18_invoker.call(Application_3.estimatedDate)
      }
  
    // @LINE:31
    case controllers_Application_newUser19_route(params) =>
      call { 
        controllers_Application_newUser19_invoker.call(Application_3.newUser)
      }
  
    // @LINE:32
    case controllers_Application_transactions20_route(params) =>
      call { 
        controllers_Application_transactions20_invoker.call(Application_3.transactions)
      }
  
    // @LINE:33
    case controllers_Application_findOrderId21_route(params) =>
      call { 
        controllers_Application_findOrderId21_invoker.call(Application_3.findOrderId)
      }
  
    // @LINE:34
    case controllers_Application_forgetPassword22_route(params) =>
      call { 
        controllers_Application_forgetPassword22_invoker.call(Application_3.forgetPassword)
      }
  
    // @LINE:35
    case controllers_Application_changePassword23_route(params) =>
      call { 
        controllers_Application_changePassword23_invoker.call(Application_3.changePassword)
      }
  
    // @LINE:36
    case controllers_Application_newPassword24_route(params) =>
      call { 
        controllers_Application_newPassword24_invoker.call(Application_3.newPassword)
      }
  
    // @LINE:37
    case controllers_Application_success25_route(params) =>
      call { 
        controllers_Application_success25_invoker.call(Application_3.success)
      }
  
    // @LINE:38
    case controllers_Application_getAllOrderId26_route(params) =>
      call { 
        controllers_Application_getAllOrderId26_invoker.call(Application_3.getAllOrderId)
      }
  
    // @LINE:39
    case controllers_Application_contactUs27_route(params) =>
      call { 
        controllers_Application_contactUs27_invoker.call(Application_3.contactUs)
      }
  
    // @LINE:40
    case controllers_Application_aboutUs28_route(params) =>
      call { 
        controllers_Application_aboutUs28_invoker.call(Application_3.aboutUs)
      }
  
    // @LINE:41
    case controllers_Application_termsAndCondition29_route(params) =>
      call { 
        controllers_Application_termsAndCondition29_invoker.call(Application_3.termsAndCondition)
      }
  
    // @LINE:58
    case controllers_Signup_unverified30_route(params) =>
      call { 
        controllers_Signup_unverified30_invoker.call(Signup_0.unverified)
      }
  
    // @LINE:59
    case controllers_Signup_oAuthDenied31_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Signup_oAuthDenied31_invoker.call(Signup_0.oAuthDenied(provider))
      }
  
    // @LINE:61
    case controllers_Signup_verify32_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify32_invoker.call(Signup_0.verify(token))
      }
  
    // @LINE:62
    case controllers_Signup_exists33_route(params) =>
      call { 
        controllers_Signup_exists33_invoker.call(Signup_0.exists)
      }
  
    // @LINE:64
    case controllers_Signup_resetPassword34_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword34_invoker.call(Signup_0.resetPassword(token))
      }
  
    // @LINE:65
    case controllers_Signup_doResetPassword35_route(params) =>
      call { 
        controllers_Signup_doResetPassword35_invoker.call(Signup_0.doResetPassword)
      }
  
    // @LINE:67
    case controllers_Account_changePassword36_route(params) =>
      call { 
        controllers_Account_changePassword36_invoker.call(Account_1.changePassword)
      }
  
    // @LINE:68
    case controllers_Account_doChangePassword37_route(params) =>
      call { 
        controllers_Account_doChangePassword37_invoker.call(Account_1.doChangePassword)
      }
  
    // @LINE:70
    case controllers_Account_verifyEmail38_route(params) =>
      call { 
        controllers_Account_verifyEmail38_invoker.call(Account_1.verifyEmail)
      }
  
    // @LINE:72
    case controllers_Account_link39_route(params) =>
      call { 
        controllers_Account_link39_invoker.call(Account_1.link)
      }
  
    // @LINE:74
    case controllers_Account_askLink40_route(params) =>
      call { 
        controllers_Account_askLink40_invoker.call(Account_1.askLink)
      }
  
    // @LINE:75
    case controllers_Account_doLink41_route(params) =>
      call { 
        controllers_Account_doLink41_invoker.call(Account_1.doLink)
      }
  
    // @LINE:77
    case controllers_Account_askMerge42_route(params) =>
      call { 
        controllers_Account_askMerge42_invoker.call(Account_1.askMerge)
      }
  
    // @LINE:78
    case controllers_Account_doMerge43_route(params) =>
      call { 
        controllers_Account_doMerge43_invoker.call(Account_1.doMerge)
      }
  
    // @LINE:80
    case controllers_Signup_forgotPassword44_route(params) =>
      call(params.fromQuery[String]("email", Some(""))) { (email) =>
        controllers_Signup_forgotPassword44_invoker.call(Signup_0.forgotPassword(email))
      }
  
    // @LINE:81
    case controllers_Signup_doForgotPassword45_route(params) =>
      call { 
        controllers_Signup_doForgotPassword45_invoker.call(Signup_0.doForgotPassword)
      }
  
    // @LINE:84
    case controllers_Assets_versioned46_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned46_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
