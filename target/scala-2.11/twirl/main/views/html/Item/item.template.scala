
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

class item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Item,java.util.List[String],AppUser,java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: Item)(locations: java.util.List[String])(currentUser: AppUser)(itemsToRecommend: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.111*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col1-layout wow bounceInUp animated">
        <div class="main container">
            <div class="col-main">
                <div class="row">

                    <div class="product-view">
                        <div class="product-next-prev"> <a class="product-next" href="#"><span></span></a> <a class="product-prev" href="#"><span></span></a> </div>
                        <div class="product-essential">

                                <input name="form_key" value="6UbXroakyQlbfQzK" type="hidden">
                                <div class="product-img-box col-sm-5 col-xs-12">
                                    <div class="new-label new-top-left"> New </div>
                                    <div class="product-image">
                                    """),_display_(/*17.38*/if(item.images.size() > 0)/*17.64*/ {_display_(Seq[Any](format.raw/*17.66*/("""
                                        """),format.raw/*18.41*/("""<div class="large-image">
                                            <a href='"""),_display_(/*19.55*/item/*19.59*/.images.get(0).getSize(768, 1024)),format.raw/*19.92*/("""' class="cloud-zoom" id="zoom1" rel="useWrapper: false, adjustY:0, adjustX:20" >
                                                <img src='"""),_display_(/*20.60*/item/*20.64*/.images.get(0).getSize(465, 563)),format.raw/*20.96*/("""' alt="">
                                            </a>
                                        </div>
                                        <div class="flexslider flexslider-thumb">
                                            <ul class="previews-list slides">
                                            """),_display_(/*25.46*/for(image <- item.images) yield /*25.71*/ {_display_(Seq[Any](format.raw/*25.73*/("""
                                                """),format.raw/*26.49*/("""<li><a href='"""),_display_(/*26.63*/image/*26.68*/.getSize(2000, 3000)),format.raw/*26.88*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*26.154*/image/*26.159*/.getSize(465, 563)),format.raw/*26.177*/("""' "><img src='"""),_display_(/*26.192*/image/*26.197*/.getSize(75, 90)),format.raw/*26.213*/("""' alt = "Thumbnail 1"/></a></li>

                                            """)))}),format.raw/*28.46*/("""
                                            """),format.raw/*29.45*/("""</ul>
                                        </div>
                                    """)))}/*31.38*/else/*31.42*/{_display_(Seq[Any](format.raw/*31.43*/("""
                                        """),format.raw/*32.41*/("""<div class="large-image">
                                            <img src='"""),_display_(/*33.56*/routes/*33.62*/.Assets.versioned("images/product.png")),format.raw/*33.101*/("""' alt="">
                                        </div>
                                        """)))}),format.raw/*35.42*/("""
                                    """),format.raw/*36.37*/("""</div>
                                        <!-- end: more-images -->
                                </div>
                            <div class="product-shop col-sm-7 col-xs-12">
                                <div class="product-name">
                                    <h1>"""),_display_(/*41.42*/item/*41.46*/.name),format.raw/*41.51*/("""</h1>
                                </div>

                                <div class="price-block">
                                    <div class="price-box">
                                        <p class="special-price"> <span class="price-label"></span> <span id="product-price-48" class="price"> """),_display_(/*46.145*/item/*46.149*/.price),format.raw/*46.155*/(""" """),format.raw/*46.156*/("""KM </span> </p>
                                        """),_display_(/*47.42*/if(item.oldPrice != null && item.oldPrice != "" )/*47.91*/{_display_(Seq[Any](format.raw/*47.92*/("""
                                            """),format.raw/*48.45*/("""<p class="old-price"> <span class="price-label"></span> <span class="price"> """),_display_(/*48.123*/item/*48.127*/.oldPrice),format.raw/*48.136*/(""" """),format.raw/*48.137*/("""KM </span>
                                        """)))}),format.raw/*49.42*/("""
                                        """),format.raw/*50.41*/("""</div>
                                    </div>

                                    <div class="short-description">
                                        <h2>Opis proizvoda</h2>
                                        <p> """),_display_(/*55.46*/item/*55.50*/.description),format.raw/*55.62*/(""" """),format.raw/*55.63*/("""</p>
                                    </div>

                                    <div class="short-description">
                                        <h2>Informacije o prodavaču</h2>
                                        <p> Prodavač: """),_display_(/*60.56*/item/*60.60*/.user.name),format.raw/*60.70*/("""</p>
                                        <p> Adresa:   """),_display_(/*61.56*/item/*61.60*/.user.address),format.raw/*61.73*/(""", """),_display_(/*61.76*/item/*61.80*/.user.city),format.raw/*61.90*/("""</p>
                                        <p> Email:    """),_display_(/*62.56*/item/*62.60*/.user.email),format.raw/*62.71*/("""</p>
                                        <p> Telefon:  """),_display_(/*63.56*/item/*63.60*/.user.phone),format.raw/*63.71*/("""</p>
                                    </div>

                                    """),_display_(/*66.38*/if(currentUser != null && item.user.id == currentUser.id)/*66.95*/{_display_(Seq[Any](format.raw/*66.96*/("""
                                        """),format.raw/*67.41*/("""<div class="short-description">
                                            <h2>Dodaj slike za proizvod</h2>
                                            <form  method="GET" role="form" action=""""),_display_(/*69.86*/routes/*69.92*/.Images.imagesUploadRender(item.id)),format.raw/*69.127*/("""" >
                                                <div class="buttons-set">
                                                    <button class="button create-account"><span>Dodaj slike</span></button>
                                                </div>
                                            </form>
                                        </div>
                                    """)))}),format.raw/*75.38*/("""

                                    """),format.raw/*77.37*/("""<div class="social">
                                        <ul class="link">
                                            <li class="fb"><a href="#"></a></li>
                                            <li class="tw"><a href="#"></a></li>
                                            <li class="googleplus"><a href="#"></a></li>
                                            <li class="linkedin"><a href="#"></a></li>
                                        </ul>
                                    </div>

                                </div>
                        </div>
                        <div class="product-collateral col-lg-12 col-sm-12 col-xs-12 bounceInUp animated">

                            <div class="add_info">
                                <ul id="product-detail-tab" class="nav nav-tabs product-tabs">
                                    <li class="active"> <a href="#product_tabs_description" data-toggle="tab"> Lokacije objekata </a> </li>
                                    <li><a href="#product_tabs_tags" data-toggle="tab">Tags</a></li>
                                    <li> <a href="#reviews_tabs" data-toggle="tab">Reviews</a> </li>
                                    <li> <a href="#product_tabs_custom" data-toggle="tab">Custom Tab</a> </li>
                                    <li> <a href="#product_tabs_custom1" data-toggle="tab">Custom Tab1</a> </li>
                                </ul>
                                <div id="productTabContent" class="tab-content">
                                    <div class="tab-pane fade in active" id="product_tabs_description">
                                        <div class="std">
                                            <p>Pogledajte lokacije naših objekata i posjetite nas u najbližem objektu</p>
                                            <div id="map" class="map2"></div>
                                            <input id="locations" name="lat" value=""""),_display_(/*103.86*/locations),format.raw/*103.95*/("""" style="display: none">
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
                                    <div class="tab-pane fade" id="product_tabs_custom">
                                        <div class="product-tabs-content-inner clearfix">












                                        </div>
                                    </div>
                                    <div class="tab-pane fade" id="product_tabs_custom1">
                                        <div class="product-tabs-content-inner clearfix">
                                            <p> <strong> Comfortable </strong><span>&nbsp;preshrunk shirts. Highest Quality Printing.  6.1 oz. 100% preshrunk heavyweight cotton Shoulder-to-shoulder taping Double-needle sleeves and bottom hem

                                                Lorem Ipsumis
                                                simply dummy text of the printing and typesetting industry. Lorem Ipsum
                                                has been the industry's standard dummy text ever since the 1500s, when
                              """),
