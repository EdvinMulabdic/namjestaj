
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
    """),format.raw/*2.5*/("""<script type="text/javascript" src=""""),_display_(/*2.42*/routes/*2.48*/.Assets.versioned("javascripts/lastTenProducts.js")),format.raw/*2.99*/(""""></script>

    <!-- Slider -->
    <div id="magik-slideshow" class="magik-slideshow">
        <div class="container">
            <div id='rev_slider_4_wrapper' class='rev_slider_wrapper fullwidthbanner-container' >
                <div id='rev_slider_4' class='rev_slider fullwidthabanner'>
                    <ul>
                        <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*10.111*/routes/*10.117*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*10.159*/("""'><img src='"""),_display_(/*10.172*/routes/*10.178*/.Assets.versioned("images/slide-img1.jpg")),format.raw/*10.220*/("""' data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat' alt="" />
                            <div class="info">
                                <div class='tp-caption ExtraLargeTitle sft  tp-resizeme ' data-x='0'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;'><span>New Season</span></div>
                                <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='0'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3; max-width:auto;max-height:auto;white-space:nowrap;'><span>Summer Sale</span></div>
                                <div class='tp-caption sfb  tp-resizeme ' data-x='0'  data-y='410'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Shop Now</a></div>
                                <div class='tp-caption Title sft  tp-resizeme ' data-x='0'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">In augue urna, nunc, tincidunt, augue, augue facilisis facilisis</h4></div>
                            </div>
                        </li>
                        <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*18.111*/routes/*18.117*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*18.159*/("""'><img src='"""),_display_(/*18.172*/routes/*18.178*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*18.220*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                            <div class="info">
                                <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                            </div>
                        </li>
                        <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*26.111*/routes/*26.117*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*26.159*/("""'><img src='"""),_display_(/*26.172*/routes/*26.178*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*26.220*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                            <div class="info">
                                <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                            </div>
                        </li>
                        <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*34.111*/routes/*34.117*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*34.159*/("""'><img src='"""),_display_(/*34.172*/routes/*34.178*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*34.220*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
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
                    <div class="col"><a href="#"><img src='"""),_display_(/*55.61*/routes/*55.67*/.Assets.versioned("images/block1.jpg" )),format.raw/*55.106*/("""'alt="offer banner3"></a></div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*58.61*/routes/*58.67*/.Assets.versioned("images/block2.jpg")),format.raw/*58.105*/("""' alt="offer banner3"></a></div>
                </div>
                <div class="ccol-lg-4 col-md-4 col-sm-4 col-xs-12 wow bounceup animated">
                    <div class="col"><a href="#"><img src='"""),_display_(/*61.61*/routes/*61.67*/.Assets.versioned("images/block3.jpg")),format.raw/*61.105*/("""' alt="offer banner3"></a></div>
                </div>
             </div>
        </div>
    </div>
    <!-- end banner -->
    <!-- Featured Slider -->
    <section class="featured-pro container wow bounceInUp animated">
        <div class="slider-items-products">
            <div class="new_title center">
                <h2>IZDVOJENI PROIZVODI</h2>
            </div>
            <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                <div class="slider-items slider-width-col4 products-grid">
                    """),_display_(/*75.22*/for(item <- models.Item.itemsForHomepageSlider()) yield /*75.71*/ {_display_(Seq[Any](format.raw/*75.73*/("""
                        """),format.raw/*76.25*/("""<!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    """),_display_(/*80.38*/if(item.images.size() > 0)/*80.64*/{_display_(Seq[Any](format.raw/*80.65*/("""
                                        """),format.raw/*81.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*81.102*/item/*81.106*/.name),format.raw/*81.111*/("""" href=""""),_display_(/*81.120*/routes/*81.126*/.Items.itemRender(item.id)),format.raw/*81.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*81.190*/models/*81.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*81.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*84.38*/else/*84.42*/{_display_(Seq[Any](format.raw/*84.43*/("""
                                        """),format.raw/*85.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*85.102*/item/*85.106*/.name),format.raw/*85.111*/("""" href='"""),_display_(/*85.120*/routes/*85.126*/.Items.itemRender(item.id)),format.raw/*85.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*85.190*/routes/*85.196*/.Assets.versioned("images/product.png")),format.raw/*85.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*88.38*/("""
                                """),format.raw/*89.33*/("""</div>
                                <div class="item-info">
                                    <div class="info-inner">
                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*92.102*/routes/*92.108*/.Items.itemRender(item.id)),format.raw/*92.134*/(""""> """),_display_(/*92.138*/item/*92.142*/.name),format.raw/*92.147*/(""" """),format.raw/*92.148*/("""</a> </div>
                                        <div class="item-content">
                                            """),format.raw/*94.69*/("""
                                                """),format.raw/*95.74*/("""
                                                    """),format.raw/*96.81*/("""
                                                        """),format.raw/*97.87*/("""
                                                    """),format.raw/*98.63*/("""
                                                    """),format.raw/*99.174*/("""
                                                """),format.raw/*100.59*/("""
                                            """),format.raw/*101.55*/("""
                                            """),format.raw/*102.45*/("""<div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*103.123*/item/*103.127*/.price),format.raw/*103.133*/("""</span> </span> </div>
                                            </div>
                                            """),format.raw/*105.144*/("""
                                                """),format.raw/*106.75*/("""
                                                    """),format.raw/*107.136*/("""
                                                """),format.raw/*108.59*/("""
                                                """),format.raw/*109.125*/("""
                                            """),format.raw/*110.55*/("""
                                        """),format.raw/*111.41*/("""</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->
                    """)))}),format.raw/*117.22*/("""
                """),format.raw/*118.17*/("""</div>
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
                <h2>NAJNOVIJI PROIZVODI</h2>
            </div>
            <div id="featured-slider" class="product-flexslider hidden-buttons">
                <div class="slider-items slider-width-col4 products-grid">
                    """),_display_(/*154.22*/for(item <- models.Item.getLastTenProducts()) yield /*154.67*/{_display_(Seq[Any](format.raw/*154.68*/("""
                        """),format.raw/*155.25*/("""<div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    """),_display_(/*158.38*/if(item.images.size() > 0)/*158.64*/{_display_(Seq[Any](format.raw/*158.65*/("""
                                        """),format.raw/*159.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*159.102*/item/*159.106*/.name),format.raw/*159.111*/("""" href=""""),_display_(/*159.120*/routes/*159.126*/.Items.itemRender(item.id)),format.raw/*159.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*159.190*/models/*159.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*159.245*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*162.38*/else/*162.42*/{_display_(Seq[Any](format.raw/*162.43*/("""
                                        """),format.raw/*163.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*163.102*/item/*163.106*/.name),format.raw/*163.111*/("""" href='"""),_display_(/*163.120*/routes/*163.126*/.Items.itemRender(item.id)),format.raw/*163.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*163.190*/routes/*163.196*/.Assets.versioned("images/product.png")),format.raw/*163.235*/("""'> </a>
                                            <div class="new-label new-top-left">new</div>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*166.38*/("""
                                """),format.raw/*167.33*/("""</div>
                                <div class="item-info">
                                    <div class="info-inner">
                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*170.102*/routes/*170.108*/.Items.itemRender(item.id)),format.raw/*170.134*/(""""> """),_display_(/*170.138*/item/*170.142*/.name),format.raw/*170.147*/(""" """),format.raw/*170.148*/("""</a> </div>
                                        <div class="item-content">
                                            """),format.raw/*172.69*/("""
                                                """),format.raw/*173.74*/("""
                                                    """),format.raw/*174.81*/("""
                                                        """),format.raw/*175.87*/("""
                                                    """),format.raw/*176.63*/("""
                                                    """),format.raw/*177.174*/("""
                                                """),format.raw/*178.59*/("""
                                            """),format.raw/*179.55*/("""
                                            """),format.raw/*180.45*/("""<div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*181.123*/item/*181.127*/.price),format.raw/*181.133*/(""" """),format.raw/*181.134*/("""KM </span> </span> </div>
                                            </div>

                                            """),format.raw/*184.144*/("""
                                                """),format.raw/*185.75*/("""
                                                    """),format.raw/*186.136*/("""
                                                """),format.raw/*187.59*/("""
                                                """),format.raw/*188.131*/("""
                                        """),format.raw/*189.41*/("""</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*194.22*/("""

                """),format.raw/*196.17*/("""</div>
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
                        <div class="item"><a href="#"><img src='"""),_display_(/*212.66*/routes/*212.72*/.Assets.versioned("images/b-logo3.png")),format.raw/*212.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*216.66*/routes/*216.72*/.Assets.versioned("images/b-logo2.png")),format.raw/*216.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*220.66*/routes/*220.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*220.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*224.66*/routes/*224.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*224.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*228.66*/routes/*228.72*/.Assets.versioned("images/b-logo5.png")),format.raw/*228.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*232.66*/routes/*232.72*/.Assets.versioned("images/b-logo6.png")),format.raw/*232.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*236.66*/routes/*236.72*/.Assets.versioned("images/b-logo1.png")),format.raw/*236.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->

                            <!-- Item -->
                        <div class="item"><a href="#"><img src='"""),_display_(/*240.66*/routes/*240.72*/.Assets.versioned("images/b-logo4.png")),format.raw/*240.111*/("""' alt="Image"></a> </div>
                            <!-- End Item -->
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*248.2*/("""
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
                  DATE: Thu Mar 31 17:09:47 CEST 2016
                  SOURCE: E:/namjestaj/app/views/index.scala.html
                  HASH: 4d3d6dc7d4abd08ce827f614756e65d9fd5075dc
                  MATRIX: 827->1|838->5|876->7|907->12|970->49|984->55|1055->106|1512->535|1528->541|1592->583|1633->596|1649->602|1713->644|3679->2582|3695->2588|3759->2630|3800->2643|3816->2649|3880->2691|5841->4624|5857->4630|5921->4672|5962->4685|5978->4691|6042->4733|8003->6666|8019->6672|8083->6714|8124->6727|8140->6733|8204->6775|10442->8986|10457->8992|10518->9031|10749->9235|10764->9241|10824->9279|11057->9485|11072->9491|11132->9529|11714->10084|11779->10133|11819->10135|11872->10160|12101->10362|12136->10388|12175->10389|12244->10430|12333->10491|12347->10495|12374->10500|12411->10509|12427->10515|12475->10541|12541->10579|12557->10585|12628->10634|12887->10874|12900->10878|12939->10879|13008->10920|13097->10981|13111->10985|13138->10990|13175->10999|13191->11005|13239->11031|13305->11069|13321->11075|13382->11114|13653->11354|13714->11387|13967->11612|13983->11618|14031->11644|14063->11648|14077->11652|14104->11657|14134->11658|14285->11805|14362->11879|14443->11960|14528->12047|14609->12110|14691->12284|14769->12343|14843->12398|14917->12443|15093->12590|15108->12594|15137->12600|15285->12817|15363->12892|15446->13028|15524->13087|15603->13212|15677->13267|15747->13308|16001->13530|16047->13547|17806->15278|17868->15323|17908->15324|17962->15349|18154->15513|18190->15539|18230->15540|18300->15581|18390->15642|18405->15646|18433->15651|18471->15660|18488->15666|18537->15692|18604->15730|18621->15736|18693->15785|18953->16025|18967->16029|19007->16030|19077->16071|19167->16132|19182->16136|19210->16141|19248->16150|19265->16156|19314->16182|19381->16220|19398->16226|19460->16265|19732->16505|19794->16538|20048->16763|20065->16769|20114->16795|20147->16799|20162->16803|20190->16808|20221->16809|20373->16956|20451->17030|20533->17111|20619->17198|20701->17261|20784->17435|20862->17494|20936->17549|21010->17594|21186->17741|21201->17745|21230->17751|21261->17752|21413->17973|21491->18048|21574->18184|21652->18243|21731->18374|21801->18415|22009->18591|22056->18609|22665->19190|22681->19196|22743->19235|22951->19415|22967->19421|23029->19460|23237->19640|23253->19646|23315->19685|23523->19865|23539->19871|23601->19910|23809->20090|23825->20096|23887->20135|24095->20315|24111->20321|24173->20360|24381->20540|24397->20546|24459->20585|24667->20765|24683->20771|24745->20810|24945->20979
                  LINES: 32->1|32->1|32->1|33->2|33->2|33->2|33->2|41->10|41->10|41->10|41->10|41->10|41->10|49->18|49->18|49->18|49->18|49->18|49->18|57->26|57->26|57->26|57->26|57->26|57->26|65->34|65->34|65->34|65->34|65->34|65->34|86->55|86->55|86->55|89->58|89->58|89->58|92->61|92->61|92->61|106->75|106->75|106->75|107->76|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|112->81|112->81|112->81|112->81|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|119->88|120->89|123->92|123->92|123->92|123->92|123->92|123->92|123->92|125->94|126->95|127->96|128->97|129->98|130->99|131->100|132->101|133->102|134->103|134->103|134->103|136->105|137->106|138->107|139->108|140->109|141->110|142->111|148->117|149->118|185->154|185->154|185->154|186->155|189->158|189->158|189->158|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|193->162|193->162|193->162|194->163|194->163|194->163|194->163|194->163|194->163|194->163|194->163|194->163|194->163|197->166|198->167|201->170|201->170|201->170|201->170|201->170|201->170|201->170|203->172|204->173|205->174|206->175|207->176|208->177|209->178|210->179|211->180|212->181|212->181|212->181|212->181|215->184|216->185|217->186|218->187|219->188|220->189|225->194|227->196|243->212|243->212|243->212|247->216|247->216|247->216|251->220|251->220|251->220|255->224|255->224|255->224|259->228|259->228|259->228|263->232|263->232|263->232|267->236|267->236|267->236|271->240|271->240|271->240|279->248
                  -- GENERATED --
              */
          