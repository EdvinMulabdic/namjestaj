
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
                            """),_display_(/*54.30*/for(item <- items) yield /*54.48*/ {_display_(Seq[Any](format.raw/*54.50*/("""
                                """),format.raw/*55.33*/("""<li class="item col-md-3 col-sm-4 col-xs-6">
                                    <div class="item-inner">

                                        <div class="item-img">
                                        """),_display_(/*59.42*/if(item.images.size() > 0)/*59.68*/{_display_(Seq[Any](format.raw/*59.69*/("""
                                            """),format.raw/*60.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*60.106*/item/*60.110*/.name),format.raw/*60.115*/("""" href=""""),_display_(/*60.124*/routes/*60.130*/.Items.itemRender(item.id)),format.raw/*60.156*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*60.194*/models/*60.200*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*60.249*/("""'> </a>
                                                <div class="new-label new-top-left">new</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}/*63.42*/else/*63.46*/{_display_(Seq[Any](format.raw/*63.47*/("""
                                            """),format.raw/*64.45*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*64.106*/item/*64.110*/.name),format.raw/*64.115*/("""" href='"""),_display_(/*64.124*/routes/*64.130*/.Items.itemRender(item.id)),format.raw/*64.156*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*64.194*/routes/*64.200*/.Assets.versioned("images/product.png")),format.raw/*64.239*/("""'> </a>
                                                <div class="new-label new-top-left">AKCIJA</div>
                                                <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                        """)))}),format.raw/*67.42*/("""

                                        """),format.raw/*69.41*/("""</div>
                                        <div class="item-info">
                                            <div class="info-inner">
                                                <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*72.110*/routes/*72.116*/.Items.itemRender(item.id)),format.raw/*72.142*/(""""> """),_display_(/*72.146*/item/*72.150*/.name),format.raw/*72.155*/(""" """),format.raw/*72.156*/("""</a> </div>
                                                <div class="item-content">
                                                    <div class="rating">
                                                        <div class="ratings">
                                                            """),_display_(/*76.62*/if(item.average_Grade == 1)/*76.89*/ {_display_(Seq[Any](format.raw/*76.91*/("""
                                                                """),format.raw/*77.65*/("""<div class="rating-box">
                                                                    <div class="rating1"></div>
                                                                </div>
                                                            """)))}),format.raw/*80.62*/("""
                                                            """),_display_(/*81.62*/if(item.average_Grade == 2)/*81.89*/ {_display_(Seq[Any](format.raw/*81.91*/("""
                                                                """),format.raw/*82.65*/("""<div class="rating-box">
                                                                    <div class="rating2"></div>
                                                                </div>
                                                            """)))}),format.raw/*85.62*/("""
                                                            """),_display_(/*86.62*/if(item.average_Grade == 3)/*86.89*/ {_display_(Seq[Any](format.raw/*86.91*/("""
                                                                """),format.raw/*87.65*/("""<div class="rating-box">
                                                                    <div class="rating3"></div>
                                                                </div>
                                                            """)))}),format.raw/*90.62*/("""
                                                            """),_display_(/*91.62*/if(item.average_Grade == 4)/*91.89*/ {_display_(Seq[Any](format.raw/*91.91*/("""
                                                                """),format.raw/*92.65*/("""<div class="rating-box">
                                                                    <div class="rating4"></div>
                                                                </div>
                                                            """)))}),format.raw/*95.62*/("""
                                                            """),_display_(/*96.62*/if(item.average_Grade == 5)/*96.89*/ {_display_(Seq[Any](format.raw/*96.91*/("""
                                                                """),format.raw/*97.65*/("""<div class="rating-box">
                                                                    <div class="rating5"></div>
                                                                </div>
                                                            """)))}),format.raw/*100.62*/("""
                                                            """),_display_(/*101.62*/if(item.average_Grade == 0)/*101.89*/ {_display_(Seq[Any](format.raw/*101.91*/("""
                                                                """),format.raw/*102.65*/("""<div class="rating-box">
                                                                    <div class="rating0"></div>
                                                                </div>
                                                            """)))}),format.raw/*105.62*/("""

                                                        """),format.raw/*107.57*/("""<p class="rating-links">Ukupno """),_display_(/*107.89*/Review/*107.95*/.getNumberOfReviews(item.id)),format.raw/*107.123*/(""" """),format.raw/*107.124*/("""ocjena</p>

                                                        </div>
                                                    </div>
                                                    <div class="item-price">
                                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*112.131*/item/*112.135*/.price),format.raw/*112.141*/(""" """),format.raw/*112.142*/("""KM</span> </span> </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            """)))}),format.raw/*120.30*/("""
                            """),format.raw/*121.29*/("""</ul>
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
                                """),_display_(/*135.34*/for(category <- models.Category.findAllCategories()) yield /*135.86*/ {_display_(Seq[Any](format.raw/*135.88*/("""
                                    """),format.raw/*136.37*/("""<li> <a href=""""),_display_(/*136.52*/routes/*136.58*/.Items.getItemsWithCategory(category.id)),format.raw/*136.98*/("""">"""),_display_(/*136.101*/category/*136.109*/.name),format.raw/*136.114*/("""</a> <span class="subDropdown plus"></span>
                                        <ul class="level0_455">
                                        """),_display_(/*138.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*138.110*/ {_display_(Seq[Any](format.raw/*138.112*/("""
                                            """),format.raw/*139.45*/("""<li> <a href=""""),_display_(/*139.60*/routes/*139.66*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*139.112*/(""""> """),_display_(/*139.116*/subcategory/*139.127*/.name),format.raw/*139.132*/(""" """),format.raw/*139.133*/("""</a></li>
                                        """)))}),format.raw/*140.42*/("""
                                        """),format.raw/*141.41*/("""</ul>
                                            <!--level0-->
                                    </li>
                                """)))}),format.raw/*144.34*/("""
                                """),format.raw/*145.33*/("""</ul>
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
                                            <li> <a href=""""),_display_(/*158.60*/routes/*158.66*/.Items.getItemsWithPriceRange1()),format.raw/*158.98*/(""""><span class="price">do 99.00 KM</span></a> </li>
                                            <li> <a href=""""),_display_(/*159.60*/routes/*159.66*/.Items.getItemsWithPriceRange2()),format.raw/*159.98*/(""""><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*160.60*/routes/*160.66*/.Items.getItemsWithPriceRange3()),format.raw/*160.98*/(""""><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*161.60*/routes/*161.66*/.Items.getItemsWithPriceRange4()),format.raw/*161.98*/(""""><span class="price"> preko 200.00 KM</span></a>  </li>
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

    <script src='"""),_display_(/*177.19*/routes/*177.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*177.71*/("""'></script>
    <style>
        .bx-pager"""),format.raw/*179.18*/("""{"""),format.raw/*179.19*/("""
            """),format.raw/*180.13*/("""display: none;
            padding-top: 0px;
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/("""
    """),format.raw/*183.5*/("""</style>

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
                  DATE: Tue Apr 26 00:04:02 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/categoryItems.scala.html
                  HASH: 14fbbe68f57333c2424fb60e77e862e927051f67
                  MATRIX: 780->1|904->30|931->32|942->36|980->38|1008->40|1738->743|1753->749|1828->802|2011->958|2026->964|2101->1017|2284->1173|2299->1179|2374->1232|3603->2434|3637->2452|3677->2454|3738->2487|3976->2698|4011->2724|4050->2725|4123->2770|4212->2831|4226->2835|4253->2840|4290->2849|4306->2855|4354->2881|4420->2919|4436->2925|4507->2974|4778->3226|4791->3230|4830->3231|4903->3276|4992->3337|5006->3341|5033->3346|5070->3355|5086->3361|5134->3387|5200->3425|5216->3431|5277->3470|5563->3725|5633->3767|5910->4016|5926->4022|5974->4048|6006->4052|6020->4056|6047->4061|6077->4062|6403->4361|6439->4388|6479->4390|6572->4455|6856->4708|6945->4770|6981->4797|7021->4799|7114->4864|7398->5117|7487->5179|7523->5206|7563->5208|7656->5273|7940->5526|8029->5588|8065->5615|8105->5617|8198->5682|8482->5935|8571->5997|8607->6024|8647->6026|8740->6091|9025->6344|9115->6406|9152->6433|9193->6435|9287->6500|9572->6753|9659->6811|9719->6843|9735->6849|9786->6877|9817->6878|10187->7219|10202->7223|10231->7229|10262->7230|10642->7578|10700->7607|11411->8290|11480->8342|11521->8344|11587->8381|11630->8396|11646->8402|11708->8442|11740->8445|11759->8453|11787->8458|11964->8607|12050->8675|12092->8677|12166->8722|12209->8737|12225->8743|12294->8789|12327->8793|12349->8804|12377->8809|12408->8810|12491->8861|12561->8902|12732->9041|12794->9074|13457->9709|13473->9715|13527->9747|13665->9857|13681->9863|13735->9895|13913->10045|13929->10051|13983->10083|14161->10233|14177->10239|14231->10271|14754->10766|14770->10772|14838->10818|14908->10859|14938->10860|14980->10873|15061->10926|15091->10927|15124->10932
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|46->15|46->15|46->15|49->18|49->18|49->18|52->21|52->21|52->21|85->54|85->54|85->54|86->55|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|98->67|100->69|103->72|103->72|103->72|103->72|103->72|103->72|103->72|107->76|107->76|107->76|108->77|111->80|112->81|112->81|112->81|113->82|116->85|117->86|117->86|117->86|118->87|121->90|122->91|122->91|122->91|123->92|126->95|127->96|127->96|127->96|128->97|131->100|132->101|132->101|132->101|133->102|136->105|138->107|138->107|138->107|138->107|138->107|143->112|143->112|143->112|143->112|151->120|152->121|166->135|166->135|166->135|167->136|167->136|167->136|167->136|167->136|167->136|167->136|169->138|169->138|169->138|170->139|170->139|170->139|170->139|170->139|170->139|170->139|170->139|171->140|172->141|175->144|176->145|189->158|189->158|189->158|190->159|190->159|190->159|191->160|191->160|191->160|192->161|192->161|192->161|208->177|208->177|208->177|210->179|210->179|211->180|213->182|213->182|214->183
                  -- GENERATED --
              */
          