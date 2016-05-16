
package views.html.messages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfMessagesForAdmin_Scope0 {
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

class listOfMessagesForAdmin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Message],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: java.util.List[Message]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Vaše poruke</h1>
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
                                <th>Email pošiljaoca</th>
                                <th>Datum</th>
                                <th class="text-center">Naslov</th>
                                <th class="text-center">Pogledaj</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*24.26*/for(message <- messages) yield /*24.50*/ {_display_(Seq[Any](format.raw/*24.52*/("""
                            """),_display_(/*25.30*/if(message.deleteStatus)/*25.54*/ {_display_(Seq[Any](format.raw/*25.56*/("""
                                """),format.raw/*26.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*27.42*/message/*27.49*/.customerEmail),format.raw/*27.63*/("""</td>
                                    <td>"""),_display_(/*28.42*/message/*28.49*/.getSentDate),format.raw/*28.61*/("""</td>
                                    <td class="text-center">
                                        """),_display_(/*30.42*/message/*30.49*/.subject),format.raw/*30.57*/("""
                                        """),_display_(/*31.42*/if(message.status)/*31.60*/ {_display_(Seq[Any](format.raw/*31.62*/("""
                                            """),format.raw/*32.45*/("""<span class="badge"><i class="fa fa-envelope"></i></span>
                                        """)))}),format.raw/*33.42*/("""

                                    """),format.raw/*35.37*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" title="Pročaj poruku" href=""""),_display_(/*37.92*/routes/*37.98*/.Messages.message(message.id)),format.raw/*37.127*/("""" role="button">
                                            <i class=" fa fa-eye fa-lg"></i>
                                        </a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*42.30*/("""
                        """)))}),format.raw/*43.26*/("""
                        """),format.raw/*44.25*/("""</tbody>
                    </table>
                </section>
            </div>
        </div>
    </section>

    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*51.65*/(""""></script>

""")))}))
      }
    }
  }

  def render(messages:java.util.List[Message]): play.twirl.api.HtmlFormat.Appendable = apply(messages)

  def f:((java.util.List[Message]) => play.twirl.api.HtmlFormat.Appendable) = (messages) => apply(messages)

  def ref: this.type = this

}


}

/**/
object listOfMessagesForAdmin extends listOfMessagesForAdmin_Scope0.listOfMessagesForAdmin
              /*
                  -- GENERATED --
                  DATE: Fri May 13 17:14:19 CEST 2016
                  SOURCE: E:/namjestaj/app/views/messages/listOfMessagesForAdmin.scala.html
                  HASH: dda2c2915146cbb9d20a948355f951e4ce76fd63
                  MATRIX: 805->1|935->36|962->38|973->42|1011->44|1042->49|2016->996|2056->1020|2096->1022|2153->1052|2186->1076|2226->1078|2287->1111|2375->1172|2391->1179|2426->1193|2500->1240|2516->1247|2549->1259|2684->1367|2700->1374|2729->1382|2798->1424|2825->1442|2865->1444|2938->1489|3068->1588|3134->1626|3319->1784|3334->1790|3385->1819|3664->2067|3721->2093|3774->2118|3934->2251|3949->2257|4010->2297
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|66->35|68->37|68->37|68->37|73->42|74->43|75->44|82->51|82->51|82->51
                  -- GENERATED --
              */
          