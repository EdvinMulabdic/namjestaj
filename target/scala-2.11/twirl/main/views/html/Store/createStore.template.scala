
package views.html.Store

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createStore_Scope0 {
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

class createStore extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-12">
                    <div class="page-title">
                        <h2>Kreiraj objekat</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.Stores.createStore(userId)),format.raw/*13.104*/("""">
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <div class="col-md-6">
                                                <ul>
                                                    <li>
                                                        <div class="customer-name">
                                                            <div class="input-box name-firstname">
                                                                <label for="name">Naziv objekta <span class="required">*</span></label>
                                                                <br>
                                                                <input type="text" id="name" name="name" title="First Name" class="input-text" required>
                                                            </div>

                                                        </div>
                                                    </li>
                                                    <li>
                                                        <div class="input-box">
                                                            <label for="billing:company">Grad <span class="required">*</span>  </label>
                                                            <br>
                                                            <input type="text" id="city" name="city" title="City" class="input-text" required>
                                                        </div>
                                                    </li>
                                                    <li>
                                                        <div class="input-box">
                                                            <label for="billing:email">Adresa <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" name="address" id="address" title="Address" class="input-text" required>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </div>

                                            <div class="col-md-6">
                                                <div class="input-box">
                                                    <p class="text-center">UPUTSTVO</p>

                                                    <p>Kreiranje objekata služi isključivo kako bi potencijalni kupci mogli na mapi vidjeti
                                                        gdje se Vaši objekti nalaze, te odlučiti gdje će obaviti kupovinu. Kada se kreira objekat,
                                                        automatski će biti prikazan na mapi Vaših objekata, na osnovu adrese koju ste unijeli.
                                                        Ukoliko želite promijeniti neki od podataka molimo Vas da to uradite na ažuriranju objekta.
                                                    </p>
                                                </div>

                                            </div>
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
object createStore extends createStore_Scope0.createStore
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Store/createStore.scala.html
                  HASH: c69c4d394119669e2c7a8ff0e7af16fe3988c721
                  MATRIX: 764->1|876->18|903->20|914->24|952->26|983->31|1529->550|1544->556|1593->583
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13
                  -- GENERATED --
              */
          