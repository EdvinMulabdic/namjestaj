
package views.html.Category

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateCategory_Scope0 {
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

class updateCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Category,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(category: Category):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Ažuriraj kategoriju</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.Categories.updateCategory(category.id)),format.raw/*13.116*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv kategorije <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="Naziv proizvoda" class="input-text" value=""""),_display_(/*23.153*/category/*23.161*/.name),format.raw/*23.166*/("""" required>
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

  def render(category:Category): play.twirl.api.HtmlFormat.Appendable = apply(category)

  def f:((Category) => play.twirl.api.HtmlFormat.Appendable) = (category) => apply(category)

  def ref: this.type = this

}


}

/**/
object updateCategory extends updateCategory_Scope0.updateCategory
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 19:38:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Category/updateCategory.scala.html
                  HASH: a2f73b6315285ae7dc5e2ef1b82a5f221168e626
                  MATRIX: 774->1|889->21|916->23|927->27|965->29|996->34|1545->556|1560->562|1621->601|2441->1393|2459->1401|2486->1406
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23
                  -- GENERATED --
              */
          