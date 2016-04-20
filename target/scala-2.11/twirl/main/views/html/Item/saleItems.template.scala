
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
                                                    <div class="item-price">
                                                        <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*89.131*/item/*89.135*/.price),format.raw/*89.141*/(""" """),format.raw/*89.142*/("""KM</span> </span> </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            """)))}),format.raw/*96.30*/("""
                            """),format.raw/*97.29*/("""</ul>
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
                                """),_display_(/*111.34*/for(category <- models.Category.findAllCategories()) yield /*111.86*/ {_display_(Seq[Any](format.raw/*111.88*/("""
                                    """),format.raw/*112.37*/("""<li> <a href=""""),_display_(/*112.52*/routes/*112.58*/.Items.getItemsWithCategory(category.id)),format.raw/*112.98*/("""">"""),_display_(/*112.101*/category/*112.109*/.name),format.raw/*112.114*/("""</a> <span class="subDropdown plus"></span>
                                        <ul class="level0_455">
                                        """),_display_(/*114.42*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*114.110*/ {_display_(Seq[Any](format.raw/*114.112*/("""
                                            """),format.raw/*115.45*/("""<li> <a href=""""),_display_(/*115.60*/routes/*115.66*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*115.112*/(""""> """),_display_(/*115.116*/subcategory/*115.127*/.name),format.raw/*115.132*/(""" """),format.raw/*115.133*/("""</a></li>
                                        """)))}),format.raw/*116.42*/("""
                                        """),format.raw/*117.41*/("""</ul>
                                            <!--level0-->
                                    </li>
                                """)))}),format.raw/*120.34*/("""
                                """),format.raw/*121.33*/("""</ul>
                            </div>
                                <!--box-content box-category-->
                        </div>


                        <div class="block block-layered-nav">
                            <div class="block-title">Pretraga po cijeni</div>
                            <div class="block-content">
                                <p class="block-subtitle">Odaberite �eljeni raspon</p>
                                <dl id="narrow-by-list">
                                    <dd class="odd">
                                        <ol>
                                            <li> <a href=""""),_display_(/*134.60*/routes/*134.66*/.Items.getItemsWithPriceRange1()),format.raw/*134.98*/(""""><span class="price">do 99.00 KM</span></a> </li>
                                            <li> <a href=""""),_display_(/*135.60*/routes/*135.66*/.Items.getItemsWithPriceRange2()),format.raw/*135.98*/(""""><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*136.60*/routes/*136.66*/.Items.getItemsWithPriceRange3()),format.raw/*136.98*/(""""><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href=""""),_display_(/*137.60*/routes/*137.66*/.Items.getItemsWithPriceRange4()),format.raw/*137.98*/(""""><span class="price"> preko 200.00 KM</span></a>  </li>
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

    <script src='"""),_display_(/*153.19*/routes/*153.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*153.71*/("""'></script>

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
                  DATE: Tue Apr 19 14:43:57 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/saleItems.scala.html
                  HASH: ad0ac6ee4f57a87bef3f76bb7ef012abf8dcc4e9
                  MATRIX: 772->1|896->30|924->33|935->37|973->39|1007->47|1586->599|1601->605|1676->658|2294->1249|2309->1255|2384->1308|3024->1921|3039->1927|3114->1980|4711->3550|4745->3568|4785->3570|4847->3604|5089->3819|5124->3845|5163->3846|5237->3892|5326->3953|5340->3957|5367->3962|5404->3971|5420->3977|5468->4003|5534->4041|5550->4047|5621->4096|5895->4351|5908->4355|5947->4356|6021->4402|6110->4463|6124->4467|6151->4472|6188->4481|6204->4487|6252->4513|6318->4551|6334->4557|6395->4596|6684->4854|6756->4898|7036->5150|7052->5156|7100->5182|7132->5186|7146->5190|7173->5195|7203->5196|7528->5493|7542->5497|7570->5503|7600->5504|7985->5858|8043->5888|8768->6585|8837->6637|8878->6639|8945->6677|8988->6692|9004->6698|9066->6738|9098->6741|9117->6749|9145->6754|9324->6905|9410->6973|9452->6975|9527->7021|9570->7036|9586->7042|9655->7088|9688->7092|9710->7103|9738->7108|9769->7109|9853->7161|9924->7203|10098->7345|10161->7379|10837->8027|10853->8033|10907->8065|11046->8176|11062->8182|11116->8214|11295->8365|11311->8371|11365->8403|11544->8554|11560->8560|11614->8592|12153->9103|12169->9109|12237->9155
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|44->13|44->13|44->13|53->22|53->22|53->22|62->31|62->31|62->31|99->68|99->68|99->68|100->69|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|112->81|114->83|117->86|117->86|117->86|117->86|117->86|117->86|117->86|120->89|120->89|120->89|120->89|127->96|128->97|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|143->112|145->114|145->114|145->114|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|147->116|148->117|151->120|152->121|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|184->153|184->153|184->153
                  -- GENERATED --
              */
          