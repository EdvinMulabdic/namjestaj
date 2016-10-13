
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
                        <div class="product-essential">

                                <input name="form_key" value="6UbXroakyQlbfQzK" type="hidden">
                                <div class="product-img-box col-sm-5 col-xs-12">
                                    <div class="new-label new-top-left"> New </div>
                                    <div class="product-image">
                                    """),_display_(/*34.38*/if(item.images.size() > 0)/*34.64*/ {_display_(Seq[Any](format.raw/*34.66*/("""
                                        """),format.raw/*35.41*/("""<div class="large-image">
                                            <a href='"""),_display_(/*36.55*/item/*36.59*/.images.get(0).getSize(768, 1024)),format.raw/*36.92*/("""' class="cloud-zoom" id="zoom1" rel="useWrapper: false, adjustY:0, adjustX:20" >
                                                <img src='"""),_display_(/*37.60*/item/*37.64*/.images.get(0).getSize(465, 563)),format.raw/*37.96*/("""' alt="">
                                            </a>
                                        </div>
                                        <div class="flexslider flexslider-thumb">
                                            <ul class="previews-list slides">
                                            """),_display_(/*42.46*/for(image <- item.images) yield /*42.71*/ {_display_(Seq[Any](format.raw/*42.73*/("""
                                                """),format.raw/*43.49*/("""<li><a href='"""),_display_(/*43.63*/image/*43.68*/.getSize(2000, 3000)),format.raw/*43.88*/("""' class='cloud-zoom-gallery' rel="useZoom: 'zoom1', smallImage: '"""),_display_(/*43.154*/image/*43.159*/.getSize(465, 563)),format.raw/*43.177*/("""' "><img src='"""),_display_(/*43.192*/image/*43.197*/.getSize(75, 90)),format.raw/*43.213*/("""' alt = "Thumbnail 1"/></a></li>

                                            """)))}),format.raw/*45.46*/("""
                                            """),format.raw/*46.45*/("""</ul>
                                        </div>
                                    """)))}/*48.38*/else/*48.42*/{_display_(Seq[Any](format.raw/*48.43*/("""
                                        """),format.raw/*49.41*/("""<div class="large-image">
                                            <img src='"""),_display_(/*50.56*/routes/*50.62*/.Assets.versioned("images/product.png")),format.raw/*50.101*/("""' alt="">
                                        </div>
                                        """)))}),format.raw/*52.42*/("""
                                    """),format.raw/*53.37*/("""</div>
                                        <!-- end: more-images -->
                                </div>
                            <div class="product-shop col-sm-7 col-xs-12">
                                <div class="product-name">
                                    <h1>"""),_display_(/*58.42*/item/*58.46*/.name),format.raw/*58.51*/("""</h1>
                                </div>

                                <div class="price-block">
                                    <div class="price-box">
                                        <p class="special-price"> <span class="price-label"></span> <span id="product-price-48" class="price"> """),_display_(/*63.145*/item/*63.149*/.price),format.raw/*63.155*/(""" """),format.raw/*63.156*/("""KM </span> </p>
                                        """),_display_(/*64.42*/if(item.oldPrice != null && item.oldPrice != "0" )/*64.92*/{_display_(Seq[Any](format.raw/*64.93*/("""
                                            """),format.raw/*65.45*/("""<p class="old-price"> <span class="price-label"></span> <span class="price"> """),_display_(/*65.123*/item/*65.127*/.oldPrice),format.raw/*65.136*/(""" """),format.raw/*65.137*/("""KM </span>
                                                """)))}),format.raw/*66.50*/("""
                                    """),format.raw/*67.37*/("""</div>
                                </div>

                                <div class="rating">
                                    <div class="ratings">
                                        """),_display_(/*72.42*/if(item.average_Grade == 1)/*72.69*/ {_display_(Seq[Any](format.raw/*72.71*/("""
                                            """),format.raw/*73.45*/("""<div class="rating-box">
                                                <div class="rating1"></div>
                                            </div>
                                        """)))}),format.raw/*76.42*/("""
                                        """),_display_(/*77.42*/if(item.average_Grade == 2)/*77.69*/ {_display_(Seq[Any](format.raw/*77.71*/("""
                                            """),format.raw/*78.45*/("""<div class="rating-box">
                                                <div class="rating2"></div>
                                            </div>
                                        """)))}),format.raw/*81.42*/("""
                                        """),_display_(/*82.42*/if(item.average_Grade == 3)/*82.69*/ {_display_(Seq[Any](format.raw/*82.71*/("""
                                            """),format.raw/*83.45*/("""<div class="rating-box">
                                                <div class="rating3"></div>
                                            </div>
                                        """)))}),format.raw/*86.42*/("""
                                        """),_display_(/*87.42*/if(item.average_Grade == 4)/*87.69*/ {_display_(Seq[Any](format.raw/*87.71*/("""
                                            """),format.raw/*88.45*/("""<div class="rating-box">
                                                <div class="rating4"></div>
                                            </div>
                                        """)))}),format.raw/*91.42*/("""
                                        """),_display_(/*92.42*/if(item.average_Grade == 5)/*92.69*/ {_display_(Seq[Any](format.raw/*92.71*/("""
                                            """),format.raw/*93.45*/("""<div class="rating-box">
                                                <div class="rating5"></div>
                                            </div>
                                        """)))}),format.raw/*96.42*/("""
                                        """),_display_(/*97.42*/if(item.average_Grade == 0)/*97.69*/ {_display_(Seq[Any](format.raw/*97.71*/("""
                                            """),format.raw/*98.45*/("""<div class="rating-box">
                                                <div class="rating0"></div>
                                            </div>
                                        """)))}),format.raw/*101.42*/("""

                                        """),format.raw/*103.41*/("""<p class="rating-links">Ukupno """),_display_(/*103.73*/Review/*103.79*/.getNumberOfReviews(item.id)),format.raw/*103.107*/(""" """),format.raw/*103.108*/("""ocjena</p>

                                    </div>
                                </div>

                                    <div class="short-description">
                                        <h2>Opis proizvoda</h2>
                                        <p> """),_display_(/*110.46*/item/*110.50*/.description),format.raw/*110.62*/(""" """),format.raw/*110.63*/("""</p>
                                    </div>

                                    <div class="short-description">
                                        <h2>Informacije o prodavaču</h2>
                                        <p> Prodavač: """),_display_(/*115.56*/item/*115.60*/.user.name),format.raw/*115.70*/("""</p>
                                        <p> Adresa:   """),_display_(/*116.56*/item/*116.60*/.user.address),format.raw/*116.73*/(""", """),_display_(/*116.76*/item/*116.80*/.user.city),format.raw/*116.90*/("""</p>
                                        <p> Email:   <a href="#billing-new-address-form">"""),_display_(/*117.91*/item/*117.95*/.user.email),format.raw/*117.106*/("""</a></p>
                                        <p> Telefon:  """),_display_(/*118.56*/item/*118.60*/.user.phone),format.raw/*118.71*/("""</p>
                                        <p> Radno vrijeme:  """),_display_(/*119.62*/item/*119.66*/.user.workTime),format.raw/*119.80*/("""</p>
                                    </div>

                                    """),_display_(/*122.38*/if(currentUser != null && item.user.id == currentUser.id)/*122.95*/{_display_(Seq[Any](format.raw/*122.96*/("""
                                        """),format.raw/*123.41*/("""<div class="short-description">
                                            <h2>Dodaj slike za proizvod</h2>
                                            <form  method="GET" role="form" action=""""),_display_(/*125.86*/routes/*125.92*/.Images.imagesUploadRender(item.id)),format.raw/*125.127*/("""" >
                                                <div class="buttons-set">
                                                    <button class="button create-account"><span>Dodaj slike</span></button>
                                                </div>
                                            </form>
                                        </div>
                                    """)))}),format.raw/*131.38*/("""

                                    """),format.raw/*133.37*/("""<div class="social">
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
                                    <li><a href="#product_tabs_tags" data-toggle="tab" id="product_tabs_tags1">Kontaktiraj prodavača</a></li>
                                    <li> <a href="#reviews_tabs" data-toggle="tab">Ocijenite proizvod</a> </li>
                                </ul>
                                <div id="productTabContent" class="tab-content">
                                    <div class="tab-pane fade in active" id="product_tabs_description">
                                        <div class="std">
                                            <p>Pogledajte lokacije naših objekata i posjetite nas u najbližem objektu</p>
                                            <div id="map" class="map2"></div>
                                            <input id="locations" name="lat" value=""""),_display_(/*157.86*/locations),format.raw/*157.95*/("""" style="display: none">
                                        </div>
                                    </div>

                                    <div class="tab-pane fade" id="product_tabs_tags">
                                        """),format.raw/*162.82*/("""
                                            """),format.raw/*163.45*/("""<section class="col-main col-sm-9" id="send_message">
                                                <div class="static-contain">
                                                    <form  method="POST" role="form" action=""""),_display_(/*165.95*/routes/*165.101*/.Messages.sendMessage(item.id)),format.raw/*165.131*/("""" >
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
                                                                                    <textarea name="message" id="message" title="Poruka" class="input-text" style="width: 50%; resize: vertical" required></textarea>
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
                                        """),format.raw/*204.51*/("""
                                    """),format.raw/*205.37*/("""</div>
                                    <div class="tab-pane fade" id="reviews_tabs">
                                        <div class="box-collateral box-reviews" id="customer-reviews">
                                            <div class="box-reviews1">
                                                <div class="form-add">
                                                    <form role="form" method="post" action=""""),_display_(/*210.94*/routes/*210.100*/.Reviews.saveReview(item.id)),format.raw/*210.128*/("""">
                                                        <h3>Molimo Vas da ocijenite proizvod</h3>
                                                        <fieldset>
                                                            <h4>Ocijenite proizvod na skali od 1 do 5. Molimo unesite svoje podatke, kako bi ocjena bila validna. Hvala! <em class="required">*</em></h4>
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
                                                                        <th>"""),_display_(/*230.78*/item/*230.82*/.name),format.raw/*230.87*/("""</th>
                                                                        <td class="value"><input type="radio" class="radio" value="1" id="Price_1" name="ratings" onclick="gg()" ></td>
                                                                        <td class="value"><input type="radio" class="radio" value="2" id="Price_2" name="ratings" onclick="gg()"></td>
                                                                        <td class="value"><input type="radio" class="radio" value="3" id="Price_3" name="ratings" onclick="gg()"></td>
                                                                        <td class="value"><input type="radio" class="radio" value="4" id="Price_4" name="ratings" onclick="gg()"></td>
                                                                        <td class="value last"><input type="radio" class="radio" value="5" id="Price_5" name="ratings" onclick="gg()" checked></td>
                                                                    </tr>

                                                                </tbody>
                                                            </table>
                                                            <input type="text" id="ocjena" name="mark" value="5" hidden>
                                                            <div class="review1">
                                                                    <div class="input-box name-firstname">
                                                                        <label for="name">Ime i prezime: <span class="required">*</span></label>
                                                                        <br>
                                                                        <input type="text" id="name" name="name" title="Ime i prezime" class="input-text" required>
                                                                    </div>
                                                                    <div class="input-box name-lastname">
                                                                        <label for="email"> Email:  <span class="required">*</span> </label>
                                                                        <br>
                                                                        <input type="text" id="email" name="email" title="Email" class="input-text" required>
                                                                    </div>
                                                                    <div class="input-box name-lastname">
                                                                        <label for="phone"> Broj telefona:  <span class="required">*</span> </label>
                                                                        <br>
                                                                        <input type="text" id="phone" name="phone" title="Telefon" class="input-text" required>
                                                                    </div>

                                                                    <div class="buttons-set">
                                                                        <button class="button submit" title="Ocijeni" type="submit"><span>Ocijeni </span></button>
                                                                    </div>
                                                            </div>

                                                        </fieldset>
                                                    </form>
                                                </div>
                                            </div>

                                            <div class="clear"></div>
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
                        """),_display_(/*290.26*/for(item <- itemsToRecommend) yield /*290.55*/ {_display_(Seq[Any](format.raw/*290.57*/("""
                            """),format.raw/*291.29*/("""<div class="item">
                                <div class="item-inner">
                                    <div class="item-img">
                                    """),_display_(/*294.38*/if(item.images.size() > 0)/*294.64*/{_display_(Seq[Any](format.raw/*294.65*/("""
                                        """),format.raw/*295.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*295.102*/item/*295.106*/.name),format.raw/*295.111*/("""" href=""""),_display_(/*295.120*/routes/*295.126*/.Items.itemRender(item.id)),format.raw/*295.152*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*295.190*/models/*295.196*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*295.245*/("""'> </a>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}/*297.38*/else/*297.42*/{_display_(Seq[Any](format.raw/*297.43*/("""
                                        """),format.raw/*298.41*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*298.102*/item/*298.106*/.name),format.raw/*298.111*/("""" href='"""),_display_(/*298.120*/routes/*298.126*/.Items.itemRender(item.id)),format.raw/*298.152*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*298.190*/routes/*298.196*/.Assets.versioned("images/product.png")),format.raw/*298.235*/("""'> </a>
                                            <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                    """)))}),format.raw/*300.38*/("""
                                    """),format.raw/*301.37*/("""</div>
                                    <div class="item-info">
                                        <div class="info-inner">
                                            <div class="item-title"> <a title="Retis lapen casen" href='"""),_display_(/*304.106*/routes/*304.112*/.Items.itemRender(item.id)),format.raw/*304.138*/("""'> """),_display_(/*304.142*/item/*304.146*/.name),format.raw/*304.151*/(""" """),format.raw/*304.152*/("""</a> </div>
                                            <div class="item-content">

                                                <div class="item-price">
                                                    <div class="price-box"> <span class="regular-price"> <span class="price"> """),_display_(/*308.128*/item/*308.132*/.price),format.raw/*308.138*/(""" """),format.raw/*308.139*/("""KM</span> </span> </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        """)))}),format.raw/*316.26*/("""
                    """),format.raw/*317.21*/("""</div>
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
                """),_display_(/*332.18*/for(item <- models.Item.getLastTenProducts()) yield /*332.63*/{_display_(Seq[Any](format.raw/*332.64*/("""
                    """),format.raw/*333.21*/("""<div class="item">
                        <div class="item-inner">
                            <div class="item-img">
                            """),_display_(/*336.30*/if(item.images.size() > 0)/*336.56*/{_display_(Seq[Any](format.raw/*336.57*/("""
                                """),format.raw/*337.33*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*337.94*/item/*337.98*/.name),format.raw/*337.103*/("""" href=""""),_display_(/*337.112*/routes/*337.118*/.Items.itemRender(item.id)),format.raw/*337.144*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*337.182*/models/*337.188*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*337.237*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            """)))}/*340.30*/else/*340.34*/{_display_(Seq[Any](format.raw/*340.35*/("""
                                """),format.raw/*341.33*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*341.94*/item/*341.98*/.name),format.raw/*341.103*/("""" href='"""),_display_(/*341.112*/routes/*341.118*/.Items.itemRender(item.id)),format.raw/*341.144*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*341.182*/routes/*341.188*/.Assets.versioned("images/product.png")),format.raw/*341.227*/("""'> </a>
                                    <div class="new-label new-top-left">new</div>
                                    <a class="quickview-btn" ><span>Quick View</span></a> </div>
                            """)))}),format.raw/*344.30*/("""
                            """),format.raw/*345.29*/("""</div>
                            <div class="item-info">
                                <div class="info-inner">
                                    <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*348.98*/routes/*348.104*/.Items.itemRender(item.id)),format.raw/*348.130*/(""""> """),_display_(/*348.134*/item/*348.138*/.name),format.raw/*348.143*/(""" """),format.raw/*348.144*/("""</a> </div>
                                    <div class="item-content">
                                        """),format.raw/*350.65*/("""
                                        """),format.raw/*351.66*/("""
                                        """),format.raw/*352.69*/("""
                                        """),format.raw/*353.71*/("""
                                        """),format.raw/*354.51*/("""
                                        """),format.raw/*355.162*/("""
                                        """),format.raw/*356.51*/("""
                                        """),format.raw/*357.51*/("""
                                    """),format.raw/*358.37*/("""<div class="item-price">
                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*359.115*/item/*359.119*/.price),format.raw/*359.125*/(""" """),format.raw/*359.126*/("""KM </span> </span> </div>
                                    </div>
                                        """),format.raw/*361.140*/("""
                                        """),format.raw/*362.67*/("""
                                        """),format.raw/*363.124*/("""
                                        """),format.raw/*364.51*/("""
                                        """),format.raw/*365.123*/("""
                                    """),format.raw/*366.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*371.18*/("""

                """),format.raw/*373.17*/("""</div>
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
                    <div class="content">Trebate pomoć """),_display_(/*390.57*/item/*390.61*/.user.phone),format.raw/*390.72*/("""</div>
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
    <script src='"""),_display_(/*410.19*/routes/*410.25*/.Assets.versioned("javascripts/map.js")),format.raw/*410.64*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*411.42*/routes/*411.48*/.Assets.versioned("javascripts/googleAnalytics.js")),format.raw/*411.99*/("""'></script>
    <script src='"""),_display_(/*412.19*/routes/*412.25*/.Assets.versioned("javascripts/reviews.js")),format.raw/*412.68*/("""'></script>



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
                  DATE: Thu Oct 13 22:16:37 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/item.scala.html
                  HASH: 06fc3a7f64cdefc101797875b808ff4716e6f290
                  MATRIX: 798->1|1003->110|1030->112|1041->116|1079->118|1110->123|1187->174|1227->206|1266->208|1310->225|1529->418|1542->423|1577->438|1653->483|1694->497|1733->527|1773->529|1818->546|2066->767|2080->772|2114->785|2159->802|2210->822|2246->831|2964->1522|2999->1548|3039->1550|3108->1591|3215->1671|3228->1675|3282->1708|3449->1848|3462->1852|3515->1884|3853->2195|3894->2220|3934->2222|4011->2271|4052->2285|4066->2290|4107->2310|4201->2376|4216->2381|4256->2399|4299->2414|4314->2419|4352->2435|4462->2514|4535->2559|4644->2649|4657->2653|4696->2654|4765->2695|4873->2776|4888->2782|4949->2821|5078->2919|5143->2956|5456->3242|5469->3246|5495->3251|5831->3559|5845->3563|5873->3569|5903->3570|5987->3627|6046->3677|6085->3678|6158->3723|6264->3801|6278->3805|6309->3814|6339->3815|6430->3875|6495->3912|6721->4111|6757->4138|6797->4140|6870->4185|7094->4378|7163->4420|7199->4447|7239->4449|7312->4494|7536->4687|7605->4729|7641->4756|7681->4758|7754->4803|7978->4996|8047->5038|8083->5065|8123->5067|8196->5112|8420->5305|8489->5347|8525->5374|8565->5376|8638->5421|8862->5614|8931->5656|8967->5683|9007->5685|9080->5730|9305->5923|9376->5965|9436->5997|9452->6003|9503->6031|9534->6032|9834->6304|9848->6308|9882->6320|9912->6321|10185->6566|10199->6570|10231->6580|10319->6640|10333->6644|10368->6657|10399->6660|10413->6664|10445->6674|10568->6769|10582->6773|10616->6784|10708->6848|10722->6852|10755->6863|10849->6929|10863->6933|10899->6947|11013->7033|11080->7090|11120->7091|11190->7132|11412->7326|11428->7332|11486->7367|11911->7760|11978->7798|13797->9589|13828->9598|14100->9882|14174->9927|14427->10152|14444->10158|14497->10188|18314->13986|18380->14023|18835->14450|18852->14456|18903->14484|20707->16260|20721->16264|20748->16269|25336->20829|25382->20858|25423->20860|25481->20889|25681->21061|25717->21087|25757->21088|25827->21129|25917->21190|25932->21194|25960->21199|25998->21208|26015->21214|26064->21240|26131->21278|26148->21284|26220->21333|26390->21483|26404->21487|26444->21488|26514->21529|26604->21590|26619->21594|26647->21599|26685->21608|26702->21614|26751->21640|26818->21678|26835->21684|26897->21723|27079->21873|27145->21910|27411->22147|27428->22153|27477->22179|27510->22183|27525->22187|27553->22192|27584->22193|27897->22477|27912->22481|27941->22487|27972->22488|28325->22809|28375->22830|28946->23373|29008->23418|29048->23419|29098->23440|29274->23588|29310->23614|29350->23615|29412->23648|29501->23709|29515->23713|29543->23718|29581->23727|29598->23733|29647->23759|29714->23797|29731->23803|29803->23852|30039->24068|30053->24072|30093->24073|30155->24106|30244->24167|30258->24171|30286->24176|30324->24185|30341->24191|30390->24217|30457->24255|30474->24261|30536->24300|30784->24516|30842->24545|31083->24758|31100->24764|31149->24790|31182->24794|31197->24798|31225->24803|31256->24804|31400->24943|31470->25009|31540->25078|31610->25149|31680->25200|31751->25362|31821->25413|31891->25464|31957->25501|32125->25640|32140->25644|32169->25650|32200->25651|32339->25859|32409->25926|32480->26050|32550->26101|32621->26224|32687->26261|32875->26417|32922->26435|33521->27006|33535->27010|33568->27021|34339->27764|34355->27770|34416->27809|34497->27862|34513->27868|34586->27919|34644->27949|34660->27955|34725->27998
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|49->18|50->19|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|76->45|77->46|79->48|79->48|79->48|80->49|81->50|81->50|81->50|83->52|84->53|89->58|89->58|89->58|94->63|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|97->66|98->67|103->72|103->72|103->72|104->73|107->76|108->77|108->77|108->77|109->78|112->81|113->82|113->82|113->82|114->83|117->86|118->87|118->87|118->87|119->88|122->91|123->92|123->92|123->92|124->93|127->96|128->97|128->97|128->97|129->98|132->101|134->103|134->103|134->103|134->103|134->103|141->110|141->110|141->110|141->110|146->115|146->115|146->115|147->116|147->116|147->116|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|150->119|150->119|150->119|153->122|153->122|153->122|154->123|156->125|156->125|156->125|162->131|164->133|188->157|188->157|193->162|194->163|196->165|196->165|196->165|235->204|236->205|241->210|241->210|241->210|261->230|261->230|261->230|321->290|321->290|321->290|322->291|325->294|325->294|325->294|326->295|326->295|326->295|326->295|326->295|326->295|326->295|326->295|326->295|326->295|328->297|328->297|328->297|329->298|329->298|329->298|329->298|329->298|329->298|329->298|329->298|329->298|329->298|331->300|332->301|335->304|335->304|335->304|335->304|335->304|335->304|335->304|339->308|339->308|339->308|339->308|347->316|348->317|363->332|363->332|363->332|364->333|367->336|367->336|367->336|368->337|368->337|368->337|368->337|368->337|368->337|368->337|368->337|368->337|368->337|371->340|371->340|371->340|372->341|372->341|372->341|372->341|372->341|372->341|372->341|372->341|372->341|372->341|375->344|376->345|379->348|379->348|379->348|379->348|379->348|379->348|379->348|381->350|382->351|383->352|384->353|385->354|386->355|387->356|388->357|389->358|390->359|390->359|390->359|390->359|392->361|393->362|394->363|395->364|396->365|397->366|402->371|404->373|421->390|421->390|421->390|441->410|441->410|441->410|442->411|442->411|442->411|443->412|443->412|443->412
                  -- GENERATED --
              */
          