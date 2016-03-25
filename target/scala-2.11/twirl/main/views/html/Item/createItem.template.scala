
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
                                                                    """),_display_(/*37.70*/for(category <- models.Category.findAllCategories()) yield /*37.122*/{_display_(Seq[Any](format.raw/*37.123*/("""
                                                                        """),format.raw/*38.73*/("""<option value=""""),_display_(/*38.89*/category/*38.97*/.id),format.raw/*38.100*/("""">"""),_display_(/*38.103*/category/*38.111*/.name),format.raw/*38.116*/("""</option>
                                                                    """)))}),format.raw/*39.70*/("""
                                                                """),format.raw/*40.65*/("""</select>

                                                        </div>
                                                    </div>
                                                </li>
                                                <li>

                                                    <div class="input-box">
                                                        <label for="description">Comment<em class="required">*</em></label>
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
                  DATE: Fri Mar 25 02:08:38 CET 2016
                  SOURCE: E:/namjestaj/app/views/Item/createItem.scala.html
                  HASH: fa8bdda6e57c9c9b26df36e3efafb10afef7447e
                  MATRIX: 761->1|873->18|901->21|912->25|949->26|981->32|1537->561|1552->567|1599->592|3541->2507|3610->2559|3650->2560|3752->2634|3795->2650|3812->2658|3837->2661|3868->2664|3886->2672|3913->2677|4024->2757|4118->2823
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|71->40
                  -- GENERATED --
              */
          