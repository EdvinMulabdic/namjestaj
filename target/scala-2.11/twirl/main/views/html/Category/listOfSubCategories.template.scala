
package views.html.Category

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfSubCategories_Scope0 {
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

class listOfSubCategories extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[SubCategory],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subcategories: java.util.List[SubCategory])(categoryId: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.67*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista potkategorija</h1>
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
                                <th>Naziv potkategorije</th>
                                <th class="text-center">Uredi</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*37.26*/for(subcategory <- subcategories) yield /*37.59*/ {_display_(Seq[Any](format.raw/*37.61*/("""
                            """),format.raw/*38.29*/("""<tr class="about" >
                                <td>"""),_display_(/*39.38*/subcategory/*39.49*/.name),format.raw/*39.54*/("""</td>
                                <td class="text-center">
                                    <a class="fa-buttons" title="Uredi potkategoriju" href=""""),_display_(/*41.94*/routes/*41.100*/.Categories.updateSubCategory(subcategory.id)),format.raw/*41.145*/("""" role="button">
                                        <i class=" fa fa-pencil fa-lg"></i>
                                    </a>
                                </td>
                                <td class="text-center">
                                    <a class="fa-buttons" data-role="delete-item" title="Obriši potkategoriju" href=""""),_display_(/*46.119*/routes/*46.125*/.Categories.deleteSubCategory(subcategory.id)),format.raw/*46.170*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*58.66*/routes/*58.72*/.Categories.createSubCategoryRender(categoryId)),format.raw/*58.119*/("""" >
                            <div class="buttons-set">
                                <button class="button"><i class="fa fa-check"></i> <span>DODAJ POTKATEGORIJU</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*72.65*/(""""></script>
    <script src='"""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*73.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(subcategories:java.util.List[SubCategory],categoryId:Integer): play.twirl.api.HtmlFormat.Appendable = apply(subcategories)(categoryId)

  def f:((java.util.List[SubCategory]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (subcategories) => (categoryId) => apply(subcategories)(categoryId)

  def ref: this.type = this

}


}

/**/
object listOfSubCategories extends listOfSubCategories_Scope0.listOfSubCategories
              /*
                  -- GENERATED --
                  DATE: Thu Oct 13 22:16:36 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Category/listOfSubCategories.scala.html
                  HASH: e677469eb98b787e03c3f8b4c5de7aaf9e40dc55
                  MATRIX: 811->1|971->66|998->68|1009->72|1047->74|1078->79|1324->298|1365->330|1405->332|1450->349|1670->542|1684->547|1720->562|1795->606|1836->620|1875->650|1915->652|1960->669|2179->861|2193->866|2227->879|2302->923|2338->932|3088->1655|3137->1688|3177->1690|3234->1719|3318->1776|3338->1787|3364->1792|3547->1948|3563->1954|3630->1999|4005->2346|4021->2352|4088->2397|4351->2629|4404->2654|4673->2896|4688->2902|4757->2949|5159->3324|5174->3330|5235->3370|5292->3400|5307->3406|5377->3455
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|52->21|53->22|68->37|68->37|68->37|69->38|70->39|70->39|70->39|72->41|72->41|72->41|77->46|77->46|77->46|82->51|83->52|89->58|89->58|89->58|103->72|103->72|103->72|104->73|104->73|104->73
                  -- GENERATED --
              */
          