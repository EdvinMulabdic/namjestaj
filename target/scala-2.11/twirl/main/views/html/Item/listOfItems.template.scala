
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfItems_Scope0 {
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

class listOfItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[Item],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[Item])(userId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista proizvoda</h1>
            </div>
        </div>
        <div>
            """),_display_(/*10.14*/if(flash.containsKey("success"))/*10.46*/ {_display_(Seq[Any](format.raw/*10.48*/("""
                """),format.raw/*11.17*/("""<div class="alert alert-success" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*13.67*/flash/*13.72*/.get("success")),format.raw/*13.87*/("""</span>
                </div>
            """)))}),format.raw/*15.14*/("""
            """),_display_(/*16.14*/if(flash.containsKey("error"))/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
                """),format.raw/*17.17*/("""<div class="alert alert-danger" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*19.67*/flash/*19.72*/.get("error")),format.raw/*19.85*/("""</span>
                </div>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</div>
    </div>
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-md-12" id="tablemargins">
                    <table class="table table-striped table-bordered table-responsive" id="sort">
                        <thead>
                            <tr class="about">
                                <th>Naziv proizvoda</th>
                                <th>Opis</th>
                                <th class="text-center">Cijena</th>
                                <th class="text-center">Kategorija</th>
                                <th class="text-center">Pogledaj</th>
                                <th class="text-center">Uredi</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*41.26*/for(item <- items) yield /*41.44*/ {_display_(Seq[Any](format.raw/*41.46*/("""
                            """),format.raw/*42.29*/("""<tr class="about" >
                                <td>"""),_display_(/*43.38*/item/*43.42*/.name),format.raw/*43.47*/("""</td>
                                <td>"""),_display_(/*44.38*/item/*44.42*/.description),format.raw/*44.54*/("""</td>
                                <td class="text-center">"""),_display_(/*45.58*/item/*45.62*/.price),format.raw/*45.68*/("""</td>
                                <td class="text-center">"""),_display_(/*46.58*/item/*46.62*/.category.name),format.raw/*46.76*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*48.89*/routes/*48.95*/.Items.itemRender(item.id)),format.raw/*48.121*/("""" role="button">
                                        <i class=" fa fa-eye fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*53.89*/routes/*53.95*/.Items.updateItem(item.id)),format.raw/*53.121*/("""" role="button">
                                        <i class=" fa fa-pencil fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" data-role="delete-item" title="Obriši proixvod" href=""""),_display_(/*58.114*/routes/*58.120*/.Items.deleteItem(item.id)),format.raw/*58.146*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*63.26*/("""
                        """),format.raw/*64.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*70.66*/routes/*70.72*/.Items.createItem(userId)),format.raw/*70.97*/("""" >
                            <div class="buttons-set">
                                <button class="button create-account"><span>DODAJ PROIZVOD</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*84.19*/routes/*84.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*84.65*/(""""></script>
    <script src='"""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*85.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(items:java.util.List[Item],userId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(items)(userId)

  def f:((java.util.List[Item]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (items) => (userId) => apply(items)(userId)

  def ref: this.type = this

}


}

/**/
object listOfItems extends listOfItems_Scope0.listOfItems
              /*
                  -- GENERATED --
                  DATE: Fri Mar 25 02:19:55 CET 2016
                  SOURCE: E:/namjestaj/app/views/Item/listOfItems.scala.html
                  HASH: 2f2dba24373fe21eca04864882d78cfdfa816109
                  MATRIX: 784->1|925->47|952->49|963->53|1000->54|1031->59|1273->274|1314->306|1354->308|1399->325|1619->518|1633->523|1669->538|1744->582|1785->596|1824->626|1864->628|1909->645|2128->837|2142->842|2176->855|2251->899|2287->908|3289->1883|3323->1901|3363->1903|3420->1932|3504->1989|3517->1993|3543->1998|3613->2041|3626->2045|3659->2057|3749->2120|3762->2124|3789->2130|3879->2193|3892->2197|3927->2211|4105->2362|4120->2368|4168->2394|4509->2708|4524->2714|4572->2740|4942->3082|4958->3088|5006->3114|5269->3346|5322->3371|5591->3613|5606->3619|5652->3644|6036->4001|6051->4007|6112->4047|6169->4077|6184->4083|6254->4132
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|72->41|72->41|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|79->48|84->53|84->53|84->53|89->58|89->58|89->58|94->63|95->64|101->70|101->70|101->70|115->84|115->84|115->84|116->85|116->85|116->85
                  -- GENERATED --
              */
          