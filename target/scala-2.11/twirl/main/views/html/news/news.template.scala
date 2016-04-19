
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
    """),format.raw/*3.5*/("""<div style="background-image: """),_display_(/*3.36*/news/*3.40*/.images.get(0)),format.raw/*3.54*/("""">
        <!-- Main Container -->
        <section class="main-container col2-right-layout bounceInUp animated">
            <div class="main container">
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
                                        <footer class="entry-meta" style="background-color: white">Vrijeme objave vijesti <time datetime="2014-07-10T07:09:31+00:00" class="entry-date">"""),_display_(/*26.186*/news/*26.190*/.date),format.raw/*26.195*/("""</time>
                                            . </footer>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>

                    <aside class="col-right sidebar col-sm-3">
                        <div role="complementary" class="widget_wrapper13" id="secondary">
                                <!-- Banner Ad Block -->
                            <div class="ad-spots widget widget__sidebar">
                                <a target="_self" href="#" title=""><img alt="offer banner" src='"""),_display_(/*38.99*/routes/*38.105*/.Assets.versioned("images/block1.jpg")),format.raw/*38.143*/("""'></a>
                                <a target="_self" href="#" title=""><img alt="offer banner" src='"""),_display_(/*39.99*/routes/*39.105*/.Assets.versioned("images/block1.jpg")),format.raw/*39.143*/("""'></a>
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
""")))}),format.raw/*56.2*/("""
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
                  DATE: Tue Apr 19 10:06:09 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/news.scala.html
                  HASH: 06543c00f12f0b1df5f906789f41051d5f8c12fa
                  MATRIX: 746->1|853->13|881->16|892->20|930->22|962->28|1019->59|1031->63|1065->77|1857->842|1870->846|1897->852|1926->853|2337->1237|2350->1241|2376->1246|2697->1539|2711->1543|2738->1548|3404->2187|3420->2193|3480->2231|3613->2337|3629->2343|3689->2381|4628->3290
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|47->16|47->16|47->16|47->16|53->22|53->22|53->22|57->26|57->26|57->26|69->38|69->38|69->38|70->39|70->39|70->39|87->56
                  -- GENERATED --
              */
          