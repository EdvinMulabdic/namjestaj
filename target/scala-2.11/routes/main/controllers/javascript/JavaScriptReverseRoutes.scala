
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Fri Apr 22 20:05:54 CEST 2016

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

  // @LINE:68
  class ReverseCategories(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def createSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createSubCategory",
      """
        function(categoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "podkategorija/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:82
    def deleteSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.deleteSubCategory",
      """
        function(subcategoryId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjepodkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
          }
        
        }
      """
    )
  
    // @LINE:68
    def listOfCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.listOfCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kategorije"})
        }
      """
    )
  
    // @LINE:79
    def listOfSubCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.listOfSubCategories",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listapodkategorija/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:72
    def createCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createCategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjekategorije"})
        }
      """
    )
  
    // @LINE:71
    def createCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createCategoryRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjekategorije"})
        }
      """
    )
  
    // @LINE:74
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateCategory",
      """
        function(categoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjekategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:69
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
  
    // @LINE:81
    def updateSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateSubCategory",
      """
        function(subcategoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
        }
      """
    )
  
    // @LINE:80
    def updateSubCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateSubCategoryRender",
      """
        function(subcategoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
        }
      """
    )
  
    // @LINE:77
    def createSubCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createSubCategoryRender",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "podkategorija/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:73
    def updateCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateCategoryRender",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjekategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
  }

  // @LINE:120
  class ReverseNewsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:127
    def updateNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateNews",
      """
        function(newsId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azurirajvijest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("newsId", newsId)})
        }
      """
    )
  
    // @LINE:120
    def newsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.newsRender",
      """
        function(newsId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vijest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("newsId", newsId)})
        }
      """
    )
  
    // @LINE:126
    def updateNewsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateNewsRender",
      """
        function(newsId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azurirajvijest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("newsId", newsId)})
        }
      """
    )
  
    // @LINE:122
    def createNewsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.createNewsRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreirajvijest"})
        }
      """
    )
  
    // @LINE:123
    def createNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.createNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreirajvijest"})
        }
      """
    )
  
    // @LINE:121
    def newsPanelRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.newsPanelRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vijestpanel"})
        }
      """
    )
  
    // @LINE:124
    def deleteNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.deleteNews",
      """
        function(newsId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisivijest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("newsId", newsId)})
          }
        
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

  // @LINE:112
  class ReverseMessages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:115
    def deleteMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Messages.deleteMessage",
      """
        function(messageId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjeporuke/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("messageId", messageId)})
        }
      """
    )
  
    // @LINE:116
    def notifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Messages.notifications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messagenotif"})
        }
      """
    )
  
    // @LINE:114
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Messages.message",
      """
        function(messageId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "poruka/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("messageId", messageId)})
        }
      """
    )
  
    // @LINE:112
    def sendMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Messages.sendMessage",
      """
        function(itemId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "poruka/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:113
    def listOfMessages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Messages.listOfMessages",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "poruke/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:117
    def listOfMessagesForAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Messages.listOfMessagesForAdmin",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "porukekoisnika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
  }

  // @LINE:86
  class ReverseStores(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def deleteStore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.deleteStore",
      """
        function(storeId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjeobjekta/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("storeId", storeId)})
          }
        
        }
      """
    )
  
    // @LINE:92
    def listOfStores: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.listOfStores",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaobjekata/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:86
    def createStoreRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.createStoreRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dodajobjekat/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:88
    def updateStoreRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.updateStoreRender",
      """
        function(storeId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeobjekta/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("storeId", storeId)})
        }
      """
    )
  
    // @LINE:87
    def createStore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.createStore",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dodajobjekat/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:89
    def updateStore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.updateStore",
      """
        function(storeId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeobjekta/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("storeId", storeId)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAppUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
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
  
    // @LINE:30
    def isUserActive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.isUserActive",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "korisnici/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
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
  
    // @LINE:37
    def updateUserInformationsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateUserInformationsRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodatakauser/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:36
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
  
    // @LINE:39
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

  
    // @LINE:7
    def unAuthorized: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.unAuthorized",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pogresanunos"})
        }
      """
    )
  
    // @LINE:99
    def faqRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.faqRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faq"})
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
  
  }

  // @LINE:130
  class ReverseReviews(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:131
    def itemReviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reviews.itemReviews",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ocjene/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:132
    def deleteReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reviews.deleteReview",
      """
        function(reviewId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjeocjene/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("reviewId", reviewId)})
          }
        
        }
      """
    )
  
    // @LINE:130
    def saveReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reviews.saveReview",
      """
        function(itemId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "review/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
  }

  // @LINE:95
  class ReverseContactUs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:95
    def contactUsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactUs.contactUsRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kontakt"})
        }
      """
    )
  
    // @LINE:96
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactUs.contactUs",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kontakt"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseItems(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def usersItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.usersItems",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodikorisnika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:59
    def getItemsWithPriceRange2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithPriceRange2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodi150"})
        }
      """
    )
  
    // @LINE:64
    def itemsOnSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.itemsOnSale",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "akcija"})
        }
      """
    )
  
    // @LINE:29
    def showOnHomepage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.showOnHomepage",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodi/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:109
    def lastTenProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.lastTenProducts",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:45
    def updateItemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.updateItemRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeproizvoda/itemId" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("itemId", itemId)])})
        }
      """
    )
  
    // @LINE:50
    def getItemsWithCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithCategory",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:51
    def getItemsWithSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithSubCategory",
      """
        function(subcategoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "potkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
        }
      """
    )
  
    // @LINE:49
    def itemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.itemRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvod/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:55
    def activateDeactivateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.activateDeactivateItem",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aktiviraj/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:47
    def createItemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.createItemRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:60
    def getItemsWithPriceRange3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithPriceRange3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodi200"})
        }
      """
    )
  
    // @LINE:54
    def blockUnblockItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.blockUnblockItem",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blokiraj/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:61
    def getItemsWithPriceRange4: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithPriceRange4",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodipreko200"})
        }
      """
    )
  
    // @LINE:43
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
  
    // @LINE:46
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.updateItem",
      """
        function(itemId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeproizvoda/itemId" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("itemId", itemId)])})
        }
      """
    )
  
    // @LINE:28
    def allItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.allItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodi"})
        }
      """
    )
  
    // @LINE:48
    def createItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.createItem",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:58
    def getItemsWithPriceRange1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithPriceRange1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodi100"})
        }
      """
    )
  
    // @LINE:42
    def listOfItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.listOfItems",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
  }

  // @LINE:102
  class ReverseImages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def imagesUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Images.imagesUpload",
      """
        function(itemId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadslika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:105
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Images.deleteImage",
      """
        function(imageId) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "brisanjeslike/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("imageId", encodeURIComponent(imageId))})
          }
        
        }
      """
    )
  
    // @LINE:102
    def imagesUploadRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Images.imagesUploadRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadslika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:104
    def listOfPicturesRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Images.listOfPicturesRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaslika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
  }


}