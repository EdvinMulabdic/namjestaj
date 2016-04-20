
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
                                   AKCIJA</span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   TOP PONUDA</span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   IDEJE</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*222.74*/routes/*222.80*/.NewsController.newsPanelRender()),format.raw/*222.113*/("""" class="level-top"><span>
                                   VIJESTI</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*224.74*/routes/*224.80*/.Application.index()),format.raw/*224.100*/("""" class="level-top"><span>
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
                                        """),format.raw/*287.155*/("""
                                        """),format.raw/*288.41*/("""<li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*288.100*/currentUser/*288.111*/.name),format.raw/*288.116*/("""</span></a>
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
                                """),format.raw/*344.56*/("""
                            """),format.raw/*345.68*/("""
                                """),format.raw/*346.110*/("""
                                    """),format.raw/*347.145*/("""
                                    """),format.raw/*348.134*/("""
                                """),format.raw/*349.44*/("""
                            """),format.raw/*350.39*/("""
                                """),format.raw/*351.60*/("""
                        """),format.raw/*352.25*/("""</ul>
                    </div>
                </div>
                """),format.raw/*355.27*/("""
            """),format.raw/*356.13*/("""</nav>
                <!-- end nav -->

                <!-------------------------------------------- CONTENT --------------------------------------------->
            <div style="margin-top: 60px">
                """),_display_(/*361.18*/content),format.raw/*361.25*/("""
            """),format.raw/*362.13*/("""</div>

                <!-- Footer -->
            <footer>
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 col-lg-12 col-md-12" >
                                <div class="footer-column pull-left col-md-3">
                                    <h4>O NAMA</h4>
                                    <ul class="links">
                                        <li><a href=""""),_display_(/*373.55*/routes/*373.61*/.Application.faqRender()),format.raw/*373.85*/("""" title="FAQs">FAQs</a></li>
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
                                        <li><a href=""""),_display_(/*385.55*/routes/*385.61*/.ContactUs.contactUsRender()),format.raw/*385.89*/("""" title="Contact Us">
                                            Contact Us</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left col-md-3">
                                    <h4>PRAVILA KORIŠTENJA</h4>
                                    <ul class="links">
                                    </ul>
                                </div>
                            </div>
                            """),format.raw/*395.65*/("""
                                """),format.raw/*396.69*/("""
                                    """),format.raw/*397.61*/("""
                                        """),format.raw/*398.63*/("""
                                        """),format.raw/*399.62*/("""
                                            """),format.raw/*400.95*/("""
                                            """),format.raw/*401.95*/("""
                                            """),format.raw/*402.103*/("""
                                            """),format.raw/*403.101*/("""
                                        """),format.raw/*404.50*/("""
                                    """),format.raw/*405.47*/("""
                                """),format.raw/*406.43*/("""
                            """),format.raw/*407.39*/("""
                        """),format.raw/*408.25*/("""</div>
                    </div>
                </div>
                """),format.raw/*411.48*/("""
                    """),format.raw/*412.48*/("""
                        """),format.raw/*413.46*/("""
                            """),format.raw/*414.113*/("""
                            """),format.raw/*415.42*/("""
                                """),format.raw/*416.72*/("""
                                """),format.raw/*417.116*/("""
                                """),format.raw/*418.124*/("""
                            """),format.raw/*419.43*/("""
                        """),format.raw/*420.35*/("""
                    """),format.raw/*421.31*/("""
                """),format.raw/*422.27*/("""
                """),format.raw/*423.17*/("""<div class="footer-bottom">
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
                """),format.raw/*435.25*/("""
                    """),format.raw/*436.48*/("""
                        """),format.raw/*437.49*/("""
                            """),format.raw/*438.58*/("""
                                """),format.raw/*439.66*/("""
                                    """),format.raw/*440.124*/("""
                                """),format.raw/*441.43*/("""
                                """),format.raw/*442.141*/("""
                            """),format.raw/*443.39*/("""
                        """),format.raw/*444.36*/("""
                    """),format.raw/*445.31*/("""
                """),format.raw/*446.26*/("""
            """),format.raw/*447.13*/("""<li><a href="">POČETNA</a></li>
                <li><a href="#">NAMJEŠTAJ</a>
                    <ul>
                        """),_display_(/*450.26*/for(category <- models.Category.findAllCategories()) yield /*450.78*/ {_display_(Seq[Any](format.raw/*450.80*/("""
                            """),format.raw/*451.29*/("""<li><a href=""""),_display_(/*451.43*/routes/*451.49*/.Items.getItemsWithCategory(category.id)),format.raw/*451.89*/(""""><span>
                                """),_display_(/*452.34*/category/*452.42*/.name),format.raw/*452.47*/("""</span>
                                    </a>
                                        <ul class="level1">
                                        """),_display_(/*455.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*455.110*/ {_display_(Seq[Any](format.raw/*455.112*/("""
                                            """),format.raw/*456.45*/("""<li><a href=""""),_display_(/*456.59*/routes/*456.65*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*456.111*/(""""><span>
                                            """),_display_(/*457.46*/subcategory/*457.57*/.name),format.raw/*457.62*/("""</span></a>
                                            </li>
                                        """)))}),format.raw/*459.42*/("""
                                        """),format.raw/*460.41*/("""</ul>
                                    </li>
                        """)))}),format.raw/*462.26*/("""

                    """),format.raw/*464.21*/("""</ul>
                </li>
                <li><a href="#">AKCIJA</a></li>
                <li><a href="#">TOP PONUDA</a></li>
                <li><a href="#">IDEJE</a></li>
                <li><a href=""""),_display_(/*469.31*/routes/*469.37*/.NewsController.newsPanelRender()),format.raw/*469.70*/("""">VIJESTI</a></li>
                <li><a href="#">PARTNERI</a></li>
                """),_display_(/*471.18*/if(currentUser == null)/*471.41*/ {_display_(Seq[Any](format.raw/*471.43*/("""
                    """),format.raw/*472.21*/("""<li><a href=""""),_display_(/*472.35*/routes/*472.41*/.Login.loginPageRender()),format.raw/*472.65*/("""" class="level-top"><span>Log In</span></a></li>
                """)))}/*473.19*/else/*473.24*/{_display_(Seq[Any](format.raw/*473.25*/("""
                    """),_display_(/*474.22*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*474.83*/ {_display_(Seq[Any](format.raw/*474.85*/("""
                        """),format.raw/*475.25*/("""<li><a href=""><span>"""),_display_(/*475.47*/currentUser/*475.58*/.name),format.raw/*475.63*/("""</span></a>
                            <ul>
                                <li><a href=""""),_display_(/*477.47*/routes/*477.53*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*477.95*/(""""><span>
                                    Admin Panel</span></a></li>
                                <li><a href=""""),_display_(/*479.47*/routes/*479.53*/.AppUsers.listOfUsersRender()),format.raw/*479.82*/(""""><span>Korisnici</span></a></li>
                                <li><a href=""""),_display_(/*480.47*/routes/*480.53*/.Login.logout()),format.raw/*480.68*/(""""><span>Logout</span></a></li>
                            </ul>
                        </li>
                    """)))}/*483.23*/else/*483.28*/{_display_(Seq[Any](format.raw/*483.29*/("""
                        """),_display_(/*484.26*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*484.86*/ {_display_(Seq[Any](format.raw/*484.88*/("""
                            """),format.raw/*485.29*/("""<li><a href=""><span>"""),_display_(/*485.51*/currentUser/*485.62*/.name),format.raw/*485.67*/("""</span></a>
                                <ul>
                                    <li><a href=""""),_display_(/*487.51*/routes/*487.57*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*487.98*/(""""><span>
                                        User Panel</span></a></li>
                                    <li><a href=""""),_display_(/*489.51*/routes/*489.57*/.Stores.listOfStores(currentUser.id)),format.raw/*489.93*/(""""><span>Objekti</span></a></li>
                                    <li><a href=""""),_display_(/*490.51*/routes/*490.57*/.Login.logout()),format.raw/*490.72*/(""""><span>Logout</span></a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*493.26*/("""
                    """)))}),format.raw/*494.22*/("""
                """)))}),format.raw/*495.18*/("""
            """),format.raw/*496.13*/("""</ul>
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
                  DATE: Wed Apr 20 22:38:49 CEST 2016
                  SOURCE: E:/namjestaj/app/views/main.scala.html
                  HASH: 6542b24b1eed5c1c1571fc9739c4ac6dd245c0e8
                  MATRIX: 832->59|1013->145|1040->146|1863->942|1878->948|1953->1002|2082->1104|2097->1110|2169->1160|2209->1290|2245->1299|2318->1345|2333->1351|2399->1395|2495->1464|2510->1470|2578->1516|2663->1574|2678->1580|2749->1629|2833->1686|2848->1692|2916->1738|3000->1795|3015->1801|3089->1853|3173->1910|3188->1916|3265->1971|3349->2028|3364->2034|3428->2076|3524->2145|3539->2151|3608->2198|4194->2757|4209->2763|4276->2809|4360->2866|4375->2872|4446->2921|4530->2978|4545->2984|4610->3028|4694->3085|4709->3091|4775->3136|4859->3193|4874->3199|4937->3241|5021->3298|5036->3304|5113->3359|5197->3416|5212->3422|5286->3474|5370->3531|5385->3537|5465->3595|5549->3652|5564->3658|5631->3704|5752->3797|5781->3798|5822->3811|5892->3853|5921->3854|5966->3871|8033->5909|8063->5910|8102->5921|8132->5922|8226->5988|8242->5994|8318->6047|8404->6105|8420->6111|8493->6161|8586->6226|8602->6232|8672->6279|8927->6606|8964->6615|9029->6652|9045->6658|9119->6709|9262->6855|9305->6985|9348->7118|9390->7141|9437->7159|9542->7263|9588->7280|9837->7501|9853->7507|9896->7527|9954->7556|9971->7562|10030->7598|10525->8065|10541->8071|10584->8091|11210->8689|11280->8741|11322->8743|11404->8796|11482->8845|11499->8851|11562->8891|11652->8953|11670->8961|11697->8966|11923->9164|12009->9232|12051->9234|12141->9295|12209->9334|12226->9340|12295->9386|12393->9456|12414->9467|12441->9472|12608->9607|12694->9664|12839->9777|12918->9827|13327->10208|13343->10214|13419->10267|13473->10292|13490->10298|13560->10345|13993->10750|14009->10756|14078->10802|14133->10828|14150->10834|14212->10873|14639->11272|14655->11278|14729->11329|14782->11353|14799->11359|14865->11402|15312->11821|15328->11827|15398->11874|15453->11900|15470->11906|15533->11946|16049->12434|16065->12440|16108->12460|16613->12937|16629->12943|16685->12976|16872->13135|16888->13141|16931->13161|17075->13277|17108->13300|17149->13302|17211->13335|17284->13380|17300->13386|17347->13410|17482->13526|17496->13531|17536->13532|17598->13566|17669->13627|17710->13629|17776->13666|17863->13725|17885->13736|17913->13741|18782->14581|18799->14587|18864->14629|19108->14844|19125->14850|19182->14884|19859->15532|19876->15538|19928->15567|20170->15780|20187->15786|20238->15814|20490->16037|20507->16043|20547->16060|21225->16709|21242->16715|21295->16745|21542->16963|21559->16969|21616->17003|22281->17639|22298->17645|22336->17660|22940->18235|22957->18241|23025->18286|23476->18718|23490->18723|23530->18724|23596->18762|23666->18822|23708->18824|23779->18979|23849->19020|23937->19079|23959->19090|23987->19095|24896->19975|24913->19981|24977->20022|25238->20254|25255->20260|25332->20314|25593->20546|25610->20552|25673->20592|26424->21314|26441->21320|26500->21356|26753->21580|26770->21586|26834->21627|27537->22301|27554->22307|27611->22341|27865->22566|27882->22572|27944->22611|28636->23274|28653->23280|28691->23295|29327->23902|29344->23908|29412->23953|29903->24412|29969->24446|30031->24476|30093->24532|30151->24600|30214->24710|30281->24855|30348->24989|30410->25033|30468->25072|30530->25132|30584->25157|30685->25239|30727->25252|30974->25471|31003->25478|31045->25491|31586->26004|31602->26010|31648->26034|32319->26677|32335->26683|32385->26711|32923->27256|32985->27325|33051->27386|33121->27449|33191->27511|33265->27606|33339->27701|33414->27804|33489->27905|33559->27955|33625->28002|33687->28045|33745->28084|33799->28109|33901->28213|33951->28261|34005->28307|34064->28420|34122->28462|34184->28534|34247->28650|34310->28774|34368->28817|34422->28852|34472->28883|34518->28910|34564->28927|35068->29410|35118->29458|35172->29507|35230->29565|35292->29631|35359->29755|35421->29798|35484->29939|35542->29978|35596->30014|35646->30045|35692->30071|35734->30084|35890->30212|35959->30264|36000->30266|36058->30295|36100->30309|36116->30315|36178->30355|36248->30397|36266->30405|36293->30410|36471->30560|36557->30628|36599->30630|36673->30675|36715->30689|36731->30695|36800->30741|36882->30795|36903->30806|36930->30811|37065->30914|37135->30955|37240->31028|37291->31050|37524->31255|37540->31261|37595->31294|37709->31380|37742->31403|37783->31405|37833->31426|37875->31440|37891->31446|37937->31470|38023->31537|38037->31542|38077->31543|38127->31565|38198->31626|38239->31628|38293->31653|38343->31675|38364->31686|38391->31691|38510->31782|38526->31788|38590->31830|38737->31949|38753->31955|38804->31984|38912->32064|38928->32070|38965->32085|39101->32202|39115->32207|39155->32208|39209->32234|39279->32294|39320->32296|39378->32325|39428->32347|39449->32358|39476->32363|39603->32462|39619->32468|39682->32509|39836->32635|39852->32641|39910->32677|40020->32759|40036->32765|40073->32780|40233->32908|40287->32930|40337->32948|40379->32961
                  LINES: 31->3|36->3|37->4|56->23|56->23|56->23|58->25|58->25|58->25|59->26|60->27|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|67->34|67->34|67->34|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|86->53|86->53|86->53|87->54|153->120|153->120|154->121|154->121|156->123|156->123|156->123|158->125|158->125|158->125|159->126|159->126|159->126|164->131|165->132|165->132|165->132|165->132|174->141|175->142|176->143|177->144|179->146|181->148|182->149|185->152|185->152|185->152|185->152|185->152|185->152|194->161|194->161|194->161|202->169|202->169|202->169|203->170|203->170|203->170|203->170|204->171|204->171|204->171|207->174|207->174|207->174|208->175|208->175|208->175|208->175|209->176|209->176|209->176|211->178|212->179|214->181|216->183|222->189|222->189|222->189|222->189|222->189|222->189|228->195|228->195|228->195|228->195|228->195|228->195|234->201|234->201|234->201|234->201|234->201|234->201|240->207|240->207|240->207|240->207|240->207|240->207|249->216|249->216|249->216|255->222|255->222|255->222|257->224|257->224|257->224|259->226|259->226|259->226|260->227|260->227|260->227|260->227|262->229|262->229|262->229|263->230|263->230|263->230|264->231|264->231|264->231|264->231|273->240|273->240|273->240|275->242|275->242|275->242|283->250|283->250|283->250|285->252|285->252|285->252|287->254|287->254|287->254|294->261|294->261|294->261|296->263|296->263|296->263|303->270|303->270|303->270|311->278|311->278|311->278|318->285|318->285|318->285|319->286|319->286|319->286|320->287|321->288|321->288|321->288|321->288|330->297|330->297|330->297|332->299|332->299|332->299|334->301|334->301|334->301|341->308|341->308|341->308|343->310|343->310|343->310|350->317|350->317|350->317|352->319|352->319|352->319|359->326|359->326|359->326|367->334|367->334|367->334|374->341|375->342|376->343|377->344|378->345|379->346|380->347|381->348|382->349|383->350|384->351|385->352|388->355|389->356|394->361|394->361|395->362|406->373|406->373|406->373|418->385|418->385|418->385|428->395|429->396|430->397|431->398|432->399|433->400|434->401|435->402|436->403|437->404|438->405|439->406|440->407|441->408|444->411|445->412|446->413|447->414|448->415|449->416|450->417|451->418|452->419|453->420|454->421|455->422|456->423|468->435|469->436|470->437|471->438|472->439|473->440|474->441|475->442|476->443|477->444|478->445|479->446|480->447|483->450|483->450|483->450|484->451|484->451|484->451|484->451|485->452|485->452|485->452|488->455|488->455|488->455|489->456|489->456|489->456|489->456|490->457|490->457|490->457|492->459|493->460|495->462|497->464|502->469|502->469|502->469|504->471|504->471|504->471|505->472|505->472|505->472|505->472|506->473|506->473|506->473|507->474|507->474|507->474|508->475|508->475|508->475|508->475|510->477|510->477|510->477|512->479|512->479|512->479|513->480|513->480|513->480|516->483|516->483|516->483|517->484|517->484|517->484|518->485|518->485|518->485|518->485|520->487|520->487|520->487|522->489|522->489|522->489|523->490|523->490|523->490|526->493|527->494|528->495|529->496
                  -- GENERATED --
              */
          