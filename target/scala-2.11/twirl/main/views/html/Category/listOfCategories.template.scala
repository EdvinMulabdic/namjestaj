
package views.html.Category

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfCategories_Scope0 {
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

class listOfCategories extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: java.util.List[Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista kategorija</h1>
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
                                <th>Naziv kategorije</th>
                                <th class="text-center">Uredi</th>
                                <th class="text-center">Podkategorije</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*38.26*/for(category <- categories) yield /*38.53*/ {_display_(Seq[Any](format.raw/*38.55*/("""
                            """),format.raw/*39.29*/("""<tr class="about" >
                                <td>"""),_display_(/*40.38*/category/*40.46*/.name),format.raw/*40.51*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi kategoriju" href=""""),_display_(/*42.91*/routes/*42.97*/.Categories.updateCategory(category.id)),format.raw/*42.136*/("""" role="button">
                                        <i class=" fa fa-pencil fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Dodaj podkategoriju" href=""""),_display_(/*47.94*/routes/*47.100*/.Categories.listOfSubCategories(category.id)),format.raw/*47.144*/("""" role="button">
                                        <i class=" fa fa-check fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" data-role="delete-item" title="Obriši kategoriju" href=""""),_display_(/*52.116*/routes/*52.122*/.Categories.deleteCategory(category.id)),format.raw/*52.161*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*57.26*/("""
                        """),format.raw/*58.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*64.66*/routes/*64.72*/.Categories.createCategory()),format.raw/*64.100*/("""" >
                            <div class="buttons-set">
                                <button class="button create-account"><span>DODAJ KATEGORIJU</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*78.65*/(""""></script>
    <script src='"""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*79.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(categories:java.util.List[Category]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((java.util.List[Category]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


}

/**/
object listOfCategories extends listOfCategories_Scope0.listOfCategories
              /*
                  -- GENERATED --
                  DATE: Wed Mar 30 14:46:38 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Category/listOfCategories.scala.html
                  HASH: f767636347967ee70c15b9a798fa113c5cfe2977
                  MATRIX: 794->1|927->39|954->41|965->45|1003->47|1034->52|1277->268|1318->300|1358->302|1403->319|1623->512|1637->517|1673->532|1748->576|1789->590|1828->620|1868->622|1913->639|2132->831|2146->836|2180->849|2255->893|2291->902|3113->1697|3156->1724|3196->1726|3253->1755|3337->1812|3354->1820|3380->1825|3560->1978|3575->1984|3636->2023|3985->2345|4001->2351|4067->2395|4438->2738|4454->2744|4515->2783|4778->3015|4831->3040|5100->3282|5115->3288|5165->3316|5551->3675|5566->3681|5627->3721|5684->3751|5699->3757|5769->3806
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|69->38|69->38|69->38|70->39|71->40|71->40|71->40|73->42|73->42|73->42|78->47|78->47|78->47|83->52|83->52|83->52|88->57|89->58|95->64|95->64|95->64|109->78|109->78|109->78|110->79|110->79|110->79
                  -- GENERATED --
              */
          