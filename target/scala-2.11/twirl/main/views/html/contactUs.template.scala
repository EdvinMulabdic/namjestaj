
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactUs_Scope0 {
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

class contactUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    """),format.raw/*2.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Kontaktirajte nas</h2>
                    </div>
                    <div class="static-contain">
                        <form  method="POST" role="form" action="" >

                            <fieldset class="group-select">
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Ime<span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="Ime" class="input-text" required>
                                                        </div>
                                                        <div class="input-box name-firstname">
                                                            <label for="lastName">Prezime<span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="lastName" name="lastName" title="Prezime" class="input-text" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="email">Email<span class="required">*</span></label>
                                                        <br>
                                                        <input type="text" id="email" name="email" title="Email" class="input-text" required>
                                                    </div>
                                                    <div class="input-box">
                                                        <label for="phone">Telefon <span class="required">*</span></label>
                                                        <br>
                                                        <input type="text" name="phone" id="phone" title="Telefon" class="input-text" required>
                                                    </div>
                                                </li>
                                                <li class="">
                                                    <label for="message">Poruka <em class="required">*</em></label>
                                                    <br>
                                                    <div class="">
                                                        <textarea name="message" id="message" title="Poruka" class="input-text" cols="5" rows="3" required></textarea>
                                                    </div>
                                                </li>
                                            </ul>
                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                    <li><div class="buttons-set">
                                        <button type="submit" title="Pošalji" class="button submit"> <span> POŠALJI </span> </button>
                                    </div></li>
                                </ul>
                            </fieldset>
                        </form>
                    </div>
                </section>
                <aside class="col-right sidebar col-sm-3">
                    <div class="block block-company">
                        <div class="block-title">Namještaj.ba </div>
                        <div class="block-content">
                            <ol id="recently-viewed-items">
                                <li class="item odd"><a href="about_us.html">About Us</a></li>
                                <li class="item even"><a href="sitemap.html">Sitemap</a></li>
                                <li class="item  odd"><a href="#">Terms of Service</a></li>
                                <li class="item even"><a href="#">Search Terms</a></li>
                                <li class="item last"><strong>Contact Us</strong></li>
                            </ol>
                        </div>
                    </div>
                </aside>
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
object contactUs extends contactUs_Scope0.contactUs
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 19:38:50 CEST 2016
                  SOURCE: E:/namjestaj/app/views/contactUs.scala.html
                  HASH: 3ded638964f6a14cf1973a0fc8db24fad723129b
                  MATRIX: 835->1|846->5|884->7|915->12
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          