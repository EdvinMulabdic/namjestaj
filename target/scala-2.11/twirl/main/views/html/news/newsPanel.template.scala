
package views.html.news

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newsPanel_Scope0 {
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

     object newsPanel_Scope1 {
import helpers.UserAccessLevel

class newsPanel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[News],AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(news: java.util.List[News])(currentUser: AppUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.52*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    """),format.raw/*4.5*/("""<!-- Main Container -->
    <section class="main-container col2-left-layout bounceInUp animated">
        <div class="container">
            <div class="row">
                <div class="col-main col-md-12">
                    <article class="col-main">
                        <div class="page-title">
                            <h2>Vijesti</h2>
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
                            <ol class="products-list" id="easyPaginate">
                                """),_display_(/*24.34*/for(n <- news) yield /*24.48*/ {_display_(Seq[Any](format.raw/*24.50*/("""
                                    """),format.raw/*25.37*/("""<li class="item first">
                                        <div class="product-image"><img class="small-image" src='"""),_display_(/*26.99*/n/*26.100*/.images.get(0).getSize(285,200)),format.raw/*26.131*/("""' alt="Vijesti"></div>
                                        <div class="product-shop">
                                            <h2 class="product-name"><a href="product_detail.html" title="Naslov">"""),_display_(/*28.116*/n/*28.117*/.title),format.raw/*28.123*/("""</a></h2>
                                            <div class="desc std">
                                                <p>"""),_display_(/*30.53*/n/*30.54*/.text.substring(0,500)),format.raw/*30.76*/(""" """),format.raw/*30.77*/("""... </p>
                                            </div>
                                            <form method="GET" role="form" action=""""),_display_(/*32.85*/routes/*32.91*/.NewsController.newsRender(n.id)),format.raw/*32.123*/("""">
                                                <div class="actions">
                                                    <button class="button" title="Pročitaj"><i class="fa fa-eye"></i> <span>Pročitaj</span></button>
                                                        """),_display_(/*35.58*/if(currentUser != null && currentUser.userAccessLevel.equals(UserAccessLevel.ADMIN))/*35.142*/ {_display_(Seq[Any](format.raw/*35.144*/("""
                                                            """),format.raw/*36.61*/("""<span class="add-to-links">
                                                                <a title="Uredi" class="button link-wishlist" href=""""),_display_(/*37.118*/routes/*37.124*/.NewsController.updateNewsRender(n.id)),format.raw/*37.162*/("""">
                                                                    <i class="fa fa-pencil"></i> <span>
                                                                    Uredi
                                                                </span>
                                                                </a>
                                                                <a title="Obriši" class="button link-compare" href=""""),_display_(/*42.118*/routes/*42.124*/.NewsController.deleteNews(n.id)),format.raw/*42.156*/("""">
                                                                    <i class="fa fa-trash-o"></i> <span>
                                                                    Obriši
                                                                </span>
                                                                </a>
                                                            </span>
                                                        """)))}),format.raw/*48.58*/("""
                                                """),format.raw/*49.49*/("""</div>
                                            </form>
                                        </div>
                                    </li>
                                """)))}),format.raw/*53.34*/("""
                            """),format.raw/*54.29*/("""</ol>
                        </div>
                    </article>
                        <!--	///*///======    End article  ========= //*/// -->
                </div>
            </div>
        </div>
    </section>
    <input type='hidden' id='current_page' />
    <input type='hidden' id='show_per_page' />

    <script src='"""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*65.71*/("""'></script>
    <!-- Main Container End -->
""")))}))
      }
    }
  }

  def render(news:java.util.List[News],currentUser:AppUser): play.twirl.api.HtmlFormat.Appendable = apply(news)(currentUser)

  def f:((java.util.List[News]) => (AppUser) => play.twirl.api.HtmlFormat.Appendable) = (news) => (currentUser) => apply(news)(currentUser)

  def ref: this.type = this

}


}
}

/**/
object newsPanel extends newsPanel_Scope0.newsPanel_Scope1.newsPanel
              /*
                  -- GENERATED --
                  DATE: Fri May 13 17:14:19 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/newsPanel.scala.html
                  HASH: 23a70f26cc6406b197b61f54f41ce169e5077e36
                  MATRIX: 843->33|988->83|1015->85|1026->89|1064->91|1095->96|2117->1091|2147->1105|2187->1107|2252->1144|2401->1266|2412->1267|2465->1298|2698->1503|2709->1504|2737->1510|2893->1639|2903->1640|2946->1662|2975->1663|3146->1807|3161->1813|3215->1845|3521->2124|3615->2208|3656->2210|3745->2271|3918->2416|3934->2422|3994->2460|4461->2899|4477->2905|4531->2937|5011->3386|5088->3435|5300->3616|5357->3645|5716->3977|5731->3983|5798->4029
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|57->24|57->24|57->24|58->25|59->26|59->26|59->26|61->28|61->28|61->28|63->30|63->30|63->30|63->30|65->32|65->32|65->32|68->35|68->35|68->35|69->36|70->37|70->37|70->37|75->42|75->42|75->42|81->48|82->49|86->53|87->54|98->65|98->65|98->65
                  -- GENERATED --
              */
          