
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object main_Scope1 {
import helpers.UserAccessLevel

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(content: Html)(implicit currentUser: AppUser = UserAccessLevel.getCurrentUser(ctx())):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.88*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">

        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

            <!-- Favicons Icon -->
        <link rel="icon" href="http://demo.magikthemes.com/skin/frontend/base/default/favicon.ico" type="image/x-icon" />
        <link rel="shortcut icon" href="http://demo.magikthemes.com/skin/frontend/base/default/favicon.ico" type="image/x-icon" />
        <title>Namjestaj</title>

            <!-- Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link rel="stylesheet" href='"""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("/stylesheets/font-awesome.min.css")),format.raw/*22.99*/("""' media="all" />
            <!-- CSS Style -->
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*24.55*/routes/*24.61*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*24.111*/("""'>
        """),format.raw/*25.128*/("""
        """),format.raw/*26.9*/("""<link rel="stylesheet" type="text/css" href='"""),_display_(/*26.55*/routes/*26.61*/.Assets.versioned("stylesheets/animate.css")),format.raw/*26.105*/("""' media="all">
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*27.55*/routes/*27.61*/.Assets.versioned("stylesheets/revslider.css")),format.raw/*27.107*/("""' >
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*28.55*/routes/*28.61*/.Assets.versioned("stylesheets/owl.carousel.css")),format.raw/*28.110*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*29.55*/routes/*29.61*/.Assets.versioned("stylesheets/owl.theme.css")),format.raw/*29.107*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*30.55*/routes/*30.61*/.Assets.versioned("stylesheets/jquery.bxslider.css")),format.raw/*30.113*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*31.55*/routes/*31.61*/.Assets.versioned("stylesheets/jquery.mobile-menu.css")),format.raw/*31.116*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*32.55*/routes/*32.61*/.Assets.versioned("stylesheets/style.css")),format.raw/*32.103*/("""' media="all">
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*33.55*/routes/*33.61*/.Assets.versioned("stylesheets/flexslider.css")),format.raw/*33.108*/("""' media="all">
            <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200italic,300,300italic,400,400italic,600,600italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,500,300,700,900' rel='stylesheet' type='text/css'>


            <!-- JavaScript -->
        <script type="text/javascript" src='"""),_display_(/*41.46*/routes/*41.52*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*41.98*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*42.46*/routes/*42.52*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*42.101*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*43.46*/routes/*43.52*/.Assets.versioned("javascripts/parallax.js")),format.raw/*43.96*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*44.46*/routes/*44.52*/.Assets.versioned("javascripts/revslider.js")),format.raw/*44.97*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*45.46*/routes/*45.52*/.Assets.versioned("javascripts/common.js")),format.raw/*45.94*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*46.46*/routes/*46.52*/.Assets.versioned("javascripts/jquery.bxslider.min.js")),format.raw/*46.107*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*47.46*/routes/*47.52*/.Assets.versioned("javascripts/owl.carousel.min.js")),format.raw/*47.104*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*48.46*/routes/*48.52*/.Assets.versioned("javascripts/jquery.mobile-menu.min.js")),format.raw/*48.110*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*49.46*/routes/*49.52*/.Assets.versioned("javascripts/cloud-zoom.js")),format.raw/*49.98*/("""'></script>
        <script type='text/javascript'>
        jQuery(document).ready(function()"""),format.raw/*51.42*/("""{"""),format.raw/*51.43*/("""
            """),format.raw/*52.13*/("""jQuery('#rev_slider_4').show().revolution("""),format.raw/*52.55*/("""{"""),format.raw/*52.56*/("""
                """),format.raw/*53.17*/("""dottedOverlay: 'none',
                delay: 5000,
                startwidth: 1170,
                startheight: 600,

                hideThumbs: 200,
                thumbWidth: 200,
                thumbHeight: 50,
                thumbAmount: 2,

                navigationType: 'thumb',
                navigationArrows: 'solo',
                navigationStyle: 'round',

                touchenabled: 'on',
                onHoverStop: 'on',

                swipe_velocity: 0.7,
                swipe_min_touches: 1,
                swipe_max_touches: 1,
                drag_block_vertical: false,

                spinner: 'spinner0',
                keyboardNavigation: 'off',

                navigationHAlign: 'center',
                navigationVAlign: 'bottom',
                navigationHOffset: 0,
                navigationVOffset: 20,

                soloArrowLeftHalign: 'left',
                soloArrowLeftValign: 'center',
                soloArrowLeftHOffset: 20,
                soloArrowLeftVOffset: 0,

                soloArrowRightHalign: 'right',
                soloArrowRightValign: 'center',
                soloArrowRightHOffset: 20,
                soloArrowRightVOffset: 0,

                shadow: 0,
                fullWidth: 'on',
                fullScreen: 'off',

                stopLoop: 'off',
                stopAfterLoops: -1,
                stopAtSlide: -1,

                shuffle: 'off',

                autoHeight: 'off',
                forceFullWidth: 'on',
                fullScreenAlignForce: 'off',
                minFullScreenHeight: 0,
                hideNavDelayOnMobile: 1500,

                hideThumbsOnMobile: 'off',
                hideBulletsOnMobile: 'off',
                hideArrowsOnMobile: 'off',
                hideThumbsUnderResolution: 0,

                hideSliderAtLimit: 0,
                hideCaptionAtLimit: 0,
                hideAllCaptionAtLilmit: 0,
                startWithSlide: 0,
                fullScreenOffsetContainer: ''
            """),format.raw/*119.13*/("""}"""),format.raw/*119.14*/(""");
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""");
        </script>
        <script type="text/javascript" src='"""),_display_(/*122.46*/routes/*122.52*/.Assets.versioned("javascripts/jquery.flexslider.js")),format.raw/*122.105*/("""'></script>

        <script type="text/javascript" src='"""),_display_(/*124.46*/routes/*124.52*/.Assets.versioned("javascripts/sweetalert.min.js")),format.raw/*124.102*/("""'></script>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*125.54*/routes/*125.60*/.Assets.versioned("stylesheets/sweetalert.css")),format.raw/*125.107*/("""'>

        <link rel="stylesheet" media="screen" href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css">
        <script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>

        """),format.raw/*130.111*/("""
        """),format.raw/*131.9*/("""<script type="text/javascript" src='"""),_display_(/*131.46*/routes/*131.52*/.Assets.versioned("javascripts/googleAnalytics.js")),format.raw/*131.103*/("""'></script>



    </head>


    <body class="cms-index-index cms-home-page">
        <div id="page">
            """),format.raw/*140.45*/("""
            """),format.raw/*141.130*/("""
            """),format.raw/*142.133*/("""
            """),format.raw/*143.23*/("""

                """),format.raw/*145.17*/("""<!-- Navbar -->
            <nav class=" navbar-fixed-top">
                """),format.raw/*147.45*/("""
                """),format.raw/*148.17*/("""<div class="row">
                    <div class="col-lg-2 col-sm-2 col-xs-4 col-lg-offset-1">
                            <!-- Header Logo -->
                        <div class="logo"><a title="Magento Commerce" href=""""),_display_(/*151.78*/routes/*151.84*/.Application.index()),format.raw/*151.104*/(""""><img alt="Namjestaj" src='"""),_display_(/*151.133*/routes/*151.139*/.Assets.versioned("images/logo.png")),format.raw/*151.175*/("""'></a></div>
                            <!-- End Header Logo -->
                    </div>
                    <div class="mm-toggle-wrap">
                        <div class="mm-toggle"><i class="fa fa-bars"></i><span class="mm-label">Menu</span> </div>
                    </div>
                    <div class="nav-inner col-lg-9">

                        <ul id="nav" class="hidden-xs">
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*160.74*/routes/*160.80*/.Application.index()),format.raw/*160.100*/("""" class="level-top"><span>
                                   Početna</span></a></li>
                            <li class="mega-menu"><a href="" class="level-top"><span>NAMEŠTAJ</span></a>
                                <div class="level0-wrapper dropdown-6col">
                                    <div class="container">
                                        <div class="level0-wrapper2">
                                            <div class="nav-block nav-block-center">
                                                <ul class="level0">
                                                """),_display_(/*168.50*/for(category <- models.Category.findAllCategories()) yield /*168.102*/ {_display_(Seq[Any](format.raw/*168.104*/("""
                                                    """),format.raw/*169.53*/("""<li class="level1 nav-6-1 parent item"><a href=""""),_display_(/*169.102*/routes/*169.108*/.Items.getItemsWithCategory(category.id)),format.raw/*169.148*/(""""><span>
                                                    """),_display_(/*170.54*/category/*170.62*/.name),format.raw/*170.67*/("""</span>
                                                    </a>
                                                        <ul class="level1">
                                                        """),_display_(/*173.58*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*173.126*/ {_display_(Seq[Any](format.raw/*173.128*/("""
                                                            """),format.raw/*174.61*/("""<li class="level2 nav-6-1-1"><a href=""""),_display_(/*174.100*/routes/*174.106*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*174.152*/(""""><span>
                                                            """),_display_(/*175.62*/subcategory/*175.73*/.name),format.raw/*175.78*/("""</span></a>
                                                            </li>
                                                        """)))}),format.raw/*177.58*/("""
                                                        """),format.raw/*178.57*/("""</ul>
                                                    </li>
                                                """)))}),format.raw/*180.50*/("""

                                                """),format.raw/*182.49*/("""</ul>
                                            </div>
                                        </div>
                                            <!--level0-wrapper2-->
                                        <div class="nav-add">
                                            <div class="push_item">
                                                <div class="push_img"><a href="#"><img alt="phone" src='"""),_display_(/*188.106*/routes/*188.112*/.Assets.versioned("images/menu_ele_phone1.png")),format.raw/*188.159*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href="#"><img alt="camera" src='"""),_display_(/*193.107*/routes/*193.113*/.Assets.versioned("images/menu_ele_phone2.png")),format.raw/*193.160*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href="#"><img alt="ipod" src='"""),_display_(/*198.105*/routes/*198.111*/.Assets.versioned("images/menu_ele_phone3.png")),format.raw/*198.158*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                            <div class="push_item push_item_last">
                                                <div class="push_img"><a href="#"><img alt="laptop" src='"""),_display_(/*203.107*/routes/*203.113*/.Assets.versioned("images/menu_ele_phone4.png")),format.raw/*203.160*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*211.74*/routes/*211.80*/.Items.itemsOnSale()),format.raw/*211.100*/("""" class="level-top"><span>
                                   AKCIJA</span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   TOP PONUDA</span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   IDEJE</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*217.74*/routes/*217.80*/.NewsController.newsPanelRender()),format.raw/*217.113*/("""" class="level-top"><span>
                                   VIJESTI</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*219.74*/routes/*219.80*/.Application.index()),format.raw/*219.100*/("""" class="level-top"><span>
                                   PARTNERI</span></a></li>
                            """),_display_(/*221.30*/if(currentUser == null)/*221.53*/ {_display_(Seq[Any](format.raw/*221.55*/("""
                                """),format.raw/*222.33*/("""<li class="level0 nav-8 level-top"><a href=""""),_display_(/*222.78*/routes/*222.84*/.Login.loginPageRender()),format.raw/*222.108*/("""" class="level-top"><span>
                                    Log In</span></a></li>
                            """)))}/*224.31*/else/*224.36*/{_display_(Seq[Any](format.raw/*224.37*/("""
                                """),_display_(/*225.34*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*225.95*/ {_display_(Seq[Any](format.raw/*225.97*/("""
                                    """),format.raw/*226.37*/("""<li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*226.96*/currentUser/*226.107*/.name),format.raw/*226.112*/("""</span></a>
                                        <div class="level0-wrapper dropdown-6col">
                                            <div class="container">
                                                <div class="level0-wrapper2">
                                                    <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                        <ul class="level0">
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                ADMIN PANEL</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*235.111*/routes/*235.117*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*235.159*/(""""><span>
                                                                    Admin Panel</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*237.111*/routes/*237.117*/.NewsController.createNewsRender()),format.raw/*237.151*/(""""><span>
                                                                        Kreiraj Vijest</span></a></li>

                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KORISNICI</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*245.105*/routes/*245.111*/.AppUsers.listOfUsersRender()),format.raw/*245.140*/(""""><span>
                                                                    Lista korisnika</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*247.105*/routes/*247.111*/.AppUsers.createUserRender()),format.raw/*247.139*/(""""><span>
                                                                        Dodaj korisnika</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*249.111*/routes/*249.117*/.Items.allItems()),format.raw/*249.134*/(""""><span>
                                                                        Lista proizvoda</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KATEGORIJE</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*256.105*/routes/*256.111*/.Categories.listOfCategories()),format.raw/*256.141*/(""""><span>
                                                                        Lista kategorija</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*258.105*/routes/*258.111*/.Categories.createCategoryRender()),format.raw/*258.145*/(""""><span>
                                                                        Dodaj kategoriju</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                               LOGOUT</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*265.105*/routes/*265.111*/.Login.logout()),format.raw/*265.126*/(""""><span>
                                                                    Logout</span></a></li>
                                                                </ul>
                                                            </li>

                                                        </ul>
                                                    </div>
                                                        <!--nav-block nav-block-center-->
                                                    <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*273.128*/routes/*273.134*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*273.179*/("""' alt="furniture"></a> </div>
                                                        <!--nav-block nav-block-right std grid12-4-->
                                                </div>
                                            </div>
                                                <!--level0-wrapper2-->
                                        </div>
                                    </li>
                                """)))}/*280.35*/else/*280.40*/{_display_(Seq[Any](format.raw/*280.41*/("""
                                    """),_display_(/*281.38*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*281.98*/ {_display_(Seq[Any](format.raw/*281.100*/("""
                                        """),format.raw/*282.41*/("""<script type="text/javascript" src=""""),_display_(/*282.78*/routes/*282.84*/.Assets.versioned("javascripts/messageNotifications.js")),format.raw/*282.140*/(""""></script>
                                        <li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*283.100*/currentUser/*283.111*/.name),format.raw/*283.116*/("""</span></a>
                                            <div class="level0-wrapper dropdown-6col">
                                                <div class="container">
                                                    <div class="level0-wrapper2">
                                                        <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                            <ul class="level0">
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    Krisnički panel</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*292.115*/routes/*292.121*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*292.162*/(""""><span>
                                                                            Korisnički panel</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*294.115*/routes/*294.121*/.AppUsers.updateUserInformationsRender(currentUser.id)),format.raw/*294.175*/(""""><span>
                                                                            Ažuriraj podatke</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*296.115*/routes/*296.121*/.Messages.listOfMessages(currentUser.id)),format.raw/*296.161*/(""""><span>
                                                                            Poruke </span> <span class="badge" id="message_notifications"> </span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    OBJEKTI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*303.109*/routes/*303.115*/.Stores.listOfStores(currentUser.id)),format.raw/*303.151*/(""""><span>
                                                                            Lista objekata</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*305.109*/routes/*305.115*/.Stores.createStoreRender(currentUser.id)),format.raw/*305.156*/(""""><span>
                                                                            Dodaj objekat</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    PROIZVODI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*312.109*/routes/*312.115*/.Items.listOfItems(currentUser.id)),format.raw/*312.149*/(""""><span>
                                                                            Lista proizvoda</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*314.109*/routes/*314.115*/.Items.createItemRender(currentUser.id)),format.raw/*314.154*/(""""><span>
                                                                            Dodaj proizvod</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    LOGOUT</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*321.109*/routes/*321.115*/.Login.logout()),format.raw/*321.130*/(""""><span>
                                                                            Logout</span></a></li>
                                                                    </ul>
                                                                </li>

                                                            </ul>
                                                        </div>
                                                            <!--nav-block nav-block-center-->
                                                        <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*329.132*/routes/*329.138*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*329.183*/("""' alt="furniture"></a> </div>
                                                            <!--nav-block nav-block-right std grid12-4-->
                                                    </div>
                                                </div>
                                                    <!--level0-wrapper2-->
                                            </div>
                                        </li>
                                    """)))}),format.raw/*336.38*/("""
                                """)))}),format.raw/*337.34*/("""
                            """)))}),format.raw/*338.30*/("""
                                """),format.raw/*339.56*/("""
                            """),format.raw/*340.68*/("""
                                """),format.raw/*341.110*/("""
                                    """),format.raw/*342.145*/("""
                                    """),format.raw/*343.134*/("""
                                """),format.raw/*344.44*/("""
                            """),format.raw/*345.39*/("""
                                """),format.raw/*346.60*/("""
                        """),format.raw/*347.25*/("""</ul>
                    </div>
                </div>
                """),format.raw/*350.27*/("""
            """),format.raw/*351.13*/("""</nav>
                <!-- end nav -->

                <!-------------------------------------------- CONTENT --------------------------------------------->
            <div style="margin-top: 60px">
                """),_display_(/*356.18*/content),format.raw/*356.25*/("""
            """),format.raw/*357.13*/("""</div>

                <!-- Footer -->
            <footer>
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 col-lg-12 col-md-12" >
                                <div class="footer-column pull-left col-md-3">
                                    <h4>O NAMA</h4>
                                    <ul class="links">
                                        <li><a href=""""),_display_(/*368.55*/routes/*368.61*/.Application.faqRender()),format.raw/*368.85*/("""" title="FAQs">FAQs</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left col-md-3">
                                    <h4>MARKETING</h4>
                                    <ul class="links">

                                    </ul>
                                </div>
                                <div class="footer-column pull-left col-md-3">
                                    <h4>KONTAKTIRAJTE NAS/PREDLOŽITE</h4>
                                    <ul class="links">
                                        <li><a href=""""),_display_(/*380.55*/routes/*380.61*/.ContactUs.contactUsRender()),format.raw/*380.89*/("""" title="Contact Us">
                                            Contact Us</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left col-md-3">
                                    <h4>PRAVILA KORIŠTENJA</h4>
                                    <ul class="links">
                                    </ul>
                                </div>
                            </div>
                            """),format.raw/*390.65*/("""
                                """),format.raw/*391.69*/("""
                                    """),format.raw/*392.61*/("""
                                        """),format.raw/*393.63*/("""
                                        """),format.raw/*394.62*/("""
                                            """),format.raw/*395.95*/("""
                                            """),format.raw/*396.95*/("""
                                            """),format.raw/*397.103*/("""
                                            """),format.raw/*398.101*/("""
                                        """),format.raw/*399.50*/("""
                                    """),format.raw/*400.47*/("""
                                """),format.raw/*401.43*/("""
                            """),format.raw/*402.39*/("""
                        """),format.raw/*403.25*/("""</div>
                    </div>
                </div>
                """),format.raw/*406.48*/("""
                    """),format.raw/*407.48*/("""
                        """),format.raw/*408.46*/("""
                            """),format.raw/*409.113*/("""
                            """),format.raw/*410.42*/("""
                                """),format.raw/*411.72*/("""
                                """),format.raw/*412.116*/("""
                                """),format.raw/*413.124*/("""
                            """),format.raw/*414.43*/("""
                        """),format.raw/*415.35*/("""
                    """),format.raw/*416.31*/("""
                """),format.raw/*417.27*/("""
                """),format.raw/*418.17*/("""<div class="footer-bottom">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 text-center coppyright">&copy;
                                Copyright 2016. DT Projects. All Rights Reserved.</div>
                        </div>
                    </div>
                </div>
            </footer>
        </div>
        <div id="mobile-menu">
            <ul>
                """),format.raw/*430.25*/("""
                    """),format.raw/*431.48*/("""
                        """),format.raw/*432.49*/("""
                            """),format.raw/*433.58*/("""
                                """),format.raw/*434.66*/("""
                                    """),format.raw/*435.124*/("""
                                """),format.raw/*436.43*/("""
                                """),format.raw/*437.141*/("""
                            """),format.raw/*438.39*/("""
                        """),format.raw/*439.36*/("""
                    """),format.raw/*440.31*/("""
                """),format.raw/*441.26*/("""
            """),format.raw/*442.13*/("""<li><a href="">POČETNA</a></li>
                <li><a href="#">NAMJEŠTAJ</a>
                    <ul>
                        """),_display_(/*445.26*/for(category <- models.Category.findAllCategories()) yield /*445.78*/ {_display_(Seq[Any](format.raw/*445.80*/("""
                            """),format.raw/*446.29*/("""<li><a href=""""),_display_(/*446.43*/routes/*446.49*/.Items.getItemsWithCategory(category.id)),format.raw/*446.89*/(""""><span>
                                """),_display_(/*447.34*/category/*447.42*/.name),format.raw/*447.47*/("""</span>
                                    </a>
                                        <ul class="level1">
                                        """),_display_(/*450.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*450.110*/ {_display_(Seq[Any](format.raw/*450.112*/("""
                                            """),format.raw/*451.45*/("""<li><a href=""""),_display_(/*451.59*/routes/*451.65*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*451.111*/(""""><span>
                                            """),_display_(/*452.46*/subcategory/*452.57*/.name),format.raw/*452.62*/("""</span></a>
                                            </li>
                                        """)))}),format.raw/*454.42*/("""
                                        """),format.raw/*455.41*/("""</ul>
                                    </li>
                        """)))}),format.raw/*457.26*/("""

                    """),format.raw/*459.21*/("""</ul>
                </li>
                <li><a href="#">AKCIJA</a></li>
                <li><a href="#">TOP PONUDA</a></li>
                <li><a href="#">IDEJE</a></li>
                <li><a href=""""),_display_(/*464.31*/routes/*464.37*/.NewsController.newsPanelRender()),format.raw/*464.70*/("""">VIJESTI</a></li>
                <li><a href="#">PARTNERI</a></li>
                """),_display_(/*466.18*/if(currentUser == null)/*466.41*/ {_display_(Seq[Any](format.raw/*466.43*/("""
                    """),format.raw/*467.21*/("""<li><a href=""""),_display_(/*467.35*/routes/*467.41*/.Login.loginPageRender()),format.raw/*467.65*/("""" class="level-top"><span>Log In</span></a></li>
                """)))}/*468.19*/else/*468.24*/{_display_(Seq[Any](format.raw/*468.25*/("""
                    """),_display_(/*469.22*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*469.83*/ {_display_(Seq[Any](format.raw/*469.85*/("""
                        """),format.raw/*470.25*/("""<li><a href=""><span>"""),_display_(/*470.47*/currentUser/*470.58*/.name),format.raw/*470.63*/("""</span></a>
                            <ul>
                                <li><a href=""""),_display_(/*472.47*/routes/*472.53*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*472.95*/(""""><span>
                                    Admin Panel</span></a></li>
                                <li><a href=""""),_display_(/*474.47*/routes/*474.53*/.AppUsers.listOfUsersRender()),format.raw/*474.82*/(""""><span>Korisnici</span></a></li>
                                <li><a href=""""),_display_(/*475.47*/routes/*475.53*/.Login.logout()),format.raw/*475.68*/(""""><span>Logout</span></a></li>
                            </ul>
                        </li>
                    """)))}/*478.23*/else/*478.28*/{_display_(Seq[Any](format.raw/*478.29*/("""
                        """),_display_(/*479.26*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*479.86*/ {_display_(Seq[Any](format.raw/*479.88*/("""
                            """),format.raw/*480.29*/("""<li><a href=""><span>"""),_display_(/*480.51*/currentUser/*480.62*/.name),format.raw/*480.67*/("""</span></a>
                                <ul>
                                    <li><a href=""""),_display_(/*482.51*/routes/*482.57*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*482.98*/(""""><span>
                                        User Panel</span></a></li>
                                    <li><a href=""""),_display_(/*484.51*/routes/*484.57*/.Stores.listOfStores(currentUser.id)),format.raw/*484.93*/(""""><span>Objekti</span></a></li>
                                    <li><a href=""""),_display_(/*485.51*/routes/*485.57*/.Login.logout()),format.raw/*485.72*/(""""><span>Logout</span></a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*488.26*/("""
                    """)))}),format.raw/*489.22*/("""
                """)))}),format.raw/*490.18*/("""
            """),format.raw/*491.13*/("""</ul>
        </div>

            <!-- End Footer -->



"""))
      }
    }
  }

  def render(content:Html,currentUser:AppUser): play.twirl.api.HtmlFormat.Appendable = apply(content)(currentUser)

  def f:((Html) => (AppUser) => play.twirl.api.HtmlFormat.Appendable) = (content) => (currentUser) => apply(content)(currentUser)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 10:11:34 CEST 2016
                  SOURCE: E:/namjestaj/app/views/main.scala.html
                  HASH: 2205881283e1fdd3406b06cecf3b5252c86fc9b5
                  MATRIX: 807->33|988->119|1015->120|1838->916|1853->922|1928->976|2057->1078|2072->1084|2144->1134|2184->1264|2220->1273|2293->1319|2308->1325|2374->1369|2470->1438|2485->1444|2553->1490|2638->1548|2653->1554|2724->1603|2808->1660|2823->1666|2891->1712|2975->1769|2990->1775|3064->1827|3148->1884|3163->1890|3240->1945|3324->2002|3339->2008|3403->2050|3499->2119|3514->2125|3583->2172|4169->2731|4184->2737|4251->2783|4335->2840|4350->2846|4421->2895|4505->2952|4520->2958|4585->3002|4669->3059|4684->3065|4750->3110|4834->3167|4849->3173|4912->3215|4996->3272|5011->3278|5088->3333|5172->3390|5187->3396|5261->3448|5345->3505|5360->3511|5440->3569|5524->3626|5539->3632|5606->3678|5727->3771|5756->3772|5797->3785|5867->3827|5896->3828|5941->3845|8008->5883|8038->5884|8077->5895|8107->5896|8201->5962|8217->5968|8293->6021|8379->6079|8395->6085|8468->6135|8561->6200|8577->6206|8647->6253|8902->6580|8939->6589|9004->6626|9020->6632|9094->6683|9237->6829|9280->6959|9323->7092|9365->7115|9412->7133|9517->7237|9563->7254|9812->7475|9828->7481|9871->7501|9929->7530|9946->7536|10005->7572|10500->8039|10516->8045|10559->8065|11185->8663|11255->8715|11297->8717|11379->8770|11457->8819|11474->8825|11537->8865|11627->8927|11645->8935|11672->8940|11898->9138|11984->9206|12026->9208|12116->9269|12184->9308|12201->9314|12270->9360|12368->9430|12389->9441|12416->9446|12583->9581|12669->9638|12814->9751|12893->9801|13328->10207|13345->10213|13415->10260|13861->10677|13878->10683|13948->10730|14392->11145|14409->11151|14479->11198|14940->11630|14957->11636|15027->11683|15534->12162|15550->12168|15593->12188|16098->12665|16114->12671|16170->12704|16357->12863|16373->12869|16416->12889|16560->13005|16593->13028|16634->13030|16696->13063|16769->13108|16785->13114|16832->13138|16967->13254|16981->13259|17021->13260|17083->13294|17154->13355|17195->13357|17261->13394|17348->13453|17370->13464|17398->13469|18267->14309|18284->14315|18349->14357|18593->14572|18610->14578|18667->14612|19344->15260|19361->15266|19413->15295|19655->15508|19672->15514|19723->15542|19975->15765|19992->15771|20032->15788|20710->16437|20727->16443|20780->16473|21027->16691|21044->16697|21101->16731|21766->17367|21783->17373|21821->17388|22425->17963|22442->17969|22510->18014|22961->18446|22975->18451|23015->18452|23081->18490|23151->18550|23193->18552|23263->18593|23328->18630|23344->18636|23423->18692|23563->18803|23585->18814|23613->18819|24522->19699|24539->19705|24603->19746|24864->19978|24881->19984|24958->20038|25219->20270|25236->20276|25299->20316|26050->21038|26067->21044|26126->21080|26379->21304|26396->21310|26460->21351|27163->22025|27180->22031|27237->22065|27491->22290|27508->22296|27570->22335|28262->22998|28279->23004|28317->23019|28953->23626|28970->23632|29038->23677|29529->24136|29595->24170|29657->24200|29719->24256|29777->24324|29840->24434|29907->24579|29974->24713|30036->24757|30094->24796|30156->24856|30210->24881|30311->24963|30353->24976|30600->25195|30629->25202|30671->25215|31212->25728|31228->25734|31274->25758|31945->26401|31961->26407|32011->26435|32549->26980|32611->27049|32677->27110|32747->27173|32817->27235|32891->27330|32965->27425|33040->27528|33115->27629|33185->27679|33251->27726|33313->27769|33371->27808|33425->27833|33527->27937|33577->27985|33631->28031|33690->28144|33748->28186|33810->28258|33873->28374|33936->28498|33994->28541|34048->28576|34098->28607|34144->28634|34190->28651|34694->29134|34744->29182|34798->29231|34856->29289|34918->29355|34985->29479|35047->29522|35110->29663|35168->29702|35222->29738|35272->29769|35318->29795|35360->29808|35516->29936|35585->29988|35626->29990|35684->30019|35726->30033|35742->30039|35804->30079|35874->30121|35892->30129|35919->30134|36097->30284|36183->30352|36225->30354|36299->30399|36341->30413|36357->30419|36426->30465|36508->30519|36529->30530|36556->30535|36691->30638|36761->30679|36866->30752|36917->30774|37150->30979|37166->30985|37221->31018|37335->31104|37368->31127|37409->31129|37459->31150|37501->31164|37517->31170|37563->31194|37649->31261|37663->31266|37703->31267|37753->31289|37824->31350|37865->31352|37919->31377|37969->31399|37990->31410|38017->31415|38136->31506|38152->31512|38216->31554|38363->31673|38379->31679|38430->31708|38538->31788|38554->31794|38591->31809|38727->31926|38741->31931|38781->31932|38835->31958|38905->32018|38946->32020|39004->32049|39054->32071|39075->32082|39102->32087|39229->32186|39245->32192|39308->32233|39462->32359|39478->32365|39536->32401|39646->32483|39662->32489|39699->32504|39859->32632|39913->32654|39963->32672|40005->32685
                  LINES: 30->2|35->2|36->3|55->22|55->22|55->22|57->24|57->24|57->24|58->25|59->26|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|74->41|74->41|74->41|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|84->51|84->51|85->52|85->52|85->52|86->53|152->119|152->119|153->120|153->120|155->122|155->122|155->122|157->124|157->124|157->124|158->125|158->125|158->125|163->130|164->131|164->131|164->131|164->131|173->140|174->141|175->142|176->143|178->145|180->147|181->148|184->151|184->151|184->151|184->151|184->151|184->151|193->160|193->160|193->160|201->168|201->168|201->168|202->169|202->169|202->169|202->169|203->170|203->170|203->170|206->173|206->173|206->173|207->174|207->174|207->174|207->174|208->175|208->175|208->175|210->177|211->178|213->180|215->182|221->188|221->188|221->188|226->193|226->193|226->193|231->198|231->198|231->198|236->203|236->203|236->203|244->211|244->211|244->211|250->217|250->217|250->217|252->219|252->219|252->219|254->221|254->221|254->221|255->222|255->222|255->222|255->222|257->224|257->224|257->224|258->225|258->225|258->225|259->226|259->226|259->226|259->226|268->235|268->235|268->235|270->237|270->237|270->237|278->245|278->245|278->245|280->247|280->247|280->247|282->249|282->249|282->249|289->256|289->256|289->256|291->258|291->258|291->258|298->265|298->265|298->265|306->273|306->273|306->273|313->280|313->280|313->280|314->281|314->281|314->281|315->282|315->282|315->282|315->282|316->283|316->283|316->283|325->292|325->292|325->292|327->294|327->294|327->294|329->296|329->296|329->296|336->303|336->303|336->303|338->305|338->305|338->305|345->312|345->312|345->312|347->314|347->314|347->314|354->321|354->321|354->321|362->329|362->329|362->329|369->336|370->337|371->338|372->339|373->340|374->341|375->342|376->343|377->344|378->345|379->346|380->347|383->350|384->351|389->356|389->356|390->357|401->368|401->368|401->368|413->380|413->380|413->380|423->390|424->391|425->392|426->393|427->394|428->395|429->396|430->397|431->398|432->399|433->400|434->401|435->402|436->403|439->406|440->407|441->408|442->409|443->410|444->411|445->412|446->413|447->414|448->415|449->416|450->417|451->418|463->430|464->431|465->432|466->433|467->434|468->435|469->436|470->437|471->438|472->439|473->440|474->441|475->442|478->445|478->445|478->445|479->446|479->446|479->446|479->446|480->447|480->447|480->447|483->450|483->450|483->450|484->451|484->451|484->451|484->451|485->452|485->452|485->452|487->454|488->455|490->457|492->459|497->464|497->464|497->464|499->466|499->466|499->466|500->467|500->467|500->467|500->467|501->468|501->468|501->468|502->469|502->469|502->469|503->470|503->470|503->470|503->470|505->472|505->472|505->472|507->474|507->474|507->474|508->475|508->475|508->475|511->478|511->478|511->478|512->479|512->479|512->479|513->480|513->480|513->480|513->480|515->482|515->482|515->482|517->484|517->484|517->484|518->485|518->485|518->485|521->488|522->489|523->490|524->491
                  -- GENERATED --
              */
          