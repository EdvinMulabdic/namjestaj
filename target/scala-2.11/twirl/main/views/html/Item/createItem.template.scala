
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
    """),format.raw/*3.5*/("""<div class="container">
        <div>
            """),_display_(/*5.14*/if(flash.containsKey("success"))/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
                """),format.raw/*6.17*/("""<div class="alert alert-success" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*8.67*/flash/*8.72*/.get("success")),format.raw/*8.87*/("""</span>

                </div>
            """)))}),format.raw/*11.14*/("""
            """),_display_(/*12.14*/if(flash.containsKey("error"))/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
                """),format.raw/*13.17*/("""<div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span>
                    """),_display_(/*16.22*/flash/*16.27*/.get("error")),format.raw/*16.40*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
        """),format.raw/*19.9*/("""</div>
    </div>
    <!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Kreiraj proizvod</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*31.71*/routes/*31.77*/.Items.createItem(userId)),format.raw/*31.102*/("""" >
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
                                                        <div class="input-box name-lastname" >
                                                                <label  for="category">Kategorija<em class="required">*</em></label>
                                                                <select title="Kategorija" class="validate-select" id="category" name="category" aria-required="true">
                                                                    <option value="0">Odaberite kategoriju</option>
                                                                    """),_display_(/*53.70*/for(category <- models.Category.findAllCategories()) yield /*53.122*/{_display_(Seq[Any](format.raw/*53.123*/("""
                                                                        """),format.raw/*54.73*/("""<option value=""""),_display_(/*54.89*/category/*54.97*/.id),format.raw/*54.100*/("""">"""),_display_(/*54.103*/category/*54.111*/.name),format.raw/*54.116*/("""</option>
                                                                    """)))}),format.raw/*55.70*/("""
                                                                """),format.raw/*56.65*/("""</select>
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
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/createItem.scala.html
                  HASH: 69b7445b5acafb9ff01922e06d75e3147fd1e97d
                  MATRIX: 761->1|873->18|900->20|911->24|948->25|979->30|1056->81|1096->113|1135->115|1179->132|1398->325|1411->330|1446->345|1522->390|1563->404|1602->434|1642->436|1687->453|1935->674|1949->679|1983->692|2028->709|2079->729|2115->738|2683->1279|2698->1285|2745->1310|4692->3230|4761->3282|4801->3283|4902->3356|4945->3372|4962->3380|4987->3383|5018->3386|5036->3394|5063->3399|5173->3478|5266->3543
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|49->18|50->19|62->31|62->31|62->31|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|87->56
                  -- GENERATED --
              */
          