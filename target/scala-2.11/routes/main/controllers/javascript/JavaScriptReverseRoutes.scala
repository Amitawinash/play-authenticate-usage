
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/conf/routes
// @DATE:Mon Mar 13 22:21:22 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:34
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def exists: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.exists",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
        }
      """
    )
  
    // @LINE:37
    def verify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.verify",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:34
    def unverified: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.unverified",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
        }
      """
    )
  
    // @LINE:35
    def oAuthDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.oAuthDenied",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider0)) + "/denied"})
        }
      """
    )
  
    // @LINE:40
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.resetPassword",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:41
    def doResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.doResetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
        }
      """
    )
  
    // @LINE:57
    def doForgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.doForgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
        }
      """
    )
  
    // @LINE:56
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.forgotPassword",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0))])})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def askMerge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.askMerge",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
        }
      """
    )
  
    // @LINE:54
    def doMerge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doMerge",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
        }
      """
    )
  
    // @LINE:46
    def verifyEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.verifyEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
        }
      """
    )
  
    // @LINE:50
    def askLink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.askLink",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
        }
      """
    )
  
    // @LINE:51
    def doLink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doLink",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
        }
      """
    )
  
    // @LINE:43
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
        }
      """
    )
  
    // @LINE:48
    def link: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.link",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
        }
      """
    )
  
    // @LINE:44
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

  
    // @LINE:19
    def doSignup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.doSignup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:25
    def orderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.orderStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderStatus"})
        }
      """
    )
  
    // @LINE:10
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:8
    def jsRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
        }
      """
    )
  
    // @LINE:18
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:13
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:27
    def shipment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.shipment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shipment"})
        }
      """
    )
  
    // @LINE:22
    def hereThere: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.hereThere",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hereThere"})
        }
      """
    )
  
    // @LINE:24
    def orderAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.orderAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
    // @LINE:7
    def restricted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.restricted",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:26
    def updateOrderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateOrderStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateOrderStatus"})
        }
      """
    )
  
    // @LINE:12
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:23
    def checkAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.checkAvailability",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "address"})
        }
      """
    )
  
  }


}
