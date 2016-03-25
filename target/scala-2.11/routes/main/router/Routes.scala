
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Fri Mar 25 02:19:55 CET 2016

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
  Application_3: javax.inject.Provider[controllers.Application],
  // @LINE:11
  Assets_5: javax.inject.Provider[controllers.Assets],
  // @LINE:14
  Login_1: javax.inject.Provider[controllers.Login],
  // @LINE:19
  AppUsers_0: javax.inject.Provider[controllers.AppUsers],
  // @LINE:36
  Items_2: javax.inject.Provider[controllers.Items],
  // @LINE:46
  Categories_4: javax.inject.Provider[controllers.Categories],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: javax.inject.Provider[controllers.Application],
    // @LINE:11
    Assets_5: javax.inject.Provider[controllers.Assets],
    // @LINE:14
    Login_1: javax.inject.Provider[controllers.Login],
    // @LINE:19
    AppUsers_0: javax.inject.Provider[controllers.AppUsers],
    // @LINE:36
    Items_2: javax.inject.Provider[controllers.Items],
    // @LINE:46
    Categories_4: javax.inject.Provider[controllers.Categories]
  ) = this(errorHandler, Application_3, Assets_5, Login_1, AppUsers_0, Items_2, Categories_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, Assets_5, Login_1, AppUsers_0, Items_2, Categories_4, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kategorije""", """@controllers.Categories@.listOfCategories()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.deleteCategory(categoryId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.deleteCategory(categoryId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreiranjekategorije""", """@controllers.Categories@.createCategoryRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreiranjekategorije""", """@controllers.Categories@.createCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.updateCategoryRender(categoryId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azuriranjekategorije/$categoryId<[^/]+>""", """@controllers.Categories@.updateCategory(categoryId:Integer)"""),
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
    Application_3.get.index(),
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
    Assets_5.get.versioned(fakeValue[String], fakeValue[Asset]),
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
    Login_1.get.loginPageRender(),
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
    Login_1.get.login(),
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
    Login_1.get.logout(),
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
    AppUsers_0.get.adminPanelRender(fakeValue[Integer]),
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
    AppUsers_0.get.listOfUsersRender(),
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
    AppUsers_0.get.createUserRender(),
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
    AppUsers_0.get.createUser(),
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
    AppUsers_0.get.deleteUser(fakeValue[Integer]),
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
    AppUsers_0.get.deleteUser(fakeValue[Integer]),
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
    AppUsers_0.get.updateAdminInformationsRender(fakeValue[Integer]),
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
    AppUsers_0.get.updateAdminInformations(fakeValue[Integer]),
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
    AppUsers_0.get.updateAdminPassword(fakeValue[Integer]),
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

  // @LINE:30
  private[this] lazy val controllers_AppUsers_userPanelRender14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_userPanelRender14_invoker = createInvoker(
    AppUsers_0.get.userPanelRender(fakeValue[Integer]),
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

  // @LINE:31
  private[this] lazy val controllers_AppUsers_updateUserInformationsRender15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodatakauser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserInformationsRender15_invoker = createInvoker(
    AppUsers_0.get.updateUserInformationsRender(fakeValue[Integer]),
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

  // @LINE:32
  private[this] lazy val controllers_AppUsers_updateUserInformations16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodatakauser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserInformations16_invoker = createInvoker(
    AppUsers_0.get.updateUserInformations(fakeValue[Integer]),
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

  // @LINE:33
  private[this] lazy val controllers_AppUsers_updateUserPassword17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserPassword17_invoker = createInvoker(
    AppUsers_0.get.updateUserPassword(fakeValue[Integer]),
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

  // @LINE:36
  private[this] lazy val controllers_Items_listOfItems18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_listOfItems18_invoker = createInvoker(
    Items_2.get.listOfItems(fakeValue[Integer]),
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

  // @LINE:37
  private[this] lazy val controllers_Items_deleteItem19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem19_invoker = createInvoker(
    Items_2.get.deleteItem(fakeValue[Integer]),
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

  // @LINE:38
  private[this] lazy val controllers_Items_deleteItem20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem20_invoker = createInvoker(
    Items_2.get.deleteItem(fakeValue[Integer]),
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

  // @LINE:39
  private[this] lazy val controllers_Items_updateItemRender21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItemRender21_invoker = createInvoker(
    Items_2.get.updateItemRender(fakeValue[Integer]),
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

  // @LINE:40
  private[this] lazy val controllers_Items_updateItem22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItem22_invoker = createInvoker(
    Items_2.get.updateItem(fakeValue[Integer]),
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

  // @LINE:41
  private[this] lazy val controllers_Items_createItemRender23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItemRender23_invoker = createInvoker(
    Items_2.get.createItemRender(fakeValue[Integer]),
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

  // @LINE:42
  private[this] lazy val controllers_Items_createItem24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItem24_invoker = createInvoker(
    Items_2.get.createItem(fakeValue[Integer]),
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

  // @LINE:43
  private[this] lazy val controllers_Items_itemRender25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvod/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_itemRender25_invoker = createInvoker(
    Items_2.get.itemRender(fakeValue[Integer]),
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
  private[this] lazy val controllers_Categories_listOfCategories26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije")))
  )
  private[this] lazy val controllers_Categories_listOfCategories26_invoker = createInvoker(
    Categories_4.get.listOfCategories(),
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

  // @LINE:47
  private[this] lazy val controllers_Categories_deleteCategory27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory27_invoker = createInvoker(
    Categories_4.get.deleteCategory(fakeValue[Integer]),
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

  // @LINE:48
  private[this] lazy val controllers_Categories_deleteCategory28_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory28_invoker = createInvoker(
    Categories_4.get.deleteCategory(fakeValue[Integer]),
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

  // @LINE:49
  private[this] lazy val controllers_Categories_createCategoryRender29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategoryRender29_invoker = createInvoker(
    Categories_4.get.createCategoryRender(),
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

  // @LINE:50
  private[this] lazy val controllers_Categories_createCategory30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategory30_invoker = createInvoker(
    Categories_4.get.createCategory(),
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

  // @LINE:51
  private[this] lazy val controllers_Categories_updateCategoryRender31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategoryRender31_invoker = createInvoker(
    Categories_4.get.updateCategoryRender(fakeValue[Integer]),
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

  // @LINE:52
  private[this] lazy val controllers_Categories_updateCategory32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategory32_invoker = createInvoker(
    Categories_4.get.updateCategory(fakeValue[Integer]),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_3.get.index())
      }
  
    // @LINE:11
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_5.get.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Login_loginPageRender2_route(params) =>
      call { 
        controllers_Login_loginPageRender2_invoker.call(Login_1.get.loginPageRender())
      }
  
    // @LINE:15
    case controllers_Login_login3_route(params) =>
      call { 
        controllers_Login_login3_invoker.call(Login_1.get.login())
      }
  
    // @LINE:16
    case controllers_Login_logout4_route(params) =>
      call { 
        controllers_Login_logout4_invoker.call(Login_1.get.logout())
      }
  
    // @LINE:19
    case controllers_AppUsers_adminPanelRender5_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_adminPanelRender5_invoker.call(AppUsers_0.get.adminPanelRender(userId))
      }
  
    // @LINE:20
    case controllers_AppUsers_listOfUsersRender6_route(params) =>
      call { 
        controllers_AppUsers_listOfUsersRender6_invoker.call(AppUsers_0.get.listOfUsersRender())
      }
  
    // @LINE:21
    case controllers_AppUsers_createUserRender7_route(params) =>
      call { 
        controllers_AppUsers_createUserRender7_invoker.call(AppUsers_0.get.createUserRender())
      }
  
    // @LINE:22
    case controllers_AppUsers_createUser8_route(params) =>
      call { 
        controllers_AppUsers_createUser8_invoker.call(AppUsers_0.get.createUser())
      }
  
    // @LINE:23
    case controllers_AppUsers_deleteUser9_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser9_invoker.call(AppUsers_0.get.deleteUser(userId))
      }
  
    // @LINE:24
    case controllers_AppUsers_deleteUser10_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser10_invoker.call(AppUsers_0.get.deleteUser(userId))
      }
  
    // @LINE:25
    case controllers_AppUsers_updateAdminInformationsRender11_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformationsRender11_invoker.call(AppUsers_0.get.updateAdminInformationsRender(userId))
      }
  
    // @LINE:26
    case controllers_AppUsers_updateAdminInformations12_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformations12_invoker.call(AppUsers_0.get.updateAdminInformations(userId))
      }
  
    // @LINE:27
    case controllers_AppUsers_updateAdminPassword13_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminPassword13_invoker.call(AppUsers_0.get.updateAdminPassword(userId))
      }
  
    // @LINE:30
    case controllers_AppUsers_userPanelRender14_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_userPanelRender14_invoker.call(AppUsers_0.get.userPanelRender(userId))
      }
  
    // @LINE:31
    case controllers_AppUsers_updateUserInformationsRender15_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformationsRender15_invoker.call(AppUsers_0.get.updateUserInformationsRender(userId))
      }
  
    // @LINE:32
    case controllers_AppUsers_updateUserInformations16_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformations16_invoker.call(AppUsers_0.get.updateUserInformations(userId))
      }
  
    // @LINE:33
    case controllers_AppUsers_updateUserPassword17_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserPassword17_invoker.call(AppUsers_0.get.updateUserPassword(userId))
      }
  
    // @LINE:36
    case controllers_Items_listOfItems18_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_listOfItems18_invoker.call(Items_2.get.listOfItems(userId))
      }
  
    // @LINE:37
    case controllers_Items_deleteItem19_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem19_invoker.call(Items_2.get.deleteItem(itemId))
      }
  
    // @LINE:38
    case controllers_Items_deleteItem20_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem20_invoker.call(Items_2.get.deleteItem(itemId))
      }
  
    // @LINE:39
    case controllers_Items_updateItemRender21_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItemRender21_invoker.call(Items_2.get.updateItemRender(itemId))
      }
  
    // @LINE:40
    case controllers_Items_updateItem22_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItem22_invoker.call(Items_2.get.updateItem(itemId))
      }
  
    // @LINE:41
    case controllers_Items_createItemRender23_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItemRender23_invoker.call(Items_2.get.createItemRender(userId))
      }
  
    // @LINE:42
    case controllers_Items_createItem24_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItem24_invoker.call(Items_2.get.createItem(userId))
      }
  
    // @LINE:43
    case controllers_Items_itemRender25_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_itemRender25_invoker.call(Items_2.get.itemRender(itemId))
      }
  
    // @LINE:46
    case controllers_Categories_listOfCategories26_route(params) =>
      call { 
        controllers_Categories_listOfCategories26_invoker.call(Categories_4.get.listOfCategories())
      }
  
    // @LINE:47
    case controllers_Categories_deleteCategory27_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory27_invoker.call(Categories_4.get.deleteCategory(categoryId))
      }
  
    // @LINE:48
    case controllers_Categories_deleteCategory28_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory28_invoker.call(Categories_4.get.deleteCategory(categoryId))
      }
  
    // @LINE:49
    case controllers_Categories_createCategoryRender29_route(params) =>
      call { 
        controllers_Categories_createCategoryRender29_invoker.call(Categories_4.get.createCategoryRender())
      }
  
    // @LINE:50
    case controllers_Categories_createCategory30_route(params) =>
      call { 
        controllers_Categories_createCategory30_invoker.call(Categories_4.get.createCategory())
      }
  
    // @LINE:51
    case controllers_Categories_updateCategoryRender31_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategoryRender31_invoker.call(Categories_4.get.updateCategoryRender(categoryId))
      }
  
    // @LINE:52
    case controllers_Categories_updateCategory32_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategory32_invoker.call(Categories_4.get.updateCategory(categoryId))
      }
  }
}