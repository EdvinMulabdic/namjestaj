
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notFound_Scope0 {
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

class notFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    """),format.raw/*2.5*/("""<section class="content-wrapper bounceInUp animated">
        <div class="container margin-bottom-50">
            <div class="std">
                <div class="page-not-found">
                    <h2>404</h2>
                    <h3><img src='"""),_display_(/*7.36*/routes/*7.42*/.Assets.versioned("images/signal.png")),format.raw/*7.80*/("""' alt="error image">Oops! Stranica koju ste tražili nije pronađena!</h3>
                    <div><a href=""""),_display_(/*8.36*/routes/*8.42*/.Application.index()),format.raw/*8.62*/("""" class="btn-home"><span>Vrati se na početnu</span></a></div>
                </div>
            </div>
        </div>
    </section>
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
object notFound extends notFound_Scope0.notFound
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/notFound.scala.html
                  HASH: 5af31dc80e577a758e74322dc046dd4759b62232
                  MATRIX: 833->1|844->5|882->7|913->12|1185->258|1199->264|1257->302|1391->410|1405->416|1445->436
                  LINES: 32->1|32->1|32->1|33->2|38->7|38->7|38->7|39->8|39->8|39->8
                  -- GENERATED --
              */
          