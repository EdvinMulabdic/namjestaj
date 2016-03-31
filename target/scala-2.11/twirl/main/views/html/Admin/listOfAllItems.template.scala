
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
                                <th>Ime korisnika</th>
                                <th>Proizvod</th>
                                <th>Cijena</th>
                                <th class="text-center">Prikazi na početnom slideru</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*24.26*/for(item <- items) yield /*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
                                """),format.raw/*25.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*26.42*/item/*26.46*/.user.name),format.raw/*26.56*/("""</td>
                                    <td>"""),_display_(/*27.42*/item/*27.46*/.name),format.raw/*27.51*/("""</td>
                                    <td class="text-center">"""),_display_(/*28.62*/item/*28.66*/.price),format.raw/*28.72*/("""</td>
                                    <td class="text-center">
                                        """),_display_(/*30.42*/if(item.isVisible == null || item.isVisible == false)/*30.95*/ {_display_(Seq[Any](format.raw/*30.97*/("""
                                            """),format.raw/*31.45*/("""<a class="fa-buttons"  title="DA" href=""""),_display_(/*31.86*/routes/*31.92*/.Items.showOnHomepage(item.id)),format.raw/*31.122*/("""" role="button">
                                                <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                            </a>
                                        """)))}/*34.43*/else/*34.48*/{_display_(Seq[Any](format.raw/*34.49*/("""
                                            """),format.raw/*35.45*/("""<a class="fa-buttons" title="NE" href=""""),_display_(/*35.85*/routes/*35.91*/.Items.showOnHomepage(item.id)),format.raw/*35.121*/("""" role="button">
                                                <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                            </a>
                                        """)))}),format.raw/*38.42*/("""
                                    """),format.raw/*39.37*/("""</td>
                                </tr>
                        """)))}),format.raw/*41.26*/("""
                        """),format.raw/*42.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*48.66*/routes/*48.72*/.AppUsers.createUserRender()),format.raw/*48.100*/("""" >
                            <div class="buttons-set">
                                <button class="button create-account"><span>DODAJ KORISNIKA</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*62.65*/(""""></script>
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
                  DATE: Mon Mar 28 16:15:32 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfAllItems.scala.html
                  HASH: 2cae462c42d23f12289d46a1276032758bf4d0fc
                  MATRIX: 783->1|907->30|935->33|946->37|984->39|1016->45|2014->1016|2048->1034|2088->1036|2150->1070|2239->1132|2252->1136|2283->1146|2358->1194|2371->1198|2397->1203|2492->1271|2505->1275|2532->1281|2669->1391|2731->1444|2771->1446|2845->1492|2913->1533|2928->1539|2980->1569|3259->1830|3272->1835|3311->1836|3385->1882|3452->1922|3467->1928|3519->1958|3809->2217|3875->2255|3977->2326|4031->2352|4306->2600|4321->2606|4371->2634|4770->3006|4785->3012|4846->3052
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|62->31|65->34|65->34|65->34|66->35|66->35|66->35|66->35|69->38|70->39|72->41|73->42|79->48|79->48|79->48|93->62|93->62|93->62
                  -- GENERATED --
              */
          