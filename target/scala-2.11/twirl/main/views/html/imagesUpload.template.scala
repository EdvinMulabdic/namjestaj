
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object imagesUpload_Scope0 {
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

class imagesUpload extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div style="margin-top: 20%; margin-bottom: 20%">
                <form method="POST" role="form" action=""""),_display_(/*6.58*/routes/*6.64*/.Images.imagesUpload(itemId)),format.raw/*6.92*/("""" enctype="multipart/form-data"  >

                    <div col-md-6>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <input id="height" type="file" name="image" class="form-control" multiple accept="image/*"/>
                            </div>
                            <div class="buttons-set">
                                <button class="button submit"><span>Dodaj</span></button>
                            </div>
                        </div>
                    </div>

                </form>
            </div>

        </div>
    </div>
""")))}))
      }
    }
  }

  def render(itemId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(itemId)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (itemId) => apply(itemId)

  def ref: this.type = this

}


}

/**/
object imagesUpload extends imagesUpload_Scope0.imagesUpload
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:34 CEST 2016
                  SOURCE: E:/namjestaj/app/views/imagesUpload.scala.html
                  HASH: bebb06e9eb6384a621c8203e7dbb32dcbb2b870d
                  MATRIX: 760->1|872->18|900->21|911->25|949->27|981->33|1179->205|1193->211|1241->239
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          