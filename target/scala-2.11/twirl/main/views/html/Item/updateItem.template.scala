
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
                        <h2>Ažuriraj proizvod</h2>
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

                                                        <div class="input-box">
                                                            <label for="price">Cijena <span class="required">*</span>  </label>
                                                            <br>
                                                            <input type="text" id="price" name="price" title="Cijena" class="input-text" value=""""),_display_(/*29.146*/item/*29.150*/.price),format.raw/*29.156*/("""" required>
                                                        </div>
                                                        <div class="input-box name-lastname">

                                                            <label  for="category">Kategorija<em class="required">*</em></label>

                                                            <select title="Kategorija" class="validate-select" id="category" name="category">
                                                                <option selected disabled>"""),_display_(/*36.92*/item/*36.96*/.category.name),format.raw/*36.110*/("""</option>
                                                                """),_display_(/*37.66*/for(category <- models.Category.findAllCategories()) yield /*37.118*/{_display_(Seq[Any](format.raw/*37.119*/("""
                                                                    """),format.raw/*38.69*/("""<option value=""""),_display_(/*38.85*/category/*38.93*/.id),format.raw/*38.96*/("""">"""),_display_(/*38.99*/category/*38.107*/.name),format.raw/*38.112*/("""</option>
                                                                """)))}),format.raw/*39.66*/("""
                                                            """),format.raw/*40.61*/("""</select>

                                                        </div>
                                                    </div>
                                                </li>
                                                <li>

                                                    <div class="input-box">
                                                        <label for="description">Comment<em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="description" id="description" title="Opis" class="input-text" cols="5" rows="3" style="resize: vertical">"""),_display_(/*51.183*/item/*51.187*/.description),format.raw/*51.199*/("""</textarea>
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
                  DATE: Fri Mar 25 02:10:38 CET 2016
                  SOURCE: E:/namjestaj/app/views/Item/updateItem.scala.html
                  HASH: 75fbee67ce5523495143d87e5aacc67a8d653af7
                  MATRIX: 758->1|865->13|892->15|903->19|941->21|972->26|1519->546|1534->552|1582->578|2401->1369|2415->1373|2442->1378|2964->1872|2978->1876|3006->1882|3566->2415|3579->2419|3615->2433|3717->2508|3786->2560|3826->2561|3923->2630|3966->2646|3983->2654|4007->2657|4037->2660|4055->2668|4082->2673|4188->2748|4277->2809|5060->3564|5074->3568|5108->3580
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23|60->29|60->29|60->29|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|71->40|82->51|82->51|82->51
                  -- GENERATED --
              */
          