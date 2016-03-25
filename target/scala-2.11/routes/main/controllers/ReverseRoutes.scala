
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Fri Mar 25 02:19:55 CET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:46
  class ReverseCategories(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def listOfCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije")
    }
  
    // @LINE:50
    def createCategory(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:49
    def createCategoryRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:52
    def updateCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:47
    def deleteCategory(categoryId:Integer): Call = {
    
      (categoryId: @unchecked) match {
      
        // @LINE:47
        case (categoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
      
      }
    
    }
  
    // @LINE:51
    def updateCategoryRender(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
  }

  // @LINE:14
  class ReverseLogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:14
    def loginPageRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:15
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:19
  class ReverseAppUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def updateUserInformations(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjepodatakauser/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:25
    def updateAdminInformationsRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodataka/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:22
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreirajkorisnika")
    }
  
    // @LINE:20
    def listOfUsersRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listakorisnika")
    }
  
    // @LINE:19
    def adminPanelRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminpanel/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:31
    def updateUserInformationsRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodatakauser/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:30
    def userPanelRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "userpanel/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:27
    def updateAdminPassword(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "adminpanel/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:21
    def createUserRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreirajkorisnka")
    }
  
    // @LINE:26
    def updateAdminInformations(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjepodataka/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:33
    def updateUserPassword(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "userpanel/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:23
    def deleteUser(userId:Integer): Call = {
    
      (userId: @unchecked) match {
      
        // @LINE:23
        case (userId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "obisikorisnika/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
      
      }
    
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:36
  class ReverseItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def updateItemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:43
    def itemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvod/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:41
    def createItemRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:37
    def deleteItem(itemId:Integer): Call = {
    
      (itemId: @unchecked) match {
      
        // @LINE:37
        case (itemId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
      
      }
    
    }
  
    // @LINE:40
    def updateItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:42
    def createItem(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:36
    def listOfItems(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }


}