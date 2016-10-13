
package views.html.banner

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createBanner_Scope0 {
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

class createBanner extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    """),format.raw/*2.5*/("""<section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>Kreiraj banner</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action="" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="image">Link slike <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="image" name="image" title="Link slike" class="input-text" required>
	                                                        <br>
	                                                        <label for="link">Link proizvoda  <span class="required">*</span> </label>
	                                                        <br>
	                                                        <input type="text" id="link" name="link" title="Product link" class="input-text" required>
	                                                        <br>
	                                                        <label for="phone">Pozicija bannera <span class="required">*</span>  </label>
	                                                        <br>
	                                                        <input type="number" id="bannerPosition" name="bannerPosition" title="Pozicija bannera" class="input-text" required>
                                                        </div>
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
	<div class="row">
		<div class="product-img-box col-sm-6 col-xs-12">
			<div class="product-image">
				<div class="large-image">
					<img src=""""),_display_(/*54.17*/routes/*54.23*/.Assets.versioned("images/namjestaj-banner.png")),format.raw/*54.71*/("""">
				</div>
			</div>
		</div>
		<div class="product-img-box col-sm-6 col-xs-12">
			<div class="product-image">
				<div class="large-image">
					<img src=""""),_display_(/*61.17*/routes/*61.23*/.Assets.versioned("images/namjestaj-banner2.png")),format.raw/*61.72*/("""">
				</div>
			</div>
		</div>

	</div>
	<div class="row">

	<div class="product-img-box col-sm-6 col-xs-12">
		<div class="product-image">
			<div class="large-image">
				<img src=""""),_display_(/*72.16*/routes/*72.22*/.Assets.versioned("images/namjestaj-banner3.png")),format.raw/*72.71*/("""">
			</div>
		</div>
	</div>
	</div>
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
object createBanner extends createBanner_Scope0.createBanner
              /*
                  -- GENERATED --
                  DATE: Sun Jun 26 10:56:41 CEST 2016
                  SOURCE: E:/namjestaj/app/views/banner/createBanner.scala.html
                  HASH: 9ebd866498fe73d168c1d4edf298a4a2b6aaf429
                  MATRIX: 848->1|859->5|897->7|929->13|4247->3304|4262->3310|4331->3358|4526->3526|4541->3532|4611->3581|4835->3778|4850->3784|4920->3833
                  LINES: 32->1|32->1|32->1|33->2|85->54|85->54|85->54|92->61|92->61|92->61|103->72|103->72|103->72
                  -- GENERATED --
              */
          