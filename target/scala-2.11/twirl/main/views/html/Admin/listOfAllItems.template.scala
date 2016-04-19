
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
                                <th class="text-center">Blokiran</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*26.26*/for(item <- items) yield /*26.44*/ {_display_(Seq[Any](format.raw/*26.46*/("""
                                """),format.raw/*27.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*28.42*/item/*28.46*/.id),format.raw/*28.49*/("""</td>
                                    <td>"""),_display_(/*29.42*/item/*29.46*/.user.name),format.raw/*29.56*/("""</td>
                                    <td>"""),_display_(/*30.42*/item/*30.46*/.name),format.raw/*30.51*/("""</td>
                                    <td class="text-center">"""),_display_(/*31.62*/item/*31.66*/.price),format.raw/*31.72*/("""</td>
                                    <td class="text-center">
                                        """),_display_(/*33.42*/if(item.isVisible == null || item.isVisible == false)/*33.95*/ {_display_(Seq[Any](format.raw/*33.97*/("""
                                            """),format.raw/*34.45*/("""<a class="fa-buttons"  title="DA" href=""""),_display_(/*34.86*/routes/*34.92*/.Items.showOnHomepage(item.id)),format.raw/*34.122*/("""" role="button">
                                                <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                            </a>
                                        """)))}/*37.43*/else/*37.48*/{_display_(Seq[Any](format.raw/*37.49*/("""
                                            """),format.raw/*38.45*/("""<a class="fa-buttons" title="NE" href=""""),_display_(/*38.85*/routes/*38.91*/.Items.showOnHomepage(item.id)),format.raw/*38.121*/("""" role="button">
                                                <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                            </a>
                                        """)))}),format.raw/*41.42*/("""
                                    """),format.raw/*42.37*/("""</td>
                                    """),_display_(/*43.38*/if(item.isActive == null || item.isActive == false)/*43.89*/ {_display_(Seq[Any](format.raw/*43.91*/("""
                                         """),format.raw/*44.42*/("""<td class="text-center"> DA </td>
                                    """)))}/*45.39*/else/*45.44*/{_display_(Seq[Any](format.raw/*45.45*/("""
                                        """),format.raw/*46.41*/("""<td class="text-center"> NE </td>
                                    """)))}),format.raw/*47.38*/("""

                                """),format.raw/*49.33*/("""</tr>
                        """)))}),format.raw/*50.26*/("""
                        """),format.raw/*51.25*/("""</tbody>
                    </table>
                </section>
            </div>

        </div>
    </section>

    <script src=""""),_display_(/*59.19*/routes/*59.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*59.65*/(""""></script>
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
                  DATE: Mon Apr 18 20:01:48 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfAllItems.scala.html
                  HASH: f630aa9e850dabde42a9b3a00bc6b1ae42c2cc5a
                  MATRIX: 783->1|907->30|935->33|946->37|984->39|1016->45|2130->1132|2164->1150|2204->1152|2266->1186|2355->1248|2368->1252|2392->1255|2467->1303|2480->1307|2511->1317|2586->1365|2599->1369|2625->1374|2720->1442|2733->1446|2760->1452|2897->1562|2959->1615|2999->1617|3073->1663|3141->1704|3156->1710|3208->1740|3487->2001|3500->2006|3539->2007|3613->2053|3680->2093|3695->2099|3747->2129|4037->2388|4103->2426|4174->2470|4234->2521|4274->2523|4345->2566|4436->2639|4449->2644|4488->2645|4558->2687|4661->2759|4725->2795|4788->2827|4842->2853|5011->2995|5026->3001|5087->3041
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|64->33|64->33|64->33|65->34|65->34|65->34|65->34|68->37|68->37|68->37|69->38|69->38|69->38|69->38|72->41|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|78->47|80->49|81->50|82->51|90->59|90->59|90->59
                  -- GENERATED --
              */
          