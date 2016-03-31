
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Thu Mar 31 00:33:22 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_5: javax.inject.Provider[controllers.Application],
  // @LINE:11
  Assets_7: javax.inject.Provider[controllers.Assets],
  // @LINE:14
  Login_3: javax.inject.Provider[controllers.Login],
  // @LINE:19
  AppUsers_2: javax.inject.Provider[controllers.AppUsers],
  // @LINE:28
  Items_4: javax.inject.Provider[controllers.Items],
  // @LINE:51
  Categories_6: javax.inject.Provider[controllers.Categories],
  // @LINE:69
  Stores_1: javax.inject.Provider[controllers.Stores],
  // @LINE:78
  ContactUs_0: javax.inject.Provider[controllers.ContactUs],
  // @LINE:85
  Images_8: javax.inject.Provider[controllers.Images],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: javax.inject.Provider[controllers.Application],
    // @LINE:11
    Assets_7: javax.inject.Provider[controllers.Assets],
    // @LINE:14
    Login_3: javax.inject.Provider[controllers.Login],
    // @LINE:19
    AppUsers_2: javax.inject.Provider[controllers.AppUsers],
    // @LINE:28
    Items_4: javax.inject.Provider[controllers.Items],
    // @LINE:51
    Categories_6: javax.inject.Provider[controllers.Categories],
    // @LINE:69
    Stores_1: javax.inject.Provider[controllers.Stores],
    // @LINE:78
    ContactUs_0: javax.inject.Provider[controllers.ContactUs],
    // @LINE:85
    Images_8: javax.inject.Provider[controllers.Images]
  ) = this(errorHandler, Application_5, Assets_7, Login_3, AppUsers_2, Items_4, Categories_6, Stores_1, ContactUs_0, Images_8, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, Assets_7, Login_3, AppUsers_2, Items_4, Categories_6, Stores_1, ContactUs_0, Images_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """@controllers.Assets@.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """@controllers.Login@.loginPageRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """@controllers.Login@.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """@controllers.Login@.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminpanel/$userId<[^/]+>""", """@controllers.AppUsers@.adminPanelRender(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listakorisnika""", """@controllers.AppUsers@.listOfUsersRender()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreirajkorisnka""", """@controllers.AppUsers@.createUserRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreirajkorisnika""", """@controllers.AppUsers@.createUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """obisikorisnika/$userId<[^/]+>""", """@controllers.AppUsers@.deleteUser(userId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """obisikorisnika/$userId<[^/]+>""", """@controllers.AppUsers@.deleteUser(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjepodataka/$userId<[^/]+>""", """@controllers.AppUsers@.updateAdminInformationsRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjepodataka/$userId<[^/]+>""", """@controllers.AppUsers@.updateAdminInformations(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminpanel/$userId<[^/]+>""", """@controllers.AppUsers@.updateAdminPassword(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodi""", """@controllers.Items@.allItems()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodi/$itemId<[^/]+>""", """@controllers.Items@.showOnHomepage(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userpanel/$userId<[^/]+>""", """@controllers.AppUsers@.userPanelRender(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjepodatakauser/$userId<[^/]+>""", """@controllers.AppUsers@.updateUserInformationsRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjepodatakauser/$userId<[^/]+>""", """@controllers.AppUsers@.updateUserInformations(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userpanel/$userId<[^/]+>""", """@controllers.AppUsers@.updateUserPassword(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listaproizvoda/$userId<[^/]+>""", """@controllers.Items@.listOfItems(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeproizvoda/$itemId<[^/]+>""", """@controllers.Items@.deleteItem(itemId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeproizvoda/$itemId<[^/]+>""", """@controllers.Items@.deleteItem(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjeproizvoda/itemId""", """@controllers.Items@.updateItemRender(itemId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjeproizvoda/itemId""", """@controllers.Items@.updateItem(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreiranjeproizvoda/$userId<[^/]+>""", """@controllers.Items@.createItemRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreiranjeproizvoda/$userId<[^/]+>""", """@controllers.Items@.createItem(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvod/$itemId<[^/]+>""", """@controllers.Items@.itemRender(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kategorije/$categoryId<[^/]+>""", """@controllers.Items@.getItemsWithCategory(categoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """potkategorije/$subcategoryId<[^/]+>""", """@controllers.Items@.getItemsWithSubCategory(subcategoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kategorije""", """@controllers.Categories@.listOfCategories()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.deleteCategory(categoryId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.deleteCategory(categoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreiranjekategorije""", """@controllers.Categories@.createCategoryRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreiranjekategorije""", """@controllers.Categories@.createCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.updateCategoryRender(categoryId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.updateCategory(categoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """podkategorija/$categoryId<[^/]+>""", """@controllers.Categories@.createSubCategoryRender(categoryId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """podkategorija/$categoryId<[^/]+>""", """@controllers.Categories@.createSubCategory(categoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listapodkategorija/$categoryId<[^/]+>""", """@controllers.Categories@.listOfSubCategories(categoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjepodkategorije/$subcategoryId<[^/]+>""", """@controllers.Categories@.updateSubCategoryRender(subcategoryId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjepodkategorije/$subcategoryId<[^/]+>""", """@controllers.Categories@.updateSubCategory(subcategoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjepodkategorije/$subcategoryId<[^/]+>""", """@controllers.Categories@.deleteSubCategory(subcategoryId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjepodkategorije/$subcategoryId<[^/]+>""", """@controllers.Categories@.deleteSubCategory(subcategoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dodajobjekat/$userId<[^/]+>""", """@controllers.Stores@.createStoreRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dodajobjekat/$userId<[^/]+>""", """@controllers.Stores@.createStore(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjeobjekta/$storeId<[^/]+>""", """@controllers.Stores@.updateStoreRender(storeId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjeobjekta/$storeId<[^/]+>""", """@controllers.Stores@.updateStore(storeId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeobjekta/$storeId<[^/]+>""", """@controllers.Stores@.deleteStore(storeId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeobjekta/$storeId<[^/]+>""", """@controllers.Stores@.deleteStore(storeId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listaobjekata/$userId<[^/]+>""", """@controllers.Stores@.listOfStores(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kontakt""", """@controllers.ContactUs@.contactUsRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kontakt""", """@controllers.ContactUs@.contactUs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """faq""", """@controllers.Application@.faqRender()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadslika/$itemId<[^/]+>""", """@controllers.Images@.imagesUploadRender(itemId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadslika/$itemId<[^/]+>""", """@controllers.Images@.imagesUpload(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listaslika/$itemId<[^/]+>""", """@controllers.Images@.listOfPicturesRender(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeslike/$imageId<[^/]+>""", """@controllers.Images@.deleteImage(imageId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeslike/$imageId<[^/]+>""", """@controllers.Images@.deleteImage(imageId:String)"""),
    ("""POST""", this.prefix, """@controllers.Items@.lastTenProducts()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_5.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_7.get.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Login_loginPageRender2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_loginPageRender2_invoker = createInvoker(
    Login_3.get.loginPageRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "loginPageRender",
      Nil,
      "GET",
      """LOGIN""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Login_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_login3_invoker = createInvoker(
    Login_3.get.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Login_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Login_logout4_invoker = createInvoker(
    Login_3.get.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AppUsers_adminPanelRender5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_adminPanelRender5_invoker = createInvoker(
    AppUsers_2.get.adminPanelRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "adminPanelRender",
      Seq(classOf[Integer]),
      "GET",
      """ADMIN""",
      this.prefix + """adminpanel/$userId<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AppUsers_listOfUsersRender6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listakorisnika")))
  )
  private[this] lazy val controllers_AppUsers_listOfUsersRender6_invoker = createInvoker(
    AppUsers_2.get.listOfUsersRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "listOfUsersRender",
      Nil,
      "GET",
      """""",
      this.prefix + """listakorisnika"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AppUsers_createUserRender7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajkorisnka")))
  )
  private[this] lazy val controllers_AppUsers_createUserRender7_invoker = createInvoker(
    AppUsers_2.get.createUserRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "createUserRender",
      Nil,
      "GET",
      """""",
      this.prefix + """kreirajkorisnka"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AppUsers_createUser8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajkorisnika")))
  )
  private[this] lazy val controllers_AppUsers_createUser8_invoker = createInvoker(
    AppUsers_2.get.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """kreirajkorisnika"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AppUsers_deleteUser9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obisikorisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_deleteUser9_invoker = createInvoker(
    AppUsers_2.get.deleteUser(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "deleteUser",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """obisikorisnika/$userId<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AppUsers_deleteUser10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obisikorisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_deleteUser10_invoker = createInvoker(
    AppUsers_2.get.deleteUser(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "deleteUser",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """obisikorisnika/$userId<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AppUsers_updateAdminInformationsRender11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodataka/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateAdminInformationsRender11_invoker = createInvoker(
    AppUsers_2.get.updateAdminInformationsRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "updateAdminInformationsRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azuriranjepodataka/$userId<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AppUsers_updateAdminInformations12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodataka/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateAdminInformations12_invoker = createInvoker(
    AppUsers_2.get.updateAdminInformations(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "updateAdminInformations",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azuriranjepodataka/$userId<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AppUsers_updateAdminPassword13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateAdminPassword13_invoker = createInvoker(
    AppUsers_2.get.updateAdminPassword(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "updateAdminPassword",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """adminpanel/$userId<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Items_allItems14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi")))
  )
  private[this] lazy val controllers_Items_allItems14_invoker = createInvoker(
    Items_4.get.allItems(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "allItems",
      Nil,
      "GET",
      """""",
      this.prefix + """proizvodi"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Items_showOnHomepage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_showOnHomepage15_invoker = createInvoker(
    Items_4.get.showOnHomepage(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "showOnHomepage",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """proizvodi/$itemId<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AppUsers_userPanelRender16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_userPanelRender16_invoker = createInvoker(
    AppUsers_2.get.userPanelRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "userPanelRender",
      Seq(classOf[Integer]),
      "GET",
      """USER""",
      this.prefix + """userpanel/$userId<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_AppUsers_updateUserInformationsRender17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodatakauser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserInformationsRender17_invoker = createInvoker(
    AppUsers_2.get.updateUserInformationsRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "updateUserInformationsRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azuriranjepodatakauser/$userId<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AppUsers_updateUserInformations18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodatakauser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserInformations18_invoker = createInvoker(
    AppUsers_2.get.updateUserInformations(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "updateUserInformations",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azuriranjepodatakauser/$userId<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AppUsers_updateUserPassword19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserPassword19_invoker = createInvoker(
    AppUsers_2.get.updateUserPassword(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "updateUserPassword",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """userpanel/$userId<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Items_listOfItems20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_listOfItems20_invoker = createInvoker(
    Items_4.get.listOfItems(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "listOfItems",
      Seq(classOf[Integer]),
      "GET",
      """ITEM""",
      this.prefix + """listaproizvoda/$userId<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Items_deleteItem21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem21_invoker = createInvoker(
    Items_4.get.deleteItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "deleteItem",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisanjeproizvoda/$itemId<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Items_deleteItem22_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem22_invoker = createInvoker(
    Items_4.get.deleteItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "deleteItem",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """brisanjeproizvoda/$itemId<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Items_updateItemRender23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItemRender23_invoker = createInvoker(
    Items_4.get.updateItemRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "updateItemRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azuriranjeproizvoda/itemId"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Items_updateItem24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItem24_invoker = createInvoker(
    Items_4.get.updateItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "updateItem",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azuriranjeproizvoda/itemId"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Items_createItemRender25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItemRender25_invoker = createInvoker(
    Items_4.get.createItemRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "createItemRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """kreiranjeproizvoda/$userId<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Items_createItem26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItem26_invoker = createInvoker(
    Items_4.get.createItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "createItem",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """kreiranjeproizvoda/$userId<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Items_itemRender27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvod/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_itemRender27_invoker = createInvoker(
    Items_4.get.itemRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "itemRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """proizvod/$itemId<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Items_getItemsWithCategory28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_getItemsWithCategory28_invoker = createInvoker(
    Items_4.get.getItemsWithCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "getItemsWithCategory",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """kategorije/$categoryId<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Items_getItemsWithSubCategory29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("potkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_getItemsWithSubCategory29_invoker = createInvoker(
    Items_4.get.getItemsWithSubCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "getItemsWithSubCategory",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """potkategorije/$subcategoryId<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Categories_listOfCategories30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije")))
  )
  private[this] lazy val controllers_Categories_listOfCategories30_invoker = createInvoker(
    Categories_6.get.listOfCategories(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "listOfCategories",
      Nil,
      "GET",
      """CATEGORIES""",
      this.prefix + """kategorije"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Categories_deleteCategory31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory31_invoker = createInvoker(
    Categories_6.get.deleteCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "deleteCategory",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisanjekategorije/$categoryId<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Categories_deleteCategory32_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory32_invoker = createInvoker(
    Categories_6.get.deleteCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "deleteCategory",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """brisanjekategorije/$categoryId<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Categories_createCategoryRender33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategoryRender33_invoker = createInvoker(
    Categories_6.get.createCategoryRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "createCategoryRender",
      Nil,
      "GET",
      """""",
      this.prefix + """kreiranjekategorije"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Categories_createCategory34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategory34_invoker = createInvoker(
    Categories_6.get.createCategory(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "createCategory",
      Nil,
      "POST",
      """""",
      this.prefix + """kreiranjekategorije"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Categories_updateCategoryRender35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategoryRender35_invoker = createInvoker(
    Categories_6.get.updateCategoryRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "updateCategoryRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azuriranjekategorije/$categoryId<[^/]+>"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Categories_updateCategory36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategory36_invoker = createInvoker(
    Categories_6.get.updateCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "updateCategory",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azuriranjekategorije/$categoryId<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Categories_createSubCategoryRender37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("podkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_createSubCategoryRender37_invoker = createInvoker(
    Categories_6.get.createSubCategoryRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "createSubCategoryRender",
      Seq(classOf[Integer]),
      "GET",
      """SUBCATEGORIES""",
      this.prefix + """podkategorija/$categoryId<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Categories_createSubCategory38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("podkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_createSubCategory38_invoker = createInvoker(
    Categories_6.get.createSubCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "createSubCategory",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """podkategorija/$categoryId<[^/]+>"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Categories_listOfSubCategories39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listapodkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_listOfSubCategories39_invoker = createInvoker(
    Categories_6.get.listOfSubCategories(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "listOfSubCategories",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """listapodkategorija/$categoryId<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Categories_updateSubCategoryRender40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateSubCategoryRender40_invoker = createInvoker(
    Categories_6.get.updateSubCategoryRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "updateSubCategoryRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azuriranjepodkategorije/$subcategoryId<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Categories_updateSubCategory41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateSubCategory41_invoker = createInvoker(
    Categories_6.get.updateSubCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "updateSubCategory",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azuriranjepodkategorije/$subcategoryId<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Categories_deleteSubCategory42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteSubCategory42_invoker = createInvoker(
    Categories_6.get.deleteSubCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "deleteSubCategory",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisanjepodkategorije/$subcategoryId<[^/]+>"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Categories_deleteSubCategory43_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteSubCategory43_invoker = createInvoker(
    Categories_6.get.deleteSubCategory(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "deleteSubCategory",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """brisanjepodkategorije/$subcategoryId<[^/]+>"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Stores_createStoreRender44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajobjekat/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_createStoreRender44_invoker = createInvoker(
    Stores_1.get.createStoreRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "createStoreRender",
      Seq(classOf[Integer]),
      "GET",
      """STORE""",
      this.prefix + """dodajobjekat/$userId<[^/]+>"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Stores_createStore45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajobjekat/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_createStore45_invoker = createInvoker(
    Stores_1.get.createStore(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "createStore",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """dodajobjekat/$userId<[^/]+>"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Stores_updateStoreRender46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_updateStoreRender46_invoker = createInvoker(
    Stores_1.get.updateStoreRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "updateStoreRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azuriranjeobjekta/$storeId<[^/]+>"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Stores_updateStore47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_updateStore47_invoker = createInvoker(
    Stores_1.get.updateStore(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "updateStore",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azuriranjeobjekta/$storeId<[^/]+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_Stores_deleteStore48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_deleteStore48_invoker = createInvoker(
    Stores_1.get.deleteStore(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "deleteStore",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisanjeobjekta/$storeId<[^/]+>"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Stores_deleteStore49_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_deleteStore49_invoker = createInvoker(
    Stores_1.get.deleteStore(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "deleteStore",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """brisanjeobjekta/$storeId<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_Stores_listOfStores50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaobjekata/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_listOfStores50_invoker = createInvoker(
    Stores_1.get.listOfStores(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stores",
      "listOfStores",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """listaobjekata/$userId<[^/]+>"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_ContactUs_contactUsRender51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kontakt")))
  )
  private[this] lazy val controllers_ContactUs_contactUsRender51_invoker = createInvoker(
    ContactUs_0.get.contactUsRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactUs",
      "contactUsRender",
      Nil,
      "GET",
      """CONTACT US""",
      this.prefix + """kontakt"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_ContactUs_contactUs52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kontakt")))
  )
  private[this] lazy val controllers_ContactUs_contactUs52_invoker = createInvoker(
    ContactUs_0.get.contactUs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactUs",
      "contactUs",
      Nil,
      "POST",
      """""",
      this.prefix + """kontakt"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_Application_faqRender53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("faq")))
  )
  private[this] lazy val controllers_Application_faqRender53_invoker = createInvoker(
    Application_5.get.faqRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "faqRender",
      Nil,
      "GET",
      """FAQ""",
      this.prefix + """faq"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Images_imagesUploadRender54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_imagesUploadRender54_invoker = createInvoker(
    Images_8.get.imagesUploadRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "imagesUploadRender",
      Seq(classOf[Integer]),
      "GET",
      """IMAGES""",
      this.prefix + """uploadslika/$itemId<[^/]+>"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_Images_imagesUpload55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_imagesUpload55_invoker = createInvoker(
    Images_8.get.imagesUpload(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "imagesUpload",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """uploadslika/$itemId<[^/]+>"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_Images_listOfPicturesRender56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_listOfPicturesRender56_invoker = createInvoker(
    Images_8.get.listOfPicturesRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "listOfPicturesRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """listaslika/$itemId<[^/]+>"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_Images_deleteImage57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeslike/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteImage57_invoker = createInvoker(
    Images_8.get.deleteImage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "deleteImage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """brisanjeslike/$imageId<[^/]+>"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_Images_deleteImage58_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeslike/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteImage58_invoker = createInvoker(
    Images_8.get.deleteImage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """brisanjeslike/$imageId<[^/]+>"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_Items_lastTenProducts59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Items_lastTenProducts59_invoker = createInvoker(
    Items_4.get.lastTenProducts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "lastTenProducts",
      Nil,
      "POST",
      """AJAX LAST TEN PRODUCTS""",
      this.prefix + """"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_5.get.index())
      }
  
    // @LINE:11
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_7.get.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Login_loginPageRender2_route(params) =>
      call { 
        controllers_Login_loginPageRender2_invoker.call(Login_3.get.loginPageRender())
      }
  
    // @LINE:15
    case controllers_Login_login3_route(params) =>
      call { 
        controllers_Login_login3_invoker.call(Login_3.get.login())
      }
  
    // @LINE:16
    case controllers_Login_logout4_route(params) =>
      call { 
        controllers_Login_logout4_invoker.call(Login_3.get.logout())
      }
  
    // @LINE:19
    case controllers_AppUsers_adminPanelRender5_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_adminPanelRender5_invoker.call(AppUsers_2.get.adminPanelRender(userId))
      }
  
    // @LINE:20
    case controllers_AppUsers_listOfUsersRender6_route(params) =>
      call { 
        controllers_AppUsers_listOfUsersRender6_invoker.call(AppUsers_2.get.listOfUsersRender())
      }
  
    // @LINE:21
    case controllers_AppUsers_createUserRender7_route(params) =>
      call { 
        controllers_AppUsers_createUserRender7_invoker.call(AppUsers_2.get.createUserRender())
      }
  
    // @LINE:22
    case controllers_AppUsers_createUser8_route(params) =>
      call { 
        controllers_AppUsers_createUser8_invoker.call(AppUsers_2.get.createUser())
      }
  
    // @LINE:23
    case controllers_AppUsers_deleteUser9_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser9_invoker.call(AppUsers_2.get.deleteUser(userId))
      }
  
    // @LINE:24
    case controllers_AppUsers_deleteUser10_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser10_invoker.call(AppUsers_2.get.deleteUser(userId))
      }
  
    // @LINE:25
    case controllers_AppUsers_updateAdminInformationsRender11_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformationsRender11_invoker.call(AppUsers_2.get.updateAdminInformationsRender(userId))
      }
  
    // @LINE:26
    case controllers_AppUsers_updateAdminInformations12_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformations12_invoker.call(AppUsers_2.get.updateAdminInformations(userId))
      }
  
    // @LINE:27
    case controllers_AppUsers_updateAdminPassword13_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminPassword13_invoker.call(AppUsers_2.get.updateAdminPassword(userId))
      }
  
    // @LINE:28
    case controllers_Items_allItems14_route(params) =>
      call { 
        controllers_Items_allItems14_invoker.call(Items_4.get.allItems())
      }
  
    // @LINE:29
    case controllers_Items_showOnHomepage15_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_showOnHomepage15_invoker.call(Items_4.get.showOnHomepage(itemId))
      }
  
    // @LINE:32
    case controllers_AppUsers_userPanelRender16_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_userPanelRender16_invoker.call(AppUsers_2.get.userPanelRender(userId))
      }
  
    // @LINE:33
    case controllers_AppUsers_updateUserInformationsRender17_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformationsRender17_invoker.call(AppUsers_2.get.updateUserInformationsRender(userId))
      }
  
    // @LINE:34
    case controllers_AppUsers_updateUserInformations18_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformations18_invoker.call(AppUsers_2.get.updateUserInformations(userId))
      }
  
    // @LINE:35
    case controllers_AppUsers_updateUserPassword19_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserPassword19_invoker.call(AppUsers_2.get.updateUserPassword(userId))
      }
  
    // @LINE:38
    case controllers_Items_listOfItems20_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_listOfItems20_invoker.call(Items_4.get.listOfItems(userId))
      }
  
    // @LINE:39
    case controllers_Items_deleteItem21_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem21_invoker.call(Items_4.get.deleteItem(itemId))
      }
  
    // @LINE:40
    case controllers_Items_deleteItem22_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem22_invoker.call(Items_4.get.deleteItem(itemId))
      }
  
    // @LINE:41
    case controllers_Items_updateItemRender23_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItemRender23_invoker.call(Items_4.get.updateItemRender(itemId))
      }
  
    // @LINE:42
    case controllers_Items_updateItem24_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItem24_invoker.call(Items_4.get.updateItem(itemId))
      }
  
    // @LINE:43
    case controllers_Items_createItemRender25_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItemRender25_invoker.call(Items_4.get.createItemRender(userId))
      }
  
    // @LINE:44
    case controllers_Items_createItem26_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItem26_invoker.call(Items_4.get.createItem(userId))
      }
  
    // @LINE:45
    case controllers_Items_itemRender27_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_itemRender27_invoker.call(Items_4.get.itemRender(itemId))
      }
  
    // @LINE:46
    case controllers_Items_getItemsWithCategory28_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Items_getItemsWithCategory28_invoker.call(Items_4.get.getItemsWithCategory(categoryId))
      }
  
    // @LINE:47
    case controllers_Items_getItemsWithSubCategory29_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Items_getItemsWithSubCategory29_invoker.call(Items_4.get.getItemsWithSubCategory(subcategoryId))
      }
  
    // @LINE:51
    case controllers_Categories_listOfCategories30_route(params) =>
      call { 
        controllers_Categories_listOfCategories30_invoker.call(Categories_6.get.listOfCategories())
      }
  
    // @LINE:52
    case controllers_Categories_deleteCategory31_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory31_invoker.call(Categories_6.get.deleteCategory(categoryId))
      }
  
    // @LINE:53
    case controllers_Categories_deleteCategory32_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory32_invoker.call(Categories_6.get.deleteCategory(categoryId))
      }
  
    // @LINE:54
    case controllers_Categories_createCategoryRender33_route(params) =>
      call { 
        controllers_Categories_createCategoryRender33_invoker.call(Categories_6.get.createCategoryRender())
      }
  
    // @LINE:55
    case controllers_Categories_createCategory34_route(params) =>
      call { 
        controllers_Categories_createCategory34_invoker.call(Categories_6.get.createCategory())
      }
  
    // @LINE:56
    case controllers_Categories_updateCategoryRender35_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategoryRender35_invoker.call(Categories_6.get.updateCategoryRender(categoryId))
      }
  
    // @LINE:57
    case controllers_Categories_updateCategory36_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategory36_invoker.call(Categories_6.get.updateCategory(categoryId))
      }
  
    // @LINE:60
    case controllers_Categories_createSubCategoryRender37_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_createSubCategoryRender37_invoker.call(Categories_6.get.createSubCategoryRender(categoryId))
      }
  
    // @LINE:61
    case controllers_Categories_createSubCategory38_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_createSubCategory38_invoker.call(Categories_6.get.createSubCategory(categoryId))
      }
  
    // @LINE:62
    case controllers_Categories_listOfSubCategories39_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_listOfSubCategories39_invoker.call(Categories_6.get.listOfSubCategories(categoryId))
      }
  
    // @LINE:63
    case controllers_Categories_updateSubCategoryRender40_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_updateSubCategoryRender40_invoker.call(Categories_6.get.updateSubCategoryRender(subcategoryId))
      }
  
    // @LINE:64
    case controllers_Categories_updateSubCategory41_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_updateSubCategory41_invoker.call(Categories_6.get.updateSubCategory(subcategoryId))
      }
  
    // @LINE:65
    case controllers_Categories_deleteSubCategory42_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_deleteSubCategory42_invoker.call(Categories_6.get.deleteSubCategory(subcategoryId))
      }
  
    // @LINE:66
    case controllers_Categories_deleteSubCategory43_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_deleteSubCategory43_invoker.call(Categories_6.get.deleteSubCategory(subcategoryId))
      }
  
    // @LINE:69
    case controllers_Stores_createStoreRender44_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_createStoreRender44_invoker.call(Stores_1.get.createStoreRender(userId))
      }
  
    // @LINE:70
    case controllers_Stores_createStore45_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_createStore45_invoker.call(Stores_1.get.createStore(userId))
      }
  
    // @LINE:71
    case controllers_Stores_updateStoreRender46_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_updateStoreRender46_invoker.call(Stores_1.get.updateStoreRender(storeId))
      }
  
    // @LINE:72
    case controllers_Stores_updateStore47_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_updateStore47_invoker.call(Stores_1.get.updateStore(storeId))
      }
  
    // @LINE:73
    case controllers_Stores_deleteStore48_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_deleteStore48_invoker.call(Stores_1.get.deleteStore(storeId))
      }
  
    // @LINE:74
    case controllers_Stores_deleteStore49_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_deleteStore49_invoker.call(Stores_1.get.deleteStore(storeId))
      }
  
    // @LINE:75
    case controllers_Stores_listOfStores50_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_listOfStores50_invoker.call(Stores_1.get.listOfStores(userId))
      }
  
    // @LINE:78
    case controllers_ContactUs_contactUsRender51_route(params) =>
      call { 
        controllers_ContactUs_contactUsRender51_invoker.call(ContactUs_0.get.contactUsRender())
      }
  
    // @LINE:79
    case controllers_ContactUs_contactUs52_route(params) =>
      call { 
        controllers_ContactUs_contactUs52_invoker.call(ContactUs_0.get.contactUs())
      }
  
    // @LINE:82
    case controllers_Application_faqRender53_route(params) =>
      call { 
        controllers_Application_faqRender53_invoker.call(Application_5.get.faqRender())
      }
  
    // @LINE:85
    case controllers_Images_imagesUploadRender54_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_imagesUploadRender54_invoker.call(Images_8.get.imagesUploadRender(itemId))
      }
  
    // @LINE:86
    case controllers_Images_imagesUpload55_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_imagesUpload55_invoker.call(Images_8.get.imagesUpload(itemId))
      }
  
    // @LINE:87
    case controllers_Images_listOfPicturesRender56_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_listOfPicturesRender56_invoker.call(Images_8.get.listOfPicturesRender(itemId))
      }
  
    // @LINE:88
    case controllers_Images_deleteImage57_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteImage57_invoker.call(Images_8.get.deleteImage(imageId))
      }
  
    // @LINE:89
    case controllers_Images_deleteImage58_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteImage58_invoker.call(Images_8.get.deleteImage(imageId))
      }
  
    // @LINE:92
    case controllers_Items_lastTenProducts59_route(params) =>
      call { 
        controllers_Items_lastTenProducts59_invoker.call(Items_4.get.lastTenProducts())
      }
  }
}