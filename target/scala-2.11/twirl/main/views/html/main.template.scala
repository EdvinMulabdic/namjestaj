
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
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*32.55*/routes/*32.61*/.Assets.versioned("stylesheets/style.css")),format.raw/*32.103*/("""'media="all">
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*33.55*/routes/*33.61*/.Assets.versioned("stylesheets/flexslider.css")),format.raw/*33.108*/("""'media="all">
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
        <script  src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>

    </head>


    <body class="cms-index-index cms-home-page">
        <div id="page">
            """),format.raw/*135.45*/("""
                """),format.raw/*136.134*/("""
                """),format.raw/*137.137*/("""
            """),format.raw/*138.23*/("""

                """),format.raw/*140.17*/("""<!-- Navbar -->
            <nav>
                """),format.raw/*142.44*/("""
                    """),format.raw/*143.21*/("""<div class="row">
                        <div class="col-lg-2 col-sm-2 col-xs-4 col-lg-offset-1">
                                <!-- Header Logo -->
                            <div class="logo"><a title="Magento Commerce" href=""""),_display_(/*146.82*/routes/*146.88*/.Application.index()),format.raw/*146.108*/(""""><img alt="Namjestaj" src='"""),_display_(/*146.137*/routes/*146.143*/.Assets.versioned("images/logo.png")),format.raw/*146.179*/("""'></a></div>
                                <!-- End Header Logo -->
                        </div>
                        <div class="mm-toggle-wrap">
                            <div class="mm-toggle"><i class="icon-reorder"></i><span class="mm-label">Menu</span> </div>
                        </div>
                        <div class="nav-inner col-lg-9">

                            <ul id="nav" class="hidden-xs">
                                <li class="mega-menu"><a href="" class="level-top"><span>Women</span></a>
                                    <div class="level0-wrapper dropdown-6col">
                                        <div class="container">
                                            <div class="level0-wrapper2">
                                                <div class="col-1">
                                                    <div class="nav-block nav-block-center">
                                                        <ul class="level0">
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>Stylish Bag</span></a>
                                                                <ul class="level1">
                                                                    <li class="level2 nav-6-1-1"><a href="" class=""><span>Clutch Handbags</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href="" class=""><span>Diaper Bags</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href="" class=""><span>Bags</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href="" class=""><span>Hobo handbags</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>Material Bag</span></a>
                                                                <ul class="level1">
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Beaded Handbags</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Fabric Handbags</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Handbags</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Leather Handbags</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>Shoes</span></a>
                                                                <ul class="level1">
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Flat Shoes</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Flat Sandals</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Boots</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Heels</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>Jwellery</span></a>
                                                                <ul class="level1">
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Bracelets</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Necklaces &amp; Pendent</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Pendants</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Pins &amp; Brooches</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>Dresses</span></a>
                                                                <ul class="level1">
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Casual Dresses</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Evening</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Designer</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Party</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>Swimwear</span></a>
                                                                <ul class="level1">
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Swimsuits</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Beach Clothing</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Clothing</span></a></li>
                                                                    <li class="level2 nav-6-1-1"><a href=""><span>Bikinis</span></a></li>
                                                                </ul>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </div>
                                                    <!--nav-block nav-block-center-->
                                                <div class="col-2">
                                                    <div class="menu_image"><a href="#" title=""><img src='"""),_display_(/*215.109*/routes/*215.115*/.Assets.versioned("images/menu_image.jpg")),format.raw/*215.157*/("""' alt="menu_image"></a></div>
                                                    <div class="menu_image1"><a href="#" title=""><img src='"""),_display_(/*216.110*/routes/*216.116*/.Assets.versioned("images/menu_image.jpg")),format.raw/*216.158*/("""' alt="menu_image"></a></div>
                                                </div>
                                            </div>
                                                <!--level0-wrapper2--> </div>
                                    </div>
                                </li>
                                <li class="mega-menu"><a href="grid.html" class="level-top"><span>Men</span></a>
                                    <div class="level0-wrapper dropdown-6col">
                                        <div class="container">
                                            <div class="level0-wrapper2">
                                                <div class="nav-block nav-block-center">
                                                    <ul class="level0">
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html" class=""><span>Shoes</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Sport Shoes</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Casual Shoes</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Leather Shoes</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>canvas shoes</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Dresses</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Casual Dresses</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Evening</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Designer</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Party</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Jackets</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Coats</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Formal Jackets</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Leather Jackets</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Blazers</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Watches</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Fasttrack</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Casio</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Titan</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Tommy-Hilfiger</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Sunglasses</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Ray Ban</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Fasttrack</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Police</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Oakley</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Accesories</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Backpacks</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Wallets</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Laptops Bags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Belts</span></a></li>
                                                            </ul>
                                                        </li>
                                                    </ul>
                                                </div>
                                                    <!--level0-wrapper2-->
                                                <div class="nav-add">
                                                    <div class="push_item">
                                                        <div class="push_img"><a href="#"><img alt="sunglass" src='"""),_display_(/*281.117*/routes/*281.123*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*281.172*/("""'></a></div>
                                                        <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                    </div>
                                                    <div class="push_item">
                                                        <div class="push_img"><a href="#"><img alt="watch" src='"""),_display_(/*285.114*/routes/*285.120*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*285.169*/("""'></a></div>
                                                        <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                    </div>
                                                    <div class="push_item">
                                                        <div class="push_img"><a href="#"><img alt="jeans" src='"""),_display_(/*289.114*/routes/*289.120*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*289.169*/("""'></a></div>
                                                        <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                    </div>
                                                    <div class="push_item push_item_last">
                                                        <div class="push_img"><a href="#"><img alt="shoes" src='"""),_display_(/*293.114*/routes/*293.120*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*293.169*/("""'></a></div>
                                                        <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li class="mega-menu"><a href="grid.html" class="level-top"><span>Electronics</span></a>
                                    <div class="level0-wrapper dropdown-6col">
                                        <div class="container">
                                            <div class="level0-wrapper2">
                                                <div class="nav-block nav-block-center">
                                                    <ul class="level0">
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Mobiles</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Samsung</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Nokia</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>IPhone</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Sony</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html" class=""><span>Accesories</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Mobile Memory Cards</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Cases &amp; Covers</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Mobile Headphones</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Bluetooth Headsets</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Cameras</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Camcorders</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Point &amp; Shoot</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Digital SLR</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Camera Accesories</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Audio &amp; Video</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>MP3 Players</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>IPods</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Speakers</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Video Players</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Computer</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>External Hard Disk</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Pendrives</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Headphones</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>PC Components</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Appliances</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Vaccum Cleaners</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Indoor Lighting</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Kitchen Tools</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Water Purifier</span></a></li>
                                                            </ul>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                                <!--level0-wrapper2-->
                                            <div class="nav-add">
                                                <div class="push_item">
                                                    <div class="push_img"><a href="#"><img alt="phone" src='"""),_display_(/*361.110*/routes/*361.116*/.Assets.versioned("images/menu_ele_phone.png")),format.raw/*361.162*/("""'></a></div>
                                                    <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                                <div class="push_item">
                                                    <div class="push_img"><a href="#"><img alt="camera" src='"""),_display_(/*365.111*/routes/*365.117*/.Assets.versioned("images/menu_ele_phone.png")),format.raw/*365.163*/("""'></a></div>
                                                    <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                                <div class="push_item">
                                                    <div class="push_img"><a href="#"><img alt="ipod" src='"""),_display_(/*369.109*/routes/*369.115*/.Assets.versioned("images/menu_ele_phone.png")),format.raw/*369.161*/("""'></a></div>
                                                    <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                                <div class="push_item push_item_last">
                                                    <div class="push_img"><a href="#"><img alt="laptop" src='"""),_display_(/*373.111*/routes/*373.117*/.Assets.versioned("images/menu_ele_phone.png")),format.raw/*373.163*/("""'></a></div>
                                                    <div class="push_text">Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li class="mega-menu"><a class="level-top" href="grid.html"><span>Furniture</span></a>
                                    <div class="level0-wrapper dropdown-6col">
                                        <div class="container">
                                            <div class="level0-wrapper2">
                                                <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                    <ul class="level0">
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Living Room</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Racks &amp; Cabinets</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Sofas</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Chairs</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Tables</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html" class=""><span>Dining &amp; Bar</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Dining Table Sets</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Serving Trolleys</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Bar Counters</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Dining Cabinets</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Bedroom</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Beds</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Chest of Drawers</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Wardrobes &amp; Almirahs</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Nightstands</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href="grid.html"><span>Kitchen</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Kitchen Racks</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Kitchen Fillings</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Wall Units</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="grid.html"><span>Benches &amp; Stools</span></a></li>
                                                            </ul>
                                                        </li>
                                                    </ul>
                                                </div>
                                                    <!--nav-block nav-block-center-->
                                                <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*421.124*/routes/*421.130*/.Assets.versioned("images/menu_furniture_2.png")),format.raw/*421.178*/("""' alt="furniture"></a> </div>
                                                    <!--nav-block nav-block-right std grid12-4--> </div>
                                        </div>
                                            <!--level0-wrapper2-->
                                    </div>
                                </li>
                                <li class="level0 nav-8 level-top"><a href="grid.html" class="level-top"><span>Kids</span></a></li>
                                <li class="nav-custom-link mega-menu"><a class="level-top" href="#"><span>Custom</span></a>
                                    <div class="level0-wrapper custom-menu">
                                        <div class="header-nav-dropdown-wrapper clearer">
                                            <div class="grid12-3">
                                                <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                                <div class="heart-icon">&nbsp;</div>
                                                <p>Our designed to deliver almost everything you want to do online.</p>
                                                <div><img  src='"""),_display_(/*435.66*/routes/*435.72*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*435.115*/("""' alt=""></div>
                                            </div>
                                            <div class="grid12-3">
                                                <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                                <a href="#">
                                                    <div class="icon-star"></div>
                                                </a>
                                                <p>Responsive design is a Web design to provide an optimal navigation.</p>
                                                <div><img  src='"""),_display_(/*443.66*/routes/*443.72*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*443.115*/("""' alt=""></div>
                                            </div>
                                            <div class="grid12-3">
                                                <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                                <a href="#">
                                                    <div class="custom-icon"></div>
                                                </a>
                                                <p>Our font delivery service is built upon a reliable, global network of servers.</p>
                                                <div><img  src='"""),_display_(/*451.66*/routes/*451.72*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*451.115*/("""' alt=""></div>
                                            </div>
                                            <div class="grid12-3">
                                                <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                                <a href="#">
                                                    <div class="icon-custom-grid"></div>
                                                </a>
                                                <p>Smart Product Grid is uses maximum available width of the screen.</p>
                                                <div><img  src='"""),_display_(/*459.66*/routes/*459.72*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*459.115*/("""' alt=""></div>
                                            </div>
                                            <br>
                                        </div>
                                    </div>
                                </li>
                                """),_display_(/*465.34*/if(currentUser == null)/*465.57*/{_display_(Seq[Any](format.raw/*465.58*/("""
                                    """),format.raw/*466.37*/("""<li class="level0 nav-8 level-top"><a href=""""),_display_(/*466.82*/routes/*466.88*/.Login.loginPageRender()),format.raw/*466.112*/("""" class="level-top"><span>Log In</span></a></li>
                                """)))}/*467.34*/else/*467.39*/{_display_(Seq[Any](format.raw/*467.40*/("""
                                    """),_display_(/*468.38*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*468.99*/{_display_(Seq[Any](format.raw/*468.100*/("""
                                        """),format.raw/*469.41*/("""<li class="level0 parent drop-menu"><a href=""><span>"""),_display_(/*469.95*/currentUser/*469.106*/.name),format.raw/*469.111*/("""</span></a>
                                            <ul class="level1">
                                                <li class="level1 first parent"><a href=""""),_display_(/*471.91*/routes/*471.97*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*471.139*/(""""><span>Admin Panel</span></a></li>
                                                <li class="level1 parent"><a href=""""),_display_(/*472.85*/routes/*472.91*/.AppUsers.listOfUsersRender()),format.raw/*472.120*/(""""><span>Korisnici</span></a></li>
                                                <li class="level1 parent"><a href=""""),_display_(/*473.85*/routes/*473.91*/.Login.logout()),format.raw/*473.106*/(""""><span>Logout</span></a></li>
                                            </ul>
                                        </li>
                                    """)))}/*476.38*/else/*476.43*/{_display_(Seq[Any](format.raw/*476.44*/("""
                                        """),_display_(/*477.42*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*477.102*/ {_display_(Seq[Any](format.raw/*477.104*/("""
                                            """),format.raw/*478.45*/("""<li class="level0 parent drop-menu"><a href="index.html"><span>"""),_display_(/*478.109*/currentUser/*478.120*/.name),format.raw/*478.125*/("""</span></a>
                                                <ul class="level1">
                                                    <li class="level1 first parent"><a href=""""),_display_(/*480.95*/routes/*480.101*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*480.142*/(""""><span>User Panel</span></a></li>
                                                    <li class="level1 parent"><a href=""><span>Objekti</span></a></li>
                                                    <li class="level1 parent"><a href=""""),_display_(/*482.89*/routes/*482.95*/.Login.logout()),format.raw/*482.110*/(""""><span>Logout</span></a></li>
                                                </ul>
                                            </li>
                                        """)))}),format.raw/*485.42*/("""
                                    """)))}),format.raw/*486.38*/("""
                                """)))}),format.raw/*487.34*/("""
                                """),format.raw/*488.33*/("""<!-- Search-col -->
                            <div class="search-box pull-right">
                                <form action="cat" method="POST" id="search_mini_form" name="Categories">
                                    <input type="text" placeholder="Search entire store here..." value="Search" maxlength="70" name="search" id="search" >
                                    <button type="button" class="search-btn-bg"><span class="fa fa-search"></span>&nbsp;</button>
                                </form>
                            </div>
                                <!-- End Search-col -->
                        </ul>
                        </div>
                    </div>
                """),format.raw/*499.27*/("""
            """),format.raw/*500.13*/("""</nav>
                <!-- end nav -->

            """),format.raw/*503.44*/("""
                """),format.raw/*504.45*/("""
                    """),format.raw/*505.114*/("""
                """),format.raw/*506.27*/("""
                """),format.raw/*507.51*/("""
                    """),format.raw/*508.48*/("""
                        """),format.raw/*509.33*/("""
                            """),format.raw/*510.37*/("""
                                """),format.raw/*511.62*/("""
                                    """),format.raw/*512.71*/("""
                                    """),format.raw/*513.99*/("""
                                """),format.raw/*514.43*/("""
                            """),format.raw/*515.38*/("""
                            """),format.raw/*516.37*/("""
                                """),format.raw/*517.62*/("""
                                    """),format.raw/*518.73*/("""
                                    """),format.raw/*519.93*/("""
                                """),format.raw/*520.43*/("""
                            """),format.raw/*521.38*/("""
                            """),format.raw/*522.37*/("""
                                """),format.raw/*523.62*/("""
                                    """),format.raw/*524.71*/("""
                                    """),format.raw/*525.88*/("""
                                """),format.raw/*526.43*/("""
                            """),format.raw/*527.38*/("""
                            """),format.raw/*528.50*/("""
                                """),format.raw/*529.62*/("""
                                    """),format.raw/*530.72*/("""
                                    """),format.raw/*531.90*/("""
                                """),format.raw/*532.43*/("""
                            """),format.raw/*533.38*/("""
                        """),format.raw/*534.34*/("""
                    """),format.raw/*535.31*/("""
                """),format.raw/*536.27*/("""
            """),format.raw/*537.23*/("""

             """),_display_(/*539.15*/content),format.raw/*539.22*/("""
                """),format.raw/*540.17*/("""<!-- Footer -->
            <footer>
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 col-lg-9">
                                <div class="footer-column pull-left">
                                    <h4>Shopping Guide</h4>
                                    <ul class="links">
                                        <li class="first"><a href="#" title="How to buy">How to buy</a></li>
                                        <li><a href="faq.html" title="FAQs">FAQs</a></li>
                                        <li><a href="#" title="Payment">Payment</a></li>
                                        <li><a href="#" title="Shipment&lt;/a&gt;">Shipment</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left">
                                    <h4>Style Advisor</h4>
                                    <ul class="links">
                                        <li class="first"><a title="Your Account" href="login.html">Your Account</a></li>
                                        <li><a title="Information" href="#">Information</a></li>
                                        <li><a title="Addresses" href="#">Addresses</a></li>
                                        <li><a title="Addresses" href="#">Discount</a></li>
                                    </ul>
                                </div>
                                <div class="footer-column pull-left">
                                    <h4>Information</h4>
                                    <ul class="links">
                                        <li class="first"><a href="sitemap.html" title="Site Map">Site Map</a></li>
                                        <li><a href="#" title="Search Terms">Search Terms</a></li>
                                        <li><a href="#" title="Advanced Search">Advanced Search</a></li>
                                        <li><a href="contact_us.html" title="Contact Us">Contact Us</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-xs-12 col-lg-3">
                                <div class="footer-column-last">
                                    <div class="social">
                                        <h4>Follow Us</h4>
                                        <ul class="link">
                                            <li class="fb pull-left"><a href="#"></a></li>
                                            <li class="tw pull-left"><a href="#"></a></li>
                                            <li class="googleplus pull-left"><a href="#"></a></li>
                                            <li class="linkedin pull-left"><a href="#"></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="footer-middle">
                    <div class="container">
                        <div class="row">
                            <div><img src='"""),_display_(/*593.45*/routes/*593.51*/.Assets.versioned("images/footer-logo.png")),format.raw/*593.94*/("""' alt=""></div>
                            <address>
                                <i class="icon-location-arrow"></i> 123 Main Street, Anytown, CA 12345  USA <i class="icon-mobile-phone"></i><span> +(408) 394-7557</span> <i class="icon-envelope"></i><span> abc.magikcommerce.com</span>
                            </address>
                        </div>
                    </div>
                </div>
                <div class="footer-bottom">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 text-center coppyright">&copy; Copyright 2016. DT Projects. All Rights Reserved.</div>
                        </div>
                    </div>
                </div>
            </footer>
        </div>
        <div id="mobile-menu">
            <ul>
                <li>
                    <div class="mm-search">
                        <form name="search">
                            <div class="input-group">
                                <div class="input-group-btn">
                                    <button class="btn btn-default" type="submit"><i class="icon-search"></i></button>
                                </div>
                                <input type="text" class="form-control simple" placeholder="Search ..." name="srch-term" id="srch-term">
                            </div>
                        </form>
                    </div>
                </li>
                <li>
                    <div class="home"><a href="index.html"><i class="icon-home"></i>Home</a> </div>
                </li>
                <li><a href="#">Pages</a>
                    <ul>
                        <li><a href="grid.html">Grid</a></li>
                        <li> <a href="list.html">List</a></li>
                        <li> <a href="product_detail.html">Product Detail</a></li>
                        <li> <a href="shopping_cart.html">Shopping Cart</a></li>
                        <li><a href="checkout.html">Checkout</a>
                            <ul>
                                <li><a href="checkout_method.html">Checkout Method</a></li>
                                <li><a href="checkout_billing_info.html">Checkout Billing Info</a></li>
                            </ul>
                        </li>
                        <li> <a href="wishlist.html">Wishlist</a></li>
                        <li> <a href="dashboard.html">Dashboard</a></li>
                        <li> <a href="multiple_addresses.html">Multiple Addresses</a></li>
                        <li> <a href="about_us.html">About Us</a></li>
                        <li> <a href="compare.html">Compare</a></li>
                        <li> <a href="delivery.html">Delivery</a></li>
                        <li> <a href="faq.html">FAQ</a></li>
                        <li> <a href="quick_view.html">Quick View</a></li>
                        <li> <a href="newsletter.html">Newsletter</a></li>
                        <li> <a href="contact_us.html">Contact Us</a></li>
                        <li> <a href="sitemap.html">Sitemap</a></li>
                        <li><a href="blog.html">Blog</a>
                            <ul>
                                <li><a href="blog_detail.html">Blog Detail</a></li>
                            </ul>
                        </li>
                        <li><a href="contact-us.html">Contact us</a></li>
                        <li><a href="404error.html">404 Error Page</a></li>
                    </ul>
                </li>
                <li><a href="#">Women</a>
                    <ul>
                        <li> <a href="grid.html" class="">Stylish Bag</a>
                            <ul>
                                <li> <a href="grid.html" class="">Clutch Handbags</a></li>
                                <li> <a href="grid.html" class="">Diaper Bags</a></li>
                                <li> <a href="grid.html" class="">Bags</a></li>
                                <li> <a href="grid.html" class="">Hobo handbags</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Material Bag</a>
                            <ul>
                                <li> <a href="grid.html">Beaded Handbags</a></li>
                                <li> <a href="grid.html">Fabric Handbags</a></li>
                                <li> <a href="grid.html">Handbags</a></li>
                                <li> <a href="grid.html">Leather Handbags</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Shoes</a>
                            <ul>
                                <li> <a href="grid.html">Flat Shoes</a></li>
                                <li> <a href="grid.html">Flat Sandals</a></li>
                                <li> <a href="grid.html">Boots</a></li>
                                <li> <a href="grid.html">Heels</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Jwellery</a>
                            <ul>
                                <li> <a href="grid.html">Bracelets</a></li>
                                <li> <a href="grid.html">Necklaces &amp; Pendent</a></li>
                                <li> <a href="grid.html">Pendants</a></li>
                                <li> <a href="grid.html">Pins &amp; Brooches</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Dresses</a>
                            <ul>
                                <li> <a href="grid.html">Casual Dresses</a></li>
                                <li> <a href="grid.html">Evening</a></li>
                                <li> <a href="grid.html">Designer</a></li>
                                <li> <a href="grid.html">Party</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Swimwear</a>
                            <ul>
                                <li> <a href="grid.html">Swimsuits</a></li>
                                <li> <a href="grid.html">Beach Clothing</a></li>
                                <li> <a href="grid.html">Clothing</a></li>
                                <li> <a href="grid.html">Bikinis</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Men</a>
                    <ul>
                        <li> <a href="grid.html" class="">Shoes</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="grid.html">Sport Shoes</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Casual Shoes</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Leather Shoes</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">canvas shoes</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Dresses</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="grid.html">Casual Dresses</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Evening</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Designer</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Party</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Jackets</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="grid.html">Coats</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Formal Jackets</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Leather Jackets</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Blazers</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Watches</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="grid.html">Fasttrack</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Casio</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Titan</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Tommy-Hilfiger</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Sunglasses</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="grid.html">Ray Ban</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Fasttrack</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Police</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Oakley</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Accesories</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="grid.html">Backpacks</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Wallets</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Laptops Bags</a></li>
                                <li class="level2 nav-6-1-1"><a href="grid.html">Belts</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Electronics</a>
                    <ul>
                        <li> <a href="grid.html"><span>Mobiles</span></a>
                            <ul>
                                <li> <a href="grid.html"><span>Samsung</span></a></li>
                                <li> <a href="grid.html"><span>Nokia</span></a></li>
                                <li> <a href="grid.html"><span>IPhone</span></a></li>
                                <li> <a href="grid.html"><span>Sony</span></a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html" class=""><span>Accesories</span></a>
                            <ul>
                                <li> <a href="grid.html"><span>Mobile Memory Cards</span></a></li>
                                <li> <a href="grid.html"><span>Cases &amp; Covers</span></a></li>
                                <li> <a href="grid.html"><span>Mobile Headphones</span></a></li>
                                <li> <a href="grid.html"><span>Bluetooth Headsets</span></a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html"><span>Cameras</span></a>
                            <ul>
                                <li> <a href="grid.html"><span>Camcorders</span></a></li>
                                <li> <a href="grid.html"><span>Point &amp; Shoot</span></a></li>
                                <li> <a href="grid.html"><span>Digital SLR</span></a></li>
                                <li> <a href="grid.html"><span>Camera Accesories</span></a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html"><span>Audio &amp; Video</span></a>
                            <ul>
                                <li> <a href="grid.html"><span>MP3 Players</span></a></li>
                                <li> <a href="grid.html"><span>IPods</span></a></li>
                                <li> <a href="grid.html"><span>Speakers</span></a></li>
                                <li> <a href="grid.html"><span>Video Players</span></a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html"><span>Computer</span></a>
                            <ul>
                                <li> <a href="grid.html"><span>External Hard Disk</span></a></li>
                                <li> <a href="grid.html"><span>Pendrives</span></a></li>
                                <li> <a href="grid.html"><span>Headphones</span></a></li>
                                <li> <a href="grid.html"><span>PC Components</span></a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html"><span>Appliances</span></a>
                            <ul>
                                <li> <a href="grid.html"><span>Vaccum Cleaners</span></a></li>
                                <li> <a href="grid.html"><span>Indoor Lighting</span></a></li>
                                <li> <a href="grid.html"><span>Kitchen Tools</span></a></li>
                                <li> <a href="grid.html"><span>Water Purifier</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Furniture</a>
                    <ul>
                        <li> <a href="grid.html">Living Room</a>
                            <ul>
                                <li> <a href="grid.html">Racks &amp; Cabinets</a></li>
                                <li> <a href="grid.html">Sofas</a></li>
                                <li> <a href="grid.html">Chairs</a></li>
                                <li> <a href="grid.html">Tables</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html" class="">Dining &amp; Bar</a>
                            <ul>
                                <li> <a href="grid.html">Dining Table Sets</a></li>
                                <li> <a href="grid.html">Serving Trolleys</a></li>
                                <li> <a href="grid.html">Bar Counters</a></li>
                                <li> <a href="grid.html">Dining Cabinets</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Bedroom</a>
                            <ul>
                                <li> <a href="grid.html">Beds</a></li>
                                <li> <a href="grid.html">Chest of Drawers</a></li>
                                <li> <a href="grid.html">Wardrobes &amp; Almirahs</a></li>
                                <li> <a href="grid.html">Nightstands</a></li>
                            </ul>
                        </li>
                        <li> <a href="grid.html">Kitchen</a>
                            <ul>
                                <li> <a href="grid.html">Kitchen Racks</a></li>
                                <li> <a href="grid.html">Kitchen Fillings</a></li>
                                <li> <a href="grid.html">Wall Units</a></li>
                                <li> <a href="grid.html">Benches &amp; Stools</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Kids</a></li>
                <li><a href="contact-us.html">Contact Us</a></li>
            </ul>
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
                  DATE: Fri Mar 25 02:50:20 CET 2016
                  SOURCE: E:/namjestaj/app/views/main.scala.html
                  HASH: 84662628ca740d0b6bcfc4666d7fc50c9be5a414
                  MATRIX: 807->34|988->120|1016->122|1859->938|1874->944|1949->998|2080->1102|2095->1108|2167->1158|2208->1289|2245->1299|2318->1345|2333->1351|2399->1395|2496->1465|2511->1471|2579->1517|2665->1576|2680->1582|2751->1631|2836->1689|2851->1695|2919->1741|3004->1799|3019->1805|3093->1857|3178->1915|3193->1921|3270->1976|3355->2034|3370->2040|3434->2082|3530->2151|3545->2157|3614->2204|4207->2770|4222->2776|4289->2822|4374->2880|4389->2886|4460->2935|4545->2993|4560->2999|4625->3043|4710->3101|4725->3107|4791->3152|4876->3210|4891->3216|4954->3258|5039->3316|5054->3322|5131->3377|5216->3435|5231->3441|5305->3493|5390->3551|5405->3557|5485->3615|5570->3673|5585->3679|5652->3725|5775->3820|5804->3821|5846->3835|5916->3877|5945->3878|5991->3896|8124->6000|8154->6001|8194->6013|8224->6014|8320->6082|8336->6088|8412->6141|8500->6201|8516->6207|8589->6257|8683->6323|8699->6329|8769->6376|9125->6735|9173->6870|9221->7008|9264->7032|9313->7052|9394->7131|9445->7153|9709->7389|9725->7395|9768->7415|9826->7444|9843->7450|9902->7486|17010->14565|17027->14571|17092->14613|17261->14753|17278->14759|17343->14801|24255->21684|24272->21690|24344->21739|24772->22138|24789->22144|24861->22193|25289->22592|25306->22598|25378->22647|25821->23061|25838->23067|25910->23116|33099->30276|33116->30282|33185->30328|33598->30712|33615->30718|33684->30764|34095->31146|34112->31152|34181->31198|34609->31597|34626->31603|34695->31649|39801->36726|39818->36732|39889->36780|41122->37985|41138->37991|41204->38034|41859->38661|41875->38667|41941->38710|42609->39350|42625->39356|42691->39399|43351->40031|43367->40037|43433->40080|43744->40363|43777->40386|43817->40387|43884->40425|43957->40470|43973->40476|44020->40500|44123->40583|44137->40588|44177->40589|44244->40628|44315->40689|44356->40690|44427->40732|44509->40786|44531->40797|44559->40802|44755->40970|44771->40976|44836->41018|44985->41139|45001->41145|45053->41174|45200->41293|45216->41299|45254->41314|45441->41481|45455->41486|45495->41487|45566->41530|45637->41590|45679->41592|45754->41638|45847->41702|45869->41713|45897->41718|46101->41894|46118->41900|46182->41941|46454->42185|46470->42191|46508->42206|46719->42385|46790->42424|46857->42459|46920->42493|47670->43224|47713->43238|47798->43325|47845->43371|47897->43486|47944->43514|47991->43566|48042->43615|48097->43649|48156->43687|48219->43750|48286->43822|48353->43922|48416->43966|48475->44005|48534->44043|48597->44106|48664->44180|48731->44274|48794->44318|48853->44357|48912->44395|48975->44458|49042->44530|49109->44619|49172->44663|49231->44702|49290->44753|49353->44816|49420->44889|49487->44980|49550->45024|49609->45063|49664->45098|49715->45130|49762->45158|49805->45182|49851->45200|49880->45207|49927->45225|53392->48662|53408->48668|53473->48711
                  LINES: 30->2|35->2|36->3|55->22|55->22|55->22|57->24|57->24|57->24|58->25|59->26|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|74->41|74->41|74->41|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|84->51|84->51|85->52|85->52|85->52|86->53|152->119|152->119|153->120|153->120|155->122|155->122|155->122|157->124|157->124|157->124|158->125|158->125|158->125|168->135|169->136|170->137|171->138|173->140|175->142|176->143|179->146|179->146|179->146|179->146|179->146|179->146|248->215|248->215|248->215|249->216|249->216|249->216|314->281|314->281|314->281|318->285|318->285|318->285|322->289|322->289|322->289|326->293|326->293|326->293|394->361|394->361|394->361|398->365|398->365|398->365|402->369|402->369|402->369|406->373|406->373|406->373|454->421|454->421|454->421|468->435|468->435|468->435|476->443|476->443|476->443|484->451|484->451|484->451|492->459|492->459|492->459|498->465|498->465|498->465|499->466|499->466|499->466|499->466|500->467|500->467|500->467|501->468|501->468|501->468|502->469|502->469|502->469|502->469|504->471|504->471|504->471|505->472|505->472|505->472|506->473|506->473|506->473|509->476|509->476|509->476|510->477|510->477|510->477|511->478|511->478|511->478|511->478|513->480|513->480|513->480|515->482|515->482|515->482|518->485|519->486|520->487|521->488|532->499|533->500|536->503|537->504|538->505|539->506|540->507|541->508|542->509|543->510|544->511|545->512|546->513|547->514|548->515|549->516|550->517|551->518|552->519|553->520|554->521|555->522|556->523|557->524|558->525|559->526|560->527|561->528|562->529|563->530|564->531|565->532|566->533|567->534|568->535|569->536|570->537|572->539|572->539|573->540|626->593|626->593|626->593
                  -- GENERATED --
              */
          