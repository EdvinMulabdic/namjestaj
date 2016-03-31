
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

                            <div id="sort-by">
                                <label class="left">Sort By: </label>
                                <ul>
                                    <li><a href="#">Position<span class="right-arrow"></span></a>
                                        <ul>
                                            <li><a href="#">Name</a></li>
                                            <li><a href="#">Price</a></li>
                                            <li><a href="#">Position</a></li>
                                        </ul>
                                    </li>
                                </ul>
                                <a class="button-asc left" href="#" title="Set Descending Direction"><span class="top_arrow"></span></a> </div>
                            <div class="pager">
                                <div id="limiter">
                                    <label>View: </label>
                                    <ul>
                                        <li><a href="#">15<span class="right-arrow"></span></a>
                                            <ul>
                                                <li><a href="#">20</a></li>
                                                <li><a href="#">30</a></li>
                                                <li><a href="#">35</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                                <div class="pages">
                                    <label>Page:</label>
                                    <ul class="pagination">
                                        <li><a href="#">&laquo;</a></li>
                                        <li class="active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">&raquo;</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="category-products">
                            <ul class="products-grid">
                                """),_display_(/*97.34*/for(item <- items) yield /*97.52*/ {_display_(Seq[Any](format.raw/*97.54*/("""
                                    """),format.raw/*98.37*/("""<li class="item col-lg-4 col-md-3 col-sm-4 col-xs-6">
                                        <div class="item-inner">

                                            <div class="item-img">
                                                """),_display_(/*102.50*/if(item.images.size() > 0)/*102.76*/{_display_(Seq[Any](format.raw/*102.77*/("""
                                                    """),format.raw/*103.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*103.114*/item/*103.118*/.name),format.raw/*103.123*/("""" href=""""),_display_(/*103.132*/routes/*103.138*/.Items.itemRender(item.id)),format.raw/*103.164*/(""""> <img alt="Retis lapen casen" src='"""),_display_(/*103.202*/models/*103.208*/.Item.getFirstItemImage(item.id).getSize(179,217)),format.raw/*103.257*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}/*106.50*/else/*106.54*/{_display_(Seq[Any](format.raw/*106.55*/("""
                                                    """),format.raw/*107.53*/("""<div class="item-img-info"> <a class="product-image" title=""""),_display_(/*107.114*/item/*107.118*/.name),format.raw/*107.123*/("""" href='"""),_display_(/*107.132*/routes/*107.138*/.Items.itemRender(item.id)),format.raw/*107.164*/("""'> <img alt="Retis lapen casen" src='"""),_display_(/*107.202*/routes/*107.208*/.Assets.versioned("images/product.png")),format.raw/*107.247*/("""'> </a>
                                                        <div class="new-label new-top-left">new</div>
                                                        <a class="quickview-btn" ><span>Quick View</span></a> </div>
                                                """)))}),format.raw/*110.50*/("""

                                            """),format.raw/*112.45*/("""</div>
                                            <div class="item-info">
                                                <div class="info-inner">
                                                    <div class="item-title"> <a title="Retis lapen casen" href=""""),_display_(/*115.114*/routes/*115.120*/.Items.itemRender(item.id)),format.raw/*115.146*/(""""> """),_display_(/*115.150*/item/*115.154*/.name),format.raw/*115.159*/(""" """),format.raw/*115.160*/("""</a> </div>
                                                    <div class="item-content">
                                                        """),format.raw/*117.81*/("""
                                                            """),format.raw/*118.86*/("""
                                                                """),format.raw/*119.93*/("""
                                                                    """),format.raw/*120.99*/("""
                                                                """),format.raw/*121.75*/("""
                                                                """),format.raw/*122.186*/("""
                                                            """),format.raw/*123.71*/("""
                                                        """),format.raw/*124.67*/("""
                                                        """),format.raw/*125.57*/("""<div class="item-price">
                                                            <div class="price-box"> <span class="regular-price"> <span class="price">"""),_display_(/*126.135*/item/*126.139*/.price),format.raw/*126.145*/(""" """),format.raw/*126.146*/("""KM</span> </span> </div>
                                                        </div>
                                                        """),format.raw/*128.156*/("""
                                                            """),format.raw/*129.87*/("""
                                                                """),format.raw/*130.148*/("""
                                                            """),format.raw/*131.71*/("""
                                                            """),format.raw/*132.136*/("""
                                                        """),format.raw/*133.67*/("""
                                                    """),format.raw/*134.53*/("""</div>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                """)))}),format.raw/*139.34*/("""
                            """),format.raw/*140.29*/("""</ul>
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
                                    """),_display_(/*154.38*/for(category <- models.Category.findAllCategories()) yield /*154.90*/ {_display_(Seq[Any](format.raw/*154.92*/("""
                                        """),format.raw/*155.41*/("""<li> <a href=""""),_display_(/*155.56*/routes/*155.62*/.Items.getItemsWithCategory(category.id)),format.raw/*155.102*/("""">"""),_display_(/*155.105*/category/*155.113*/.name),format.raw/*155.118*/("""</a> <span class="subDropdown plus"></span>
                                            <ul class="level0_455">
                                                """),_display_(/*157.50*/for(subcategory <- models.SubCategory.allSubCategories(category.id)) yield /*157.118*/ {_display_(Seq[Any](format.raw/*157.120*/("""
                                                    """),format.raw/*158.53*/("""<li> <a href=""""),_display_(/*158.68*/routes/*158.74*/.Items.getItemsWithSubCategory(subcategory.id)),format.raw/*158.120*/(""""> """),_display_(/*158.124*/subcategory/*158.135*/.name),format.raw/*158.140*/(""" """),format.raw/*158.141*/("""</a></li>
                                                """)))}),format.raw/*159.50*/("""
                                            """),format.raw/*160.45*/("""</ul>
                                                <!--level0-->
                                        </li>
                                    """)))}),format.raw/*163.38*/("""
                                """),format.raw/*164.33*/("""</ul>
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
                                            <li> <a href="#"><span class="price">0.00 KM</span> - <span class="price"> 99.00 KM</span></a> </li>
                                            <li> <a href="#"><span class="price"> 100.00 KM</span> - <span class="price"> 149.00 KM</span></a>  </li>
                                            <li> <a href="#"><span class="price"> 150.00 KM</span> - <span class="price"> 199.00 KM</span></a>  </li>
                                            <li> <a href="#"><span class="price"> preko 200.00 KM</span></a>  </li>
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
                  DATE: Thu Mar 31 01:00:08 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/categoryItems.scala.html
                  HASH: 330bf3a76f6c7083a6c0487ee25d74331760e633
                  MATRIX: 780->1|904->30|931->32|942->36|980->38|1008->40|1578->583|1593->589|1668->642|2277->1224|2292->1230|2367->1283|2998->1887|3013->1893|3088->1946|6600->5431|6634->5449|6674->5451|6739->5488|7003->5724|7039->5750|7079->5751|7161->5804|7251->5865|7266->5869|7294->5874|7332->5883|7349->5889|7398->5915|7465->5953|7482->5959|7554->6008|7850->6284|7864->6288|7904->6289|7986->6342|8076->6403|8091->6407|8119->6412|8157->6421|8174->6427|8223->6453|8290->6491|8307->6497|8369->6536|8677->6812|8752->6858|9042->7119|9059->7125|9108->7151|9141->7155|9156->7159|9184->7164|9215->7165|9391->7336|9481->7422|9575->7515|9673->7614|9767->7689|9862->7875|9952->7946|10038->8013|10124->8070|10312->8229|10327->8233|10356->8239|10387->8240|10561->8483|10651->8570|10746->8718|10836->8789|10927->8925|11013->8992|11095->9045|11362->9280|11420->9309|12135->9996|12204->10048|12245->10050|12315->10091|12358->10106|12374->10112|12437->10152|12469->10155|12488->10163|12516->10168|12705->10329|12791->10397|12833->10399|12915->10452|12958->10467|12974->10473|13043->10519|13076->10523|13098->10534|13126->10539|13157->10540|13248->10599|13322->10644|13505->10795|13567->10828
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|44->13|44->13|44->13|53->22|53->22|53->22|62->31|62->31|62->31|128->97|128->97|128->97|129->98|133->102|133->102|133->102|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|137->106|137->106|137->106|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|141->110|143->112|146->115|146->115|146->115|146->115|146->115|146->115|146->115|148->117|149->118|150->119|151->120|152->121|153->122|154->123|155->124|156->125|157->126|157->126|157->126|157->126|159->128|160->129|161->130|162->131|163->132|164->133|165->134|170->139|171->140|185->154|185->154|185->154|186->155|186->155|186->155|186->155|186->155|186->155|186->155|188->157|188->157|188->157|189->158|189->158|189->158|189->158|189->158|189->158|189->158|189->158|190->159|191->160|194->163|195->164
                  -- GENERATED --
              */
          