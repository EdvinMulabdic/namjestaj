
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
                                <th class="text-center">Aktivan</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*43.26*/for(item <- items) yield /*43.44*/ {_display_(Seq[Any](format.raw/*43.46*/("""
                            """),format.raw/*44.29*/("""<tr class="about" >
                                <td>"""),_display_(/*45.38*/item/*45.42*/.name),format.raw/*45.47*/("""</td>
                                <td>"""),_display_(/*46.38*/item/*46.42*/.description),format.raw/*46.54*/("""</td>
                                <td class="text-center">"""),_display_(/*47.58*/item/*47.62*/.price),format.raw/*47.68*/("""</td>
                                <td class="text-center">"""),_display_(/*48.58*/item/*48.62*/.category.name),format.raw/*48.76*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*50.89*/routes/*50.95*/.Items.itemRender(item.id)),format.raw/*50.121*/("""" role="button">
                                        <i class=" fa fa-eye fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*55.89*/routes/*55.95*/.Items.updateItem(item.id)),format.raw/*55.121*/("""" role="button">
                                        <i class=" fa fa-pencil fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*60.89*/routes/*60.95*/.Images.listOfPicturesRender(item.id)),format.raw/*60.132*/("""" role="button">
                                        <i class=" fa fa-picture-o fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                """),_display_(/*65.34*/if(item.isActive == true)/*65.59*/ {_display_(Seq[Any](format.raw/*65.61*/("""
                                    """),format.raw/*66.37*/("""<a class="fa-buttons"  title="Aktivan" href=""""),_display_(/*66.83*/routes/*66.89*/.Items.activateDeactivateItem(item.id)),format.raw/*66.127*/("""" role="button">
                                        <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>DA</span></button>
                                    </a>
                                """)))}/*69.35*/else/*69.40*/{_display_(Seq[Any](format.raw/*69.41*/("""
                                    """),format.raw/*70.37*/("""<a class="fa-buttons" title="Neaktivan" href=""""),_display_(/*70.84*/routes/*70.90*/.Items.activateDeactivateItem(item.id)),format.raw/*70.128*/("""" role="button">
                                        <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>NE</span></button>
                                    </a>
                                """)))}),format.raw/*73.34*/("""
                                """),format.raw/*74.33*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" data-role="delete-item" title="Obriši proizvod" href=""""),_display_(/*76.114*/routes/*76.120*/.Items.deleteItem(item.id)),format.raw/*76.146*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*81.26*/("""
                        """),format.raw/*82.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*88.66*/routes/*88.72*/.Items.createItem(userId)),format.raw/*88.97*/("""" >
                            <div class="buttons-set">
                                <button class="button submit"> <span> DODAJ PROIZVOD </span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*102.19*/routes/*102.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*102.65*/(""""></script>
    <script src='"""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*103.74*/("""'></script>
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
                  DATE: Fri Apr 22 20:06:25 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/listOfItems.scala.html
                  HASH: 5d354b70abdc832b65f6a79512c9ced7e88c43ac
                  MATRIX: 784->1|925->47|952->49|963->53|1000->54|1031->59|1273->274|1314->306|1354->308|1399->325|1619->518|1633->523|1669->538|1744->582|1785->596|1824->626|1864->628|1909->645|2128->837|2142->842|2176->855|2251->899|2287->908|3428->2022|3462->2040|3502->2042|3559->2071|3643->2128|3656->2132|3682->2137|3752->2180|3765->2184|3798->2196|3888->2259|3901->2263|3928->2269|4018->2332|4031->2336|4066->2350|4244->2501|4259->2507|4307->2533|4648->2847|4663->2853|4711->2879|5055->3196|5070->3202|5129->3239|5421->3504|5455->3529|5495->3531|5560->3568|5633->3614|5648->3620|5708->3658|5960->3892|5973->3897|6012->3898|6077->3935|6151->3982|6166->3988|6226->4026|6489->4258|6550->4291|6754->4467|6770->4473|6818->4499|7081->4731|7134->4756|7403->4998|7418->5004|7464->5029|7844->5381|7860->5387|7922->5427|7980->5457|7996->5463|8067->5512
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|81->50|81->50|81->50|86->55|86->55|86->55|91->60|91->60|91->60|96->65|96->65|96->65|97->66|97->66|97->66|97->66|100->69|100->69|100->69|101->70|101->70|101->70|101->70|104->73|105->74|107->76|107->76|107->76|112->81|113->82|119->88|119->88|119->88|133->102|133->102|133->102|134->103|134->103|134->103
                  -- GENERATED --
              */
          