
package views.html.Admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object itemsReviews_Scope0 {
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

     object itemsReviews_Scope1 {
import helpers.UserAccessLevel

class itemsReviews extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Review],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reviews: java.util.List[Review]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Ocjene proizvoda</h1>
            </div>
        </div>
        <div>
            """),_display_(/*11.14*/if(flash.containsKey("success"))/*11.46*/ {_display_(Seq[Any](format.raw/*11.48*/("""
                """),format.raw/*12.17*/("""<div class="alert alert-success" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*14.67*/flash/*14.72*/.get("success")),format.raw/*14.87*/("""</span>

                </div>
            """)))}),format.raw/*17.14*/("""
            """),_display_(/*18.14*/if(flash.containsKey("error"))/*18.44*/ {_display_(Seq[Any](format.raw/*18.46*/("""
                """),format.raw/*19.17*/("""<div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span>
                    """),_display_(/*22.22*/flash/*22.27*/.get("error")),format.raw/*22.40*/("""
                """),format.raw/*23.17*/("""</div>
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</div>
    </div>
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-md-12" id="tablemargins">
                    <table class="table table-striped table-bordered table-responsive" id="sort">
                        <thead>
                            <tr class="about">
                                <th>Ocjena</th>
                                <th>Ocijenio</th>
                                <th class="text-center">Email</th>
                                <th class="text-center">Telefon</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*42.26*/for(review <- reviews) yield /*42.48*/ {_display_(Seq[Any](format.raw/*42.50*/("""
                                """),format.raw/*43.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*44.42*/review/*44.48*/.mark),format.raw/*44.53*/("""</td>
                                    <td>"""),_display_(/*45.42*/review/*45.48*/.name),format.raw/*45.53*/("""</td>
                                    <td class="text-center">"""),_display_(/*46.62*/review/*46.68*/.email),format.raw/*46.74*/("""</td>
                                    <td class="text-center">"""),_display_(/*47.62*/review/*47.68*/.phone),format.raw/*47.74*/("""</td>

                                    <td class="text-center">
                                        <a class="fa-buttons" data-role="delete-user" title="Obriši ocjenu" href=""""),_display_(/*50.116*/routes/*50.122*/.Reviews.deleteReview(review.id)),format.raw/*50.154*/("""" role="button">
                                            <i class=" fa fa-trash-o fa-lg"></i>
                                        </a>
                                    </td>
                                </tr>

                        """)))}),format.raw/*56.26*/("""
                        """),format.raw/*57.25*/("""</tbody>
                    </table>
                </section>
            </div>

        </div>
    </section>

    <script src=""""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*65.65*/(""""></script>
    <script src='"""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*66.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(reviews:java.util.List[Review]): play.twirl.api.HtmlFormat.Appendable = apply(reviews)

  def f:((java.util.List[Review]) => play.twirl.api.HtmlFormat.Appendable) = (reviews) => apply(reviews)

  def ref: this.type = this

}


}
}

/**/
object itemsReviews extends itemsReviews_Scope0.itemsReviews_Scope1.itemsReviews
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/itemsReviews.scala.html
                  HASH: def11ba601f0ef35c0c7b223d993b27ede8d1dac
                  MATRIX: 847->33|975->66|1002->68|1013->72|1050->73|1081->78|1324->294|1365->326|1405->328|1450->345|1670->538|1684->543|1720->558|1796->603|1837->617|1876->647|1916->649|1961->666|2209->887|2223->892|2257->905|2302->922|2353->942|2389->951|3245->1780|3283->1802|3323->1804|3384->1837|3472->1898|3487->1904|3513->1909|3587->1956|3602->1962|3628->1967|3722->2034|3737->2040|3764->2046|3858->2113|3873->2119|3900->2125|4111->2308|4127->2314|4181->2346|4461->2595|4514->2620|4675->2754|4690->2760|4751->2800|4808->2830|4823->2836|4893->2885
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|44->11|44->11|44->11|45->12|47->14|47->14|47->14|50->17|51->18|51->18|51->18|52->19|55->22|55->22|55->22|56->23|57->24|58->25|75->42|75->42|75->42|76->43|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|83->50|83->50|83->50|89->56|90->57|98->65|98->65|98->65|99->66|99->66|99->66
                  -- GENERATED --
              */
          