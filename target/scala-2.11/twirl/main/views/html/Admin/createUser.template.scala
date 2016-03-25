
package views.html.Admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createUser_Scope0 {
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

class createUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
    """),format.raw/*2.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Kreiraj korisnika</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*12.71*/routes/*12.77*/.AppUsers.createUser()),format.raw/*12.99*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Naziv firme <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="First Name" class="input-text" required>
                                                        </div>
                                                        <div class="input-box name-lastname">
                                                            <label for="email"> Email  <span class="required">*</span> </label>
                                                            <br>
                                                            <input type="text" id="email" name="email" title="Email" class="input-text" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="billing:company">Grad <span class="required">*</span>  </label>
                                                        <br>
                                                        <input type="text" id="city" name="city" title="City" class="input-text" required>
                                                    </div>
                                                    <div class="input-box">
                                                        <label for="billing:email">Adresa <span class="required">*</span></label>
                                                        <br>
                                                        <input type="text" name="address" id="address" title="Address" class="input-text" required>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="phone">Telefon <span class="required">*</span>  </label>
                                                        <br>
                                                        <input type="text" id="phone" name="phone" title="Phone" class="input-text" required>
                                                    </div>
                                                    <div class="input-box">
                                                        <label for="password">Password <span class="required">*</span> </label>
                                                        <br>
                                                        <input type="password" id="password" name="password" title="Password" class="input-text" required>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object createUser extends createUser_Scope0.createUser
              /*
                  -- GENERATED --
                  DATE: Thu Mar 24 19:05:53 CET 2016
                  SOURCE: E:/namjestaj/app/views/Admin/createUser.scala.html
                  HASH: c1a48fb41cc6d121901134cec768a7b0dff9bcf9
                  MATRIX: 843->1|854->5|891->6|923->12|1480->542|1495->548|1538->570
                  LINES: 32->1|32->1|32->1|33->2|43->12|43->12|43->12
                  -- GENERATED --
              */
          