
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
                                                                <option  value="0" >Odaberite potkategoriju</option>
                                                            """),_display_(/*46.62*/for(subCategory <- models.SubCategory.allSubCategories(item.category.id)) yield /*46.135*/{_display_(Seq[Any](format.raw/*46.136*/("""
                                                                """),format.raw/*47.65*/("""<option value=""""),_display_(/*47.81*/subCategory/*47.92*/.id),format.raw/*47.95*/("""">"""),_display_(/*47.98*/subCategory/*47.109*/.name),format.raw/*47.114*/("""</option>
                                                            """)))}),format.raw/*48.62*/("""
                                                            """),format.raw/*49.61*/("""</select>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box">
                                                            <label for="price"> Cijena <span class="required">*</span>  </label>
                                                            <br>
                                                            <input type="text" id="price" name="price" title="Cijena" class="input-text" value=""""),_display_(/*58.146*/item/*58.150*/.price),format.raw/*58.156*/("""" required>
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
                                                            <input type="text" id="oldPrice" name="oldPrice" title="Stara Cijena" class="input-text" value=""""),_display_(/*69.158*/item/*69.162*/.oldPrice),format.raw/*69.171*/("""" >
                                                        </div>
                                                    </div>

                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="description">Opis proizvoda<em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="description" id="description" title="Opis" class="input-text" cols="5" rows="5" style="resize: vertical">"""),_display_(/*79.183*/item/*79.187*/.description),format.raw/*79.199*/("""</textarea>
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
                  DATE: Thu Mar 31 17:13:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/updateItem.scala.html
                  HASH: b76963249d4f6c2f01da6b83ef57fc397cc4fac7
                  MATRIX: 758->1|865->13|892->15|903->19|941->21|972->26|1314->342|1326->346|1351->351|1586->559|1601->565|1649->591|2468->1382|2482->1386|2509->1391|3311->2166|3324->2170|3358->2182|3389->2185|3403->2189|3439->2203|3541->2278|3610->2330|3650->2331|3747->2400|3790->2416|3807->2424|3831->2427|3861->2430|3879->2438|3906->2443|4012->2518|4101->2579|5005->3456|5095->3529|5135->3530|5228->3595|5271->3611|5291->3622|5315->3625|5345->3628|5366->3639|5393->3644|5495->3715|5584->3776|6350->4514|6364->4518|6392->4524|7434->5538|7448->5542|7479->5551|8262->6306|8276->6310|8310->6322
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|40->9|40->9|40->9|44->13|44->13|44->13|54->23|54->23|54->23|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|67->36|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|80->49|89->58|89->58|89->58|100->69|100->69|100->69|110->79|110->79|110->79
                  -- GENERATED --
              */
          