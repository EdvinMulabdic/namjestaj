
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Thu Mar 31 00:33:22 CEST 2016

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

  // @LINE:51
  class ReverseCategories(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def createSubCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "podkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:65
    def deleteSubCategory(subcategoryId:Integer): Call = {
    
      (subcategoryId: @unchecked) match {
      
        // @LINE:65
        case (subcategoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
      
      }
    
    }
  
    // @LINE:51
    def listOfCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije")
    }
  
    // @LINE:62
    def listOfSubCategories(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listapodkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:55
    def createCategory(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:54
    def createCategoryRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:57
    def updateCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:52
    def deleteCategory(categoryId:Integer): Call = {
    
      (categoryId: @unchecked) match {
      
        // @LINE:52
        case (categoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
      
      }
    
    }
  
    // @LINE:64
    def updateSubCategory(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:63
    def updateSubCategoryRender(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:60
    def createSubCategoryRender(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "podkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:56
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

  // @LINE:69
  class ReverseStores(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def deleteStore(storeId:Integer): Call = {
    
      (storeId: @unchecked) match {
      
        // @LINE:73
        case (storeId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
      
      }
    
    }
  
    // @LINE:75
    def listOfStores(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaobjekata/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:69
    def createStoreRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dodajobjekat/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:71
    def updateStoreRender(storeId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
    }
  
    // @LINE:70
    def createStore(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dodajobjekat/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:72
    def updateStore(storeId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
    }
  
  }

  // @LINE:19
  class ReverseAppUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
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
  
    // @LINE:33
    def updateUserInformationsRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodatakauser/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:32
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
  
    // @LINE:35
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

  
    // @LINE:82
    def faqRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "faq")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:78
  class ReverseContactUs(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def contactUsRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kontakt")
    }
  
    // @LINE:79
    def contactUs(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kontakt")
    }
  
  }

  // @LINE:28
  class ReverseItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def showOnHomepage(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:92
    def lastTenProducts(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix)
    }
  
    // @LINE:41
    def updateItemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:46
    def getItemsWithCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:47
    def getItemsWithSubCategory(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "potkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:45
    def itemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvod/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:43
    def createItemRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:39
    def deleteItem(itemId:Integer): Call = {
    
      (itemId: @unchecked) match {
      
        // @LINE:39
        case (itemId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
      
      }
    
    }
  
    // @LINE:42
    def updateItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:28
    def allItems(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi")
    }
  
    // @LINE:44
    def createItem(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:38
    def listOfItems(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }

  // @LINE:85
  class ReverseImages(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def imagesUpload(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uploadslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:88
    def deleteImage(imageId:String): Call = {
    
      (imageId: @unchecked) match {
      
        // @LINE:88
        case (imageId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeslike/" + implicitly[PathBindable[String]].unbind("imageId", dynamicString(imageId)))
      
      }
    
    }
  
    // @LINE:85
    def imagesUploadRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "uploadslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:87
    def listOfPicturesRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
  }


}