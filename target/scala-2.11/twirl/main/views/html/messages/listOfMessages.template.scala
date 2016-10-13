
package views.html.messages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfMessages_Scope0 {
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

class listOfMessages extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Message],play.twirl.api.HtmlFormat.Appendable] {

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
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*25.26*/for(message <- messages) yield /*25.50*/ {_display_(Seq[Any](format.raw/*25.52*/("""
                            """),_display_(/*26.30*/if(message.deleteStatus)/*26.54*/ {_display_(Seq[Any](format.raw/*26.56*/("""
                                """),format.raw/*27.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*28.42*/message/*28.49*/.customerEmail),format.raw/*28.63*/("""</td>
                                    <td>"""),_display_(/*29.42*/message/*29.49*/.getSentDate),format.raw/*29.61*/("""</td>
                                    <td class="text-center">
                                        """),_display_(/*31.42*/message/*31.49*/.subject),format.raw/*31.57*/("""
                                        """),_display_(/*32.42*/if(message.status)/*32.60*/ {_display_(Seq[Any](format.raw/*32.62*/("""
                                            """),format.raw/*33.45*/("""<span class="badge"><i class="fa fa-envelope"></i></span>
                                        """)))}),format.raw/*34.42*/("""

                                    """),format.raw/*36.37*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" title="Pročaj poruku" href=""""),_display_(/*38.92*/routes/*38.98*/.Messages.message(message.id)),format.raw/*38.127*/("""" role="button">
                                            <i class=" fa fa-eye fa-lg"></i>
                                        </a>
                                    </td>
                                    <td class="text-center">
                                        <a class="fa-buttons" title="Obriši poruku" href=""""),_display_(/*43.92*/routes/*43.98*/.Messages.deleteMessage(message.id)),format.raw/*43.133*/("""" role="button">
                                            <i class=" fa fa-trash-o fa-lg"></i>
                                        </a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*48.30*/("""
                        """)))}),format.raw/*49.26*/("""
                        """),format.raw/*50.25*/("""</tbody>
                    </table>
                </section>
            </div>
        </div>
    </section>

    <script src=""""),_display_(/*57.19*/routes/*57.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*57.65*/(""""></script>

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
object listOfMessages extends listOfMessages_Scope0.listOfMessages
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:37 CEST 2016
                  SOURCE: E:/namjestaj/app/views/messages/listOfMessages.scala.html
                  HASH: 775d46779759df19bfc326dc5d1db269dc73b35f
                  MATRIX: 789->1|919->36|946->38|957->42|995->44|1026->49|2068->1064|2108->1088|2148->1090|2205->1120|2238->1144|2278->1146|2339->1179|2427->1240|2443->1247|2478->1261|2552->1308|2568->1315|2601->1327|2736->1435|2752->1442|2781->1450|2850->1492|2877->1510|2917->1512|2990->1557|3120->1656|3186->1694|3371->1852|3386->1858|3437->1887|3797->2220|3812->2226|3869->2261|4152->2513|4209->2539|4262->2564|4422->2697|4437->2703|4498->2743
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|56->25|56->25|56->25|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|67->36|69->38|69->38|69->38|74->43|74->43|74->43|79->48|80->49|81->50|88->57|88->57|88->57
                  -- GENERATED --
              */
          