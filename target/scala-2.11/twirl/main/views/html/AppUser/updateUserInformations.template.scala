
package views.html.AppUser

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateUserInformations_Scope0 {
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

class updateUserInformations extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: AppUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Ažuriranje podataka</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*13.71*/routes/*13.77*/.AppUsers.updateUserInformations(user.id)),format.raw/*13.118*/("""" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="name">Ime <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="name" name="name" title="First Name" class="input-text" value=""""),_display_(/*23.148*/user/*23.152*/.name),format.raw/*23.157*/("""" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="billing:company">Grad <span class="required">*</span>  </label>
                                                        <br>
                                                        <input type="text" id="city" name="city" title="City" class="input-text" value=""""),_display_(/*31.138*/user/*31.142*/.city),format.raw/*31.147*/("""" required>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="billing:email">Adresa <span class="required">*</span></label>
                                                        <br>
                                                        <input type="text" name="address" id="address" title="Address" class="input-text" value=""""),_display_(/*38.147*/user/*38.151*/.address),format.raw/*38.159*/("""" required>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="phone">Telefon <span class="required">*</span>  </label>
                                                        <br>
                                                        <input type="text" id="phone" name="phone" title="Phone" class="input-text" value=""""),_display_(/*45.141*/user/*45.145*/.phone),format.raw/*45.151*/("""" required>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="workTime">Radno vrijeme  <span class="required">*</span>  </label>
                                                        <br>
                                                        """),_display_(/*52.58*/if(user.workTime != null)/*52.83*/ {_display_(Seq[Any](format.raw/*52.85*/("""
                                                            """),format.raw/*53.61*/("""<input type="text" id="workTime" name="workTime" title="Radno vrijeme" class="input-text" placeholder="npr. 08 h - 16 h" value=""""),_display_(/*53.190*/user/*53.194*/.workTime),format.raw/*53.203*/("""" required>
                                                        """)))}/*54.58*/else/*54.63*/{_display_(Seq[Any](format.raw/*54.64*/("""
                                                            """),format.raw/*55.61*/("""<input type="text" id="workTime" name="workTime" title="Radno vrijeme" class="input-text" value="" placeholder="npr. 08 h - 16 h" required>
                                                            """)))}),format.raw/*56.62*/("""
                                                        """),format.raw/*57.57*/("""</div>
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

  def render(user:AppUser): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((AppUser) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object updateUserInformations extends updateUserInformations_Scope0.updateUserInformations
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 19:38:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/AppUser/updateUserInformations.scala.html
                  HASH: f14590bd76c9e47ea06ba33552756dc99fb4d7b0
                  MATRIX: 788->1|898->16|925->18|936->22|974->24|1005->29|1554->551|1569->557|1632->598|2434->1372|2448->1376|2475->1381|3150->2028|3164->2032|3191->2037|3810->2628|3824->2632|3854->2640|4462->3220|4476->3224|4504->3230|5038->3737|5072->3762|5112->3764|5201->3825|5358->3954|5372->3958|5403->3967|5491->4036|5504->4041|5543->4042|5632->4103|5864->4304|5949->4361
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|54->23|54->23|54->23|62->31|62->31|62->31|69->38|69->38|69->38|76->45|76->45|76->45|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|86->55|87->56|88->57
                  -- GENERATED --
              */
          