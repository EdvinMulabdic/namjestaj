
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginPage_Scope0 {
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

class loginPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
    """),format.raw/*2.5*/("""<!-- Main Container -->
    <section class="main-container col1-layout bounceInUp animated">
        <div class="main container">
            <div class="account-login">
                <fieldset class="col2-set">
                    <legend>Prijavite se ili kreirajte profil</legend>
                    <div class="col-1 new-users"><strong>Novi korisnici</strong>
                        <div class="content">
                            <p>Ukoliko želite kreirati profil molimo Vas da nas kontaktirate putem email-a.
                                Kreiranjem profila biće Vam omogućeno da prezentujete svoje artikle, dodate radnje na mapu, pratite kupovinu,
                                i još mnoge druge pogodnosti.</p>
                            <div class="buttons-set">
                                <button class="button create-account"><span>Kontaktirajte nas</span></button>
                            </div>
                        </div>
                    </div>
                    <div class="col-2 registered-users"><strong>Registrovani korisnici </strong>
                        <form  method="POST" role="form" action=""""),_display_(/*19.67*/routes/*19.73*/.Login.login()),format.raw/*19.87*/("""" >
                            <div class="content">
                                <p>Ukoliko imate profil, molimo Vas da unesete podatke.</p>
                                <ul class="form-list">
                                    <li>
                                        <label for="email">Email Adresa <span class="required">*</span></label>
                                        <br>
                                        <input type="text" title="Email Address" class="input-text" id="email" value="" name="email">
                                    </li>
                                    <li>
                                        <label for="pass">Password <span class="required">*</span></label>
                                        <br>
                                        <input type="password" title="Password" id="pass" class="input-text" name="password">
                                    </li>
                                </ul>
                                <p class="required">* Obavezna polja </p>
                                <div class="buttons-set">
                                    <button id="send2" name="send" type="submit" class="button login"><span>Login</span></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </fieldset>
            </div>
            <br>
            <br>
            <br>
            <br>
            <br>
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
object loginPage extends loginPage_Scope0.loginPage
              /*
                  -- GENERATED --
                  DATE: Thu Mar 24 14:28:11 CET 2016
                  SOURCE: E:/namjestaj/app/views/loginPage.scala.html
                  HASH: 825b2d6e7b0c742fdc206566fc9000124a08e2c5
                  MATRIX: 835->1|846->5|883->6|915->12|2107->1177|2122->1183|2157->1197
                  LINES: 32->1|32->1|32->1|33->2|50->19|50->19|50->19
                  -- GENERATED --
              */
          