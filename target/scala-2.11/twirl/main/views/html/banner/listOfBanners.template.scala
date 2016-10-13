
package views.html.banner

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfBanners_Scope0 {
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

class listOfBanners extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Banner],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(banners: java.util.List[Banner]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista bannera</h1>
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
                                <th>Banner</th>
                                <th>Link</th>
                                <th>Pozicija</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*38.26*/for(banner <- banners) yield /*38.48*/ {_display_(Seq[Any](format.raw/*38.50*/("""
                            """),format.raw/*39.29*/("""<tr class="about" >
                                <td><img src=""""),_display_(/*40.48*/banner/*40.54*/.image),format.raw/*40.60*/("""" style="width: 100px; height: 100px"></td>
                                <td>"""),_display_(/*41.38*/banner/*41.44*/.link),format.raw/*41.49*/("""</td>
                                <td>"""),_display_(/*42.38*/banner/*42.44*/.bannerPosition),format.raw/*42.59*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Obriši banner" href=""""),_display_(/*44.88*/routes/*44.94*/.Banners.deleteBanner(banner.id)),format.raw/*44.126*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*49.26*/("""
                        """),format.raw/*50.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*56.66*/routes/*56.72*/.Banners.createBannerRender()),format.raw/*56.101*/("""" >
                            <div class="buttons-set">
                                <button class="button submit"> <span> DODAJ BANNER </span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*70.65*/(""""></script>
""")))}))
      }
    }
  }

  def render(banners:java.util.List[Banner]): play.twirl.api.HtmlFormat.Appendable = apply(banners)

  def f:((java.util.List[Banner]) => play.twirl.api.HtmlFormat.Appendable) = (banners) => apply(banners)

  def ref: this.type = this

}


}

/**/
object listOfBanners extends listOfBanners_Scope0.listOfBanners
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/banner/listOfBanners.scala.html
                  HASH: 1c7b8ff0c3cd22f3e915949b5a04464c73fee706
                  MATRIX: 784->1|912->34|939->36|950->40|988->42|1019->47|1259->260|1300->292|1340->294|1385->311|1605->504|1619->509|1655->524|1730->568|1771->582|1810->612|1850->614|1895->631|2114->823|2128->828|2162->841|2237->885|2273->894|3039->1633|3077->1655|3117->1657|3174->1686|3268->1753|3283->1759|3310->1765|3418->1846|3433->1852|3459->1857|3529->1900|3544->1906|3580->1921|3757->2071|3772->2077|3826->2109|4089->2341|4142->2366|4411->2608|4426->2614|4477->2643|4854->2993|4869->2999|4930->3039
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|69->38|69->38|69->38|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|75->44|75->44|75->44|80->49|81->50|87->56|87->56|87->56|101->70|101->70|101->70
                  -- GENERATED --
              */
          