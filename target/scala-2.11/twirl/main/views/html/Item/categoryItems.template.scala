
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
        """),format.raw/*6.51*/("""
            """),format.raw/*7.13*/("""<div class="container">
                <div class="slider-items-products">
                    <div id="category-desc-slider" class="product-flexslider hidden-buttons">
                        <div class="slider-items slider-width-col1 owl-carousel owl-theme">
                            <div class="col-lg-12 col-sm-12 col-md-12 bounceInUp animated">
                                <div style="position:relative;width:100%;height:250;margin-top:0px;margin-bottom:0px">
                                    <div id='rev_slider_4_wrapper' class='rev_slider_wrapper fullwidthbanner-container' >
                                        <div id='rev_slider_4' class='rev_slider fullwidthabanner'>
                                            <ul>
                                                <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*16.135*/routes/*16.141*/.Assets.versioned("images/categoryItems-slider1.jpg")),format.raw/*16.194*/("""'><img src='"""),_display_(/*16.207*/routes/*16.213*/.Assets.versioned("images/categoryItems-slider1.jpg")),format.raw/*16.266*/("""' data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat' alt="" />
                                                    <div class="info">
                                                        <div class='tp-caption ExtraLargeTitle sft  tp-resizeme ' data-x='0'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;'><span>New Season</span></div>
                                                        <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='0'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3; max-width:auto;max-height:auto;white-space:nowrap;'><span>Summer Sale</span></div>
                                                        <div class='tp-caption sfb  tp-resizeme ' data-x='0'  data-y='410'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Shop Now</a></div>
                                                        <div class='tp-caption Title sft  tp-resizeme ' data-x='0'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">In augue urna, nunc, tincidunt, augue, augue facilisis facilisis</h4></div>
                                                    </div>
                                                </li>
                                                <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*24.135*/routes/*24.141*/.Assets.versioned("images/slide-img2.jpg")),format.raw/*24.183*/("""'><img src='"""),_display_(/*24.196*/routes/*24.202*/.Assets.versioned("images/categoryItems-slider2.jpg")),format.raw/*24.255*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                                    <div class="info">
                                                        <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                                        <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                                        <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                                        <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                                    </div>
                                                </li>
                                                <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*32.135*/routes/*32.141*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*32.183*/("""'><img src='"""),_display_(/*32.196*/routes/*32.202*/.Assets.versioned("images/slide-img3.jpg")),format.raw/*32.244*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
                                                    <div class="info">
                                                        <div class='tp-caption ExtraLargeTitle sft slide2  tp-resizeme ' data-x='45'  data-y='165'  data-endspeed='500'  data-speed='500' data-start='1100' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:2;max-width:auto;max-height:auto;white-space:nowrap;padding-right:0px'>laptop Sale</div>
                                                        <div class='tp-caption LargeTitle sfl  tp-resizeme ' data-x='45'  data-y='220'  data-endspeed='500'  data-speed='500' data-start='1300' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:3;max-width:auto;max-height:auto;white-space:nowrap;'>Go Lightly</div>
                                                        <div    class='tp-caption sfb  tp-resizeme ' data-x='45'  data-y='400'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Linear.easeNone' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><a href='#' class="buy-btn">Buy Now</a></div>
                                                        <div class='tp-caption Title sft  tp-resizeme ' data-x='45'  data-y='320'  data-endspeed='500'  data-speed='500' data-start='1500' data-easing='Power2.easeInOut' data-splitin='none' data-splitout='none' data-elementdelay='0.1' data-endelementdelay='0.1' style='z-index:4;max-width:auto;max-height:auto;white-space:nowrap;'><h4 class="banner-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h4></div>
                                                    </div>
                                                </li>
                                                <li data-transition='random' data-slotamount='7' data-masterspeed='1000' data-thumb='"""),_display_(/*40.135*/routes/*40.141*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*40.183*/("""'><img src='"""),_display_(/*40.196*/routes/*40.202*/.Assets.versioned("images/slide-img4.jpg")),format.raw/*40.244*/("""'  data-bgposition='left top'  data-bgfit='cover' data-bgrepeat='no-repeat'  alt=""/>
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
                            """),format.raw/*53.46*/("""
                            """),format.raw/*54.51*/("""
                            """),format.raw/*55.128*/("""
                            """),format.raw/*56.75*/("""
                            """),format.raw/*57.87*/("""
                            """),format.raw/*58.88*/("""
                            """),format.raw/*59.66*/("""
                            """),format.raw/*60.39*/("""
                            """),format.raw/*61.39*/("""
                            """),format.raw/*62.50*/("""
                            """),format.raw/*63.46*/("""
                            """),format.raw/*64.51*/("""
                            """),format.raw/*65.128*/("""
                            """),format.raw/*66.75*/("""
                            """),format.raw/*67.88*/("""
                            """),format.raw/*68.78*/("""
                            """),format.raw/*69.97*/("""
                            """),format.raw/*70.39*/("""
                            """),format.raw/*71.39*/("""
                            """),format.raw/*72.50*/("""
                            """),format.raw/*73.46*/("""
                            """),format.raw/*74.51*/("""
                            """),format.raw/*75.128*/("""
                            """),format.raw/*76.75*/("""
                            """),format.raw/*77.88*/("""
                            """),format.raw/*78.78*/("""
                            """),format.raw/*79.97*/("""
                            """),format.raw/*80.39*/("""
                            """),format.raw/*81.39*/("""
                            """),format.raw/*82.50*/("""

                        """),format.raw/*84.25*/("""</div>
                    </div>
                </div>
            </div>
        """),format.raw/*88.19*/("""

        """),format.raw/*90.9*/("""<div class="container">
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
                            """),_display_(/*112.30*/for(item <- items) yield /*112.48*/ {_display_(Seq[Any](format.raw/*112.50*/("""
                                """),format.raw/*113.33*/("""<li class="item col-md-3 col-sm-4 col-xs-6">
                                    <div class="item-inner">

                                        <div class="item-img">
                                        """),_display_(/*117.42*/if(item.images.size() > 0)/*117.68*/{_display_(Seq[Any](format.raw/*117.69*/("""
                                            """),format.raw/*118.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*118.106*/item/*118.110*/.name),format.raw/*118.115*/("""" href=""""),_display_(/*118.124*/routes/*118.130*/.Items.itemRender(item.id)),format.raw/*118.156*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*118.194*/models/*118.200*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*118.249*/("""'> </a>
                                                <div class="new-label new-top-left">new</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}/*121.42*/else/*121.46*/{_display_(Seq[Any](format.raw/*121.47*/("""
                                            """),format.raw/*122.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*122.106*/item/*122.110*/.name),format.raw/*122.115*/("""" href='"""),_display_(/*122.124*/routes/*122.130*/.Items.itemRender(item.id)),format.raw/*122.156*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*122.194*/routes/*122.200*/.Assets.versioned("images/product.png")),format.raw/*122.239*/("""'> </a>
                                                <div class="new-label new-top-left">AKCIJA</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}),format.raw/*125.42*/("""

                                        """),format.raw/*127.41*/("""</div>
                                        <div class="item-info">
                                            <div class="info-inner">
                                                <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*130.110*/routes/*130.116*/.Items.itemRender(item.id)),format.raw/*130.142*/(""""> """),_display_(/*130.146*/item/*130.150*/.name),format.raw/*130.155*/(""" """),format.raw/*130.156*/("""</a> </div>
                                                <div class="item-content">
                                                    <div class="rating">
                                                        <div class="ratings">
                                                            """),_display_(/*134.62*/if(item.average_Grade == 1)/*134.89*/ {_display_(Seq[Any](format.raw/*134.91*/("""
                                                                """),format.raw/*135.65*/("""<div class="rating-box">
                                                                    <div class="rating1"></div>
                                                                </div>
                                                            """)))}),format.raw/*138.62*/("""
                                                            """),_display_(/*139.62*/if(item.average_Grade == 2)/*139.89*/ {_display_(Seq[Any](format.raw/*139.91*/("""
                                                                """),format.raw/*140.65*/("""<div class="rating-box">
                                                                    <div class="rating2"></div>
                                                                </div>
                                                            """)))}),format.raw/*143.62*/("""
                                                            """),_display_(/*144.62*/if(item.average_Grade == 3)/*144.89*/ {_display_(Seq[Any](format.raw/*144.91*/("""
                                                                """),format.raw/*145.65*/("""<div class="rating-box">
                                                                    <div class="rating3"></div>
                                                                </div>
                                                            """)))}),format.raw/*148.62*/("""
                                                            """),_display_(/*149.62*/if(item.average_Grade == 4)/*149.89*/ {_display_(Seq[Any](format.raw/*149.91*/("""
                                                                """),format.raw/*150.65*/("""<div class="rating-box">
                                                                    <div class="rating4"></div>
                                                                </div>
                                                            """)))}),format.raw/*153.62*/("""
                                                            """),_display_(/*154.62*/if(item.average_Grade == 5)/*154.89*/ {_display_(Seq[Any](format.raw/*154.91*/("""
                                                                """),format.raw/*155.65*/("""<div class="rating-box">
                                                                    <div class="rating5"></div>
                                                                </div>
                                                            """)))}),format.raw/*158.62*/("""
                                                            """),_display_(/*159.62*/if(item.average_Grade == 0)/*159.89*/ {_display_(Seq[Any](format.raw/*159.91*/("""
                                                                """),format.raw/*160.65*/("""<div class="rating-box">
                                                                    <div class="rating0"></div>
                                                                </div>
                                                            """)))}),format.raw/*163.62*/("""

                                                        """),format.raw/*165.57*/("""<p class="rating-links">Ukupno """),_display_(/*165.89*/Review/*165.95*/.getNumberOfReviews(item.id)),format.raw/*165.123*/(""" """),format.raw/*165.124*/("""ocjena</p>

                                                        </div>
                                                    </div>
                                                    <div class="item-price">
                                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*170.131*/item/*170.135*/.price),format.raw/*170.141*/(""" """),format.raw/*170.142*/("""KM</span> </span> </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            """)))}),format.raw/*178.30*/("""
                            """),format.raw/*179.29*/("""</ul>
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
                                """),_display_(/*193.34*/for(category <- models.Category.findAllCategories()) yield /*193.86*/ {_display_(Seq[Any](format.raw/*193.88*/("""
                                    """),format.raw/*194.37*/("""<li> <a href=""""),_display_(/*194.52*/routes/*194.58*/.Items.getItemsWithCategory(category.id)),format.raw/*194.98*/("""">"""),_display_(/*194.101*/category/*194.109*/.name),format.raw/*194.114*/("""</a> <span class="subDropdown plus"></span>
                                        <ul class="level0_455">
                                        """),_display_(/*196.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*196.110*/ {_display_(Seq[Any](format.raw/*196.112*/("""
                                            """),format.raw/*197.45*/("""<li> <a href=""""),_display_(/*197.60*/routes/*197.66*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*197.112*/(""""> """),_display_(/*197.116*/subcategory/*197.127*/.name),format.raw/*197.132*/(""" """),format.raw/*197.133*/("""</a></li>
                                        """)))}),format.raw/*198.42*/("""
                                        """),format.raw/*199.41*/("""</ul>
                                            <!--level0-->
                                    </li>
                                """)))}),format.raw/*202.34*/("""
                                """),format.raw/*203.33*/("""</ul>
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
                                            <li> <a href=""""),_display_(/*216.60*/routes/*216.66*/.Items.getItemsWithPriceRange1()),format.raw/*216.98*/(""""><span class="price">do 99.00 KM</span></a> </li>
                                            <li> <a href=""""),_display_(/*217.60*/routes/*217.66*/.Items.getItemsWithPriceRange2()),format.raw/*217.98*/(""""><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*218.60*/routes/*218.66*/.Items.getItemsWithPriceRange3()),format.raw/*218.98*/(""""><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*219.60*/routes/*219.66*/.Items.getItemsWithPriceRange4()),format.raw/*219.98*/(""""><span class="price"> preko 200.00 KM</span></a>  </li>
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

    <script src='"""),_display_(/*235.19*/routes/*235.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*235.71*/("""'></script>

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
                  DATE: Fri Apr 22 13:42:58 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/categoryItems.scala.html
                  HASH: 0472a935502438a7e06f5071cc4a0a269d23f5c6
                  MATRIX: 780->1|904->30|931->32|942->36|980->38|1008->40|1141->188|1181->201|2087->1079|2103->1085|2178->1138|2219->1151|2235->1157|2310->1210|4468->3340|4484->3346|4548->3388|4589->3401|4605->3407|4680->3460|6833->5585|6849->5591|6913->5633|6954->5646|6970->5652|7034->5694|9187->7819|9203->7825|9267->7867|9308->7880|9324->7886|9388->7928|11649->10178|11706->10229|11764->10357|11821->10432|11878->10519|11935->10607|11992->10673|12049->10712|12106->10751|12163->10801|12220->10847|12277->10898|12335->11026|12392->11101|12449->11189|12506->11267|12563->11364|12620->11403|12677->11442|12734->11492|12791->11538|12848->11589|12906->11717|12963->11792|13020->11880|13077->11958|13134->12055|13191->12094|13248->12133|13305->12183|13359->12209|13471->12303|13508->12313|14463->13240|14498->13258|14539->13260|14601->13293|14840->13504|14876->13530|14916->13531|14990->13576|15080->13637|15095->13641|15123->13646|15161->13655|15178->13661|15227->13687|15294->13725|15311->13731|15383->13780|15655->14032|15669->14036|15709->14037|15783->14082|15873->14143|15888->14147|15916->14152|15954->14161|15971->14167|16020->14193|16087->14231|16104->14237|16166->14276|16453->14531|16524->14573|16802->14822|16819->14828|16868->14854|16901->14858|16916->14862|16944->14867|16975->14868|17302->15167|17339->15194|17380->15196|17474->15261|17759->15514|17849->15576|17886->15603|17927->15605|18021->15670|18306->15923|18396->15985|18433->16012|18474->16014|18568->16079|18853->16332|18943->16394|18980->16421|19021->16423|19115->16488|19400->16741|19490->16803|19527->16830|19568->16832|19662->16897|19947->17150|20037->17212|20074->17239|20115->17241|20209->17306|20494->17559|20581->17617|20641->17649|20657->17655|20708->17683|20739->17684|21109->18025|21124->18029|21153->18035|21184->18036|21564->18384|21622->18413|22333->19096|22402->19148|22443->19150|22509->19187|22552->19202|22568->19208|22630->19248|22662->19251|22681->19259|22709->19264|22886->19413|22972->19481|23014->19483|23088->19528|23131->19543|23147->19549|23216->19595|23249->19599|23271->19610|23299->19615|23330->19616|23413->19667|23483->19708|23654->19847|23716->19880|24379->20515|24395->20521|24449->20553|24587->20663|24603->20669|24657->20701|24835->20851|24851->20857|24905->20889|25083->21039|25099->21045|25153->21077|25676->21572|25692->21578|25760->21624
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|37->6|38->7|47->16|47->16|47->16|47->16|47->16|47->16|55->24|55->24|55->24|55->24|55->24|55->24|63->32|63->32|63->32|63->32|63->32|63->32|71->40|71->40|71->40|71->40|71->40|71->40|84->53|85->54|86->55|87->56|88->57|89->58|90->59|91->60|92->61|93->62|94->63|95->64|96->65|97->66|98->67|99->68|100->69|101->70|102->71|103->72|104->73|105->74|106->75|107->76|108->77|109->78|110->79|111->80|112->81|113->82|115->84|119->88|121->90|143->112|143->112|143->112|144->113|148->117|148->117|148->117|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|152->121|152->121|152->121|153->122|153->122|153->122|153->122|153->122|153->122|153->122|153->122|153->122|153->122|156->125|158->127|161->130|161->130|161->130|161->130|161->130|161->130|161->130|165->134|165->134|165->134|166->135|169->138|170->139|170->139|170->139|171->140|174->143|175->144|175->144|175->144|176->145|179->148|180->149|180->149|180->149|181->150|184->153|185->154|185->154|185->154|186->155|189->158|190->159|190->159|190->159|191->160|194->163|196->165|196->165|196->165|196->165|196->165|201->170|201->170|201->170|201->170|209->178|210->179|224->193|224->193|224->193|225->194|225->194|225->194|225->194|225->194|225->194|225->194|227->196|227->196|227->196|228->197|228->197|228->197|228->197|228->197|228->197|228->197|228->197|229->198|230->199|233->202|234->203|247->216|247->216|247->216|248->217|248->217|248->217|249->218|249->218|249->218|250->219|250->219|250->219|266->235|266->235|266->235
                  -- GENERATED --
              */
          