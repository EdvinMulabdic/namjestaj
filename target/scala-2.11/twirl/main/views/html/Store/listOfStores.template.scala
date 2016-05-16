
package views.html.Store

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfStores_Scope0 {
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

class listOfStores extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[Store],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(stores: java.util.List[Store])(userId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista objekata</h1>
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
                                <th>Naziv objekta</th>
                                <th>Grad</th>
                                <th class="text-center">Adresa</th>
                                <th class="text-center">Uredi</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*39.26*/for(store <- stores) yield /*39.46*/ {_display_(Seq[Any](format.raw/*39.48*/("""
                            """),format.raw/*40.29*/("""<tr class="about" >
                                <td>"""),_display_(/*41.38*/store/*41.43*/.name),format.raw/*41.48*/("""</td>
                                <td>"""),_display_(/*42.38*/store/*42.43*/.city),format.raw/*42.48*/("""</td>
                                <td class="text-center">"""),_display_(/*43.58*/store/*43.63*/.address),format.raw/*43.71*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi proizvod" href=""""),_display_(/*45.89*/routes/*45.95*/.Stores.updateStoreRender(store.id)),format.raw/*45.130*/("""" role="button">
                                        <i class=" fa fa-pencil fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" data-role="delete-store" title="Obriši proixvod" href=""""),_display_(/*50.115*/routes/*50.121*/.Stores.deleteStore(store.id)),format.raw/*50.150*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*55.26*/("""
                        """),format.raw/*56.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*62.66*/routes/*62.72*/.Stores.createStore(userId)),format.raw/*62.99*/("""" >
                            <div class="buttons-set">
                                <button class="button submit"><span>DODAJ OBJEKAT</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*76.65*/(""""></script>
    <script src='"""),_display_(/*77.19*/routes/*77.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*77.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(stores:java.util.List[Store],userId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(stores)(userId)

  def f:((java.util.List[Store]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (stores) => (userId) => apply(stores)(userId)

  def ref: this.type = this

}


}

/**/
object listOfStores extends listOfStores_Scope0.listOfStores
              /*
                  -- GENERATED --
                  DATE: Fri May 13 17:14:19 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Store/listOfStores.scala.html
                  HASH: 8455689d9ff9049f8a3f318f78ee4153e3ba7ed5
                  MATRIX: 788->1|931->49|959->52|970->56|1008->58|1040->64|1288->285|1329->317|1369->319|1415->337|1637->532|1651->537|1687->552|1764->598|1806->613|1845->643|1885->645|1931->663|2152->857|2166->862|2200->875|2277->921|2314->931|3189->1779|3225->1799|3265->1801|3323->1831|3408->1889|3422->1894|3448->1899|3519->1943|3533->1948|3559->1953|3650->2017|3664->2022|3693->2030|3873->2183|3888->2189|3945->2224|4321->2572|4337->2578|4388->2607|4656->2844|4710->2870|4985->3118|5000->3124|5048->3151|5437->3513|5452->3519|5513->3559|5571->3590|5586->3596|5656->3645
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|76->45|81->50|81->50|81->50|86->55|87->56|93->62|93->62|93->62|107->76|107->76|107->76|108->77|108->77|108->77
                  -- GENERATED --
              */
          