
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
                    <div class="col"><a href="#"><img src='"""),_display_(/*391.61*/routes/*391.67*/.Assets.versioned("images/slika1.jpeg")),format.raw/*391.106*/("""' alt="offer banner3"></a></div>
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
                        """),_display_(/*430.26*/for(item <- models.Item.getLastTenProducts()) yield /*430.71*/{_display_(Seq[Any](format.raw/*430.72*/("""
                            """),format.raw/*431.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*434.38*/if(item.images.size() > 0)/*434.64*/{_display_(Seq[Any](format.raw/*434.65*/("""
                                        """),format.raw/*435.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*435.102*/item/*435.106*/.name),format.raw/*435.111*/("""" href=""""),_display_(/*435.120*/routes/*435.126*/.Items.itemRender(item.id)),format.raw/*435.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*435.190*/models/*435.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*435.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*438.38*/else/*438.42*/{_display_(Seq[Any](format.raw/*438.43*/("""
                                        """),format.raw/*439.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*439.102*/item/*439.106*/.name),format.raw/*439.111*/("""" href='"""),_display_(/*439.120*/routes/*439.126*/.Items.itemRender(item.id)),format.raw/*439.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*439.190*/routes/*439.196*/.Assets.versioned("images/product.png")),format.raw/*439.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*442.38*/("""
                                    """),format.raw/*443.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*446.106*/routes/*446.112*/.Items.itemRender(item.id)),format.raw/*446.138*/(""""> """),_display_(/*446.142*/item/*446.146*/.name),format.raw/*446.151*/(""" """),format.raw/*446.152*/("""</a> </div>
                                            <div class="item-content">
                                                <div class="rating">
                                                    <div class="ratings">
                                                        """),_display_(/*450.58*/if(item.average_Grade == 1)/*450.85*/ {_display_(Seq[Any](format.raw/*450.87*/("""
                                                            """),format.raw/*451.61*/("""<div class="rating-box">
                                                                <div class="rating1"></div>
                                                            </div>
                                                        """)))}),format.raw/*454.58*/("""
                                                        """),_display_(/*455.58*/if(item.average_Grade == 2)/*455.85*/ {_display_(Seq[Any](format.raw/*455.87*/("""
                                                            """),format.raw/*456.61*/("""<div class="rating-box">
                                                                <div class="rating2"></div>
                                                            </div>
                                                        """)))}),format.raw/*459.58*/("""
                                                        """),_display_(/*460.58*/if(item.average_Grade == 3)/*460.85*/ {_display_(Seq[Any](format.raw/*460.87*/("""
                                                            """),format.raw/*461.61*/("""<div class="rating-box">
                                                                <div class="rating3"></div>
                                                            </div>
                                                        """)))}),format.raw/*464.58*/("""
                                                        """),_display_(/*465.58*/if(item.average_Grade == 4)/*465.85*/ {_display_(Seq[Any](format.raw/*465.87*/("""
                                                            """),format.raw/*466.61*/("""<div class="rating-box">
                                                                <div class="rating4"></div>
                                                            </div>
                                                        """)))}),format.raw/*469.58*/("""
                                                        """),_display_(/*470.58*/if(item.average_Grade == 5)/*470.85*/ {_display_(Seq[Any](format.raw/*470.87*/("""
                                                            """),format.raw/*471.61*/("""<div class="rating-box">
                                                                <div class="rating5"></div>
                                                            </div>
                                                        """)))}),format.raw/*474.58*/("""
                                                        """),_display_(/*475.58*/if(item.average_Grade == 0)/*475.85*/ {_display_(Seq[Any](format.raw/*475.87*/("""
                                                            """),format.raw/*476.61*/("""<div class="rating-box">
                                                                <div class="rating0"></div>
                                                            </div>
                                                        """)))}),format.raw/*479.58*/("""

                                                    """),format.raw/*481.53*/("""<p class="rating-links">Ukupno """),_display_(/*481.85*/Review/*481.91*/.getNumberOfReviews(item.id)),format.raw/*481.119*/(""" """),format.raw/*481.120*/("""ocjena</p>

                                                    </div>
                                                </div>
                                            <div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*486.123*/item/*486.127*/.price),format.raw/*486.133*/(""" """),format.raw/*486.134*/("""KM </span> </span> </div>
                                            </div>

                                                """),format.raw/*489.148*/("""
                                                """),format.raw/*490.75*/("""
                                                """),format.raw/*491.132*/("""
                                                """),format.raw/*492.59*/("""
                                                """),format.raw/*493.131*/("""
                                            """),format.raw/*494.45*/("""</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*499.26*/("""

                        """),format.raw/*501.25*/("""</div>
                    </div>
                </div>
            </section>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col"><a href="#"><img src='"""),_display_(/*509.61*/routes/*509.67*/.Assets.versioned("images/slika2.png")),format.raw/*509.105*/("""' alt="offer banner3"></a></div>
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
                        """),_display_(/*527.26*/for(user <- models.AppUser.usersWithLogo()) yield /*527.69*/{_display_(Seq[Any](format.raw/*527.70*/("""
                            """),format.raw/*528.29*/("""<!-- Item -->
                            <div class="item"><a href=""""),_display_(/*529.57*/routes/*529.63*/.Partners.partnerPageRender(user.id)),format.raw/*529.99*/(""""><img src='"""),_display_(/*529.112*/user/*529.116*/.images.get(0).getSize(178,77)),format.raw/*529.146*/("""' alt="Image"></a> </div>
                                <!-- End Item -->
                        """)))}),format.raw/*531.26*/("""
                    """),format.raw/*532.21*/("""</div>
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
                """),_display_(/*545.18*/for(news <- models.News.lastNews) yield /*545.51*/ {_display_(Seq[Any](format.raw/*545.53*/("""
                    """),format.raw/*546.21*/("""<div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                        <div class="blog_inner">
                            <div class="blog-img"> <img src='"""),_display_(/*548.63*/news/*548.67*/.images.get(0).getSize(780,420)),format.raw/*548.98*/("""' alt="Blog image">
                                <div class="mask"> <a class="info" href=""""),_display_(/*549.75*/routes/*549.81*/.NewsController.newsRender(news.id)),format.raw/*549.116*/("""">Pročitaj više</a> </div>
                            </div>
                            <h3><a href="blog_detail.html">"""),_display_(/*551.61*/news/*551.65*/.title),format.raw/*551.71*/("""</a> </h3>
                            <p>"""),_display_(/*552.33*/news/*552.37*/.text.substring(0,70)),format.raw/*552.58*/("""  """),format.raw/*552.60*/("""... </p>
                            <a class="readmore" href=""""),_display_(/*553.56*/routes/*553.62*/.NewsController.newsRender(news.id)),format.raw/*553.97*/("""">Pročitaj više</a> </div>
                    </div>
                """)))}),format.raw/*555.18*/("""
            """),format.raw/*556.13*/("""</div>

        </div>
    </section>
    <!-- End Latest Blog -->
<style>


    .box-content li:hover .level0_455"""),format.raw/*564.38*/("""{"""),format.raw/*564.39*/("""
    """),format.raw/*565.5*/("""display: block;
    """),format.raw/*566.5*/("""}"""),format.raw/*566.6*/("""

"""),format.raw/*568.1*/("""</style>
""")))}),format.raw/*569.2*/("""
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
                  DATE: Mon May 16 19:08:40 CEST 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: fdcced8557c6f85481db232e82884b6d4374b8c8
                  MATRIX: 886->33|897->37|935->39|966->44|1029->81|1043->87|1114->138|1949->946|2017->998|2057->1000|2124->1039|2166->1054|2181->1060|2246->1103|2278->1107|2296->1115|2323->1120|2353->1121|2429->1166|2492->1201|2663->1345|2678->1351|2719->1371|2942->1567|2957->1573|3011->1606|3104->1672|3119->1678|3164->1702|3361->1897|3419->2001|3476->2064|3533->2153|3595->2269|3652->2303|3710->2343|3767->2406|3825->2446|3878->2481|3928->2503|4529->3076|4545->3082|4609->3124|4650->3137|4666->3143|4730->3185|6792->5219|6808->5225|6872->5267|6913->5280|6929->5286|6993->5328|9050->7357|9066->7363|9130->7405|9171->7418|9187->7424|9251->7466|11308->9495|11324->9501|11388->9543|11429->9556|11445->9562|11509->9604|13904->11972|13919->11978|13980->12017|14212->12221|14228->12227|14289->12265|14522->12470|14538->12476|14599->12514|14844->12731|14860->12737|14902->12757|14962->12789|15022->12839|15063->12841|15125->12874|15164->12885|15180->12891|15255->12943|15327->12995|15341->13000|15381->13001|15443->13034|15482->13045|15498->13051|15559->13090|15666->13165|15720->13190|17020->14462|17086->14511|17127->14513|17201->14558|17501->14830|17537->14856|17577->14857|17659->14910|17749->14971|17764->14975|17792->14980|17830->14989|17847->14995|17896->15021|17963->15059|17980->15065|18052->15114|18247->15289|18261->15293|18301->15294|18383->15347|18473->15408|18488->15412|18516->15417|18554->15426|18571->15432|18620->15458|18687->15496|18704->15502|18766->15541|18973->15716|19051->15765|19353->16038|19370->16044|19419->16070|19452->16074|19467->16078|19495->16083|19526->16084|19885->16415|19922->16442|19963->16444|20065->16517|20374->16794|20472->16864|20509->16891|20550->16893|20652->16966|20961->17243|21059->17313|21096->17340|21137->17342|21239->17415|21548->17692|21646->17762|21683->17789|21724->17791|21826->17864|22135->18141|22233->18211|22270->18238|22311->18240|22413->18313|22722->18590|22820->18660|22857->18687|22898->18689|23000->18762|23309->19039|23408->19109|23734->19406|23749->19410|23778->19416|23958->19665|24048->19752|24139->19896|24229->19967|24320->20104|24410->20175|24496->20232|24846->20550|24912->20587|25597->21244|25654->21284|25695->21286|25773->21335|26089->21623|26125->21649|26165->21650|26251->21707|26341->21768|26356->21772|26384->21777|26422->21786|26439->21792|26488->21818|26555->21856|26572->21862|26644->21911|26952->22199|26966->22203|27006->22204|27092->22261|27182->22322|27197->22326|27225->22331|27263->22340|27280->22346|27329->22372|27396->22410|27413->22416|27475->22455|27795->22743|27877->22796|28191->23081|28208->23087|28257->23113|28290->23117|28305->23121|28333->23126|28364->23127|28739->23474|28777->23501|28819->23503|28925->23580|29246->23869|29348->23943|29386->23970|29428->23972|29534->24049|29855->24338|29957->24412|29995->24439|30037->24441|30143->24518|30464->24807|30566->24881|30604->24908|30646->24910|30752->24987|31073->25276|31175->25350|31213->25377|31255->25379|31361->25456|31682->25745|31784->25819|31822->25846|31864->25848|31970->25925|32291->26214|32390->26284|32728->26593|32743->26597|32772->26603|32960->26860|33054->26951|33149->27099|33243->27174|33338->27315|33432->27390|33522->27451|33896->27793|33966->27834|34762->28602|34828->28651|34869->28653|34947->28702|35263->28990|35299->29016|35339->29017|35425->29074|35515->29135|35530->29139|35558->29144|35596->29153|35613->29159|35662->29185|35729->29223|35746->29229|35818->29278|36021->29461|36035->29465|36075->29466|36161->29523|36251->29584|36266->29588|36294->29593|36332->29602|36349->29608|36398->29634|36465->29672|36482->29678|36544->29717|36759->29900|36841->29953|37155->30238|37172->30244|37221->30270|37254->30274|37269->30278|37297->30283|37328->30284|37703->30631|37741->30658|37783->30660|37889->30737|38210->31026|38312->31100|38350->31127|38392->31129|38498->31206|38819->31495|38921->31569|38959->31596|39001->31598|39107->31675|39428->31964|39530->32038|39568->32065|39610->32067|39716->32144|40037->32433|40139->32507|40177->32534|40219->32536|40325->32613|40646->32902|40748->32976|40786->33003|40828->33005|40934->33082|41255->33371|41354->33441|41692->33750|41707->33754|41736->33760|41924->34017|42018->34108|42113->34256|42207->34331|42302->34472|42396->34547|42486->34608|42860->34950|42930->34991|43411->35444|43427->35450|43489->35489|45422->37394|45484->37439|45524->37440|45582->37469|45782->37641|45818->37667|45858->37668|45928->37709|46018->37770|46033->37774|46061->37779|46099->37788|46116->37794|46165->37820|46232->37858|46249->37864|46321->37913|46581->38153|46595->38157|46635->38158|46705->38199|46795->38260|46810->38264|46838->38269|46876->38278|46893->38284|46942->38310|47009->38348|47026->38354|47088->38393|47360->38633|47426->38670|47692->38907|47709->38913|47758->38939|47791->38943|47806->38947|47834->38952|47865->38953|48176->39236|48213->39263|48254->39265|48344->39326|48617->39567|48703->39625|48740->39652|48781->39654|48871->39715|49144->39956|49230->40014|49267->40041|49308->40043|49398->40104|49671->40345|49757->40403|49794->40430|49835->40432|49925->40493|50198->40734|50284->40792|50321->40819|50362->40821|50452->40882|50725->41123|50811->41181|50848->41208|50889->41210|50979->41271|51252->41512|51335->41566|51395->41598|51411->41604|51462->41632|51493->41633|51839->41950|51854->41954|51883->41960|51914->41961|52070->42186|52148->42261|52227->42393|52305->42452|52384->42583|52458->42628|52686->42824|52741->42850|53058->43139|53074->43145|53135->43183|53709->43729|53769->43772|53809->43773|53867->43802|53965->43872|53981->43878|54039->43914|54081->43927|54096->43931|54149->43961|54282->44062|54332->44083|54703->44426|54753->44459|54794->44461|54844->44482|55034->44644|55048->44648|55101->44679|55223->44773|55239->44779|55297->44814|55447->44936|55461->44940|55489->44946|55560->44989|55574->44993|55617->45014|55648->45016|55740->45080|55756->45086|55813->45121|55916->45192|55958->45205|56101->45319|56131->45320|56164->45325|56212->45345|56241->45346|56271->45348|56312->45358
                  LINES: 35->2|35->2|35->2|36->3|36->3|36->3|36->3|51->18|51->18|51->18|52->19|52->19|52->19|52->19|52->19|52->19|52->19|52->19|53->20|54->21|58->25|58->25|58->25|61->28|61->28|61->28|62->29|62->29|62->29|66->33|67->34|68->35|69->36|70->37|71->38|73->40|74->41|76->43|77->44|79->46|86->53|86->53|86->53|86->53|86->53|86->53|94->61|94->61|94->61|94->61|94->61|94->61|102->69|102->69|102->69|102->69|102->69|102->69|110->77|110->77|110->77|110->77|110->77|110->77|131->98|131->98|131->98|134->101|134->101|134->101|137->104|137->104|137->104|141->108|141->108|141->108|142->109|142->109|142->109|143->110|143->110|143->110|143->110|144->111|144->111|144->111|145->112|145->112|145->112|145->112|146->113|147->114|172->139|172->139|172->139|173->140|177->144|177->144|177->144|178->145|178->145|178->145|178->145|178->145|178->145|178->145|178->145|178->145|178->145|181->148|181->148|181->148|182->149|182->149|182->149|182->149|182->149|182->149|182->149|182->149|182->149|182->149|185->152|186->153|189->156|189->156|189->156|189->156|189->156|189->156|189->156|193->160|193->160|193->160|194->161|197->164|198->165|198->165|198->165|199->166|202->169|203->170|203->170|203->170|204->171|207->174|208->175|208->175|208->175|209->176|212->179|213->180|213->180|213->180|214->181|217->184|218->185|218->185|218->185|219->186|222->189|224->191|227->194|227->194|227->194|229->196|230->197|231->198|232->199|233->200|234->201|235->202|241->208|242->209|255->222|255->222|255->222|256->223|260->227|260->227|260->227|261->228|261->228|261->228|261->228|261->228|261->228|261->228|261->228|261->228|261->228|264->231|264->231|264->231|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|268->235|269->236|272->239|272->239|272->239|272->239|272->239|272->239|272->239|276->243|276->243|276->243|277->244|280->247|281->248|281->248|281->248|282->249|285->252|286->253|286->253|286->253|287->254|290->257|291->258|291->258|291->258|292->259|295->262|296->263|296->263|296->263|297->264|300->267|301->268|301->268|301->268|302->269|305->272|307->274|310->277|310->277|310->277|312->279|313->280|314->281|315->282|316->283|317->284|318->285|324->291|325->292|340->307|340->307|340->307|341->308|345->312|345->312|345->312|346->313|346->313|346->313|346->313|346->313|346->313|346->313|346->313|346->313|346->313|349->316|349->316|349->316|350->317|350->317|350->317|350->317|350->317|350->317|350->317|350->317|350->317|350->317|353->320|354->321|357->324|357->324|357->324|357->324|357->324|357->324|357->324|361->328|361->328|361->328|362->329|365->332|366->333|366->333|366->333|367->334|370->337|371->338|371->338|371->338|372->339|375->342|376->343|376->343|376->343|377->344|380->347|381->348|381->348|381->348|382->349|385->352|386->353|386->353|386->353|387->354|390->357|392->359|395->362|395->362|395->362|397->364|398->365|399->366|400->367|401->368|402->369|403->370|409->376|410->377|424->391|424->391|424->391|463->430|463->430|463->430|464->431|467->434|467->434|467->434|468->435|468->435|468->435|468->435|468->435|468->435|468->435|468->435|468->435|468->435|471->438|471->438|471->438|472->439|472->439|472->439|472->439|472->439|472->439|472->439|472->439|472->439|472->439|475->442|476->443|479->446|479->446|479->446|479->446|479->446|479->446|479->446|483->450|483->450|483->450|484->451|487->454|488->455|488->455|488->455|489->456|492->459|493->460|493->460|493->460|494->461|497->464|498->465|498->465|498->465|499->466|502->469|503->470|503->470|503->470|504->471|507->474|508->475|508->475|508->475|509->476|512->479|514->481|514->481|514->481|514->481|514->481|519->486|519->486|519->486|519->486|522->489|523->490|524->491|525->492|526->493|527->494|532->499|534->501|542->509|542->509|542->509|560->527|560->527|560->527|561->528|562->529|562->529|562->529|562->529|562->529|562->529|564->531|565->532|578->545|578->545|578->545|579->546|581->548|581->548|581->548|582->549|582->549|582->549|584->551|584->551|584->551|585->552|585->552|585->552|585->552|586->553|586->553|586->553|588->555|589->556|597->564|597->564|598->565|599->566|599->566|601->568|602->569
                  -- GENERATED --
              */
          