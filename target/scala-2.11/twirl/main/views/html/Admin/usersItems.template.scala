
package views.html.Admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usersItems_Scope0 {
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

class usersItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Izvještaj o prozvodima</h1>
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
                                <th>Naziv proizvoda</th>
                                <th>Aktivan</th>
                                <th class="text-center">Datum dodavanja</th>
                                <th class="text-center">Datum deaktivacije</th>
                                <th class="text-center">Datum blokiranja</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*25.26*/for(item <- items ) yield /*25.45*/ {_display_(Seq[Any](format.raw/*25.47*/("""
                            """),format.raw/*26.29*/("""<tr class="about" >
                                <td>"""),_display_(/*27.38*/item/*27.42*/.name),format.raw/*27.47*/("""</td>
                                """),_display_(/*28.34*/if(item.isActive == true && item.isBlocked == false)/*28.86*/ {_display_(Seq[Any](format.raw/*28.88*/("""
                                    """),format.raw/*29.37*/("""<td class="text-center">DA</td>
                                """)))}),format.raw/*30.34*/("""
                                """),_display_(/*31.34*/if(item.isActive == false || item.isBlocked == true)/*31.86*/ {_display_(Seq[Any](format.raw/*31.88*/("""
                                    """),format.raw/*32.37*/("""<td clas="text-center">NE</td>
                                """)))}),format.raw/*33.34*/("""

                                """),format.raw/*35.33*/("""<td class="text-center">"""),_display_(/*35.58*/item/*35.62*/.dateOfActivation),format.raw/*35.79*/("""</td>
                                """),_display_(/*36.34*/if(item.isActive == true)/*36.59*/ {_display_(Seq[Any](format.raw/*36.61*/("""
                                    """),format.raw/*37.37*/("""<td class="text-center">Proizvod je aktivan</td>
                                """)))}),format.raw/*38.34*/("""
                                """),_display_(/*39.34*/if(item.isActive == false)/*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""
                                    """),format.raw/*40.37*/("""<td class="text-center">"""),_display_(/*40.62*/item/*40.66*/.dateOfDeActivation),format.raw/*40.85*/("""</td>
                                """)))}),format.raw/*41.34*/("""

                                """),_display_(/*43.34*/if(item.isBlocked == false)/*43.61*/ {_display_(Seq[Any](format.raw/*43.63*/("""
                                    """),format.raw/*44.37*/("""<td class="text-center">Proizvod nije blokiran</td>
                                """)))}),format.raw/*45.34*/("""
                                """),_display_(/*46.34*/if(item.isBlocked == true)/*46.60*/ {_display_(Seq[Any](format.raw/*46.62*/("""
                                    """),format.raw/*47.37*/("""<td class="text-center">"""),_display_(/*47.62*/item/*47.66*/.blockingDate),format.raw/*47.79*/("""</td>
                                """)))}),format.raw/*48.34*/("""

                            """),format.raw/*50.29*/("""</tr>

                        """)))}),format.raw/*52.26*/("""
                        """),format.raw/*53.25*/("""</tbody>
                    </table>
                </section>
            </div>
        </div>
    </section>

    <script src=""""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*60.65*/(""""></script>

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
object usersItems extends usersItems_Scope0.usersItems
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 20:16:47 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/usersItems.scala.html
                  HASH: 31fa659792cb28c8b370f98c8ec57483ec829ca7
                  MATRIX: 775->1|899->30|926->32|937->36|975->38|1006->43|2089->1099|2124->1118|2164->1120|2221->1149|2305->1206|2318->1210|2344->1215|2410->1254|2471->1306|2511->1308|2576->1345|2672->1410|2733->1444|2794->1496|2834->1498|2899->1535|2994->1599|3056->1633|3108->1658|3121->1662|3159->1679|3225->1718|3259->1743|3299->1745|3364->1782|3477->1864|3538->1898|3573->1924|3613->1926|3678->1963|3730->1988|3743->1992|3783->2011|3853->2050|3915->2085|3951->2112|3991->2114|4056->2151|4172->2236|4233->2270|4268->2296|4308->2298|4373->2335|4425->2360|4438->2364|4472->2377|4542->2416|4600->2446|4663->2478|4716->2503|4876->2636|4891->2642|4952->2682
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|72->41|74->43|74->43|74->43|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|81->50|83->52|84->53|91->60|91->60|91->60
                  -- GENERATED --
              */
          