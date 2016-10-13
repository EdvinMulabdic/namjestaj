
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object categoryItems_Scope0 {
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

class categoryItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""

"""),format.raw/*4.1*/("""<!-- Main Container -->
    <section class="main-container col2-left-layout bounceInUp animated">

            <div class="container" id="slider-custom">
                <div class="slider-items-products">
                    <div id="category-desc-slider" class="product-flexslider hidden-buttons">
                        <div class="slider-items slider-width-col1 owl-carousel owl-theme">
                            <div class="offer-slider-3 wow animated parallax parallax-3">
                                <div class="container">
                                    <ul class="bxslider">
                                        <li>
                                            <img alt="" src='"""),_display_(/*15.63*/routes/*15.69*/.Assets.versioned("images/categoryItems-slider1.jpg")),format.raw/*15.122*/("""'>
                                        </li>
                                        <li>
                                            <img alt="" src='"""),_display_(/*18.63*/routes/*18.69*/.Assets.versioned("images/categoryItems-slider2.jpg")),format.raw/*18.122*/("""'>
                                        </li>
                                        <li>
                                            <img alt="" src='"""),_display_(/*21.63*/routes/*21.69*/.Assets.versioned("images/categoryItems-slider3.jpg")),format.raw/*21.122*/("""'>
                                        </li>
                                    </ul>
                                </div>
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
                            """),_display_(/*51.30*/for(item <- items) yield /*51.48*/ {_display_(Seq[Any](format.raw/*51.50*/("""
                                """),format.raw/*52.33*/("""<li class="item col-md-3 col-sm-4 col-xs-6">
                                    <div class="item-inner">

                                        <div class="item-img">
                                        """),_display_(/*56.42*/if(item.images.size() > 0)/*56.68*/{_display_(Seq[Any](format.raw/*56.69*/("""
                                            """),format.raw/*57.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*57.106*/item/*57.110*/.name),format.raw/*57.115*/("""" href=""""),_display_(/*57.124*/routes/*57.130*/.Items.itemRender(item.id)),format.raw/*57.156*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*57.194*/models/*57.200*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*57.249*/("""'> </a>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}/*59.42*/else/*59.46*/{_display_(Seq[Any](format.raw/*59.47*/("""
                                            """),format.raw/*60.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*60.106*/item/*60.110*/.name),format.raw/*60.115*/("""" href='"""),_display_(/*60.124*/routes/*60.130*/.Items.itemRender(item.id)),format.raw/*60.156*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*60.194*/routes/*60.200*/.Assets.versioned("images/product.png")),format.raw/*60.239*/("""'> </a>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}),format.raw/*62.42*/("""

                                        """),format.raw/*64.41*/("""</div>
                                        <div class="item-info">
                                            <div class="info-inner">
                                                <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*67.110*/routes/*67.116*/.Items.itemRender(item.id)),format.raw/*67.142*/(""""> """),_display_(/*67.146*/item/*67.150*/.name),format.raw/*67.155*/(""" """),format.raw/*67.156*/("""</a> </div>
                                                <div class="item-content">
                                                    <div class="rating">
                                                        <div class="ratings">
                                                            """),_display_(/*71.62*/if(item.average_Grade == 1)/*71.89*/ {_display_(Seq[Any](format.raw/*71.91*/("""
                                                                """),format.raw/*72.65*/("""<div class="rating-box">
                                                                    <div class="rating1"></div>
                                                                </div>
                                                            """)))}),format.raw/*75.62*/("""
                                                            """),_display_(/*76.62*/if(item.average_Grade == 2)/*76.89*/ {_display_(Seq[Any](format.raw/*76.91*/("""
                                                                """),format.raw/*77.65*/("""<div class="rating-box">
                                                                    <div class="rating2"></div>
                                                                </div>
                                                            """)))}),format.raw/*80.62*/("""
                                                            """),_display_(/*81.62*/if(item.average_Grade == 3)/*81.89*/ {_display_(Seq[Any](format.raw/*81.91*/("""
                                                                """),format.raw/*82.65*/("""<div class="rating-box">
                                                                    <div class="rating3"></div>
                                                                </div>
                                                            """)))}),format.raw/*85.62*/("""
                                                            """),_display_(/*86.62*/if(item.average_Grade == 4)/*86.89*/ {_display_(Seq[Any](format.raw/*86.91*/("""
                                                                """),format.raw/*87.65*/("""<div class="rating-box">
                                                                    <div class="rating4"></div>
                                                                </div>
                                                            """)))}),format.raw/*90.62*/("""
                                                            """),_display_(/*91.62*/if(item.average_Grade == 5)/*91.89*/ {_display_(Seq[Any](format.raw/*91.91*/("""
                                                                """),format.raw/*92.65*/("""<div class="rating-box">
                                                                    <div class="rating5"></div>
                                                                </div>
                                                            """)))}),format.raw/*95.62*/("""
                                                            """),_display_(/*96.62*/if(item.average_Grade == 0)/*96.89*/ {_display_(Seq[Any](format.raw/*96.91*/("""
                                                                """),format.raw/*97.65*/("""<div class="rating-box">
                                                                    <div class="rating0"></div>
                                                                </div>
                                                            """)))}),format.raw/*100.62*/("""

                                                        """),format.raw/*102.57*/("""<p class="rating-links">Ukupno """),_display_(/*102.89*/Review/*102.95*/.getNumberOfReviews(item.id)),format.raw/*102.123*/(""" """),format.raw/*102.124*/("""ocjena</p>

                                                        </div>
                                                    </div>
                                                    <div class="item-price">
                                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*107.131*/item/*107.135*/.price),format.raw/*107.141*/(""" """),format.raw/*107.142*/("""KM</span> </span> </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            """)))}),format.raw/*115.30*/("""
                            """),format.raw/*116.29*/("""</ul>
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
                                """),_display_(/*130.34*/for(category <- models.Category.findAllCategories()) yield /*130.86*/ {_display_(Seq[Any](format.raw/*130.88*/("""
                                    """),format.raw/*131.37*/("""<li> <a href=""""),_display_(/*131.52*/routes/*131.58*/.Items.getItemsWithCategory(category.id)),format.raw/*131.98*/("""">"""),_display_(/*131.101*/category/*131.109*/.name),format.raw/*131.114*/(""" """),format.raw/*131.115*/("""<i class="fa fa-angle-down"></i></a>
                                        <ul class="level0_455">
                                        """),_display_(/*133.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*133.110*/ {_display_(Seq[Any](format.raw/*133.112*/("""
                                            """),format.raw/*134.45*/("""<li> <a href=""""),_display_(/*134.60*/routes/*134.66*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*134.112*/(""""> """),_display_(/*134.116*/subcategory/*134.127*/.name),format.raw/*134.132*/(""" """),format.raw/*134.133*/("""</a></li>
                                        """)))}),format.raw/*135.42*/("""
                                        """),format.raw/*136.41*/("""</ul>
                                            <!--level0-->
                                    </li>
                                """)))}),format.raw/*139.34*/("""
                                """),format.raw/*140.33*/("""</ul>
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
                                            <li> <a href=""""),_display_(/*153.60*/routes/*153.66*/.Items.getItemsWithPriceRange1()),format.raw/*153.98*/(""""><span class="price">do 99.00 KM</span></a> </li>
                                            <li> <a href=""""),_display_(/*154.60*/routes/*154.66*/.Items.getItemsWithPriceRange2()),format.raw/*154.98*/(""""><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*155.60*/routes/*155.66*/.Items.getItemsWithPriceRange3()),format.raw/*155.98*/(""""><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*156.60*/routes/*156.66*/.Items.getItemsWithPriceRange4()),format.raw/*156.98*/(""""><span class="price"> preko 200.00 KM</span></a>  </li>
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

    <script src='"""),_display_(/*172.19*/routes/*172.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*172.71*/("""'></script>
    <style>
        .bx-pager"""),format.raw/*174.18*/("""{"""),format.raw/*174.19*/("""
            """),format.raw/*175.13*/("""display: none;
            padding-top: 0px;
        """),format.raw/*177.9*/("""}"""),format.raw/*177.10*/("""

        """),format.raw/*179.9*/(""".box-content li:hover .level0_455"""),format.raw/*179.42*/("""{"""),format.raw/*179.43*/("""
        """),format.raw/*180.9*/("""display: block;
        """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/("""


    """),format.raw/*184.5*/("""</style>

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
object categoryItems extends categoryItems_Scope0.categoryItems
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/categoryItems.scala.html
                  HASH: 3c2fedcb0fbf138bc6f7b9c366805ae39c75a3f9
                  MATRIX: 780->1|904->30|931->32|942->36|980->38|1008->40|1738->743|1753->749|1828->802|2011->958|2026->964|2101->1017|2284->1173|2299->1179|2374->1232|3600->2431|3634->2449|3674->2451|3735->2484|3973->2695|4008->2721|4047->2722|4120->2767|4209->2828|4223->2832|4250->2837|4287->2846|4303->2852|4351->2878|4417->2916|4433->2922|4504->2971|4681->3129|4694->3133|4733->3134|4806->3179|4895->3240|4909->3244|4936->3249|4973->3258|4989->3264|5037->3290|5103->3328|5119->3334|5180->3373|5369->3531|5439->3573|5716->3822|5732->3828|5780->3854|5812->3858|5826->3862|5853->3867|5883->3868|6209->4167|6245->4194|6285->4196|6378->4261|6662->4514|6751->4576|6787->4603|6827->4605|6920->4670|7204->4923|7293->4985|7329->5012|7369->5014|7462->5079|7746->5332|7835->5394|7871->5421|7911->5423|8004->5488|8288->5741|8377->5803|8413->5830|8453->5832|8546->5897|8830->6150|8919->6212|8955->6239|8995->6241|9088->6306|9373->6559|9460->6617|9520->6649|9536->6655|9587->6683|9618->6684|9988->7025|10003->7029|10032->7035|10063->7036|10443->7384|10501->7413|11212->8096|11281->8148|11322->8150|11388->8187|11431->8202|11447->8208|11509->8248|11541->8251|11560->8259|11588->8264|11619->8265|11789->8407|11875->8475|11917->8477|11991->8522|12034->8537|12050->8543|12119->8589|12152->8593|12174->8604|12202->8609|12233->8610|12316->8661|12386->8702|12557->8841|12619->8874|13282->9509|13298->9515|13352->9547|13490->9657|13506->9663|13560->9695|13738->9845|13754->9851|13808->9883|13986->10033|14002->10039|14056->10071|14579->10566|14595->10572|14663->10618|14733->10659|14763->10660|14805->10673|14886->10726|14916->10727|14954->10737|15016->10770|15046->10771|15083->10780|15135->10804|15165->10805|15200->10812
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|46->15|46->15|46->15|49->18|49->18|49->18|52->21|52->21|52->21|82->51|82->51|82->51|83->52|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|93->62|95->64|98->67|98->67|98->67|98->67|98->67|98->67|98->67|102->71|102->71|102->71|103->72|106->75|107->76|107->76|107->76|108->77|111->80|112->81|112->81|112->81|113->82|116->85|117->86|117->86|117->86|118->87|121->90|122->91|122->91|122->91|123->92|126->95|127->96|127->96|127->96|128->97|131->100|133->102|133->102|133->102|133->102|133->102|138->107|138->107|138->107|138->107|146->115|147->116|161->130|161->130|161->130|162->131|162->131|162->131|162->131|162->131|162->131|162->131|162->131|164->133|164->133|164->133|165->134|165->134|165->134|165->134|165->134|165->134|165->134|165->134|166->135|167->136|170->139|171->140|184->153|184->153|184->153|185->154|185->154|185->154|186->155|186->155|186->155|187->156|187->156|187->156|203->172|203->172|203->172|205->174|205->174|206->175|208->177|208->177|210->179|210->179|210->179|211->180|212->181|212->181|215->184
                  -- GENERATED --
              */
          