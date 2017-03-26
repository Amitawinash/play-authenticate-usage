
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/conf/routes
// @DATE:Sun Mar 26 22:56:18 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:52
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def exists: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.exists",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
        }
      """
    )
  
    // @LINE:55
    def verify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.verify",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:52
    def unverified: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.unverified",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
        }
      """
    )
  
    // @LINE:53
    def oAuthDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.oAuthDenied",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider0)) + "/denied"})
        }
      """
    )
  
    // @LINE:58
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.resetPassword",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:59
    def doResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.doResetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
        }
      """
    )
  
    // @LINE:75
    def doForgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.doForgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
        }
      """
    )
  
    // @LINE:74
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.forgotPassword",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0))])})
        }
      """
    )
  
  }

  // @LINE:78
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:61
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def askMerge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.askMerge",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
        }
      """
    )
  
    // @LINE:72
    def doMerge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doMerge",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
        }
      """
    )
  
    // @LINE:64
    def verifyEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.verifyEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
        }
      """
    )
  
    // @LINE:68
    def askLink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.askLink",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
        }
      """
    )
  
    // @LINE:69
    def doLink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doLink",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
        }
      """
    )
  
    // @LINE:61
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
        }
      """
    )
  
    // @LINE:66
    def link: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.link",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
        }
      """
    )
  
    // @LINE:62
    def doChangePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doChangePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def getAllOrderId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllOrderId",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllOrderId"})
        }
      """
    )
  
    // @LINE:20
    def doSignup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.doSignup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:26
    def orderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.orderStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderStatus"})
        }
      """
    )
  
    // @LINE:11
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:29
    def estimatedDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.estimatedDate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimatedDate"})
        }
      """
    )
  
    // @LINE:33
    def forgetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.forgetPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgetPassword"})
        }
      """
    )
  
    // @LINE:9
    def jsRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
        }
      """
    )
  
    // @LINE:19
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:35
    def newPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newPassword"})
        }
      """
    )
  
    // @LINE:25
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.payment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
    // @LINE:14
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:31
    def transactions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.transactions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactions"})
        }
      """
    )
  
    // @LINE:28
    def shipment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.shipment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shipment"})
        }
      """
    )
  
    // @LINE:6
    def hereThere: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.hereThere",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:34
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changePassword"})
        }
      """
    )
  
    // @LINE:36
    def success: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.success",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "success"})
        }
      """
    )
  
    // @LINE:38
    def sendSomething: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sendSomething",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendSomething"})
        }
      """
    )
  
    // @LINE:8
    def restricted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.restricted",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
        }
      """
    )
  
    // @LINE:30
    def newUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newUser"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temp"})
        }
      """
    )
  
    // @LINE:32
    def findOrderId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findOrderId",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findOrderId"})
        }
      """
    )
  
    // @LINE:27
    def updateOrderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateOrderStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateOrderStatus"})
        }
      """
    )
  
    // @LINE:13
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:24
    def checkAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.checkAvailability",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkAvailability"})
        }
      """
    )
  
  }


}
