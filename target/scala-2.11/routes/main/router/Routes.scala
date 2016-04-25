
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Fri Apr 22 20:05:54 CEST 2016

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
  Application_8: javax.inject.Provider[controllers.Application],
  // @LINE:11
  Assets_10: javax.inject.Provider[controllers.Assets],
  // @LINE:14
  Login_6: javax.inject.Provider[controllers.Login],
  // @LINE:19
  AppUsers_5: javax.inject.Provider[controllers.AppUsers],
  // @LINE:28
  Items_7: javax.inject.Provider[controllers.Items],
  // @LINE:68
  Categories_9: javax.inject.Provider[controllers.Categories],
  // @LINE:86
  Stores_4: javax.inject.Provider[controllers.Stores],
  // @LINE:95
  ContactUs_0: javax.inject.Provider[controllers.ContactUs],
  // @LINE:102
  Images_11: javax.inject.Provider[controllers.Images],
  // @LINE:112
  Messages_2: javax.inject.Provider[controllers.Messages],
  // @LINE:120
  NewsController_1: javax.inject.Provider[controllers.NewsController],
  // @LINE:130
  Reviews_3: javax.inject.Provider[controllers.Reviews],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_8: javax.inject.Provider[controllers.Application],
    // @LINE:11
    Assets_10: javax.inject.Provider[controllers.Assets],
    // @LINE:14
    Login_6: javax.inject.Provider[controllers.Login],
    // @LINE:19
    AppUsers_5: javax.inject.Provider[controllers.AppUsers],
    // @LINE:28
    Items_7: javax.inject.Provider[controllers.Items],
    // @LINE:68
    Categories_9: javax.inject.Provider[controllers.Categories],
    // @LINE:86
    Stores_4: javax.inject.Provider[controllers.Stores],
    // @LINE:95
    ContactUs_0: javax.inject.Provider[controllers.ContactUs],
    // @LINE:102
    Images_11: javax.inject.Provider[controllers.Images],
    // @LINE:112
    Messages_2: javax.inject.Provider[controllers.Messages],
    // @LINE:120
    NewsController_1: javax.inject.Provider[controllers.NewsController],
    // @LINE:130
    Reviews_3: javax.inject.Provider[controllers.Reviews]
  ) = this(errorHandler, Application_8, Assets_10, Login_6, AppUsers_5, Items_7, Categories_9, Stores_4, ContactUs_0, Images_11, Messages_2, NewsController_1, Reviews_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_8, Assets_10, Login_6, AppUsers_5, Items_7, Categories_9, Stores_4, ContactUs_0, Images_11, Messages_2, NewsController_1, Reviews_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pogresanunos""", """@controllers.Application@.unAuthorized()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """korisnici/$userId<[^/]+>""", """@controllers.AppUsers@.isUserActive(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodikorisnika/$userId<[^/]+>""", """@controllers.Items@.usersItems(userId:Integer)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blokiraj/$itemId<[^/]+>""", """@controllers.Items@.blockUnblockItem(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aktiviraj/$itemId<[^/]+>""", """@controllers.Items@.activateDeactivateItem(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodi100""", """@controllers.Items@.getItemsWithPriceRange1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodi150""", """@controllers.Items@.getItemsWithPriceRange2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodi200""", """@controllers.Items@.getItemsWithPriceRange3()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proizvodipreko200""", """@controllers.Items@.getItemsWithPriceRange4()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """akcija""", """@controllers.Items@.itemsOnSale()"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """poruka/$itemId<[^/]+>""", """@controllers.Messages@.sendMessage(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """poruke/$userId<[^/]+>""", """@controllers.Messages@.listOfMessages(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """poruka/$messageId<[^/]+>""", """@controllers.Messages@.message(messageId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeporuke/$messageId<[^/]+>""", """@controllers.Messages@.deleteMessage(messageId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messagenotif""", """@controllers.Messages@.notifications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """porukekoisnika/$userId<[^/]+>""", """@controllers.Messages@.listOfMessagesForAdmin(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vijest/$newsId<[^/]+>""", """@controllers.NewsController@.newsRender(newsId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vijestpanel""", """@controllers.NewsController@.newsPanelRender()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreirajvijest""", """@controllers.NewsController@.createNewsRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kreirajvijest""", """@controllers.NewsController@.createNews()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisivijest/$newsId<[^/]+>""", """@controllers.NewsController@.deleteNews(newsId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisivijest/$newsId<[^/]+>""", """@controllers.NewsController@.deleteNews(newsId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azurirajvijest/$newsId<[^/]+>""", """@controllers.NewsController@.updateNewsRender(newsId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """azurirajvijest/$newsId<[^/]+>""", """@controllers.NewsController@.updateNews(newsId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/$itemId<[^/]+>""", """@controllers.Reviews@.saveReview(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocjene/$itemId<[^/]+>""", """@controllers.Reviews@.itemReviews(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeocjene/$reviewId<[^/]+>""", """@controllers.Reviews@.deleteReview(reviewId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeocjene/$reviewId<[^/]+>""", """@controllers.Reviews@.deleteReview(reviewId:Integer)"""),
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
    Application_8.get.index(),
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

  // @LINE:7
  private[this] lazy val controllers_Application_unAuthorized1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pogresanunos")))
  )
  private[this] lazy val controllers_Application_unAuthorized1_invoker = createInvoker(
    Application_8.get.unAuthorized(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "unAuthorized",
      Nil,
      "GET",
      """""",
      this.prefix + """pogresanunos"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_10.get.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_Login_loginPageRender3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_loginPageRender3_invoker = createInvoker(
    Login_6.get.loginPageRender(),
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
  private[this] lazy val controllers_Login_login4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_login4_invoker = createInvoker(
    Login_6.get.login(),
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
  private[this] lazy val controllers_Login_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Login_logout5_invoker = createInvoker(
    Login_6.get.logout(),
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
  private[this] lazy val controllers_AppUsers_adminPanelRender6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_adminPanelRender6_invoker = createInvoker(
    AppUsers_5.get.adminPanelRender(fakeValue[Integer]),
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
  private[this] lazy val controllers_AppUsers_listOfUsersRender7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listakorisnika")))
  )
  private[this] lazy val controllers_AppUsers_listOfUsersRender7_invoker = createInvoker(
    AppUsers_5.get.listOfUsersRender(),
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
  private[this] lazy val controllers_AppUsers_createUserRender8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajkorisnka")))
  )
  private[this] lazy val controllers_AppUsers_createUserRender8_invoker = createInvoker(
    AppUsers_5.get.createUserRender(),
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
  private[this] lazy val controllers_AppUsers_createUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajkorisnika")))
  )
  private[this] lazy val controllers_AppUsers_createUser9_invoker = createInvoker(
    AppUsers_5.get.createUser(),
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
  private[this] lazy val controllers_AppUsers_deleteUser10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obisikorisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_deleteUser10_invoker = createInvoker(
    AppUsers_5.get.deleteUser(fakeValue[Integer]),
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
  private[this] lazy val controllers_AppUsers_deleteUser11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obisikorisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_deleteUser11_invoker = createInvoker(
    AppUsers_5.get.deleteUser(fakeValue[Integer]),
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
  private[this] lazy val controllers_AppUsers_updateAdminInformationsRender12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodataka/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateAdminInformationsRender12_invoker = createInvoker(
    AppUsers_5.get.updateAdminInformationsRender(fakeValue[Integer]),
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
  private[this] lazy val controllers_AppUsers_updateAdminInformations13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodataka/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateAdminInformations13_invoker = createInvoker(
    AppUsers_5.get.updateAdminInformations(fakeValue[Integer]),
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
  private[this] lazy val controllers_AppUsers_updateAdminPassword14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateAdminPassword14_invoker = createInvoker(
    AppUsers_5.get.updateAdminPassword(fakeValue[Integer]),
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
  private[this] lazy val controllers_Items_allItems15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi")))
  )
  private[this] lazy val controllers_Items_allItems15_invoker = createInvoker(
    Items_7.get.allItems(),
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
  private[this] lazy val controllers_Items_showOnHomepage16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_showOnHomepage16_invoker = createInvoker(
    Items_7.get.showOnHomepage(fakeValue[Integer]),
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

  // @LINE:30
  private[this] lazy val controllers_AppUsers_isUserActive17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("korisnici/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_isUserActive17_invoker = createInvoker(
    AppUsers_5.get.isUserActive(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "isUserActive",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """korisnici/$userId<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Items_usersItems18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodikorisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_usersItems18_invoker = createInvoker(
    Items_7.get.usersItems(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "usersItems",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """proizvodikorisnika/$userId<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_AppUsers_userPanelRender19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_userPanelRender19_invoker = createInvoker(
    AppUsers_5.get.userPanelRender(fakeValue[Integer]),
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

  // @LINE:37
  private[this] lazy val controllers_AppUsers_updateUserInformationsRender20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodatakauser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserInformationsRender20_invoker = createInvoker(
    AppUsers_5.get.updateUserInformationsRender(fakeValue[Integer]),
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

  // @LINE:38
  private[this] lazy val controllers_AppUsers_updateUserInformations21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodatakauser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserInformations21_invoker = createInvoker(
    AppUsers_5.get.updateUserInformations(fakeValue[Integer]),
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

  // @LINE:39
  private[this] lazy val controllers_AppUsers_updateUserPassword22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpanel/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_updateUserPassword22_invoker = createInvoker(
    AppUsers_5.get.updateUserPassword(fakeValue[Integer]),
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

  // @LINE:42
  private[this] lazy val controllers_Items_listOfItems23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_listOfItems23_invoker = createInvoker(
    Items_7.get.listOfItems(fakeValue[Integer]),
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

  // @LINE:43
  private[this] lazy val controllers_Items_deleteItem24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem24_invoker = createInvoker(
    Items_7.get.deleteItem(fakeValue[Integer]),
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

  // @LINE:44
  private[this] lazy val controllers_Items_deleteItem25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem25_invoker = createInvoker(
    Items_7.get.deleteItem(fakeValue[Integer]),
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

  // @LINE:45
  private[this] lazy val controllers_Items_updateItemRender26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItemRender26_invoker = createInvoker(
    Items_7.get.updateItemRender(fakeValue[Integer]),
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

  // @LINE:46
  private[this] lazy val controllers_Items_updateItem27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItem27_invoker = createInvoker(
    Items_7.get.updateItem(fakeValue[Integer]),
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

  // @LINE:47
  private[this] lazy val controllers_Items_createItemRender28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItemRender28_invoker = createInvoker(
    Items_7.get.createItemRender(fakeValue[Integer]),
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

  // @LINE:48
  private[this] lazy val controllers_Items_createItem29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItem29_invoker = createInvoker(
    Items_7.get.createItem(fakeValue[Integer]),
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

  // @LINE:49
  private[this] lazy val controllers_Items_itemRender30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvod/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_itemRender30_invoker = createInvoker(
    Items_7.get.itemRender(fakeValue[Integer]),
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

  // @LINE:50
  private[this] lazy val controllers_Items_getItemsWithCategory31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_getItemsWithCategory31_invoker = createInvoker(
    Items_7.get.getItemsWithCategory(fakeValue[Integer]),
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

  // @LINE:51
  private[this] lazy val controllers_Items_getItemsWithSubCategory32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("potkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_getItemsWithSubCategory32_invoker = createInvoker(
    Items_7.get.getItemsWithSubCategory(fakeValue[Integer]),
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

  // @LINE:54
  private[this] lazy val controllers_Items_blockUnblockItem33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blokiraj/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_blockUnblockItem33_invoker = createInvoker(
    Items_7.get.blockUnblockItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "blockUnblockItem",
      Seq(classOf[Integer]),
      "GET",
      """ITEM BLOCK/UNBLOCK""",
      this.prefix + """blokiraj/$itemId<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Items_activateDeactivateItem34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aktiviraj/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_activateDeactivateItem34_invoker = createInvoker(
    Items_7.get.activateDeactivateItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "activateDeactivateItem",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """aktiviraj/$itemId<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Items_getItemsWithPriceRange135_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi100")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange135_invoker = createInvoker(
    Items_7.get.getItemsWithPriceRange1(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "getItemsWithPriceRange1",
      Nil,
      "GET",
      """ITEM PRICE RANGE""",
      this.prefix + """proizvodi100"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Items_getItemsWithPriceRange236_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi150")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange236_invoker = createInvoker(
    Items_7.get.getItemsWithPriceRange2(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "getItemsWithPriceRange2",
      Nil,
      "GET",
      """""",
      this.prefix + """proizvodi150"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Items_getItemsWithPriceRange337_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi200")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange337_invoker = createInvoker(
    Items_7.get.getItemsWithPriceRange3(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "getItemsWithPriceRange3",
      Nil,
      "GET",
      """""",
      this.prefix + """proizvodi200"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Items_getItemsWithPriceRange438_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodipreko200")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange438_invoker = createInvoker(
    Items_7.get.getItemsWithPriceRange4(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "getItemsWithPriceRange4",
      Nil,
      "GET",
      """""",
      this.prefix + """proizvodipreko200"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Items_itemsOnSale39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("akcija")))
  )
  private[this] lazy val controllers_Items_itemsOnSale39_invoker = createInvoker(
    Items_7.get.itemsOnSale(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "itemsOnSale",
      Nil,
      "GET",
      """ITEM ACTION, TOP ...""",
      this.prefix + """akcija"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Categories_listOfCategories40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije")))
  )
  private[this] lazy val controllers_Categories_listOfCategories40_invoker = createInvoker(
    Categories_9.get.listOfCategories(),
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

  // @LINE:69
  private[this] lazy val controllers_Categories_deleteCategory41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory41_invoker = createInvoker(
    Categories_9.get.deleteCategory(fakeValue[Integer]),
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

  // @LINE:70
  private[this] lazy val controllers_Categories_deleteCategory42_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory42_invoker = createInvoker(
    Categories_9.get.deleteCategory(fakeValue[Integer]),
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

  // @LINE:71
  private[this] lazy val controllers_Categories_createCategoryRender43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategoryRender43_invoker = createInvoker(
    Categories_9.get.createCategoryRender(),
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

  // @LINE:72
  private[this] lazy val controllers_Categories_createCategory44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategory44_invoker = createInvoker(
    Categories_9.get.createCategory(),
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

  // @LINE:73
  private[this] lazy val controllers_Categories_updateCategoryRender45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategoryRender45_invoker = createInvoker(
    Categories_9.get.updateCategoryRender(fakeValue[Integer]),
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

  // @LINE:74
  private[this] lazy val controllers_Categories_updateCategory46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategory46_invoker = createInvoker(
    Categories_9.get.updateCategory(fakeValue[Integer]),
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

  // @LINE:77
  private[this] lazy val controllers_Categories_createSubCategoryRender47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("podkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_createSubCategoryRender47_invoker = createInvoker(
    Categories_9.get.createSubCategoryRender(fakeValue[Integer]),
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

  // @LINE:78
  private[this] lazy val controllers_Categories_createSubCategory48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("podkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_createSubCategory48_invoker = createInvoker(
    Categories_9.get.createSubCategory(fakeValue[Integer]),
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

  // @LINE:79
  private[this] lazy val controllers_Categories_listOfSubCategories49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listapodkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_listOfSubCategories49_invoker = createInvoker(
    Categories_9.get.listOfSubCategories(fakeValue[Integer]),
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

  // @LINE:80
  private[this] lazy val controllers_Categories_updateSubCategoryRender50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateSubCategoryRender50_invoker = createInvoker(
    Categories_9.get.updateSubCategoryRender(fakeValue[Integer]),
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

  // @LINE:81
  private[this] lazy val controllers_Categories_updateSubCategory51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateSubCategory51_invoker = createInvoker(
    Categories_9.get.updateSubCategory(fakeValue[Integer]),
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

  // @LINE:82
  private[this] lazy val controllers_Categories_deleteSubCategory52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteSubCategory52_invoker = createInvoker(
    Categories_9.get.deleteSubCategory(fakeValue[Integer]),
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

  // @LINE:83
  private[this] lazy val controllers_Categories_deleteSubCategory53_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteSubCategory53_invoker = createInvoker(
    Categories_9.get.deleteSubCategory(fakeValue[Integer]),
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

  // @LINE:86
  private[this] lazy val controllers_Stores_createStoreRender54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajobjekat/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_createStoreRender54_invoker = createInvoker(
    Stores_4.get.createStoreRender(fakeValue[Integer]),
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

  // @LINE:87
  private[this] lazy val controllers_Stores_createStore55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajobjekat/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_createStore55_invoker = createInvoker(
    Stores_4.get.createStore(fakeValue[Integer]),
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

  // @LINE:88
  private[this] lazy val controllers_Stores_updateStoreRender56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_updateStoreRender56_invoker = createInvoker(
    Stores_4.get.updateStoreRender(fakeValue[Integer]),
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

  // @LINE:89
  private[this] lazy val controllers_Stores_updateStore57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_updateStore57_invoker = createInvoker(
    Stores_4.get.updateStore(fakeValue[Integer]),
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

  // @LINE:90
  private[this] lazy val controllers_Stores_deleteStore58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_deleteStore58_invoker = createInvoker(
    Stores_4.get.deleteStore(fakeValue[Integer]),
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

  // @LINE:91
  private[this] lazy val controllers_Stores_deleteStore59_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_deleteStore59_invoker = createInvoker(
    Stores_4.get.deleteStore(fakeValue[Integer]),
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

  // @LINE:92
  private[this] lazy val controllers_Stores_listOfStores60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaobjekata/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_listOfStores60_invoker = createInvoker(
    Stores_4.get.listOfStores(fakeValue[Integer]),
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

  // @LINE:95
  private[this] lazy val controllers_ContactUs_contactUsRender61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kontakt")))
  )
  private[this] lazy val controllers_ContactUs_contactUsRender61_invoker = createInvoker(
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

  // @LINE:96
  private[this] lazy val controllers_ContactUs_contactUs62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kontakt")))
  )
  private[this] lazy val controllers_ContactUs_contactUs62_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_Application_faqRender63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("faq")))
  )
  private[this] lazy val controllers_Application_faqRender63_invoker = createInvoker(
    Application_8.get.faqRender(),
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

  // @LINE:102
  private[this] lazy val controllers_Images_imagesUploadRender64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_imagesUploadRender64_invoker = createInvoker(
    Images_11.get.imagesUploadRender(fakeValue[Integer]),
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

  // @LINE:103
  private[this] lazy val controllers_Images_imagesUpload65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_imagesUpload65_invoker = createInvoker(
    Images_11.get.imagesUpload(fakeValue[Integer]),
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

  // @LINE:104
  private[this] lazy val controllers_Images_listOfPicturesRender66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_listOfPicturesRender66_invoker = createInvoker(
    Images_11.get.listOfPicturesRender(fakeValue[Integer]),
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

  // @LINE:105
  private[this] lazy val controllers_Images_deleteImage67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeslike/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteImage67_invoker = createInvoker(
    Images_11.get.deleteImage(fakeValue[String]),
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

  // @LINE:106
  private[this] lazy val controllers_Images_deleteImage68_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeslike/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteImage68_invoker = createInvoker(
    Images_11.get.deleteImage(fakeValue[String]),
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

  // @LINE:109
  private[this] lazy val controllers_Items_lastTenProducts69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Items_lastTenProducts69_invoker = createInvoker(
    Items_7.get.lastTenProducts(),
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

  // @LINE:112
  private[this] lazy val controllers_Messages_sendMessage70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("poruka/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_sendMessage70_invoker = createInvoker(
    Messages_2.get.sendMessage(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "sendMessage",
      Seq(classOf[Integer]),
      "POST",
      """MESSAGES""",
      this.prefix + """poruka/$itemId<[^/]+>"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_Messages_listOfMessages71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("poruke/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_listOfMessages71_invoker = createInvoker(
    Messages_2.get.listOfMessages(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "listOfMessages",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """poruke/$userId<[^/]+>"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_Messages_message72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("poruka/"), DynamicPart("messageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_message72_invoker = createInvoker(
    Messages_2.get.message(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "message",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """poruka/$messageId<[^/]+>"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_Messages_deleteMessage73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeporuke/"), DynamicPart("messageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_deleteMessage73_invoker = createInvoker(
    Messages_2.get.deleteMessage(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "deleteMessage",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisanjeporuke/$messageId<[^/]+>"""
    )
  )

  // @LINE:116
  private[this] lazy val controllers_Messages_notifications74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messagenotif")))
  )
  private[this] lazy val controllers_Messages_notifications74_invoker = createInvoker(
    Messages_2.get.notifications(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "notifications",
      Nil,
      "GET",
      """""",
      this.prefix + """messagenotif"""
    )
  )

  // @LINE:117
  private[this] lazy val controllers_Messages_listOfMessagesForAdmin75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("porukekoisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_listOfMessagesForAdmin75_invoker = createInvoker(
    Messages_2.get.listOfMessagesForAdmin(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "listOfMessagesForAdmin",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """porukekoisnika/$userId<[^/]+>"""
    )
  )

  // @LINE:120
  private[this] lazy val controllers_NewsController_newsRender76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_newsRender76_invoker = createInvoker(
    NewsController_1.get.newsRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "newsRender",
      Seq(classOf[Integer]),
      "GET",
      """NEWS""",
      this.prefix + """vijest/$newsId<[^/]+>"""
    )
  )

  // @LINE:121
  private[this] lazy val controllers_NewsController_newsPanelRender77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vijestpanel")))
  )
  private[this] lazy val controllers_NewsController_newsPanelRender77_invoker = createInvoker(
    NewsController_1.get.newsPanelRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "newsPanelRender",
      Nil,
      "GET",
      """""",
      this.prefix + """vijestpanel"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_NewsController_createNewsRender78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajvijest")))
  )
  private[this] lazy val controllers_NewsController_createNewsRender78_invoker = createInvoker(
    NewsController_1.get.createNewsRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "createNewsRender",
      Nil,
      "GET",
      """""",
      this.prefix + """kreirajvijest"""
    )
  )

  // @LINE:123
  private[this] lazy val controllers_NewsController_createNews79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajvijest")))
  )
  private[this] lazy val controllers_NewsController_createNews79_invoker = createInvoker(
    NewsController_1.get.createNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "createNews",
      Nil,
      "POST",
      """""",
      this.prefix + """kreirajvijest"""
    )
  )

  // @LINE:124
  private[this] lazy val controllers_NewsController_deleteNews80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisivijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_deleteNews80_invoker = createInvoker(
    NewsController_1.get.deleteNews(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "deleteNews",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisivijest/$newsId<[^/]+>"""
    )
  )

  // @LINE:125
  private[this] lazy val controllers_NewsController_deleteNews81_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisivijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_deleteNews81_invoker = createInvoker(
    NewsController_1.get.deleteNews(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "deleteNews",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """brisivijest/$newsId<[^/]+>"""
    )
  )

  // @LINE:126
  private[this] lazy val controllers_NewsController_updateNewsRender82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azurirajvijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_updateNewsRender82_invoker = createInvoker(
    NewsController_1.get.updateNewsRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateNewsRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """azurirajvijest/$newsId<[^/]+>"""
    )
  )

  // @LINE:127
  private[this] lazy val controllers_NewsController_updateNews83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azurirajvijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_updateNews83_invoker = createInvoker(
    NewsController_1.get.updateNews(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateNews",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """azurirajvijest/$newsId<[^/]+>"""
    )
  )

  // @LINE:130
  private[this] lazy val controllers_Reviews_saveReview84_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_saveReview84_invoker = createInvoker(
    Reviews_3.get.saveReview(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reviews",
      "saveReview",
      Seq(classOf[Integer]),
      "POST",
      """REVIEWS""",
      this.prefix + """review/$itemId<[^/]+>"""
    )
  )

  // @LINE:131
  private[this] lazy val controllers_Reviews_itemReviews85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocjene/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_itemReviews85_invoker = createInvoker(
    Reviews_3.get.itemReviews(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reviews",
      "itemReviews",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """ocjene/$itemId<[^/]+>"""
    )
  )

  // @LINE:132
  private[this] lazy val controllers_Reviews_deleteReview86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeocjene/"), DynamicPart("reviewId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_deleteReview86_invoker = createInvoker(
    Reviews_3.get.deleteReview(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reviews",
      "deleteReview",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """brisanjeocjene/$reviewId<[^/]+>"""
    )
  )

  // @LINE:133
  private[this] lazy val controllers_Reviews_deleteReview87_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeocjene/"), DynamicPart("reviewId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_deleteReview87_invoker = createInvoker(
    Reviews_3.get.deleteReview(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reviews",
      "deleteReview",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """brisanjeocjene/$reviewId<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_8.get.index())
      }
  
    // @LINE:7
    case controllers_Application_unAuthorized1_route(params) =>
      call { 
        controllers_Application_unAuthorized1_invoker.call(Application_8.get.unAuthorized())
      }
  
    // @LINE:11
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_10.get.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Login_loginPageRender3_route(params) =>
      call { 
        controllers_Login_loginPageRender3_invoker.call(Login_6.get.loginPageRender())
      }
  
    // @LINE:15
    case controllers_Login_login4_route(params) =>
      call { 
        controllers_Login_login4_invoker.call(Login_6.get.login())
      }
  
    // @LINE:16
    case controllers_Login_logout5_route(params) =>
      call { 
        controllers_Login_logout5_invoker.call(Login_6.get.logout())
      }
  
    // @LINE:19
    case controllers_AppUsers_adminPanelRender6_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_adminPanelRender6_invoker.call(AppUsers_5.get.adminPanelRender(userId))
      }
  
    // @LINE:20
    case controllers_AppUsers_listOfUsersRender7_route(params) =>
      call { 
        controllers_AppUsers_listOfUsersRender7_invoker.call(AppUsers_5.get.listOfUsersRender())
      }
  
    // @LINE:21
    case controllers_AppUsers_createUserRender8_route(params) =>
      call { 
        controllers_AppUsers_createUserRender8_invoker.call(AppUsers_5.get.createUserRender())
      }
  
    // @LINE:22
    case controllers_AppUsers_createUser9_route(params) =>
      call { 
        controllers_AppUsers_createUser9_invoker.call(AppUsers_5.get.createUser())
      }
  
    // @LINE:23
    case controllers_AppUsers_deleteUser10_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser10_invoker.call(AppUsers_5.get.deleteUser(userId))
      }
  
    // @LINE:24
    case controllers_AppUsers_deleteUser11_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser11_invoker.call(AppUsers_5.get.deleteUser(userId))
      }
  
    // @LINE:25
    case controllers_AppUsers_updateAdminInformationsRender12_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformationsRender12_invoker.call(AppUsers_5.get.updateAdminInformationsRender(userId))
      }
  
    // @LINE:26
    case controllers_AppUsers_updateAdminInformations13_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformations13_invoker.call(AppUsers_5.get.updateAdminInformations(userId))
      }
  
    // @LINE:27
    case controllers_AppUsers_updateAdminPassword14_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminPassword14_invoker.call(AppUsers_5.get.updateAdminPassword(userId))
      }
  
    // @LINE:28
    case controllers_Items_allItems15_route(params) =>
      call { 
        controllers_Items_allItems15_invoker.call(Items_7.get.allItems())
      }
  
    // @LINE:29
    case controllers_Items_showOnHomepage16_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_showOnHomepage16_invoker.call(Items_7.get.showOnHomepage(itemId))
      }
  
    // @LINE:30
    case controllers_AppUsers_isUserActive17_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_isUserActive17_invoker.call(AppUsers_5.get.isUserActive(userId))
      }
  
    // @LINE:31
    case controllers_Items_usersItems18_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_usersItems18_invoker.call(Items_7.get.usersItems(userId))
      }
  
    // @LINE:36
    case controllers_AppUsers_userPanelRender19_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_userPanelRender19_invoker.call(AppUsers_5.get.userPanelRender(userId))
      }
  
    // @LINE:37
    case controllers_AppUsers_updateUserInformationsRender20_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformationsRender20_invoker.call(AppUsers_5.get.updateUserInformationsRender(userId))
      }
  
    // @LINE:38
    case controllers_AppUsers_updateUserInformations21_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformations21_invoker.call(AppUsers_5.get.updateUserInformations(userId))
      }
  
    // @LINE:39
    case controllers_AppUsers_updateUserPassword22_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserPassword22_invoker.call(AppUsers_5.get.updateUserPassword(userId))
      }
  
    // @LINE:42
    case controllers_Items_listOfItems23_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_listOfItems23_invoker.call(Items_7.get.listOfItems(userId))
      }
  
    // @LINE:43
    case controllers_Items_deleteItem24_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem24_invoker.call(Items_7.get.deleteItem(itemId))
      }
  
    // @LINE:44
    case controllers_Items_deleteItem25_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem25_invoker.call(Items_7.get.deleteItem(itemId))
      }
  
    // @LINE:45
    case controllers_Items_updateItemRender26_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItemRender26_invoker.call(Items_7.get.updateItemRender(itemId))
      }
  
    // @LINE:46
    case controllers_Items_updateItem27_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItem27_invoker.call(Items_7.get.updateItem(itemId))
      }
  
    // @LINE:47
    case controllers_Items_createItemRender28_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItemRender28_invoker.call(Items_7.get.createItemRender(userId))
      }
  
    // @LINE:48
    case controllers_Items_createItem29_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItem29_invoker.call(Items_7.get.createItem(userId))
      }
  
    // @LINE:49
    case controllers_Items_itemRender30_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_itemRender30_invoker.call(Items_7.get.itemRender(itemId))
      }
  
    // @LINE:50
    case controllers_Items_getItemsWithCategory31_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Items_getItemsWithCategory31_invoker.call(Items_7.get.getItemsWithCategory(categoryId))
      }
  
    // @LINE:51
    case controllers_Items_getItemsWithSubCategory32_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Items_getItemsWithSubCategory32_invoker.call(Items_7.get.getItemsWithSubCategory(subcategoryId))
      }
  
    // @LINE:54
    case controllers_Items_blockUnblockItem33_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_blockUnblockItem33_invoker.call(Items_7.get.blockUnblockItem(itemId))
      }
  
    // @LINE:55
    case controllers_Items_activateDeactivateItem34_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_activateDeactivateItem34_invoker.call(Items_7.get.activateDeactivateItem(itemId))
      }
  
    // @LINE:58
    case controllers_Items_getItemsWithPriceRange135_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange135_invoker.call(Items_7.get.getItemsWithPriceRange1())
      }
  
    // @LINE:59
    case controllers_Items_getItemsWithPriceRange236_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange236_invoker.call(Items_7.get.getItemsWithPriceRange2())
      }
  
    // @LINE:60
    case controllers_Items_getItemsWithPriceRange337_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange337_invoker.call(Items_7.get.getItemsWithPriceRange3())
      }
  
    // @LINE:61
    case controllers_Items_getItemsWithPriceRange438_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange438_invoker.call(Items_7.get.getItemsWithPriceRange4())
      }
  
    // @LINE:64
    case controllers_Items_itemsOnSale39_route(params) =>
      call { 
        controllers_Items_itemsOnSale39_invoker.call(Items_7.get.itemsOnSale())
      }
  
    // @LINE:68
    case controllers_Categories_listOfCategories40_route(params) =>
      call { 
        controllers_Categories_listOfCategories40_invoker.call(Categories_9.get.listOfCategories())
      }
  
    // @LINE:69
    case controllers_Categories_deleteCategory41_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory41_invoker.call(Categories_9.get.deleteCategory(categoryId))
      }
  
    // @LINE:70
    case controllers_Categories_deleteCategory42_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory42_invoker.call(Categories_9.get.deleteCategory(categoryId))
      }
  
    // @LINE:71
    case controllers_Categories_createCategoryRender43_route(params) =>
      call { 
        controllers_Categories_createCategoryRender43_invoker.call(Categories_9.get.createCategoryRender())
      }
  
    // @LINE:72
    case controllers_Categories_createCategory44_route(params) =>
      call { 
        controllers_Categories_createCategory44_invoker.call(Categories_9.get.createCategory())
      }
  
    // @LINE:73
    case controllers_Categories_updateCategoryRender45_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategoryRender45_invoker.call(Categories_9.get.updateCategoryRender(categoryId))
      }
  
    // @LINE:74
    case controllers_Categories_updateCategory46_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategory46_invoker.call(Categories_9.get.updateCategory(categoryId))
      }
  
    // @LINE:77
    case controllers_Categories_createSubCategoryRender47_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_createSubCategoryRender47_invoker.call(Categories_9.get.createSubCategoryRender(categoryId))
      }
  
    // @LINE:78
    case controllers_Categories_createSubCategory48_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_createSubCategory48_invoker.call(Categories_9.get.createSubCategory(categoryId))
      }
  
    // @LINE:79
    case controllers_Categories_listOfSubCategories49_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_listOfSubCategories49_invoker.call(Categories_9.get.listOfSubCategories(categoryId))
      }
  
    // @LINE:80
    case controllers_Categories_updateSubCategoryRender50_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_updateSubCategoryRender50_invoker.call(Categories_9.get.updateSubCategoryRender(subcategoryId))
      }
  
    // @LINE:81
    case controllers_Categories_updateSubCategory51_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_updateSubCategory51_invoker.call(Categories_9.get.updateSubCategory(subcategoryId))
      }
  
    // @LINE:82
    case controllers_Categories_deleteSubCategory52_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_deleteSubCategory52_invoker.call(Categories_9.get.deleteSubCategory(subcategoryId))
      }
  
    // @LINE:83
    case controllers_Categories_deleteSubCategory53_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_deleteSubCategory53_invoker.call(Categories_9.get.deleteSubCategory(subcategoryId))
      }
  
    // @LINE:86
    case controllers_Stores_createStoreRender54_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_createStoreRender54_invoker.call(Stores_4.get.createStoreRender(userId))
      }
  
    // @LINE:87
    case controllers_Stores_createStore55_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_createStore55_invoker.call(Stores_4.get.createStore(userId))
      }
  
    // @LINE:88
    case controllers_Stores_updateStoreRender56_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_updateStoreRender56_invoker.call(Stores_4.get.updateStoreRender(storeId))
      }
  
    // @LINE:89
    case controllers_Stores_updateStore57_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_updateStore57_invoker.call(Stores_4.get.updateStore(storeId))
      }
  
    // @LINE:90
    case controllers_Stores_deleteStore58_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_deleteStore58_invoker.call(Stores_4.get.deleteStore(storeId))
      }
  
    // @LINE:91
    case controllers_Stores_deleteStore59_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_deleteStore59_invoker.call(Stores_4.get.deleteStore(storeId))
      }
  
    // @LINE:92
    case controllers_Stores_listOfStores60_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_listOfStores60_invoker.call(Stores_4.get.listOfStores(userId))
      }
  
    // @LINE:95
    case controllers_ContactUs_contactUsRender61_route(params) =>
      call { 
        controllers_ContactUs_contactUsRender61_invoker.call(ContactUs_0.get.contactUsRender())
      }
  
    // @LINE:96
    case controllers_ContactUs_contactUs62_route(params) =>
      call { 
        controllers_ContactUs_contactUs62_invoker.call(ContactUs_0.get.contactUs())
      }
  
    // @LINE:99
    case controllers_Application_faqRender63_route(params) =>
      call { 
        controllers_Application_faqRender63_invoker.call(Application_8.get.faqRender())
      }
  
    // @LINE:102
    case controllers_Images_imagesUploadRender64_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_imagesUploadRender64_invoker.call(Images_11.get.imagesUploadRender(itemId))
      }
  
    // @LINE:103
    case controllers_Images_imagesUpload65_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_imagesUpload65_invoker.call(Images_11.get.imagesUpload(itemId))
      }
  
    // @LINE:104
    case controllers_Images_listOfPicturesRender66_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_listOfPicturesRender66_invoker.call(Images_11.get.listOfPicturesRender(itemId))
      }
  
    // @LINE:105
    case controllers_Images_deleteImage67_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteImage67_invoker.call(Images_11.get.deleteImage(imageId))
      }
  
    // @LINE:106
    case controllers_Images_deleteImage68_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteImage68_invoker.call(Images_11.get.deleteImage(imageId))
      }
  
    // @LINE:109
    case controllers_Items_lastTenProducts69_route(params) =>
      call { 
        controllers_Items_lastTenProducts69_invoker.call(Items_7.get.lastTenProducts())
      }
  
    // @LINE:112
    case controllers_Messages_sendMessage70_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Messages_sendMessage70_invoker.call(Messages_2.get.sendMessage(itemId))
      }
  
    // @LINE:113
    case controllers_Messages_listOfMessages71_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Messages_listOfMessages71_invoker.call(Messages_2.get.listOfMessages(userId))
      }
  
    // @LINE:114
    case controllers_Messages_message72_route(params) =>
      call(params.fromPath[Integer]("messageId", None)) { (messageId) =>
        controllers_Messages_message72_invoker.call(Messages_2.get.message(messageId))
      }
  
    // @LINE:115
    case controllers_Messages_deleteMessage73_route(params) =>
      call(params.fromPath[Integer]("messageId", None)) { (messageId) =>
        controllers_Messages_deleteMessage73_invoker.call(Messages_2.get.deleteMessage(messageId))
      }
  
    // @LINE:116
    case controllers_Messages_notifications74_route(params) =>
      call { 
        controllers_Messages_notifications74_invoker.call(Messages_2.get.notifications())
      }
  
    // @LINE:117
    case controllers_Messages_listOfMessagesForAdmin75_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Messages_listOfMessagesForAdmin75_invoker.call(Messages_2.get.listOfMessagesForAdmin(userId))
      }
  
    // @LINE:120
    case controllers_NewsController_newsRender76_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_newsRender76_invoker.call(NewsController_1.get.newsRender(newsId))
      }
  
    // @LINE:121
    case controllers_NewsController_newsPanelRender77_route(params) =>
      call { 
        controllers_NewsController_newsPanelRender77_invoker.call(NewsController_1.get.newsPanelRender())
      }
  
    // @LINE:122
    case controllers_NewsController_createNewsRender78_route(params) =>
      call { 
        controllers_NewsController_createNewsRender78_invoker.call(NewsController_1.get.createNewsRender())
      }
  
    // @LINE:123
    case controllers_NewsController_createNews79_route(params) =>
      call { 
        controllers_NewsController_createNews79_invoker.call(NewsController_1.get.createNews())
      }
  
    // @LINE:124
    case controllers_NewsController_deleteNews80_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_deleteNews80_invoker.call(NewsController_1.get.deleteNews(newsId))
      }
  
    // @LINE:125
    case controllers_NewsController_deleteNews81_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_deleteNews81_invoker.call(NewsController_1.get.deleteNews(newsId))
      }
  
    // @LINE:126
    case controllers_NewsController_updateNewsRender82_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_updateNewsRender82_invoker.call(NewsController_1.get.updateNewsRender(newsId))
      }
  
    // @LINE:127
    case controllers_NewsController_updateNews83_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_updateNews83_invoker.call(NewsController_1.get.updateNews(newsId))
      }
  
    // @LINE:130
    case controllers_Reviews_saveReview84_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Reviews_saveReview84_invoker.call(Reviews_3.get.saveReview(itemId))
      }
  
    // @LINE:131
    case controllers_Reviews_itemReviews85_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Reviews_itemReviews85_invoker.call(Reviews_3.get.itemReviews(itemId))
      }
  
    // @LINE:132
    case controllers_Reviews_deleteReview86_route(params) =>
      call(params.fromPath[Integer]("reviewId", None)) { (reviewId) =>
        controllers_Reviews_deleteReview86_invoker.call(Reviews_3.get.deleteReview(reviewId))
      }
  
    // @LINE:133
    case controllers_Reviews_deleteReview87_route(params) =>
      call(params.fromPath[Integer]("reviewId", None)) { (reviewId) =>
        controllers_Reviews_deleteReview87_invoker.call(Reviews_3.get.deleteReview(reviewId))
      }
  }
}