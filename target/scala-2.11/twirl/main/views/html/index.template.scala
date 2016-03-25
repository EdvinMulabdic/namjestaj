
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    """),format.raw/*2.5*/("""<!-- Slider -->
    <div id="magik-slideshow" class="magik-slideshow">
        <div class="container">
            <div id='rev_slider_4_wrapper' class='rev_slider_wrapper fullwidthbanner-container' >
                <div id='rev_slider_4' class='rev_slider fullwidthabanner'>
                    <ul>
                        <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*8.111*/routes/*8.117*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*8.159*/("""'><img src='"""),_display_(/*8.172*/routes/*8.178*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*8.220*/("""' data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat' alt="" />
                            <div class="info">
                                <div class='tp-caption ExtraLargeTitle sft  tp-resizeme ' data-x='0'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;'><span>New Season</span></div>
                                <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='0'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3; max-width:auto;max-height:auto;white-space:nowrap;'><span>Summer Sale</span></div>
                                <div class='tp-caption sfb  tp-resizeme ' data-x='0'  data-y='410'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Shop Now</a></div>
                                <div class='tp-caption Title sft  tp-resizeme ' data-x='0'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">In augue urna, nunc, tincidunt, augue, augue facilisis facilisis</h4></div>
                            </div>
                        </li>
                        <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*16.111*/routes/*16.117*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*16.159*/("""'><img src='"""),_display_(/*16.172*/routes/*16.178*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*16.220*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
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

    <!-- end Slider -->

    <!-- banner -->
    <div class="top-banner-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*37.61*/routes/*37.67*/.Assets.versioned("images/block1.jpg" )),format.raw/*37.106*/("""'alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*40.61*/routes/*40.67*/.Assets.versioned("images/block1.jpg")),format.raw/*40.105*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="ccol-lg-4 col-md-4 col-sm-4 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*43.61*/routes/*43.67*/.Assets.versioned("images/block1.jpg")),format.raw/*43.105*/("""' alt="offer banner3"></a></div>
                </div>
            </div>
        </div>
    </div>
    <!-- end banner -->

    <!-- Featured Slider -->
    <section class="featured-pro container wow bounceInUp animated">
        <div class="slider-items-products">
            <div class="new_title center">
                <h2>ACCESSORIES</h2>
            </div>
            <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                <div class="slider-items slider-width-col4 products-grid">
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*61.175*/routes/*61.181*/.Assets.versioned("images/product1.jpg")),format.raw/*61.221*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a href="quick_view.html" class="quickview-btn"><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*95.175*/routes/*95.181*/.Assets.versioned("images/product1.jpg")),format.raw/*95.221*/("""'> </a>
                                    <div class="sale-label">Sale</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*130.175*/routes/*130.181*/.Assets.versioned("images/product1.jpg")),format.raw/*130.221*/("""'> </a> <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product</a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*162.175*/routes/*162.181*/.Assets.versioned("images/product1.jpg")),format.raw/*162.221*/("""'> </a>
                                    <div class="sale-label">Sale</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*196.175*/routes/*196.181*/.Assets.versioned("images/product1.jpg")),format.raw/*196.221*/("""'> </a> <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*229.175*/routes/*229.181*/.Assets.versioned("images/product1.jpg")),format.raw/*229.221*/("""'> </a> <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                </div>
            </div>
        </div>
    </section>

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
    <section class="featured-pro container wow bounceInUp animated">
        <div class="slider-items-products">
            <div class="new_title center">
                <h2>New Products</h2>
            </div>
            <div id="featured-slider" class="product-flexslider hidden-buttons">
                <div class="slider-items slider-width-col4 products-grid">
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*298.175*/routes/*298.181*/.Assets.versioned("images/product1.jpg")),format.raw/*298.221*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*332.175*/routes/*332.181*/.Assets.versioned("images/product1.jpg")),format.raw/*332.221*/("""'> </a>
                                    <div class="sale-label">Sale</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*367.175*/routes/*367.181*/.Assets.versioned("images/product1.jpg")),format.raw/*367.221*/("""'> </a> <a class="quickview-btn" ><span>Quick View</span></a> </div>
                    </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*399.175*/routes/*399.181*/.Assets.versioned("images/product1.jpg")),format.raw/*399.221*/("""'> </a>
                                    <div class="sale-label">Sale</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*433.175*/routes/*433.181*/.Assets.versioned("images/product1.jpg")),format.raw/*433.221*/("""'> </a> <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*464.175*/routes/*464.181*/.Assets.versioned("images/product1.jpg")),format.raw/*464.221*/("""'> </a>
                                    <div class="sale-label">Sale</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- Item -->
                    <div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                                <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src='"""),_display_(/*497.175*/routes/*497.181*/.Assets.versioned("images/product1.jpg")),format.raw/*497.221*/("""'> </a> <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            </div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href="product_detail.html"> Sample Product </a> </div>
                                    <div class="item-content">
                                        <div class="rating">
                                            <div class="ratings">
                                                <div class="rating-box">
                                                    <div class="rating"></div>
                                                </div>
                                                <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                            </div>
                                        </div>
                                        <div class="item-price">
                                            <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                        </div>
                                        <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                            <div class="add_cart">
                                                <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                            </div>
                                            <a href="compare.html" class="link-compare" title="Add to Compare"></a> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        <!-- End Item -->

                </div>
            </div>
        </div>
    </section>
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
                        <div class="item"><a href="#"><img src='"""),_display_(/*542.66*/routes/*542.72*/.Assets.versioned("images/b-logo3.png")),format.raw/*542.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*546.66*/routes/*546.72*/.Assets.versioned("images/b-logo2.png")),format.raw/*546.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*550.66*/routes/*550.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*550.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*554.66*/routes/*554.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*554.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*558.66*/routes/*558.72*/.Assets.versioned("images/b-logo5.png")),format.raw/*558.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*562.66*/routes/*562.72*/.Assets.versioned("images/b-logo6.png")),format.raw/*562.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*566.66*/routes/*566.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*566.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*570.66*/routes/*570.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*570.111*/("""' alt="Image"></a> </div>
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
                <h2>Latest Blog</h2>
            </div>
            <div class="row">
                <div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                    <div class="blog_inner">
                        <div class="blog-img"> <img src='"""),_display_(/*588.59*/routes/*588.65*/.Assets.versioned("images/blog-img1.jpg")),format.raw/*588.106*/("""' alt="Blog image">
                            <div class="mask"> <a class="info" href="blog_detail.html">Read More</a> </div>
                        </div>
                        <h3><a href="blog_detail.html">Pellentesque habitant morbi</a> </h3>
                        <div class="post-date"><i class="icon-calendar"></i> Apr 10, 2014</div>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce sit  ... </p>
                        <a class="readmore" href="blog_detail.html">Read More</a> </div>
                </div>
                <div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                    <div class="blog_inner">
                        <div class="blog-img"> <img src='"""),_display_(/*598.59*/routes/*598.65*/.Assets.versioned("images/blog-img1.jpg" )),format.raw/*598.107*/("""'alt="Blog image">
                            <div class="mask"> <a class="info" href="blog_detail.html">Read More</a> </div>
                        </div>
                        <h3><a href="blog_detail.html">Pellentesque habitant morbi</a> </h3>
                        <div class="post-date"><i class="icon-calendar"></i> Apr 10, 2014</div>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce sit  ... </p>
                        <a class="readmore" href="blog_detail.html">Read More</a> </div>
                </div>
                <div class="col-lg-4 col-md-4 col-xs-12 col-sm-4">
                    <div class="blog_inner">
                        <div class="blog-img"> <img src='"""),_display_(/*608.59*/routes/*608.65*/.Assets.versioned("images/blog-img1.jpg")),format.raw/*608.106*/("""' alt="Blog image">
                            <div class="mask"> <a class="info" href="blog_detail.html">Read More</a> </div>
                        </div>
                        <h3><a href="blog_detail.html">Pellentesque habitant morbi</a> </h3>
                        <div class="post-date"><i class="icon-calendar"></i> Apr 10, 2014</div>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce sit  ... </p>
                        <a class="readmore" href="blog_detail.html">Read More</a> </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Latest Blog -->
    <div class="header-banner mobile-show">
        <div class="our-features-box">
            <ul>
                <li>
                    <div class="feature-box">
                        <div class="icon-truck"></div>
                        <div class="content">FREE SHIPPING on order over $99</div>
                    </div>
                </li>
                <li>
                    <div class="feature-box">
                        <div class="icon-support"></div>
                        <div class="content">Need Help +1 800 123 1234</div>
                    </div>
                </li>
                <li>
                    <div class="feature-box">
                        <div class="icon-money"></div>
                        <div class="content">Money Back Guarantee</div>
                    </div>
                </li>
                <li class="last">
                    <div class="feature-box">
                        <div class="icon-return"></div>
                        <div class="content">30 days return Service</div>
                    </div>
                </li>
            </ul>
        </div>
    </div>

""")))}),format.raw/*651.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Mar 24 12:39:44 CET 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: ec1ad41644f0865a6bf4930e6160cb636f5f69a9
                  MATRIX: 827->1|838->5|876->7|908->13|1353->431|1368->437|1431->479|1471->492|1486->498|1549->540|3523->2486|3539->2492|3603->2534|3644->2547|3660->2553|3724->2595|5983->4827|5998->4833|6059->4872|6293->5079|6308->5085|6368->5123|6604->5332|6619->5338|6679->5376|7564->6233|7580->6239|7642->6279|10154->8763|10170->8769|10232->8809|12755->11303|12772->11309|12835->11349|15209->13694|15226->13700|15289->13740|17769->16191|17786->16197|17849->16237|20263->18622|20280->18628|20343->18668|24475->22771|24492->22777|24555->22817|27046->25279|27063->25285|27126->25325|29649->27819|29666->27825|29729->27865|32096->30203|32113->30209|32176->30249|34656->32700|34673->32706|34736->32746|37109->35090|37126->35096|37189->35136|39667->37585|39684->37591|39747->37631|42418->40274|42434->40280|42496->40319|42708->40503|42724->40509|42786->40548|42998->40732|43014->40738|43076->40777|43288->40961|43304->40967|43366->41006|43578->41190|43594->41196|43656->41235|43868->41419|43884->41425|43946->41464|44158->41648|44174->41654|44236->41693|44448->41877|44464->41883|44526->41922|45155->42523|45171->42529|45235->42570|46044->43351|46060->43357|46125->43399|46933->44179|46949->44185|47013->44226|48918->46100
                  LINES: 32->1|32->1|32->1|33->2|39->8|39->8|39->8|39->8|39->8|39->8|47->16|47->16|47->16|47->16|47->16|47->16|68->37|68->37|68->37|71->40|71->40|71->40|74->43|74->43|74->43|92->61|92->61|92->61|126->95|126->95|126->95|161->130|161->130|161->130|193->162|193->162|193->162|227->196|227->196|227->196|260->229|260->229|260->229|329->298|329->298|329->298|363->332|363->332|363->332|398->367|398->367|398->367|430->399|430->399|430->399|464->433|464->433|464->433|495->464|495->464|495->464|528->497|528->497|528->497|573->542|573->542|573->542|577->546|577->546|577->546|581->550|581->550|581->550|585->554|585->554|585->554|589->558|589->558|589->558|593->562|593->562|593->562|597->566|597->566|597->566|601->570|601->570|601->570|619->588|619->588|619->588|629->598|629->598|629->598|639->608|639->608|639->608|682->651
                  -- GENERATED --
              */
          