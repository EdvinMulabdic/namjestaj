
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Fri Mar 25 02:19:55 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseCategories(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def listOfCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.listOfCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kategorije"})
        }
      """
    )
  
    // @LINE:50
    def createCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createCategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjekategorije"})
        }
      """
    )
  
    // @LINE:49
    def createCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createCategoryRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjekategorije"})
        }
      """
    )
  
    // @LINE:52
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateCategory",
      """
        function(categoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjekategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:47
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.deleteCategory",
      """
        function(categoryId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjekategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
          }
        
        }
      """
    )
  
    // @LINE:51
    def updateCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateCategoryRender",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjekategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:14
    def loginPageRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.loginPageRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:15
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAppUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def updateUserInformations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateUserInformations",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodatakauser/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:25
    def updateAdminInformationsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateAdminInformationsRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodataka/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:22
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreirajkorisnika"})
        }
      """
    )
  
    // @LINE:20
    def listOfUsersRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.listOfUsersRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listakorisnika"})
        }
      """
    )
  
    // @LINE:19
    def adminPanelRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.adminPanelRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminpanel/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:31
    def updateUserInformationsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateUserInformationsRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodatakauser/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:30
    def userPanelRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.userPanelRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userpanel/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:27
    def updateAdminPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateAdminPassword",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adminpanel/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:21
    def createUserRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.createUserRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreirajkorisnka"})
        }
      """
    )
  
    // @LINE:26
    def updateAdminInformations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateAdminInformations",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodataka/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:33
    def updateUserPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateUserPassword",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userpanel/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:23
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.deleteUser",
      """
        function(userId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "obisikorisnika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
          }
        
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseItems(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def updateItemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.updateItemRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeproizvoda/itemId" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("itemId", itemId)])})
        }
      """
    )
  
    // @LINE:43
    def itemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.itemRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvod/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:41
    def createItemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.createItemRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:37
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.deleteItem",
      """
        function(itemId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
          }
        
        }
      """
    )
  
    // @LINE:40
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.updateItem",
      """
        function(itemId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeproizvoda/itemId" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("itemId", itemId)])})
        }
      """
    )
  
    // @LINE:42
    def createItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.createItem",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:36
    def listOfItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.listOfItems",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
  }


}