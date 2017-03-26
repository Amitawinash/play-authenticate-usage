
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/amit/workspaceTest/play-authenticate-master/samples/java/play-authenticate-usage/conf/routes
// @DATE:Sun Mar 26 22:56:18 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:52
  class ReverseSignup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def exists(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
    }
  
    // @LINE:55
    def verify(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:52
    def unverified(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
    }
  
    // @LINE:53
    def oAuthDenied(provider:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
    }
  
    // @LINE:58
    def resetPassword(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:59
    def doResetPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
    }
  
    // @LINE:75
    def doForgotPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
    }
  
    // @LINE:74
    def forgotPassword(email:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
  }

  // @LINE:78
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:61
  class ReverseAccount(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def askMerge(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
    }
  
    // @LINE:72
    def doMerge(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
    }
  
    // @LINE:64
    def verifyEmail(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
    }
  
    // @LINE:68
    def askLink(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
    }
  
    // @LINE:69
    def doLink(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
    }
  
    // @LINE:61
    def changePassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
    }
  
    // @LINE:66
    def link(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
    }
  
    // @LINE:62
    def doChangePassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def getAllOrderId(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAllOrderId")
    }
  
    // @LINE:20
    def doSignup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:26
    def orderStatus(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "orderStatus")
    }
  
    // @LINE:11
    def profile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:29
    def estimatedDate(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estimatedDate")
    }
  
    // @LINE:33
    def forgetPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "forgetPassword")
    }
  
    // @LINE:9
    def jsRoutes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
    }
  
    // @LINE:19
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:35
    def newPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newPassword")
    }
  
    // @LINE:25
    def payment(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:14
    def doLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:31
    def transactions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "transactions")
    }
  
    // @LINE:28
    def shipment(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "shipment")
    }
  
    // @LINE:6
    def hereThere(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:34
    def changePassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "changePassword")
    }
  
    // @LINE:36
    def success(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "success")
    }
  
    // @LINE:38
    def sendSomething(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sendSomething")
    }
  
    // @LINE:8
    def restricted(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restricted")
    }
  
    // @LINE:30
    def newUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newUser")
    }
  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "temp")
    }
  
    // @LINE:32
    def findOrderId(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "findOrderId")
    }
  
    // @LINE:27
    def updateOrderStatus(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateOrderStatus")
    }
  
    // @LINE:13
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:24
    def checkAvailability(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkAvailability")
    }
  
  }


}
