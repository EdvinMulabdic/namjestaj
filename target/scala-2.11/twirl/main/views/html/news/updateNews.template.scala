
package views.html.news

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateNews_Scope0 {
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

class updateNews extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[News,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(news: News):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-md-12">
                    <div class="page-title">
                        <h2>Ažuriraj vijest</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.NewsController.updateNews(news.id)),format.raw/*13.112*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="title">Naslov  <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="title" name="title" title="Naslov" class="input-text" value=""""),_display_(/*23.146*/news/*23.150*/.title),format.raw/*23.156*/("""" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="text">Tekst <em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="text" id="text" title="Opis" class="input-text" cols="20" rows="10" style="resize: vertical">"""),_display_(/*32.171*/news/*32.175*/.text),format.raw/*32.180*/("""</textarea>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>
                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                    <li>
                                        <div class="buttons-set">
                                            <button type="submit" title="Submit" class="button submit"> <span> Ažuriraj vijest </span> </button>
                                        </div>
                                    </li>
                                </ul>
                            </form>
                        </fieldset>

                    </div>
                </section>
            </div>
        </div>
    </section>
    <!-- Main Container End -->
""")))}))
      }
    }
  }

  def render(news:News): play.twirl.api.HtmlFormat.Appendable = apply(news)

  def f:((News) => play.twirl.api.HtmlFormat.Appendable) = (news) => apply(news)

  def ref: this.type = this

}


}

/**/
object updateNews extends updateNews_Scope0.updateNews
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:37 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/updateNews.scala.html
                  HASH: db68023bd3efb74390d5a7c14865066fa3285dcd
                  MATRIX: 758->1|865->13|892->15|903->19|940->20|971->25|1517->544|1532->550|1589->585|2394->1362|2408->1366|2436->1372|3199->2107|3213->2111|3240->2116
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23|63->32|63->32|63->32
                  -- GENERATED --
              */
          