format.raw("""                  an unknown printer took a galley of type and scrambled it to make a type
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
                    <h2>SLIČNI PROIZVODI</h2>
                </div>
                <div id="related-products-slider" class="product-flexslider hidden-buttons">
                    <div class="slider-items slider-width-col4 products-grid">
                        """),_display_(/*362.26*/for(item <- itemsToRecommend) yield /*362.55*/ {_display_(Seq[Any](format.raw/*362.57*/("""
                            """),format.raw/*363.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*366.38*/if(item.images.size() > 0)/*366.64*/{_display_(Seq[Any](format.raw/*366.65*/("""
                                        """),format.raw/*367.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*367.102*/item/*367.106*/.name),format.raw/*367.111*/("""" href=""""),_display_(/*367.120*/routes/*367.126*/.Items.itemRender(item.id)),format.raw/*367.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*367.190*/models/*367.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*367.245*/("""'> </a>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*369.38*/else/*369.42*/{_display_(Seq[Any](format.raw/*369.43*/("""
                                        """),format.raw/*370.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*370.102*/item/*370.106*/.name),format.raw/*370.111*/("""" href='"""),_display_(/*370.120*/routes/*370.126*/.Items.itemRender(item.id)),format.raw/*370.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*370.190*/routes/*370.196*/.Assets.versioned("images/product.png")),format.raw/*370.235*/("""'> </a>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*372.38*/("""
                                    """),format.raw/*373.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href='"""),_display_(/*376.106*/routes/*376.112*/.Items.itemRender(item.id)),format.raw/*376.138*/("""'> """),_display_(/*376.142*/item/*376.146*/.name),format.raw/*376.151*/(""" """),format.raw/*376.152*/("""</a> </div>
                                            <div class="item-content">

                                                <div class="item-price">
                                                    <div class="price-box"> <span class="regular-price"> <span class="price"> """),_display_(/*380.128*/item/*380.132*/.price),format.raw/*380.138*/(""" """),format.raw/*380.139*/("""KM</span> </span> </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*388.26*/("""
                    """),format.raw/*389.21*/("""</div>
                </div>
            </div>
        </div>
    </section>
    <!-- Related Products Slider End -->

    <!-- Featured Slider -->
    <section class="featured-pro container wow bounceInUp animated">
        <div class="slider-items-products">
            <div class="new_title center">
                <h2>NAJNOVIJI PROIZVODI</h2>
            </div>
            <div id="featured-slider" class="product-flexslider hidden-buttons">
                <div class="slider-items slider-width-col4 products-grid">
                """),_display_(/*404.18*/for(item <- models.Item.getLastTenProducts()) yield /*404.63*/{_display_(Seq[Any](format.raw/*404.64*/("""
                    """),format.raw/*405.21*/("""<div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                            """),_display_(/*408.30*/if(item.images.size() > 0)/*408.56*/{_display_(Seq[Any](format.raw/*408.57*/("""
                                """),format.raw/*409.33*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*409.94*/item/*409.98*/.name),format.raw/*409.103*/("""" href=""""),_display_(/*409.112*/routes/*409.118*/.Items.itemRender(item.id)),format.raw/*409.144*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*409.182*/models/*409.188*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*409.237*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            """)))}/*412.30*/else/*412.34*/{_display_(Seq[Any](format.raw/*412.35*/("""
                                """),format.raw/*413.33*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*413.94*/item/*413.98*/.name),format.raw/*413.103*/("""" href='"""),_display_(/*413.112*/routes/*413.118*/.Items.itemRender(item.id)),format.raw/*413.144*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*413.182*/routes/*413.188*/.Assets.versioned("images/product.png")),format.raw/*413.227*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            """)))}),format.raw/*416.30*/("""
                            """),format.raw/*417.29*/("""</div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*420.98*/routes/*420.104*/.Items.itemRender(item.id)),format.raw/*420.130*/(""""> """),_display_(/*420.134*/item/*420.138*/.name),format.raw/*420.143*/(""" """),format.raw/*420.144*/("""</a> </div>
                                    <div class="item-content">
                                        """),format.raw/*422.65*/("""
                                        """),format.raw/*423.66*/("""
                                        """),format.raw/*424.69*/("""
                                        """),format.raw/*425.71*/("""
                                        """),format.raw/*426.51*/("""
                                        """),format.raw/*427.162*/("""
                                        """),format.raw/*428.51*/("""
                                        """),format.raw/*429.51*/("""
                                    """),format.raw/*430.37*/("""<div class="item-price">
                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*431.115*/item/*431.119*/.price),format.raw/*431.125*/(""" """),format.raw/*431.126*/("""KM </span> </span> </div>
                                    </div>
                                        """),format.raw/*433.140*/("""
                                        """),format.raw/*434.67*/("""
                                        """),format.raw/*435.124*/("""
                                        """),format.raw/*436.51*/("""
                                        """),format.raw/*437.123*/("""
                                    """),format.raw/*438.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*443.18*/("""

                """),format.raw/*445.17*/("""</div>
            </div>
        </div>
    </section>
    <!-- End Featured Slider -->
    <!-- service -->
    <div class="our-features-box wow bounceInUp animated">
        <ul>
            <li>
                <div class="feature-box">
                    <div class="icon-truck"></div>
                    <div class="content">Dostava na Vašu adresu</div>
                </div>
            </li>
            <li>
                <div class="feature-box">
                    <div class="icon-support"></div>
                    <div class="content">Trebate pomoć """),_display_(/*462.57*/item/*462.61*/.user.phone),format.raw/*462.72*/("""</div>
                </div>
            </li>
            <li>
                <div class="feature-box">
                    <div class="icon-money"></div>
                    <div class="content">Plaćanje gotovinom ili karticom</div>
                </div>
            </li>
            <li class="last">
                <div class="feature-box">
                    <div class="icon-return"></div>
                    <div class="content">Montiranje namještaja</div>
                </div>
            </li>
        </ul>
    </div>
    <!-- end service -->
    <!--GOOGLE -->
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCfCf4BKPmFsOCDcyc1sq-5OWwn1O4F2Rg&callback=initialize"></script>
    <script src='"""),_display_(/*482.19*/routes/*482.25*/.Assets.versioned("javascripts/map.js")),format.raw/*482.64*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*483.42*/routes/*483.48*/.Assets.versioned("javascripts/googleAnalytics.js")),format.raw/*483.99*/("""'></script>

""")))}))
      }
    }
  }

  def render(item:Item,locations:java.util.List[String],currentUser:AppUser,itemsToRecommend:java.util.List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(item)(locations)(currentUser)(itemsToRecommend)

  def f:((Item) => (java.util.List[String]) => (AppUser) => (java.util.List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (item) => (locations) => (currentUser) => (itemsToRecommend) => apply(item)(locations)(currentUser)(itemsToRecommend)

  def ref: this.type = this

}


}

/**/
object item extends item_Scope0.item
              /*
                  -- GENERATED --
                  DATE: Thu Mar 31 17:19:43 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/item.scala.html
                  HASH: feba77ff99790658d3b77dec7defc4080c85dea0
                  MATRIX: 798->1|1003->110|1030->112|1041->116|1079->118|1110->123|1971->957|2006->983|2046->985|2115->1026|2222->1106|2235->1110|2289->1143|2456->1283|2469->1287|2522->1319|2860->1630|2901->1655|2941->1657|3018->1706|3059->1720|3073->1725|3114->1745|3208->1811|3223->1816|3263->1834|3306->1849|3321->1854|3359->1870|3469->1949|3542->1994|3651->2084|3664->2088|3703->2089|3772->2130|3880->2211|3895->2217|3956->2256|4085->2354|4150->2391|4463->2677|4476->2681|4502->2686|4838->2994|4852->2998|4880->3004|4910->3005|4994->3062|5052->3111|5091->3112|5164->3157|5270->3235|5284->3239|5315->3248|5345->3249|5428->3301|5497->3342|5752->3570|5765->3574|5798->3586|5827->3587|6099->3832|6112->3836|6143->3846|6230->3906|6243->3910|6277->3923|6307->3926|6320->3930|6351->3940|6438->4000|6451->4004|6483->4015|6570->4075|6583->4079|6615->4090|6728->4176|6794->4233|6833->4234|6902->4275|7123->4469|7138->4475|7195->4510|7619->4903|7685->4941|9676->6904|9707->6913|31296->28454|31342->28483|31383->28485|31441->28514|31641->28686|31677->28712|31717->28713|31787->28754|31877->28815|31892->28819|31920->28824|31958->28833|31975->28839|32024->28865|32091->28903|32108->28909|32180->28958|32350->29108|32364->29112|32404->29113|32474->29154|32564->29215|32579->29219|32607->29224|32645->29233|32662->29239|32711->29265|32778->29303|32795->29309|32857->29348|33039->29498|33105->29535|33371->29772|33388->29778|33437->29804|33470->29808|33485->29812|33513->29817|33544->29818|33857->30102|33872->30106|33901->30112|33932->30113|34285->30434|34335->30455|34906->30998|34968->31043|35008->31044|35058->31065|35234->31213|35270->31239|35310->31240|35372->31273|35461->31334|35475->31338|35503->31343|35541->31352|35558->31358|35607->31384|35674->31422|35691->31428|35763->31477|35999->31693|36013->31697|36053->31698|36115->31731|36204->31792|36218->31796|36246->31801|36284->31810|36301->31816|36350->31842|36417->31880|36434->31886|36496->31925|36744->32141|36802->32170|37043->32383|37060->32389|37109->32415|37142->32419|37157->32423|37185->32428|37216->32429|37360->32568|37430->32634|37500->32703|37570->32774|37640->32825|37711->32987|37781->33038|37851->33089|37917->33126|38085->33265|38100->33269|38129->33275|38160->33276|38299->33484|38369->33551|38440->33675|38510->33726|38581->33849|38647->33886|38835->34042|38882->34060|39481->34631|39495->34635|39528->34646|40299->35389|40315->35395|40376->35434|40457->35487|40473->35493|40546->35544
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|59->28|60->29|62->31|62->31|62->31|63->32|64->33|64->33|64->33|66->35|67->36|72->41|72->41|72->41|77->46|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|80->49|81->50|86->55|86->55|86->55|86->55|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|97->66|97->66|97->66|98->67|100->69|100->69|100->69|106->75|108->77|134->103|134->103|394->362|394->362|394->362|395->363|398->366|398->366|398->366|399->367|399->367|399->367|399->367|399->367|399->367|399->367|399->367|399->367|399->367|401->369|401->369|401->369|402->370|402->370|402->370|402->370|402->370|402->370|402->370|402->370|402->370|402->370|404->372|405->373|408->376|408->376|408->376|408->376|408->376|408->376|408->376|412->380|412->380|412->380|412->380|420->388|421->389|436->404|436->404|436->404|437->405|440->408|440->408|440->408|441->409|441->409|441->409|441->409|441->409|441->409|441->409|441->409|441->409|441->409|444->412|444->412|444->412|445->413|445->413|445->413|445->413|445->413|445->413|445->413|445->413|445->413|445->413|448->416|449->417|452->420|452->420|452->420|452->420|452->420|452->420|452->420|454->422|455->423|456->424|457->425|458->426|459->427|460->428|461->429|462->430|463->431|463->431|463->431|463->431|465->433|466->434|467->435|468->436|469->437|470->438|475->443|477->445|494->462|494->462|494->462|514->482|514->482|514->482|515->483|515->483|515->483
                  -- GENERATED --
              */
          