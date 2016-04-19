
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
                                <th class="text-center">Galerija</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*42.26*/for(item <- items) yield /*42.44*/ {_display_(Seq[Any](format.raw/*42.46*/("""
                            """),format.raw/*43.29*/("""<tr class="about" >
                                <td>"""),_display_(/*44.38*/item/*44.42*/.name),format.raw/*44.47*/("""</td>
                                <td>"""),_display_(/*45.38*/item/*45.42*/.description),format.raw/*45.54*/("""</td>
                                <td class="text-center">"""),_display_(/*46.58*/item/*46.62*/.price),format.raw/*46.68*/("""</td>
                                <td class="text-center">"""),_display_(/*47.58*/item/*47.62*/.category.name),format.raw/*47.76*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*49.89*/routes/*49.95*/.Items.itemRender(item.id)),format.raw/*49.121*/("""" role="button">
                                        <i class=" fa fa-eye fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*54.89*/routes/*54.95*/.Items.updateItem(item.id)),format.raw/*54.121*/("""" role="button">
                                        <i class=" fa fa-pencil fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*59.89*/routes/*59.95*/.Images.listOfPicturesRender(item.id)),format.raw/*59.132*/("""" role="button">
                                        <i class=" fa fa-picture-o fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" data-role="delete-item" title="Obriši proizvod" href=""""),_display_(/*64.114*/routes/*64.120*/.Items.deleteItem(item.id)),format.raw/*64.146*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*69.26*/("""
                        """),format.raw/*70.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*76.66*/routes/*76.72*/.Items.createItem(userId)),format.raw/*76.97*/("""" >
                            <div class="buttons-set">
                                <button class="button submit"> <span> DODAJ PROIZVOD </span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*90.19*/routes/*90.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*90.65*/(""""></script>
    <script src='"""),_display_(/*91.19*/routes/*91.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*91.74*/("""'></script>
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
                  DATE: Mon Apr 18 19:38:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/listOfItems.scala.html
                  HASH: ccfa462644e483a7ba82b57529d56d88321c2060
                  MATRIX: 784->1|925->47|952->49|963->53|1000->54|1031->59|1273->274|1314->306|1354->308|1399->325|1619->518|1633->523|1669->538|1744->582|1785->596|1824->626|1864->628|1909->645|2128->837|2142->842|2176->855|2251->899|2287->908|3359->1953|3393->1971|3433->1973|3490->2002|3574->2059|3587->2063|3613->2068|3683->2111|3696->2115|3729->2127|3819->2190|3832->2194|3859->2200|3949->2263|3962->2267|3997->2281|4175->2432|4190->2438|4238->2464|4579->2778|4594->2784|4642->2810|4986->3127|5001->3133|5060->3170|5433->3515|5449->3521|5497->3547|5760->3779|5813->3804|6082->4046|6097->4052|6143->4077|6522->4429|6537->4435|6598->4475|6655->4505|6670->4511|6740->4560
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|80->49|80->49|85->54|85->54|85->54|90->59|90->59|90->59|95->64|95->64|95->64|100->69|101->70|107->76|107->76|107->76|121->90|121->90|121->90|122->91|122->91|122->91
                  -- GENERATED --
              */
          