
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
                                <th class="text-center">Prikazi na početnom slideru</th>
                                <th class="text-center">Blokiran proizvod</th>
                                <th class="text-center">Blokiran korisnik</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*27.26*/for(item <- items) yield /*27.44*/ {_display_(Seq[Any](format.raw/*27.46*/("""
                                """),format.raw/*28.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*29.42*/item/*29.46*/.id),format.raw/*29.49*/("""</td>
                                    <td>"""),_display_(/*30.42*/item/*30.46*/.user.name),format.raw/*30.56*/("""</td>
                                    <td>"""),_display_(/*31.42*/item/*31.46*/.name),format.raw/*31.51*/("""</td>
                                    <td class="text-center">"""),_display_(/*32.62*/item/*32.66*/.price),format.raw/*32.72*/("""</td>
                                    <td class="text-center">
                                        """),_display_(/*34.42*/if(item.isVisible == null || item.isVisible == false)/*34.95*/ {_display_(Seq[Any](format.raw/*34.97*/("""
                                            """),format.raw/*35.45*/("""<a class="fa-buttons"  title="DA" href=""""),_display_(/*35.86*/routes/*35.92*/.Items.showOnHomepage(item.id)),format.raw/*35.122*/("""" role="button">
                                                <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                            </a>
                                        """)))}/*38.43*/else/*38.48*/{_display_(Seq[Any](format.raw/*38.49*/("""
                                            """),format.raw/*39.45*/("""<a class="fa-buttons" title="NE" href=""""),_display_(/*39.85*/routes/*39.91*/.Items.showOnHomepage(item.id)),format.raw/*39.121*/("""" role="button">
                                                <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                            </a>
                                        """)))}),format.raw/*42.42*/("""
                                    """),format.raw/*43.37*/("""</td>

                                    <td class="text-center">
                                    """),_display_(/*46.38*/if(item.isBlocked == null || item.isBlocked == false)/*46.91*/ {_display_(Seq[Any](format.raw/*46.93*/("""
                                        """),format.raw/*47.41*/("""<a class="fa-buttons" title="NE" href=""""),_display_(/*47.81*/routes/*47.87*/.Items.blockUnblockItem(item.id)),format.raw/*47.119*/("""" role="button">
                                            <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                        </a>
                                    """)))}/*50.39*/else/*50.44*/{_display_(Seq[Any](format.raw/*50.45*/("""
                                        """),format.raw/*51.41*/("""<a class="fa-buttons"  title="DA" href=""""),_display_(/*51.82*/routes/*51.88*/.Items.blockUnblockItem(item.id)),format.raw/*51.120*/("""" role="button">
                                            <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                        </a>
                                    """)))}),format.raw/*54.38*/("""
                                    """),format.raw/*55.37*/("""</td>

                                    """),_display_(/*57.38*/if(item.user.isActive == null || item.user.isActive == false)/*57.99*/ {_display_(Seq[Any](format.raw/*57.101*/("""
                                        """),format.raw/*58.41*/("""<td class="text-center"> DA </td>
                                    """)))}/*59.39*/else/*59.44*/{_display_(Seq[Any](format.raw/*59.45*/("""
                                        """),format.raw/*60.41*/("""<td class="text-center"> NE </td>
                                    """)))}),format.raw/*61.38*/("""
                                """),format.raw/*62.33*/("""</tr>
                        """)))}),format.raw/*63.26*/("""
                        """),format.raw/*64.25*/("""</tbody>
                    </table>
                </section>
            </div>

        </div>
    </section>

    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*72.65*/(""""></script>
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
                  DATE: Wed Apr 20 11:58:37 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfAllItems.scala.html
                  HASH: 06317ae5766a5020a0e5f67aa88794fa5c469ea2
                  MATRIX: 783->1|907->30|935->33|946->37|984->39|1016->45|2219->1221|2253->1239|2293->1241|2355->1275|2444->1337|2457->1341|2481->1344|2556->1392|2569->1396|2600->1406|2675->1454|2688->1458|2714->1463|2809->1531|2822->1535|2849->1541|2986->1651|3048->1704|3088->1706|3162->1752|3230->1793|3245->1799|3297->1829|3576->2090|3589->2095|3628->2096|3702->2142|3769->2182|3784->2188|3836->2218|4126->2477|4192->2515|4327->2623|4389->2676|4429->2678|4499->2720|4566->2760|4581->2766|4635->2798|4901->3046|4914->3051|4953->3052|5023->3094|5091->3135|5106->3141|5160->3173|5439->3421|5505->3459|5578->3505|5648->3566|5689->3568|5759->3610|5850->3683|5863->3688|5902->3689|5972->3731|6075->3803|6137->3837|6200->3869|6254->3895|6423->4037|6438->4043|6499->4083
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|65->34|65->34|65->34|66->35|66->35|66->35|66->35|69->38|69->38|69->38|70->39|70->39|70->39|70->39|73->42|74->43|77->46|77->46|77->46|78->47|78->47|78->47|78->47|81->50|81->50|81->50|82->51|82->51|82->51|82->51|85->54|86->55|88->57|88->57|88->57|89->58|90->59|90->59|90->59|91->60|92->61|93->62|94->63|95->64|103->72|103->72|103->72
                  -- GENERATED --
              */
          