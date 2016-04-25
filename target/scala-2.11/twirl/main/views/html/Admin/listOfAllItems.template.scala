
package views.html.Admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfAllItems_Scope0 {
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

class listOfAllItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista proizvoda</h1>
            </div>
        </div>
    </div>
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-md-12" id="tablemargins">
                    <table class="table table-striped table-bordered table-responsive" id="sort">
                        <thead>
                            <tr class="about">
                                <th>ID</th>
                                <th>Ime korisnika</th>
                                <th>Proizvod</th>
                                <th>Cijena</th>
                                <th class="text-center">Ocjene</th>
                                <th class="text-center">Prikazi na početnom slideru</th>
                                <th class="text-center">Blokiran proizvod</th>
                                <th class="text-center">Blokiran korisnik</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*28.26*/for(item <- items) yield /*28.44*/ {_display_(Seq[Any](format.raw/*28.46*/("""
                                """),format.raw/*29.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*30.42*/item/*30.46*/.id),format.raw/*30.49*/("""</td>
                                    <td>"""),_display_(/*31.42*/item/*31.46*/.user.name),format.raw/*31.56*/("""</td>
                                    <td>"""),_display_(/*32.42*/item/*32.46*/.name),format.raw/*32.51*/("""</td>
                                    <td class="text-center">"""),_display_(/*33.62*/item/*33.66*/.price),format.raw/*33.72*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons"  title="Ocjene" href=""""),_display_(/*35.86*/routes/*35.92*/.Reviews.itemReviews(item.id)),format.raw/*35.121*/("""" role="button">
                                            <button  type="submit" class="button"><i class="fa fa-list"></i></button>
                                        </a>
                                    </td>
                                    <td class="text-center">
                                        """),_display_(/*40.42*/if(item.isVisible == null || item.isVisible == false)/*40.95*/ {_display_(Seq[Any](format.raw/*40.97*/("""
                                            """),format.raw/*41.45*/("""<a class="fa-buttons"  title="DA" href=""""),_display_(/*41.86*/routes/*41.92*/.Items.showOnHomepage(item.id)),format.raw/*41.122*/("""" role="button">
                                                <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                            </a>
                                        """)))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""
                                            """),format.raw/*45.45*/("""<a class="fa-buttons" title="NE" href=""""),_display_(/*45.85*/routes/*45.91*/.Items.showOnHomepage(item.id)),format.raw/*45.121*/("""" role="button">
                                                <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                            </a>
                                        """)))}),format.raw/*48.42*/("""
                                    """),format.raw/*49.37*/("""</td>

                                    <td class="text-center">
                                    """),_display_(/*52.38*/if(item.isBlocked == null || item.isBlocked == false)/*52.91*/ {_display_(Seq[Any](format.raw/*52.93*/("""
                                        """),format.raw/*53.41*/("""<a class="fa-buttons" title="NE" href=""""),_display_(/*53.81*/routes/*53.87*/.Items.blockUnblockItem(item.id)),format.raw/*53.119*/("""" role="button">
                                            <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                        </a>
                                    """)))}/*56.39*/else/*56.44*/{_display_(Seq[Any](format.raw/*56.45*/("""
                                        """),format.raw/*57.41*/("""<a class="fa-buttons"  title="DA" href=""""),_display_(/*57.82*/routes/*57.88*/.Items.blockUnblockItem(item.id)),format.raw/*57.120*/("""" role="button">
                                            <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                        </a>
                                    """)))}),format.raw/*60.38*/("""
                                    """),format.raw/*61.37*/("""</td>

                                    """),_display_(/*63.38*/if(item.user.isActive == null || item.user.isActive == false)/*63.99*/ {_display_(Seq[Any](format.raw/*63.101*/("""
                                        """),format.raw/*64.41*/("""<td class="text-center"> DA </td>
                                    """)))}/*65.39*/else/*65.44*/{_display_(Seq[Any](format.raw/*65.45*/("""
                                        """),format.raw/*66.41*/("""<td class="text-center"> NE </td>
                                    """)))}),format.raw/*67.38*/("""
                                """),format.raw/*68.33*/("""</tr>
                        """)))}),format.raw/*69.26*/("""
                        """),format.raw/*70.25*/("""</tbody>
                    </table>
                </section>
            </div>

        </div>
    </section>

    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*78.65*/(""""></script>
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
object listOfAllItems extends listOfAllItems_Scope0.listOfAllItems
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 13:15:15 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfAllItems.scala.html
                  HASH: 22c5f46ff87cbd9bc8496b6e9a4240ac45784fdb
                  MATRIX: 783->1|907->30|935->33|946->37|984->39|1016->45|2288->1290|2322->1308|2362->1310|2424->1344|2513->1406|2526->1410|2550->1413|2625->1461|2638->1465|2669->1475|2744->1523|2757->1527|2783->1532|2878->1600|2891->1604|2918->1610|3099->1764|3114->1770|3165->1799|3521->2128|3583->2181|3623->2183|3697->2229|3765->2270|3780->2276|3832->2306|4111->2567|4124->2572|4163->2573|4237->2619|4304->2659|4319->2665|4371->2695|4661->2954|4727->2992|4862->3100|4924->3153|4964->3155|5034->3197|5101->3237|5116->3243|5170->3275|5436->3523|5449->3528|5488->3529|5558->3571|5626->3612|5641->3618|5695->3650|5974->3898|6040->3936|6113->3982|6183->4043|6224->4045|6294->4087|6385->4160|6398->4165|6437->4166|6507->4208|6610->4280|6672->4314|6735->4346|6789->4372|6958->4514|6973->4520|7034->4560
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|66->35|66->35|66->35|71->40|71->40|71->40|72->41|72->41|72->41|72->41|75->44|75->44|75->44|76->45|76->45|76->45|76->45|79->48|80->49|83->52|83->52|83->52|84->53|84->53|84->53|84->53|87->56|87->56|87->56|88->57|88->57|88->57|88->57|91->60|92->61|94->63|94->63|94->63|95->64|96->65|96->65|96->65|97->66|98->67|99->68|100->69|101->70|109->78|109->78|109->78
                  -- GENERATED --
              */
          