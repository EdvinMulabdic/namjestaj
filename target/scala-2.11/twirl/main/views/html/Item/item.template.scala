
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object item_Scope0 {
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

class item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Item,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: Item)(locations: java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col1-layout wow bounceInUp animated">
        <div class="main container">
            <div class="col-main">
                <div class="row">

                    <div class="product-view">
                        <div class="product-next-prev"> <a class="product-next" href="#"><span></span></a> <a class="product-prev" href="#"><span></span></a> </div>
                        <div class="product-essential">
                            <form action="#" method="post" id="product_addtocart_form">
                                <input name="form_key" value="6UbXroakyQlbfQzK" type="hidden">
                                <div class="product-img-box col-sm-5 col-xs-12">
                                    <div class="new-label new-top-left"> New </div>
                                    <div class="product-image">
                                        <div class="large-image">
                                            <a href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/product1.jpg")),format.raw/*18.101*/("""' class="cloud-zoom" id="zoom1" rel="useWrapper: false, adjustY:0, adjustX:20" >
                                                <img src='"""),_display_(/*19.60*/routes/*19.66*/.Assets.versioned("images/product1.jpg")),format.raw/*19.106*/("""' alt="">
                                            </a>
                                        </div>
                                        <div class="flexslider flexslider-thumb">
                                            <ul class="previews-list slides">
                                                <li><a href='"""),_display_(/*24.63*/routes/*24.69*/.Assets.versioned("images/product1.jpg")),format.raw/*24.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*24.175*/routes/*24.181*/.Assets.versioned("images/product1.jpg")),format.raw/*24.221*/("""' "><img src='"""),_display_(/*24.236*/routes/*24.242*/.Assets.versioned("images/product1.jpg")),format.raw/*24.282*/("""' alt = "Thumbnail 1"/></a></li>
                                                <li><a href='"""),_display_(/*25.63*/routes/*25.69*/.Assets.versioned("images/product1.jpg")),format.raw/*25.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*25.175*/routes/*25.181*/.Assets.versioned("images/product1.jpg")),format.raw/*25.221*/("""' "><img src='"""),_display_(/*25.236*/routes/*25.242*/.Assets.versioned("images/product1.jpg")),format.raw/*25.282*/("""' alt = "Thumbnail 2"/></a></li>
                                                <li><a href='"""),_display_(/*26.63*/routes/*26.69*/.Assets.versioned("images/product1.jpg")),format.raw/*26.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*26.175*/routes/*26.181*/.Assets.versioned("images/product1.jpg")),format.raw/*26.221*/("""' "><img src='"""),_display_(/*26.236*/routes/*26.242*/.Assets.versioned("images/product1.jpg")),format.raw/*26.282*/("""' alt = "Thumbnail 1"/></a></li>
                                                <li><a href='"""),_display_(/*27.63*/routes/*27.69*/.Assets.versioned("images/product1.jpg")),format.raw/*27.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*27.175*/routes/*27.181*/.Assets.versioned("images/product1.jpg")),format.raw/*27.221*/("""' "><img src='"""),_display_(/*27.236*/routes/*27.242*/.Assets.versioned("images/product1.jpg")),format.raw/*27.282*/("""' alt = "Thumbnail 2"/></a></li>
                                                <li><a href='"""),_display_(/*28.63*/routes/*28.69*/.Assets.versioned("images/product1.jpg")),format.raw/*28.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*28.175*/routes/*28.181*/.Assets.versioned("images/product1.jpg")),format.raw/*28.221*/("""' "><img src='"""),_display_(/*28.236*/routes/*28.242*/.Assets.versioned("images/product1.jpg")),format.raw/*28.282*/("""' alt = "Thumbnail 2"/></a></li>
                                                <li><a href='"""),_display_(/*29.63*/routes/*29.69*/.Assets.versioned("images/product1.jpg")),format.raw/*29.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*29.175*/routes/*29.181*/.Assets.versioned("images/product1.jpg")),format.raw/*29.221*/("""' "><img src='"""),_display_(/*29.236*/routes/*29.242*/.Assets.versioned("images/product1.jpg")),format.raw/*29.282*/("""' alt = "Thumbnail 2"/></a></li>
                                                <li><a href='"""),_display_(/*30.63*/routes/*30.69*/.Assets.versioned("images/product1.jpg")),format.raw/*30.109*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*30.175*/routes/*30.181*/.Assets.versioned("images/product1.jpg")),format.raw/*30.221*/("""' "><img src='"""),_display_(/*30.236*/routes/*30.242*/.Assets.versioned("images/product1.jpg")),format.raw/*30.282*/("""' alt = "Thumbnail 2"/></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                        <!-- end: more-images -->
                                </div>
                                <div class="product-shop col-sm-7 col-xs-12">
                                    <div class="product-name">
                                        <h1>Sample Product</h1>
                                    </div>

                                    <div class="ratings">
                                        <div class="rating-box">
                                            <div class="rating"></div>
                                        </div>
                                        <p class="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Your Review</a> </p>
                                    </div>

                                    <div class="price-block">
                                        <div class="price-box">
                                            <p class="special-price"> <span class="price-label">Special Price</span> <span id="product-price-48" class="price"> $309.99 </span> </p>
                                            <p class="old-price"> <span class="price-label">Regular Price:</span> <span class="price"> $315.99 </span> </p>



                                            <p class="availability in-stock pull-right"><span>In Stock</span></p>
                                        </div>
                                    </div>

                                    <div class="short-description">
                                        <h2>Quick Overview</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla. Donec a neque libero. Pellentesque aliquet, sem eget laoreet ultrices, ipsum metus feugiat sem, quis fermentum turpis eros eget velit. Donec ac tempus ante. </p>
                                    </div>



                                    <div class="add-to-box">
                                        <div class="add-to-cart">
                                            <div class="pull-left">
                                                <div class="custom pull-left">
                                                    <button onClick="var result = document.getElementById('qty'); var qty = result.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 0 ) result.value--;return false;" class="reduced items-count" type="button"><i class="icon-minus">&nbsp;</i></button>
                                                    <input type="text" class="input-text qty" title="Qty" value="1" maxlength="12" id="qty" name="qty">
                                                    <button onClick="var result = document.getElementById('qty'); var qty = result.value; if( !isNaN( qty )) result.value++;return false;" class="increase items-count" type="button"><i class="icon-plus">&nbsp;</i></button>
                                                </div>
                                            </div>

                                            <button onClick="productAddToCartForm.submit(this)" class="button btn-cart" title="Add to Cart" type="button"><span><i class="icon-basket"></i> Add to Cart</span></button>

                                        </div>
                                        <div class="email-addto-box">
                                            <p class="email-friend"><a href="#" class=""><span>Email to a Friend</span></a></p>
                                            <ul class="add-to-links">
                                                <li> <a class="link-wishlist" href="#"><span>Add to Wishlist</span></a></li>
                                                <li><span class="separator">|</span> <a class="link-compare" href="#"><span>Add to Compare</span></a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="social">
                                        <ul class="link">
                                            <li class="fb"><a href="#"></a></li>
                                            <li class="tw"><a href="#"></a></li>
                                            <li class="googleplus"><a href="#"></a></li>
                                            <li class="rss"><a href="#"></a></li>
                                            <li class="pintrest"><a href="#"></a></li>
                                            <li class="linkedin"><a href="#"></a></li>
                                            <li class="youtube"><a href="#"></a></li>
                                        </ul>
                                    </div>



                                </div>

                            </form>
                        </div>
                        <div class="product-collateral col-lg-12 col-sm-12 col-xs-12 bounceInUp animated">
                            <div class="add_info">
                                <ul id="product-detail-tab" class="nav nav-tabs product-tabs">
                                    <li class="active"> <a href="#product_tabs_description" data-toggle="tab"> Product Description </a> </li>
                                    <li><a href="#product_tabs_tags" data-toggle="tab">Tags</a></li>
                                    <li> <a href="#reviews_tabs" data-toggle="tab">Reviews</a> </li>
                                    <li> <a href="#product_tabs_custom" data-toggle="tab">Custom Tab</a> </li>
                                    <li> <a href="#product_tabs_custom1" data-toggle="tab">Custom Tab1</a> </li>
                                </ul>
                                <div id="productTabContent" class="tab-content">
                                    <div class="tab-pane fade in active" id="product_tabs_description">
                                        <div class="std">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla. Donec a neque libero. Pellentesque aliquet, sem eget laoreet ultrices, ipsum metus feugiat sem, quis fermentum turpis eros eget velit. Donec ac tempus ante. Fusce ultricies massa massa. Fusce aliquam, purus eget sagittis vulputate, sapien libero hendrerit est, sed commodo augue nisi non neque. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tempor, lorem et placerat vestibulum, metus nisi posuere nisl, in accumsan elit odio quis mi. Cras neque metus, consequat et blandit et, luctus a nunc. Etiam gravida vehicula tellus, in imperdiet ligula euismod eget. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam erat mi, rutrum at sollicitudin rhoncus, ultricies posuere erat. Duis convallis, arcu nec aliquam consequat, purus felis vehicula felis, a dapibus enim lorem nec augue.</p>
                                            <p> Nunc facilisis sagittis ullamcorper. Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus. Sed et lorem nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean eleifend laoreet congue. Vivamus adipiscing nisl ut dolor dignissim semper. Nulla luctus malesuada tincidunt. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer enim purus, posuere at ultricies eu, placerat a felis. Suspendisse aliquet urna pretium eros convallis interdum. Quisque in arcu id dui vulputate mollis eget non arcu. Aenean et nulla purus. Mauris vel tellus non nunc mattis lobortis.</p>
                                        </div>
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
                                                    <form id="review-form" method="post" action="http://www.magikcommerce.com/review/product/post/id/176/">
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
                                                                           """),
