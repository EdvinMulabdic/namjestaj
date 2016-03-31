
package views.html.Category

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateSubCategory_Scope0 {
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

class updateSubCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[SubCategory,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subcategory: SubCategory):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Ažuriraj podkategoriju</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.Categories.updateSubCategory(subcategory.id)),format.raw/*13.122*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv podkategorije <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="Naziv podkategorije" class="input-text" value=""""),_display_(/*23.157*/subcategory/*23.168*/.name),format.raw/*23.173*/("""" required>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>
                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
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

""")))}))
      }
    }
  }

  def render(subcategory:SubCategory): play.twirl.api.HtmlFormat.Appendable = apply(subcategory)

  def f:((SubCategory) => play.twirl.api.HtmlFormat.Appendable) = (subcategory) => apply(subcategory)

  def ref: this.type = this

}


}

/**/
object updateSubCategory extends updateSubCategory_Scope0.updateSubCategory
              /*
                  -- GENERATED --
                  DATE: Wed Mar 30 15:13:00 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Category/updateSubCategory.scala.html
                  HASH: 6640e246a1f3f8fa8c5be28ca57374dbdc8dd104
                  MATRIX: 783->1|904->27|931->29|942->33|980->35|1011->40|1563->565|1578->571|1645->616|2472->1415|2493->1426|2520->1431
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23
                  -- GENERATED --
              */
          