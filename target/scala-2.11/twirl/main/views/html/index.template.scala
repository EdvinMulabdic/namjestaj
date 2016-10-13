
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
                """),_display_(/*98.18*/if(Banner.findBannerByPosition(1) != null)/*98.60*/ {_display_(Seq[Any](format.raw/*98.62*/("""
                    """),format.raw/*99.21*/("""<div class="col"><a href=""""),_display_(/*99.48*/Banner/*99.54*/.findBannerByPosition(1).link),format.raw/*99.83*/(""""><img src='"""),_display_(/*99.96*/Banner/*99.102*/.findBannerByPosition(1).image),format.raw/*99.132*/("""'alt="offer banner3"></a></div>
                """)))}/*100.18*/else/*100.22*/{_display_(Seq[Any](format.raw/*100.23*/("""
                    """),format.raw/*101.21*/("""<div class="col"><a href=""""),_display_(/*101.48*/routes/*101.54*/.ContactUs.contactUsRender()),format.raw/*101.82*/(""""><img src='"""),_display_(/*101.95*/routes/*101.101*/.Assets.versioned("images/bannerDefault.png")),format.raw/*101.146*/("""' alt="offer banner3"></a></div>
                """)))}),format.raw/*102.18*/("""
            """),format.raw/*103.13*/("""</div>

            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                """),_display_(/*106.18*/if(Banner.findBannerByPosition(2) != null)/*106.60*/ {_display_(Seq[Any](format.raw/*106.62*/("""
                    """),format.raw/*107.21*/("""<div class="col"><a href=""""),_display_(/*107.48*/Banner/*107.54*/.findBannerByPosition(2).link),format.raw/*107.83*/(""""><img src='"""),_display_(/*107.96*/Banner/*107.102*/.findBannerByPosition(2).image),format.raw/*107.132*/("""'alt="offer banner3"></a></div>
                """)))}/*108.18*/else/*108.22*/{_display_(Seq[Any](format.raw/*108.23*/("""
                    """),format.raw/*109.21*/("""<div class="col"><a href=""""),_display_(/*109.48*/routes/*109.54*/.ContactUs.contactUsRender()),format.raw/*109.82*/(""""><img src='"""),_display_(/*109.95*/routes/*109.101*/.Assets.versioned("images/bannerDefault.png")),format.raw/*109.146*/("""' alt="offer banner3"></a></div>
                """)))}),format.raw/*110.18*/("""
            """),format.raw/*111.13*/("""</div>

            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                """),_display_(/*114.18*/if(Banner.findBannerByPosition(3) != null)/*114.60*/ {_display_(Seq[Any](format.raw/*114.62*/("""
                    """),format.raw/*115.21*/("""<div class="col"><a href=""""),_display_(/*115.48*/Banner/*115.54*/.findBannerByPosition(3).link),format.raw/*115.83*/(""""><img src='"""),_display_(/*115.96*/Banner/*115.102*/.findBannerByPosition(3).image),format.raw/*115.132*/("""'alt="offer banner3"></a></div>
                """)))}/*116.18*/else/*116.22*/{_display_(Seq[Any](format.raw/*116.23*/("""
                    """),format.raw/*117.21*/("""<div class="col"><a href=""""),_display_(/*117.48*/routes/*117.54*/.ContactUs.contactUsRender()),format.raw/*117.82*/(""""><img src='"""),_display_(/*117.95*/routes/*117.101*/.Assets.versioned("images/bannerDefault.png")),format.raw/*117.146*/("""' alt="offer banner3"></a></div>
                """)))}),format.raw/*118.18*/("""
            """),format.raw/*119.13*/("""</div>
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 wow bounceup animated">
                """),_display_(/*121.18*/if(Banner.findBannerByPosition(4) != null)/*121.60*/ {_display_(Seq[Any](format.raw/*121.62*/("""
                    """),format.raw/*122.21*/("""<div class="col"><a href=""""),_display_(/*122.48*/Banner/*122.54*/.findBannerByPosition(4).link),format.raw/*122.83*/(""""><img src='"""),_display_(/*122.96*/Banner/*122.102*/.findBannerByPosition(4).image),format.raw/*122.132*/("""'alt="offer banner3"></a></div>
                """)))}/*123.18*/else/*123.22*/{_display_(Seq[Any](format.raw/*123.23*/("""
                    """),format.raw/*124.21*/("""<div class="col"><a href=""""),_display_(/*124.48*/routes/*124.54*/.ContactUs.contactUsRender()),format.raw/*124.82*/(""""><img src='"""),_display_(/*124.95*/routes/*124.101*/.Assets.versioned("images/bannerDefault.png")),format.raw/*124.146*/("""' alt="offer banner3"></a></div>
                """)))}),format.raw/*125.18*/("""
            """),format.raw/*126.13*/("""</div>

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
                                    """),_display_(/*149.38*/for(item <- models.Item.itemsForHomepageSlider()) yield /*149.87*/ {_display_(Seq[Any](format.raw/*149.89*/("""
                                            """),format.raw/*150.45*/("""<!-- Item -->
                                        <div class="col-md-12 item">
                                            <div class="item-inner">
                                                <div class="item-img">
                                                """),_display_(/*154.50*/if(item.images.size() > 0)/*154.76*/{_display_(Seq[Any](format.raw/*154.77*/("""
                                                    """),format.raw/*155.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*155.114*/item/*155.118*/.name),format.raw/*155.123*/("""" href=""""),_display_(/*155.132*/routes/*155.138*/.Items.itemRender(item.id)),format.raw/*155.164*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*155.202*/models/*155.208*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*155.257*/("""'> </a>

                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}/*158.50*/else/*158.54*/{_display_(Seq[Any](format.raw/*158.55*/("""
                                                    """),format.raw/*159.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*159.114*/item/*159.118*/.name),format.raw/*159.123*/("""" href='"""),_display_(/*159.132*/routes/*159.138*/.Items.itemRender(item.id)),format.raw/*159.164*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*159.202*/routes/*159.208*/.Assets.versioned("images/product.png")),format.raw/*159.247*/("""'> </a>

                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}),format.raw/*162.50*/("""
                                                """),format.raw/*163.49*/("""</div>
                                                <div class="item-info">
                                                    <div class="info-inner">
                                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*166.118*/routes/*166.124*/.Items.itemRender(item.id)),format.raw/*166.150*/(""""> """),_display_(/*166.154*/item/*166.158*/.name),format.raw/*166.163*/(""" """),format.raw/*166.164*/("""</a> </div>
                                                        <div class="item-content">
                                                            <div class="rating">
                                                                <div class="ratings">
                                                                    """),_display_(/*170.70*/if(item.average_Grade == 1)/*170.97*/ {_display_(Seq[Any](format.raw/*170.99*/("""
                                                                        """),format.raw/*171.73*/("""<div class="rating-box">
                                                                            <div class="rating1"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*174.70*/("""
                                                                    """),_display_(/*175.70*/if(item.average_Grade == 2)/*175.97*/ {_display_(Seq[Any](format.raw/*175.99*/("""
                                                                        """),format.raw/*176.73*/("""<div class="rating-box">
                                                                            <div class="rating2"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*179.70*/("""
                                                                    """),_display_(/*180.70*/if(item.average_Grade == 3)/*180.97*/ {_display_(Seq[Any](format.raw/*180.99*/("""
                                                                        """),format.raw/*181.73*/("""<div class="rating-box">
                                                                            <div class="rating3"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*184.70*/("""
                                                                    """),_display_(/*185.70*/if(item.average_Grade == 4)/*185.97*/ {_display_(Seq[Any](format.raw/*185.99*/("""
                                                                        """),format.raw/*186.73*/("""<div class="rating-box">
                                                                            <div class="rating4"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*189.70*/("""
                                                                    """),_display_(/*190.70*/if(item.average_Grade == 5)/*190.97*/ {_display_(Seq[Any](format.raw/*190.99*/("""
                                                                        """),format.raw/*191.73*/("""<div class="rating-box">
                                                                            <div class="rating5"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*194.70*/("""
                                                                    """),_display_(/*195.70*/if(item.average_Grade == 0)/*195.97*/ {_display_(Seq[Any](format.raw/*195.99*/("""
                                                                        """),format.raw/*196.73*/("""<div class="rating-box">
                                                                            <div class="rating0"></div>
                                                                        </div>
                                                                    """)))}),format.raw/*199.70*/("""

                                                                    """),format.raw/*201.69*/("""</div>
                                                            </div>
                                                            <div class="item-price">
                                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*204.139*/item/*204.143*/.price),format.raw/*204.149*/("""</span> </span> </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- End Item -->
                                    """)))}),format.raw/*212.38*/("""
                                    """),format.raw/*213.37*/("""</div>
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
                                        """),_display_(/*226.42*/for(item <- models.Item.topRatedItems()) yield /*226.82*/ {_display_(Seq[Any](format.raw/*226.84*/("""
                                                """),format.raw/*227.49*/("""<!-- Item -->
                                            <div class="col-md-12 item">
                                                <div class="item-inner">
                                                    <div class="item-img">
                                                    """),_display_(/*231.54*/if(item.images.size() > 0)/*231.80*/{_display_(Seq[Any](format.raw/*231.81*/("""
                                                        """),format.raw/*232.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*232.118*/item/*232.122*/.name),format.raw/*232.127*/("""" href=""""),_display_(/*232.136*/routes/*232.142*/.Items.itemRender(item.id)),format.raw/*232.168*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*232.206*/models/*232.212*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*232.261*/("""'> </a>
                                                            <div class="new-label new-top-left">new</div>
                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}/*235.54*/else/*235.58*/{_display_(Seq[Any](format.raw/*235.59*/("""
                                                        """),format.raw/*236.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*236.118*/item/*236.122*/.name),format.raw/*236.127*/("""" href='"""),_display_(/*236.136*/routes/*236.142*/.Items.itemRender(item.id)),format.raw/*236.168*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*236.206*/routes/*236.212*/.Assets.versioned("images/product.png")),format.raw/*236.251*/("""'> </a>
                                                            <div class="new-label new-top-left">new</div>
                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}),format.raw/*239.54*/("""
                                                    """),format.raw/*240.53*/("""</div>
                                                    <div class="item-info">
                                                        <div class="info-inner">
                                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*243.122*/routes/*243.128*/.Items.itemRender(item.id)),format.raw/*243.154*/(""""> """),_display_(/*243.158*/item/*243.162*/.name),format.raw/*243.167*/(""" """),format.raw/*243.168*/("""</a> </div>
                                                            <div class="item-content">
                                                                <div class="rating">
                                                                    <div class="ratings">
                                                                        """),_display_(/*247.74*/if(item.average_Grade == 1)/*247.101*/ {_display_(Seq[Any](format.raw/*247.103*/("""
                                                                            """),format.raw/*248.77*/("""<div class="rating-box">
                                                                                <div class="rating1"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*251.74*/("""
                                                                        """),_display_(/*252.74*/if(item.average_Grade == 2)/*252.101*/ {_display_(Seq[Any](format.raw/*252.103*/("""
                                                                            """),format.raw/*253.77*/("""<div class="rating-box">
                                                                                <div class="rating2"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*256.74*/("""
                                                                        """),_display_(/*257.74*/if(item.average_Grade == 3)/*257.101*/ {_display_(Seq[Any](format.raw/*257.103*/("""
                                                                            """),format.raw/*258.77*/("""<div class="rating-box">
                                                                                <div class="rating3"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*261.74*/("""
                                                                        """),_display_(/*262.74*/if(item.average_Grade == 4)/*262.101*/ {_display_(Seq[Any](format.raw/*262.103*/("""
                                                                            """),format.raw/*263.77*/("""<div class="rating-box">
                                                                                <div class="rating4"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*266.74*/("""
                                                                        """),_display_(/*267.74*/if(item.average_Grade == 5)/*267.101*/ {_display_(Seq[Any](format.raw/*267.103*/("""
                                                                            """),format.raw/*268.77*/("""<div class="rating-box">
                                                                                <div class="rating5"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*271.74*/("""
                                                                        """),_display_(/*272.74*/if(item.average_Grade == 0)/*272.101*/ {_display_(Seq[Any](format.raw/*272.103*/("""
                                                                            """),format.raw/*273.77*/("""<div class="rating-box">
                                                                                <div class="rating0"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*276.74*/("""

                                                                    """),format.raw/*278.69*/("""</div>
                                                                </div>
                                                                <div class="item-price">
                                                                    <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*281.143*/item/*281.147*/.price),format.raw/*281.153*/("""</span> </span> </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                                <!-- End Item -->
                                        """)))}),format.raw/*289.42*/("""
                                        """),format.raw/*290.41*/("""</div>
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
                                        """),_display_(/*305.42*/for(item <- models.Item.allActiveItemsShuffled()) yield /*305.91*/ {_display_(Seq[Any](format.raw/*305.93*/("""
                                                """),format.raw/*306.49*/("""<!-- Item -->
                                            <div class="col-md-12 item">
                                                <div class="item-inner">
                                                    <div class="item-img">
                                                    """),_display_(/*310.54*/if(item.images.size() > 0)/*310.80*/{_display_(Seq[Any](format.raw/*310.81*/("""
                                                        """),format.raw/*311.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*311.118*/item/*311.122*/.name),format.raw/*311.127*/("""" href=""""),_display_(/*311.136*/routes/*311.142*/.Items.itemRender(item.id)),format.raw/*311.168*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*311.206*/models/*311.212*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*311.261*/("""'> </a>

                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}/*314.54*/else/*314.58*/{_display_(Seq[Any](format.raw/*314.59*/("""
                                                        """),format.raw/*315.57*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*315.118*/item/*315.122*/.name),format.raw/*315.127*/("""" href='"""),_display_(/*315.136*/routes/*315.142*/.Items.itemRender(item.id)),format.raw/*315.168*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*315.206*/routes/*315.212*/.Assets.versioned("images/product.png")),format.raw/*315.251*/("""'> </a>

                                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                    """)))}),format.raw/*318.54*/("""
                                                    """),format.raw/*319.53*/("""</div>
                                                    <div class="item-info">
                                                        <div class="info-inner">
                                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*322.122*/routes/*322.128*/.Items.itemRender(item.id)),format.raw/*322.154*/(""""> """),_display_(/*322.158*/item/*322.162*/.name),format.raw/*322.167*/(""" """),format.raw/*322.168*/("""</a> </div>
                                                            <div class="item-content">
                                                                <div class="rating">
                                                                    <div class="ratings">
                                                                        """),_display_(/*326.74*/if(item.average_Grade == 1)/*326.101*/ {_display_(Seq[Any](format.raw/*326.103*/("""
                                                                            """),format.raw/*327.77*/("""<div class="rating-box">
                                                                                <div class="rating1"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*330.74*/("""
                                                                        """),_display_(/*331.74*/if(item.average_Grade == 2)/*331.101*/ {_display_(Seq[Any](format.raw/*331.103*/("""
                                                                            """),format.raw/*332.77*/("""<div class="rating-box">
                                                                                <div class="rating2"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*335.74*/("""
                                                                        """),_display_(/*336.74*/if(item.average_Grade == 3)/*336.101*/ {_display_(Seq[Any](format.raw/*336.103*/("""
                                                                            """),format.raw/*337.77*/("""<div class="rating-box">
                                                                                <div class="rating3"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*340.74*/("""
                                                                        """),_display_(/*341.74*/if(item.average_Grade == 4)/*341.101*/ {_display_(Seq[Any](format.raw/*341.103*/("""
                                                                            """),format.raw/*342.77*/("""<div class="rating-box">
                                                                                <div class="rating4"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*345.74*/("""
                                                                        """),_display_(/*346.74*/if(item.average_Grade == 5)/*346.101*/ {_display_(Seq[Any](format.raw/*346.103*/("""
                                                                            """),format.raw/*347.77*/("""<div class="rating-box">
                                                                                <div class="rating5"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*350.74*/("""
                                                                        """),_display_(/*351.74*/if(item.average_Grade == 0)/*351.101*/ {_display_(Seq[Any](format.raw/*351.103*/("""
                                                                            """),format.raw/*352.77*/("""<div class="rating-box">
                                                                                <div class="rating0"></div>
                                                                            </div>
                                                                        """)))}),format.raw/*355.74*/("""

                                                                    """),format.raw/*357.69*/("""</div>
                                                                </div>
                                                                <div class="item-price">
                                                                    <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*360.143*/item/*360.147*/.price),format.raw/*360.153*/("""</span> </span> </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                                <!-- End Item -->
                                        """)))}),format.raw/*368.42*/("""
                                        """),format.raw/*369.41*/("""</div>
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
	                """),_display_(/*383.19*/if(Banner.findBannerByPosition(5) != null)/*383.61*/ {_display_(Seq[Any](format.raw/*383.63*/("""
		                """),format.raw/*384.19*/("""<div class="col" style="padding-top: 35px"><a href=""""),_display_(/*384.72*/Banner/*384.78*/.findBannerByPosition(5).link),format.raw/*384.107*/(""""><img src='"""),_display_(/*384.120*/Banner/*384.126*/.findBannerByPosition(5).image),format.raw/*384.156*/("""'alt="offer banner3"></a></div>
	                """)))}/*385.19*/else/*385.23*/{_display_(Seq[Any](format.raw/*385.24*/("""
		                """),format.raw/*386.19*/("""<div class="col" style="padding-top: 35px"><a href=""""),_display_(/*386.72*/routes/*386.78*/.ContactUs.contactUsRender()),format.raw/*386.106*/(""""><img src='"""),_display_(/*386.119*/routes/*386.125*/.Assets.versioned("images/reklama1.jpg")),format.raw/*386.165*/("""' alt="offer banner3"></a></div>
	                """)))}),format.raw/*387.19*/("""
                    """),format.raw/*388.169*/("""
                """),format.raw/*389.17*/("""</div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
	                """),_display_(/*391.19*/if(Banner.findBannerByPosition(6) != null)/*391.61*/ {_display_(Seq[Any](format.raw/*391.63*/("""
		                """),format.raw/*392.19*/("""<div class="col" style="padding-top: 0px"><a href=""""),_display_(/*392.71*/Banner/*392.77*/.findBannerByPosition(6).link),format.raw/*392.106*/(""""><img src='"""),_display_(/*392.119*/Banner/*392.125*/.findBannerByPosition(5).image),format.raw/*392.155*/("""'alt="offer banner3"></a></div>
	                """)))}/*393.19*/else/*393.23*/{_display_(Seq[Any](format.raw/*393.24*/("""
		                """),format.raw/*394.19*/("""<div class="col" style="padding-top: 0px"><a href=""""),_display_(/*394.71*/routes/*394.77*/.ContactUs.contactUsRender()),format.raw/*394.105*/(""""><img src='"""),_display_(/*394.118*/routes/*394.124*/.Assets.versioned("images/reklama1.jpg")),format.raw/*394.164*/("""' alt="offer banner3"></a></div>
	                """)))}),format.raw/*395.19*/("""
                    """),format.raw/*396.168*/("""
                """),format.raw/*397.17*/("""</div>
            </div>
        </div>
    </div>

    <!--Offer Start-->
    <div class="offer-slider wow animated parallax parallax-2">
        <div class="container">
            <ul class="bxslider">
                <li>
                    <h2>Članstvo</h2>
                    <h1>PRIDRUŽITE NAM SE!</h1>
                    <p>Želite postati naš član i promovisati svoje proizvode? Klikom na link ispod saznajte kako. </p>
                    <a class="shop-now" href="#">Saznaj više</a> </li>
                <li>
                    <h2>Marketing</h2>
                    <h1>Želite li da Vaša reklama bude na našoj strnici?</h1>
                    <p>Ukoliko želite da se reklamirate na našoj stranici kliknite na link ispod i saznajte kako. </p>
                    <a class="shop-now" href="#">Saznaj više</a> </li>
                <li>
                    <h2>Kupovina</h2>
                    <h1>Želite kupiti namjestaj?</h1>
                    <p>Pronađite proizvod, kontaktirajte prodavača, bez pravljenja korisničkog naloga! </p>
                    </li>
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
                        """),_display_(/*435.26*/for(item <- models.Item.getLastTenProducts()) yield /*435.71*/{_display_(Seq[Any](format.raw/*435.72*/("""
                            """),format.raw/*436.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*439.38*/if(item.images.size() > 0)/*439.64*/{_display_(Seq[Any](format.raw/*439.65*/("""
                                        """),format.raw/*440.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*440.102*/item/*440.106*/.name),format.raw/*440.111*/("""" href=""""),_display_(/*440.120*/routes/*440.126*/.Items.itemRender(item.id)),format.raw/*440.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*440.190*/models/*440.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*440.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*443.38*/else/*443.42*/{_display_(Seq[Any](format.raw/*443.43*/("""
                                        """),format.raw/*444.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*444.102*/item/*444.106*/.name),format.raw/*444.111*/("""" href='"""),_display_(/*444.120*/routes/*444.126*/.Items.itemRender(item.id)),format.raw/*444.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*444.190*/routes/*444.196*/.Assets.versioned("images/product.png")),format.raw/*444.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*447.38*/("""
                                    """),format.raw/*448.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*451.106*/routes/*451.112*/.Items.itemRender(item.id)),format.raw/*451.138*/(""""> """),_display_(/*451.142*/item/*451.146*/.name),format.raw/*451.151*/(""" """),format.raw/*451.152*/("""</a> </div>
                                            <div class="item-content">
                                                <div class="rating">
                                                    <div class="ratings">
                                                        """),_display_(/*455.58*/if(item.average_Grade == 1)/*455.85*/ {_display_(Seq[Any](format.raw/*455.87*/("""
                                                            """),format.raw/*456.61*/("""<div class="rating-box">
                                                                <div class="rating1"></div>
                                                            </div>
                                                        """)))}),format.raw/*459.58*/("""
                                                        """),_display_(/*460.58*/if(item.average_Grade == 2)/*460.85*/ {_display_(Seq[Any](format.raw/*460.87*/("""
                                                            """),format.raw/*461.61*/("""<div class="rating-box">
                                                                <div class="rating2"></div>
                                                            </div>
                                                        """)))}),format.raw/*464.58*/("""
                                                        """),_display_(/*465.58*/if(item.average_Grade == 3)/*465.85*/ {_display_(Seq[Any](format.raw/*465.87*/("""
                                                            """),format.raw/*466.61*/("""<div class="rating-box">
                                                                <div class="rating3"></div>
                                                            </div>
                                                        """)))}),format.raw/*469.58*/("""
                                                        """),_display_(/*470.58*/if(item.average_Grade == 4)/*470.85*/ {_display_(Seq[Any](format.raw/*470.87*/("""
                                                            """),format.raw/*471.61*/("""<div class="rating-box">
                                                                <div class="rating4"></div>
                                                            </div>
                                                        """)))}),format.raw/*474.58*/("""
                                                        """),_display_(/*475.58*/if(item.average_Grade == 5)/*475.85*/ {_display_(Seq[Any](format.raw/*475.87*/("""
                                                            """),format.raw/*476.61*/("""<div class="rating-box">
                                                                <div class="rating5"></div>
                                                            </div>
                                                        """)))}),format.raw/*479.58*/("""
                                                        """),_display_(/*480.58*/if(item.average_Grade == 0)/*480.85*/ {_display_(Seq[Any](format.raw/*480.87*/("""
                                                            """),format.raw/*481.61*/("""<div class="rating-box">
                                                                <div class="rating0"></div>
                                                            </div>
                                                        """)))}),format.raw/*484.58*/("""

                                                    """),format.raw/*486.53*/("""<p class="rating-links">Ukupno """),_display_(/*486.85*/Review/*486.91*/.getNumberOfReviews(item.id)),format.raw/*486.119*/(""" """),format.raw/*486.120*/("""ocjena</p>

                                                    </div>
                                                </div>
                                            <div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*491.123*/item/*491.127*/.price),format.raw/*491.133*/(""" """),format.raw/*491.134*/("""KM </span> </span> </div>
                                            </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*498.26*/("""

                        """),format.raw/*500.25*/("""</div>
                    </div>
                </div>
            </section>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
	                """),_display_(/*508.19*/if(Banner.findBannerByPosition(7) != null)/*508.61*/ {_display_(Seq[Any](format.raw/*508.63*/("""
		                """),format.raw/*509.19*/("""<div class="col"><a href=""""),_display_(/*509.46*/Banner/*509.52*/.findBannerByPosition(7).link),format.raw/*509.81*/(""""><img src='"""),_display_(/*509.94*/Banner/*509.100*/.findBannerByPosition(7).image),format.raw/*509.130*/("""'alt="offer banner3"></a></div>
	                """)))}/*510.19*/else/*510.23*/{_display_(Seq[Any](format.raw/*510.24*/("""
		                """),format.raw/*511.19*/("""<div class="col"><a href=""""),_display_(/*511.46*/routes/*511.52*/.ContactUs.contactUsRender()),format.raw/*511.80*/(""""><img src='"""),_display_(/*511.93*/routes/*511.99*/.Assets.versioned("images/slika2.png")),format.raw/*511.137*/("""' alt="offer banner3"></a></div>
	                """)))}),format.raw/*512.19*/("""
                    """),format.raw/*513.141*/("""
                """),format.raw/*514.17*/("""</div>
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
                        """),_display_(/*531.26*/for(user <- models.AppUser.usersWithLogo()) yield /*531.69*/{_display_(Seq[Any](format.raw/*531.70*/("""
                            """),format.raw/*532.29*/("""<!-- Item -->
                            <div class="item"><a href=""""),_display_(/*533.57*/routes/*533.63*/.Partners.partnerPageRender(user.id)),format.raw/*533.99*/(""""><img src='"""),_display_(/*533.112*/user/*533.116*/.images.get(0).getSize(178,77)),format.raw/*533.146*/("""' alt="Image"></a> </div>
                                <!-- End Item -->
                        """)))}),format.raw/*535.26*/("""
                    """),format.raw/*536.21*/("""</div>
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
                """),_display_(/*549.18*/for(news <- models.News.lastNews) yield /*549.51*/ {_display_(Seq[Any](format.raw/*549.53*/("""
                    """),format.raw/*550.21*/("""<div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                        <div class="blog_inner">
                            <div class="blog-img"> <img src='"""),_display_(/*552.63*/news/*552.67*/.images.get(0).getSize(780,420)),format.raw/*552.98*/("""' alt="Blog image">
                                <div class="mask"> <a class="info" href=""""),_display_(/*553.75*/routes/*553.81*/.NewsController.newsRender(news.id)),format.raw/*553.116*/("""">Pročitaj više</a> </div>
                            </div>
                            <h3><a href="blog_detail.html">"""),_display_(/*555.61*/news/*555.65*/.title),format.raw/*555.71*/("""</a> </h3>
                            <p>"""),_display_(/*556.33*/news/*556.37*/.text.substring(0,70)),format.raw/*556.58*/("""  """),format.raw/*556.60*/("""... </p>
                            <a class="readmore" href=""""),_display_(/*557.56*/routes/*557.62*/.NewsController.newsRender(news.id)),format.raw/*557.97*/("""">Pročitaj više</a> </div>
                    </div>
                """)))}),format.raw/*559.18*/("""
            """),format.raw/*560.13*/("""</div>

        </div>
    </section>
    <!-- End Latest Blog -->
<style>


    .box-content li:hover .level0_455"""),format.raw/*568.38*/("""{"""),format.raw/*568.39*/("""
    """),format.raw/*569.5*/("""display: block;
    """),format.raw/*570.5*/("""}"""),format.raw/*570.6*/("""

"""),format.raw/*572.1*/("""</style>
""")))}),format.raw/*573.2*/("""
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
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: e6fdd684e03a95f319a844e47d1124e83e6ea7a2
                  MATRIX: 886->33|897->37|935->39|966->44|1029->81|1043->87|1114->138|1949->946|2017->998|2057->1000|2124->1039|2166->1054|2181->1060|2246->1103|2278->1107|2296->1115|2323->1120|2353->1121|2429->1166|2492->1201|2663->1345|2678->1351|2719->1371|2942->1567|2957->1573|3011->1606|3104->1672|3119->1678|3164->1702|3361->1897|3419->2001|3476->2064|3533->2153|3595->2269|3652->2303|3710->2343|3767->2406|3825->2446|3878->2481|3928->2503|4529->3076|4545->3082|4609->3124|4650->3137|4666->3143|4730->3185|6792->5219|6808->5225|6872->5267|6913->5280|6929->5286|6993->5328|9050->7357|9066->7363|9130->7405|9171->7418|9187->7424|9251->7466|11308->9495|11324->9501|11388->9543|11429->9556|11445->9562|11509->9604|13857->11925|13908->11967|13948->11969|13997->11990|14051->12017|14066->12023|14116->12052|14156->12065|14172->12071|14224->12101|14293->12150|14307->12154|14347->12155|14397->12176|14452->12203|14468->12209|14518->12237|14559->12250|14576->12256|14644->12301|14726->12351|14768->12364|14906->12474|14958->12516|14999->12518|15049->12539|15104->12566|15120->12572|15171->12601|15212->12614|15229->12620|15282->12650|15351->12699|15365->12703|15405->12704|15455->12725|15510->12752|15526->12758|15576->12786|15617->12799|15634->12805|15702->12850|15784->12900|15826->12913|15964->13023|16016->13065|16057->13067|16107->13088|16162->13115|16178->13121|16229->13150|16270->13163|16287->13169|16340->13199|16409->13248|16423->13252|16463->13253|16513->13274|16568->13301|16584->13307|16634->13335|16675->13348|16692->13354|16760->13399|16842->13449|16884->13462|17021->13571|17073->13613|17114->13615|17164->13636|17219->13663|17235->13669|17286->13698|17327->13711|17344->13717|17397->13747|17466->13796|17480->13800|17520->13801|17570->13822|17625->13849|17641->13855|17691->13883|17732->13896|17749->13902|17817->13947|17899->13997|17941->14010|19193->15234|19259->15283|19300->15285|19374->15330|19674->15602|19710->15628|19750->15629|19832->15682|19922->15743|19937->15747|19965->15752|20003->15761|20020->15767|20069->15793|20136->15831|20153->15837|20225->15886|20420->16061|20434->16065|20474->16066|20556->16119|20646->16180|20661->16184|20689->16189|20727->16198|20744->16204|20793->16230|20860->16268|20877->16274|20939->16313|21146->16488|21224->16537|21526->16810|21543->16816|21592->16842|21625->16846|21640->16850|21668->16855|21699->16856|22058->17187|22095->17214|22136->17216|22238->17289|22547->17566|22645->17636|22682->17663|22723->17665|22825->17738|23134->18015|23232->18085|23269->18112|23310->18114|23412->18187|23721->18464|23819->18534|23856->18561|23897->18563|23999->18636|24308->18913|24406->18983|24443->19010|24484->19012|24586->19085|24895->19362|24993->19432|25030->19459|25071->19461|25173->19534|25482->19811|25581->19881|25907->20178|25922->20182|25951->20188|26447->20652|26513->20689|27198->21346|27255->21386|27296->21388|27374->21437|27690->21725|27726->21751|27766->21752|27852->21809|27942->21870|27957->21874|27985->21879|28023->21888|28040->21894|28089->21920|28156->21958|28173->21964|28245->22013|28553->22301|28567->22305|28607->22306|28693->22363|28783->22424|28798->22428|28826->22433|28864->22442|28881->22448|28930->22474|28997->22512|29014->22518|29076->22557|29396->22845|29478->22898|29792->23183|29809->23189|29858->23215|29891->23219|29906->23223|29934->23228|29965->23229|30340->23576|30378->23603|30420->23605|30526->23682|30847->23971|30949->24045|30987->24072|31029->24074|31135->24151|31456->24440|31558->24514|31596->24541|31638->24543|31744->24620|32065->24909|32167->24983|32205->25010|32247->25012|32353->25089|32674->25378|32776->25452|32814->25479|32856->25481|32962->25558|33283->25847|33385->25921|33423->25948|33465->25950|33571->26027|33892->26316|33991->26386|34329->26695|34344->26699|34373->26705|34901->27201|34971->27242|35767->28010|35833->28059|35874->28061|35952->28110|36268->28398|36304->28424|36344->28425|36430->28482|36520->28543|36535->28547|36563->28552|36601->28561|36618->28567|36667->28593|36734->28631|36751->28637|36823->28686|37026->28869|37040->28873|37080->28874|37166->28931|37256->28992|37271->28996|37299->29001|37337->29010|37354->29016|37403->29042|37470->29080|37487->29086|37549->29125|37764->29308|37846->29361|38160->29646|38177->29652|38226->29678|38259->29682|38274->29686|38302->29691|38333->29692|38708->30039|38746->30066|38788->30068|38894->30145|39215->30434|39317->30508|39355->30535|39397->30537|39503->30614|39824->30903|39926->30977|39964->31004|40006->31006|40112->31083|40433->31372|40535->31446|40573->31473|40615->31475|40721->31552|41042->31841|41144->31915|41182->31942|41224->31944|41330->32021|41651->32310|41753->32384|41791->32411|41833->32413|41939->32490|42260->32779|42359->32849|42697->33158|42712->33162|42741->33168|43269->33664|43339->33705|43778->34116|43830->34158|43871->34160|43919->34179|44000->34232|44016->34238|44068->34267|44110->34280|44127->34286|44180->34316|44250->34366|44264->34370|44304->34371|44352->34390|44433->34443|44449->34449|44500->34477|44542->34490|44559->34496|44622->34536|44705->34587|44756->34756|44802->34773|44924->34867|44976->34909|45017->34911|45065->34930|45145->34982|45161->34988|45213->35017|45255->35030|45272->35036|45325->35066|45395->35116|45409->35120|45449->35121|45497->35140|45577->35192|45593->35198|45644->35226|45686->35239|45703->35245|45766->35285|45849->35336|45900->35504|45946->35521|47679->37226|47741->37271|47781->37272|47839->37301|48039->37473|48075->37499|48115->37500|48185->37541|48275->37602|48290->37606|48318->37611|48356->37620|48373->37626|48422->37652|48489->37690|48506->37696|48578->37745|48838->37985|48852->37989|48892->37990|48962->38031|49052->38092|49067->38096|49095->38101|49133->38110|49150->38116|49199->38142|49266->38180|49283->38186|49345->38225|49617->38465|49683->38502|49949->38739|49966->38745|50015->38771|50048->38775|50063->38779|50091->38784|50122->38785|50433->39068|50470->39095|50511->39097|50601->39158|50874->39399|50960->39457|50997->39484|51038->39486|51128->39547|51401->39788|51487->39846|51524->39873|51565->39875|51655->39936|51928->40177|52014->40235|52051->40262|52092->40264|52182->40325|52455->40566|52541->40624|52578->40651|52619->40653|52709->40714|52982->40955|53068->41013|53105->41040|53146->41042|53236->41103|53509->41344|53592->41398|53652->41430|53668->41436|53719->41464|53750->41465|54096->41782|54111->41786|54140->41792|54171->41793|54520->42110|54575->42136|54850->42383|54902->42425|54943->42427|54991->42446|55046->42473|55062->42479|55113->42508|55154->42521|55171->42527|55224->42557|55294->42607|55308->42611|55348->42612|55396->42631|55451->42658|55467->42664|55517->42692|55558->42705|55574->42711|55635->42749|55718->42800|55769->42941|55815->42958|56340->43455|56400->43498|56440->43499|56498->43528|56596->43598|56612->43604|56670->43640|56712->43653|56727->43657|56780->43687|56913->43788|56963->43809|57334->44152|57384->44185|57425->44187|57475->44208|57665->44370|57679->44374|57732->44405|57854->44499|57870->44505|57928->44540|58078->44662|58092->44666|58120->44672|58191->44715|58205->44719|58248->44740|58279->44742|58371->44806|58387->44812|58444->44847|58547->44918|58589->44931|58732->45045|58762->45046|58795->45051|58843->45071|58872->45072|58902->45074|58943->45084
                  LINES: 35->2|35->2|35->2|36->3|36->3|36->3|36->3|51->18|51->18|51->18|52->19|52->19|52->19|52->19|52->19|52->19|52->19|52->19|53->20|54->21|58->25|58->25|58->25|61->28|61->28|61->28|62->29|62->29|62->29|66->33|67->34|68->35|69->36|70->37|71->38|73->40|74->41|76->43|77->44|79->46|86->53|86->53|86->53|86->53|86->53|86->53|94->61|94->61|94->61|94->61|94->61|94->61|102->69|102->69|102->69|102->69|102->69|102->69|110->77|110->77|110->77|110->77|110->77|110->77|131->98|131->98|131->98|132->99|132->99|132->99|132->99|132->99|132->99|132->99|133->100|133->100|133->100|134->101|134->101|134->101|134->101|134->101|134->101|134->101|135->102|136->103|139->106|139->106|139->106|140->107|140->107|140->107|140->107|140->107|140->107|140->107|141->108|141->108|141->108|142->109|142->109|142->109|142->109|142->109|142->109|142->109|143->110|144->111|147->114|147->114|147->114|148->115|148->115|148->115|148->115|148->115|148->115|148->115|149->116|149->116|149->116|150->117|150->117|150->117|150->117|150->117|150->117|150->117|151->118|152->119|154->121|154->121|154->121|155->122|155->122|155->122|155->122|155->122|155->122|155->122|156->123|156->123|156->123|157->124|157->124|157->124|157->124|157->124|157->124|157->124|158->125|159->126|182->149|182->149|182->149|183->150|187->154|187->154|187->154|188->155|188->155|188->155|188->155|188->155|188->155|188->155|188->155|188->155|188->155|191->158|191->158|191->158|192->159|192->159|192->159|192->159|192->159|192->159|192->159|192->159|192->159|192->159|195->162|196->163|199->166|199->166|199->166|199->166|199->166|199->166|199->166|203->170|203->170|203->170|204->171|207->174|208->175|208->175|208->175|209->176|212->179|213->180|213->180|213->180|214->181|217->184|218->185|218->185|218->185|219->186|222->189|223->190|223->190|223->190|224->191|227->194|228->195|228->195|228->195|229->196|232->199|234->201|237->204|237->204|237->204|245->212|246->213|259->226|259->226|259->226|260->227|264->231|264->231|264->231|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|265->232|268->235|268->235|268->235|269->236|269->236|269->236|269->236|269->236|269->236|269->236|269->236|269->236|269->236|272->239|273->240|276->243|276->243|276->243|276->243|276->243|276->243|276->243|280->247|280->247|280->247|281->248|284->251|285->252|285->252|285->252|286->253|289->256|290->257|290->257|290->257|291->258|294->261|295->262|295->262|295->262|296->263|299->266|300->267|300->267|300->267|301->268|304->271|305->272|305->272|305->272|306->273|309->276|311->278|314->281|314->281|314->281|322->289|323->290|338->305|338->305|338->305|339->306|343->310|343->310|343->310|344->311|344->311|344->311|344->311|344->311|344->311|344->311|344->311|344->311|344->311|347->314|347->314|347->314|348->315|348->315|348->315|348->315|348->315|348->315|348->315|348->315|348->315|348->315|351->318|352->319|355->322|355->322|355->322|355->322|355->322|355->322|355->322|359->326|359->326|359->326|360->327|363->330|364->331|364->331|364->331|365->332|368->335|369->336|369->336|369->336|370->337|373->340|374->341|374->341|374->341|375->342|378->345|379->346|379->346|379->346|380->347|383->350|384->351|384->351|384->351|385->352|388->355|390->357|393->360|393->360|393->360|401->368|402->369|416->383|416->383|416->383|417->384|417->384|417->384|417->384|417->384|417->384|417->384|418->385|418->385|418->385|419->386|419->386|419->386|419->386|419->386|419->386|419->386|420->387|421->388|422->389|424->391|424->391|424->391|425->392|425->392|425->392|425->392|425->392|425->392|425->392|426->393|426->393|426->393|427->394|427->394|427->394|427->394|427->394|427->394|427->394|428->395|429->396|430->397|468->435|468->435|468->435|469->436|472->439|472->439|472->439|473->440|473->440|473->440|473->440|473->440|473->440|473->440|473->440|473->440|473->440|476->443|476->443|476->443|477->444|477->444|477->444|477->444|477->444|477->444|477->444|477->444|477->444|477->444|480->447|481->448|484->451|484->451|484->451|484->451|484->451|484->451|484->451|488->455|488->455|488->455|489->456|492->459|493->460|493->460|493->460|494->461|497->464|498->465|498->465|498->465|499->466|502->469|503->470|503->470|503->470|504->471|507->474|508->475|508->475|508->475|509->476|512->479|513->480|513->480|513->480|514->481|517->484|519->486|519->486|519->486|519->486|519->486|524->491|524->491|524->491|524->491|531->498|533->500|541->508|541->508|541->508|542->509|542->509|542->509|542->509|542->509|542->509|542->509|543->510|543->510|543->510|544->511|544->511|544->511|544->511|544->511|544->511|544->511|545->512|546->513|547->514|564->531|564->531|564->531|565->532|566->533|566->533|566->533|566->533|566->533|566->533|568->535|569->536|582->549|582->549|582->549|583->550|585->552|585->552|585->552|586->553|586->553|586->553|588->555|588->555|588->555|589->556|589->556|589->556|589->556|590->557|590->557|590->557|592->559|593->560|601->568|601->568|602->569|603->570|603->570|605->572|606->573
                  -- GENERATED --
              */
          