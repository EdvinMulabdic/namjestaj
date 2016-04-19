
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
                    <li> <a href="#reviews_tabs" data-toggle="tab">Reviews</a> </li>
                    <li> <a href="#product_tabs_custom" data-toggle="tab">Custom Tab</a> </li>
                    <li> <a href="#product_tabs_custom1" data-toggle="tab">Custom Tab1</a> </li>
                </ul>


                <div id="productTabContent" class="tab-content col-lg-12 col-sm-12 col-xs-12 container">
                    <div class="tab-pane fade in active" id="product_tabs_description">

                        <section class="featured-pro  wow bounceInUp animated">
                            <div class="slider-items-products">
                                <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                                    <div class="slider-items slider-width-col4 products-grid">
                                    """),_display_(/*120.38*/for(item <- models.Item.itemsForHomepageSlider()) yield /*120.87*/ {_display_(Seq[Any](format.raw/*120.89*/("""
                                            """),format.raw/*121.45*/("""<!-- Item -->
                                        <div class="col-md-12 item">
                                            <div class="item-inner">
                                                <div class="item-img">
                                                """),_display_(/*125.50*/if(item.images.size() > 0)/*125.76*/{_display_(Seq[Any](format.raw/*125.77*/("""
                                                    """),format.raw/*126.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*126.114*/item/*126.118*/.name),format.raw/*126.123*/("""" href=""""),_display_(/*126.132*/routes/*126.138*/.Items.itemRender(item.id)),format.raw/*126.164*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*126.202*/models/*126.208*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*126.257*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}/*129.50*/else/*129.54*/{_display_(Seq[Any](format.raw/*129.55*/("""
                                                    """),format.raw/*130.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*130.114*/item/*130.118*/.name),format.raw/*130.123*/("""" href='"""),_display_(/*130.132*/routes/*130.138*/.Items.itemRender(item.id)),format.raw/*130.164*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*130.202*/routes/*130.208*/.Assets.versioned("images/product.png")),format.raw/*130.247*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}),format.raw/*133.50*/("""
                                                """),format.raw/*134.49*/("""</div>
                                                <div class="item-info">
                                                    <div class="info-inner">
                                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*137.118*/routes/*137.124*/.Items.itemRender(item.id)),format.raw/*137.150*/(""""> """),_display_(/*137.154*/item/*137.158*/.name),format.raw/*137.163*/(""" """),format.raw/*137.164*/("""</a> </div>
                                                        <div class="item-content">
                                                            """),format.raw/*139.85*/("""
                                                            """),format.raw/*140.86*/("""
                                                            """),format.raw/*141.89*/("""
                                                            """),format.raw/*142.91*/("""
                                                            """),format.raw/*143.71*/("""
                                                            """),format.raw/*144.182*/("""
                                                            """),format.raw/*145.71*/("""
                                                            """),format.raw/*146.71*/("""
                                                        """),format.raw/*147.57*/("""<div class="item-price">
                                                            <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*148.135*/item/*148.139*/.price),format.raw/*148.145*/("""</span> </span> </div>
                                                        </div>
                                                            """),format.raw/*150.160*/("""
                                                            """),format.raw/*151.87*/("""
                                                            """),format.raw/*152.144*/("""
                                                            """),format.raw/*153.71*/("""
                                                            """),format.raw/*154.137*/("""
                                                            """),format.raw/*155.71*/("""
                                                        """),format.raw/*156.57*/("""</div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <!-- End Item -->
                                    """)))}),format.raw/*162.38*/("""
                                    """),format.raw/*163.37*/("""</div>
                                </div>
                            </div>
                        </section>
                    </div>

                    <div class="tab-pane fade" id="product_tabs_tags">
                        <div class="box-collateral box-tags">
                            <div class="tags">
                                <form id="addTagForm" action="#" method="get">
                                    <div class="form-add-tags">
                                        <label for="productTagName">Add Tags:</label>
                                        <div class="input-box">
                                            <input class="input-text" name="productTagName" id="productTagName" type="text">
                                            <button type="button" title="Add Tags" class=" button btn-add" onClick="submitTagForm()"> <span>Add Tags</span> </button>
                                        </div>
                                            <!--input-box-->
                                    </div>
                                </form>
                            </div>
                                <!--tags-->
                            <p class="note">Use spaces to separate tags. Use single quotes (') for phrases.</p>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="reviews_tabs">
                        <div class="box-collateral box-reviews" id="customer-reviews">
                            <div class="box-reviews1">
                                <div class="form-add">
                                    <form id="review-form" method="post" action="">
                                        <h3>Write Your Own Review</h3>
                                        <fieldset>
                                            <h4>How do you rate this product? <em class="required">*</em></h4>
                                            <span id="input-message-box"></span>
                                            <table id="product-review-table" class="data-table">


                                                <thead>
                                                    <tr class="first last">
                                                        <th>&nbsp;</th>
                                                        <th><span class="nobr">1 *</span></th>
                                                        <th><span class="nobr">2 *</span></th>
                                                        <th><span class="nobr">3 *</span></th>
                                                        <th><span class="nobr">4 *</span></th>
                                                        <th><span class="nobr">5 *</span></th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr class="first odd">
                                                        <th>Price</th>
                                                        <td class="value"><input type="radio" class="radio" value="11" id="Price_1" name="ratings[3]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="12" id="Price_2" name="ratings[3]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="13" id="Price_3" name="ratings[3]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="14" id="Price_4" name="ratings[3]"></td>
                                                        <td class="value last"><input type="radio" class="radio" value="15" id="Price_5" name="ratings[3]"></td>
                                                    </tr>
                                                    <tr class="even">
                                                        <th>Value</th>
                                                        <td class="value"><input type="radio" class="radio" value="6" id="Value_1" name="ratings[2]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="7" id="Value_2" name="ratings[2]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="8" id="Value_3" name="ratings[2]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="9" id="Value_4" name="ratings[2]"></td>
                                                        <td class="value last"><input type="radio" class="radio" value="10" id="Value_5" name="ratings[2]"></td>
                                                    </tr>
                                                    <tr class="last odd">
                                                        <th>Quality</th>
                                                        <td class="value"><input type="radio" class="radio" value="1" id="Quality_1" name="ratings[1]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="2" id="Quality_2" name="ratings[1]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="3" id="Quality_3" name="ratings[1]"></td>
                                                        <td class="value"><input type="radio" class="radio" value="4" id="Quality_4" name="ratings[1]"></td>
                                                        <td class="value last"><input type="radio" class="radio" value="5" id="Quality_5" name="ratings[1]"></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <input type="hidden" value="" class="validate-rating" name="validate_rating">
                                            <div class="review1">
                                                <ul class="form-list">
                                                    <li>
                                                        <label class="required" for="nickname_field">Nickname<em>*</em></label>
                                                        <div class="input-box">
                                                            <input type="text" class="input-text" id="nickname_field" name="nickname">
                                                        </div>
                                                    </li>
                                                    <li>
                                                        <label class="required" for="summary_field">Summary<em>*</em></label>
                                                        <div class="input-box">
                                                            <input type="text" class="input-text" id="summary_field" name="title">
                                                        </div>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="review2">
                                                <ul>
                                                    <li>
                                                        <label class="required " for="review_field">Review<em>*</em></label>
                                                        <div class="input-box">
                                                            <textarea rows="3" cols="5" id="review_field" name="detail"></textarea>
                                                        </div>
                                                    </li>
                                                </ul>
                                                <div class="buttons-set">
                                                    <button class="button submit" title="Submit Review" type="submit"><span>Submit Review</span></button>
                                                </div>
                                            </div>
                                        </fieldset>
                                    </form>
                                </div>
                            </div>
                            <div class="box-reviews2">
                                <h3>Customer Reviews</h3>
                                <div class="box visible">
                                    <ul>
                                        <li>
                                            <table class="ratings-table">


                                                <tbody>
                                                    <tr>
                                                        <th>Value</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Quality</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Price</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <div class="review">
                                                <h6><a href="#">Excellent</a></h6>
                                                <small>Review by <span>Leslie Prichard </span>on 1/3/2014 </small>
                                                <div class="review-txt"> I have purchased shirts from Minimalism a few times and am never disappointed. The quality is excellent and the shipping is amazing. It seems like it's at your front door the minute you get off your pc. I have received my purchases within two days - amazing.</div>
                                            </div>
                                        </li>
                                        <li class="even">
                                            <table class="ratings-table">


                                                <tbody>
                                                    <tr>
                                                        <th>Value</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Quality</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Price</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <div class="review">
                                                <h6><a href="#/catalog/product/view/id/60/">Amazing</a></h6>
                                                <small>Review by <span>Sandra Parker</span>on 1/3/2014 </small>
                                                <div class="review-txt"> Minimalism is the online ! </div>
                                            </div>
                                        </li>
                                        <li>
                                            <table class="ratings-table">


                                                <tbody>
                                                    <tr>
                                                        <th>Value</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Quality</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Price</th>
                                                        <td><div class="rating-box">
                                                            <div class="rating"></div>
                                                        </div></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <div class="review">
                                                <h6><a href="#/catalog/product/view/id/59/">Nicely</a></h6>
                                                <small>Review by <span>Anthony  Lewis</span>on 1/3/2014 </small>
                                                <div class="review-txt"> Unbeatable service and selection. This store has the best business model I have seen on the net. They are true to their word, and go the extra mile for their customers. I felt like a purchasing partner more than a customer. You have a lifetime client in me. </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="actions"> <a class="button view-all" id="revies-button" href="#"><span><span>View all</span></span></a> </div>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="product_tabs_custom1">
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
                    <div class="col"><a href="#"><img src='"""),_display_(/*397.61*/routes/*397.67*/.Assets.versioned("images/slika1.jpeg")),format.raw/*397.106*/("""' alt="offer banner3"></a></div>
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
                        """),_display_(/*436.26*/for(item <- models.Item.getLastTenProducts()) yield /*436.71*/{_display_(Seq[Any](format.raw/*436.72*/("""
                            """),format.raw/*437.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*440.38*/if(item.images.size() > 0)/*440.64*/{_display_(Seq[Any](format.raw/*440.65*/("""
                                        """),format.raw/*441.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*441.102*/item/*441.106*/.name),format.raw/*441.111*/("""" href=""""),_display_(/*441.120*/routes/*441.126*/.Items.itemRender(item.id)),format.raw/*441.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*441.190*/models/*441.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*441.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*444.38*/else/*444.42*/{_display_(Seq[Any](format.raw/*444.43*/("""
                                        """),format.raw/*445.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*445.102*/item/*445.106*/.name),format.raw/*445.111*/("""" href='"""),_display_(/*445.120*/routes/*445.126*/.Items.itemRender(item.id)),format.raw/*445.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*445.190*/routes/*445.196*/.Assets.versioned("images/product.png")),format.raw/*445.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*448.38*/("""
                                    """),format.raw/*449.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*452.106*/routes/*452.112*/.Items.itemRender(item.id)),format.raw/*452.138*/(""""> """),_display_(/*452.142*/item/*452.146*/.name),format.raw/*452.151*/(""" """),format.raw/*452.152*/("""</a> </div>
                                            <div class="item-content">
                                                """),format.raw/*454.73*/("""
                                                """),format.raw/*455.74*/("""
                                                """),format.raw/*456.77*/("""
                                                """),format.raw/*457.79*/("""
                                                """),format.raw/*458.59*/("""
                                                """),format.raw/*459.170*/("""
                                                """),format.raw/*460.59*/("""
                                                """),format.raw/*461.59*/("""
                                            """),format.raw/*462.45*/("""<div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*463.123*/item/*463.127*/.price),format.raw/*463.133*/(""" """),format.raw/*463.134*/("""KM </span> </span> </div>
                                            </div>

                                                """),format.raw/*466.148*/("""
                                                """),format.raw/*467.75*/("""
                                                """),format.raw/*468.132*/("""
                                                """),format.raw/*469.59*/("""
                                                """),format.raw/*470.131*/("""
                                            """),format.raw/*471.45*/("""</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*476.26*/("""

                        """),format.raw/*478.25*/("""</div>
                    </div>
                </div>
            </section>

        <div class="top-banner-section2 ">
            <div class="container">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12  ">
                    <div class="col"><a href="#"><img src='"""),_display_(/*486.61*/routes/*486.67*/.Assets.versioned("images/slika2.png")),format.raw/*486.105*/("""' alt="offer banner3"></a></div>
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
                        <div class="item"><a href="#"><img src='"""),_display_(/*506.66*/routes/*506.72*/.Assets.versioned("images/b-logo3.png")),format.raw/*506.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*510.66*/routes/*510.72*/.Assets.versioned("images/b-logo2.png")),format.raw/*510.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*514.66*/routes/*514.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*514.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*518.66*/routes/*518.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*518.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*522.66*/routes/*522.72*/.Assets.versioned("images/b-logo5.png")),format.raw/*522.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*526.66*/routes/*526.72*/.Assets.versioned("images/b-logo6.png")),format.raw/*526.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*530.66*/routes/*530.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*530.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*534.66*/routes/*534.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*534.111*/("""' alt="Image"></a> </div>
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
                """),_display_(/*549.18*/for(news <- models.News.lastNews) yield /*549.51*/ {_display_(Seq[Any](format.raw/*549.53*/("""
                    """),format.raw/*550.21*/("""<div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                        <div class="blog_inner">
                            <div class="blog-img"> <img src='"""),_display_(/*552.63*/news/*552.67*/.images.get(0).getSize(780,420)),format.raw/*552.98*/("""' alt="Blog image">
                                <div class="mask"> <a class="info" href=""""),_display_(/*553.75*/routes/*553.81*/.NewsController.newsRender(news.id)),format.raw/*553.116*/("""">Pročitaj više</a> </div>
                            </div>
                            <h3><a href="blog_detail.html">"""),_display_(/*555.61*/news/*555.65*/.title),format.raw/*555.71*/("""</a> </h3>
                            <div class="post-date"><i class="icon-calendar"></i>"""),_display_(/*556.82*/news/*556.86*/.date),format.raw/*556.91*/(""" """),format.raw/*556.92*/("""</div>
                            <p>"""),_display_(/*557.33*/news/*557.37*/.text.substring(0,70)),format.raw/*557.58*/("""  """),format.raw/*557.60*/("""... </p>
                            <a class="readmore" href=""""),_display_(/*558.56*/routes/*558.62*/.NewsController.newsRender(news.id)),format.raw/*558.97*/("""">Pročitaj više</a> </div>
                    </div>
                """)))}),format.raw/*560.18*/("""
            """),format.raw/*561.13*/("""</div>
        </div>
    </section>
    <!-- End Latest Blog -->

""")))}),format.raw/*566.2*/("""
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
                  DATE: Mon Apr 18 21:19:40 CEST 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: 448358742f400fd1320768817b3d2779b7785afe
                  MATRIX: 886->33|897->37|935->39|966->44|1029->81|1043->87|1114->138|1966->963|2034->1015|2074->1017|2143->1058|2185->1073|2200->1079|2265->1122|2297->1126|2315->1134|2342->1139|2372->1140|2450->1187|2515->1224|3686->2367|3702->2373|3766->2415|3807->2428|3823->2434|3887->2476|5949->4510|5965->4516|6029->4558|6070->4571|6086->4577|6150->4619|8207->6648|8223->6654|8287->6696|8328->6709|8344->6715|8408->6757|10465->8786|10481->8792|10545->8834|10586->8847|10602->8853|10666->8895|13061->11263|13076->11269|13137->11308|13368->11512|13383->11518|13443->11556|13675->11761|13690->11767|13750->11805|13982->12010|13997->12016|14057->12054|15525->13494|15591->13543|15632->13545|15706->13590|16006->13862|16042->13888|16082->13889|16164->13942|16254->14003|16269->14007|16297->14012|16335->14021|16352->14027|16401->14053|16468->14091|16485->14097|16557->14146|16853->14422|16867->14426|16907->14427|16989->14480|17079->14541|17094->14545|17122->14550|17160->14559|17177->14565|17226->14591|17293->14629|17310->14635|17372->14674|17680->14950|17758->14999|18060->15272|18077->15278|18126->15304|18159->15308|18174->15312|18202->15317|18233->15318|18417->15497|18507->15583|18597->15672|18687->15763|18777->15834|18868->16016|18958->16087|19048->16158|19134->16215|19322->16374|19337->16378|19366->16384|19542->16629|19632->16716|19723->16860|19813->16931|19904->17068|19994->17139|20080->17196|20430->17514|20496->17551|37970->34997|37986->35003|38048->35042|39981->36947|40043->36992|40083->36993|40141->37022|40341->37194|40377->37220|40417->37221|40487->37262|40577->37323|40592->37327|40620->37332|40658->37341|40675->37347|40724->37373|40791->37411|40808->37417|40880->37466|41140->37706|41154->37710|41194->37711|41264->37752|41354->37813|41369->37817|41397->37822|41435->37831|41452->37837|41501->37863|41568->37901|41585->37907|41647->37946|41919->38186|41985->38223|42251->38460|42268->38466|42317->38492|42350->38496|42365->38500|42393->38505|42424->38506|42584->38661|42662->38735|42740->38812|42818->38891|42896->38950|42975->39120|43053->39179|43131->39238|43205->39283|43381->39430|43396->39434|43425->39440|43456->39441|43612->39666|43690->39741|43769->39873|43847->39932|43926->40063|44000->40108|44228->40304|44283->40330|44600->40619|44616->40625|44677->40663|45334->41292|45350->41298|45412->41337|45620->41517|45636->41523|45698->41562|45906->41742|45922->41748|45984->41787|46192->41967|46208->41973|46270->42012|46478->42192|46494->42198|46556->42237|46764->42417|46780->42423|46842->42462|47050->42642|47066->42648|47128->42687|47336->42867|47352->42873|47414->42912|47877->43347|47927->43380|47968->43382|48018->43403|48208->43565|48222->43569|48275->43600|48397->43694|48413->43700|48471->43735|48621->43857|48635->43861|48663->43867|48783->43959|48797->43963|48824->43968|48854->43969|48921->44008|48935->44012|48978->44033|49009->44035|49101->44099|49117->44105|49174->44140|49277->44211|49319->44224|49418->44292
                  LINES: 35->2|35->2|35->2|36->3|36->3|36->3|36->3|51->18|51->18|51->18|52->19|52->19|52->19|52->19|52->19|52->19|52->19|52->19|53->20|54->21|73->40|73->40|73->40|73->40|73->40|73->40|81->48|81->48|81->48|81->48|81->48|81->48|89->56|89->56|89->56|89->56|89->56|89->56|97->64|97->64|97->64|97->64|97->64|97->64|118->85|118->85|118->85|121->88|121->88|121->88|124->91|124->91|124->91|127->94|127->94|127->94|153->120|153->120|153->120|154->121|158->125|158->125|158->125|159->126|159->126|159->126|159->126|159->126|159->126|159->126|159->126|159->126|159->126|162->129|162->129|162->129|163->130|163->130|163->130|163->130|163->130|163->130|163->130|163->130|163->130|163->130|166->133|167->134|170->137|170->137|170->137|170->137|170->137|170->137|170->137|172->139|173->140|174->141|175->142|176->143|177->144|178->145|179->146|180->147|181->148|181->148|181->148|183->150|184->151|185->152|186->153|187->154|188->155|189->156|195->162|196->163|430->397|430->397|430->397|469->436|469->436|469->436|470->437|473->440|473->440|473->440|474->441|474->441|474->441|474->441|474->441|474->441|474->441|474->441|474->441|474->441|477->444|477->444|477->444|478->445|478->445|478->445|478->445|478->445|478->445|478->445|478->445|478->445|478->445|481->448|482->449|485->452|485->452|485->452|485->452|485->452|485->452|485->452|487->454|488->455|489->456|490->457|491->458|492->459|493->460|494->461|495->462|496->463|496->463|496->463|496->463|499->466|500->467|501->468|502->469|503->470|504->471|509->476|511->478|519->486|519->486|519->486|539->506|539->506|539->506|543->510|543->510|543->510|547->514|547->514|547->514|551->518|551->518|551->518|555->522|555->522|555->522|559->526|559->526|559->526|563->530|563->530|563->530|567->534|567->534|567->534|582->549|582->549|582->549|583->550|585->552|585->552|585->552|586->553|586->553|586->553|588->555|588->555|588->555|589->556|589->556|589->556|589->556|590->557|590->557|590->557|590->557|591->558|591->558|591->558|593->560|594->561|599->566
                  -- GENERATED --
              */
          