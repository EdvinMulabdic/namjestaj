
package views.html.AppUser

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logo_Scope0 {
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

class logo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: AppUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.13*/("""
    """),format.raw/*3.32*/("""
        """),format.raw/*4.30*/("""
            """),format.raw/*5.66*/("""
                """),format.raw/*6.132*/("""

                    """),format.raw/*8.39*/("""
                        """),format.raw/*9.53*/("""
                            """),format.raw/*10.71*/("""
                                """),format.raw/*11.129*/("""
                            """),format.raw/*12.39*/("""
                            """),format.raw/*13.58*/("""
                                """),format.raw/*14.102*/("""
                            """),format.raw/*15.39*/("""
                        """),format.raw/*16.35*/("""
                    """),format.raw/*17.31*/("""

                """),format.raw/*19.28*/("""
            """),format.raw/*20.23*/("""

        """),format.raw/*22.19*/("""
    """),format.raw/*23.15*/("""
"""),format.raw/*24.6*/("""
"""),_display_(/*25.2*/main/*25.6*/ {_display_(Seq[Any](format.raw/*25.8*/("""
    """),format.raw/*26.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Logo</h1>
            </div>
        </div>
    </div>
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-md-12" id="tablemargins">
                    <table class="table table-striped table-bordered table-responsive" id="sort">
                        <thead>
                            <tr class="about">
                                <th>Logo</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr class="about" >
                                """),_display_(/*47.34*/if(user.images.size() != 0)/*47.61*/ {_display_(Seq[Any](format.raw/*47.63*/("""
                                """),format.raw/*48.33*/("""<td><img src=""""),_display_(/*48.48*/user/*48.52*/.images.get(0).getSize(100,100)),format.raw/*48.83*/(""""></td>
                                """)))}),format.raw/*49.34*/("""

                                """),format.raw/*51.33*/("""<td class="text-center">
                                """),_display_(/*52.34*/if(user.images.size() != 0)/*52.61*/ {_display_(Seq[Any](format.raw/*52.63*/("""
                                    """),format.raw/*53.37*/("""<a class="fa-buttons" title="Obriši logo" href=""""),_display_(/*53.86*/routes/*53.92*/.Images.deleteLogo(user.images.get(0).public_id)),format.raw/*53.140*/("""" role="button">
                                        <i class=" fa fa-trash-o fa-lg"></i>
                                    </a>
                                """)))}),format.raw/*56.34*/("""
                                """),format.raw/*57.33*/("""</td>
                            </tr>

                        </tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-12 " id="margin-bottom-header">

                        <form method="POST" role="form" action=""""),_display_(/*67.66*/routes/*67.72*/.AppUsers.imagesUpload(user.id)),format.raw/*67.103*/("""" enctype="multipart/form-data"  >

                            <div col-md-6>
                                <div class="form-group">
                                    <div class="col-md-6 col-md-offset-3">
                                        <input id="height" type="file" name="image" class="form-control" multiple accept="image/*"/>
                                    </div>
                                    <div class="buttons-set">
                                        <button class="button check"><span>Dodaj</span></button>
                                    </div>
                                </div>
                            </div>

                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>
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
object logo extends logo_Scope0.logo
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/AppUser/logo.scala.html
                  HASH: 51eae758f17e4ec7991c455fea099069bff82e69
                  MATRIX: 752->1|862->16|890->29|922->61|958->91|998->157|1043->289|1092->329|1144->382|1201->453|1263->582|1320->621|1377->679|1439->781|1496->820|1549->855|1598->886|1644->915|1685->938|1723->958|1756->973|1784->979|1812->981|1824->985|1863->987|1895->992|2790->1860|2826->1887|2866->1889|2927->1922|2969->1937|2982->1941|3034->1972|3106->2013|3168->2047|3253->2105|3289->2132|3329->2134|3394->2171|3470->2220|3485->2226|3555->2274|3754->2442|3815->2475|4136->2769|4151->2775|4204->2806
                  LINES: 27->1|32->1|33->2|34->3|35->4|36->5|37->6|39->8|40->9|41->10|42->11|43->12|44->13|45->14|46->15|47->16|48->17|50->19|51->20|53->22|54->23|55->24|56->25|56->25|56->25|57->26|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|87->56|88->57|98->67|98->67|98->67
                  -- GENERATED --
              */
          