format.raw(""" <div class="rating"></div>
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
                                    <div class="tab-pane fade" id="product_tabs_custom">
                                        <div class="product-tabs-content-inner clearfix">
                                            <p><strong>Lorem Ipsum</strong><span>&nbsp;is
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

                    </div>
                </div>
            </div></div>
    </section>
    <!-- Main Container End -->

    <!-- Related Products Slider -->
    <section class="related-pro wow bounceInUp animated">
        <div class="container">
            <div class="slider-items-products">
                <div class="new_title center">
                    <h2>Related Products</h2>
                </div>
                <div id="related-products-slider" class="product-flexslider hidden-buttons">
                    <div class="slider-items slider-width-col4 products-grid">
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="new-label new-top-left">new</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                            <!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="sale-label">Sale</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
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
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>


                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->

                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="sale-label">Sale</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

                                </div>
                                <div class="item-info">
                                    <div"""),
format.raw(""" class="info-inner">
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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                            <!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>


                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="sale-label">Sale</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>


                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->

                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Related Products Slider End -->

    <!-- Upsell Product Slider -->
    <section class="upsell-pro wow bounceInUp animated">
        <div class="container">
            <div class="slider-items-products">
                <div class="new_title center">
                    <h2>Upsell Products</h2>
                </div>
                <div id="upsell-products-slider" class="product-flexslider hidden-buttons">
                    <div class="slider-items slider-width-col4 products-grid">
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="new-label new-top-left">new</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                            <!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="sale-label">Sale</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
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
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>


                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->

                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="sale-label">Sale</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                    <p c"""),
