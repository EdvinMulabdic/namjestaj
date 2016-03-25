
package views.html.Admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfUsers_Scope0 {
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

     object listOfUsers_Scope1 {
import helpers.UserAccessLevel

class listOfUsers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[AppUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: java.util.List[AppUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="text-center" id="margin-bottom-admin">
                <h1>Lista korisnika</h1>
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
                                <th>Naziv firme</th>
                                <th>Email</th>
                                <th class="text-center">Telefon</th>
                                <th class="text-center">Grad</th>
                                <th class="text-center">Adresa</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*43.26*/for(user <- users) yield /*43.44*/ {_display_(Seq[Any](format.raw/*43.46*/("""
                            """),_display_(/*44.30*/if(user.userAccessLevel != UserAccessLevel.ADMIN)/*44.79*/ {_display_(Seq[Any](format.raw/*44.81*/("""
                                """),format.raw/*45.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*46.42*/user/*46.46*/.name),format.raw/*46.51*/("""</td>
                                    <td>"""),_display_(/*47.42*/user/*47.46*/.email),format.raw/*47.52*/("""</td>
                                    <td class="text-center">"""),_display_(/*48.62*/user/*48.66*/.phone),format.raw/*48.72*/("""</td>
                                    <td class="text-center">"""),_display_(/*49.62*/user/*49.66*/.city),format.raw/*49.71*/("""</td>
                                    <td class="text-center">"""),_display_(/*50.62*/user/*50.66*/.address),format.raw/*50.74*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" data-role="delete-user" title="Obriši korisnika" href=""""),_display_(/*52.119*/routes/*52.125*/.AppUsers.deleteUser(user.id)),format.raw/*52.154*/("""" role="button">
                                            <i class=" fa fa-trash-o fa-lg"></i>
                                        </a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*57.30*/("""
                        """)))}),format.raw/*58.26*/("""
                        """),format.raw/*59.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*65.66*/routes/*65.72*/.AppUsers.createUserRender()),format.raw/*65.100*/("""" >
                            <div class="buttons-set">
                                <button class="button create-account"><span>DODAJ KORISNIKA</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*79.65*/(""""></script>
    <script src='"""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*80.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(users:java.util.List[AppUser]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((java.util.List[AppUser]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}
}

/**/
object listOfUsers extends listOfUsers_Scope0.listOfUsers_Scope1.listOfUsers
              /*
                  -- GENERATED --
                  DATE: Thu Mar 24 21:35:37 CET 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfUsers.scala.html
                  HASH: cd7c4249aff08d7581f21217763e8d81f6d79ec3
                  MATRIX: 845->33|972->65|999->67|1010->71|1047->72|1078->77|1320->292|1361->324|1401->326|1446->343|1666->536|1680->541|1716->556|1792->601|1833->615|1872->645|1912->647|1957->664|2205->885|2219->890|2253->903|2298->920|2349->940|2385->949|3310->1847|3344->1865|3384->1867|3441->1897|3499->1946|3539->1948|3600->1981|3688->2042|3701->2046|3727->2051|3801->2098|3814->2102|3841->2108|3935->2175|3948->2179|3975->2185|4069->2252|4082->2256|4108->2261|4202->2328|4215->2332|4244->2340|4457->2525|4473->2531|4524->2560|4807->2812|4864->2838|4917->2863|5186->3105|5201->3111|5251->3139|5636->3497|5651->3503|5712->3543|5769->3573|5784->3579|5854->3628
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|44->11|44->11|44->11|45->12|47->14|47->14|47->14|50->17|51->18|51->18|51->18|52->19|55->22|55->22|55->22|56->23|57->24|58->25|76->43|76->43|76->43|77->44|77->44|77->44|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|85->52|90->57|91->58|92->59|98->65|98->65|98->65|112->79|112->79|112->79|113->80|113->80|113->80
                  -- GENERATED --
              */
          