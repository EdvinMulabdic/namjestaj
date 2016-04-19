
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
                                """),_display_(/*68.34*/for(item <- items) yield /*68.52*/ {_display_(Seq[Any](format.raw/*68.54*/("""
                                    """),format.raw/*69.37*/("""<li class="item col-md-3 col-sm-4 col-xs-6">
                                        <div class="item-inner">

                                            <div class="item-img">
                                                """),_display_(/*73.50*/if(item.images.size() > 0)/*73.76*/{_display_(Seq[Any](format.raw/*73.77*/("""
                                                    """),format.raw/*74.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*74.114*/item/*74.118*/.name),format.raw/*74.123*/("""" href=""""),_display_(/*74.132*/routes/*74.138*/.Items.itemRender(item.id)),format.raw/*74.164*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*74.202*/models/*74.208*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*74.257*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}/*77.50*/else/*77.54*/{_display_(Seq[Any](format.raw/*77.55*/("""
                                                    """),format.raw/*78.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*78.114*/item/*78.118*/.name),format.raw/*78.123*/("""" href='"""),_display_(/*78.132*/routes/*78.138*/.Items.itemRender(item.id)),format.raw/*78.164*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*78.202*/routes/*78.208*/.Assets.versioned("images/product.png")),format.raw/*78.247*/("""'> </a>
                                                        <div class="new-label new-top-left">AKCIJA</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}),format.raw/*81.50*/("""

                                            """),format.raw/*83.45*/("""</div>
                                            <div class="item-info">
                                                <div class="info-inner">
                                                    <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*86.114*/routes/*86.120*/.Items.itemRender(item.id)),format.raw/*86.146*/(""""> """),_display_(/*86.150*/item/*86.154*/.name),format.raw/*86.159*/(""" """),format.raw/*86.160*/("""</a> </div>
                                                    <div class="item-content">
                                                        <div class="item-price">
                                                            <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*89.135*/item/*89.139*/.price),format.raw/*89.145*/(""" """),format.raw/*89.146*/("""KM</span> </span> </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                """)))}),format.raw/*96.34*/("""
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
                                    """),_display_(/*111.38*/for(category <- models.Category.findAllCategories()) yield /*111.90*/ {_display_(Seq[Any](format.raw/*111.92*/("""
                                        """),format.raw/*112.41*/("""<li> <a href=""""),_display_(/*112.56*/routes/*112.62*/.Items.getItemsWithCategory(category.id)),format.raw/*112.102*/("""">"""),_display_(/*112.105*/category/*112.113*/.name),format.raw/*112.118*/("""</a> <span class="subDropdown plus"></span>
                                            <ul class="level0_455">
                                                """),_display_(/*114.50*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*114.118*/ {_display_(Seq[Any](format.raw/*114.120*/("""
                                                    """),format.raw/*115.53*/("""<li> <a href=""""),_display_(/*115.68*/routes/*115.74*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*115.120*/(""""> """),_display_(/*115.124*/subcategory/*115.135*/.name),format.raw/*115.140*/(""" """),format.raw/*115.141*/("""</a></li>
                                                """)))}),format.raw/*116.50*/("""
                                            """),format.raw/*117.45*/("""</ul>
                                                <!--level0-->
                                        </li>
                                    """)))}),format.raw/*120.38*/("""
                                """),format.raw/*121.33*/("""</ul>
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
object categoryItems extends categoryItems_Scope0.categoryItems
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 11:18:35 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/categoryItems.scala.html
                  HASH: f82f599db47e0da70c08407d0ef4c04fc50f8786
                  MATRIX: 780->1|904->30|931->32|942->36|980->38|1008->40|1578->583|1593->589|1668->642|2277->1224|2292->1230|2367->1283|2998->1887|3013->1893|3088->1946|4672->3503|4706->3521|4746->3523|4811->3560|5065->3787|5100->3813|5139->3814|5220->3867|5309->3928|5323->3932|5350->3937|5387->3946|5403->3952|5451->3978|5517->4016|5533->4022|5604->4071|5899->4347|5912->4351|5951->4352|6032->4405|6121->4466|6135->4470|6162->4475|6199->4484|6215->4490|6263->4516|6329->4554|6345->4560|6406->4599|6716->4878|6790->4924|7079->5185|7095->5191|7143->5217|7175->5221|7189->5225|7216->5230|7246->5231|7580->5537|7594->5541|7622->5547|7652->5548|8058->5923|8115->5952|8830->6639|8899->6691|8940->6693|9010->6734|9053->6749|9069->6755|9132->6795|9164->6798|9183->6806|9211->6811|9400->6972|9486->7040|9528->7042|9610->7095|9653->7110|9669->7116|9738->7162|9771->7166|9793->7177|9821->7182|9852->7183|9943->7242|10017->7287|10200->7438|10262->7471|10925->8106|10941->8112|10995->8144|11133->8254|11149->8260|11203->8292|11381->8442|11397->8448|11451->8480|11629->8630|11645->8636|11699->8668|12222->9163|12238->9169|12306->9215
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|44->13|44->13|44->13|53->22|53->22|53->22|62->31|62->31|62->31|99->68|99->68|99->68|100->69|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|112->81|114->83|117->86|117->86|117->86|117->86|117->86|117->86|117->86|120->89|120->89|120->89|120->89|127->96|128->97|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|143->112|145->114|145->114|145->114|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|147->116|148->117|151->120|152->121|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|184->153|184->153|184->153
                  -- GENERATED --
              */
          