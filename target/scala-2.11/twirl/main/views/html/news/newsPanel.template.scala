
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

class newsPanel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[News],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(news: java.util.List[News]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""
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
                            <ol class="products-list" id="products-list">
                                """),_display_(/*31.34*/for(n <- news) yield /*31.48*/ {_display_(Seq[Any](format.raw/*31.50*/("""
                                    """),format.raw/*32.37*/("""<li class="item first">
                                        <div class="product-image"><img class="small-image" src='"""),_display_(/*33.99*/n/*33.100*/.images.get(0).getSize(285,200)),format.raw/*33.131*/("""' alt="Vijesti"></div>
                                        <div class="product-shop">
                                            <h2 class="product-name"><a href="product_detail.html" title="Naslov">"""),_display_(/*35.116*/n/*35.117*/.title),format.raw/*35.123*/("""</a></h2>
                                            <div class="desc std">
                                                <p>"""),_display_(/*37.53*/n/*37.54*/.text.substring(0,500)),format.raw/*37.76*/(""" """),format.raw/*37.77*/("""... </p>
                                            </div>
                                            <form method="GET" role="form" action=""""),_display_(/*39.85*/routes/*39.91*/.NewsController.newsRender(n.id)),format.raw/*39.123*/("""">
                                                <div class="actions">
                                                    <button class="button" title="Pročitaj"><i class="fa fa-eye"></i> <span>Pročitaj</span></button>
                                                        """),_display_(/*42.58*/if(n.user.userAccessLevel.equals(UserAccessLevel.ADMIN))/*42.114*/ {_display_(Seq[Any](format.raw/*42.116*/("""
                                                            """),format.raw/*43.61*/("""<span class="add-to-links">
                                                                <a title="Uredi" class="button link-wishlist" href=""""),_display_(/*44.118*/routes/*44.124*/.NewsController.updateNewsRender(n.id)),format.raw/*44.162*/("""">
                                                                    <i class="fa fa-pencil"></i> <span>
                                                                    Uredi
                                                                </span>
                                                                </a>
                                                                <a title="Obriši" class="button link-compare" href=""""),_display_(/*49.118*/routes/*49.124*/.NewsController.deleteNews(n.id)),format.raw/*49.156*/("""">
                                                                    <i class="fa fa-trash-o"></i> <span>
                                                                    Obriši
                                                                </span>
                                                                </a>
                                                            </span>
                                                        """)))}),format.raw/*55.58*/("""
                                                """),format.raw/*56.49*/("""</div>
                                            </form>
                                        </div>
                                    </li>
                                """)))}),format.raw/*60.34*/("""
                            """),format.raw/*61.29*/("""</ol>
                        </div>
                    </article>
                        <!--	///*///======    End article  ========= //*/// -->
                </div>
            </div>
        </div>
    </section>

    <!-- Main Container End -->
""")))}))
      }
    }
  }

  def render(news:java.util.List[News]): play.twirl.api.HtmlFormat.Appendable = apply(news)

  def f:((java.util.List[News]) => play.twirl.api.HtmlFormat.Appendable) = (news) => apply(news)

  def ref: this.type = this

}


}
}

/**/
object newsPanel extends newsPanel_Scope0.newsPanel_Scope1.newsPanel
              /*
                  -- GENERATED --
                  DATE: Thu Apr 21 09:41:35 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/newsPanel.scala.html
                  HASH: 15acc2d354c30273f0a9bff6c9dc1667956d0ec3
                  MATRIX: 835->33|958->61|985->63|996->67|1034->69|1065->74|2542->1524|2572->1538|2612->1540|2677->1577|2826->1699|2837->1700|2890->1731|3123->1936|3134->1937|3162->1943|3318->2072|3328->2073|3371->2095|3400->2096|3571->2240|3586->2246|3640->2278|3946->2557|4012->2613|4053->2615|4142->2676|4315->2821|4331->2827|4391->2865|4858->3304|4874->3310|4928->3342|5408->3791|5485->3840|5697->4021|5754->4050
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|64->31|64->31|64->31|65->32|66->33|66->33|66->33|68->35|68->35|68->35|70->37|70->37|70->37|70->37|72->39|72->39|72->39|75->42|75->42|75->42|76->43|77->44|77->44|77->44|82->49|82->49|82->49|88->55|89->56|93->60|94->61
                  -- GENERATED --
              */
          