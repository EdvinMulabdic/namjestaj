
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
                            <li class="mega-menu"><a href="" class="level-top"><span>Women</span></a>
                                <div class="level0-wrapper dropdown-6col">
                                    <div class="container">
                                        <div class="level0-wrapper2">
                                            <div class="col-1">
                                                <div class="nav-block nav-block-center">
                                                    <ul class="level0">
                                                        <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                            Stylish Bag</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href="" class=""><span>
                                                                    Clutch Handbags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="" class=""><span>
                                                                    Diaper Bags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="" class=""><span>
                                                                    Bags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href="" class=""><span>
                                                                    Hobo handbags</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                            Material Bag</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Beaded Handbags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Fabric Handbags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Handbags</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Leather Handbags</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                            Shoes</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Flat Shoes</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Flat Sandals</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Boots</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Heels</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                            Jwellery</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Bracelets</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Necklaces &amp; Pendent</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Pendants</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Pins &amp; Brooches</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                            Dresses</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Casual Dresses</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Evening</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Designer</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Party</span></a></li>
                                                            </ul>
                                                        </li>
                                                        <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                            Swimwear</span></a>
                                                            <ul class="level1">
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Swimsuits</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Beach Clothing</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Clothing</span></a></li>
                                                                <li class="level2 nav-6-1-1"><a href=""><span>
                                                                    Bikinis</span></a></li>
                                                            </ul>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                                <!--nav-block nav-block-center-->
                                            <div class="col-2">
                                                <div class="menu_image"><a href="#" title=""><img src='"""),_display_(/*250.105*/routes/*250.111*/.Assets.versioned("images/menu_image.jpg")),format.raw/*250.153*/("""' alt="menu_image"></a></div>
                                                <div class="menu_image1"><a href="#" title=""><img src='"""),_display_(/*251.106*/routes/*251.112*/.Assets.versioned("images/menu_image.jpg")),format.raw/*251.154*/("""' alt="menu_image"></a></div>
                                            </div>
                                        </div>
                                            <!--level0-wrapper2--> </div>
                                </div>
                            </li>
                            <li class="mega-menu"><a href="" class="level-top"><span>Men</span></a>
                                <div class="level0-wrapper dropdown-6col">
                                    <div class="container">
                                        <div class="level0-wrapper2">
                                            <div class="nav-block nav-block-center">
                                                <ul class="level0">
                                                    <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                        Shoes</span></a>
                                                        <ul class="level1">
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Sport Shoes</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Casual Shoes</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Leather Shoes</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                canvas shoes</span></a></li>
                                                        </ul>
                                                    </li>
                                                    <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                        Dresses</span></a>
                                                        <ul class="level1">
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Casual Dresses</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Evening</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Designer</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Party</span></a></li>
                                                        </ul>
                                                    </li>
                                                    <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                        Jackets</span></a>
                                                        <ul class="level1">
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Coats</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Formal Jackets</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Leather Jackets</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Blazers</span></a></li>
                                                        </ul>
                                                    </li>
                                                    <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                        Watches</span></a>
                                                        <ul class="level1">
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Fasttrack</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Casio</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Titan</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Tommy-Hilfiger</span></a></li>
                                                        </ul>
                                                    </li>
                                                    <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                        Sunglasses</span></a>
                                                        <ul class="level1">
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Ray Ban</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Fasttrack</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Police</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Oakley</span></a></li>
                                                        </ul>
                                                    </li>
                                                    <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                        Accesories</span></a>
                                                        <ul class="level1">
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Backpacks</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Wallets</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Laptops Bags</span></a></li>
                                                            <li class="level2 nav-6-1-1"><a href=""><span>
                                                                Belts</span></a></li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </div>
                                                <!--level0-wrapper2-->
                                            <div class="nav-add">
                                                <div class="push_item">
                                                    <div class="push_img"><a href="#"><img alt="sunglass" src='"""),_display_(/*346.113*/routes/*346.119*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*346.168*/("""'></a></div>
                                                    <div class="push_text">
                                                        Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                                <div class="push_item">
                                                    <div class="push_img"><a href="#"><img alt="watch" src='"""),_display_(/*351.110*/routes/*351.116*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*351.165*/("""'></a></div>
                                                    <div class="push_text">
                                                        Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                                <div class="push_item">
                                                    <div class="push_img"><a href="#"><img alt="jeans" src='"""),_display_(/*356.110*/routes/*356.116*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*356.165*/("""'></a></div>
                                                    <div class="push_text">
                                                        Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                                <div class="push_item push_item_last">
                                                    <div class="push_img"><a href="#"><img alt="shoes" src='"""),_display_(/*361.110*/routes/*361.116*/.Assets.versioned("images/menu_man_sunglass.png")),format.raw/*361.165*/("""'></a></div>
                                                    <div class="push_text">
                                                        Lorem Ipsum is simply dummy text of the printing</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="mega-menu"><a href="" class="level-top"><span>KATEGORIJE</span></a>
                                <div class="level0-wrapper dropdown-6col">
                                    <div class="container">
                                        <div class="level0-wrapper2">
                                            <div class="nav-block nav-block-center">
                                                <ul class="level0">
                                                """),_display_(/*376.50*/for(category <- models.Category.findAllCategories()) yield /*376.102*/ {_display_(Seq[Any](format.raw/*376.104*/("""
                                                    """),format.raw/*377.53*/("""<li class="level1 nav-6-1 parent item"><a href=""""),_display_(/*377.102*/routes/*377.108*/.Items.getItemsWithCategory(category.id)),format.raw/*377.148*/(""""><span>
                                                        """),_display_(/*378.58*/category/*378.66*/.name),format.raw/*378.71*/("""</span>
                                                    </a>
                                                        <ul class="level1">
                                                            """),_display_(/*381.62*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*381.130*/ {_display_(Seq[Any](format.raw/*381.132*/("""
                                                                """),format.raw/*382.65*/("""<li class="level2 nav-6-1-1"><a href=""""),_display_(/*382.104*/routes/*382.110*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*382.156*/(""""><span>
                                                                """),_display_(/*383.66*/subcategory/*383.77*/.name),format.raw/*383.82*/("""</span></a>
                                                                </li>
                                                            """)))}),format.raw/*385.62*/("""
                                                        """),format.raw/*386.57*/("""</ul>
                                                    </li>
                                                """)))}),format.raw/*388.50*/("""

                                                """),format.raw/*390.49*/("""</ul>
                                            </div>
                                        </div>
                                            <!--level0-wrapper2-->
                                        <div class="nav-add">
                                            <div class="push_item">
                                                <div class="push_img"><a href="#"><img alt="phone" src='"""),_display_(/*396.106*/routes/*396.112*/.Assets.versioned("images/menu_ele_phone1.png")),format.raw/*396.159*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href="#"><img alt="camera" src='"""),_display_(/*401.107*/routes/*401.113*/.Assets.versioned("images/menu_ele_phone2.png")),format.raw/*401.160*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                            <div class="push_item">
                                                <div class="push_img"><a href="#"><img alt="ipod" src='"""),_display_(/*406.105*/routes/*406.111*/.Assets.versioned("images/menu_ele_phone3.png")),format.raw/*406.158*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                            <div class="push_item push_item_last">
                                                <div class="push_img"><a href="#"><img alt="laptop" src='"""),_display_(/*411.107*/routes/*411.113*/.Assets.versioned("images/menu_ele_phone4.png")),format.raw/*411.160*/("""'></a></div>
                                                <div class="push_text">
                                                    Lorem Ipsum is simply dummy text of the printing</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="nav-custom-link mega-menu"><a class="level-top" href="#"><span>Custom</span></a>
                                <div class="level0-wrapper custom-menu">
                                    <div class="header-nav-dropdown-wrapper clearer">
                                        <div class="grid12-3">
                                            <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                            <div class="heart-icon">&nbsp;</div>
                                            <p>Our designed to deliver almost everything you want to do online.</p>
                                            <div><img src='"""),_display_(/*426.61*/routes/*426.67*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*426.110*/("""' alt=""></div>
                                        </div>
                                        <div class="grid12-3">
                                            <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                            <a href="#">
                                                <div class="icon-star"></div>
                                            </a>
                                            <p>Responsive design is a Web design to provide an optimal navigation.</p>
                                            <div><img src='"""),_display_(/*434.61*/routes/*434.67*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*434.110*/("""' alt=""></div>
                                        </div>
                                        <div class="grid12-3">
                                            <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                            <a href="#">
                                                <div class="custom-icon"></div>
                                            </a>
                                            <p>Our font delivery service is built upon a reliable, global network of servers.</p>
                                            <div><img src='"""),_display_(/*442.61*/routes/*442.67*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*442.110*/("""' alt=""></div>
                                        </div>
                                        <div class="grid12-3">
                                            <h4 class="heading">GET 20% OFF, 48 HOURS ONLY!</h4>
                                            <a href="#">
                                                <div class="icon-custom-grid"></div>
                                            </a>
                                            <p>Smart Product Grid is uses maximum available width of the screen.</p>
                                            <div><img src='"""),_display_(/*450.61*/routes/*450.67*/.Assets.versioned("images/custom-img1.jpg")),format.raw/*450.110*/("""' alt=""></div>
                                        </div>
                                        <br>
                                    </div>
                                </div>
                            </li>
                            """),_display_(/*456.30*/if(currentUser == null)/*456.53*/ {_display_(Seq[Any](format.raw/*456.55*/("""
                                """),format.raw/*457.33*/("""<li class="level0 nav-8 level-top"><a href=""""),_display_(/*457.78*/routes/*457.84*/.Login.loginPageRender()),format.raw/*457.108*/("""" class="level-top"><span>
                                    Log In</span></a></li>
                            """)))}/*459.31*/else/*459.36*/{_display_(Seq[Any](format.raw/*459.37*/("""
                                """),_display_(/*460.34*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*460.95*/ {_display_(Seq[Any](format.raw/*460.97*/("""
                                    """),format.raw/*461.37*/("""<li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*461.96*/currentUser/*461.107*/.name),format.raw/*461.112*/("""</span></a>
                                        <div class="level0-wrapper dropdown-6col">
                                            <div class="container">
                                                <div class="level0-wrapper2">
                                                    <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                        <ul class="level0">
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                ADMIN PANEL</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*470.111*/routes/*470.117*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*470.159*/(""""><span>
                                                                    Admin Panel</span></a></li>
                                                                    <li class="level1 first parent"><a href=""""),_display_(/*472.111*/routes/*472.117*/.Items.allItems()),format.raw/*472.134*/(""""><span>
                                                                        Lista proizvoda</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KORISNICI</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*479.105*/routes/*479.111*/.AppUsers.listOfUsersRender()),format.raw/*479.140*/(""""><span>
                                                                    Lista korisnika</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*481.105*/routes/*481.111*/.AppUsers.createUserRender()),format.raw/*481.139*/(""""><span>
                                                                        Dodaj korisnika</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                KATEGORIJE</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*488.105*/routes/*488.111*/.Categories.listOfCategories()),format.raw/*488.141*/(""""><span>
                                                                        Lista kategorija</span></a></li>
                                                                    <li class="level1 parent"><a href=""""),_display_(/*490.105*/routes/*490.111*/.Categories.createCategoryRender()),format.raw/*490.145*/(""""><span>
                                                                        Dodaj kategoriju</span></a></li>
                                                                </ul>
                                                            </li>
                                                            <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                               LOGOUT</span></a>
                                                                <ul class="level1">
                                                                    <li class="level1 parent"><a href=""""),_display_(/*497.105*/routes/*497.111*/.Login.logout()),format.raw/*497.126*/(""""><span>
                                                                    Logout</span></a></li>
                                                                </ul>
                                                            </li>

                                                        </ul>
                                                    </div>
                                                        <!--nav-block nav-block-center-->
                                                    <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*505.128*/routes/*505.134*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*505.179*/("""' alt="furniture"></a> </div>
                                                        <!--nav-block nav-block-right std grid12-4-->
                                                </div>
                                            </div>
                                                <!--level0-wrapper2-->
                                        </div>
                                    </li>
                                """)))}/*512.35*/else/*512.40*/{_display_(Seq[Any](format.raw/*512.41*/("""
                                    """),_display_(/*513.38*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*513.98*/ {_display_(Seq[Any](format.raw/*513.100*/("""
                                        """),format.raw/*514.41*/("""<li class="mega-menu"><a class="level-top" href="#"><span>"""),_display_(/*514.100*/currentUser/*514.111*/.name),format.raw/*514.116*/("""</span></a>
                                            <div class="level0-wrapper dropdown-6col">
                                                <div class="container">
                                                    <div class="level0-wrapper2">
                                                        <div class="nav-block nav-block-center grid12-8 itemgrid itemgrid-4col">
                                                            <ul class="level0">
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    Krisnički panel</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*523.115*/routes/*523.121*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*523.162*/(""""><span>
                                                                            Korisnički panel</span></a></li>
                                                                        <li class="level1 first parent"><a href=""""),_display_(/*525.115*/routes/*525.121*/.AppUsers.updateUserInformationsRender(currentUser.id)),format.raw/*525.175*/(""""><span>
                                                                            Ažuriraj podatke</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    OBJEKTI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*532.109*/routes/*532.115*/.Stores.listOfStores(currentUser.id)),format.raw/*532.151*/(""""><span>
                                                                            Lista objekata</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*534.109*/routes/*534.115*/.Stores.createStoreRender(currentUser.id)),format.raw/*534.156*/(""""><span>
                                                                            Dodaj objekat</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href="" class=""><span>
                                                                    PROIZVODI</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*541.109*/routes/*541.115*/.Items.listOfItems(currentUser.id)),format.raw/*541.149*/(""""><span>
                                                                            Lista proizvoda</span></a></li>
                                                                        <li class="level1 parent"><a href=""""),_display_(/*543.109*/routes/*543.115*/.Items.createItemRender(currentUser.id)),format.raw/*543.154*/(""""><span>
                                                                            Dodaj proizvod</span></a></li>
                                                                    </ul>
                                                                </li>
                                                                <li class="level1 nav-6-1 parent item"><a href=""><span>
                                                                    LOGOUT</span></a>
                                                                    <ul class="level1">
                                                                        <li class="level1 parent"><a href=""""),_display_(/*550.109*/routes/*550.115*/.Login.logout()),format.raw/*550.130*/(""""><span>
                                                                            Logout</span></a></li>
                                                                    </ul>
                                                                </li>

                                                            </ul>
                                                        </div>
                                                            <!--nav-block nav-block-center-->
                                                        <div class="nav-block nav-block-right std grid12-4"><a href="#"><img src='"""),_display_(/*558.132*/routes/*558.138*/.Assets.versioned("images/navbarPicture.jpg")),format.raw/*558.183*/("""' alt="furniture"></a> </div>
                                                            <!--nav-block nav-block-right std grid12-4-->
                                                    </div>
                                                </div>
                                                    <!--level0-wrapper2-->
                                            </div>
                                        </li>
                                    """)))}),format.raw/*565.38*/("""
                                """)))}),format.raw/*566.34*/("""
                            """)))}),format.raw/*567.30*/("""
                                """),format.raw/*568.33*/("""<!-- Search-col -->
                            <div class="search-box pull-right">
                                <form action="cat" method="POST" id="search_mini_form" name="Categories">
                                    <input type="text" placeholder="Search entire store here..."  maxlength="70" name="search" id="search" >
                                    <button type="button" class="search-btn-bg"><span class="fa fa-search"></span>&nbsp;</button>
                                </form>
                            </div>
                                <!-- End Search-col -->
                        </ul>
                    </div>
                </div>
                """),format.raw/*579.27*/("""
            """),format.raw/*580.13*/("""</nav>
                <!-- end nav -->

                <!-------------------------------------------- CONTENT --------------------------------------------->
            <div style="margin-top: 60px">
                """),_display_(/*585.18*/content),format.raw/*585.25*/("""
            """),format.raw/*586.13*/("""</div>

                <!-- Footer -->
            <footer>
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 col-lg-9">
                                <div class="footer-column pull-left">
                                    <h4>Shopping Guide</h4>
                                    <ul class="links">
                                        <li class="first"><a href="#" title="How to buy">How to buy</a></li>
                                        <li><a href=""""),_display_(/*598.55*/routes/*598.61*/.Application.faqRender()),format.raw/*598.85*/("""" title="FAQs">FAQs</a></li>
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
                                        <li><a href=""""),_display_(/*618.55*/routes/*618.61*/.ContactUs.contactUsRender()),format.raw/*618.89*/("""" title="Contact Us">
                                            Contact Us</a></li>
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
                """),format.raw/*639.48*/("""
                    """),format.raw/*640.48*/("""
                        """),format.raw/*641.46*/("""
                            """),format.raw/*642.113*/("""
                            """),format.raw/*643.42*/("""
                                """),format.raw/*644.72*/("""
                                """),format.raw/*645.116*/("""
                                """),format.raw/*646.124*/("""
                            """),format.raw/*647.43*/("""
                        """),format.raw/*648.35*/("""
                    """),format.raw/*649.31*/("""
                """),format.raw/*650.27*/("""
                """),format.raw/*651.17*/("""<div class="footer-bottom">
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
                        <form name="search">
                            <div class="input-group">
                                <div class="input-group-btn">
                                    <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
                                </div>
                                <input type="text" class="form-control simple" placeholder="Search ..." name="srch-term" id="srch-term">
                            </div>
                        </form>
                    </div>
                </li>
                <li><a href="#">Women</a>
                    <ul>
                        <li> <a href="" class="">Stylish Bag</a>
                            <ul>
                                <li> <a href="" class="">Clutch Handbags</a></li>
                                <li> <a href="" class="">Diaper Bags</a></li>
                                <li> <a href="" class="">Bags</a></li>
                                <li> <a href="" class="">Hobo handbags</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Material Bag</a>
                            <ul>
                                <li> <a href="">Beaded Handbags</a></li>
                                <li> <a href="">Fabric Handbags</a></li>
                                <li> <a href="">Handbags</a></li>
                                <li> <a href="">Leather Handbags</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Shoes</a>
                            <ul>
                                <li> <a href="">Flat Shoes</a></li>
                                <li> <a href="">Flat Sandals</a></li>
                                <li> <a href="">Boots</a></li>
                                <li> <a href="">Heels</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Jwellery</a>
                            <ul>
                                <li> <a href="">Bracelets</a></li>
                                <li> <a href="">Necklaces &amp; Pendent</a></li>
                                <li> <a href="">Pendants</a></li>
                                <li> <a href="">Pins &amp; Brooches</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Dresses</a>
                            <ul>
                                <li> <a href="">Casual Dresses</a></li>
                                <li> <a href="">Evening</a></li>
                                <li> <a href="">Designer</a></li>
                                <li> <a href="">Party</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Swimwear</a>
                            <ul>
                                <li> <a href="">Swimsuits</a></li>
                                <li> <a href="">Beach Clothing</a></li>
                                <li> <a href="">Clothing</a></li>
                                <li> <a href="">Bikinis</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Men</a>
                    <ul>
                        <li> <a href="" class="">Shoes</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="">Sport Shoes</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Casual Shoes</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Leather Shoes</a></li>
                                <li class="level2 nav-6-1-1"><a href="">canvas shoes</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Dresses</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="">Casual Dresses</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Evening</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Designer</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Party</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Jackets</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="">Coats</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Formal Jackets</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Leather Jackets</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Blazers</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Watches</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="">Fasttrack</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Casio</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Titan</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Tommy-Hilfiger</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Sunglasses</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="">Ray Ban</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Fasttrack</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Police</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Oakley</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Accesories</a>
                            <ul class="level1">
                                <li class="level2 nav-6-1-1"><a href="">Backpacks</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Wallets</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Laptops Bags</a></li>
                                <li class="level2 nav-6-1-1"><a href="">Belts</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Electronics</a>
                    <ul>
                        <li> <a href=""><span>Mobiles</span></a>
                            <ul>
                                <li> <a href=""><span>Samsung</span></a></li>
                                <li> <a href=""><span>Nokia</span></a></li>
                                <li> <a href=""><span>IPhone</span></a></li>
                                <li> <a href=""><span>Sony</span></a></li>
                            </ul>
                        </li>
                        <li> <a href="" class=""><span>Accesories</span></a>
                            <ul>
                                <li> <a href=""><span>Mobile Memory Cards</span></a></li>
                                <li> <a href=""><span>Cases &amp; Covers</span></a></li>
                                <li> <a href=""><span>Mobile Headphones</span></a></li>
                                <li> <a href=""><span>Bluetooth Headsets</span></a></li>
                            </ul>
                        </li>
                        <li> <a href=""><span>Cameras</span></a>
                            <ul>
                                <li> <a href=""><span>Camcorders</span></a></li>
                                <li> <a href=""><span>Point &amp; Shoot</span></a></li>
                                <li> <a href=""><span>Digital SLR</span></a></li>
                                <li> <a href=""><span>Camera Accesories</span></a></li>
                            </ul>
                        </li>
                        <li> <a href=""><span>Audio &amp; Video</span></a>
                            <ul>
                                <li> <a href=""><span>MP3 Players</span></a></li>
                                <li> <a href=""><span>IPods</span></a></li>
                                <li> <a href=""><span>Speakers</span></a></li>
                                <li> <a href=""><span>Video Players</span></a></li>
                            </ul>
                        </li>
                        <li> <a href=""><span>Computer</span></a>
                            <ul>
                                <li> <a href=""><span>External Hard Disk</span></a></li>
                                <li> <a href=""><span>Pendrives</span></a></li>
                                <li> <a href=""><span>Headphones</span></a></li>
                                <li> <a href=""><span>PC Components</span></a></li>
                            </ul>
                        </li>
                        <li> <a href=""><span>Appliances</span></a>
                            <ul>
                                <li> <a href=""><span>Vaccum Cleaners</span></a></li>
                                <li> <a href=""><span>Indoor Lighting</span></a></li>
                                <li> <a href=""><span>Kitchen Tools</span></a></li>
                                <li> <a href=""><span>Water Purifier</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">Furniture</a>
                    <ul>
                        <li> <a href="">Living Room</a>
                            <ul>
                                <li> <a href="">Racks &amp; Cabinets</a></li>
                                <li> <a href="">Sofas</a></li>
                                <li> <a href="">Chairs</a></li>
                                <li> <a href="">Tables</a></li>
                            </ul>
                        </li>
                        <li> <a href="" class="">Dining &amp; Bar</a>
                            <ul>
                                <li> <a href="">Dining Table Sets</a></li>
                                <li> <a href="">Serving Trolleys</a></li>
                                <li> <a href="">Bar Counters</a></li>
                                <li> <a href="">Dining Cabinets</a></li>
                            </ul>
                        </li>
                        <li> <a href="">Bedroom</a>
                            <ul>
                                <li> <a href="">Beds</a></li>
                                <li> <a href="">Chest of Drawers</a></li>
                                <li> <a href="">Wardrobes &amp; Almirahs</a></li>
                                <li> <a href="">Nightstands</a></li>
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
                <li><a href="">Contact Us</a></li>
                """),_display_(/*869.18*/if(currentUser == null)/*869.41*/ {_display_(Seq[Any](format.raw/*869.43*/("""
                    """),format.raw/*870.21*/("""<li><a href=""""),_display_(/*870.35*/routes/*870.41*/.Login.loginPageRender()),format.raw/*870.65*/("""" class="level-top"><span>Log In</span></a></li>
                """)))}/*871.19*/else/*871.24*/{_display_(Seq[Any](format.raw/*871.25*/("""
                    """),_display_(/*872.22*/if(currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*872.83*/ {_display_(Seq[Any](format.raw/*872.85*/("""
                        """),format.raw/*873.25*/("""<li><a href=""><span>"""),_display_(/*873.47*/currentUser/*873.58*/.name),format.raw/*873.63*/("""</span></a>
                            <ul>
                                <li><a href=""""),_display_(/*875.47*/routes/*875.53*/.AppUsers.adminPanelRender(currentUser.id)),format.raw/*875.95*/(""""><span>
                                    Admin Panel</span></a></li>
                                <li><a href=""""),_display_(/*877.47*/routes/*877.53*/.AppUsers.listOfUsersRender()),format.raw/*877.82*/(""""><span>Korisnici</span></a></li>
                                <li><a href=""""),_display_(/*878.47*/routes/*878.53*/.Login.logout()),format.raw/*878.68*/(""""><span>Logout</span></a></li>
                            </ul>
                        </li>
                    """)))}/*881.23*/else/*881.28*/{_display_(Seq[Any](format.raw/*881.29*/("""
                        """),_display_(/*882.26*/if(currentUser.userAccessLevel.equals(UserAccessLevel.USER))/*882.86*/ {_display_(Seq[Any](format.raw/*882.88*/("""
                            """),format.raw/*883.29*/("""<li><a href=""><span>"""),_display_(/*883.51*/currentUser/*883.62*/.name),format.raw/*883.67*/("""</span></a>
                                <ul>
                                    <li><a href=""""),_display_(/*885.51*/routes/*885.57*/.AppUsers.userPanelRender(currentUser.id)),format.raw/*885.98*/(""""><span>
                                        User Panel</span></a></li>
                                    <li><a href=""""),_display_(/*887.51*/routes/*887.57*/.Stores.listOfStores(currentUser.id)),format.raw/*887.93*/(""""><span>Objekti</span></a></li>
                                    <li><a href=""""),_display_(/*888.51*/routes/*888.57*/.Login.logout()),format.raw/*888.72*/(""""><span>Logout</span></a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*891.26*/("""
                    """)))}),format.raw/*892.22*/("""
                """)))}),format.raw/*893.18*/("""
            """),format.raw/*894.13*/("""</ul>
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
                  DATE: Thu Mar 31 17:19:43 CEST 2016
                  SOURCE: E:/namjestaj/app/views/main.scala.html
                  HASH: a26a057827b212cbeba81e4aa79e4769dcfac6ed
                  MATRIX: 807->33|988->119|1015->120|1838->916|1853->922|1928->976|2057->1078|2072->1084|2144->1134|2184->1264|2220->1273|2293->1319|2308->1325|2374->1369|2470->1438|2485->1444|2553->1490|2638->1548|2653->1554|2724->1603|2808->1660|2823->1666|2891->1712|2975->1769|2990->1775|3064->1827|3148->1884|3163->1890|3240->1945|3324->2002|3339->2008|3403->2050|3499->2119|3514->2125|3583->2172|4169->2731|4184->2737|4251->2783|4335->2840|4350->2846|4421->2895|4505->2952|4520->2958|4585->3002|4669->3059|4684->3065|4750->3110|4834->3167|4849->3173|4912->3215|4996->3272|5011->3278|5088->3333|5172->3390|5187->3396|5261->3448|5345->3505|5360->3511|5440->3569|5524->3626|5539->3632|5606->3678|5727->3771|5756->3772|5797->3785|5867->3827|5896->3828|5941->3845|8008->5883|8038->5884|8077->5895|8107->5896|8201->5962|8217->5968|8293->6021|8379->6079|8395->6085|8468->6135|8561->6200|8577->6206|8647->6253|8902->6580|8939->6589|9004->6626|9020->6632|9094->6683|9237->6829|9280->6959|9323->7092|9365->7115|9412->7133|9517->7237|9563->7254|9812->7475|9828->7481|9871->7501|9929->7530|9946->7536|10005->7572|18792->16330|18809->16336|18874->16378|19038->16513|19055->16519|19120->16561|27330->24742|27347->24748|27419->24797|27884->25233|27901->25239|27973->25288|28438->25724|28455->25730|28527->25779|29007->26230|29024->26236|29096->26285|30107->27268|30177->27320|30219->27322|30301->27375|30379->27424|30396->27430|30459->27470|30553->27536|30571->27544|30598->27549|30828->27751|30914->27819|30956->27821|31050->27886|31118->27925|31135->27931|31204->27977|31306->28051|31327->28062|31354->28067|31529->28210|31615->28267|31760->28380|31839->28430|32274->28836|32291->28842|32361->28889|32807->29306|32824->29312|32894->29359|33338->29774|33355->29780|33425->29827|33886->30259|33903->30265|33973->30312|35103->31414|35119->31420|35185->31463|35799->32049|35815->32055|35881->32098|36508->32697|36524->32703|36590->32746|37209->33337|37225->33343|37291->33386|37572->33639|37605->33662|37646->33664|37708->33697|37781->33742|37797->33748|37844->33772|37979->33888|37993->33893|38033->33894|38095->33928|38166->33989|38207->33991|38273->34028|38360->34087|38382->34098|38410->34103|39279->34943|39296->34949|39361->34991|39605->35206|39622->35212|39662->35229|40339->35877|40356->35883|40408->35912|40650->36125|40667->36131|40718->36159|41396->36808|41413->36814|41466->36844|41713->37062|41730->37068|41787->37102|42452->37738|42469->37744|42507->37759|43111->38334|43128->38340|43196->38385|43647->38817|43661->38822|43701->38823|43767->38861|43837->38921|43879->38923|43949->38964|44037->39023|44059->39034|44087->39039|44996->39919|45013->39925|45077->39966|45338->40198|45355->40204|45432->40258|46136->40933|46153->40939|46212->40975|46465->41199|46482->41205|46546->41246|47249->41920|47266->41926|47323->41960|47577->42185|47594->42191|47656->42230|48348->42893|48365->42899|48403->42914|49039->43521|49056->43527|49124->43572|49615->44031|49681->44065|49743->44095|49805->44128|50522->44826|50564->44839|50811->45058|50840->45065|50882->45078|51519->45687|51535->45693|51581->45717|53134->47242|53150->47248|53200->47276|54369->48447|54419->48495|54473->48541|54532->48654|54590->48696|54652->48768|54715->48884|54778->49008|54836->49051|54890->49086|54940->49117|54986->49144|55032->49161|67318->61419|67351->61442|67392->61444|67442->61465|67484->61479|67500->61485|67546->61509|67632->61576|67646->61581|67686->61582|67736->61604|67807->61665|67848->61667|67902->61692|67952->61714|67973->61725|68000->61730|68119->61821|68135->61827|68199->61869|68346->61988|68362->61994|68413->62023|68521->62103|68537->62109|68574->62124|68710->62241|68724->62246|68764->62247|68818->62273|68888->62333|68929->62335|68987->62364|69037->62386|69058->62397|69085->62402|69212->62501|69228->62507|69291->62548|69445->62674|69461->62680|69519->62716|69629->62798|69645->62804|69682->62819|69842->62947|69896->62969|69946->62987|69988->63000
                  LINES: 30->2|35->2|36->3|55->22|55->22|55->22|57->24|57->24|57->24|58->25|59->26|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|74->41|74->41|74->41|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|84->51|84->51|85->52|85->52|85->52|86->53|152->119|152->119|153->120|153->120|155->122|155->122|155->122|157->124|157->124|157->124|158->125|158->125|158->125|163->130|164->131|164->131|164->131|164->131|173->140|174->141|175->142|176->143|178->145|180->147|181->148|184->151|184->151|184->151|184->151|184->151|184->151|283->250|283->250|283->250|284->251|284->251|284->251|379->346|379->346|379->346|384->351|384->351|384->351|389->356|389->356|389->356|394->361|394->361|394->361|409->376|409->376|409->376|410->377|410->377|410->377|410->377|411->378|411->378|411->378|414->381|414->381|414->381|415->382|415->382|415->382|415->382|416->383|416->383|416->383|418->385|419->386|421->388|423->390|429->396|429->396|429->396|434->401|434->401|434->401|439->406|439->406|439->406|444->411|444->411|444->411|459->426|459->426|459->426|467->434|467->434|467->434|475->442|475->442|475->442|483->450|483->450|483->450|489->456|489->456|489->456|490->457|490->457|490->457|490->457|492->459|492->459|492->459|493->460|493->460|493->460|494->461|494->461|494->461|494->461|503->470|503->470|503->470|505->472|505->472|505->472|512->479|512->479|512->479|514->481|514->481|514->481|521->488|521->488|521->488|523->490|523->490|523->490|530->497|530->497|530->497|538->505|538->505|538->505|545->512|545->512|545->512|546->513|546->513|546->513|547->514|547->514|547->514|547->514|556->523|556->523|556->523|558->525|558->525|558->525|565->532|565->532|565->532|567->534|567->534|567->534|574->541|574->541|574->541|576->543|576->543|576->543|583->550|583->550|583->550|591->558|591->558|591->558|598->565|599->566|600->567|601->568|612->579|613->580|618->585|618->585|619->586|631->598|631->598|631->598|651->618|651->618|651->618|672->639|673->640|674->641|675->642|676->643|677->644|678->645|679->646|680->647|681->648|682->649|683->650|684->651|902->869|902->869|902->869|903->870|903->870|903->870|903->870|904->871|904->871|904->871|905->872|905->872|905->872|906->873|906->873|906->873|906->873|908->875|908->875|908->875|910->877|910->877|910->877|911->878|911->878|911->878|914->881|914->881|914->881|915->882|915->882|915->882|916->883|916->883|916->883|916->883|918->885|918->885|918->885|920->887|920->887|920->887|921->888|921->888|921->888|924->891|925->892|926->893|927->894
                  -- GENERATED --
              */
          