
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Sun May 15 23:50:58 CEST 2016

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

  // @LINE:73
  class ReverseCategories(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:83
    def createSubCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "podkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:87
    def deleteSubCategory(subcategoryId:Integer): Call = {
    
      (subcategoryId: @unchecked) match {
      
        // @LINE:87
        case (subcategoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
      
      }
    
    }
  
    // @LINE:73
    def listOfCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije")
    }
  
    // @LINE:84
    def listOfSubCategories(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listapodkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:77
    def createCategory(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:76
    def createCategoryRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjekategorije")
    }
  
    // @LINE:79
    def updateCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:74
    def deleteCategory(categoryId:Integer): Call = {
    
      (categoryId: @unchecked) match {
      
        // @LINE:74
        case (categoryId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
      
      }
    
    }
  
    // @LINE:86
    def updateSubCategory(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:85
    def updateSubCategoryRender(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:82
    def createSubCategoryRender(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "podkategorija/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:78
    def updateCategoryRender(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjekategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
  }

  // @LINE:129
  class ReverseNewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def updateNews(newsId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azurirajvijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
    }
  
    // @LINE:129
    def newsRender(newsId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
    }
  
    // @LINE:135
    def updateNewsRender(newsId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azurirajvijest/" + implicitly[PathBindable[Integer]].unbind("newsId", newsId))
    }
  
    // @LINE:131
    def createNewsRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreirajvijest")
    }
  
    // @LINE:132
    def createNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreirajvijest")
    }
  
    // @LINE:130
    def newsPanelRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vijestpanel")
    }
  
    // @LINE:133
    def deleteNews(newsId:Integer): Call = {
    
      (newsId: @unchecked) match {
      
        // @LINE:133
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

  // @LINE:119
  class ReverseMessages(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:125
    def sendMessage2(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "porukauseru/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:122
    def deleteMessage(messageId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "brisanjeporuke/" + implicitly[PathBindable[Integer]].unbind("messageId", messageId))
    }
  
    // @LINE:123
    def notifications(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "messagenotif")
    }
  
    // @LINE:121
    def message(messageId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "poruka/" + implicitly[PathBindable[Integer]].unbind("messageId", messageId))
    }
  
    // @LINE:119
    def sendMessage(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "poruka/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:120
    def listOfMessages(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "poruke/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:124
    def listOfMessagesForAdmin(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "porukekoisnika/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }

  // @LINE:145
  class ReversePartners(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:145
    def partnerPanel(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "partneri")
    }
  
    // @LINE:146
    def partnerPageRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "partner/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }

  // @LINE:91
  class ReverseStores(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:95
    def deleteStore(storeId:Integer): Call = {
    
      (storeId: @unchecked) match {
      
        // @LINE:95
        case (storeId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
      
      }
    
    }
  
    // @LINE:97
    def listOfStores(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaobjekata/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:91
    def createStoreRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dodajobjekat/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:93
    def updateStoreRender(storeId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeobjekta/" + implicitly[PathBindable[Integer]].unbind("storeId", storeId))
    }
  
    // @LINE:92
    def createStore(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dodajobjekat/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:94
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

  
    // @LINE:43
    def imagesUpload(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "logo/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:38
    def updateUserInformations(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjepodatakauser/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:25
    def updateAdminInformationsRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodataka/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:41
    def userDescription(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "opis/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
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
  
    // @LINE:40
    def userDescriptionRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "opis/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:42
    def imagesUploadRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logo/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:37
    def updateUserInformationsRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjepodatakauser/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:36
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
  
    // @LINE:39
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
  
    // @LINE:104
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

  // @LINE:139
  class ReverseReviews(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:140
    def itemReviews(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ocjene/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:141
    def deleteReview(reviewId:Integer): Call = {
    
      (reviewId: @unchecked) match {
      
        // @LINE:141
        case (reviewId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeocjene/" + implicitly[PathBindable[Integer]].unbind("reviewId", reviewId))
      
      }
    
    }
  
    // @LINE:139
    def saveReview(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "review/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
  }

  // @LINE:100
  class ReverseContactUs(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:100
    def contactUsRender(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kontakt")
    }
  
    // @LINE:101
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

  
    // @LINE:149
    def searchBox(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "pretraga")
    }
  
    // @LINE:31
    def usersItems(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodikorisnika/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:64
    def getItemsWithPriceRange2(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi150")
    }
  
    // @LINE:69
    def itemsOnSale(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "akcija")
    }
  
    // @LINE:29
    def showOnHomepage(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:116
    def lastTenProducts(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix)
    }
  
    // @LINE:50
    def updateItemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:55
    def getItemsWithCategory(categoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kategorije/" + implicitly[PathBindable[Integer]].unbind("categoryId", categoryId))
    }
  
    // @LINE:56
    def getItemsWithSubCategory(subcategoryId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "potkategorije/" + implicitly[PathBindable[Integer]].unbind("subcategoryId", subcategoryId))
    }
  
    // @LINE:54
    def itemRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvod/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:60
    def activateDeactivateItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "aktiviraj/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:52
    def createItemRender(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:65
    def getItemsWithPriceRange3(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi200")
    }
  
    // @LINE:59
    def blockUnblockItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "blokiraj/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:66
    def getItemsWithPriceRange4(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodipreko200")
    }
  
    // @LINE:48
    def deleteItem(itemId:Integer): Call = {
    
      (itemId: @unchecked) match {
      
        // @LINE:48
        case (itemId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
      
      }
    
    }
  
    // @LINE:150
    def searchBoxMobile(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "pretragatelefon")
    }
  
    // @LINE:51
    def updateItem(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "azuriranjeproizvoda/itemId" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("itemId", itemId)))))
    }
  
    // @LINE:28
    def allItems(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi")
    }
  
    // @LINE:53
    def createItem(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kreiranjeproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
    // @LINE:63
    def getItemsWithPriceRange1(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proizvodi100")
    }
  
    // @LINE:47
    def listOfItems(userId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaproizvoda/" + implicitly[PathBindable[Integer]].unbind("userId", userId))
    }
  
  }

  // @LINE:107
  class ReverseImages(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def imagesUpload(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uploadslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:112
    def deleteLogo(imageId:String): Call = {
    
      (imageId: @unchecked) match {
      
        // @LINE:112
        case (imageId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjelogo/" + implicitly[PathBindable[String]].unbind("imageId", dynamicString(imageId)))
      
      }
    
    }
  
    // @LINE:110
    def deleteImage(imageId:String): Call = {
    
      (imageId: @unchecked) match {
      
        // @LINE:110
        case (imageId)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "brisanjeslike/" + implicitly[PathBindable[String]].unbind("imageId", dynamicString(imageId)))
      
      }
    
    }
  
    // @LINE:107
    def imagesUploadRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "uploadslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
    // @LINE:109
    def listOfPicturesRender(itemId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listaslika/" + implicitly[PathBindable[Integer]].unbind("itemId", itemId))
    }
  
  }


}