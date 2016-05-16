
package views.html.news

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object news_Scope0 {
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

class news extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[News,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(news: News):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div style="background-image:url("""),_display_(/*3.39*/news/*3.43*/.images.get(0).getSize(1600,600)),format.raw/*3.75*/(""")">
        <!-- Main Container -->
        <section class="main-container col2-right-layout bounceInUp animated">
            <div class="main container"  style="background-color: white">
                <div class="row">
                    <div class="col-main col-sm-9">
                        <div class="blog-wrapper" id="main">
                            <div class="site-content" id="primary">
                                <div role="main" id="content">

                                    <article class="blog_entry clearfix">
                                        <header class="blog_entry-header clearfix">
                                            <div class="blog_entry-header-inner">
                                                <h2 class="blog_entry-title">"""),_display_(/*16.79*/news/*16.83*/.title),format.raw/*16.89*/(""" """),format.raw/*16.90*/("""</h2>
                                            </div>
                                                <!--blog_entry-header-inner-->
                                        </header>
                                        <div class="entry-content">
                                            <div class="entry-content">
                                                <p>"""),_display_(/*22.53*/news/*22.57*/.text),format.raw/*22.62*/("""</p>
                                            </div>

                                        </div>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>

                    <aside class="col-right sidebar col-sm-3">
                        <div role="complementary" class="widget_wrapper13" id="secondary">
                                <!-- Banner Ad Block -->
                            <div class="ad-spots widget widget__sidebar">
                                <a target="_self" href="#" title=""><img alt="offer banner" src='"""),_display_(/*36.99*/routes/*36.105*/.Assets.versioned("images/block1.jpg")),format.raw/*36.143*/("""' style="width : 280px;"></a>
                                <a target="_self" href="#" title=""><img alt="offer banner" src='"""),_display_(/*37.99*/routes/*37.105*/.Assets.versioned("images/block1.jpg")),format.raw/*37.143*/("""' style="width : 280px;"></a>
                            </div>
                                <!-- Banner Text Block -->
                            <div class="text-widget widget widget__sidebar">
                                <h3 class="widget-title">Text Banner</h3>
                                <div class="widget-content">Mauris at blandit erat. Nam vel tortor non quam scelerisque cursus. Praesent nunc vitae magna pellentesque auctor. Quisque id lectus.<br>
                                    <br>
                                    Massa, eget eleifend tellus. Proin nec ante leo ssim nunc sit amet velit malesuada pharetra. Nulla neque sapien, sollicitudin non ornare quis, malesuada.</div>
                            </div>
                        </div>
                    </aside>

                </div>
            </div>
        </section>
        <!-- Main Container End -->
    </div>
""")))}),format.raw/*54.2*/("""
"""))
      }
    }
  }

  def render(news:News): play.twirl.api.HtmlFormat.Appendable = apply(news)

  def f:((News) => play.twirl.api.HtmlFormat.Appendable) = (news) => apply(news)

  def ref: this.type = this

}


}

/**/
object news extends news_Scope0.news
              /*
                  -- GENERATED --
                  DATE: Fri May 13 17:14:19 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/news.scala.html
                  HASH: 091b417f234b87aff31aef4e783eebdaa2338d52
                  MATRIX: 746->1|853->13|881->16|892->20|930->22|962->28|1022->62|1034->66|1086->98|1912->897|1925->901|1952->907|1981->908|2392->1292|2405->1296|2431->1301|3139->1982|3155->1988|3215->2026|3371->2155|3387->2161|3447->2199|4409->3131
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|47->16|47->16|47->16|47->16|53->22|53->22|53->22|67->36|67->36|67->36|68->37|68->37|68->37|85->54
                  -- GENERATED --
              */
          