format.raw("""lass="rating-links"> <a href="#">1 Review(s)</a> <span class="separator">|</span> <a href="#">Add Review</a> </p>
                                                </div>
                                            </div>
                                            <div class="item-price">
                                                <div class="price-box"> <span class="regular-price"> <span class="price">$125.00</span> </span> </div>
                                            </div>
                                            <div class="actions"><a href="wishlist.html" class="link-wishlist" title="Add to Wishlist"></a>
                                                <div class="add_cart">
                                                    <button class="button btn-cart" type="button"><span>Add to Cart</span></button>
                                                </div>
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                            <!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>


                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>
                                        <div class="sale-label">Sale</div>

                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- Item -->
                        <div class="item">
                            <div class="item-inner">
                                <div class="item-img">
                                    <div class="item-img-info"> <a class="product-image" title="Retis lapen casen" href="product_detail.html"> <img alt="Retis lapen casen" src="products-images/product1.jpg"> </a>


                                        <a class="quickview-btn" ><span>Quick View</span></a>

                                    </div>

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
                                                <a href="compare.html" class="link-compare" title="Add to Compare"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- End Item -->

                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Upsell Product Slider End -->
    <!-- service -->
    <div class="our-features-box wow bounceInUp animated">
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
    <!-- end service -->
""")))}))
      }
    }
  }

  def render(item:Item,locations:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(item)(locations)

  def f:((Item) => (java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (item) => (locations) => apply(item)(locations)

  def ref: this.type = this

}


}

/**/
object item extends item_Scope0.item
              /*
                  -- GENERATED --
                  DATE: Fri Mar 25 02:52:08 CET 2016
                  SOURCE: E:/namjestaj/app/views/Item/item.scala.html
                  HASH: 74a366d8e10d2bad1b6a35327c1380f21e9d638f
                  MATRIX: 769->1|911->48|939->51|950->55|988->57|1020->63|2066->1082|2081->1088|2143->1128|2311->1269|2326->1275|2388->1315|2748->1648|2763->1654|2825->1694|2919->1760|2935->1766|2997->1806|3040->1821|3056->1827|3118->1867|3241->1963|3256->1969|3318->2009|3412->2075|3428->2081|3490->2121|3533->2136|3549->2142|3611->2182|3734->2278|3749->2284|3811->2324|3905->2390|3921->2396|3983->2436|4026->2451|4042->2457|4104->2497|4227->2593|4242->2599|4304->2639|4398->2705|4414->2711|4476->2751|4519->2766|4535->2772|4597->2812|4720->2908|4735->2914|4797->2954|4891->3020|4907->3026|4969->3066|5012->3081|5028->3087|5090->3127|5213->3223|5228->3229|5290->3269|5384->3335|5400->3341|5462->3381|5505->3396|5521->3402|5583->3442|5706->3538|5721->3544|5783->3584|5877->3650|5893->3656|5955->3696|5998->3711|6014->3717|6076->3757
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|49->18|49->18|49->18|50->19|50->19|50->19|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30
                  -- GENERATED --
              */
          