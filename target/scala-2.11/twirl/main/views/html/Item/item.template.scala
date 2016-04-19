
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
    """),format.raw/*3.5*/("""<div class="container">
        <div>
            """),_display_(/*5.14*/if(flash.containsKey("success"))/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
                """),format.raw/*6.17*/("""<div class="alert alert-success" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*8.67*/flash/*8.72*/.get("success")),format.raw/*8.87*/("""</span>

                </div>
            """)))}),format.raw/*11.14*/("""
            """),_display_(/*12.14*/if(flash.containsKey("error"))/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
                """),format.raw/*13.17*/("""<div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span>
                    """),_display_(/*16.22*/flash/*16.27*/.get("error")),format.raw/*16.40*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
        """),format.raw/*19.9*/("""</div>
    </div>
    <!-- Main Container -->
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
                                    """),_display_(/*35.38*/if(item.images.size() > 0)/*35.64*/ {_display_(Seq[Any](format.raw/*35.66*/("""
                                        """),format.raw/*36.41*/("""<div class="large-image">
                                            <a href='"""),_display_(/*37.55*/item/*37.59*/.images.get(0).getSize(768, 1024)),format.raw/*37.92*/("""' class="cloud-zoom" id="zoom1" rel="useWrapper: false, adjustY:0, adjustX:20" >
                                                <img src='"""),_display_(/*38.60*/item/*38.64*/.images.get(0).getSize(465, 563)),format.raw/*38.96*/("""' alt="">
                                            </a>
                                        </div>
                                        <div class="flexslider flexslider-thumb">
                                            <ul class="previews-list slides">
                                            """),_display_(/*43.46*/for(image <- item.images) yield /*43.71*/ {_display_(Seq[Any](format.raw/*43.73*/("""
                                                """),format.raw/*44.49*/("""<li><a href='"""),_display_(/*44.63*/image/*44.68*/.getSize(2000, 3000)),format.raw/*44.88*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*44.154*/image/*44.159*/.getSize(465, 563)),format.raw/*44.177*/("""' "><img src='"""),_display_(/*44.192*/image/*44.197*/.getSize(75, 90)),format.raw/*44.213*/("""' alt = "Thumbnail 1"/></a></li>

                                            """)))}),format.raw/*46.46*/("""
                                            """),format.raw/*47.45*/("""</ul>
                                        </div>
                                    """)))}/*49.38*/else/*49.42*/{_display_(Seq[Any](format.raw/*49.43*/("""
                                        """),format.raw/*50.41*/("""<div class="large-image">
                                            <img src='"""),_display_(/*51.56*/routes/*51.62*/.Assets.versioned("images/product.png")),format.raw/*51.101*/("""' alt="">
                                        </div>
                                        """)))}),format.raw/*53.42*/("""
                                    """),format.raw/*54.37*/("""</div>
                                        <!-- end: more-images -->
                                </div>
                            <div class="product-shop col-sm-7 col-xs-12">
                                <div class="product-name">
                                    <h1>"""),_display_(/*59.42*/item/*59.46*/.name),format.raw/*59.51*/("""</h1>
                                </div>

                                <div class="price-block">
                                    <div class="price-box">
                                        <p class="special-price"> <span class="price-label"></span> <span id="product-price-48" class="price"> """),_display_(/*64.145*/item/*64.149*/.price),format.raw/*64.155*/(""" """),format.raw/*64.156*/("""KM </span> </p>
                                        """),_display_(/*65.42*/if(item.oldPrice != null && item.oldPrice != "" )/*65.91*/{_display_(Seq[Any](format.raw/*65.92*/("""
                                            """),format.raw/*66.45*/("""<p class="old-price"> <span class="price-label"></span> <span class="price"> """),_display_(/*66.123*/item/*66.127*/.oldPrice),format.raw/*66.136*/(""" """),format.raw/*66.137*/("""KM </span>
                                        """)))}),format.raw/*67.42*/("""
                                        """),format.raw/*68.41*/("""</div>
                                    </div>

                                    <div class="short-description">
                                        <h2>Opis proizvoda</h2>
                                        <p> """),_display_(/*73.46*/item/*73.50*/.description),format.raw/*73.62*/(""" """),format.raw/*73.63*/("""</p>
                                    </div>

                                    <div class="short-description">
                                        <h2>Informacije o prodavaču</h2>
                                        <p> Prodavač: """),_display_(/*78.56*/item/*78.60*/.user.name),format.raw/*78.70*/("""</p>
                                        <p> Adresa:   """),_display_(/*79.56*/item/*79.60*/.user.address),format.raw/*79.73*/(""", """),_display_(/*79.76*/item/*79.80*/.user.city),format.raw/*79.90*/("""</p>
                                        <p> Email:    """),_display_(/*80.56*/item/*80.60*/.user.email),format.raw/*80.71*/("""</p>
                                        <p> Telefon:  """),_display_(/*81.56*/item/*81.60*/.user.phone),format.raw/*81.71*/("""</p>
                                        <p> Radno vrijeme:  """),_display_(/*82.62*/item/*82.66*/.user.workTime),format.raw/*82.80*/("""</p>
                                    </div>

                                    """),_display_(/*85.38*/if(currentUser != null && item.user.id == currentUser.id)/*85.95*/{_display_(Seq[Any](format.raw/*85.96*/("""
                                        """),format.raw/*86.41*/("""<div class="short-description">
                                            <h2>Dodaj slike za proizvod</h2>
                                            <form  method="GET" role="form" action=""""),_display_(/*88.86*/routes/*88.92*/.Images.imagesUploadRender(item.id)),format.raw/*88.127*/("""" >
                                                <div class="buttons-set">
                                                    <button class="button create-account"><span>Dodaj slike</span></button>
                                                </div>
                                            </form>
                                        </div>
                                    """)))}),format.raw/*94.38*/("""

                                    """),format.raw/*96.37*/("""<div class="social">
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
                                    <li><a href="#product_tabs_tags" data-toggle="tab">Kontaktiraj prodavača</a></li>
                                    <li> <a href="#reviews_tabs" data-toggle="tab">Reviews</a> </li>
                                    <li> <a href="#product_tabs_custom" data-toggle="tab">Custom Tab</a> </li>
                                    <li> <a href="#product_tabs_custom1" data-toggle="tab">Custom Tab1</a> </li>
                                </ul>
                                <div id="productTabContent" class="tab-content">
                                    <div class="tab-pane fade in active" id="product_tabs_description">
                                        <div class="std">
                                            <p>Pogledajte lokacije naših objekata i posjetite nas u najbližem objektu</p>
                                            <div id="map" class="map2"></div>
                                            <input id="locations" name="lat" value=""""),_display_(/*122.86*/locations),format.raw/*122.95*/("""" style="display: none">
                                        </div>
                                    </div>

                                    <div class="tab-pane fade" id="product_tabs_tags">
                                        """),format.raw/*127.82*/("""
                                            """),format.raw/*128.45*/("""<section class="col-main col-sm-9">
                                                <div class="static-contain">
                                                    <form  method="POST" role="form" action=""""),_display_(/*130.95*/routes/*130.101*/.Messages.sendMessage(item.id)),format.raw/*130.131*/("""" >
                                                        <fieldset class="group-select">
                                                            <ul>
                                                                <li id="billing-new-address-form">
                                                                    <fieldset>
                                                                        <ul>
                                                                            <li>
                                                                                <div class="input-box">
                                                                                    <label for="email">Email<span class="required">*</span></label>
                                                                                    <br>
                                                                                    <input type="text" id="email" name="email" title="Email" class="input-text" required>
                                                                                </div>
                                                                            </li>
                                                                            <li>
                                                                                <div class="input-box">
                                                                                    <label for="subject">Naslov<span class="required">*</span></label>
                                                                                    <br>
                                                                                    <input type="text" id="subject" name="subject" title="Naslov" class="input-text" required>
                                                                                </div>
                                                                            </li>
                                                                            <li class="">
                                                                                <label for="message">Poruka <em class="required">*</em></label>
                                                                                <br>
                                                                                <div class="">
                                                                                    <textarea name="message" id="message" title="Poruka" class="input-text" cols="2" rows="3" required></textarea>
                                                                                </div>
                                                                            </li>
                                                                        </ul>
                                                                    </fieldset>
                                                                </li>
                                                                <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                                                <li><div class="buttons-set">
                                                                    <button type="submit" title="Pošalji" class="button submit"> <span> POŠALJI </span> </button>
                                                                </div></li>
                                                            </ul>
                                                        </fieldset>
                                                    </form>
                                                </div>
                                            </section>
                                        """),format.raw/*169.51*/("""
                                    """),format.raw/*170.37*/("""</div>
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
                    <h2>SLIČNI PROIZVODI</h2>
                </div>
                <div id="related-products-slider" class="product-flexslider hidden-buttons">
                    <div class="slider-items slider-width-col4 products-grid">
                        """),_display_(/*409.26*/for(item <- itemsToRecommend) yield /*409.55*/ {_display_(Seq[Any](format.raw/*409.57*/("""
                            """),format.raw/*410.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*413.38*/if(item.images.size() > 0)/*413.64*/{_display_(Seq[Any](format.raw/*413.65*/("""
                                        """),format.raw/*414.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*414.102*/item/*414.106*/.name),format.raw/*414.111*/("""" href=""""),_display_(/*414.120*/routes/*414.126*/.Items.itemRender(item.id)),format.raw/*414.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*414.190*/models/*414.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*414.245*/("""'> </a>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*416.38*/else/*416.42*/{_display_(Seq[Any](format.raw/*416.43*/("""
                                        """),format.raw/*417.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*417.102*/item/*417.106*/.name),format.raw/*417.111*/("""" href='"""),_display_(/*417.120*/routes/*417.126*/.Items.itemRender(item.id)),format.raw/*417.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*417.190*/routes/*417.196*/.Assets.versioned("images/product.png")),format.raw/*417.235*/("""'> </a>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*419.38*/("""
                                    """),format.raw/*420.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href='"""),_display_(/*423.106*/routes/*423.112*/.Items.itemRender(item.id)),format.raw/*423.138*/("""'> """),_display_(/*423.142*/item/*423.146*/.name),format.raw/*423.151*/(""" """),format.raw/*423.152*/("""</a> </div>
                                            <div class="item-content">

                                                <div class="item-price">
                                                    <div class="price-box"> <span class="regular-price"> <span class="price"> """),_display_(/*427.128*/item/*427.132*/.price),format.raw/*427.138*/(""" """),format.raw/*427.139*/("""KM</span> </span> </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*435.26*/("""
                    """),format.raw/*436.21*/("""</div>
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
                """),_display_(/*451.18*/for(item <- models.Item.getLastTenProducts()) yield /*451.63*/{_display_(Seq[Any](format.raw/*451.64*/("""
                    """),format.raw/*452.21*/("""<div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                            """),_display_(/*455.30*/if(item.images.size() > 0)/*455.56*/{_display_(Seq[Any](format.raw/*455.57*/("""
                                """),format.raw/*456.33*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*456.94*/item/*456.98*/.name),format.raw/*456.103*/("""" href=""""),_display_(/*456.112*/routes/*456.118*/.Items.itemRender(item.id)),format.raw/*456.144*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*456.182*/models/*456.188*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*456.237*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            """)))}/*459.30*/else/*459.34*/{_display_(Seq[Any](format.raw/*459.35*/("""
                                """),format.raw/*460.33*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*460.94*/item/*460.98*/.name),format.raw/*460.103*/("""" href='"""),_display_(/*460.112*/routes/*460.118*/.Items.itemRender(item.id)),format.raw/*460.144*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*460.182*/routes/*460.188*/.Assets.versioned("images/product.png")),format.raw/*460.227*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            """)))}),format.raw/*463.30*/("""
                            """),format.raw/*464.29*/("""</div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*467.98*/routes/*467.104*/.Items.itemRender(item.id)),format.raw/*467.130*/(""""> """),_display_(/*467.134*/item/*467.138*/.name),format.raw/*467.143*/(""" """),format.raw/*467.144*/("""</a> </div>
                                    <div class="item-content">
                                        """),format.raw/*469.65*/("""
                                        """),format.raw/*470.66*/("""
                                        """),format.raw/*471.69*/("""
                                        """),format.raw/*472.71*/("""
                                        """),format.raw/*473.51*/("""
                                        """),format.raw/*474.162*/("""
                                        """),format.raw/*475.51*/("""
                                        """),format.raw/*476.51*/("""
                                    """),format.raw/*477.37*/("""<div class="item-price">
                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*478.115*/item/*478.119*/.price),format.raw/*478.125*/(""" """),format.raw/*478.126*/("""KM </span> </span> </div>
                                    </div>
                                        """),format.raw/*480.140*/("""
                                        """),format.raw/*481.67*/("""
                                        """),format.raw/*482.124*/("""
                                        """),format.raw/*483.51*/("""
                                        """),format.raw/*484.123*/("""
                                    """),format.raw/*485.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*490.18*/("""

                """),format.raw/*492.17*/("""</div>
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
                    <div class="content">Trebate pomoć """),_display_(/*509.57*/item/*509.61*/.user.phone),format.raw/*509.72*/("""</div>
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
    <script src='"""),_display_(/*529.19*/routes/*529.25*/.Assets.versioned("javascripts/map.js")),format.raw/*529.64*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*530.42*/routes/*530.48*/.Assets.versioned("javascripts/googleAnalytics.js")),format.raw/*530.99*/("""'></script>

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
                  DATE: Tue Apr 19 10:36:08 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/item.scala.html
                  HASH: c97ef945504ce37b181b8b6c2d43e909607c4d44
                  MATRIX: 798->1|1003->110|1030->112|1041->116|1079->118|1110->123|1187->174|1227->206|1266->208|1310->225|1529->418|1542->423|1577->438|1653->483|1694->497|1733->527|1773->529|1818->546|2066->767|2080->772|2114->785|2159->802|2210->822|2246->831|3129->1687|3164->1713|3204->1715|3273->1756|3380->1836|3393->1840|3447->1873|3614->2013|3627->2017|3680->2049|4018->2360|4059->2385|4099->2387|4176->2436|4217->2450|4231->2455|4272->2475|4366->2541|4381->2546|4421->2564|4464->2579|4479->2584|4517->2600|4627->2679|4700->2724|4809->2814|4822->2818|4861->2819|4930->2860|5038->2941|5053->2947|5114->2986|5243->3084|5308->3121|5621->3407|5634->3411|5660->3416|5996->3724|6010->3728|6038->3734|6068->3735|6152->3792|6210->3841|6249->3842|6322->3887|6428->3965|6442->3969|6473->3978|6503->3979|6586->4031|6655->4072|6910->4300|6923->4304|6956->4316|6985->4317|7257->4562|7270->4566|7301->4576|7388->4636|7401->4640|7435->4653|7465->4656|7478->4660|7509->4670|7596->4730|7609->4734|7641->4745|7728->4805|7741->4809|7773->4820|7866->4886|7879->4890|7914->4904|8027->4990|8093->5047|8132->5048|8201->5089|8422->5283|8437->5289|8494->5324|8918->5717|8984->5755|10992->7735|11023->7744|11295->8028|11369->8073|11604->8280|11621->8286|11674->8316|15472->12095|15538->12132|35507->32073|35553->32102|35594->32104|35652->32133|35852->32305|35888->32331|35928->32332|35998->32373|36088->32434|36103->32438|36131->32443|36169->32452|36186->32458|36235->32484|36302->32522|36319->32528|36391->32577|36561->32727|36575->32731|36615->32732|36685->32773|36775->32834|36790->32838|36818->32843|36856->32852|36873->32858|36922->32884|36989->32922|37006->32928|37068->32967|37250->33117|37316->33154|37582->33391|37599->33397|37648->33423|37681->33427|37696->33431|37724->33436|37755->33437|38068->33721|38083->33725|38112->33731|38143->33732|38496->34053|38546->34074|39117->34617|39179->34662|39219->34663|39269->34684|39445->34832|39481->34858|39521->34859|39583->34892|39672->34953|39686->34957|39714->34962|39752->34971|39769->34977|39818->35003|39885->35041|39902->35047|39974->35096|40210->35312|40224->35316|40264->35317|40326->35350|40415->35411|40429->35415|40457->35420|40495->35429|40512->35435|40561->35461|40628->35499|40645->35505|40707->35544|40955->35760|41013->35789|41254->36002|41271->36008|41320->36034|41353->36038|41368->36042|41396->36047|41427->36048|41571->36187|41641->36253|41711->36322|41781->36393|41851->36444|41922->36606|41992->36657|42062->36708|42128->36745|42296->36884|42311->36888|42340->36894|42371->36895|42510->37103|42580->37170|42651->37294|42721->37345|42792->37468|42858->37505|43046->37661|43093->37679|43692->38250|43706->38254|43739->38265|44510->39008|44526->39014|44587->39053|44668->39106|44684->39112|44757->39163
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|49->18|50->19|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|77->46|78->47|80->49|80->49|80->49|81->50|82->51|82->51|82->51|84->53|85->54|90->59|90->59|90->59|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|98->67|99->68|104->73|104->73|104->73|104->73|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|116->85|116->85|116->85|117->86|119->88|119->88|119->88|125->94|127->96|153->122|153->122|158->127|159->128|161->130|161->130|161->130|200->169|201->170|440->409|440->409|440->409|441->410|444->413|444->413|444->413|445->414|445->414|445->414|445->414|445->414|445->414|445->414|445->414|445->414|445->414|447->416|447->416|447->416|448->417|448->417|448->417|448->417|448->417|448->417|448->417|448->417|448->417|448->417|450->419|451->420|454->423|454->423|454->423|454->423|454->423|454->423|454->423|458->427|458->427|458->427|458->427|466->435|467->436|482->451|482->451|482->451|483->452|486->455|486->455|486->455|487->456|487->456|487->456|487->456|487->456|487->456|487->456|487->456|487->456|487->456|490->459|490->459|490->459|491->460|491->460|491->460|491->460|491->460|491->460|491->460|491->460|491->460|491->460|494->463|495->464|498->467|498->467|498->467|498->467|498->467|498->467|498->467|500->469|501->470|502->471|503->472|504->473|505->474|506->475|507->476|508->477|509->478|509->478|509->478|509->478|511->480|512->481|513->482|514->483|515->484|516->485|521->490|523->492|540->509|540->509|540->509|560->529|560->529|560->529|561->530|561->530|561->530
                  -- GENERATED --
              */
          