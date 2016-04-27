
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
                                                <div class="new-label new-top-left">new</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}/*60.42*/else/*60.46*/{_display_(Seq[Any](format.raw/*60.47*/("""
                                            """),format.raw/*61.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*61.106*/item/*61.110*/.name),format.raw/*61.115*/("""" href='"""),_display_(/*61.124*/routes/*61.130*/.Items.itemRender(item.id)),format.raw/*61.156*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*61.194*/routes/*61.200*/.Assets.versioned("images/product.png")),format.raw/*61.239*/("""'> </a>
                                                <div class="new-label new-top-left">AKCIJA</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}),format.raw/*64.42*/("""

                                        """),format.raw/*66.41*/("""</div>
                                        <div class="item-info">
                                            <div class="info-inner">
                                                <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*69.110*/routes/*69.116*/.Items.itemRender(item.id)),format.raw/*69.142*/(""""> """),_display_(/*69.146*/item/*69.150*/.name),format.raw/*69.155*/(""" """),format.raw/*69.156*/("""</a> </div>
                                                <div class="item-content">
                                                    <div class="rating">
                                                        <div class="ratings">
                                                            """),_display_(/*73.62*/if(item.average_Grade == 1)/*73.89*/ {_display_(Seq[Any](format.raw/*73.91*/("""
                                                                """),format.raw/*74.65*/("""<div class="rating-box">
                                                                    <div class="rating1"></div>
                                                                </div>
                                                            """)))}),format.raw/*77.62*/("""
                                                            """),_display_(/*78.62*/if(item.average_Grade == 2)/*78.89*/ {_display_(Seq[Any](format.raw/*78.91*/("""
                                                                """),format.raw/*79.65*/("""<div class="rating-box">
                                                                    <div class="rating2"></div>
                                                                </div>
                                                            """)))}),format.raw/*82.62*/("""
                                                            """),_display_(/*83.62*/if(item.average_Grade == 3)/*83.89*/ {_display_(Seq[Any](format.raw/*83.91*/("""
                                                                """),format.raw/*84.65*/("""<div class="rating-box">
                                                                    <div class="rating3"></div>
                                                                </div>
                                                            """)))}),format.raw/*87.62*/("""
                                                            """),_display_(/*88.62*/if(item.average_Grade == 4)/*88.89*/ {_display_(Seq[Any](format.raw/*88.91*/("""
                                                                """),format.raw/*89.65*/("""<div class="rating-box">
                                                                    <div class="rating4"></div>
                                                                </div>
                                                            """)))}),format.raw/*92.62*/("""
                                                            """),_display_(/*93.62*/if(item.average_Grade == 5)/*93.89*/ {_display_(Seq[Any](format.raw/*93.91*/("""
                                                                """),format.raw/*94.65*/("""<div class="rating-box">
                                                                    <div class="rating5"></div>
                                                                </div>
                                                            """)))}),format.raw/*97.62*/("""
                                                            """),_display_(/*98.62*/if(item.average_Grade == 0)/*98.89*/ {_display_(Seq[Any](format.raw/*98.91*/("""
                                                                """),format.raw/*99.65*/("""<div class="rating-box">
                                                                    <div class="rating0"></div>
                                                                </div>
                                                            """)))}),format.raw/*102.62*/("""

                                                        """),format.raw/*104.57*/("""<p class="rating-links">Ukupno """),_display_(/*104.89*/Review/*104.95*/.getNumberOfReviews(item.id)),format.raw/*104.123*/(""" """),format.raw/*104.124*/("""ocjena</p>

                                                        </div>
                                                    </div>
                                                    <div class="item-price">
                                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*109.131*/item/*109.135*/.price),format.raw/*109.141*/(""" """),format.raw/*109.142*/("""KM</span> </span> </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            """)))}),format.raw/*117.30*/("""
                            """),format.raw/*118.29*/("""</ul>
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
                                """),_display_(/*132.34*/for(category <- models.Category.findAllCategories()) yield /*132.86*/ {_display_(Seq[Any](format.raw/*132.88*/("""
                                    """),format.raw/*133.37*/("""<li> <a href=""""),_display_(/*133.52*/routes/*133.58*/.Items.getItemsWithCategory(category.id)),format.raw/*133.98*/("""">"""),_display_(/*133.101*/category/*133.109*/.name),format.raw/*133.114*/("""</a> <span class="subDropdown plus"></span>
                                        <ul class="level0_455">
                                        """),_display_(/*135.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*135.110*/ {_display_(Seq[Any](format.raw/*135.112*/("""
                                            """),format.raw/*136.45*/("""<li> <a href=""""),_display_(/*136.60*/routes/*136.66*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*136.112*/(""""> """),_display_(/*136.116*/subcategory/*136.127*/.name),format.raw/*136.132*/(""" """),format.raw/*136.133*/("""</a></li>
                                        """)))}),format.raw/*137.42*/("""
                                        """),format.raw/*138.41*/("""</ul>
                                            <!--level0-->
                                    </li>
                                """)))}),format.raw/*141.34*/("""
                                """),format.raw/*142.33*/("""</ul>
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
                                            <li> <a href=""""),_display_(/*155.60*/routes/*155.66*/.Items.getItemsWithPriceRange1()),format.raw/*155.98*/(""""><span class="price">do 99.00 KM</span></a> </li>
                                            <li> <a href=""""),_display_(/*156.60*/routes/*156.66*/.Items.getItemsWithPriceRange2()),format.raw/*156.98*/(""""><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*157.60*/routes/*157.66*/.Items.getItemsWithPriceRange3()),format.raw/*157.98*/(""""><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*158.60*/routes/*158.66*/.Items.getItemsWithPriceRange4()),format.raw/*158.98*/(""""><span class="price"> preko 200.00 KM</span></a>  </li>
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

    <script src='"""),_display_(/*174.19*/routes/*174.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*174.71*/("""'></script>
    <style>
        .bx-pager"""),format.raw/*176.18*/("""{"""),format.raw/*176.19*/("""
            """),format.raw/*177.13*/("""display: none;
            padding-top: 0px;
        """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/("""
    """),format.raw/*180.5*/("""</style>

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
                  DATE: Wed Apr 27 21:34:43 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/categoryItems.scala.html
                  HASH: 8da953b83c3cd2522d4ffe475ce7b698e38b7a05
                  MATRIX: 780->1|904->30|931->32|942->36|980->38|1008->40|1738->743|1753->749|1828->802|2011->958|2026->964|2101->1017|2284->1173|2299->1179|2374->1232|3600->2431|3634->2449|3674->2451|3735->2484|3973->2695|4008->2721|4047->2722|4120->2767|4209->2828|4223->2832|4250->2837|4287->2846|4303->2852|4351->2878|4417->2916|4433->2922|4504->2971|4775->3223|4788->3227|4827->3228|4900->3273|4989->3334|5003->3338|5030->3343|5067->3352|5083->3358|5131->3384|5197->3422|5213->3428|5274->3467|5560->3722|5630->3764|5907->4013|5923->4019|5971->4045|6003->4049|6017->4053|6044->4058|6074->4059|6400->4358|6436->4385|6476->4387|6569->4452|6853->4705|6942->4767|6978->4794|7018->4796|7111->4861|7395->5114|7484->5176|7520->5203|7560->5205|7653->5270|7937->5523|8026->5585|8062->5612|8102->5614|8195->5679|8479->5932|8568->5994|8604->6021|8644->6023|8737->6088|9021->6341|9110->6403|9146->6430|9186->6432|9279->6497|9564->6750|9651->6808|9711->6840|9727->6846|9778->6874|9809->6875|10179->7216|10194->7220|10223->7226|10254->7227|10634->7575|10692->7604|11403->8287|11472->8339|11513->8341|11579->8378|11622->8393|11638->8399|11700->8439|11732->8442|11751->8450|11779->8455|11956->8604|12042->8672|12084->8674|12158->8719|12201->8734|12217->8740|12286->8786|12319->8790|12341->8801|12369->8806|12400->8807|12483->8858|12553->8899|12724->9038|12786->9071|13449->9706|13465->9712|13519->9744|13657->9854|13673->9860|13727->9892|13905->10042|13921->10048|13975->10080|14153->10230|14169->10236|14223->10268|14746->10763|14762->10769|14830->10815|14900->10856|14930->10857|14972->10870|15053->10923|15083->10924|15116->10929
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|46->15|46->15|46->15|49->18|49->18|49->18|52->21|52->21|52->21|82->51|82->51|82->51|83->52|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|95->64|97->66|100->69|100->69|100->69|100->69|100->69|100->69|100->69|104->73|104->73|104->73|105->74|108->77|109->78|109->78|109->78|110->79|113->82|114->83|114->83|114->83|115->84|118->87|119->88|119->88|119->88|120->89|123->92|124->93|124->93|124->93|125->94|128->97|129->98|129->98|129->98|130->99|133->102|135->104|135->104|135->104|135->104|135->104|140->109|140->109|140->109|140->109|148->117|149->118|163->132|163->132|163->132|164->133|164->133|164->133|164->133|164->133|164->133|164->133|166->135|166->135|166->135|167->136|167->136|167->136|167->136|167->136|167->136|167->136|167->136|168->137|169->138|172->141|173->142|186->155|186->155|186->155|187->156|187->156|187->156|188->157|188->157|188->157|189->158|189->158|189->158|205->174|205->174|205->174|207->176|207->176|208->177|210->179|210->179|211->180
                  -- GENERATED --
              */
          