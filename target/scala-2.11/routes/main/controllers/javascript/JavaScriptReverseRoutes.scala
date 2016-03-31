
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Thu Mar 31 00:33:22 CEST 2016

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

  // @LINE:51
  class ReverseCategories(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def createSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createSubCategory",
      """
        function(categoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "podkategorija/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:65
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
  
    // @LINE:51
    def listOfCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.listOfCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kategorije"})
        }
      """
    )
  
    // @LINE:62
    def listOfSubCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.listOfSubCategories",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listapodkategorija/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:55
    def createCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createCategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjekategorije"})
        }
      """
    )
  
    // @LINE:54
    def createCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createCategoryRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjekategorije"})
        }
      """
    )
  
    // @LINE:57
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateCategory",
      """
        function(categoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjekategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:52
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
  
    // @LINE:64
    def updateSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateSubCategory",
      """
        function(subcategoryId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
        }
      """
    )
  
    // @LINE:63
    def updateSubCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.updateSubCategoryRender",
      """
        function(subcategoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
        }
      """
    )
  
    // @LINE:60
    def createSubCategoryRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.createSubCategoryRender",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "podkategorija/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:56
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

  // @LINE:69
  class ReverseStores(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
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
  
    // @LINE:75
    def listOfStores: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.listOfStores",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaobjekata/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:69
    def createStoreRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.createStoreRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dodajobjekat/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:71
    def updateStoreRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.updateStoreRender",
      """
        function(storeId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeobjekta/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("storeId", storeId)})
        }
      """
    )
  
    // @LINE:70
    def createStore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stores.createStore",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dodajobjekat/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:72
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

  
    // @LINE:34
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
  
    // @LINE:33
    def updateUserInformationsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppUsers.updateUserInformationsRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjepodatakauser/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:32
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
  
    // @LINE:35
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

  
    // @LINE:82
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

  // @LINE:78
  class ReverseContactUs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def contactUsRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactUs.contactUsRender",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kontakt"})
        }
      """
    )
  
    // @LINE:79
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

  
    // @LINE:29
    def showOnHomepage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.showOnHomepage",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvodi/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:92
    def lastTenProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.lastTenProducts",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:41
    def updateItemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.updateItemRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "azuriranjeproizvoda/itemId" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("itemId", itemId)])})
        }
      """
    )
  
    // @LINE:46
    def getItemsWithCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithCategory",
      """
        function(categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("categoryId", categoryId)})
        }
      """
    )
  
    // @LINE:47
    def getItemsWithSubCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.getItemsWithSubCategory",
      """
        function(subcategoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "potkategorije/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("subcategoryId", subcategoryId)})
        }
      """
    )
  
    // @LINE:45
    def itemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.itemRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proizvod/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:43
    def createItemRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.createItemRender",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:39
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
  
    // @LINE:42
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
  
    // @LINE:44
    def createItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.createItem",
      """
        function(userId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kreiranjeproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
    // @LINE:38
    def listOfItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.listOfItems",
      """
        function(userId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaproizvoda/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("userId", userId)})
        }
      """
    )
  
  }

  // @LINE:85
  class ReverseImages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def imagesUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Images.imagesUpload",
      """
        function(itemId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadslika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:88
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
  
    // @LINE:85
    def imagesUploadRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Images.imagesUploadRender",
      """
        function(itemId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadslika/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("itemId", itemId)})
        }
      """
    )
  
    // @LINE:87
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