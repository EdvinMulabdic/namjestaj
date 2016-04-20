
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Wed Apr 20 11:47:23 CEST 2016

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

  // @LINE:64
  class ReverseCategories(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def createSubCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "podkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:78
    def deleteSubCategory(subcategoryId:Integer): Call = {
    
      (subcategoryId: @unchecked) match {
      
        // @LINE:78
        case (subcategoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
      
      }
    
    }
  
    // @LINE:64
    def listOfCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije")
    }
  
    // @LINE:75
    def listOfSubCategories(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listapodkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:68
    def createCategory(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:67
    def createCategoryRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:70
    def updateCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:65
    def deleteCategory(categoryId:Integer): Call = {
    
      (categoryId: @unchecked) match {
      
        // @LINE:65
        case (categoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
      
      }
    
    }
  
    // @LINE:77
    def updateSubCategory(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:76
    def updateSubCategoryRender(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:73
    def createSubCategoryRender(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "podkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:69
    def updateCategoryRender(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
  }

  // @LINE:116
  class ReverseNewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:123
    def updateNews(newsId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azurirajvijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
    }
  
    // @LINE:116
    def newsRender(newsId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
    }
  
    // @LINE:122
    def updateNewsRender(newsId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azurirajvijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
    }
  
    // @LINE:118
    def createNewsRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreirajvijest")
    }
  
    // @LINE:119
    def createNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreirajvijest")
    }
  
    // @LINE:117
    def newsPanelRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vijestpanel")
    }
  
    // @LINE:120
    def deleteNews(newsId:Integer): Call = {
    
      (newsId: @unchecked) match {
      
        // @LINE:120
        case (newsId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisivijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
      
      }
    
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

  // @LINE:108
  class ReverseMessages(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def deleteMessage(messageId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "brisanjeporuke/" + implicitly[PathBindable[Integer]].unbind("messageId", messageId))
    }
  
    // @LINE:112
    def notifications(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "messagenotif")
    }
  
    // @LINE:110
    def message(messageId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "poruka/" + implicitly[PathBindable[Integer]].unbind("messageId", messageId))
    }
  
    // @LINE:108
    def sendMessage(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "poruka/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:109
    def listOfMessages(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "poruke/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:113
    def listOfMessagesForAdmin(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "porukekoisnika/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }

  // @LINE:82
  class ReverseStores(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def deleteStore(storeId:Integer): Call = {
    
      (storeId: @unchecked) match {
      
        // @LINE:86
        case (storeId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
      
      }
    
    }
  
    // @LINE:88
    def listOfStores(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaobjekata/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:82
    def createStoreRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dodajobjekat/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:84
    def updateStoreRender(storeId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
    }
  
    // @LINE:83
    def createStore(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dodajobjekat/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:85
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

  
    // @LINE:35
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
  
    // @LINE:30
    def isUserActive(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "korisnici/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
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
  
    // @LINE:34
    def updateUserInformationsRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodatakauser/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:33
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
  
    // @LINE:36
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

  
    // @LINE:7
    def unAuthorized(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pogresanunos")
    }
  
    // @LINE:95
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

  // @LINE:91
  class ReverseContactUs(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:91
    def contactUsRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kontakt")
    }
  
    // @LINE:92
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

  
    // @LINE:55
    def getItemsWithPriceRange2(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi150")
    }
  
    // @LINE:60
    def itemsOnSale(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "akcija")
    }
  
    // @LINE:29
    def showOnHomepage(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:105
    def lastTenProducts(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix)
    }
  
    // @LINE:42
    def updateItemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:47
    def getItemsWithCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:48
    def getItemsWithSubCategory(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "potkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:46
    def itemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvod/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:44
    def createItemRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:56
    def getItemsWithPriceRange3(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi200")
    }
  
    // @LINE:51
    def blockUnblockItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "blokiraj/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:57
    def getItemsWithPriceRange4(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodipreko200")
    }
  
    // @LINE:40
    def deleteItem(itemId:Integer): Call = {
    
      (itemId: @unchecked) match {
      
        // @LINE:40
        case (itemId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
      
      }
    
    }
  
    // @LINE:43
    def updateItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:28
    def allItems(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi")
    }
  
    // @LINE:45
    def createItem(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:54
    def getItemsWithPriceRange1(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi100")
    }
  
    // @LINE:39
    def listOfItems(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }

  // @LINE:98
  class ReverseImages(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def imagesUpload(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uploadslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:101
    def deleteImage(imageId:String): Call = {
    
      (imageId: @unchecked) match {
      
        // @LINE:101
        case (imageId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeslike/" + implicitly[PathBindable[String]].unbind("imageId", dynamicString(imageId)))
      
      }
    
    }
  
    // @LINE:98
    def imagesUploadRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "uploadslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:100
    def listOfPicturesRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
  }


}