
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
import helpers.Constants

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(content: Html)(implicit currentUser: AppUser = UserAccessLevel.getCurrentUser(ctx())):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.88*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>

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
        <link rel="stylesheet" href='"""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("/stylesheets/font-awesome.min.css")),format.raw/*23.99*/("""' media="all" />
            <!-- CSS Style -->
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*25.55*/routes/*25.61*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*25.111*/("""'>
        """),format.raw/*26.128*/("""
        """),format.raw/*27.9*/("""<link rel="stylesheet" type="text/css" href='"""),_display_(/*27.55*/routes/*27.61*/.Assets.versioned("stylesheets/animate.css")),format.raw/*27.105*/("""' media="all">
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*28.55*/routes/*28.61*/.Assets.versioned("stylesheets/revslider.css")),format.raw/*28.107*/("""' >
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*29.55*/routes/*29.61*/.Assets.versioned("stylesheets/owl.carousel.css")),format.raw/*29.110*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*30.55*/routes/*30.61*/.Assets.versioned("stylesheets/owl.theme.css")),format.raw/*30.107*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*31.55*/routes/*31.61*/.Assets.versioned("stylesheets/jquery.bxslider.css")),format.raw/*31.113*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*32.55*/routes/*32.61*/.Assets.versioned("stylesheets/jquery.mobile-menu.css")),format.raw/*32.116*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*33.55*/routes/*33.61*/.Assets.versioned("stylesheets/style.css")),format.raw/*33.103*/("""' media="all">
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*34.55*/routes/*34.61*/.Assets.versioned("stylesheets/flexslider.css")),format.raw/*34.108*/("""' media="all">
            <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200italic,300,300italic,400,400italic,600,600italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,500,300,700,900' rel='stylesheet' type='text/css'>


            <!-- JavaScript -->
        <script type="text/javascript" src='"""),_display_(/*42.46*/routes/*42.52*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*42.98*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*43.46*/routes/*43.52*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*43.101*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*44.46*/routes/*44.52*/.Assets.versioned("javascripts/parallax.js")),format.raw/*44.96*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*45.46*/routes/*45.52*/.Assets.versioned("javascripts/revslider.js")),format.raw/*45.97*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*46.46*/routes/*46.52*/.Assets.versioned("javascripts/common.js")),format.raw/*46.94*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*47.46*/routes/*47.52*/.Assets.versioned("javascripts/jquery.bxslider.min.js")),format.raw/*47.107*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*48.46*/routes/*48.52*/.Assets.versioned("javascripts/owl.carousel.min.js")),format.raw/*48.104*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*49.46*/routes/*49.52*/.Assets.versioned("javascripts/jquery.mobile-menu.min.js")),format.raw/*49.110*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*50.46*/routes/*50.52*/.Assets.versioned("javascripts/cloud-zoom.js")),format.raw/*50.98*/("""'></script>
        <script type='text/javascript'>
        jQuery(document).ready(function()"""),format.raw/*52.42*/("""{"""),format.raw/*52.43*/("""
            """),format.raw/*53.13*/("""jQuery('#rev_slider_4').show().revolution("""),format.raw/*53.55*/("""{"""),format.raw/*53.56*/("""
                """),format.raw/*54.17*/("""dottedOverlay: 'none',
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
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/(""");
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/(""");
        </script>
        <script type="text/javascript" src='"""),_display_(/*123.46*/routes/*123.52*/.Assets.versioned("javascripts/jquery.flexslider.js")),format.raw/*123.105*/("""'></script>

        <script type="text/javascript" src='"""),_display_(/*125.46*/routes/*125.52*/.Assets.versioned("javascripts/sweetalert.min.js")),format.raw/*125.102*/("""'></script>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*126.54*/routes/*126.60*/.Assets.versioned("stylesheets/sweetalert.css")),format.raw/*126.107*/("""'>

        <link rel="stylesheet" media="screen" href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css">
        <script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>

        """),format.raw/*131.111*/("""
        """),format.raw/*132.9*/("""<script type="text/javascript" src='"""),_display_(/*132.46*/routes/*132.52*/.Assets.versioned("javascripts/googleAnalytics.js")),format.raw/*132.103*/("""'></script>



    </head>


    <body class="cms-index-index cms-home-page">
        <div id="page">
            """),format.raw/*141.45*/("""
            """),format.raw/*142.130*/("""
            """),format.raw/*143.133*/("""
            """),format.raw/*144.23*/("""

                """),format.raw/*146.17*/("""<!-- Navbar -->
            <nav class=" navbar-fixed-top">
                """),format.raw/*148.45*/("""
                """),format.raw/*149.17*/("""<div class="row">
                    <div class="col-lg-2 col-sm-2 col-xs-4 col-lg-offset-1">
                            <!-- Header Logo -->
                        <div class="logo"><a title="Magento Commerce" href=""""),_display_(/*152.78*/routes/*152.84*/.Application.index()),format.raw/*152.104*/(""""><img alt="Namjestaj" src='"""),_display_(/*152.133*/routes/*152.139*/.Assets.versioned("images/logo.png")),format.raw/*152.175*/("""'></a></div>
                            <!-- End Header Logo -->
                    </div>
                    <div class="mm-toggle-wrap">
                        <div class="mm-toggle"><i class="fa fa-bars"></i><span class="mm-label">Menu</span> </div>
                    </div>
                    <div class="nav-inner col-lg-9">

                        <ul id="nav" class="hidden-xs">
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*161.74*/routes/*161.80*/.Application.index()),format.raw/*161.100*/("""" class="level-top"><span>
                                   Početna</span></a></li>
                            <li class="mega-menu"><a href="" class="level-top"><span>NAMEŠTAJ</span></a>
                                <div class="level0-wrapper dropdown-6col">
                                    <div class="container">
                                        <div class="level0-wrapper2">
                                            <div class="nav-block nav-block-center">
                                                <ul class="level0">
                                                """),_display_(/*169.50*/for(category <- models.Category.findAllCategories()) yield /*169.102*/ {_display_(Seq[Any](format.raw/*169.104*/("""
                                                    """),format.raw/*170.53*/("""<li class="level1 nav-6-1 parent item"><a href=""""),_display_(/*170.102*/routes/*170.108*/.Items.getItemsWithCategory(category.id)),format.raw/*170.148*/(""""><span>
                                                    """),_display_(/*171.54*/category/*171.62*/.name),format.raw/*171.67*/("""</span>
                                                    </a>
                                                        <ul class="level1">
                                                        """),_display_(/*174.58*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*174.126*/ {_display_(Seq[Any](format.raw/*174.128*/("""
                                                            """),format.raw/*175.61*/("""<li class="level2 nav-6-1-1"><a href=""""),_display_(/*175.100*/routes/*175.106*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*175.152*/(""""><span>
                                                            """),_display_(/*176.62*/subcategory/*176.73*/.name),format.raw/*176.78*/("""</span></a>
                                                            </li>
                                                        """)))}),format.raw/*178.58*/("""
                                                        """),format.raw/*179.57*/("""</ul>
                                                    </li>
                                                """)))}),format.raw/*181.50*/("""

                                                """),format.raw/*183.49*/("""</ul>
                                            </div>
                                        </div>
                                            <!--level0-wrapper2-->
                                        <div class="nav-add">
                                            <div class="push_item">
                                                <div class="push_img"><a href=""""),_display_(/*189.81*/routes/*189.87*/.Items.getItemsWithCategory(Constants.DNEVNI_BORAVAK)),format.raw/*189.140*/(""""><img alt="phone" src='"""),_display_(/*189.165*/routes/*189.171*/.Assets.versioned("images/menu_ele_phone1.png")),format.raw/*189.218*/("""'></a></div>
                                                <div class="push_text">
                                                   DNEVNI BORAVAK
                                                </div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href=""""),_display_(/*195.81*/routes/*195.87*/.Items.getItemsWithCategory(Constants.KUHINJE)),format.raw/*195.133*/(""""><img alt="camera" src='"""),_display_(/*195.159*/routes/*195.165*/.Assets.versioned("images/kuhinja.jpg")),format.raw/*195.204*/("""'></a></div>
                                                <div class="push_text">
                                                    KUHINJA
                                                </div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href=""""),_display_(/*201.81*/routes/*201.87*/.Items.getItemsWithCategory(Constants.SPAVACA_SOBA)),format.raw/*201.138*/(""""><img alt="ipod" src='"""),_display_(/*201.162*/routes/*201.168*/.Assets.versioned("images/spavacaSoba.jpg")),format.raw/*201.211*/("""'></a></div>
                                                <div class="push_text">
                                                    SPAVAĆA SOBA
                                                </div>
                                            </div>
                                            <div class="push_item push_item_last">
                                                <div class="push_img"><a href=""""),_display_(/*207.81*/routes/*207.87*/.Items.getItemsWithCategory(Constants.KUPATILO)),format.raw/*207.134*/(""""><img alt="laptop" src='"""),_display_(/*207.160*/routes/*207.166*/.Assets.versioned("images/kupatilo.jpg")),format.raw/*207.206*/("""'></a></div>
                                                <div class="push_text">
                                                    KUPATILO
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*216.74*/routes/*216.80*/.Items.itemsOnSale()),format.raw/*216.100*/("""" class="level-top"><span>
                                   AKCIJA <img src=""""),_display_(/*217.54*/routes/*217.60*/.Assets.versioned("images/11568812.png")),format.raw/*217.100*/("""">  </span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   TOP PONUDA</span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   IDEJE</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*222.74*/routes/*222.80*/.NewsController.newsPanelRender()),format.raw/*222.113*/("""" class="level-top"><span>
                                   VIJESTI</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*224.74*/routes/*224.80*/.Partners.partnerPanel()),format.raw/*224.104*/("""" class="level-top"><span>
                                   PARTNERI</span></a></li>
                            """),_display_(/*226.30*/if(currentUser == null)/*226.53*/ {_display_(Seq[Any](format.raw/*226.55*/("""
                                """),format.raw/*227.33*/("""<li class="level0 nav-8 level-top"><a href=""""),_display_(/*227.78*/routes/*227.84*/.Login.loginPageRender()),format.raw/*227.108*/("""" class="level-top"><span>
                                    Log In</span></a></li>
                            """)))}/*229.31*/else/*229.36*/{_display_(Seq[Any](format.raw/*229.37*/("""
                                """),_display_(/*230.34*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*230.95*/ {_display_(Seq[Any](format.raw/*230.97*/("""
                                    """),format.raw/*231.37*/("""<li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*231.96*/currentUser/*231.107*/.name),format.raw/*231.112*/("""</span></a>
                                        <div class="level0-wrapper dropdown-6col">
                                            <div class="container">
                                                <div class="level0-wrapper2">
                                                    <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                        <ul class="level0">
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                ADMIN PANEL</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*240.111*/routes/*240.117*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*240.159*/(""""><span>
                                                                    Admin Panel</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*242.111*/routes/*242.117*/.NewsController.createNewsRender()),format.raw/*242.151*/(""""><span>
                                                                        Kreiraj Vijest</span></a></li>

                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KORISNICI</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*250.105*/routes/*250.111*/.AppUsers.listOfUsersRender()),format.raw/*250.140*/(""""><span>
                                                                    Lista korisnika</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*252.105*/routes/*252.111*/.AppUsers.createUserRender()),format.raw/*252.139*/(""""><span>
                                                                        Dodaj korisnika</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*254.111*/routes/*254.117*/.Items.allItems()),format.raw/*254.134*/(""""><span>
                                                                        Lista proizvoda</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KATEGORIJE</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*261.105*/routes/*261.111*/.Categories.listOfCategories()),format.raw/*261.141*/(""""><span>
                                                                        Lista kategorija</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*263.105*/routes/*263.111*/.Categories.createCategoryRender()),format.raw/*263.145*/(""""><span>
                                                                        Dodaj kategoriju</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                               LOGOUT</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*270.105*/routes/*270.111*/.Login.logout()),format.raw/*270.126*/(""""><span>
                                                                    Logout</span></a></li>
                                                                </ul>
                                                            </li>

                                                        </ul>
                                                    </div>
                                                        <!--nav-block nav-block-center-->
                                                    <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*278.128*/routes/*278.134*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*278.179*/("""' alt="furniture"></a> </div>
                                                        <!--nav-block nav-block-right std grid12-4-->
                                                </div>
                                            </div>
                                                <!--level0-wrapper2-->
                                        </div>
                                    </li>
                                """)))}/*285.35*/else/*285.40*/{_display_(Seq[Any](format.raw/*285.41*/("""
                                    """),_display_(/*286.38*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*286.98*/ {_display_(Seq[Any](format.raw/*286.100*/("""
                                        """),format.raw/*287.41*/("""<script type="text/javascript" src=""""),_display_(/*287.78*/routes/*287.84*/.Assets.versioned("javascripts/messageNotifications.js")),format.raw/*287.140*/(""""></script>
                                        <li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*288.100*/currentUser/*288.111*/.name),format.raw/*288.116*/("""</span></a>
                                            <div class="level0-wrapper dropdown-6col">
                                                <div class="container">
                                                    <div class="level0-wrapper2">
                                                        <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                            <ul class="level0">
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    Krisnički panel</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*297.115*/routes/*297.121*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*297.162*/(""""><span>
                                                                            Korisnički panel</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*299.115*/routes/*299.121*/.AppUsers.updateUserInformationsRender(currentUser.id)),format.raw/*299.175*/(""""><span>
                                                                            Ažuriraj podatke</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*301.115*/routes/*301.121*/.Messages.listOfMessages(currentUser.id)),format.raw/*301.161*/(""""><span>
                                                                            Poruke </span> <span class="badge" id="message_notifications"> </span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    OBJEKTI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*308.109*/routes/*308.115*/.Stores.listOfStores(currentUser.id)),format.raw/*308.151*/(""""><span>
                                                                            Lista objekata</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*310.109*/routes/*310.115*/.Stores.createStoreRender(currentUser.id)),format.raw/*310.156*/(""""><span>
                                                                            Dodaj objekat</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    PROIZVODI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*317.109*/routes/*317.115*/.Items.listOfItems(currentUser.id)),format.raw/*317.149*/(""""><span>
                                                                            Lista proizvoda</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*319.109*/routes/*319.115*/.Items.createItemRender(currentUser.id)),format.raw/*319.154*/(""""><span>
                                                                            Dodaj proizvod</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    LOGOUT</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*326.109*/routes/*326.115*/.Login.logout()),format.raw/*326.130*/(""""><span>
                                                                            Logout</span></a></li>
                                                                    </ul>
                                                                </li>

                                                            </ul>
                                                        </div>
                                                            <!--nav-block nav-block-center-->
                                                        <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*334.132*/routes/*334.138*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*334.183*/("""' alt="furniture"></a> </div>
                                                            <!--nav-block nav-block-right std grid12-4-->
                                                    </div>
                                                </div>
                                                    <!--level0-wrapper2-->
                                            </div>
                                        </li>
                                    """)))}),format.raw/*341.38*/("""
                                """)))}),format.raw/*342.34*/("""
                            """)))}),format.raw/*343.30*/("""
                                """),format.raw/*344.33*/("""<!-- Search-col -->
                            <div class="search-box pull-right">
                                <form action=""""),_display_(/*346.48*/routes/*346.54*/.Items.searchBox()),format.raw/*346.72*/("""" method="POST" id="search_mini_form" name="Categories">
                                    <input type="text" placeholder="Pretražite po nazivu, cijeni, kategoriji ..."  maxlength="70" name="search" id="search">
                                    <button type="button" class="search-btn-bg"><span class="fa fa-search"></span>&nbsp;</button>
                                    <div name="results"></div>
                                </form>
                            </div>
                                <!-- End Search-col -->

                        </ul>
                    </div>
                </div>
                """),format.raw/*357.27*/("""
            """),format.raw/*358.13*/("""</nav>
                <!-- end nav -->

                <!-------------------------------------------- CONTENT --------------------------------------------->
            <div style="margin-top: 60px">
                """),_display_(/*363.18*/content),format.raw/*363.25*/("""
            """),format.raw/*364.13*/("""</div>
                <!-- Footer -->
            <footer>
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 col-lg-12 col-md-12" >
                                <div class="footer-column pull-left col-md-3">
                                    <h4>O NAMA</h4>
                                    <ul class="links">
                                        <li><a href=""""),_display_(/*374.55*/routes/*374.61*/.Application.faqRender()),format.raw/*374.85*/("""" title="FAQs">FAQs</a></li>
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
                                        <li><a href=""""),_display_(/*386.55*/routes/*386.61*/.ContactUs.contactUsRender()),format.raw/*386.89*/("""" title="Contact Us">
                                            Contact Us</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left col-md-3">
                                    <h4>PRAVILA KORIŠTENJA</h4>
                                    <ul class="links">
                                    </ul>
                                </div>
                            </div>
                            """),format.raw/*396.65*/("""
                                """),format.raw/*397.69*/("""
                                    """),format.raw/*398.61*/("""
                                        """),format.raw/*399.63*/("""
                                        """),format.raw/*400.62*/("""
                                            """),format.raw/*401.95*/("""
                                            """),format.raw/*402.95*/("""
                                            """),format.raw/*403.103*/("""
                                            """),format.raw/*404.101*/("""
                                        """),format.raw/*405.50*/("""
                                    """),format.raw/*406.47*/("""
                                """),format.raw/*407.43*/("""
                            """),format.raw/*408.39*/("""
                        """),format.raw/*409.25*/("""</div>
                    </div>
                </div>
                """),format.raw/*412.48*/("""
                    """),format.raw/*413.48*/("""
                        """),format.raw/*414.46*/("""
                            """),format.raw/*415.113*/("""
                            """),format.raw/*416.42*/("""
                                """),format.raw/*417.72*/("""
                                """),format.raw/*418.116*/("""
                                """),format.raw/*419.124*/("""
                            """),format.raw/*420.43*/("""
                        """),format.raw/*421.35*/("""
                    """),format.raw/*422.31*/("""
                """),format.raw/*423.27*/("""
                """),format.raw/*424.17*/("""<div class="footer-bottom">
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
                <li>
                    <div class="mm-search">
                        <form action=""""),_display_(/*438.40*/routes/*438.46*/.Items.searchBoxMobile()),format.raw/*438.70*/("""" method="POST">
                            <div class="input-group">
                                <div class="input-group-btn">
                                    <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
                                </div>
                                <input type="text" class="form-control simple" placeholder="Pretraga ..." name="search-mobile" id="srch-term">
                            </div>
                        </form>
                    </div>
                </li>
            <li><a href="">POČETNA</a></li>
                <li><a href="#">NAMJEŠTAJ</a>
                    <ul>
                        """),_display_(/*451.26*/for(category <- models.Category.findAllCategories()) yield /*451.78*/ {_display_(Seq[Any](format.raw/*451.80*/("""
                            """),format.raw/*452.29*/("""<li><a href=""""),_display_(/*452.43*/routes/*452.49*/.Items.getItemsWithCategory(category.id)),format.raw/*452.89*/(""""><span>
                                """),_display_(/*453.34*/category/*453.42*/.name),format.raw/*453.47*/("""</span>
                                    </a>
                                        <ul class="level1">
                                        """),_display_(/*456.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*456.110*/ {_display_(Seq[Any](format.raw/*456.112*/("""
                                            """),format.raw/*457.45*/("""<li><a href=""""),_display_(/*457.59*/routes/*457.65*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*457.111*/(""""><span>
                                            """),_display_(/*458.46*/subcategory/*458.57*/.name),format.raw/*458.62*/("""</span></a>
                                            </li>
                                        """)))}),format.raw/*460.42*/("""
                                        """),format.raw/*461.41*/("""</ul>
                                    </li>
                        """)))}),format.raw/*463.26*/("""

                    """),format.raw/*465.21*/("""</ul>
                </li>
                <li><a href=""""),_display_(/*467.31*/routes/*467.37*/.Items.itemsOnSale()),format.raw/*467.57*/("""">AKCIJA</a></li>
                <li><a href="#">TOP PONUDA</a></li>
                <li><a href="#">IDEJE</a></li>
                <li><a href=""""),_display_(/*470.31*/routes/*470.37*/.NewsController.newsPanelRender()),format.raw/*470.70*/("""">VIJESTI</a></li>
                <li><a href=""""),_display_(/*471.31*/routes/*471.37*/.Partners.partnerPanel()),format.raw/*471.61*/("""">PARTNERI</a></li>
                """),_display_(/*472.18*/if(currentUser == null)/*472.41*/ {_display_(Seq[Any](format.raw/*472.43*/("""
                    """),format.raw/*473.21*/("""<li><a href=""""),_display_(/*473.35*/routes/*473.41*/.Login.loginPageRender()),format.raw/*473.65*/("""" class="level-top"><span>Log In</span></a></li>
                """)))}/*474.19*/else/*474.24*/{_display_(Seq[Any](format.raw/*474.25*/("""
                    """),_display_(/*475.22*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*475.83*/ {_display_(Seq[Any](format.raw/*475.85*/("""
                        """),format.raw/*476.25*/("""<li><a href=""><span>"""),_display_(/*476.47*/currentUser/*476.58*/.name),format.raw/*476.63*/("""</span></a>
                            <ul>
                                <li><a href=""""),_display_(/*478.47*/routes/*478.53*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*478.95*/(""""><span>
                                    Admin Panel</span></a></li>
                                <li><a href=""""),_display_(/*480.47*/routes/*480.53*/.AppUsers.listOfUsersRender()),format.raw/*480.82*/(""""><span>Korisnici</span></a></li>
                                <li><a href=""""),_display_(/*481.47*/routes/*481.53*/.Login.logout()),format.raw/*481.68*/(""""><span>Logout</span></a></li>
                            </ul>
                        </li>
                    """)))}/*484.23*/else/*484.28*/{_display_(Seq[Any](format.raw/*484.29*/("""
                        """),_display_(/*485.26*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*485.86*/ {_display_(Seq[Any](format.raw/*485.88*/("""
                            """),format.raw/*486.29*/("""<li><a href=""><span>"""),_display_(/*486.51*/currentUser/*486.62*/.name),format.raw/*486.67*/("""</span></a>
                                <ul>
                                    <li><a href=""""),_display_(/*488.51*/routes/*488.57*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*488.98*/(""""><span>
                                        User Panel</span></a></li>
                                    <li><a href=""""),_display_(/*490.51*/routes/*490.57*/.Stores.listOfStores(currentUser.id)),format.raw/*490.93*/(""""><span>Objekti</span></a></li>
                                    <li><a href=""""),_display_(/*491.51*/routes/*491.57*/.Login.logout()),format.raw/*491.72*/(""""><span>Logout</span></a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*494.26*/("""
                    """)))}),format.raw/*495.22*/("""
                """)))}),format.raw/*496.18*/("""
            """),format.raw/*497.13*/("""</ul>
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
                  DATE: Mon May 23 19:49:10 CEST 2016
                  SOURCE: E:/namjestaj/app/views/main.scala.html
                  HASH: 49d40790c7fb25264e8f60dc28a03115c8bbc805
                  MATRIX: 832->59|1013->145|1040->146|1863->942|1878->948|1953->1002|2082->1104|2097->1110|2169->1160|2209->1290|2245->1299|2318->1345|2333->1351|2399->1395|2495->1464|2510->1470|2578->1516|2663->1574|2678->1580|2749->1629|2833->1686|2848->1692|2916->1738|3000->1795|3015->1801|3089->1853|3173->1910|3188->1916|3265->1971|3349->2028|3364->2034|3428->2076|3524->2145|3539->2151|3608->2198|4194->2757|4209->2763|4276->2809|4360->2866|4375->2872|4446->2921|4530->2978|4545->2984|4610->3028|4694->3085|4709->3091|4775->3136|4859->3193|4874->3199|4937->3241|5021->3298|5036->3304|5113->3359|5197->3416|5212->3422|5286->3474|5370->3531|5385->3537|5465->3595|5549->3652|5564->3658|5631->3704|5752->3797|5781->3798|5822->3811|5892->3853|5921->3854|5966->3871|8033->5909|8063->5910|8102->5921|8132->5922|8226->5988|8242->5994|8318->6047|8404->6105|8420->6111|8493->6161|8586->6226|8602->6232|8672->6279|8927->6606|8964->6615|9029->6652|9045->6658|9119->6709|9262->6855|9305->6985|9348->7118|9390->7141|9437->7159|9542->7263|9588->7280|9837->7501|9853->7507|9896->7527|9954->7556|9971->7562|10030->7598|10525->8065|10541->8071|10584->8091|11210->8689|11280->8741|11322->8743|11404->8796|11482->8845|11499->8851|11562->8891|11652->8953|11670->8961|11697->8966|11923->9164|12009->9232|12051->9234|12141->9295|12209->9334|12226->9340|12295->9386|12393->9456|12414->9467|12441->9472|12608->9607|12694->9664|12839->9777|12918->9827|13327->10208|13343->10214|13419->10267|13473->10292|13490->10298|13560->10345|13993->10750|14009->10756|14078->10802|14133->10828|14150->10834|14212->10873|14639->11272|14655->11278|14729->11329|14782->11353|14799->11359|14865->11402|15312->11821|15328->11827|15398->11874|15453->11900|15470->11906|15533->11946|16049->12434|16065->12440|16108->12460|16216->12540|16232->12546|16295->12586|16736->12999|16752->13005|16808->13038|16995->13197|17011->13203|17058->13227|17202->13343|17235->13366|17276->13368|17338->13401|17411->13446|17427->13452|17474->13476|17609->13592|17623->13597|17663->13598|17725->13632|17796->13693|17837->13695|17903->13732|17990->13791|18012->13802|18040->13807|18909->14647|18926->14653|18991->14695|19235->14910|19252->14916|19309->14950|19986->15598|20003->15604|20055->15633|20297->15846|20314->15852|20365->15880|20617->16103|20634->16109|20674->16126|21352->16775|21369->16781|21422->16811|21669->17029|21686->17035|21743->17069|22408->17705|22425->17711|22463->17726|23067->18301|23084->18307|23152->18352|23603->18784|23617->18789|23657->18790|23723->18828|23793->18888|23835->18890|23905->18931|23970->18968|23986->18974|24065->19030|24205->19141|24227->19152|24255->19157|25164->20037|25181->20043|25245->20084|25506->20316|25523->20322|25600->20376|25861->20608|25878->20614|25941->20654|26692->21376|26709->21382|26768->21418|27021->21642|27038->21648|27102->21689|27805->22363|27822->22369|27879->22403|28133->22628|28150->22634|28212->22673|28904->23336|28921->23342|28959->23357|29595->23964|29612->23970|29680->24015|30171->24474|30237->24508|30299->24538|30361->24571|30520->24702|30536->24708|30576->24726|31240->25371|31282->25384|31529->25603|31558->25610|31600->25623|32140->26135|32156->26141|32202->26165|32873->26808|32889->26814|32939->26842|33477->27387|33539->27456|33605->27517|33675->27580|33745->27642|33819->27737|33893->27832|33968->27935|34043->28036|34113->28086|34179->28133|34241->28176|34299->28215|34353->28240|34455->28344|34505->28392|34559->28438|34618->28551|34676->28593|34738->28665|34801->28781|34864->28905|34922->28948|34976->28983|35026->29014|35072->29041|35118->29058|35709->29621|35725->29627|35771->29651|36490->30342|36559->30394|36600->30396|36658->30425|36700->30439|36716->30445|36778->30485|36848->30527|36866->30535|36893->30540|37071->30690|37157->30758|37199->30760|37273->30805|37315->30819|37331->30825|37400->30871|37482->30925|37503->30936|37530->30941|37665->31044|37735->31085|37840->31158|37891->31180|37977->31238|37993->31244|38035->31264|38210->31411|38226->31417|38281->31450|38358->31499|38374->31505|38420->31529|38485->31566|38518->31589|38559->31591|38609->31612|38651->31626|38667->31632|38713->31656|38799->31723|38813->31728|38853->31729|38903->31751|38974->31812|39015->31814|39069->31839|39119->31861|39140->31872|39167->31877|39286->31968|39302->31974|39366->32016|39513->32135|39529->32141|39580->32170|39688->32250|39704->32256|39741->32271|39877->32388|39891->32393|39931->32394|39985->32420|40055->32480|40096->32482|40154->32511|40204->32533|40225->32544|40252->32549|40379->32648|40395->32654|40458->32695|40612->32821|40628->32827|40686->32863|40796->32945|40812->32951|40849->32966|41009->33094|41063->33116|41113->33134|41155->33147
                  LINES: 31->3|36->3|37->4|56->23|56->23|56->23|58->25|58->25|58->25|59->26|60->27|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|67->34|67->34|67->34|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|86->53|86->53|86->53|87->54|153->120|153->120|154->121|154->121|156->123|156->123|156->123|158->125|158->125|158->125|159->126|159->126|159->126|164->131|165->132|165->132|165->132|165->132|174->141|175->142|176->143|177->144|179->146|181->148|182->149|185->152|185->152|185->152|185->152|185->152|185->152|194->161|194->161|194->161|202->169|202->169|202->169|203->170|203->170|203->170|203->170|204->171|204->171|204->171|207->174|207->174|207->174|208->175|208->175|208->175|208->175|209->176|209->176|209->176|211->178|212->179|214->181|216->183|222->189|222->189|222->189|222->189|222->189|222->189|228->195|228->195|228->195|228->195|228->195|228->195|234->201|234->201|234->201|234->201|234->201|234->201|240->207|240->207|240->207|240->207|240->207|240->207|249->216|249->216|249->216|250->217|250->217|250->217|255->222|255->222|255->222|257->224|257->224|257->224|259->226|259->226|259->226|260->227|260->227|260->227|260->227|262->229|262->229|262->229|263->230|263->230|263->230|264->231|264->231|264->231|264->231|273->240|273->240|273->240|275->242|275->242|275->242|283->250|283->250|283->250|285->252|285->252|285->252|287->254|287->254|287->254|294->261|294->261|294->261|296->263|296->263|296->263|303->270|303->270|303->270|311->278|311->278|311->278|318->285|318->285|318->285|319->286|319->286|319->286|320->287|320->287|320->287|320->287|321->288|321->288|321->288|330->297|330->297|330->297|332->299|332->299|332->299|334->301|334->301|334->301|341->308|341->308|341->308|343->310|343->310|343->310|350->317|350->317|350->317|352->319|352->319|352->319|359->326|359->326|359->326|367->334|367->334|367->334|374->341|375->342|376->343|377->344|379->346|379->346|379->346|390->357|391->358|396->363|396->363|397->364|407->374|407->374|407->374|419->386|419->386|419->386|429->396|430->397|431->398|432->399|433->400|434->401|435->402|436->403|437->404|438->405|439->406|440->407|441->408|442->409|445->412|446->413|447->414|448->415|449->416|450->417|451->418|452->419|453->420|454->421|455->422|456->423|457->424|471->438|471->438|471->438|484->451|484->451|484->451|485->452|485->452|485->452|485->452|486->453|486->453|486->453|489->456|489->456|489->456|490->457|490->457|490->457|490->457|491->458|491->458|491->458|493->460|494->461|496->463|498->465|500->467|500->467|500->467|503->470|503->470|503->470|504->471|504->471|504->471|505->472|505->472|505->472|506->473|506->473|506->473|506->473|507->474|507->474|507->474|508->475|508->475|508->475|509->476|509->476|509->476|509->476|511->478|511->478|511->478|513->480|513->480|513->480|514->481|514->481|514->481|517->484|517->484|517->484|518->485|518->485|518->485|519->486|519->486|519->486|519->486|521->488|521->488|521->488|523->490|523->490|523->490|524->491|524->491|524->491|527->494|528->495|529->496|530->497
                  -- GENERATED --
              */
          