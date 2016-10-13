
package views.html.partner

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userProfilePage_Scope0 {
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

class userProfilePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[AppUser,java.util.List[String],java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: AppUser)(locations: java.util.List[String])(items: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""
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
                                <div class="product-image">
                                    <div class="large-image">
                                        <a href='' rel="useWrapper: false, adjustY:0, adjustX:20" >
                                            <img src='"""),_display_(/*35.56*/user/*35.60*/.images.get(0).getSize(200, 100)),format.raw/*35.92*/("""' alt="LOGO">
                                        </a>
                                    </div>
                                </div>
                                    <!-- end: more-images -->
                            </div>
                            <div class="product-shop col-sm-7 col-xs-12">
                                <div class="product-name">
                                    <h1>"""),_display_(/*43.42*/user/*43.46*/.name),format.raw/*43.51*/("""</h1>
                                </div>

                                <div class="short-description">
                                    <h2>Informacije o prodavaču</h2>
                                    <p> Adresa:   """),_display_(/*48.52*/user/*48.56*/.address),format.raw/*48.64*/(""", """),_display_(/*48.67*/user/*48.71*/.city),format.raw/*48.76*/("""</p>
                                    <p> Email:   <a href="#billing-new-address-form">"""),_display_(/*49.87*/user/*49.91*/.email),format.raw/*49.97*/("""</a></p>
                                    <p> Telefon:  """),_display_(/*50.52*/user/*50.56*/.phone),format.raw/*50.62*/("""</p>
                                    <p> Radno vrijeme:  """),_display_(/*51.58*/user/*51.62*/.workTime),format.raw/*51.71*/("""</p>
                                </div>


                                <div class="social">
                                    <ul class="link">
                                        <li class="fb"><a href="#"></a></li>
                                        <li class="tw"><a href="#"></a></li>
                                        <li class="googleplus"><a href="#"></a></li>
                                        <li class="linkedin"><a href="#"></a></li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <div class="col-lg-12 col-sm-12 col-xs-12 bounceInUp animated">
                            <div class="short-description">
                                <h2>Ukratko o prodavaču </h2>
                                <p> """),_display_(/*69.38*/user/*69.42*/.description),format.raw/*69.54*/(""" """),format.raw/*69.55*/("""</p>
                            </div>
                        </div>
                        <div class="product-collateral col-lg-12 col-sm-12 col-xs-12 bounceInUp animated">

                            <div class="add_info">
                                <ul id="product-detail-tab" class="nav nav-tabs product-tabs">
                                    <li class="active"> <a href="#product_tabs_description" data-toggle="tab"> Lokacije objekata </a> </li>
                                    <li><a href="#product_tabs_tags" data-toggle="tab" id="product_tabs_tags1">Kontaktiraj prodavača</a></li>
                                    <li> <a href="#reviews_tabs" data-toggle="tab">Svi proizvodi </a> </li>
                                </ul>

                                <div id="productTabContent" class="tab-content">

                                    <div class="tab-pane fade in active" id="product_tabs_description">
                                        <div class="std">
                                            <p>Pogledajte lokacije naših objekata i posjetite nas u najbližem objektu</p>
                                            <div id="map" class="map2"></div>
                                            <input id="locations" name="lat" value=""""),_display_(/*87.86*/locations),format.raw/*87.95*/("""" style="display: none">
                                        </div>
                                    </div>

                                    <div class="tab-pane fade" id="product_tabs_tags">
                                        <section class="col-main col-sm-9" id="send_message">
                                            <div class="static-contain">
                                                <form  method="POST" role="form" action=""""),_display_(/*94.91*/routes/*94.97*/.Messages.sendMessage2(user.id)),format.raw/*94.128*/("""" >
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
                                    </div>

                                    <div class="tab-pane fade" id="reviews_tabs">
                                        <section class="featured-pro  wow bounceInUp animated">
                                            <div class="slider-items-products">
                                                <div id="best-seller-slider" class="product-flexslider hidden-buttons">
                                                    <div class="slider-items slider-width-col4 products-grid">
                                                    """),_display_(/*140.54*/for(item <- items) yield /*140.72*/ {_display_(Seq[Any](format.raw/*140.74*/("""
                                                            """),format.raw/*141.61*/("""<!-- Item -->
                                                        <div class="col-md-12 item">
                                                            <div class="item-inner">
                                                                <div class="item-img">
                                                                """),_display_(/*145.66*/if(item.images.size() > 0)/*145.92*/{_display_(Seq[Any](format.raw/*145.93*/("""
                                                                    """),format.raw/*146.69*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*146.130*/item/*146.134*/.name),format.raw/*146.139*/("""" href=""""),_display_(/*146.148*/routes/*146.154*/.Items.itemRender(item.id)),format.raw/*146.180*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*146.218*/models/*146.224*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*146.273*/("""'> </a>
                                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                                """)))}/*148.66*/else/*148.70*/{_display_(Seq[Any](format.raw/*148.71*/("""
                                                                    """),format.raw/*149.69*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*149.130*/item/*149.134*/.name),format.raw/*149.139*/("""" href='"""),_display_(/*149.148*/routes/*149.154*/.Items.itemRender(item.id)),format.raw/*149.180*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*149.218*/routes/*149.224*/.Assets.versioned("images/product.png")),format.raw/*149.263*/("""'> </a>
                                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                                """)))}),format.raw/*151.66*/("""
                                                                """),format.raw/*152.65*/("""</div>
                                                                <div class="item-info">
                                                                    <div class="info-inner">
                                                                        <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*155.134*/routes/*155.140*/.Items.itemRender(item.id)),format.raw/*155.166*/(""""> """),_display_(/*155.170*/item/*155.174*/.name),format.raw/*155.179*/(""" """),format.raw/*155.180*/("""</a> </div>
                                                                        <div class="item-content">
                                                                            <div class="rating">
                                                                                <div class="ratings">
                                                                                    """),_display_(/*159.86*/if(item.average_Grade == 1)/*159.113*/ {_display_(Seq[Any](format.raw/*159.115*/("""
                                                                                        """),format.raw/*160.89*/("""<div class="rating-box">
                                                                                            <div class="rating1"></div>
                                                                                        </div>
                                                                                    """)))}),format.raw/*163.86*/("""
                                                                                    """),_display_(/*164.86*/if(item.average_Grade == 2)/*164.113*/ {_display_(Seq[Any](format.raw/*164.115*/("""
                                                                                        """),format.raw/*165.89*/("""<div class="rating-box">
                                                                                            <div class="rating2"></div>
                                                                                        </div>
                                                                                    """)))}),format.raw/*168.86*/("""
                                                                                    """),_display_(/*169.86*/if(item.average_Grade == 3)/*169.113*/ {_display_(Seq[Any](format.raw/*169.115*/("""
                                                                                        """),format.raw/*170.89*/("""<div class="rating-box">
                                                                                            <div class="rating3"></div>
                                                                                        </div>
                                                                                    """)))}),format.raw/*173.86*/("""
                                                                                    """),_display_(/*174.86*/if(item.average_Grade == 4)/*174.113*/ {_display_(Seq[Any](format.raw/*174.115*/("""
                                                                                        """),format.raw/*175.89*/("""<div class="rating-box">
                                                                                            <div class="rating4"></div>
                                                                                        </div>
                                                                                    """)))}),format.raw/*178.86*/("""
                                                                                    """),_display_(/*179.86*/if(item.average_Grade == 5)/*179.113*/ {_display_(Seq[Any](format.raw/*179.115*/("""
                                                                                        """),format.raw/*180.89*/("""<div class="rating-box">
                                                                                            <div class="rating5"></div>
                                                                                        </div>
                                                                                    """)))}),format.raw/*183.86*/("""
                                                                                    """),_display_(/*184.86*/if(item.average_Grade == 0)/*184.113*/ {_display_(Seq[Any](format.raw/*184.115*/("""
                                                                                        """),format.raw/*185.89*/("""<div class="rating-box">
                                                                                            <div class="rating0"></div>
                                                                                        </div>
                                                                                    """)))}),format.raw/*188.86*/("""

                                                                                """),format.raw/*190.81*/("""</div>
                                                                            </div>
                                                                            <div class="item-price">
                                                                                <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*193.155*/item/*193.159*/.price),format.raw/*193.165*/("""</span> </span> </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                            <!-- End Item -->
                                                    """)))}),format.raw/*201.54*/("""
                                                    """),format.raw/*202.53*/("""</div>
                                                </div>
                                            </div>
                                        </section>
                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div></div>
    </section>
    <!-- Main Container End -->

    <!-- end service -->
    <!--GOOGLE -->
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCfCf4BKPmFsOCDcyc1sq-5OWwn1O4F2Rg&callback=initialize"></script>
    <script src='"""),_display_(/*221.19*/routes/*221.25*/.Assets.versioned("javascripts/map.js")),format.raw/*221.64*/("""'></script>



""")))}))
      }
    }
  }

  def render(user:AppUser,locations:java.util.List[String],items:java.util.List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(user)(locations)(items)

  def f:((AppUser) => (java.util.List[String]) => (java.util.List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (locations) => (items) => apply(user)(locations)(items)

  def ref: this.type = this

}


}

/**/
object userProfilePage extends userProfilePage_Scope0.userProfilePage
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/partner/userProfilePage.scala.html
                  HASH: 114d29d3d51127c1606161ff2de5601aae69786c
                  MATRIX: 818->1|992->80|1019->82|1030->86|1068->88|1099->93|1176->144|1216->176|1255->178|1299->195|1518->388|1531->393|1566->408|1642->453|1683->467|1722->497|1762->499|1807->516|2055->737|2069->742|2103->755|2148->772|2199->792|2235->801|3037->1576|3050->1580|3103->1612|3542->2024|3555->2028|3581->2033|3838->2263|3851->2267|3880->2275|3910->2278|3923->2282|3949->2287|4067->2378|4080->2382|4107->2388|4194->2448|4207->2452|4234->2458|4323->2520|4336->2524|4366->2533|5263->3403|5276->3407|5309->3419|5338->3420|6648->4703|6678->4712|7165->5172|7180->5178|7233->5209|11443->9391|11478->9409|11519->9411|11609->9472|11973->9808|12009->9834|12049->9835|12147->9904|12237->9965|12252->9969|12280->9974|12318->9983|12335->9989|12384->10015|12451->10053|12468->10059|12540->10108|12766->10314|12780->10318|12820->10319|12918->10388|13008->10449|13023->10453|13051->10458|13089->10467|13106->10473|13155->10499|13222->10537|13239->10543|13301->10582|13539->10788|13633->10853|13983->11174|14000->11180|14049->11206|14082->11210|14097->11214|14125->11219|14156->11220|14579->11615|14617->11642|14659->11644|14777->11733|15134->12058|15248->12144|15286->12171|15328->12173|15446->12262|15803->12587|15917->12673|15955->12700|15997->12702|16115->12791|16472->13116|16586->13202|16624->13229|16666->13231|16784->13320|17141->13645|17255->13731|17293->13758|17335->13760|17453->13849|17810->14174|17924->14260|17962->14287|18004->14289|18122->14378|18479->14703|18590->14785|18964->15130|18979->15134|19008->15140|19632->15732|19714->15785|20385->16428|20401->16434|20462->16473
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|49->18|50->19|66->35|66->35|66->35|74->43|74->43|74->43|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|100->69|100->69|100->69|100->69|118->87|118->87|125->94|125->94|125->94|171->140|171->140|171->140|172->141|176->145|176->145|176->145|177->146|177->146|177->146|177->146|177->146|177->146|177->146|177->146|177->146|177->146|179->148|179->148|179->148|180->149|180->149|180->149|180->149|180->149|180->149|180->149|180->149|180->149|180->149|182->151|183->152|186->155|186->155|186->155|186->155|186->155|186->155|186->155|190->159|190->159|190->159|191->160|194->163|195->164|195->164|195->164|196->165|199->168|200->169|200->169|200->169|201->170|204->173|205->174|205->174|205->174|206->175|209->178|210->179|210->179|210->179|211->180|214->183|215->184|215->184|215->184|216->185|219->188|221->190|224->193|224->193|224->193|232->201|233->202|252->221|252->221|252->221
                  -- GENERATED --
              */
          