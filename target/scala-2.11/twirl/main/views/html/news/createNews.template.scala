
package views.html.news

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createNews_Scope0 {
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

class createNews extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
    """),format.raw/*2.5*/("""<!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-md-12">
                    <div class="page-title">
                        <h2>Kreiraj vijest</h2>
                    </div>
                    <div class="static-contain">
                        <fieldset class="group-select">
                            <form  method="POST" role="form" action=""""),_display_(/*12.71*/routes/*12.77*/.NewsController.createNews()),format.raw/*12.105*/("""" enctype="multipart/form-data" >
                                <ul>
                                    <li id="billing-new-address-form">
                                        <fieldset>
                                            <ul>
                                                <li>
                                                    <div class="customer-name">
                                                        <div class="input-box name-firstname">
                                                            <label for="title">Naslov  <span class="required">*</span></label>
                                                            <br>
                                                            <input type="text" id="title" name="title" title="Naslov" class="input-text" required>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="input-box">
                                                        <label for="text">Tekst <em class="required">*</em></label>
                                                        <br>
                                                        <div class="">
                                                            <textarea name="text" id="text" title="Tekst" class="input-text" minlength="500" cols="20" rows="10" style="resize: vertical"></textarea>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>
                                            <div col-md-6>
                                                <div class="form-group">
                                                    <div class="col-md-6">
                                                        <label for="image">Dodaj sliku <em class="required">*</em></label>
                                                        <input id="height" type="file" name="image" class="form-control" multiple accept="image/*" required/>
                                                    </div>
                                                </div>
                                            </div>

                                        </fieldset>
                                    </li>
                                    <li><span class="require"><em class="required">* </em>Obavezna polja</span></li>
                                    <li>
                                        <div class="buttons-set">
                                            <button type="submit" title="Submit" class="button submit"> <span> Dodaj vijest </span> </button>
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
        $(document).ready(function()"""),format.raw/*65.37*/("""{"""),format.raw/*65.38*/("""
  """),format.raw/*66.3*/("""$('form textarea[minlength]').on('keyup', function()"""),format.raw/*66.55*/("""{"""),format.raw/*66.56*/("""
    """),format.raw/*67.5*/("""e_len = $(this).val().trim().length;
    e_min_len = Number($(this).attr('minlength'));
    message = e_min_len <= e_len ? '' : e_min_len + ' karaktera minimalno';
    this.setCustomValidity(message)
  """),format.raw/*71.3*/("""}"""),format.raw/*71.4*/(""")
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/(""")
    </script>
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
object createNews extends createNews_Scope0.createNews
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:37 CEST 2016
                  SOURCE: E:/namjestaj/app/views/news/createNews.scala.html
                  HASH: 2bed6228a546f6d85fec3d5848a5a1a78b834c0e
                  MATRIX: 842->1|853->5|890->6|922->12|1477->540|1492->546|1542->574|4908->3912|4937->3913|4968->3917|5048->3969|5077->3970|5110->3976|5343->4182|5371->4183|5401->4186|5429->4187
                  LINES: 32->1|32->1|32->1|33->2|43->12|43->12|43->12|96->65|96->65|97->66|97->66|97->66|98->67|102->71|102->71|103->72|103->72
                  -- GENERATED --
              */
          