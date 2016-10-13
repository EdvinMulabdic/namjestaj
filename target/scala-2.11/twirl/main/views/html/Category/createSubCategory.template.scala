
package views.html.Category

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createSubCategory_Scope0 {
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

class createSubCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categoryId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Kreiraj podkategoriju</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*12.71*/routes/*12.77*/.Categories.createSubCategory(categoryId)),format.raw/*12.118*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv podkategorije <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="Naziv proizvoda" class="input-text" required>
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

  def render(categoryId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(categoryId)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (categoryId) => apply(categoryId)

  def ref: this.type = this

}


}

/**/
object createSubCategory extends createSubCategory_Scope0.createSubCategory
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Category/createSubCategory.scala.html
                  HASH: 220d5bfd74c61944149e51cb8f58fe833c0affb5
                  MATRIX: 779->1|895->22|923->25|934->29|972->31|1004->37|1536->542|1551->548|1614->589
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|43->12|43->12|43->12
                  -- GENERATED --
              */
          