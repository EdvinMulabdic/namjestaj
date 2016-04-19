
package views.html.Store

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateStore_Scope0 {
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

class updateStore extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Store,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(store: Store):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Ažuriraj objekat</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.Stores.updateStore(store.id)),format.raw/*13.106*/("""">
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv objekta <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="First Name" class="input-text" value=""""),_display_(/*23.148*/store/*23.153*/.name),format.raw/*23.158*/("""" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="billing:company">Grad <span class="required">*</span>  </label>
                                                        <br>
                                                        <input type="text" id="city" name="city" title="City" class="input-text" value=""""),_display_(/*31.138*/store/*31.143*/.city),format.raw/*31.148*/("""" required>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="billing:email">Adresa <span class="required">*</span></label>
                                                        <br>
                                                        <input type="text" name="address" id="address" title="Address" class="input-text" value=""""),_display_(/*38.147*/store/*38.152*/.address),format.raw/*38.160*/("""" required>
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

  def render(store:Store): play.twirl.api.HtmlFormat.Appendable = apply(store)

  def f:((Store) => play.twirl.api.HtmlFormat.Appendable) = (store) => apply(store)

  def ref: this.type = this

}


}

/**/
object updateStore extends updateStore_Scope0.updateStore
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 19:38:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Store/updateStore.scala.html
                  HASH: 576b1db985853630dd3c4f759a88cb4fd19bf908
                  MATRIX: 762->1|871->15|898->17|909->21|947->23|978->28|1524->547|1539->553|1590->582|2401->1365|2416->1370|2443->1375|3118->2022|3133->2027|3160->2032|3779->2623|3794->2628|3824->2636
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23|62->31|62->31|62->31|69->38|69->38|69->38
                  -- GENERATED --
              */
          