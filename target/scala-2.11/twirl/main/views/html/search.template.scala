
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""

    """),format.raw/*4.5*/("""<!-- Main Container -->
    <section class="main-container col2-left-layout bounceInUp animated">

        <div class="container" id="slider-custom">
            <div class="slider-items-products">
                <div id="category-desc-slider" class="product-flexslider hidden-buttons">
                    <div class="slider-items slider-width-col1 owl-carousel owl-theme">
                        <div class="offer-slider-3 wow animated parallax parallax-3">
                            <div class="container">
                                <ul class="bxslider">
                                    <li>
                                        <img alt="" src='"""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/categoryItems-slider1.jpg")),format.raw/*15.118*/("""'>
                                    </li>
                                    <li>
                                        <img alt="" src='"""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/categoryItems-slider2.jpg")),format.raw/*18.118*/("""'>
                                    </li>
                                    <li>
                                        <img alt="" src='"""),_display_(/*21.59*/routes/*21.65*/.Assets.versioned("images/categoryItems-slider3.jpg")),format.raw/*21.118*/("""'>
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
                            <h2>Rezultati pretrage</h2>
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
    .bx-pager"""),format.raw/*174.14*/("""{"""),format.raw/*174.15*/("""
    """),format.raw/*175.5*/("""display: none;
    padding-top: 0px;
    """),format.raw/*177.5*/("""}"""),format.raw/*177.6*/("""

    """),format.raw/*179.5*/(""".box-content li:hover .level0_455"""),format.raw/*179.38*/("""{"""),format.raw/*179.39*/("""
    """),format.raw/*180.5*/("""display: block;
    """),format.raw/*181.5*/("""}"""),format.raw/*181.6*/("""


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
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/search.scala.html
                  HASH: f7cf7529899086204f5b8b982889eb5ffed933ae
                  MATRIX: 761->1|885->30|912->32|923->36|961->38|993->44|1687->711|1702->717|1777->770|1948->914|1963->920|2038->973|2209->1117|2224->1123|2299->1176|3479->2329|3513->2347|3553->2349|3614->2382|3852->2593|3887->2619|3926->2620|3999->2665|4088->2726|4102->2730|4129->2735|4166->2744|4182->2750|4230->2776|4296->2814|4312->2820|4383->2869|4560->3027|4573->3031|4612->3032|4685->3077|4774->3138|4788->3142|4815->3147|4852->3156|4868->3162|4916->3188|4982->3226|4998->3232|5059->3271|5248->3429|5318->3471|5595->3720|5611->3726|5659->3752|5691->3756|5705->3760|5732->3765|5762->3766|6088->4065|6124->4092|6164->4094|6257->4159|6541->4412|6630->4474|6666->4501|6706->4503|6799->4568|7083->4821|7172->4883|7208->4910|7248->4912|7341->4977|7625->5230|7714->5292|7750->5319|7790->5321|7883->5386|8167->5639|8256->5701|8292->5728|8332->5730|8425->5795|8709->6048|8798->6110|8834->6137|8874->6139|8967->6204|9252->6457|9339->6515|9399->6547|9415->6553|9466->6581|9497->6582|9867->6923|9882->6927|9911->6933|9942->6934|10322->7282|10380->7311|11091->7994|11160->8046|11201->8048|11267->8085|11310->8100|11326->8106|11388->8146|11420->8149|11439->8157|11467->8162|11498->8163|11668->8305|11754->8373|11796->8375|11870->8420|11913->8435|11929->8441|11998->8487|12031->8491|12053->8502|12081->8507|12112->8508|12195->8559|12265->8600|12436->8739|12498->8772|13161->9407|13177->9413|13231->9445|13369->9555|13385->9561|13439->9593|13617->9743|13633->9749|13687->9781|13865->9931|13881->9937|13935->9969|14458->10464|14474->10470|14542->10516|14608->10553|14638->10554|14671->10559|14740->10600|14769->10601|14803->10607|14865->10640|14895->10641|14928->10646|14976->10666|15005->10667|15040->10674
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|46->15|46->15|46->15|49->18|49->18|49->18|52->21|52->21|52->21|82->51|82->51|82->51|83->52|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|93->62|95->64|98->67|98->67|98->67|98->67|98->67|98->67|98->67|102->71|102->71|102->71|103->72|106->75|107->76|107->76|107->76|108->77|111->80|112->81|112->81|112->81|113->82|116->85|117->86|117->86|117->86|118->87|121->90|122->91|122->91|122->91|123->92|126->95|127->96|127->96|127->96|128->97|131->100|133->102|133->102|133->102|133->102|133->102|138->107|138->107|138->107|138->107|146->115|147->116|161->130|161->130|161->130|162->131|162->131|162->131|162->131|162->131|162->131|162->131|162->131|164->133|164->133|164->133|165->134|165->134|165->134|165->134|165->134|165->134|165->134|165->134|166->135|167->136|170->139|171->140|184->153|184->153|184->153|185->154|185->154|185->154|186->155|186->155|186->155|187->156|187->156|187->156|203->172|203->172|203->172|205->174|205->174|206->175|208->177|208->177|210->179|210->179|210->179|211->180|212->181|212->181|215->184
                  -- GENERATED --
              */
          