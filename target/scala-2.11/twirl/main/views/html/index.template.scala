
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
                                <li> <a>NAMEŠTAJ <i class="fa fa-angle-down"></i></a>
                                  <ul class="level0_455">
                                  """),_display_(/*18.36*/for(category <- models.Category.findAllCategories()) yield /*18.88*/ {_display_(Seq[Any](format.raw/*18.90*/("""
                                      """),format.raw/*19.39*/("""<li> <a href=""""),_display_(/*19.54*/routes/*19.60*/.Items.getItemsWithSubCategory(category.id)),format.raw/*19.103*/(""""> """),_display_(/*19.107*/category/*19.115*/.name),format.raw/*19.120*/(""" """),format.raw/*19.121*/("""</a></li>
                                  """)))}),format.raw/*20.36*/("""
                                  """),format.raw/*21.35*/("""</ul>
                                      <!--level0-->
                                </li>

                                <li> <a href=""""),_display_(/*25.48*/routes/*25.54*/.Items.itemsOnSale()),format.raw/*25.74*/("""">AKCIJA</a></li>
                                <li> <a href="">TOP PONUDA</a></li>
                                <li> <a href="">IDEJE</a></li>
                                <li> <a href=""""),_display_(/*28.48*/routes/*28.54*/.NewsController.newsPanelRender()),format.raw/*28.87*/("""">VIJESTI</a></li>
                                <li> <a href=""""),_display_(/*29.48*/routes/*29.54*/.Partners.partnerPanel()),format.raw/*29.78*/("""">PARTNERI</a></li>
                            </ul>
                        </div>
                            <!--box-content box-category-->
                        """),format.raw/*33.51*/("""
                            """),format.raw/*34.104*/("""
                            """),format.raw/*35.63*/("""
                            """),format.raw/*36.89*/("""
                                """),format.raw/*37.116*/("""
                            """),format.raw/*38.34*/("""

                            """),format.raw/*40.39*/("""
                            """),format.raw/*41.63*/("""

                            """),format.raw/*43.39*/("""
                        """),format.raw/*44.35*/("""

                    """),format.raw/*46.21*/("""</div>
                </div>
                <div class="col-lg-9 col-sm-12 col-md-8 bounceInUp animated">
                    <div style="position:relative;width:100%;height:auto;margin-top:0px;margin-bottom:0px">
                        <div id='rev_slider_4_wrapper' class='rev_slider_wrapper fullwidthbanner-container' >
                            <div id='rev_slider_4' class='rev_slider fullwidthabanner'>
                                <ul>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*53.123*/routes/*53.129*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*53.171*/("""'><img src='"""),_display_(/*53.184*/routes/*53.190*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*53.232*/("""' data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat' alt="" />
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft  tp-resizeme ' data-x='0'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;'><span>New Season</span></div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='0'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3; max-width:auto;max-height:auto;white-space:nowrap;'><span>Summer Sale</span></div>
                                            <div class='tp-caption sfb  tp-resizeme ' data-x='0'  data-y='410'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Shop Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='0'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">In augue urna, nunc, tincidunt, augue, augue facilisis facilisis</h4></div>
                                        </div>
                                    </li>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*61.123*/routes/*61.129*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*61.171*/("""'><img src='"""),_display_(/*61.184*/routes/*61.190*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*61.232*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                            <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                        </div>
                                    </li>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*69.123*/routes/*69.129*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*69.171*/("""'><img src='"""),_display_(/*69.184*/routes/*69.190*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*69.232*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                        <div class="info">
                                            <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                            <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                            <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                            <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                        </div>
                                    </li>
                                    <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*77.123*/routes/*77.129*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*77.171*/("""'><img src='"""),_display_(/*77.184*/routes/*77.190*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*77.232*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
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
                    <div class="col"><a href="#"><img src='"""),_display_(/*98.61*/routes/*98.67*/.Assets.versioned("images/block1.jpg" )),format.raw/*98.106*/("""'alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*101.61*/routes/*101.67*/.Assets.versioned("images/block2.jpg")),format.raw/*101.105*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*104.61*/routes/*104.67*/.Assets.versioned("images/block3.jpg")),format.raw/*104.105*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                    <div class="col">
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.Items.itemRender(1)),format.raw/*108.61*/("""">
                            """),_display_(/*109.30*/if(models.Item.findItemById(1).images.size() > 0 )/*109.80*/ {_display_(Seq[Any](format.raw/*109.82*/("""
                                """),format.raw/*110.33*/("""<img src='"""),_display_(/*110.44*/models/*110.50*/.Item.findItemById(1).images.get(0).getSize(370,220)),format.raw/*110.102*/("""' alt="offer banner3">
                            """)))}/*111.30*/else/*111.35*/{_display_(Seq[Any](format.raw/*111.36*/("""
                                """),format.raw/*112.33*/("""<img src='"""),_display_(/*112.44*/routes/*112.50*/.Assets.versioned("images/product.png")),format.raw/*112.89*/("""' style="width: 370px; height: 220px" alt="">
                            """)))}),format.raw/*113.30*/("""
                        """),format.raw/*114.25*/("""</a>
                    </div>
                </div>

        </div>
    </div>
    <!-- end banner -->
    <div class="container">
        <div class="product-collateral col-lg-10 col-md-10 col-sm-10 col-xs-12 bounceInUp animated">

            <div class="add_info">
                <ul id="product-detail-tab" class="nav nav-tabs product-tabs">
                    <li class="active"> <a href="#product_tabs_description" data-toggle="tab">IZDVOJENI PROIZVODI</a> </li>
                    <li> <a href="#product_tabs_toprated" data-toggle="tab">NAJBOLJE OCIJENJENI</a> </li>
                    <li><a href="#product_tabs_tags" data-toggle="tab">SVI PROIZVODI</a></li>
                </ul>


                <div id="productTabContent" class="tab-content col-lg-12 col-sm-12 col-xs-12 container">
                    <div class="tab-pane fade in active" id="product_tabs_description">

                        <section class="featured-pro  wow bounceInUp animated">
                            <div class="slider-items-products">
                                <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                                    <div class="slider-items slider-width-col4 products-grid">
                                    """),_display_(/*139.38*/for(item <- models.Item.itemsForHomepageSlider()) yield /*139.87*/ {_display_(Seq[Any](format.raw/*139.89*/("""
                                            """),format.raw/*140.45*/("""<!-- Item -->
                                        <div class="col-md-12 item">
                                            <div class="item-inner">
                                                <div class="item-img">
                                                """),_display_(/*144.50*/if(item.images.size() > 0)/*144.76*/{_display_(Seq[Any](format.raw/*144.77*/("""
                                                    """),format.raw/*145.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*145.114*/item/*145.118*/.name),format.raw/*145.123*/("""" href=""""),_display_(/*145.132*/routes/*145.138*/.Items.itemRender(item.id)),format.raw/*145.164*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*145.202*/models/*145.208*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*145.257*/("""'> </a>

                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}/*148.50*/else/*148.54*/{_display_(Seq[Any](format.raw/*148.55*/("""
                                                    """),format.raw/*149.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*149.114*/item/*149.118*/.name),format.raw/*149.123*/("""" href='"""),_display_(/*149.132*/routes/*149.138*/.Items.itemRender(item.id)),format.raw/*149.164*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*149.202*/routes/*149.208*/.Assets.versioned("images/product.png")),format.raw/*149.247*/("""'> </a>

                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}),format.raw/*152.50*/("""
                                                """),format.raw/*153.49*/("""</div>
                                                <div class="item-info">
                                                    <div class="info-inner">
                                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*156.118*/routes/*156.124*/.Items.itemRender(item.id)),format.raw/*156.150*/(""""> """),_display_(/*156.154*/item/*156.158*/.name),format.raw/*156.163*/(""" """),format.raw/*156.164*/("""</a> </div>
                                                        <div class="item-content">
                                                            <div class="rating">
                                                                <div class="ratings">
                                                                    """),_display_(/*160.70*/if(item.average_Grade == 1)/*160.97*/ {_display_(Seq[Any](format.raw/*160.99*/("""
                                                                        """),format.raw/*161.73*/("""<div class="rating-box">
                                                                            <div class="rating1"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*164.70*/("""
                                                                    """),_display_(/*165.70*/if(item.average_Grade == 2)/*165.97*/ {_display_(Seq[Any](format.raw/*165.99*/("""
                                                                        """),format.raw/*166.73*/("""<div class="rating-box">
                                                                            <div class="rating2"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*169.70*/("""
                                                                    """),_display_(/*170.70*/if(item.average_Grade == 3)/*170.97*/ {_display_(Seq[Any](format.raw/*170.99*/("""
                                                                        """),format.raw/*171.73*/("""<div class="rating-box">
                                                                            <div class="rating3"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*174.70*/("""
                                                                    """),_display_(/*175.70*/if(item.average_Grade == 4)/*175.97*/ {_display_(Seq[Any](format.raw/*175.99*/("""
                                                                        """),format.raw/*176.73*/("""<div class="rating-box">
                                                                            <div class="rating4"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*179.70*/("""
                                                                    """),_display_(/*180.70*/if(item.average_Grade == 5)/*180.97*/ {_display_(Seq[Any](format.raw/*180.99*/("""
                                                                        """),format.raw/*181.73*/("""<div class="rating-box">
                                                                            <div class="rating5"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*184.70*/("""
                                                                    """),_display_(/*185.70*/if(item.average_Grade == 0)/*185.97*/ {_display_(Seq[Any](format.raw/*185.99*/("""
                                                                        """),format.raw/*186.73*/("""<div class="rating-box">
                                                                            <div class="rating0"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*189.70*/("""

                                                                    """),format.raw/*191.69*/("""</div>
                                                            </div>
                                                            <div class="item-price">
                                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*194.139*/item/*194.143*/.price),format.raw/*194.149*/("""</span> </span> </div>
                                                            </div>
                                                            """),format.raw/*196.160*/("""
                                                            """),format.raw/*197.87*/("""
                                                            """),format.raw/*198.144*/("""
                                                            """),format.raw/*199.71*/("""
                                                            """),format.raw/*200.137*/("""
                                                            """),format.raw/*201.71*/("""
                                                        """),format.raw/*202.57*/("""</div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- End Item -->
                                    """)))}),format.raw/*208.38*/("""
                                    """),format.raw/*209.37*/("""</div>
                                </div>
                            </div>
                        </section>
                    </div>

                    <div class="tab-pane fade" id="product_tabs_toprated">
                        <div class="box-collateral box-tags">

                            <section class="featured-pro">
                                <div class="slider-items-products">
                                    <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                                        <div class="slider-items slider-width-col4 products-grid">
                                        """),_display_(/*222.42*/for(item <- models.Item.topRatedItems()) yield /*222.82*/ {_display_(Seq[Any](format.raw/*222.84*/("""
                                                """),format.raw/*223.49*/("""<!-- Item -->
                                            <div class="col-md-12 item">
                                                <div class="item-inner">
                                                    <div class="item-img">
                                                    """),_display_(/*227.54*/if(item.images.size() > 0)/*227.80*/{_display_(Seq[Any](format.raw/*227.81*/("""
                                                        """),format.raw/*228.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*228.118*/item/*228.122*/.name),format.raw/*228.127*/("""" href=""""),_display_(/*228.136*/routes/*228.142*/.Items.itemRender(item.id)),format.raw/*228.168*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*228.206*/models/*228.212*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*228.261*/("""'> </a>
                                                            <div class="new-label new-top-left">new</div>
                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}/*231.54*/else/*231.58*/{_display_(Seq[Any](format.raw/*231.59*/("""
                                                        """),format.raw/*232.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*232.118*/item/*232.122*/.name),format.raw/*232.127*/("""" href='"""),_display_(/*232.136*/routes/*232.142*/.Items.itemRender(item.id)),format.raw/*232.168*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*232.206*/routes/*232.212*/.Assets.versioned("images/product.png")),format.raw/*232.251*/("""'> </a>
                                                            <div class="new-label new-top-left">new</div>
                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}),format.raw/*235.54*/("""
                                                    """),format.raw/*236.53*/("""</div>
                                                    <div class="item-info">
                                                        <div class="info-inner">
                                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*239.122*/routes/*239.128*/.Items.itemRender(item.id)),format.raw/*239.154*/(""""> """),_display_(/*239.158*/item/*239.162*/.name),format.raw/*239.167*/(""" """),format.raw/*239.168*/("""</a> </div>
                                                            <div class="item-content">
                                                                <div class="rating">
                                                                    <div class="ratings">
                                                                        """),_display_(/*243.74*/if(item.average_Grade == 1)/*243.101*/ {_display_(Seq[Any](format.raw/*243.103*/("""
                                                                            """),format.raw/*244.77*/("""<div class="rating-box">
                                                                                <div class="rating1"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*247.74*/("""
                                                                        """),_display_(/*248.74*/if(item.average_Grade == 2)/*248.101*/ {_display_(Seq[Any](format.raw/*248.103*/("""
                                                                            """),format.raw/*249.77*/("""<div class="rating-box">
                                                                                <div class="rating2"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*252.74*/("""
                                                                        """),_display_(/*253.74*/if(item.average_Grade == 3)/*253.101*/ {_display_(Seq[Any](format.raw/*253.103*/("""
                                                                            """),format.raw/*254.77*/("""<div class="rating-box">
                                                                                <div class="rating3"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*257.74*/("""
                                                                        """),_display_(/*258.74*/if(item.average_Grade == 4)/*258.101*/ {_display_(Seq[Any](format.raw/*258.103*/("""
                                                                            """),format.raw/*259.77*/("""<div class="rating-box">
                                                                                <div class="rating4"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*262.74*/("""
                                                                        """),_display_(/*263.74*/if(item.average_Grade == 5)/*263.101*/ {_display_(Seq[Any](format.raw/*263.103*/("""
                                                                            """),format.raw/*264.77*/("""<div class="rating-box">
                                                                                <div class="rating5"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*267.74*/("""
                                                                        """),_display_(/*268.74*/if(item.average_Grade == 0)/*268.101*/ {_display_(Seq[Any](format.raw/*268.103*/("""
                                                                            """),format.raw/*269.77*/("""<div class="rating-box">
                                                                                <div class="rating0"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*272.74*/("""

                                                                    """),format.raw/*274.69*/("""</div>
                                                                </div>
                                                                <div class="item-price">
                                                                    <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*277.143*/item/*277.147*/.price),format.raw/*277.153*/("""</span> </span> </div>
                                                                </div>
                                                                """),format.raw/*279.164*/("""
                                                                """),format.raw/*280.91*/("""
                                                                """),format.raw/*281.148*/("""
                                                                """),format.raw/*282.75*/("""
                                                                """),format.raw/*283.141*/("""
                                                                """),format.raw/*284.75*/("""
                                                            """),format.raw/*285.61*/("""</div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                                <!-- End Item -->
                                        """)))}),format.raw/*291.42*/("""
                                        """),format.raw/*292.41*/("""</div>
                                    </div>
                                </div>
                            </section>
                        </div>
                    </div>


                    <div class="tab-pane fade" id="product_tabs_tags">
                        <div class="box-collateral box-tags">
                                                            <!--tags-->
                            <section class="featured-pro">
                                <div class="slider-items-products">
                                    <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                                        <div class="slider-items slider-width-col4 products-grid">
                                        """),_display_(/*307.42*/for(item <- models.Item.allActiveItemsShuffled()) yield /*307.91*/ {_display_(Seq[Any](format.raw/*307.93*/("""
                                                """),format.raw/*308.49*/("""<!-- Item -->
                                            <div class="col-md-12 item">
                                                <div class="item-inner">
                                                    <div class="item-img">
                                                    """),_display_(/*312.54*/if(item.images.size() > 0)/*312.80*/{_display_(Seq[Any](format.raw/*312.81*/("""
                                                        """),format.raw/*313.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*313.118*/item/*313.122*/.name),format.raw/*313.127*/("""" href=""""),_display_(/*313.136*/routes/*313.142*/.Items.itemRender(item.id)),format.raw/*313.168*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*313.206*/models/*313.212*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*313.261*/("""'> </a>

                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}/*316.54*/else/*316.58*/{_display_(Seq[Any](format.raw/*316.59*/("""
                                                        """),format.raw/*317.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*317.118*/item/*317.122*/.name),format.raw/*317.127*/("""" href='"""),_display_(/*317.136*/routes/*317.142*/.Items.itemRender(item.id)),format.raw/*317.168*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*317.206*/routes/*317.212*/.Assets.versioned("images/product.png")),format.raw/*317.251*/("""'> </a>

                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}),format.raw/*320.54*/("""
                                                    """),format.raw/*321.53*/("""</div>
                                                    <div class="item-info">
                                                        <div class="info-inner">
                                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*324.122*/routes/*324.128*/.Items.itemRender(item.id)),format.raw/*324.154*/(""""> """),_display_(/*324.158*/item/*324.162*/.name),format.raw/*324.167*/(""" """),format.raw/*324.168*/("""</a> </div>
                                                            <div class="item-content">
                                                                <div class="rating">
                                                                    <div class="ratings">
                                                                        """),_display_(/*328.74*/if(item.average_Grade == 1)/*328.101*/ {_display_(Seq[Any](format.raw/*328.103*/("""
                                                                            """),format.raw/*329.77*/("""<div class="rating-box">
                                                                                <div class="rating1"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*332.74*/("""
                                                                        """),_display_(/*333.74*/if(item.average_Grade == 2)/*333.101*/ {_display_(Seq[Any](format.raw/*333.103*/("""
                                                                            """),format.raw/*334.77*/("""<div class="rating-box">
                                                                                <div class="rating2"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*337.74*/("""
                                                                        """),_display_(/*338.74*/if(item.average_Grade == 3)/*338.101*/ {_display_(Seq[Any](format.raw/*338.103*/("""
                                                                            """),format.raw/*339.77*/("""<div class="rating-box">
                                                                                <div class="rating3"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*342.74*/("""
                                                                        """),_display_(/*343.74*/if(item.average_Grade == 4)/*343.101*/ {_display_(Seq[Any](format.raw/*343.103*/("""
                                                                            """),format.raw/*344.77*/("""<div class="rating-box">
                                                                                <div class="rating4"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*347.74*/("""
                                                                        """),_display_(/*348.74*/if(item.average_Grade == 5)/*348.101*/ {_display_(Seq[Any](format.raw/*348.103*/("""
                                                                            """),format.raw/*349.77*/("""<div class="rating-box">
                                                                                <div class="rating5"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*352.74*/("""
                                                                        """),_display_(/*353.74*/if(item.average_Grade == 0)/*353.101*/ {_display_(Seq[Any](format.raw/*353.103*/("""
                                                                            """),format.raw/*354.77*/("""<div class="rating-box">
                                                                                <div class="rating0"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*357.74*/("""

                                                                    """),format.raw/*359.69*/("""</div>
                                                                </div>
                                                                <div class="item-price">
                                                                    <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*362.143*/item/*362.147*/.price),format.raw/*362.153*/("""</span> </span> </div>
                                                                </div>
                                                                """),format.raw/*364.164*/("""
                                                                """),format.raw/*365.91*/("""
                                                                """),format.raw/*366.148*/("""
                                                                """),format.raw/*367.75*/("""
                                                                """),format.raw/*368.141*/("""
                                                                """),format.raw/*369.75*/("""
                                                            """),format.raw/*370.61*/("""</div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                                <!-- End Item -->
                                        """)))}),format.raw/*376.42*/("""
                                        """),format.raw/*377.41*/("""</div>
                                    </div>
                                </div>
                            </section>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col" style="padding-top: 35px"><a href="#"><img src='"""),_display_(/*391.87*/routes/*391.93*/.Assets.versioned("images/reklama1.jpg")),format.raw/*391.133*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col" style="padding-top: 0px"><a href="#"><img src='"""),_display_(/*394.86*/routes/*394.92*/.Assets.versioned("images/reklama2.jpg")),format.raw/*394.132*/("""' alt="offer banner3"></a></div>
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
                        """),_display_(/*433.26*/for(item <- models.Item.getLastTenProducts()) yield /*433.71*/{_display_(Seq[Any](format.raw/*433.72*/("""
                            """),format.raw/*434.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*437.38*/if(item.images.size() > 0)/*437.64*/{_display_(Seq[Any](format.raw/*437.65*/("""
                                        """),format.raw/*438.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*438.102*/item/*438.106*/.name),format.raw/*438.111*/("""" href=""""),_display_(/*438.120*/routes/*438.126*/.Items.itemRender(item.id)),format.raw/*438.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*438.190*/models/*438.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*438.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*441.38*/else/*441.42*/{_display_(Seq[Any](format.raw/*441.43*/("""
                                        """),format.raw/*442.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*442.102*/item/*442.106*/.name),format.raw/*442.111*/("""" href='"""),_display_(/*442.120*/routes/*442.126*/.Items.itemRender(item.id)),format.raw/*442.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*442.190*/routes/*442.196*/.Assets.versioned("images/product.png")),format.raw/*442.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*445.38*/("""
                                    """),format.raw/*446.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*449.106*/routes/*449.112*/.Items.itemRender(item.id)),format.raw/*449.138*/(""""> """),_display_(/*449.142*/item/*449.146*/.name),format.raw/*449.151*/(""" """),format.raw/*449.152*/("""</a> </div>
                                            <div class="item-content">
                                                <div class="rating">
                                                    <div class="ratings">
                                                        """),_display_(/*453.58*/if(item.average_Grade == 1)/*453.85*/ {_display_(Seq[Any](format.raw/*453.87*/("""
                                                            """),format.raw/*454.61*/("""<div class="rating-box">
                                                                <div class="rating1"></div>
                                                            </div>
                                                        """)))}),format.raw/*457.58*/("""
                                                        """),_display_(/*458.58*/if(item.average_Grade == 2)/*458.85*/ {_display_(Seq[Any](format.raw/*458.87*/("""
                                                            """),format.raw/*459.61*/("""<div class="rating-box">
                                                                <div class="rating2"></div>
                                                            </div>
                                                        """)))}),format.raw/*462.58*/("""
                                                        """),_display_(/*463.58*/if(item.average_Grade == 3)/*463.85*/ {_display_(Seq[Any](format.raw/*463.87*/("""
                                                            """),format.raw/*464.61*/("""<div class="rating-box">
                                                                <div class="rating3"></div>
                                                            </div>
                                                        """)))}),format.raw/*467.58*/("""
                                                        """),_display_(/*468.58*/if(item.average_Grade == 4)/*468.85*/ {_display_(Seq[Any](format.raw/*468.87*/("""
                                                            """),format.raw/*469.61*/("""<div class="rating-box">
                                                                <div class="rating4"></div>
                                                            </div>
                                                        """)))}),format.raw/*472.58*/("""
                                                        """),_display_(/*473.58*/if(item.average_Grade == 5)/*473.85*/ {_display_(Seq[Any](format.raw/*473.87*/("""
                                                            """),format.raw/*474.61*/("""<div class="rating-box">
                                                                <div class="rating5"></div>
                                                            </div>
                                                        """)))}),format.raw/*477.58*/("""
                                                        """),_display_(/*478.58*/if(item.average_Grade == 0)/*478.85*/ {_display_(Seq[Any](format.raw/*478.87*/("""
                                                            """),format.raw/*479.61*/("""<div class="rating-box">
                                                                <div class="rating0"></div>
                                                            </div>
                                                        """)))}),format.raw/*482.58*/("""

                                                    """),format.raw/*484.53*/("""<p class="rating-links">Ukupno """),_display_(/*484.85*/Review/*484.91*/.getNumberOfReviews(item.id)),format.raw/*484.119*/(""" """),format.raw/*484.120*/("""ocjena</p>

                                                    </div>
                                                </div>
                                            <div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*489.123*/item/*489.127*/.price),format.raw/*489.133*/(""" """),format.raw/*489.134*/("""KM </span> </span> </div>
                                            </div>

                                                """),format.raw/*492.148*/("""
                                                """),format.raw/*493.75*/("""
                                                """),format.raw/*494.132*/("""
                                                """),format.raw/*495.59*/("""
                                                """),format.raw/*496.131*/("""
                                            """),format.raw/*497.45*/("""</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*502.26*/("""

                        """),format.raw/*504.25*/("""</div>
                    </div>
                </div>
            </section>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col"><a href="#"><img src='"""),_display_(/*512.61*/routes/*512.67*/.Assets.versioned("images/slika2.png")),format.raw/*512.105*/("""' alt="offer banner3"></a></div>
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
                        """),_display_(/*530.26*/for(user <- models.AppUser.usersWithLogo()) yield /*530.69*/{_display_(Seq[Any](format.raw/*530.70*/("""
                            """),format.raw/*531.29*/("""<!-- Item -->
                            <div class="item"><a href=""""),_display_(/*532.57*/routes/*532.63*/.Partners.partnerPageRender(user.id)),format.raw/*532.99*/(""""><img src='"""),_display_(/*532.112*/user/*532.116*/.images.get(0).getSize(178,77)),format.raw/*532.146*/("""' alt="Image"></a> </div>
                                <!-- End Item -->
                        """)))}),format.raw/*534.26*/("""
                    """),format.raw/*535.21*/("""</div>
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
                """),_display_(/*548.18*/for(news <- models.News.lastNews) yield /*548.51*/ {_display_(Seq[Any](format.raw/*548.53*/("""
                    """),format.raw/*549.21*/("""<div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                        <div class="blog_inner">
                            <div class="blog-img"> <img src='"""),_display_(/*551.63*/news/*551.67*/.images.get(0).getSize(780,420)),format.raw/*551.98*/("""' alt="Blog image">
                                <div class="mask"> <a class="info" href=""""),_display_(/*552.75*/routes/*552.81*/.NewsController.newsRender(news.id)),format.raw/*552.116*/("""">Pročitaj više</a> </div>
                            </div>
                            <h3><a href="blog_detail.html">"""),_display_(/*554.61*/news/*554.65*/.title),format.raw/*554.71*/("""</a> </h3>
                            <p>"""),_display_(/*555.33*/news/*555.37*/.text.substring(0,70)),format.raw/*555.58*/("""  """),format.raw/*555.60*/("""... </p>
                            <a class="readmore" href=""""),_display_(/*556.56*/routes/*556.62*/.NewsController.newsRender(news.id)),format.raw/*556.97*/("""">Pročitaj više</a> </div>
                    </div>
                """)))}),format.raw/*558.18*/("""
            """),format.raw/*559.13*/("""</div>

        </div>
    </section>
    <!-- End Latest Blog -->
<style>


    .box-content li:hover .level0_455"""),format.raw/*567.38*/("""{"""),format.raw/*567.39*/("""
    """),format.raw/*568.5*/("""display: block;
    """),format.raw/*569.5*/("""}"""),format.raw/*569.6*/("""

"""),format.raw/*571.1*/("""</style>
""")))}),format.raw/*572.2*/("""
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
                  DATE: Mon May 23 20:05:49 CEST 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: 7ac66dee2683844d03c2e437c4c58141cb729cec
                  MATRIX: 886->33|897->37|935->39|966->44|1029->81|1043->87|1114->138|1949->946|2017->998|2057->1000|2124->1039|2166->1054|2181->1060|2246->1103|2278->1107|2296->1115|2323->1120|2353->1121|2429->1166|2492->1201|2663->1345|2678->1351|2719->1371|2942->1567|2957->1573|3011->1606|3104->1672|3119->1678|3164->1702|3361->1897|3419->2001|3476->2064|3533->2153|3595->2269|3652->2303|3710->2343|3767->2406|3825->2446|3878->2481|3928->2503|4529->3076|4545->3082|4609->3124|4650->3137|4666->3143|4730->3185|6792->5219|6808->5225|6872->5267|6913->5280|6929->5286|6993->5328|9050->7357|9066->7363|9130->7405|9171->7418|9187->7424|9251->7466|11308->9495|11324->9501|11388->9543|11429->9556|11445->9562|11509->9604|13904->11972|13919->11978|13980->12017|14212->12221|14228->12227|14289->12265|14522->12470|14538->12476|14599->12514|14844->12731|14860->12737|14902->12757|14962->12789|15022->12839|15063->12841|15125->12874|15164->12885|15180->12891|15255->12943|15327->12995|15341->13000|15381->13001|15443->13034|15482->13045|15498->13051|15559->13090|15666->13165|15720->13190|17020->14462|17086->14511|17127->14513|17201->14558|17501->14830|17537->14856|17577->14857|17659->14910|17749->14971|17764->14975|17792->14980|17830->14989|17847->14995|17896->15021|17963->15059|17980->15065|18052->15114|18247->15289|18261->15293|18301->15294|18383->15347|18473->15408|18488->15412|18516->15417|18554->15426|18571->15432|18620->15458|18687->15496|18704->15502|18766->15541|18973->15716|19051->15765|19353->16038|19370->16044|19419->16070|19452->16074|19467->16078|19495->16083|19526->16084|19885->16415|19922->16442|19963->16444|20065->16517|20374->16794|20472->16864|20509->16891|20550->16893|20652->16966|20961->17243|21059->17313|21096->17340|21137->17342|21239->17415|21548->17692|21646->17762|21683->17789|21724->17791|21826->17864|22135->18141|22233->18211|22270->18238|22311->18240|22413->18313|22722->18590|22820->18660|22857->18687|22898->18689|23000->18762|23309->19039|23408->19109|23734->19406|23749->19410|23778->19416|23958->19665|24048->19752|24139->19896|24229->19967|24320->20104|24410->20175|24496->20232|24846->20550|24912->20587|25597->21244|25654->21284|25695->21286|25773->21335|26089->21623|26125->21649|26165->21650|26251->21707|26341->21768|26356->21772|26384->21777|26422->21786|26439->21792|26488->21818|26555->21856|26572->21862|26644->21911|26952->22199|26966->22203|27006->22204|27092->22261|27182->22322|27197->22326|27225->22331|27263->22340|27280->22346|27329->22372|27396->22410|27413->22416|27475->22455|27795->22743|27877->22796|28191->23081|28208->23087|28257->23113|28290->23117|28305->23121|28333->23126|28364->23127|28739->23474|28777->23501|28819->23503|28925->23580|29246->23869|29348->23943|29386->23970|29428->23972|29534->24049|29855->24338|29957->24412|29995->24439|30037->24441|30143->24518|30464->24807|30566->24881|30604->24908|30646->24910|30752->24987|31073->25276|31175->25350|31213->25377|31255->25379|31361->25456|31682->25745|31784->25819|31822->25846|31864->25848|31970->25925|32291->26214|32390->26284|32728->26593|32743->26597|32772->26603|32960->26860|33054->26951|33149->27099|33243->27174|33338->27315|33432->27390|33522->27451|33896->27793|33966->27834|34762->28602|34828->28651|34869->28653|34947->28702|35263->28990|35299->29016|35339->29017|35425->29074|35515->29135|35530->29139|35558->29144|35596->29153|35613->29159|35662->29185|35729->29223|35746->29229|35818->29278|36021->29461|36035->29465|36075->29466|36161->29523|36251->29584|36266->29588|36294->29593|36332->29602|36349->29608|36398->29634|36465->29672|36482->29678|36544->29717|36759->29900|36841->29953|37155->30238|37172->30244|37221->30270|37254->30274|37269->30278|37297->30283|37328->30284|37703->30631|37741->30658|37783->30660|37889->30737|38210->31026|38312->31100|38350->31127|38392->31129|38498->31206|38819->31495|38921->31569|38959->31596|39001->31598|39107->31675|39428->31964|39530->32038|39568->32065|39610->32067|39716->32144|40037->32433|40139->32507|40177->32534|40219->32536|40325->32613|40646->32902|40748->32976|40786->33003|40828->33005|40934->33082|41255->33371|41354->33441|41692->33750|41707->33754|41736->33760|41924->34017|42018->34108|42113->34256|42207->34331|42302->34472|42396->34547|42486->34608|42860->34950|42930->34991|43437->35470|43453->35476|43516->35516|43754->35726|43770->35732|43833->35772|45766->37677|45828->37722|45868->37723|45926->37752|46126->37924|46162->37950|46202->37951|46272->37992|46362->38053|46377->38057|46405->38062|46443->38071|46460->38077|46509->38103|46576->38141|46593->38147|46665->38196|46925->38436|46939->38440|46979->38441|47049->38482|47139->38543|47154->38547|47182->38552|47220->38561|47237->38567|47286->38593|47353->38631|47370->38637|47432->38676|47704->38916|47770->38953|48036->39190|48053->39196|48102->39222|48135->39226|48150->39230|48178->39235|48209->39236|48520->39519|48557->39546|48598->39548|48688->39609|48961->39850|49047->39908|49084->39935|49125->39937|49215->39998|49488->40239|49574->40297|49611->40324|49652->40326|49742->40387|50015->40628|50101->40686|50138->40713|50179->40715|50269->40776|50542->41017|50628->41075|50665->41102|50706->41104|50796->41165|51069->41406|51155->41464|51192->41491|51233->41493|51323->41554|51596->41795|51679->41849|51739->41881|51755->41887|51806->41915|51837->41916|52183->42233|52198->42237|52227->42243|52258->42244|52414->42469|52492->42544|52571->42676|52649->42735|52728->42866|52802->42911|53030->43107|53085->43133|53402->43422|53418->43428|53479->43466|54053->44012|54113->44055|54153->44056|54211->44085|54309->44155|54325->44161|54383->44197|54425->44210|54440->44214|54493->44244|54626->44345|54676->44366|55047->44709|55097->44742|55138->44744|55188->44765|55378->44927|55392->44931|55445->44962|55567->45056|55583->45062|55641->45097|55791->45219|55805->45223|55833->45229|55904->45272|55918->45276|55961->45297|55992->45299|56084->45363|56100->45369|56157->45404|56260->45475|56302->45488|56445->45602|56475->45603|56508->45608|56556->45628|56585->45629|56615->45631|56656->45641
                  LINES: 35->2|35->2|35->2|36->3|36->3|36->3|36->3|51->18|51->18|51->18|52->19|52->19|52->19|52->19|52->19|52->19|52->19|52->19|53->20|54->21|58->25|58->25|58->25|61->28|61->28|61->28|62->29|62->29|62->29|66->33|67->34|68->35|69->36|70->37|71->38|73->40|74->41|76->43|77->44|79->46|86->53|86->53|86->53|86->53|86->53|86->53|94->61|94->61|94->61|94->61|94->61|94->61|102->69|102->69|102->69|102->69|102->69|102->69|110->77|110->77|110->77|110->77|110->77|110->77|131->98|131->98|131->98|134->101|134->101|134->101|137->104|137->104|137->104|141->108|141->108|141->108|142->109|142->109|142->109|143->110|143->110|143->110|143->110|144->111|144->111|144->111|145->112|145->112|145->112|145->112|146->113|147->114|172->139|172->139|172->139|173->140|177->144|177->144|177->144|178->145|178->145|178->145|178->145|178->145|178->145|178->145|178->145|178->145|178->145|181->148|181->148|181->148|182->149|182->149|182->149|182->149|182->149|182->149|182->149|182->149|182->149|182->149|185->152|186->153|189->156|189->156|189->156|189->156|189->156|189->156|189->156|193->160|193->160|193->160|194->161|197->164|198->165|198->165|198->165|199->166|202->169|203->170|203->170|203->170|204->171|207->174|208->175|208->175|208->175|209->176|212->179|213->180|213->180|213->180|214->181|217->184|218->185|218->185|218->185|219->186|222->189|224->191|227->194|227->194|227->194|229->196|230->197|231->198|232->199|233->200|234->201|235->202|241->208|242->209|255->222|255->222|255->222|256->223|260->227|260->227|260->227|261->228|261->228|261->228|261->228|261->228|261->228|261->228|261->228|261->228|261->228|264->231|264->231|264->231|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|268->235|269->236|272->239|272->239|272->239|272->239|272->239|272->239|272->239|276->243|276->243|276->243|277->244|280->247|281->248|281->248|281->248|282->249|285->252|286->253|286->253|286->253|287->254|290->257|291->258|291->258|291->258|292->259|295->262|296->263|296->263|296->263|297->264|300->267|301->268|301->268|301->268|302->269|305->272|307->274|310->277|310->277|310->277|312->279|313->280|314->281|315->282|316->283|317->284|318->285|324->291|325->292|340->307|340->307|340->307|341->308|345->312|345->312|345->312|346->313|346->313|346->313|346->313|346->313|346->313|346->313|346->313|346->313|346->313|349->316|349->316|349->316|350->317|350->317|350->317|350->317|350->317|350->317|350->317|350->317|350->317|350->317|353->320|354->321|357->324|357->324|357->324|357->324|357->324|357->324|357->324|361->328|361->328|361->328|362->329|365->332|366->333|366->333|366->333|367->334|370->337|371->338|371->338|371->338|372->339|375->342|376->343|376->343|376->343|377->344|380->347|381->348|381->348|381->348|382->349|385->352|386->353|386->353|386->353|387->354|390->357|392->359|395->362|395->362|395->362|397->364|398->365|399->366|400->367|401->368|402->369|403->370|409->376|410->377|424->391|424->391|424->391|427->394|427->394|427->394|466->433|466->433|466->433|467->434|470->437|470->437|470->437|471->438|471->438|471->438|471->438|471->438|471->438|471->438|471->438|471->438|471->438|474->441|474->441|474->441|475->442|475->442|475->442|475->442|475->442|475->442|475->442|475->442|475->442|475->442|478->445|479->446|482->449|482->449|482->449|482->449|482->449|482->449|482->449|486->453|486->453|486->453|487->454|490->457|491->458|491->458|491->458|492->459|495->462|496->463|496->463|496->463|497->464|500->467|501->468|501->468|501->468|502->469|505->472|506->473|506->473|506->473|507->474|510->477|511->478|511->478|511->478|512->479|515->482|517->484|517->484|517->484|517->484|517->484|522->489|522->489|522->489|522->489|525->492|526->493|527->494|528->495|529->496|530->497|535->502|537->504|545->512|545->512|545->512|563->530|563->530|563->530|564->531|565->532|565->532|565->532|565->532|565->532|565->532|567->534|568->535|581->548|581->548|581->548|582->549|584->551|584->551|584->551|585->552|585->552|585->552|587->554|587->554|587->554|588->555|588->555|588->555|588->555|589->556|589->556|589->556|591->558|592->559|600->567|600->567|601->568|602->569|602->569|604->571|605->572
                  -- GENERATED --
              */
          