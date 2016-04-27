
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import helpers.UserAccessLevel

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<script type="text/javascript" src=""""),_display_(/*3.42*/routes/*3.48*/.Assets.versioned("javascripts/lastTenProducts.js")),format.raw/*3.99*/(""""></script>

    <!-- Slider -->
    <div id="magik-slideshow" class="magik-slideshow">
        <div class="container">
            <div class="row wow bounceInUp animated animated animated" style="visibility: visible">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12" id="main-categories">
                    <div class="side-nav-categories">
                        <div class="block-title"> Kategorije </div>
                            <!--block-title-->
                            <!-- BEGIN BOX-CATEGORY -->
                        <div class="box-content box-category">
                            <ul>
                                <li> <a href="">NAMEŠTAJ</a><span class="subDropdown plus"></span>
                                    <ul class="level0_455">
                                    """),_display_(/*18.38*/for(category <- models.Category.findAllCategories()) yield /*18.90*/ {_display_(Seq[Any](format.raw/*18.92*/("""
                                        """),format.raw/*19.41*/("""<li> <a href=""""),_display_(/*19.56*/routes/*19.62*/.Items.getItemsWithSubCategory(category.id)),format.raw/*19.105*/(""""> """),_display_(/*19.109*/category/*19.117*/.name),format.raw/*19.122*/(""" """),format.raw/*19.123*/("""</a></li>
                                    """)))}),format.raw/*20.38*/("""
                                    """),format.raw/*21.37*/("""</ul>
                                        <!--level0-->
                                </li>

                                <li> <a href="">AKCIJA</a></li>
                                <li> <a href="">TOP PONUDA</a></li>
                                <li> <a href="">IDEJE</a></li>
                                <li> <a href="">VIJESTI</a></li>
                                <li> <a href="">PARTNERI</a></li>
                            </ul>
                        </div>
                            <!--box-content box-category-->
                    </div>
                </div>
                <div class="col-lg-9 col-sm-12 col-md-8 bounceInUp animated">
                    <div style="position:relative;width:100%;height:auto;margin-top:0px;margin-bottom:0px">
                        <div id='rev_slider_4_wrapper' class='rev_slider_wrapper fullwidthbanner-container' >
                            <div id='rev_slider_4' class='rev_slider fullwidthabanner'>
                                <ul>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*40.123*/routes/*40.129*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*40.171*/("""'><img src='"""),_display_(/*40.184*/routes/*40.190*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*40.232*/("""' data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat' alt="" />
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft  tp-resizeme ' data-x='0'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;'><span>New Season</span></div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='0'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3; max-width:auto;max-height:auto;white-space:nowrap;'><span>Summer Sale</span></div>
                                            <div class='tp-caption sfb  tp-resizeme ' data-x='0'  data-y='410'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Shop Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='0'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">In augue urna, nunc, tincidunt, augue, augue facilisis facilisis</h4></div>
                                        </div>
                                    </li>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*48.123*/routes/*48.129*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*48.171*/("""'><img src='"""),_display_(/*48.184*/routes/*48.190*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*48.232*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                            <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                        </div>
                                    </li>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*56.123*/routes/*56.129*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*56.171*/("""'><img src='"""),_display_(/*56.184*/routes/*56.190*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*56.232*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                            <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                        </div>
                                    </li>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*64.123*/routes/*64.129*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*64.171*/("""'><img src='"""),_display_(/*64.184*/routes/*64.190*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*64.232*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                            <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end Slider -->
    <!-- banner -->
    <div class="top-banner-section">
        <div class="container">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*85.61*/routes/*85.67*/.Assets.versioned("images/block1.jpg" )),format.raw/*85.106*/("""'alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*88.61*/routes/*88.67*/.Assets.versioned("images/block2.jpg")),format.raw/*88.105*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*91.61*/routes/*91.67*/.Assets.versioned("images/block3.jpg")),format.raw/*91.105*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*94.61*/routes/*94.67*/.Assets.versioned("images/block3.jpg")),format.raw/*94.105*/("""' alt="offer banner3"></a></div>
                </div>

        </div>
    </div>
    <!-- end banner -->
    <div class="container">
        <div class="product-collateral col-lg-10 col-md-10 col-sm-10 col-xs-12 bounceInUp animated">

            <div class="add_info">
                <ul id="product-detail-tab" class="nav nav-tabs product-tabs">
                    <li class="active"> <a href="#product_tabs_description" data-toggle="tab">IZDVOJENI PROIZVODI</a> </li>
                    <li><a href="#product_tabs_tags" data-toggle="tab">NAJNOVIJI</a></li>
                    <li> <a href="#product_tabs_custom" data-toggle="tab">Custom Tab</a> </li>
                </ul>


                <div id="productTabContent" class="tab-content col-lg-12 col-sm-12 col-xs-12 container">
                    <div class="tab-pane fade in active" id="product_tabs_description">

                        <section class="featured-pro  wow bounceInUp animated">
                            <div class="slider-items-products">
                                <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                                    <div class="slider-items slider-width-col4 products-grid">
                                    """),_display_(/*118.38*/for(item <- models.Item.itemsForHomepageSlider()) yield /*118.87*/ {_display_(Seq[Any](format.raw/*118.89*/("""
                                            """),format.raw/*119.45*/("""<!-- Item -->
                                        <div class="col-md-12 item">
                                            <div class="item-inner">
                                                <div class="item-img">
                                                """),_display_(/*123.50*/if(item.images.size() > 0)/*123.76*/{_display_(Seq[Any](format.raw/*123.77*/("""
                                                    """),format.raw/*124.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*124.114*/item/*124.118*/.name),format.raw/*124.123*/("""" href=""""),_display_(/*124.132*/routes/*124.138*/.Items.itemRender(item.id)),format.raw/*124.164*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*124.202*/models/*124.208*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*124.257*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}/*127.50*/else/*127.54*/{_display_(Seq[Any](format.raw/*127.55*/("""
                                                    """),format.raw/*128.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*128.114*/item/*128.118*/.name),format.raw/*128.123*/("""" href='"""),_display_(/*128.132*/routes/*128.138*/.Items.itemRender(item.id)),format.raw/*128.164*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*128.202*/routes/*128.208*/.Assets.versioned("images/product.png")),format.raw/*128.247*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}),format.raw/*131.50*/("""
                                                """),format.raw/*132.49*/("""</div>
                                                <div class="item-info">
                                                    <div class="info-inner">
                                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*135.118*/routes/*135.124*/.Items.itemRender(item.id)),format.raw/*135.150*/(""""> """),_display_(/*135.154*/item/*135.158*/.name),format.raw/*135.163*/(""" """),format.raw/*135.164*/("""</a> </div>
                                                        <div class="item-content">
                                                            <div class="rating">
                                                                <div class="ratings">
                                                                    """),_display_(/*139.70*/if(item.average_Grade == 1)/*139.97*/ {_display_(Seq[Any](format.raw/*139.99*/("""
                                                                        """),format.raw/*140.73*/("""<div class="rating-box">
                                                                            <div class="rating1"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*143.70*/("""
                                                                    """),_display_(/*144.70*/if(item.average_Grade == 2)/*144.97*/ {_display_(Seq[Any](format.raw/*144.99*/("""
                                                                        """),format.raw/*145.73*/("""<div class="rating-box">
                                                                            <div class="rating2"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*148.70*/("""
                                                                    """),_display_(/*149.70*/if(item.average_Grade == 3)/*149.97*/ {_display_(Seq[Any](format.raw/*149.99*/("""
                                                                        """),format.raw/*150.73*/("""<div class="rating-box">
                                                                            <div class="rating3"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*153.70*/("""
                                                                    """),_display_(/*154.70*/if(item.average_Grade == 4)/*154.97*/ {_display_(Seq[Any](format.raw/*154.99*/("""
                                                                        """),format.raw/*155.73*/("""<div class="rating-box">
                                                                            <div class="rating4"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*158.70*/("""
                                                                    """),_display_(/*159.70*/if(item.average_Grade == 5)/*159.97*/ {_display_(Seq[Any](format.raw/*159.99*/("""
                                                                        """),format.raw/*160.73*/("""<div class="rating-box">
                                                                            <div class="rating5"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*163.70*/("""
                                                                    """),_display_(/*164.70*/if(item.average_Grade == 0)/*164.97*/ {_display_(Seq[Any](format.raw/*164.99*/("""
                                                                        """),format.raw/*165.73*/("""<div class="rating-box">
                                                                            <div class="rating0"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*168.70*/("""

                                                                    """),format.raw/*170.69*/("""</div>
                                                            </div>
                                                            <div class="item-price">
                                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*173.139*/item/*173.143*/.price),format.raw/*173.149*/("""</span> </span> </div>
                                                            </div>
                                                            """),format.raw/*175.160*/("""
                                                            """),format.raw/*176.87*/("""
                                                            """),format.raw/*177.144*/("""
                                                            """),format.raw/*178.71*/("""
                                                            """),format.raw/*179.137*/("""
                                                            """),format.raw/*180.71*/("""
                                                        """),format.raw/*181.57*/("""</div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- End Item -->
                                    """)))}),format.raw/*187.38*/("""
                                    """),format.raw/*188.37*/("""</div>
                                </div>
                            </div>
                        </section>
                    </div>

                    <div class="tab-pane fade" id="product_tabs_tags">
                        <div class="box-collateral box-tags">
                                                            <!--tags-->
                            <p class="note">Odluciti sta ce ici ovdje</p>
                        </div>
                    </div>

                    <div class="tab-pane fade" id="product_tabs_custom">
                        <div class="product-tabs-content-inner clearfix">
                            <p> <strong> Comfortable </strong><span>&nbsp;preshrunk shirts. Highest Quality Printing.  6.1 oz. 100% preshrunk heavyweight cotton Shoulder-to-shoulder taping Double-needle sleeves and bottom hem

                                Lorem Ipsumis
                                simply dummy text of the printing and typesetting industry. Lorem Ipsum
                                has been the industry's standard dummy text ever since the 1500s, when
                                an unknown printer took a galley of type and scrambled it to make a type
                                specimen book. It has survived not only five centuries, but also the
                                leap into electronic typesetting, remaining essentially unchanged. It
                                was popularised in the 1960s with the release of Letraset sheets
                                containing Lorem Ipsum passages, and more recently with desktop
                                publishing software like Aldus PageMaker including versions of Lorem
                                Ipsum.</span></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col"><a href="#"><img src='"""),_display_(/*224.61*/routes/*224.67*/.Assets.versioned("images/slika1.jpeg")),format.raw/*224.106*/("""' alt="offer banner3"></a></div>
                </div>
            </div>
        </div>
    </div>

    <!--Offer Start-->
    <div class="offer-slider wow animated parallax parallax-2">
        <div class="container">
            <ul class="bxslider">
                <li>
                    <h2>NEW ARRIVALS</h2>
                    <h1>Sale up to 30% off</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat. </p>
                    <a class="shop-now" href="#">Shop now</a> </li>
                <li>
                    <h2>Hello hotness!</h2>
                    <h1>Summer collection</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat. </p>
                    <a class="shop-now" href="#">View More</a> </li>
                <li>
                    <h2>New launch</h2>
                    <h1>Designer dresses on sale</h1>
                    <p>Fusce condimentum eleifend enim a feugiat. Pellentesque viverra vehicula sem ut volutpat. Integer sed arcu massa. </p>
                    <a class="shop-now" href="#">Learn More</a> </li>
            </ul>
        </div>
    </div>
    <!--Offer silder End-->

    <!-- Featured Slider -->
    <div class="container">
            <section class="col-lg-10 col-md-10 col-sm-10 col-xs-12 featured-pro container wow bounceInUp animated">
                <div class="slider-items-products">
                    <div class="new_title center">
                        <h2>NAJNOVIJI PROIZVODI</h2>
                    </div>
                    <div id="featured-slider" class="product-flexslider hidden-buttons">
                        <div class="slider-items slider-width-col4 products-grid">
                        """),_display_(/*263.26*/for(item <- models.Item.getLastTenProducts()) yield /*263.71*/{_display_(Seq[Any](format.raw/*263.72*/("""
                            """),format.raw/*264.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*267.38*/if(item.images.size() > 0)/*267.64*/{_display_(Seq[Any](format.raw/*267.65*/("""
                                        """),format.raw/*268.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*268.102*/item/*268.106*/.name),format.raw/*268.111*/("""" href=""""),_display_(/*268.120*/routes/*268.126*/.Items.itemRender(item.id)),format.raw/*268.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*268.190*/models/*268.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*268.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*271.38*/else/*271.42*/{_display_(Seq[Any](format.raw/*271.43*/("""
                                        """),format.raw/*272.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*272.102*/item/*272.106*/.name),format.raw/*272.111*/("""" href='"""),_display_(/*272.120*/routes/*272.126*/.Items.itemRender(item.id)),format.raw/*272.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*272.190*/routes/*272.196*/.Assets.versioned("images/product.png")),format.raw/*272.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*275.38*/("""
                                    """),format.raw/*276.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*279.106*/routes/*279.112*/.Items.itemRender(item.id)),format.raw/*279.138*/(""""> """),_display_(/*279.142*/item/*279.146*/.name),format.raw/*279.151*/(""" """),format.raw/*279.152*/("""</a> </div>
                                            <div class="item-content">
                                                <div class="rating">
                                                    <div class="ratings">
                                                        """),_display_(/*283.58*/if(item.average_Grade == 1)/*283.85*/ {_display_(Seq[Any](format.raw/*283.87*/("""
                                                            """),format.raw/*284.61*/("""<div class="rating-box">
                                                                <div class="rating1"></div>
                                                            </div>
                                                        """)))}),format.raw/*287.58*/("""
                                                        """),_display_(/*288.58*/if(item.average_Grade == 2)/*288.85*/ {_display_(Seq[Any](format.raw/*288.87*/("""
                                                            """),format.raw/*289.61*/("""<div class="rating-box">
                                                                <div class="rating2"></div>
                                                            </div>
                                                        """)))}),format.raw/*292.58*/("""
                                                        """),_display_(/*293.58*/if(item.average_Grade == 3)/*293.85*/ {_display_(Seq[Any](format.raw/*293.87*/("""
                                                            """),format.raw/*294.61*/("""<div class="rating-box">
                                                                <div class="rating3"></div>
                                                            </div>
                                                        """)))}),format.raw/*297.58*/("""
                                                        """),_display_(/*298.58*/if(item.average_Grade == 4)/*298.85*/ {_display_(Seq[Any](format.raw/*298.87*/("""
                                                            """),format.raw/*299.61*/("""<div class="rating-box">
                                                                <div class="rating4"></div>
                                                            </div>
                                                        """)))}),format.raw/*302.58*/("""
                                                        """),_display_(/*303.58*/if(item.average_Grade == 5)/*303.85*/ {_display_(Seq[Any](format.raw/*303.87*/("""
                                                            """),format.raw/*304.61*/("""<div class="rating-box">
                                                                <div class="rating5"></div>
                                                            </div>
                                                        """)))}),format.raw/*307.58*/("""
                                                        """),_display_(/*308.58*/if(item.average_Grade == 0)/*308.85*/ {_display_(Seq[Any](format.raw/*308.87*/("""
                                                            """),format.raw/*309.61*/("""<div class="rating-box">
                                                                <div class="rating0"></div>
                                                            </div>
                                                        """)))}),format.raw/*312.58*/("""

                                                    """),format.raw/*314.53*/("""<p class="rating-links">Ukupno """),_display_(/*314.85*/Review/*314.91*/.getNumberOfReviews(item.id)),format.raw/*314.119*/(""" """),format.raw/*314.120*/("""ocjena</p>

                                                    </div>
                                                </div>
                                            <div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*319.123*/item/*319.127*/.price),format.raw/*319.133*/(""" """),format.raw/*319.134*/("""KM </span> </span> </div>
                                            </div>

                                                """),format.raw/*322.148*/("""
                                                """),format.raw/*323.75*/("""
                                                """),format.raw/*324.132*/("""
                                                """),format.raw/*325.59*/("""
                                                """),format.raw/*326.131*/("""
                                            """),format.raw/*327.45*/("""</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*332.26*/("""

                        """),format.raw/*334.25*/("""</div>
                    </div>
                </div>
            </section>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col"><a href="#"><img src='"""),_display_(/*342.61*/routes/*342.67*/.Assets.versioned("images/slika2.png")),format.raw/*342.105*/("""' alt="offer banner3"></a></div>
                </div>
            </div>
        </div>

    </div>


    <!-- End Featured Slider -->

    <div class="brand-logo wow bounceInUp animated">
        <div class="container">
            <div class="new_title center">
                <h2>TOP BRANDS</h2>
            </div>
            <div class="slider-items-products">
                <div id="brand-logo-slider" class="product-flexslider hidden-buttons">
                    <div class="slider-items slider-width-col6">

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*362.66*/routes/*362.72*/.Assets.versioned("images/b-logo3.png")),format.raw/*362.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*366.66*/routes/*366.72*/.Assets.versioned("images/b-logo2.png")),format.raw/*366.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*370.66*/routes/*370.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*370.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*374.66*/routes/*374.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*374.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*378.66*/routes/*378.72*/.Assets.versioned("images/b-logo5.png")),format.raw/*378.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*382.66*/routes/*382.72*/.Assets.versioned("images/b-logo6.png")),format.raw/*382.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*386.66*/routes/*386.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*386.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*390.66*/routes/*390.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*390.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Latest Blog -->
    <section class="latest-blog wow bounceInUp animated">
        <div class="container">
            <div class="new_title center">
                <h2>Najnovije vijesti</h2>
            </div>
            <div class="row">
                """),_display_(/*405.18*/for(news <- models.News.lastNews) yield /*405.51*/ {_display_(Seq[Any](format.raw/*405.53*/("""
                    """),format.raw/*406.21*/("""<div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                        <div class="blog_inner">
                            <div class="blog-img"> <img src='"""),_display_(/*408.63*/news/*408.67*/.images.get(0).getSize(780,420)),format.raw/*408.98*/("""' alt="Blog image">
                                <div class="mask"> <a class="info" href=""""),_display_(/*409.75*/routes/*409.81*/.NewsController.newsRender(news.id)),format.raw/*409.116*/("""">Pročitaj više</a> </div>
                            </div>
                            <h3><a href="blog_detail.html">"""),_display_(/*411.61*/news/*411.65*/.title),format.raw/*411.71*/("""</a> </h3>
                            <p>"""),_display_(/*412.33*/news/*412.37*/.text.substring(0,70)),format.raw/*412.58*/("""  """),format.raw/*412.60*/("""... </p>
                            <a class="readmore" href=""""),_display_(/*413.56*/routes/*413.62*/.NewsController.newsRender(news.id)),format.raw/*413.97*/("""">Pročitaj više</a> </div>
                    </div>
                """)))}),format.raw/*415.18*/("""
            """),format.raw/*416.13*/("""</div>
        </div>
    </section>
    <!-- End Latest Blog -->

""")))}),format.raw/*421.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Wed Apr 27 21:17:01 CEST 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: fa88a755ccf045b6a0b2accf51b33da919d606fc
                  MATRIX: 886->33|897->37|935->39|966->44|1029->81|1043->87|1114->138|1966->963|2034->1015|2074->1017|2143->1058|2185->1073|2200->1079|2265->1122|2297->1126|2315->1134|2342->1139|2372->1140|2450->1187|2515->1224|3686->2367|3702->2373|3766->2415|3807->2428|3823->2434|3887->2476|5949->4510|5965->4516|6029->4558|6070->4571|6086->4577|6150->4619|8207->6648|8223->6654|8287->6696|8328->6709|8344->6715|8408->6757|10465->8786|10481->8792|10545->8834|10586->8847|10602->8853|10666->8895|13061->11263|13076->11269|13137->11308|13368->11512|13383->11518|13443->11556|13675->11761|13690->11767|13750->11805|13982->12010|13997->12016|14057->12054|15343->13312|15409->13361|15450->13363|15524->13408|15824->13680|15860->13706|15900->13707|15982->13760|16072->13821|16087->13825|16115->13830|16153->13839|16170->13845|16219->13871|16286->13909|16303->13915|16375->13964|16671->14240|16685->14244|16725->14245|16807->14298|16897->14359|16912->14363|16940->14368|16978->14377|16995->14383|17044->14409|17111->14447|17128->14453|17190->14492|17498->14768|17576->14817|17878->15090|17895->15096|17944->15122|17977->15126|17992->15130|18020->15135|18051->15136|18410->15467|18447->15494|18488->15496|18590->15569|18899->15846|18997->15916|19034->15943|19075->15945|19177->16018|19486->16295|19584->16365|19621->16392|19662->16394|19764->16467|20073->16744|20171->16814|20208->16841|20249->16843|20351->16916|20660->17193|20758->17263|20795->17290|20836->17292|20938->17365|21247->17642|21345->17712|21382->17739|21423->17741|21525->17814|21834->18091|21933->18161|22259->18458|22274->18462|22303->18468|22483->18717|22573->18804|22664->18948|22754->19019|22845->19156|22935->19227|23021->19284|23371->19602|23437->19639|25550->21724|25566->21730|25628->21769|27561->23674|27623->23719|27663->23720|27721->23749|27921->23921|27957->23947|27997->23948|28067->23989|28157->24050|28172->24054|28200->24059|28238->24068|28255->24074|28304->24100|28371->24138|28388->24144|28460->24193|28720->24433|28734->24437|28774->24438|28844->24479|28934->24540|28949->24544|28977->24549|29015->24558|29032->24564|29081->24590|29148->24628|29165->24634|29227->24673|29499->24913|29565->24950|29831->25187|29848->25193|29897->25219|29930->25223|29945->25227|29973->25232|30004->25233|30315->25516|30352->25543|30393->25545|30483->25606|30756->25847|30842->25905|30879->25932|30920->25934|31010->25995|31283->26236|31369->26294|31406->26321|31447->26323|31537->26384|31810->26625|31896->26683|31933->26710|31974->26712|32064->26773|32337->27014|32423->27072|32460->27099|32501->27101|32591->27162|32864->27403|32950->27461|32987->27488|33028->27490|33118->27551|33391->27792|33474->27846|33534->27878|33550->27884|33601->27912|33632->27913|33978->28230|33993->28234|34022->28240|34053->28241|34209->28466|34287->28541|34366->28673|34444->28732|34523->28863|34597->28908|34825->29104|34880->29130|35197->29419|35213->29425|35274->29463|35931->30092|35947->30098|36009->30137|36217->30317|36233->30323|36295->30362|36503->30542|36519->30548|36581->30587|36789->30767|36805->30773|36867->30812|37075->30992|37091->30998|37153->31037|37361->31217|37377->31223|37439->31262|37647->31442|37663->31448|37725->31487|37933->31667|37949->31673|38011->31712|38474->32147|38524->32180|38565->32182|38615->32203|38805->32365|38819->32369|38872->32400|38994->32494|39010->32500|39068->32535|39218->32657|39232->32661|39260->32667|39331->32710|39345->32714|39388->32735|39419->32737|39511->32801|39527->32807|39584->32842|39687->32913|39729->32926|39828->32994
                  LINES: 35->2|35->2|35->2|36->3|36->3|36->3|36->3|51->18|51->18|51->18|52->19|52->19|52->19|52->19|52->19|52->19|52->19|52->19|53->20|54->21|73->40|73->40|73->40|73->40|73->40|73->40|81->48|81->48|81->48|81->48|81->48|81->48|89->56|89->56|89->56|89->56|89->56|89->56|97->64|97->64|97->64|97->64|97->64|97->64|118->85|118->85|118->85|121->88|121->88|121->88|124->91|124->91|124->91|127->94|127->94|127->94|151->118|151->118|151->118|152->119|156->123|156->123|156->123|157->124|157->124|157->124|157->124|157->124|157->124|157->124|157->124|157->124|157->124|160->127|160->127|160->127|161->128|161->128|161->128|161->128|161->128|161->128|161->128|161->128|161->128|161->128|164->131|165->132|168->135|168->135|168->135|168->135|168->135|168->135|168->135|172->139|172->139|172->139|173->140|176->143|177->144|177->144|177->144|178->145|181->148|182->149|182->149|182->149|183->150|186->153|187->154|187->154|187->154|188->155|191->158|192->159|192->159|192->159|193->160|196->163|197->164|197->164|197->164|198->165|201->168|203->170|206->173|206->173|206->173|208->175|209->176|210->177|211->178|212->179|213->180|214->181|220->187|221->188|257->224|257->224|257->224|296->263|296->263|296->263|297->264|300->267|300->267|300->267|301->268|301->268|301->268|301->268|301->268|301->268|301->268|301->268|301->268|301->268|304->271|304->271|304->271|305->272|305->272|305->272|305->272|305->272|305->272|305->272|305->272|305->272|305->272|308->275|309->276|312->279|312->279|312->279|312->279|312->279|312->279|312->279|316->283|316->283|316->283|317->284|320->287|321->288|321->288|321->288|322->289|325->292|326->293|326->293|326->293|327->294|330->297|331->298|331->298|331->298|332->299|335->302|336->303|336->303|336->303|337->304|340->307|341->308|341->308|341->308|342->309|345->312|347->314|347->314|347->314|347->314|347->314|352->319|352->319|352->319|352->319|355->322|356->323|357->324|358->325|359->326|360->327|365->332|367->334|375->342|375->342|375->342|395->362|395->362|395->362|399->366|399->366|399->366|403->370|403->370|403->370|407->374|407->374|407->374|411->378|411->378|411->378|415->382|415->382|415->382|419->386|419->386|419->386|423->390|423->390|423->390|438->405|438->405|438->405|439->406|441->408|441->408|441->408|442->409|442->409|442->409|444->411|444->411|444->411|445->412|445->412|445->412|445->412|446->413|446->413|446->413|448->415|449->416|454->421
                  -- GENERATED --
              */
          