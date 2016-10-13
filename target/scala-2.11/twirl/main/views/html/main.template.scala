
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
	    """),format.raw/*132.6*/("""<script type="text/javascript" src='"""),_display_(/*132.43*/routes/*132.49*/.Assets.versioned("javascripts/googleAnalytics.js")),format.raw/*132.100*/("""'></script>

	    <script type='text/javascript'>
(function()"""),format.raw/*135.12*/("""{"""),format.raw/*135.13*/(""" """),format.raw/*135.14*/("""var widget_id = 'r2E5WGIPzp';var d=document;var w=window;function l()"""),format.raw/*135.83*/("""{"""),format.raw/*135.84*/("""
"""),format.raw/*136.1*/("""var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true; s.src = '//code.jivosite.com/script/widget/'+widget_id; var ss = document.getElementsByTagName('script')[0]; ss.parentNode.insertBefore(s, ss);"""),format.raw/*136.230*/("""}"""),format.raw/*136.231*/("""if(d.readyState=='complete')"""),format.raw/*136.259*/("""{"""),format.raw/*136.260*/("""l();"""),format.raw/*136.264*/("""}"""),format.raw/*136.265*/("""else"""),format.raw/*136.269*/("""{"""),format.raw/*136.270*/("""if(w.attachEvent)"""),format.raw/*136.287*/("""{"""),format.raw/*136.288*/("""w.attachEvent('onload',l);"""),format.raw/*136.314*/("""}"""),format.raw/*136.315*/("""else"""),format.raw/*136.319*/("""{"""),format.raw/*136.320*/("""w.addEventListener('load',l,false);"""),format.raw/*136.355*/("""}"""),format.raw/*136.356*/("""}"""),format.raw/*136.357*/("""}"""),format.raw/*136.358*/(""")();</script>


    </head>


    <body class="cms-index-index cms-home-page">
        <div id="page">
            """),format.raw/*144.45*/("""
            """),format.raw/*145.130*/("""
            """),format.raw/*146.133*/("""
            """),format.raw/*147.23*/("""

                """),format.raw/*149.17*/("""<!-- Navbar -->
            <nav class=" navbar-fixed-top">
                """),format.raw/*151.45*/("""
                """),format.raw/*152.17*/("""<div class="row">
                    <div class="col-lg-2 col-sm-2 col-xs-4 col-lg-offset-1">
                            <!-- Header Logo -->
                        <div class="logo"><a title="Magento Commerce" href=""""),_display_(/*155.78*/routes/*155.84*/.Application.index()),format.raw/*155.104*/(""""><img alt="Namjestaj" src='"""),_display_(/*155.133*/routes/*155.139*/.Assets.versioned("images/logo.png")),format.raw/*155.175*/("""'></a></div>
                            <!-- End Header Logo -->
                    </div>
                    <div class="mm-toggle-wrap">
                        <div class="mm-toggle"><i class="fa fa-bars"></i><span class="mm-label">Menu</span> </div>
                    </div>
                    <div class="nav-inner col-lg-9">

                        <ul id="nav" class="hidden-xs">
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*164.74*/routes/*164.80*/.Application.index()),format.raw/*164.100*/("""" class="level-top"><span>
                                   Početna</span></a></li>
                            <li class="mega-menu"><a href="" class="level-top"><span>NAMEŠTAJ</span></a>
                                <div class="level0-wrapper dropdown-6col">
                                    <div class="container">
                                        <div class="level0-wrapper2">
                                            <div class="nav-block nav-block-center">
                                                <ul class="level0">
                                                """),_display_(/*172.50*/for(category <- models.Category.findAllCategories()) yield /*172.102*/ {_display_(Seq[Any](format.raw/*172.104*/("""
                                                    """),format.raw/*173.53*/("""<li class="level1 nav-6-1 parent item"><a href=""""),_display_(/*173.102*/routes/*173.108*/.Items.getItemsWithCategory(category.id)),format.raw/*173.148*/(""""><span>
                                                    """),_display_(/*174.54*/category/*174.62*/.name),format.raw/*174.67*/("""</span>
                                                    </a>
                                                        <ul class="level1">
                                                        """),_display_(/*177.58*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*177.126*/ {_display_(Seq[Any](format.raw/*177.128*/("""
                                                            """),format.raw/*178.61*/("""<li class="level2 nav-6-1-1"><a href=""""),_display_(/*178.100*/routes/*178.106*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*178.152*/(""""><span>
                                                            """),_display_(/*179.62*/subcategory/*179.73*/.name),format.raw/*179.78*/("""</span></a>
                                                            </li>
                                                        """)))}),format.raw/*181.58*/("""
                                                        """),format.raw/*182.57*/("""</ul>
                                                    </li>
                                                """)))}),format.raw/*184.50*/("""

                                                """),format.raw/*186.49*/("""</ul>
                                            </div>
                                        </div>
                                            <!--level0-wrapper2-->
                                        <div class="nav-add">
                                            <div class="push_item">
                                                <div class="push_img"><a href=""""),_display_(/*192.81*/routes/*192.87*/.Items.getItemsWithCategory(Constants.DNEVNI_BORAVAK)),format.raw/*192.140*/(""""><img alt="phone" src='"""),_display_(/*192.165*/routes/*192.171*/.Assets.versioned("images/menu_ele_phone1.png")),format.raw/*192.218*/("""'></a></div>
                                                <div class="push_text">
                                                   DNEVNI BORAVAK
                                                </div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href=""""),_display_(/*198.81*/routes/*198.87*/.Items.getItemsWithCategory(Constants.KUHINJE)),format.raw/*198.133*/(""""><img alt="camera" src='"""),_display_(/*198.159*/routes/*198.165*/.Assets.versioned("images/kuhinja.jpg")),format.raw/*198.204*/("""'></a></div>
                                                <div class="push_text">
                                                    KUHINJA
                                                </div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href=""""),_display_(/*204.81*/routes/*204.87*/.Items.getItemsWithCategory(Constants.SPAVACA_SOBA)),format.raw/*204.138*/(""""><img alt="ipod" src='"""),_display_(/*204.162*/routes/*204.168*/.Assets.versioned("images/spavacaSoba.jpg")),format.raw/*204.211*/("""'></a></div>
                                                <div class="push_text">
                                                    SPAVAĆA SOBA
                                                </div>
                                            </div>
                                            <div class="push_item push_item_last">
                                                <div class="push_img"><a href=""""),_display_(/*210.81*/routes/*210.87*/.Items.getItemsWithCategory(Constants.KUPATILO)),format.raw/*210.134*/(""""><img alt="laptop" src='"""),_display_(/*210.160*/routes/*210.166*/.Assets.versioned("images/kupatilo.jpg")),format.raw/*210.206*/("""'></a></div>
                                                <div class="push_text">
                                                    KUPATILO
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*219.74*/routes/*219.80*/.Items.itemsOnSale()),format.raw/*219.100*/("""" class="level-top"><span>
                                   AKCIJA <img src=""""),_display_(/*220.54*/routes/*220.60*/.Assets.versioned("images/11568812.png")),format.raw/*220.100*/("""">  </span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   TOP PONUDA</span></a></li>
                            <li class="level0 nav-8 level-top"><a href="#" class="level-top"><span>
                                   IDEJE</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*225.74*/routes/*225.80*/.NewsController.newsPanelRender()),format.raw/*225.113*/("""" class="level-top"><span>
                                   VIJESTI</span></a></li>
                            <li class="level0 nav-8 level-top"><a href=""""),_display_(/*227.74*/routes/*227.80*/.Partners.partnerPanel()),format.raw/*227.104*/("""" class="level-top"><span>
                                   PARTNERI</span></a></li>
                            """),_display_(/*229.30*/if(currentUser == null)/*229.53*/ {_display_(Seq[Any](format.raw/*229.55*/("""
                                """),format.raw/*230.33*/("""<li class="level0 nav-8 level-top"><a href=""""),_display_(/*230.78*/routes/*230.84*/.Login.loginPageRender()),format.raw/*230.108*/("""" class="level-top"><span>
                                    Log In</span></a></li>
                            """)))}/*232.31*/else/*232.36*/{_display_(Seq[Any](format.raw/*232.37*/("""
                                """),_display_(/*233.34*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*233.95*/ {_display_(Seq[Any](format.raw/*233.97*/("""
                                    """),format.raw/*234.37*/("""<li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*234.96*/currentUser/*234.107*/.name),format.raw/*234.112*/("""</span></a>
                                        <div class="level0-wrapper dropdown-6col">
                                            <div class="container">
                                                <div class="level0-wrapper2">
                                                    <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                        <ul class="level0">
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                ADMIN PANEL</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*243.111*/routes/*243.117*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*243.159*/(""""><span>
                                                                    Admin Panel</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*245.111*/routes/*245.117*/.NewsController.createNewsRender()),format.raw/*245.151*/(""""><span>
                                                                        Kreiraj Vijest</span></a></li>

                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KORISNICI</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*253.105*/routes/*253.111*/.AppUsers.listOfUsersRender()),format.raw/*253.140*/(""""><span>
                                                                    Lista korisnika</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*255.105*/routes/*255.111*/.AppUsers.createUserRender()),format.raw/*255.139*/(""""><span>
                                                                        Dodaj korisnika</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*257.111*/routes/*257.117*/.Items.allItems()),format.raw/*257.134*/(""""><span>
                                                                        Lista proizvoda</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KATEGORIJE</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*264.105*/routes/*264.111*/.Categories.listOfCategories()),format.raw/*264.141*/(""""><span>
                                                                        Lista kategorija</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*266.105*/routes/*266.111*/.Categories.createCategoryRender()),format.raw/*266.145*/(""""><span>
                                                                        Dodaj kategoriju</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                               LOGOUT</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*273.105*/routes/*273.111*/.Login.logout()),format.raw/*273.126*/(""""><span>
                                                                    Logout</span></a></li>
                                                                </ul>
                                                            </li>

                                                        </ul>
                                                    </div>
                                                        <!--nav-block nav-block-center-->
                                                    <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*281.128*/routes/*281.134*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*281.179*/("""' alt="furniture"></a> </div>
                                                        <!--nav-block nav-block-right std grid12-4-->
                                                </div>
                                            </div>
                                                <!--level0-wrapper2-->
                                        </div>
                                    </li>
                                """)))}/*288.35*/else/*288.40*/{_display_(Seq[Any](format.raw/*288.41*/("""
                                    """),_display_(/*289.38*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*289.98*/ {_display_(Seq[Any](format.raw/*289.100*/("""
                                        """),format.raw/*290.41*/("""<script type="text/javascript" src=""""),_display_(/*290.78*/routes/*290.84*/.Assets.versioned("javascripts/messageNotifications.js")),format.raw/*290.140*/(""""></script>
                                        <li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*291.100*/currentUser/*291.111*/.name),format.raw/*291.116*/("""</span></a>
                                            <div class="level0-wrapper dropdown-6col">
                                                <div class="container">
                                                    <div class="level0-wrapper2">
                                                        <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                            <ul class="level0">
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    Krisnički panel</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*300.115*/routes/*300.121*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*300.162*/(""""><span>
                                                                            Korisnički panel</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*302.115*/routes/*302.121*/.AppUsers.updateUserInformationsRender(currentUser.id)),format.raw/*302.175*/(""""><span>
                                                                            Ažuriraj podatke</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*304.115*/routes/*304.121*/.Messages.listOfMessages(currentUser.id)),format.raw/*304.161*/(""""><span>
                                                                            Poruke </span> <span class="badge" id="message_notifications"> </span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    OBJEKTI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*311.109*/routes/*311.115*/.Stores.listOfStores(currentUser.id)),format.raw/*311.151*/(""""><span>
                                                                            Lista objekata</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*313.109*/routes/*313.115*/.Stores.createStoreRender(currentUser.id)),format.raw/*313.156*/(""""><span>
                                                                            Dodaj objekat</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    PROIZVODI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*320.109*/routes/*320.115*/.Items.listOfItems(currentUser.id)),format.raw/*320.149*/(""""><span>
                                                                            Lista proizvoda</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*322.109*/routes/*322.115*/.Items.createItemRender(currentUser.id)),format.raw/*322.154*/(""""><span>
                                                                            Dodaj proizvod</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    LOGOUT</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*329.109*/routes/*329.115*/.Login.logout()),format.raw/*329.130*/(""""><span>
                                                                            Logout</span></a></li>
                                                                    </ul>
                                                                </li>

                                                            </ul>
                                                        </div>
                                                            <!--nav-block nav-block-center-->
                                                        <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*337.132*/routes/*337.138*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*337.183*/("""' alt="furniture"></a> </div>
                                                            <!--nav-block nav-block-right std grid12-4-->
                                                    </div>
                                                </div>
                                                    <!--level0-wrapper2-->
                                            </div>
                                        </li>
                                    """)))}),format.raw/*344.38*/("""
                                """)))}),format.raw/*345.34*/("""
                            """)))}),format.raw/*346.30*/("""
                                """),format.raw/*347.33*/("""<!-- Search-col -->
                            <div class="search-box pull-right">
                                <form action=""""),_display_(/*349.48*/routes/*349.54*/.Items.searchBox()),format.raw/*349.72*/("""" method="POST" id="search_mini_form" name="Categories">
                                    <input type="text" placeholder="Pretražite po nazivu, cijeni, kategoriji ..."  maxlength="70" name="search" id="search">
                                    <button type="button" class="search-btn-bg"><span class="fa fa-search"></span>&nbsp;</button>
                                    <div name="results"></div>
                                </form>
                            </div>
                                <!-- End Search-col -->

                        </ul>
                    </div>
                </div>
                """),format.raw/*360.27*/("""
            """),format.raw/*361.13*/("""</nav>
                <!-- end nav -->

                <!-------------------------------------------- CONTENT --------------------------------------------->
            <div style="margin-top: 60px">
                """),_display_(/*366.18*/content),format.raw/*366.25*/("""
            """),format.raw/*367.13*/("""</div>
                <!-- Footer -->
            <footer>
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 col-lg-12 col-md-12" >
                                <div class="footer-column pull-left col-md-3">
                                    <h4>O NAMA</h4>
                                    <ul class="links">
                                        <li><a href=""""),_display_(/*377.55*/routes/*377.61*/.Application.faqRender()),format.raw/*377.85*/("""" title="FAQs">FAQs</a></li>
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
                                        <li><a href=""""),_display_(/*389.55*/routes/*389.61*/.ContactUs.contactUsRender()),format.raw/*389.89*/("""" title="Contact Us">
                                            Contact Us</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left col-md-3">
                                    <h4>PRAVILA KORIŠTENJA</h4>
                                    <ul class="links">
                                    </ul>
                                </div>
                            </div>
                            """),format.raw/*399.65*/("""
                                """),format.raw/*400.69*/("""
                                    """),format.raw/*401.61*/("""
                                        """),format.raw/*402.63*/("""
                                        """),format.raw/*403.62*/("""
                                            """),format.raw/*404.95*/("""
                                            """),format.raw/*405.95*/("""
                                            """),format.raw/*406.103*/("""
                                            """),format.raw/*407.101*/("""
                                        """),format.raw/*408.50*/("""
                                    """),format.raw/*409.47*/("""
                                """),format.raw/*410.43*/("""
                            """),format.raw/*411.39*/("""
                        """),format.raw/*412.25*/("""</div>
                    </div>
                </div>
                """),format.raw/*415.48*/("""
                    """),format.raw/*416.48*/("""
                        """),format.raw/*417.46*/("""
                            """),format.raw/*418.113*/("""
                            """),format.raw/*419.42*/("""
                                """),format.raw/*420.72*/("""
                                """),format.raw/*421.116*/("""
                                """),format.raw/*422.124*/("""
                            """),format.raw/*423.43*/("""
                        """),format.raw/*424.35*/("""
                    """),format.raw/*425.31*/("""
                """),format.raw/*426.27*/("""
                """),format.raw/*427.17*/("""<div class="footer-bottom">
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
                        <form action=""""),_display_(/*441.40*/routes/*441.46*/.Items.searchBoxMobile()),format.raw/*441.70*/("""" method="POST">
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
                        """),_display_(/*454.26*/for(category <- models.Category.findAllCategories()) yield /*454.78*/ {_display_(Seq[Any](format.raw/*454.80*/("""
                            """),format.raw/*455.29*/("""<li><a href=""""),_display_(/*455.43*/routes/*455.49*/.Items.getItemsWithCategory(category.id)),format.raw/*455.89*/(""""><span>
                                """),_display_(/*456.34*/category/*456.42*/.name),format.raw/*456.47*/("""</span>
                                    </a>
                                        <ul class="level1">
                                        """),_display_(/*459.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*459.110*/ {_display_(Seq[Any](format.raw/*459.112*/("""
                                            """),format.raw/*460.45*/("""<li><a href=""""),_display_(/*460.59*/routes/*460.65*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*460.111*/(""""><span>
                                            """),_display_(/*461.46*/subcategory/*461.57*/.name),format.raw/*461.62*/("""</span></a>
                                            </li>
                                        """)))}),format.raw/*463.42*/("""
                                        """),format.raw/*464.41*/("""</ul>
                                    </li>
                        """)))}),format.raw/*466.26*/("""

                    """),format.raw/*468.21*/("""</ul>
                </li>
                <li><a href=""""),_display_(/*470.31*/routes/*470.37*/.Items.itemsOnSale()),format.raw/*470.57*/("""">AKCIJA</a></li>
                <li><a href="#">TOP PONUDA</a></li>
                <li><a href="#">IDEJE</a></li>
                <li><a href=""""),_display_(/*473.31*/routes/*473.37*/.NewsController.newsPanelRender()),format.raw/*473.70*/("""">VIJESTI</a></li>
                <li><a href=""""),_display_(/*474.31*/routes/*474.37*/.Partners.partnerPanel()),format.raw/*474.61*/("""">PARTNERI</a></li>
                """),_display_(/*475.18*/if(currentUser == null)/*475.41*/ {_display_(Seq[Any](format.raw/*475.43*/("""
                    """),format.raw/*476.21*/("""<li><a href=""""),_display_(/*476.35*/routes/*476.41*/.Login.loginPageRender()),format.raw/*476.65*/("""" class="level-top"><span>Log In</span></a></li>
                """)))}/*477.19*/else/*477.24*/{_display_(Seq[Any](format.raw/*477.25*/("""
                    """),_display_(/*478.22*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*478.83*/ {_display_(Seq[Any](format.raw/*478.85*/("""
                        """),format.raw/*479.25*/("""<li><a href=""><span>"""),_display_(/*479.47*/currentUser/*479.58*/.name),format.raw/*479.63*/("""</span></a>
                            <ul>
                                <li><a href=""""),_display_(/*481.47*/routes/*481.53*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*481.95*/(""""><span>
                                    Admin Panel</span></a></li>
                                <li><a href=""""),_display_(/*483.47*/routes/*483.53*/.AppUsers.listOfUsersRender()),format.raw/*483.82*/(""""><span>Korisnici</span></a></li>
                                <li><a href=""""),_display_(/*484.47*/routes/*484.53*/.Login.logout()),format.raw/*484.68*/(""""><span>Logout</span></a></li>
                            </ul>
                        </li>
                    """)))}/*487.23*/else/*487.28*/{_display_(Seq[Any](format.raw/*487.29*/("""
                        """),_display_(/*488.26*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*488.86*/ {_display_(Seq[Any](format.raw/*488.88*/("""
                            """),format.raw/*489.29*/("""<li><a href=""><span>"""),_display_(/*489.51*/currentUser/*489.62*/.name),format.raw/*489.67*/("""</span></a>
                                <ul>
                                    <li><a href=""""),_display_(/*491.51*/routes/*491.57*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*491.98*/(""""><span>
                                        User Panel</span></a></li>
                                    <li><a href=""""),_display_(/*493.51*/routes/*493.57*/.Stores.listOfStores(currentUser.id)),format.raw/*493.93*/(""""><span>Objekti</span></a></li>
                                    <li><a href=""""),_display_(/*494.51*/routes/*494.57*/.Login.logout()),format.raw/*494.72*/(""""><span>Logout</span></a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*497.26*/("""
                    """)))}),format.raw/*498.22*/("""
                """)))}),format.raw/*499.18*/("""
            """),format.raw/*500.13*/("""</ul>
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
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/main.scala.html
                  HASH: 7860d8d36fadb3b7995f9681a591078d9a81c38e
                  MATRIX: 832->59|1013->145|1040->146|1863->942|1878->948|1953->1002|2082->1104|2097->1110|2169->1160|2209->1290|2245->1299|2318->1345|2333->1351|2399->1395|2495->1464|2510->1470|2578->1516|2663->1574|2678->1580|2749->1629|2833->1686|2848->1692|2916->1738|3000->1795|3015->1801|3089->1853|3173->1910|3188->1916|3265->1971|3349->2028|3364->2034|3428->2076|3524->2145|3539->2151|3608->2198|4194->2757|4209->2763|4276->2809|4360->2866|4375->2872|4446->2921|4530->2978|4545->2984|4610->3028|4694->3085|4709->3091|4775->3136|4859->3193|4874->3199|4937->3241|5021->3298|5036->3304|5113->3359|5197->3416|5212->3422|5286->3474|5370->3531|5385->3537|5465->3595|5549->3652|5564->3658|5631->3704|5752->3797|5781->3798|5822->3811|5892->3853|5921->3854|5966->3871|8033->5909|8063->5910|8102->5921|8132->5922|8226->5988|8242->5994|8318->6047|8404->6105|8420->6111|8493->6161|8586->6226|8602->6232|8672->6279|8927->6606|8961->6612|9026->6649|9042->6655|9116->6706|9206->6767|9236->6768|9266->6769|9364->6838|9394->6839|9423->6840|9682->7069|9713->7070|9771->7098|9802->7099|9836->7103|9867->7104|9901->7108|9932->7109|9979->7126|10010->7127|10066->7153|10097->7154|10131->7158|10162->7159|10227->7194|10258->7195|10289->7196|10320->7197|10464->7344|10507->7474|10550->7607|10592->7630|10639->7648|10744->7752|10790->7769|11039->7990|11055->7996|11098->8016|11156->8045|11173->8051|11232->8087|11727->8554|11743->8560|11786->8580|12412->9178|12482->9230|12524->9232|12606->9285|12684->9334|12701->9340|12764->9380|12854->9442|12872->9450|12899->9455|13125->9653|13211->9721|13253->9723|13343->9784|13411->9823|13428->9829|13497->9875|13595->9945|13616->9956|13643->9961|13810->10096|13896->10153|14041->10266|14120->10316|14529->10697|14545->10703|14621->10756|14675->10781|14692->10787|14762->10834|15195->11239|15211->11245|15280->11291|15335->11317|15352->11323|15414->11362|15841->11761|15857->11767|15931->11818|15984->11842|16001->11848|16067->11891|16514->12310|16530->12316|16600->12363|16655->12389|16672->12395|16735->12435|17251->12923|17267->12929|17310->12949|17418->13029|17434->13035|17497->13075|17938->13488|17954->13494|18010->13527|18197->13686|18213->13692|18260->13716|18404->13832|18437->13855|18478->13857|18540->13890|18613->13935|18629->13941|18676->13965|18811->14081|18825->14086|18865->14087|18927->14121|18998->14182|19039->14184|19105->14221|19192->14280|19214->14291|19242->14296|20111->15136|20128->15142|20193->15184|20437->15399|20454->15405|20511->15439|21188->16087|21205->16093|21257->16122|21499->16335|21516->16341|21567->16369|21819->16592|21836->16598|21876->16615|22554->17264|22571->17270|22624->17300|22871->17518|22888->17524|22945->17558|23610->18194|23627->18200|23665->18215|24269->18790|24286->18796|24354->18841|24805->19273|24819->19278|24859->19279|24925->19317|24995->19377|25037->19379|25107->19420|25172->19457|25188->19463|25267->19519|25407->19630|25429->19641|25457->19646|26366->20526|26383->20532|26447->20573|26708->20805|26725->20811|26802->20865|27063->21097|27080->21103|27143->21143|27894->21865|27911->21871|27970->21907|28223->22131|28240->22137|28304->22178|29007->22852|29024->22858|29081->22892|29335->23117|29352->23123|29414->23162|30106->23825|30123->23831|30161->23846|30797->24453|30814->24459|30882->24504|31373->24963|31439->24997|31501->25027|31563->25060|31722->25191|31738->25197|31778->25215|32442->25860|32484->25873|32731->26092|32760->26099|32802->26112|33342->26624|33358->26630|33404->26654|34075->27297|34091->27303|34141->27331|34679->27876|34741->27945|34807->28006|34877->28069|34947->28131|35021->28226|35095->28321|35170->28424|35245->28525|35315->28575|35381->28622|35443->28665|35501->28704|35555->28729|35657->28833|35707->28881|35761->28927|35820->29040|35878->29082|35940->29154|36003->29270|36066->29394|36124->29437|36178->29472|36228->29503|36274->29530|36320->29547|36911->30110|36927->30116|36973->30140|37692->30831|37761->30883|37802->30885|37860->30914|37902->30928|37918->30934|37980->30974|38050->31016|38068->31024|38095->31029|38273->31179|38359->31247|38401->31249|38475->31294|38517->31308|38533->31314|38602->31360|38684->31414|38705->31425|38732->31430|38867->31533|38937->31574|39042->31647|39093->31669|39179->31727|39195->31733|39237->31753|39412->31900|39428->31906|39483->31939|39560->31988|39576->31994|39622->32018|39687->32055|39720->32078|39761->32080|39811->32101|39853->32115|39869->32121|39915->32145|40001->32212|40015->32217|40055->32218|40105->32240|40176->32301|40217->32303|40271->32328|40321->32350|40342->32361|40369->32366|40488->32457|40504->32463|40568->32505|40715->32624|40731->32630|40782->32659|40890->32739|40906->32745|40943->32760|41079->32877|41093->32882|41133->32883|41187->32909|41257->32969|41298->32971|41356->33000|41406->33022|41427->33033|41454->33038|41581->33137|41597->33143|41660->33184|41814->33310|41830->33316|41888->33352|41998->33434|42014->33440|42051->33455|42211->33583|42265->33605|42315->33623|42357->33636
                  LINES: 31->3|36->3|37->4|56->23|56->23|56->23|58->25|58->25|58->25|59->26|60->27|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|67->34|67->34|67->34|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|86->53|86->53|86->53|87->54|153->120|153->120|154->121|154->121|156->123|156->123|156->123|158->125|158->125|158->125|159->126|159->126|159->126|164->131|165->132|165->132|165->132|165->132|168->135|168->135|168->135|168->135|168->135|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|169->136|177->144|178->145|179->146|180->147|182->149|184->151|185->152|188->155|188->155|188->155|188->155|188->155|188->155|197->164|197->164|197->164|205->172|205->172|205->172|206->173|206->173|206->173|206->173|207->174|207->174|207->174|210->177|210->177|210->177|211->178|211->178|211->178|211->178|212->179|212->179|212->179|214->181|215->182|217->184|219->186|225->192|225->192|225->192|225->192|225->192|225->192|231->198|231->198|231->198|231->198|231->198|231->198|237->204|237->204|237->204|237->204|237->204|237->204|243->210|243->210|243->210|243->210|243->210|243->210|252->219|252->219|252->219|253->220|253->220|253->220|258->225|258->225|258->225|260->227|260->227|260->227|262->229|262->229|262->229|263->230|263->230|263->230|263->230|265->232|265->232|265->232|266->233|266->233|266->233|267->234|267->234|267->234|267->234|276->243|276->243|276->243|278->245|278->245|278->245|286->253|286->253|286->253|288->255|288->255|288->255|290->257|290->257|290->257|297->264|297->264|297->264|299->266|299->266|299->266|306->273|306->273|306->273|314->281|314->281|314->281|321->288|321->288|321->288|322->289|322->289|322->289|323->290|323->290|323->290|323->290|324->291|324->291|324->291|333->300|333->300|333->300|335->302|335->302|335->302|337->304|337->304|337->304|344->311|344->311|344->311|346->313|346->313|346->313|353->320|353->320|353->320|355->322|355->322|355->322|362->329|362->329|362->329|370->337|370->337|370->337|377->344|378->345|379->346|380->347|382->349|382->349|382->349|393->360|394->361|399->366|399->366|400->367|410->377|410->377|410->377|422->389|422->389|422->389|432->399|433->400|434->401|435->402|436->403|437->404|438->405|439->406|440->407|441->408|442->409|443->410|444->411|445->412|448->415|449->416|450->417|451->418|452->419|453->420|454->421|455->422|456->423|457->424|458->425|459->426|460->427|474->441|474->441|474->441|487->454|487->454|487->454|488->455|488->455|488->455|488->455|489->456|489->456|489->456|492->459|492->459|492->459|493->460|493->460|493->460|493->460|494->461|494->461|494->461|496->463|497->464|499->466|501->468|503->470|503->470|503->470|506->473|506->473|506->473|507->474|507->474|507->474|508->475|508->475|508->475|509->476|509->476|509->476|509->476|510->477|510->477|510->477|511->478|511->478|511->478|512->479|512->479|512->479|512->479|514->481|514->481|514->481|516->483|516->483|516->483|517->484|517->484|517->484|520->487|520->487|520->487|521->488|521->488|521->488|522->489|522->489|522->489|522->489|524->491|524->491|524->491|526->493|526->493|526->493|527->494|527->494|527->494|530->497|531->498|532->499|533->500
                  -- GENERATED --
              */
          