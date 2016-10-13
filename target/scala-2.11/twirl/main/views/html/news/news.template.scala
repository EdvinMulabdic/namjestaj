
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
	                            """),_display_(/*36.31*/if(Banner.findBannerByPosition(8) != null)/*36.73*/ {_display_(Seq[Any](format.raw/*36.75*/("""
		                            """),format.raw/*37.31*/("""<div class="col"><a href=""""),_display_(/*37.58*/Banner/*37.64*/.findBannerByPosition(8).link),format.raw/*37.93*/(""""><img src='"""),_display_(/*37.106*/Banner/*37.112*/.findBannerByPosition(8).image),format.raw/*37.142*/("""'alt="offer banner3"></a></div>
	                            """)))}/*38.31*/else/*38.35*/{_display_(Seq[Any](format.raw/*38.36*/("""
		                            """),format.raw/*39.31*/("""<div class="col"><a href=""""),_display_(/*39.58*/routes/*39.64*/.ContactUs.contactUsRender()),format.raw/*39.92*/(""""><img src='"""),_display_(/*39.105*/routes/*39.111*/.Assets.versioned("images/bannerNews.png")),format.raw/*39.153*/("""' alt="offer banner3"></a></div>
	                            """)))}),format.raw/*40.31*/("""
	                            """),_display_(/*41.31*/if(Banner.findBannerByPosition(9) != null)/*41.73*/ {_display_(Seq[Any](format.raw/*41.75*/("""
		                            """),format.raw/*42.31*/("""<div class="col"><a href=""""),_display_(/*42.58*/Banner/*42.64*/.findBannerByPosition(9).link),format.raw/*42.93*/(""""><img src='"""),_display_(/*42.106*/Banner/*42.112*/.findBannerByPosition(9).image),format.raw/*42.142*/("""'alt="offer banner3"></a></div>
	                            """)))}/*43.31*/else/*43.35*/{_display_(Seq[Any](format.raw/*43.36*/("""
		                            """),format.raw/*44.31*/("""<div class="col"><a href=""""),_display_(/*44.58*/routes/*44.64*/.ContactUs.contactUsRender()),format.raw/*44.92*/(""""><img src='"""),_display_(/*44.105*/routes/*44.111*/.Assets.versioned("images/bannerNews.png")),format.raw/*44.153*/("""' alt="offer banner3"></a></div>
	                            """)))}),format.raw/*45.31*/("""
                                """),format.raw/*46.158*/("""
                                """),format.raw/*47.158*/("""
                            """),format.raw/*48.29*/("""</div>
                        </div>
                    </aside>

                </div>
            </div>
        </section>
        <!-- Main Container End -->
    </div>
""")))}),format.raw/*57.2*/("""
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
                  DATE: Sun Jun 26 10:47:48 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/news.scala.html
                  HASH: ef946ce1147b73985311baebc2c24eab9afd359e
                  MATRIX: 746->1|853->13|881->16|892->20|930->22|962->28|1022->62|1034->66|1086->98|1912->897|1925->901|1952->907|1981->908|2392->1292|2405->1296|2431->1301|3071->1914|3122->1956|3162->1958|3222->1990|3276->2017|3291->2023|3341->2052|3382->2065|3398->2071|3450->2101|3532->2164|3545->2168|3584->2169|3644->2201|3698->2228|3713->2234|3762->2262|3803->2275|3819->2281|3883->2323|3978->2387|4037->2419|4088->2461|4128->2463|4188->2495|4242->2522|4257->2528|4307->2557|4348->2570|4364->2576|4416->2606|4498->2669|4511->2673|4550->2674|4610->2706|4664->2733|4679->2739|4728->2767|4769->2780|4785->2786|4849->2828|4944->2892|5007->3051|5070->3210|5128->3240|5344->3426
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|47->16|47->16|47->16|47->16|53->22|53->22|53->22|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|76->45|77->46|78->47|79->48|88->57
                  -- GENERATED --
              */
          