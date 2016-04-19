
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createItem_Scope0 {
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

class createItem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Kreiraj proizvod</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.Items.createItem(userId)),format.raw/*13.102*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv proizvoda <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="Naziv proizvoda" class="input-text" required>
                                                        </div>

                                                        <div class="input-box">
                                                            <label for="price">Cijena <span class="required">*</span>  </label>
                                                            <br>
                                                            <input type="text" id="price" name="price" title="Cijena" class="input-text" required>
                                                        </div>
                                                        <div class="input-box name-lastname">
                                                                <label  for="category">Kategorija<em class="required">*</em></label>
                                                                <select title="Kategorija" class="validate-select" id="category" name="category">
                                                                    <option value="Select">Select</option>
                                                                    """),_display_(/*35.70*/for(category <- models.Category.findAllCategories()) yield /*35.122*/{_display_(Seq[Any](format.raw/*35.123*/("""
                                                                        """),format.raw/*36.73*/("""<option value=""""),_display_(/*36.89*/category/*36.97*/.id),format.raw/*36.100*/("""">"""),_display_(/*36.103*/category/*36.111*/.name),format.raw/*36.116*/("""</option>
                                                                    """)))}),format.raw/*37.70*/("""
                                                                """),format.raw/*38.65*/("""</select>
                                                        </div>

                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="description">Opis proizvoda<em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="description" id="description" title="Opis" class="input-text" cols="5" rows="3" style="resize: vertical"></textarea>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>

                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                    <li><span class="require"><em class="required"></em>Nakon što dodate proizvod, molimo Vas da na ažuriranju proizvoda odredite i potkategoriju kako bi
                                    potencijalni kupci mogli lakše pronaći Vaš proizvod. Hvala.</span></li>
                                    <li>
                                        <div class="buttons-set">
                                            <button type="submit" title="Submit" class="button submit"> <span> Dodaj </span> </button>
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

  def render(userId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(userId)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (userId) => apply(userId)

  def ref: this.type = this

}


}

/**/
object createItem extends createItem_Scope0.createItem
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 19:38:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/createItem.scala.html
                  HASH: 4c2dbd6370f507bab513b16adb786d8bb6ac87de
                  MATRIX: 761->1|873->18|900->20|911->24|948->25|979->30|1525->549|1540->555|1587->580|3503->2469|3572->2521|3612->2522|3713->2595|3756->2611|3773->2619|3798->2622|3829->2625|3847->2633|3874->2638|3984->2717|4077->2782
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38
                  -- GENERATED --
              */
          