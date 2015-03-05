// @SOURCE:/Users/galinaozkan/Documents/workspace/Riseer/conf/routes
// @HASH:c9ffa68b0d23dfd5bc6bb8909d12bfd604d9c09a
// @DATE:Sat Feb 21 13:42:32 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:10
// @LINE:8
package controllers {

// @LINE:8
class ReverseAssets {


// @LINE:8
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:10
class ReverseApplication {


// @LINE:10
def getProfile(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profiles/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:8
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:8
class ReverseAssets {


// @LINE:8
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:10
class ReverseApplication {


// @LINE:10
def getProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:8
package controllers.ref {


// @LINE:8
class ReverseAssets {


// @LINE:8
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:10
class ReverseApplication {


// @LINE:10
def getProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getProfile(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getProfile", Seq(classOf[Long]), "GET", """""", _prefix + """profiles/$id<[^/]+>""")
)
                      

}
                          
}
        
    