
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/namjestaj/conf/routes
// @DATE:Wed Jun 08 01:58:51 CEST 2016

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
  Application_10: javax.inject.Provider[controllers.Application],
  // @LINE:11
  Assets_12: javax.inject.Provider[controllers.Assets],
  // @LINE:14
  Login_8: javax.inject.Provider[controllers.Login],
  // @LINE:19
  AppUsers_7: javax.inject.Provider[controllers.AppUsers],
  // @LINE:28
  Items_9: javax.inject.Provider[controllers.Items],
  // @LINE:73
  Categories_11: javax.inject.Provider[controllers.Categories],
  // @LINE:91
  Stores_6: javax.inject.Provider[controllers.Stores],
  // @LINE:100
  ContactUs_0: javax.inject.Provider[controllers.ContactUs],
  // @LINE:107
  Images_13: javax.inject.Provider[controllers.Images],
  // @LINE:119
  Messages_4: javax.inject.Provider[controllers.Messages],
  // @LINE:129
  NewsController_2: javax.inject.Provider[controllers.NewsController],
  // @LINE:139
  Reviews_5: javax.inject.Provider[controllers.Reviews],
  // @LINE:145
  Partners_3: javax.inject.Provider[controllers.Partners],
  // @LINE:153
  Banners_1: javax.inject.Provider[controllers.Banners],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_10: javax.inject.Provider[controllers.Application],
    // @LINE:11
    Assets_12: javax.inject.Provider[controllers.Assets],
    // @LINE:14
    Login_8: javax.inject.Provider[controllers.Login],
    // @LINE:19
    AppUsers_7: javax.inject.Provider[controllers.AppUsers],
    // @LINE:28
    Items_9: javax.inject.Provider[controllers.Items],
    // @LINE:73
    Categories_11: javax.inject.Provider[controllers.Categories],
    // @LINE:91
    Stores_6: javax.inject.Provider[controllers.Stores],
    // @LINE:100
    ContactUs_0: javax.inject.Provider[controllers.ContactUs],
    // @LINE:107
    Images_13: javax.inject.Provider[controllers.Images],
    // @LINE:119
    Messages_4: javax.inject.Provider[controllers.Messages],
    // @LINE:129
    NewsController_2: javax.inject.Provider[controllers.NewsController],
    // @LINE:139
    Reviews_5: javax.inject.Provider[controllers.Reviews],
    // @LINE:145
    Partners_3: javax.inject.Provider[controllers.Partners],
    // @LINE:153
    Banners_1: javax.inject.Provider[controllers.Banners]
  ) = this(errorHandler, Application_10, Assets_12, Login_8, AppUsers_7, Items_9, Categories_11, Stores_6, ContactUs_0, Images_13, Messages_4, NewsController_2, Reviews_5, Partners_3, Banners_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_10, Assets_12, Login_8, AppUsers_7, Items_9, Categories_11, Stores_6, ContactUs_0, Images_13, Messages_4, NewsController_2, Reviews_5, Partners_3, Banners_1, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opis/$userId<[^/]+>""", """@controllers.AppUsers@.userDescriptionRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opis/$userId<[^/]+>""", """@controllers.AppUsers@.userDescription(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logo/$userId<[^/]+>""", """@controllers.AppUsers@.imagesUploadRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logo/$userId<[^/]+>""", """@controllers.AppUsers@.imagesUpload(userId:Integer)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjelogo/$imageId<[^/]+>""", """@controllers.Images@.deleteLogo(imageId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjelogo/$imageId<[^/]+>""", """@controllers.Images@.deleteLogo(imageId:String)"""),
    ("""POST""", this.prefix, """@controllers.Items@.lastTenProducts()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """poruka/$itemId<[^/]+>""", """@controllers.Messages@.sendMessage(itemId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """poruke/$userId<[^/]+>""", """@controllers.Messages@.listOfMessages(userId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """poruka/$messageId<[^/]+>""", """@controllers.Messages@.message(messageId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """brisanjeporuke/$messageId<[^/]+>""", """@controllers.Messages@.deleteMessage(messageId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messagenotif""", """@controllers.Messages@.notifications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """porukekoisnika/$userId<[^/]+>""", """@controllers.Messages@.listOfMessagesForAdmin(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """porukauseru/$userId<[^/]+>""", """@controllers.Messages@.sendMessage2(userId:Integer)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """partneri""", """@controllers.Partners@.partnerPanel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """partner/$userId<[^/]+>""", """@controllers.Partners@.partnerPageRender(userId:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pretraga""", """@controllers.Items@.searchBox()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pretragatelefon""", """@controllers.Items@.searchBoxMobile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dodajBanner""", """@controllers.Banners@.createBannerRender()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dodajBanner""", """@controllers.Banners@.createBanner()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listaBannera""", """@controllers.Banners@.listOfBanners()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """obrisibanner/$bannerId<[^/]+>""", """@controllers.Banners@.deleteBanner(bannerId:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """obrisibanner/$bannerId<[^/]+>""", """@controllers.Banners@.deleteBanner(bannerId:Integer)"""),
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
    Application_10.get.index(),
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
    Application_10.get.unAuthorized(),
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
    Assets_12.get.versioned(fakeValue[String], fakeValue[Asset]),
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
    Login_8.get.loginPageRender(),
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
    Login_8.get.login(),
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
    Login_8.get.logout(),
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
    AppUsers_7.get.adminPanelRender(fakeValue[Integer]),
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
    AppUsers_7.get.listOfUsersRender(),
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
    AppUsers_7.get.createUserRender(),
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
    AppUsers_7.get.createUser(),
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
    AppUsers_7.get.deleteUser(fakeValue[Integer]),
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
    AppUsers_7.get.deleteUser(fakeValue[Integer]),
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
    AppUsers_7.get.updateAdminInformationsRender(fakeValue[Integer]),
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
    AppUsers_7.get.updateAdminInformations(fakeValue[Integer]),
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
    AppUsers_7.get.updateAdminPassword(fakeValue[Integer]),
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
    Items_9.get.allItems(),
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
    Items_9.get.showOnHomepage(fakeValue[Integer]),
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
    AppUsers_7.get.isUserActive(fakeValue[Integer]),
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
    Items_9.get.usersItems(fakeValue[Integer]),
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
    AppUsers_7.get.userPanelRender(fakeValue[Integer]),
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
    AppUsers_7.get.updateUserInformationsRender(fakeValue[Integer]),
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
    AppUsers_7.get.updateUserInformations(fakeValue[Integer]),
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
    AppUsers_7.get.updateUserPassword(fakeValue[Integer]),
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

  // @LINE:40
  private[this] lazy val controllers_AppUsers_userDescriptionRender23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opis/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_userDescriptionRender23_invoker = createInvoker(
    AppUsers_7.get.userDescriptionRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "userDescriptionRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """opis/$userId<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AppUsers_userDescription24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opis/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_userDescription24_invoker = createInvoker(
    AppUsers_7.get.userDescription(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "userDescription",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """opis/$userId<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_AppUsers_imagesUploadRender25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logo/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_imagesUploadRender25_invoker = createInvoker(
    AppUsers_7.get.imagesUploadRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "imagesUploadRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """logo/$userId<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AppUsers_imagesUpload26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logo/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppUsers_imagesUpload26_invoker = createInvoker(
    AppUsers_7.get.imagesUpload(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppUsers",
      "imagesUpload",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """logo/$userId<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Items_listOfItems27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_listOfItems27_invoker = createInvoker(
    Items_9.get.listOfItems(fakeValue[Integer]),
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

  // @LINE:48
  private[this] lazy val controllers_Items_deleteItem28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem28_invoker = createInvoker(
    Items_9.get.deleteItem(fakeValue[Integer]),
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

  // @LINE:49
  private[this] lazy val controllers_Items_deleteItem29_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeproizvoda/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_deleteItem29_invoker = createInvoker(
    Items_9.get.deleteItem(fakeValue[Integer]),
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

  // @LINE:50
  private[this] lazy val controllers_Items_updateItemRender30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItemRender30_invoker = createInvoker(
    Items_9.get.updateItemRender(fakeValue[Integer]),
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

  // @LINE:51
  private[this] lazy val controllers_Items_updateItem31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeproizvoda/itemId")))
  )
  private[this] lazy val controllers_Items_updateItem31_invoker = createInvoker(
    Items_9.get.updateItem(fakeValue[Integer]),
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

  // @LINE:52
  private[this] lazy val controllers_Items_createItemRender32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItemRender32_invoker = createInvoker(
    Items_9.get.createItemRender(fakeValue[Integer]),
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

  // @LINE:53
  private[this] lazy val controllers_Items_createItem33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjeproizvoda/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_createItem33_invoker = createInvoker(
    Items_9.get.createItem(fakeValue[Integer]),
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

  // @LINE:54
  private[this] lazy val controllers_Items_itemRender34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvod/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_itemRender34_invoker = createInvoker(
    Items_9.get.itemRender(fakeValue[Integer]),
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

  // @LINE:55
  private[this] lazy val controllers_Items_getItemsWithCategory35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_getItemsWithCategory35_invoker = createInvoker(
    Items_9.get.getItemsWithCategory(fakeValue[Integer]),
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

  // @LINE:56
  private[this] lazy val controllers_Items_getItemsWithSubCategory36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("potkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_getItemsWithSubCategory36_invoker = createInvoker(
    Items_9.get.getItemsWithSubCategory(fakeValue[Integer]),
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

  // @LINE:59
  private[this] lazy val controllers_Items_blockUnblockItem37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blokiraj/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_blockUnblockItem37_invoker = createInvoker(
    Items_9.get.blockUnblockItem(fakeValue[Integer]),
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

  // @LINE:60
  private[this] lazy val controllers_Items_activateDeactivateItem38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aktiviraj/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_activateDeactivateItem38_invoker = createInvoker(
    Items_9.get.activateDeactivateItem(fakeValue[Integer]),
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

  // @LINE:63
  private[this] lazy val controllers_Items_getItemsWithPriceRange139_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi100")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange139_invoker = createInvoker(
    Items_9.get.getItemsWithPriceRange1(),
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

  // @LINE:64
  private[this] lazy val controllers_Items_getItemsWithPriceRange240_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi150")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange240_invoker = createInvoker(
    Items_9.get.getItemsWithPriceRange2(),
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

  // @LINE:65
  private[this] lazy val controllers_Items_getItemsWithPriceRange341_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodi200")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange341_invoker = createInvoker(
    Items_9.get.getItemsWithPriceRange3(),
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

  // @LINE:66
  private[this] lazy val controllers_Items_getItemsWithPriceRange442_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proizvodipreko200")))
  )
  private[this] lazy val controllers_Items_getItemsWithPriceRange442_invoker = createInvoker(
    Items_9.get.getItemsWithPriceRange4(),
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

  // @LINE:69
  private[this] lazy val controllers_Items_itemsOnSale43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("akcija")))
  )
  private[this] lazy val controllers_Items_itemsOnSale43_invoker = createInvoker(
    Items_9.get.itemsOnSale(),
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

  // @LINE:73
  private[this] lazy val controllers_Categories_listOfCategories44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kategorije")))
  )
  private[this] lazy val controllers_Categories_listOfCategories44_invoker = createInvoker(
    Categories_11.get.listOfCategories(),
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

  // @LINE:74
  private[this] lazy val controllers_Categories_deleteCategory45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory45_invoker = createInvoker(
    Categories_11.get.deleteCategory(fakeValue[Integer]),
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

  // @LINE:75
  private[this] lazy val controllers_Categories_deleteCategory46_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteCategory46_invoker = createInvoker(
    Categories_11.get.deleteCategory(fakeValue[Integer]),
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

  // @LINE:76
  private[this] lazy val controllers_Categories_createCategoryRender47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategoryRender47_invoker = createInvoker(
    Categories_11.get.createCategoryRender(),
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

  // @LINE:77
  private[this] lazy val controllers_Categories_createCategory48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreiranjekategorije")))
  )
  private[this] lazy val controllers_Categories_createCategory48_invoker = createInvoker(
    Categories_11.get.createCategory(),
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

  // @LINE:78
  private[this] lazy val controllers_Categories_updateCategoryRender49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategoryRender49_invoker = createInvoker(
    Categories_11.get.updateCategoryRender(fakeValue[Integer]),
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

  // @LINE:79
  private[this] lazy val controllers_Categories_updateCategory50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjekategorije/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateCategory50_invoker = createInvoker(
    Categories_11.get.updateCategory(fakeValue[Integer]),
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

  // @LINE:82
  private[this] lazy val controllers_Categories_createSubCategoryRender51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("podkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_createSubCategoryRender51_invoker = createInvoker(
    Categories_11.get.createSubCategoryRender(fakeValue[Integer]),
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

  // @LINE:83
  private[this] lazy val controllers_Categories_createSubCategory52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("podkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_createSubCategory52_invoker = createInvoker(
    Categories_11.get.createSubCategory(fakeValue[Integer]),
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

  // @LINE:84
  private[this] lazy val controllers_Categories_listOfSubCategories53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listapodkategorija/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_listOfSubCategories53_invoker = createInvoker(
    Categories_11.get.listOfSubCategories(fakeValue[Integer]),
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

  // @LINE:85
  private[this] lazy val controllers_Categories_updateSubCategoryRender54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateSubCategoryRender54_invoker = createInvoker(
    Categories_11.get.updateSubCategoryRender(fakeValue[Integer]),
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

  // @LINE:86
  private[this] lazy val controllers_Categories_updateSubCategory55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_updateSubCategory55_invoker = createInvoker(
    Categories_11.get.updateSubCategory(fakeValue[Integer]),
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

  // @LINE:87
  private[this] lazy val controllers_Categories_deleteSubCategory56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteSubCategory56_invoker = createInvoker(
    Categories_11.get.deleteSubCategory(fakeValue[Integer]),
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

  // @LINE:88
  private[this] lazy val controllers_Categories_deleteSubCategory57_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjepodkategorije/"), DynamicPart("subcategoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_deleteSubCategory57_invoker = createInvoker(
    Categories_11.get.deleteSubCategory(fakeValue[Integer]),
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

  // @LINE:91
  private[this] lazy val controllers_Stores_createStoreRender58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajobjekat/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_createStoreRender58_invoker = createInvoker(
    Stores_6.get.createStoreRender(fakeValue[Integer]),
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

  // @LINE:92
  private[this] lazy val controllers_Stores_createStore59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajobjekat/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_createStore59_invoker = createInvoker(
    Stores_6.get.createStore(fakeValue[Integer]),
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

  // @LINE:93
  private[this] lazy val controllers_Stores_updateStoreRender60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_updateStoreRender60_invoker = createInvoker(
    Stores_6.get.updateStoreRender(fakeValue[Integer]),
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

  // @LINE:94
  private[this] lazy val controllers_Stores_updateStore61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azuriranjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_updateStore61_invoker = createInvoker(
    Stores_6.get.updateStore(fakeValue[Integer]),
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

  // @LINE:95
  private[this] lazy val controllers_Stores_deleteStore62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_deleteStore62_invoker = createInvoker(
    Stores_6.get.deleteStore(fakeValue[Integer]),
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

  // @LINE:96
  private[this] lazy val controllers_Stores_deleteStore63_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeobjekta/"), DynamicPart("storeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_deleteStore63_invoker = createInvoker(
    Stores_6.get.deleteStore(fakeValue[Integer]),
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

  // @LINE:97
  private[this] lazy val controllers_Stores_listOfStores64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaobjekata/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stores_listOfStores64_invoker = createInvoker(
    Stores_6.get.listOfStores(fakeValue[Integer]),
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

  // @LINE:100
  private[this] lazy val controllers_ContactUs_contactUsRender65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kontakt")))
  )
  private[this] lazy val controllers_ContactUs_contactUsRender65_invoker = createInvoker(
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

  // @LINE:101
  private[this] lazy val controllers_ContactUs_contactUs66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kontakt")))
  )
  private[this] lazy val controllers_ContactUs_contactUs66_invoker = createInvoker(
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

  // @LINE:104
  private[this] lazy val controllers_Application_faqRender67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("faq")))
  )
  private[this] lazy val controllers_Application_faqRender67_invoker = createInvoker(
    Application_10.get.faqRender(),
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

  // @LINE:107
  private[this] lazy val controllers_Images_imagesUploadRender68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_imagesUploadRender68_invoker = createInvoker(
    Images_13.get.imagesUploadRender(fakeValue[Integer]),
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

  // @LINE:108
  private[this] lazy val controllers_Images_imagesUpload69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_imagesUpload69_invoker = createInvoker(
    Images_13.get.imagesUpload(fakeValue[Integer]),
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

  // @LINE:109
  private[this] lazy val controllers_Images_listOfPicturesRender70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaslika/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_listOfPicturesRender70_invoker = createInvoker(
    Images_13.get.listOfPicturesRender(fakeValue[Integer]),
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

  // @LINE:110
  private[this] lazy val controllers_Images_deleteImage71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeslike/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteImage71_invoker = createInvoker(
    Images_13.get.deleteImage(fakeValue[String]),
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

  // @LINE:111
  private[this] lazy val controllers_Images_deleteImage72_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeslike/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteImage72_invoker = createInvoker(
    Images_13.get.deleteImage(fakeValue[String]),
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

  // @LINE:112
  private[this] lazy val controllers_Images_deleteLogo73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjelogo/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteLogo73_invoker = createInvoker(
    Images_13.get.deleteLogo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "deleteLogo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """brisanjelogo/$imageId<[^/]+>"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_Images_deleteLogo74_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjelogo/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Images_deleteLogo74_invoker = createInvoker(
    Images_13.get.deleteLogo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Images",
      "deleteLogo",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """brisanjelogo/$imageId<[^/]+>"""
    )
  )

  // @LINE:116
  private[this] lazy val controllers_Items_lastTenProducts75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Items_lastTenProducts75_invoker = createInvoker(
    Items_9.get.lastTenProducts(),
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

  // @LINE:119
  private[this] lazy val controllers_Messages_sendMessage76_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("poruka/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_sendMessage76_invoker = createInvoker(
    Messages_4.get.sendMessage(fakeValue[Integer]),
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

  // @LINE:120
  private[this] lazy val controllers_Messages_listOfMessages77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("poruke/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_listOfMessages77_invoker = createInvoker(
    Messages_4.get.listOfMessages(fakeValue[Integer]),
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

  // @LINE:121
  private[this] lazy val controllers_Messages_message78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("poruka/"), DynamicPart("messageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_message78_invoker = createInvoker(
    Messages_4.get.message(fakeValue[Integer]),
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

  // @LINE:122
  private[this] lazy val controllers_Messages_deleteMessage79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeporuke/"), DynamicPart("messageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_deleteMessage79_invoker = createInvoker(
    Messages_4.get.deleteMessage(fakeValue[Integer]),
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

  // @LINE:123
  private[this] lazy val controllers_Messages_notifications80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messagenotif")))
  )
  private[this] lazy val controllers_Messages_notifications80_invoker = createInvoker(
    Messages_4.get.notifications(),
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

  // @LINE:124
  private[this] lazy val controllers_Messages_listOfMessagesForAdmin81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("porukekoisnika/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_listOfMessagesForAdmin81_invoker = createInvoker(
    Messages_4.get.listOfMessagesForAdmin(fakeValue[Integer]),
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

  // @LINE:125
  private[this] lazy val controllers_Messages_sendMessage282_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("porukauseru/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Messages_sendMessage282_invoker = createInvoker(
    Messages_4.get.sendMessage2(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Messages",
      "sendMessage2",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """porukauseru/$userId<[^/]+>"""
    )
  )

  // @LINE:129
  private[this] lazy val controllers_NewsController_newsRender83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_newsRender83_invoker = createInvoker(
    NewsController_2.get.newsRender(fakeValue[Integer]),
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

  // @LINE:130
  private[this] lazy val controllers_NewsController_newsPanelRender84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vijestpanel")))
  )
  private[this] lazy val controllers_NewsController_newsPanelRender84_invoker = createInvoker(
    NewsController_2.get.newsPanelRender(),
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

  // @LINE:131
  private[this] lazy val controllers_NewsController_createNewsRender85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajvijest")))
  )
  private[this] lazy val controllers_NewsController_createNewsRender85_invoker = createInvoker(
    NewsController_2.get.createNewsRender(),
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

  // @LINE:132
  private[this] lazy val controllers_NewsController_createNews86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kreirajvijest")))
  )
  private[this] lazy val controllers_NewsController_createNews86_invoker = createInvoker(
    NewsController_2.get.createNews(),
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

  // @LINE:133
  private[this] lazy val controllers_NewsController_deleteNews87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisivijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_deleteNews87_invoker = createInvoker(
    NewsController_2.get.deleteNews(fakeValue[Integer]),
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

  // @LINE:134
  private[this] lazy val controllers_NewsController_deleteNews88_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisivijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_deleteNews88_invoker = createInvoker(
    NewsController_2.get.deleteNews(fakeValue[Integer]),
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

  // @LINE:135
  private[this] lazy val controllers_NewsController_updateNewsRender89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azurirajvijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_updateNewsRender89_invoker = createInvoker(
    NewsController_2.get.updateNewsRender(fakeValue[Integer]),
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

  // @LINE:136
  private[this] lazy val controllers_NewsController_updateNews90_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("azurirajvijest/"), DynamicPart("newsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsController_updateNews90_invoker = createInvoker(
    NewsController_2.get.updateNews(fakeValue[Integer]),
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

  // @LINE:139
  private[this] lazy val controllers_Reviews_saveReview91_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_saveReview91_invoker = createInvoker(
    Reviews_5.get.saveReview(fakeValue[Integer]),
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

  // @LINE:140
  private[this] lazy val controllers_Reviews_itemReviews92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocjene/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_itemReviews92_invoker = createInvoker(
    Reviews_5.get.itemReviews(fakeValue[Integer]),
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

  // @LINE:141
  private[this] lazy val controllers_Reviews_deleteReview93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeocjene/"), DynamicPart("reviewId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_deleteReview93_invoker = createInvoker(
    Reviews_5.get.deleteReview(fakeValue[Integer]),
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

  // @LINE:142
  private[this] lazy val controllers_Reviews_deleteReview94_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("brisanjeocjene/"), DynamicPart("reviewId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reviews_deleteReview94_invoker = createInvoker(
    Reviews_5.get.deleteReview(fakeValue[Integer]),
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

  // @LINE:145
  private[this] lazy val controllers_Partners_partnerPanel95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("partneri")))
  )
  private[this] lazy val controllers_Partners_partnerPanel95_invoker = createInvoker(
    Partners_3.get.partnerPanel(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Partners",
      "partnerPanel",
      Nil,
      "GET",
      """PARTNERI""",
      this.prefix + """partneri"""
    )
  )

  // @LINE:146
  private[this] lazy val controllers_Partners_partnerPageRender96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("partner/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Partners_partnerPageRender96_invoker = createInvoker(
    Partners_3.get.partnerPageRender(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Partners",
      "partnerPageRender",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """partner/$userId<[^/]+>"""
    )
  )

  // @LINE:149
  private[this] lazy val controllers_Items_searchBox97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pretraga")))
  )
  private[this] lazy val controllers_Items_searchBox97_invoker = createInvoker(
    Items_9.get.searchBox(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "searchBox",
      Nil,
      "POST",
      """SEARCH""",
      this.prefix + """pretraga"""
    )
  )

  // @LINE:150
  private[this] lazy val controllers_Items_searchBoxMobile98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pretragatelefon")))
  )
  private[this] lazy val controllers_Items_searchBoxMobile98_invoker = createInvoker(
    Items_9.get.searchBoxMobile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "searchBoxMobile",
      Nil,
      "POST",
      """""",
      this.prefix + """pretragatelefon"""
    )
  )

  // @LINE:153
  private[this] lazy val controllers_Banners_createBannerRender99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajBanner")))
  )
  private[this] lazy val controllers_Banners_createBannerRender99_invoker = createInvoker(
    Banners_1.get.createBannerRender(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Banners",
      "createBannerRender",
      Nil,
      "GET",
      """BANNERI""",
      this.prefix + """dodajBanner"""
    )
  )

  // @LINE:154
  private[this] lazy val controllers_Banners_createBanner100_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dodajBanner")))
  )
  private[this] lazy val controllers_Banners_createBanner100_invoker = createInvoker(
    Banners_1.get.createBanner(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Banners",
      "createBanner",
      Nil,
      "POST",
      """""",
      this.prefix + """dodajBanner"""
    )
  )

  // @LINE:155
  private[this] lazy val controllers_Banners_listOfBanners101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaBannera")))
  )
  private[this] lazy val controllers_Banners_listOfBanners101_invoker = createInvoker(
    Banners_1.get.listOfBanners(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Banners",
      "listOfBanners",
      Nil,
      "GET",
      """""",
      this.prefix + """listaBannera"""
    )
  )

  // @LINE:156
  private[this] lazy val controllers_Banners_deleteBanner102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obrisibanner/"), DynamicPart("bannerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Banners_deleteBanner102_invoker = createInvoker(
    Banners_1.get.deleteBanner(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Banners",
      "deleteBanner",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """obrisibanner/$bannerId<[^/]+>"""
    )
  )

  // @LINE:157
  private[this] lazy val controllers_Banners_deleteBanner103_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obrisibanner/"), DynamicPart("bannerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Banners_deleteBanner103_invoker = createInvoker(
    Banners_1.get.deleteBanner(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Banners",
      "deleteBanner",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """obrisibanner/$bannerId<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_10.get.index())
      }
  
    // @LINE:7
    case controllers_Application_unAuthorized1_route(params) =>
      call { 
        controllers_Application_unAuthorized1_invoker.call(Application_10.get.unAuthorized())
      }
  
    // @LINE:11
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_12.get.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Login_loginPageRender3_route(params) =>
      call { 
        controllers_Login_loginPageRender3_invoker.call(Login_8.get.loginPageRender())
      }
  
    // @LINE:15
    case controllers_Login_login4_route(params) =>
      call { 
        controllers_Login_login4_invoker.call(Login_8.get.login())
      }
  
    // @LINE:16
    case controllers_Login_logout5_route(params) =>
      call { 
        controllers_Login_logout5_invoker.call(Login_8.get.logout())
      }
  
    // @LINE:19
    case controllers_AppUsers_adminPanelRender6_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_adminPanelRender6_invoker.call(AppUsers_7.get.adminPanelRender(userId))
      }
  
    // @LINE:20
    case controllers_AppUsers_listOfUsersRender7_route(params) =>
      call { 
        controllers_AppUsers_listOfUsersRender7_invoker.call(AppUsers_7.get.listOfUsersRender())
      }
  
    // @LINE:21
    case controllers_AppUsers_createUserRender8_route(params) =>
      call { 
        controllers_AppUsers_createUserRender8_invoker.call(AppUsers_7.get.createUserRender())
      }
  
    // @LINE:22
    case controllers_AppUsers_createUser9_route(params) =>
      call { 
        controllers_AppUsers_createUser9_invoker.call(AppUsers_7.get.createUser())
      }
  
    // @LINE:23
    case controllers_AppUsers_deleteUser10_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser10_invoker.call(AppUsers_7.get.deleteUser(userId))
      }
  
    // @LINE:24
    case controllers_AppUsers_deleteUser11_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_deleteUser11_invoker.call(AppUsers_7.get.deleteUser(userId))
      }
  
    // @LINE:25
    case controllers_AppUsers_updateAdminInformationsRender12_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformationsRender12_invoker.call(AppUsers_7.get.updateAdminInformationsRender(userId))
      }
  
    // @LINE:26
    case controllers_AppUsers_updateAdminInformations13_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminInformations13_invoker.call(AppUsers_7.get.updateAdminInformations(userId))
      }
  
    // @LINE:27
    case controllers_AppUsers_updateAdminPassword14_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateAdminPassword14_invoker.call(AppUsers_7.get.updateAdminPassword(userId))
      }
  
    // @LINE:28
    case controllers_Items_allItems15_route(params) =>
      call { 
        controllers_Items_allItems15_invoker.call(Items_9.get.allItems())
      }
  
    // @LINE:29
    case controllers_Items_showOnHomepage16_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_showOnHomepage16_invoker.call(Items_9.get.showOnHomepage(itemId))
      }
  
    // @LINE:30
    case controllers_AppUsers_isUserActive17_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_isUserActive17_invoker.call(AppUsers_7.get.isUserActive(userId))
      }
  
    // @LINE:31
    case controllers_Items_usersItems18_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_usersItems18_invoker.call(Items_9.get.usersItems(userId))
      }
  
    // @LINE:36
    case controllers_AppUsers_userPanelRender19_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_userPanelRender19_invoker.call(AppUsers_7.get.userPanelRender(userId))
      }
  
    // @LINE:37
    case controllers_AppUsers_updateUserInformationsRender20_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformationsRender20_invoker.call(AppUsers_7.get.updateUserInformationsRender(userId))
      }
  
    // @LINE:38
    case controllers_AppUsers_updateUserInformations21_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserInformations21_invoker.call(AppUsers_7.get.updateUserInformations(userId))
      }
  
    // @LINE:39
    case controllers_AppUsers_updateUserPassword22_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_updateUserPassword22_invoker.call(AppUsers_7.get.updateUserPassword(userId))
      }
  
    // @LINE:40
    case controllers_AppUsers_userDescriptionRender23_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_userDescriptionRender23_invoker.call(AppUsers_7.get.userDescriptionRender(userId))
      }
  
    // @LINE:41
    case controllers_AppUsers_userDescription24_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_userDescription24_invoker.call(AppUsers_7.get.userDescription(userId))
      }
  
    // @LINE:42
    case controllers_AppUsers_imagesUploadRender25_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_imagesUploadRender25_invoker.call(AppUsers_7.get.imagesUploadRender(userId))
      }
  
    // @LINE:43
    case controllers_AppUsers_imagesUpload26_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_AppUsers_imagesUpload26_invoker.call(AppUsers_7.get.imagesUpload(userId))
      }
  
    // @LINE:47
    case controllers_Items_listOfItems27_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_listOfItems27_invoker.call(Items_9.get.listOfItems(userId))
      }
  
    // @LINE:48
    case controllers_Items_deleteItem28_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem28_invoker.call(Items_9.get.deleteItem(itemId))
      }
  
    // @LINE:49
    case controllers_Items_deleteItem29_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_deleteItem29_invoker.call(Items_9.get.deleteItem(itemId))
      }
  
    // @LINE:50
    case controllers_Items_updateItemRender30_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItemRender30_invoker.call(Items_9.get.updateItemRender(itemId))
      }
  
    // @LINE:51
    case controllers_Items_updateItem31_route(params) =>
      call(params.fromQuery[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_updateItem31_invoker.call(Items_9.get.updateItem(itemId))
      }
  
    // @LINE:52
    case controllers_Items_createItemRender32_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItemRender32_invoker.call(Items_9.get.createItemRender(userId))
      }
  
    // @LINE:53
    case controllers_Items_createItem33_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Items_createItem33_invoker.call(Items_9.get.createItem(userId))
      }
  
    // @LINE:54
    case controllers_Items_itemRender34_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_itemRender34_invoker.call(Items_9.get.itemRender(itemId))
      }
  
    // @LINE:55
    case controllers_Items_getItemsWithCategory35_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Items_getItemsWithCategory35_invoker.call(Items_9.get.getItemsWithCategory(categoryId))
      }
  
    // @LINE:56
    case controllers_Items_getItemsWithSubCategory36_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Items_getItemsWithSubCategory36_invoker.call(Items_9.get.getItemsWithSubCategory(subcategoryId))
      }
  
    // @LINE:59
    case controllers_Items_blockUnblockItem37_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_blockUnblockItem37_invoker.call(Items_9.get.blockUnblockItem(itemId))
      }
  
    // @LINE:60
    case controllers_Items_activateDeactivateItem38_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Items_activateDeactivateItem38_invoker.call(Items_9.get.activateDeactivateItem(itemId))
      }
  
    // @LINE:63
    case controllers_Items_getItemsWithPriceRange139_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange139_invoker.call(Items_9.get.getItemsWithPriceRange1())
      }
  
    // @LINE:64
    case controllers_Items_getItemsWithPriceRange240_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange240_invoker.call(Items_9.get.getItemsWithPriceRange2())
      }
  
    // @LINE:65
    case controllers_Items_getItemsWithPriceRange341_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange341_invoker.call(Items_9.get.getItemsWithPriceRange3())
      }
  
    // @LINE:66
    case controllers_Items_getItemsWithPriceRange442_route(params) =>
      call { 
        controllers_Items_getItemsWithPriceRange442_invoker.call(Items_9.get.getItemsWithPriceRange4())
      }
  
    // @LINE:69
    case controllers_Items_itemsOnSale43_route(params) =>
      call { 
        controllers_Items_itemsOnSale43_invoker.call(Items_9.get.itemsOnSale())
      }
  
    // @LINE:73
    case controllers_Categories_listOfCategories44_route(params) =>
      call { 
        controllers_Categories_listOfCategories44_invoker.call(Categories_11.get.listOfCategories())
      }
  
    // @LINE:74
    case controllers_Categories_deleteCategory45_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory45_invoker.call(Categories_11.get.deleteCategory(categoryId))
      }
  
    // @LINE:75
    case controllers_Categories_deleteCategory46_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_deleteCategory46_invoker.call(Categories_11.get.deleteCategory(categoryId))
      }
  
    // @LINE:76
    case controllers_Categories_createCategoryRender47_route(params) =>
      call { 
        controllers_Categories_createCategoryRender47_invoker.call(Categories_11.get.createCategoryRender())
      }
  
    // @LINE:77
    case controllers_Categories_createCategory48_route(params) =>
      call { 
        controllers_Categories_createCategory48_invoker.call(Categories_11.get.createCategory())
      }
  
    // @LINE:78
    case controllers_Categories_updateCategoryRender49_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategoryRender49_invoker.call(Categories_11.get.updateCategoryRender(categoryId))
      }
  
    // @LINE:79
    case controllers_Categories_updateCategory50_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_updateCategory50_invoker.call(Categories_11.get.updateCategory(categoryId))
      }
  
    // @LINE:82
    case controllers_Categories_createSubCategoryRender51_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_createSubCategoryRender51_invoker.call(Categories_11.get.createSubCategoryRender(categoryId))
      }
  
    // @LINE:83
    case controllers_Categories_createSubCategory52_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_createSubCategory52_invoker.call(Categories_11.get.createSubCategory(categoryId))
      }
  
    // @LINE:84
    case controllers_Categories_listOfSubCategories53_route(params) =>
      call(params.fromPath[Integer]("categoryId", None)) { (categoryId) =>
        controllers_Categories_listOfSubCategories53_invoker.call(Categories_11.get.listOfSubCategories(categoryId))
      }
  
    // @LINE:85
    case controllers_Categories_updateSubCategoryRender54_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_updateSubCategoryRender54_invoker.call(Categories_11.get.updateSubCategoryRender(subcategoryId))
      }
  
    // @LINE:86
    case controllers_Categories_updateSubCategory55_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_updateSubCategory55_invoker.call(Categories_11.get.updateSubCategory(subcategoryId))
      }
  
    // @LINE:87
    case controllers_Categories_deleteSubCategory56_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_deleteSubCategory56_invoker.call(Categories_11.get.deleteSubCategory(subcategoryId))
      }
  
    // @LINE:88
    case controllers_Categories_deleteSubCategory57_route(params) =>
      call(params.fromPath[Integer]("subcategoryId", None)) { (subcategoryId) =>
        controllers_Categories_deleteSubCategory57_invoker.call(Categories_11.get.deleteSubCategory(subcategoryId))
      }
  
    // @LINE:91
    case controllers_Stores_createStoreRender58_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_createStoreRender58_invoker.call(Stores_6.get.createStoreRender(userId))
      }
  
    // @LINE:92
    case controllers_Stores_createStore59_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_createStore59_invoker.call(Stores_6.get.createStore(userId))
      }
  
    // @LINE:93
    case controllers_Stores_updateStoreRender60_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_updateStoreRender60_invoker.call(Stores_6.get.updateStoreRender(storeId))
      }
  
    // @LINE:94
    case controllers_Stores_updateStore61_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_updateStore61_invoker.call(Stores_6.get.updateStore(storeId))
      }
  
    // @LINE:95
    case controllers_Stores_deleteStore62_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_deleteStore62_invoker.call(Stores_6.get.deleteStore(storeId))
      }
  
    // @LINE:96
    case controllers_Stores_deleteStore63_route(params) =>
      call(params.fromPath[Integer]("storeId", None)) { (storeId) =>
        controllers_Stores_deleteStore63_invoker.call(Stores_6.get.deleteStore(storeId))
      }
  
    // @LINE:97
    case controllers_Stores_listOfStores64_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Stores_listOfStores64_invoker.call(Stores_6.get.listOfStores(userId))
      }
  
    // @LINE:100
    case controllers_ContactUs_contactUsRender65_route(params) =>
      call { 
        controllers_ContactUs_contactUsRender65_invoker.call(ContactUs_0.get.contactUsRender())
      }
  
    // @LINE:101
    case controllers_ContactUs_contactUs66_route(params) =>
      call { 
        controllers_ContactUs_contactUs66_invoker.call(ContactUs_0.get.contactUs())
      }
  
    // @LINE:104
    case controllers_Application_faqRender67_route(params) =>
      call { 
        controllers_Application_faqRender67_invoker.call(Application_10.get.faqRender())
      }
  
    // @LINE:107
    case controllers_Images_imagesUploadRender68_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_imagesUploadRender68_invoker.call(Images_13.get.imagesUploadRender(itemId))
      }
  
    // @LINE:108
    case controllers_Images_imagesUpload69_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_imagesUpload69_invoker.call(Images_13.get.imagesUpload(itemId))
      }
  
    // @LINE:109
    case controllers_Images_listOfPicturesRender70_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Images_listOfPicturesRender70_invoker.call(Images_13.get.listOfPicturesRender(itemId))
      }
  
    // @LINE:110
    case controllers_Images_deleteImage71_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteImage71_invoker.call(Images_13.get.deleteImage(imageId))
      }
  
    // @LINE:111
    case controllers_Images_deleteImage72_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteImage72_invoker.call(Images_13.get.deleteImage(imageId))
      }
  
    // @LINE:112
    case controllers_Images_deleteLogo73_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteLogo73_invoker.call(Images_13.get.deleteLogo(imageId))
      }
  
    // @LINE:113
    case controllers_Images_deleteLogo74_route(params) =>
      call(params.fromPath[String]("imageId", None)) { (imageId) =>
        controllers_Images_deleteLogo74_invoker.call(Images_13.get.deleteLogo(imageId))
      }
  
    // @LINE:116
    case controllers_Items_lastTenProducts75_route(params) =>
      call { 
        controllers_Items_lastTenProducts75_invoker.call(Items_9.get.lastTenProducts())
      }
  
    // @LINE:119
    case controllers_Messages_sendMessage76_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Messages_sendMessage76_invoker.call(Messages_4.get.sendMessage(itemId))
      }
  
    // @LINE:120
    case controllers_Messages_listOfMessages77_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Messages_listOfMessages77_invoker.call(Messages_4.get.listOfMessages(userId))
      }
  
    // @LINE:121
    case controllers_Messages_message78_route(params) =>
      call(params.fromPath[Integer]("messageId", None)) { (messageId) =>
        controllers_Messages_message78_invoker.call(Messages_4.get.message(messageId))
      }
  
    // @LINE:122
    case controllers_Messages_deleteMessage79_route(params) =>
      call(params.fromPath[Integer]("messageId", None)) { (messageId) =>
        controllers_Messages_deleteMessage79_invoker.call(Messages_4.get.deleteMessage(messageId))
      }
  
    // @LINE:123
    case controllers_Messages_notifications80_route(params) =>
      call { 
        controllers_Messages_notifications80_invoker.call(Messages_4.get.notifications())
      }
  
    // @LINE:124
    case controllers_Messages_listOfMessagesForAdmin81_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Messages_listOfMessagesForAdmin81_invoker.call(Messages_4.get.listOfMessagesForAdmin(userId))
      }
  
    // @LINE:125
    case controllers_Messages_sendMessage282_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Messages_sendMessage282_invoker.call(Messages_4.get.sendMessage2(userId))
      }
  
    // @LINE:129
    case controllers_NewsController_newsRender83_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_newsRender83_invoker.call(NewsController_2.get.newsRender(newsId))
      }
  
    // @LINE:130
    case controllers_NewsController_newsPanelRender84_route(params) =>
      call { 
        controllers_NewsController_newsPanelRender84_invoker.call(NewsController_2.get.newsPanelRender())
      }
  
    // @LINE:131
    case controllers_NewsController_createNewsRender85_route(params) =>
      call { 
        controllers_NewsController_createNewsRender85_invoker.call(NewsController_2.get.createNewsRender())
      }
  
    // @LINE:132
    case controllers_NewsController_createNews86_route(params) =>
      call { 
        controllers_NewsController_createNews86_invoker.call(NewsController_2.get.createNews())
      }
  
    // @LINE:133
    case controllers_NewsController_deleteNews87_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_deleteNews87_invoker.call(NewsController_2.get.deleteNews(newsId))
      }
  
    // @LINE:134
    case controllers_NewsController_deleteNews88_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_deleteNews88_invoker.call(NewsController_2.get.deleteNews(newsId))
      }
  
    // @LINE:135
    case controllers_NewsController_updateNewsRender89_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_updateNewsRender89_invoker.call(NewsController_2.get.updateNewsRender(newsId))
      }
  
    // @LINE:136
    case controllers_NewsController_updateNews90_route(params) =>
      call(params.fromPath[Integer]("newsId", None)) { (newsId) =>
        controllers_NewsController_updateNews90_invoker.call(NewsController_2.get.updateNews(newsId))
      }
  
    // @LINE:139
    case controllers_Reviews_saveReview91_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Reviews_saveReview91_invoker.call(Reviews_5.get.saveReview(itemId))
      }
  
    // @LINE:140
    case controllers_Reviews_itemReviews92_route(params) =>
      call(params.fromPath[Integer]("itemId", None)) { (itemId) =>
        controllers_Reviews_itemReviews92_invoker.call(Reviews_5.get.itemReviews(itemId))
      }
  
    // @LINE:141
    case controllers_Reviews_deleteReview93_route(params) =>
      call(params.fromPath[Integer]("reviewId", None)) { (reviewId) =>
        controllers_Reviews_deleteReview93_invoker.call(Reviews_5.get.deleteReview(reviewId))
      }
  
    // @LINE:142
    case controllers_Reviews_deleteReview94_route(params) =>
      call(params.fromPath[Integer]("reviewId", None)) { (reviewId) =>
        controllers_Reviews_deleteReview94_invoker.call(Reviews_5.get.deleteReview(reviewId))
      }
  
    // @LINE:145
    case controllers_Partners_partnerPanel95_route(params) =>
      call { 
        controllers_Partners_partnerPanel95_invoker.call(Partners_3.get.partnerPanel())
      }
  
    // @LINE:146
    case controllers_Partners_partnerPageRender96_route(params) =>
      call(params.fromPath[Integer]("userId", None)) { (userId) =>
        controllers_Partners_partnerPageRender96_invoker.call(Partners_3.get.partnerPageRender(userId))
      }
  
    // @LINE:149
    case controllers_Items_searchBox97_route(params) =>
      call { 
        controllers_Items_searchBox97_invoker.call(Items_9.get.searchBox())
      }
  
    // @LINE:150
    case controllers_Items_searchBoxMobile98_route(params) =>
      call { 
        controllers_Items_searchBoxMobile98_invoker.call(Items_9.get.searchBoxMobile())
      }
  
    // @LINE:153
    case controllers_Banners_createBannerRender99_route(params) =>
      call { 
        controllers_Banners_createBannerRender99_invoker.call(Banners_1.get.createBannerRender())
      }
  
    // @LINE:154
    case controllers_Banners_createBanner100_route(params) =>
      call { 
        controllers_Banners_createBanner100_invoker.call(Banners_1.get.createBanner())
      }
  
    // @LINE:155
    case controllers_Banners_listOfBanners101_route(params) =>
      call { 
        controllers_Banners_listOfBanners101_invoker.call(Banners_1.get.listOfBanners())
      }
  
    // @LINE:156
    case controllers_Banners_deleteBanner102_route(params) =>
      call(params.fromPath[Integer]("bannerId", None)) { (bannerId) =>
        controllers_Banners_deleteBanner102_invoker.call(Banners_1.get.deleteBanner(bannerId))
      }
  
    // @LINE:157
    case controllers_Banners_deleteBanner103_route(params) =>
      call(params.fromPath[Integer]("bannerId", None)) { (bannerId) =>
        controllers_Banners_deleteBanner103_invoker.call(Banners_1.get.deleteBanner(bannerId))
      }
  }
}