
package views.html.AppUser

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object description_Scope0 {
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

class description extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: AppUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
  """),format.raw/*3.3*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-md-12">
                    <div class="page-title">
                        <h2>Kratki opis firme</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.AppUsers.userDescription(user.id)),format.raw/*13.111*/("""" enctype="multipart/form-data" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="text">Tekst <em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="text" id="text" title="Tekst" class="input-text" minlength="350" cols="50" rows="10" style="resize: vertical">"""),_display_(/*23.188*/user/*23.192*/.description),format.raw/*23.204*/("""</textarea>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>
                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                    <li>
                                        <div class="buttons-set">
                                            <button type="submit" title="Submit" class="button submit"> <span> Dodaj opis </span> </button>
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

    <script>
        $(document).ready(function()"""),format.raw/*48.37*/("""{"""),format.raw/*48.38*/("""
  """),format.raw/*49.3*/("""$('form textarea[minlength]').on('keyup', function()"""),format.raw/*49.55*/("""{"""),format.raw/*49.56*/("""
    """),format.raw/*50.5*/("""e_len = $(this).val().trim().length;
    e_min_len = Number($(this).attr('minlength'));
    message = e_min_len <= e_len ? '' : e_min_len + ' karaktera minimalno';
    this.setCustomValidity(message)
  """),format.raw/*54.3*/("""}"""),format.raw/*54.4*/(""")
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/(""")
    </script>
""")))}))
      }
    }
  }

  def render(user:AppUser): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((AppUser) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object description extends description_Scope0.description
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/AppUser/description.scala.html
                  HASH: 842a2b3649c7ba955e757048222762c7f3550cf6
                  MATRIX: 766->1|876->16|904->19|915->23|952->24|982->28|1540->559|1555->565|1611->599|2455->1415|2469->1419|2503->1431|3637->2537|3666->2538|3697->2542|3777->2594|3806->2595|3839->2601|4072->2807|4100->2808|4130->2811|4158->2812
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23|79->48|79->48|80->49|80->49|80->49|81->50|85->54|85->54|86->55|86->55
                  -- GENERATED --
              */
          