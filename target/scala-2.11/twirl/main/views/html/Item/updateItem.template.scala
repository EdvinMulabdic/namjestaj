
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateItem_Scope0 {
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

class updateItem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Ažuriraj proizvod - """),_display_(/*9.50*/item/*9.54*/.name),format.raw/*9.59*/("""</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.Items.updateItem(item.id)),format.raw/*13.103*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv proizvoda <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="Naziv proizvoda" class="input-text" value=""""),_display_(/*23.153*/item/*23.157*/.name),format.raw/*23.162*/("""" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-lastname">
                                                            <label  for="category">Kategorija<em class="required">*</em></label>
                                                            <select title="Kategorija" class="validate-select" id="category" name="category">
                                                                <option selected value=""""),_display_(/*32.90*/item/*32.94*/.category.id),format.raw/*32.106*/("""">"""),_display_(/*32.109*/item/*32.113*/.category.name),format.raw/*32.127*/("""</option>
                                                                """),_display_(/*33.66*/for(category <- models.Category.findAllCategories()) yield /*33.118*/{_display_(Seq[Any](format.raw/*33.119*/("""
                                                                    """),format.raw/*34.69*/("""<option value=""""),_display_(/*34.85*/category/*34.93*/.id),format.raw/*34.96*/("""">"""),_display_(/*34.99*/category/*34.107*/.name),format.raw/*34.112*/("""</option>
                                                                """)))}),format.raw/*35.66*/("""
                                                            """),format.raw/*36.61*/("""</select>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-lastname">
                                                            <label  for="subCategory">Potkategorija<em class="required">*</em></label>
                                                            <select title="Potkategorija" class="validate-select" id="subCategory" name="subCategory">
                                                                """),_display_(/*45.66*/if(item.subCategory != null)/*45.94*/ {_display_(Seq[Any](format.raw/*45.96*/("""
                                                                    """),format.raw/*46.69*/("""<option value=""""),_display_(/*46.85*/item/*46.89*/.subCategory.id),format.raw/*46.104*/("""" >"""),_display_(/*46.108*/item/*46.112*/.subCategory.name),format.raw/*46.129*/("""</option>

                                                                """)))}/*48.66*/else/*48.71*/{_display_(Seq[Any](format.raw/*48.72*/("""
                                                                    """),format.raw/*49.69*/("""<option value="0" >Odaberite potkategoriju</option>
                                                                """)))}),format.raw/*50.66*/("""
                                                            """),_display_(/*51.62*/for(subCategory <- models.SubCategory.allSubCategories(item.category.id)) yield /*51.135*/{_display_(Seq[Any](format.raw/*51.136*/("""
                                                                """),format.raw/*52.65*/("""<option value=""""),_display_(/*52.81*/subCategory/*52.92*/.id),format.raw/*52.95*/("""">"""),_display_(/*52.98*/subCategory/*52.109*/.name),format.raw/*52.114*/("""</option>
                                                            """)))}),format.raw/*53.62*/("""
                                                            """),format.raw/*54.61*/("""</select>
                                                            """),_display_(/*55.62*/if(item.subCategory == null)/*55.90*/ {_display_(Seq[Any](format.raw/*55.92*/("""
                                                                """),format.raw/*56.65*/("""<span class="require"><em class="required">
                                                                    Molimo odaberite potkategoriju</em></span>
                                                            """)))}),format.raw/*58.62*/("""
                                                        """),format.raw/*59.57*/("""</div>

                                                    </div>

                                                </li>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box">
                                                            <label for="price"> Cijena <span class="required">*</span>  </label>
                                                            <br>
                                                            <input type="text" id="price" name="price" title="Cijena" class="input-text" value=""""),_display_(/*69.146*/item/*69.150*/.price),format.raw/*69.156*/("""" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="customer-name">
                                                        <p>Ukoliko je proizvod snižen, molimo Vas da unesete staru i novu cijenu.</p>
                                                        <p>U suprotnom ostavite polje "Stara cijena" prazno. Hvala! </p>
                                                        <div class="input-box">
                                                            <label for="oldPrice">Stara cijena <span class="required"></span>  </label>
                                                            <br>
                                                            <input type="text" id="oldPrice" name="oldPrice" title="Stara Cijena" class="input-text" value=""""),_display_(/*80.158*/item/*80.162*/.oldPrice),format.raw/*80.171*/("""" >
                                                        </div>
                                                    </div>

                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="description">Opis proizvoda<em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="description" id="description" title="Opis" class="input-text" cols="5" rows="5" style="resize: vertical">"""),_display_(/*90.183*/item/*90.187*/.description),format.raw/*90.199*/("""</textarea>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>

                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                    <li>
                                        <div class="buttons-set">
                                            <button type="submit" title="Submit" class="button submit"> <span> Ažuriraj </span> </button>
                                        </div>
                                    </li>
                                </ul>
                            </form>
                        </fieldset>
                    </div>
                </section>
            </div>
        </div>
    </section>
    <!-- Main Container End -->
""")))}))
      }
    }
  }

  def render(item:Item): play.twirl.api.HtmlFormat.Appendable = apply(item)

  def f:((Item) => play.twirl.api.HtmlFormat.Appendable) = (item) => apply(item)

  def ref: this.type = this

}


}

/**/
object updateItem extends updateItem_Scope0.updateItem
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 10:36:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/updateItem.scala.html
                  HASH: 390b21022a2352f7ee8535241d22e752313a97f6
                  MATRIX: 758->1|865->13|892->15|903->19|941->21|972->26|1314->342|1326->346|1351->351|1586->559|1601->565|1649->591|2468->1382|2482->1386|2509->1391|3311->2166|3324->2170|3358->2182|3389->2185|3403->2189|3439->2203|3541->2278|3610->2330|3650->2331|3747->2400|3790->2416|3807->2424|3831->2427|3861->2430|3879->2438|3906->2443|4012->2518|4101->2579|4892->3343|4929->3371|4969->3373|5066->3442|5109->3458|5122->3462|5159->3477|5191->3481|5205->3485|5244->3502|5339->3578|5352->3583|5391->3584|5488->3653|5636->3770|5725->3832|5815->3905|5855->3906|5948->3971|5991->3987|6011->3998|6035->4001|6065->4004|6086->4015|6113->4020|6215->4091|6304->4152|6402->4223|6439->4251|6479->4253|6572->4318|6819->4534|6904->4591|7606->5265|7620->5269|7648->5275|8690->6289|8704->6293|8735->6302|9518->7057|9532->7061|9566->7073
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|40->9|40->9|40->9|44->13|44->13|44->13|54->23|54->23|54->23|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|67->36|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|79->48|79->48|79->48|80->49|81->50|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|85->54|86->55|86->55|86->55|87->56|89->58|90->59|100->69|100->69|100->69|111->80|111->80|111->80|121->90|121->90|121->90
                  -- GENERATED --
              */
          