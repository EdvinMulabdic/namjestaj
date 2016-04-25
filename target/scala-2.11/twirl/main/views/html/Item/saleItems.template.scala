
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object saleItems_Scope0 {
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

class saleItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""

    """),format.raw/*4.5*/("""<!-- Main Container -->
    <section class="main-container col2-left-layout bounceInUp animated">
        <div class="category-description std">
            <div class="container">
                <div class="slider-items-products">
                    <div id="category-desc-slider" class="product-flexslider hidden-buttons">
                        <div class="slider-items slider-width-col1 owl-carousel owl-theme">

                                <!-- Item -->
                            <div class="item"> <a href="#"><img alt="" src='"""),_display_(/*13.78*/routes/*13.84*/.Assets.versioned("images/categoryItems-slider1.jpg")),format.raw/*13.137*/("""'></a>
                                <div class="cat-img-title cat-bg cat-box">
                                    <div class="small-tag"><span>Namjestaj.ba</span></div>
                                    <h2 class="cat-heading">Odaberite savrsen proizvod</h2>
                                    <p>Najkvalitetniji proizvodi </p>
                                </div>
                            </div>
                                <!-- End Item -->
                                <!-- Item -->
                            <div class="item"> <a href="#"><img alt="" src='"""),_display_(/*22.78*/routes/*22.84*/.Assets.versioned("images/categoryItems-slider2.jpg")),format.raw/*22.137*/("""'></a>
                                <div class="cat-img-title cat-bg cat-box">
                                    <div class="small-tag"><span>Sale</span>  10% OFF</div>
                                    <h2 class="cat-heading">Women Collection</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </p>
                                </div>
                            </div>
                                <!-- End Item -->
                                <!-- Item -->
                            <div class="item"> <a href="#"><img alt="" src='"""),_display_(/*31.78*/routes/*31.84*/.Assets.versioned("images/categoryItems-slider3.jpg")),format.raw/*31.137*/("""'></a>
                                <div class="cat-img-title cat-bg cat-box">
                                    <div class="small-tag"><span>Sale</span>  10% OFF</div>
                                    <h2 class="cat-heading">Women Collection</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </p>
                                </div>
                            </div>
                                <!-- End Item -->

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-main col-sm-9 col-sm-push-3">
                    <article class="col-main">
                        <div class="page-title">
                            <h2>Proizvodi iz odabrane kategorije</h2>
                        </div>

                        <div class="toolbar">


                            <div class="pager">

                                <div class="pages">
                                    <ul class="pagination">
                                        <div id='page_navigation' class="pagination-custom"></div>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="category-products">
                            <ul class="products-grid" id="easyPaginate">
                            """),_display_(/*68.30*/for(item <- items) yield /*68.48*/ {_display_(Seq[Any](format.raw/*68.50*/("""
                                """),format.raw/*69.33*/("""<li class="item col-md-3 col-sm-4 col-xs-6">
                                    <div class="item-inner">

                                        <div class="item-img">
                                        """),_display_(/*73.42*/if(item.images.size() > 0)/*73.68*/{_display_(Seq[Any](format.raw/*73.69*/("""
                                            """),format.raw/*74.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*74.106*/item/*74.110*/.name),format.raw/*74.115*/("""" href=""""),_display_(/*74.124*/routes/*74.130*/.Items.itemRender(item.id)),format.raw/*74.156*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*74.194*/models/*74.200*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*74.249*/("""'> </a>
                                                <div class="new-label new-top-left">new</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}/*77.42*/else/*77.46*/{_display_(Seq[Any](format.raw/*77.47*/("""
                                            """),format.raw/*78.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*78.106*/item/*78.110*/.name),format.raw/*78.115*/("""" href='"""),_display_(/*78.124*/routes/*78.130*/.Items.itemRender(item.id)),format.raw/*78.156*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*78.194*/routes/*78.200*/.Assets.versioned("images/product.png")),format.raw/*78.239*/("""'> </a>
                                                <div class="new-label new-top-left">AKCIJA</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}),format.raw/*81.42*/("""

                                        """),format.raw/*83.41*/("""</div>
                                        <div class="item-info">
                                            <div class="info-inner">
                                                <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*86.110*/routes/*86.116*/.Items.itemRender(item.id)),format.raw/*86.142*/(""""> """),_display_(/*86.146*/item/*86.150*/.name),format.raw/*86.155*/(""" """),format.raw/*86.156*/("""</a> </div>
                                                <div class="item-content">
                                                    <div class="rating">
                                                        <div class="ratings">
                                                            """),_display_(/*90.62*/if(item.average_Grade == 1)/*90.89*/ {_display_(Seq[Any](format.raw/*90.91*/("""
                                                                """),format.raw/*91.65*/("""<div class="rating-box">
                                                                    <div class="rating1"></div>
                                                                </div>
                                                            """)))}),format.raw/*94.62*/("""
                                                            """),_display_(/*95.62*/if(item.average_Grade == 2)/*95.89*/ {_display_(Seq[Any](format.raw/*95.91*/("""
                                                                """),format.raw/*96.65*/("""<div class="rating-box">
                                                                    <div class="rating2"></div>
                                                                </div>
                                                            """)))}),format.raw/*99.62*/("""
                                                            """),_display_(/*100.62*/if(item.average_Grade == 3)/*100.89*/ {_display_(Seq[Any](format.raw/*100.91*/("""
                                                                """),format.raw/*101.65*/("""<div class="rating-box">
                                                                    <div class="rating3"></div>
                                                                </div>
                                                            """)))}),format.raw/*104.62*/("""
                                                            """),_display_(/*105.62*/if(item.average_Grade == 4)/*105.89*/ {_display_(Seq[Any](format.raw/*105.91*/("""
                                                                """),format.raw/*106.65*/("""<div class="rating-box">
                                                                    <div class="rating4"></div>
                                                                </div>
                                                            """)))}),format.raw/*109.62*/("""
                                                            """),_display_(/*110.62*/if(item.average_Grade == 5)/*110.89*/ {_display_(Seq[Any](format.raw/*110.91*/("""
                                                                """),format.raw/*111.65*/("""<div class="rating-box">
                                                                    <div class="rating5"></div>
                                                                </div>
                                                            """)))}),format.raw/*114.62*/("""
                                                            """),_display_(/*115.62*/if(item.average_Grade == 0)/*115.89*/ {_display_(Seq[Any](format.raw/*115.91*/("""
                                                                """),format.raw/*116.65*/("""<div class="rating-box">
                                                                    <div class="rating0"></div>
                                                                </div>
                                                            """)))}),format.raw/*119.62*/("""

                                                        """),format.raw/*121.57*/("""<p class="rating-links">Ukupno """),_display_(/*121.89*/Review/*121.95*/.getNumberOfReviews(item.id)),format.raw/*121.123*/(""" """),format.raw/*121.124*/("""ocjena</p>

                                                        </div>
                                                    </div>
                                                    <div class="item-price">
                                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*126.131*/item/*126.135*/.price),format.raw/*126.141*/(""" """),format.raw/*126.142*/("""KM</span> </span> </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            """)))}),format.raw/*133.30*/("""
                            """),format.raw/*134.29*/("""</ul>
                        </div>
                    </article>
                        <!--	///*///======    End article  ========= //*/// -->
                </div>
                <div class="col-left sidebar col-sm-3 col-xs-12 col-sm-pull-9">
                    <aside class="col-left sidebar">

                        <div class="side-nav-categories">
                            <div class="block-title"> Kategorije </div>
                                <!--block-title-->
                                <!-- BEGIN BOX-CATEGORY -->
                            <div class="box-content box-category">
                                <ul>
                                """),_display_(/*148.34*/for(category <- models.Category.findAllCategories()) yield /*148.86*/ {_display_(Seq[Any](format.raw/*148.88*/("""
                                    """),format.raw/*149.37*/("""<li> <a href=""""),_display_(/*149.52*/routes/*149.58*/.Items.getItemsWithCategory(category.id)),format.raw/*149.98*/("""">"""),_display_(/*149.101*/category/*149.109*/.name),format.raw/*149.114*/("""</a> <span class="subDropdown plus"></span>
                                        <ul class="level0_455">
                                        """),_display_(/*151.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*151.110*/ {_display_(Seq[Any](format.raw/*151.112*/("""
                                            """),format.raw/*152.45*/("""<li> <a href=""""),_display_(/*152.60*/routes/*152.66*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*152.112*/(""""> """),_display_(/*152.116*/subcategory/*152.127*/.name),format.raw/*152.132*/(""" """),format.raw/*152.133*/("""</a></li>
                                        """)))}),format.raw/*153.42*/("""
                                        """),format.raw/*154.41*/("""</ul>
                                            <!--level0-->
                                    </li>
                                """)))}),format.raw/*157.34*/("""
                                """),format.raw/*158.33*/("""</ul>
                            </div>
                                <!--box-content box-category-->
                        </div>


                        <div class="block block-layered-nav">
                            <div class="block-title">Pretraga po cijeni</div>
                            <div class="block-content">
                                <p class="block-subtitle">Odaberite željeni raspon</p>
                                <dl id="narrow-by-list">
                                    <dd class="odd">
                                        <ol>
                                            <li> <a href=""""),_display_(/*171.60*/routes/*171.66*/.Items.getItemsWithPriceRange1()),format.raw/*171.98*/(""""><span class="price">do 99.00 KM</span></a> </li>
                                            <li> <a href=""""),_display_(/*172.60*/routes/*172.66*/.Items.getItemsWithPriceRange2()),format.raw/*172.98*/(""""><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*173.60*/routes/*173.66*/.Items.getItemsWithPriceRange3()),format.raw/*173.98*/(""""><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*174.60*/routes/*174.66*/.Items.getItemsWithPriceRange4()),format.raw/*174.98*/(""""><span class="price"> preko 200.00 KM</span></a>  </li>
                                        </ol>
                                    </dd>
                                </dl>
                            </div>
                        </div>

                    </aside>
                </div>
            </div>
        </div>
    </section>
    <!-- Main Container End -->
    <input type='hidden' id='current_page' />
    <input type='hidden' id='show_per_page' />

    <script src='"""),_display_(/*190.19*/routes/*190.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*190.71*/("""'></script>

""")))}))
      }
    }
  }

  def render(items:java.util.List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((java.util.List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


}

/**/
object saleItems extends saleItems_Scope0.saleItems
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 13:52:58 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/saleItems.scala.html
                  HASH: d0a66c4c274ba5a506421de3e21889026076f288
                  MATRIX: 772->1|896->30|923->32|934->36|972->38|1004->44|1574->587|1589->593|1664->646|2273->1228|2288->1234|2363->1287|2994->1891|3009->1897|3084->1950|4644->3483|4678->3501|4718->3503|4779->3536|5017->3747|5052->3773|5091->3774|5164->3819|5253->3880|5267->3884|5294->3889|5331->3898|5347->3904|5395->3930|5461->3968|5477->3974|5548->4023|5819->4275|5832->4279|5871->4280|5944->4325|6033->4386|6047->4390|6074->4395|6111->4404|6127->4410|6175->4436|6241->4474|6257->4480|6318->4519|6604->4774|6674->4816|6951->5065|6967->5071|7015->5097|7047->5101|7061->5105|7088->5110|7118->5111|7444->5410|7480->5437|7520->5439|7613->5504|7897->5757|7986->5819|8022->5846|8062->5848|8155->5913|8439->6166|8529->6228|8566->6255|8607->6257|8701->6322|8986->6575|9076->6637|9113->6664|9154->6666|9248->6731|9533->6984|9623->7046|9660->7073|9701->7075|9795->7140|10080->7393|10170->7455|10207->7482|10248->7484|10342->7549|10627->7802|10714->7860|10774->7892|10790->7898|10841->7926|10872->7927|11242->8268|11257->8272|11286->8278|11317->8279|11696->8626|11754->8655|12465->9338|12534->9390|12575->9392|12641->9429|12684->9444|12700->9450|12762->9490|12794->9493|12813->9501|12841->9506|13018->9655|13104->9723|13146->9725|13220->9770|13263->9785|13279->9791|13348->9837|13381->9841|13403->9852|13431->9857|13462->9858|13545->9909|13615->9950|13786->10089|13848->10122|14511->10757|14527->10763|14581->10795|14719->10905|14735->10911|14789->10943|14967->11093|14983->11099|15037->11131|15215->11281|15231->11287|15285->11319|15808->11814|15824->11820|15892->11866
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|44->13|44->13|44->13|53->22|53->22|53->22|62->31|62->31|62->31|99->68|99->68|99->68|100->69|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|112->81|114->83|117->86|117->86|117->86|117->86|117->86|117->86|117->86|121->90|121->90|121->90|122->91|125->94|126->95|126->95|126->95|127->96|130->99|131->100|131->100|131->100|132->101|135->104|136->105|136->105|136->105|137->106|140->109|141->110|141->110|141->110|142->111|145->114|146->115|146->115|146->115|147->116|150->119|152->121|152->121|152->121|152->121|152->121|157->126|157->126|157->126|157->126|164->133|165->134|179->148|179->148|179->148|180->149|180->149|180->149|180->149|180->149|180->149|180->149|182->151|182->151|182->151|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|184->153|185->154|188->157|189->158|202->171|202->171|202->171|203->172|203->172|203->172|204->173|204->173|204->173|205->174|205->174|205->174|221->190|221->190|221->190
                  -- GENERATED --
              */
          