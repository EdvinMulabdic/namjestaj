
package views.html.Item

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfImages_Scope0 {
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

class listOfImages extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[Image],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(images: java.util.List[Image])(itemId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista slika</h1>
            </div>
        </div>
        <div>
            """),_display_(/*10.14*/if(flash.containsKey("success"))/*10.46*/ {_display_(Seq[Any](format.raw/*10.48*/("""
                """),format.raw/*11.17*/("""<div class="alert alert-success" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*13.67*/flash/*13.72*/.get("success")),format.raw/*13.87*/("""</span>
                </div>
            """)))}),format.raw/*15.14*/("""
            """),_display_(/*16.14*/if(flash.containsKey("error"))/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
                """),format.raw/*17.17*/("""<div class="alert alert-danger" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*19.67*/flash/*19.72*/.get("error")),format.raw/*19.85*/("""</span>
                </div>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</div>
    </div>
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-md-12" id="tablemargins">
                    <table class="table table-striped table-bordered table-responsive" id="sort">
                        <thead>
                            <tr class="about">
                                <th>Naziv slike</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*36.26*/for(image <- images) yield /*36.46*/ {_display_(Seq[Any](format.raw/*36.48*/("""
                            """),format.raw/*37.29*/("""<tr class="about" >
                                <td><img src=""""),_display_(/*38.48*/image/*38.53*/.getSize(100,100)),format.raw/*38.70*/(""""></td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Obriši proizvod" href=""""),_display_(/*40.90*/routes/*40.96*/.Images.deleteImage(image.public_id)),format.raw/*40.132*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*45.26*/("""
                        """),format.raw/*46.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*52.66*/routes/*52.72*/.Images.imagesUploadRender(itemId)),format.raw/*52.106*/("""" >
                            <div class="buttons-set">
                                <button class="button submit"> <span> DODAJ SLIKU </span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*66.65*/(""""></script>
""")))}))
      }
    }
  }

  def render(images:java.util.List[Image],itemId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(images)(itemId)

  def f:((java.util.List[Image]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (images) => (itemId) => apply(images)(itemId)

  def ref: this.type = this

}


}

/**/
object listOfImages extends listOfImages_Scope0.listOfImages
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:37 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Item/listOfImages.scala.html
                  HASH: 73b293f4153b2a97ce6448d4ab8acd6edacad076
                  MATRIX: 787->1|930->49|957->51|968->55|1006->57|1037->62|1275->273|1316->305|1356->307|1401->324|1621->517|1635->522|1671->537|1746->581|1787->595|1826->625|1866->627|1911->644|2130->836|2144->841|2178->854|2253->898|2289->907|2964->1555|3000->1575|3040->1577|3097->1606|3191->1673|3205->1678|3243->1695|3424->1849|3439->1855|3497->1891|3760->2123|3813->2148|4082->2390|4097->2396|4153->2430|4529->2779|4544->2785|4605->2825
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|67->36|67->36|67->36|68->37|69->38|69->38|69->38|71->40|71->40|71->40|76->45|77->46|83->52|83->52|83->52|97->66|97->66|97->66
                  -- GENERATED --
              */
          