
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
                                <th class="text-center">Datum aktivacije</th>
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

                                """),_display_(/*37.34*/if(item.isActive == true)/*37.59*/ {_display_(Seq[Any](format.raw/*37.61*/("""
                                    """),format.raw/*38.37*/("""<td class="text-center">Proizvod je aktivan</td>
                                """)))}),format.raw/*39.34*/("""
                                """),_display_(/*40.34*/if(item.isActive == false)/*40.60*/ {_display_(Seq[Any](format.raw/*40.62*/("""
                                    """),format.raw/*41.37*/("""<td class="text-center">"""),_display_(/*41.62*/item/*41.66*/.dateOfDeActivation),format.raw/*41.85*/("""</td>
                                """)))}),format.raw/*42.34*/("""

                                """),_display_(/*44.34*/if(item.isBlocked == false)/*44.61*/ {_display_(Seq[Any](format.raw/*44.63*/("""
                                    """),format.raw/*45.37*/("""<td class="text-center">Proizvod nije blokiran</td>
                                """)))}),format.raw/*46.34*/("""
                                """),_display_(/*47.34*/if(item.isBlocked == true)/*47.60*/ {_display_(Seq[Any](format.raw/*47.62*/("""
                                    """),format.raw/*48.37*/("""<td class="text-center">"""),_display_(/*48.62*/item/*48.66*/.blockingDate),format.raw/*48.79*/("""</td>
                                """)))}),format.raw/*49.34*/("""

                            """),format.raw/*51.29*/("""</tr>

                        """)))}),format.raw/*53.26*/("""
                        """),format.raw/*54.25*/("""</tbody>
                    </table>
                </section>
            </div>
        </div>
    </section>

    <script src=""""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*61.65*/(""""></script>

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
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/usersItems.scala.html
                  HASH: d3b85b4eb8868c837d7a9d027dd73f0876eb28db
                  MATRIX: 775->1|899->30|926->32|937->36|975->38|1006->43|2090->1100|2125->1119|2165->1121|2222->1150|2306->1207|2319->1211|2345->1216|2411->1255|2472->1307|2512->1309|2577->1346|2673->1411|2734->1445|2795->1497|2835->1499|2900->1536|2995->1600|3057->1634|3109->1659|3122->1663|3160->1680|3227->1720|3261->1745|3301->1747|3366->1784|3479->1866|3540->1900|3575->1926|3615->1928|3680->1965|3732->1990|3745->1994|3785->2013|3855->2052|3917->2087|3953->2114|3993->2116|4058->2153|4174->2238|4235->2272|4270->2298|4310->2300|4375->2337|4427->2362|4440->2366|4474->2379|4544->2418|4602->2448|4665->2480|4718->2505|4878->2638|4893->2644|4954->2684
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|66->35|66->35|66->35|68->37|68->37|68->37|69->38|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|82->51|84->53|85->54|92->61|92->61|92->61
                  -- GENERATED --
              */
          