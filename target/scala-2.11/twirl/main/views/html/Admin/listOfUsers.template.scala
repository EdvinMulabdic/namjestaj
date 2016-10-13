
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
                                <th class="text-center">Proizvodi</th>
                                <th class="text-center">Poruke</th>
                                <th class="text-center">Blokiraj</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*46.26*/for(user <- users) yield /*46.44*/ {_display_(Seq[Any](format.raw/*46.46*/("""
                            """),_display_(/*47.30*/if(user.userAccessLevel != UserAccessLevel.ADMIN)/*47.79*/ {_display_(Seq[Any](format.raw/*47.81*/("""
                                """),format.raw/*48.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*49.42*/user/*49.46*/.name),format.raw/*49.51*/("""</td>
                                    <td>"""),_display_(/*50.42*/user/*50.46*/.email),format.raw/*50.52*/("""</td>
                                    <td class="text-center">"""),_display_(/*51.62*/user/*51.66*/.phone),format.raw/*51.72*/("""</td>
                                    <td class="text-center">"""),_display_(/*52.62*/user/*52.66*/.city),format.raw/*52.71*/("""</td>
                                    <td class="text-center">"""),_display_(/*53.62*/user/*53.66*/.address),format.raw/*53.74*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" title="Proizvodi" href=""""),_display_(/*55.88*/routes/*55.94*/.Items.usersItems(user.id)),format.raw/*55.120*/("""" role="button">
                                            <i class=" fa fa-list fa-lg"></i>
                                        </a>
                                    </td>
                                    <td class="text-center">
                                        <a class="fa-buttons" title="Poruke korisnika" href=""""),_display_(/*60.95*/routes/*60.101*/.Messages.listOfMessagesForAdmin(user.id)),format.raw/*60.142*/("""" role="button">
                                            <i class=" fa fa-envelope-o fa-lg"></i>
                                        </a>
                                    </td>
                                    <td class="text-center">
                                    """),_display_(/*65.38*/if(user.isActive == null || user.isActive == false)/*65.89*/ {_display_(Seq[Any](format.raw/*65.91*/("""
                                        """),format.raw/*66.41*/("""<a class="fa-buttons"  title="AKTIVIRAJ" href=""""),_display_(/*66.89*/routes/*66.95*/.AppUsers.isUserActive(user.id)),format.raw/*66.126*/("""" role="button">
                                            <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>AKTIVIRAJ</span></button>
                                        </a>
                                    """)))}/*69.39*/else/*69.44*/{_display_(Seq[Any](format.raw/*69.45*/("""
                                        """),format.raw/*70.41*/("""<a class="fa-buttons" title="BLOKIRAJ" href=""""),_display_(/*70.87*/routes/*70.93*/.AppUsers.isUserActive(user.id)),format.raw/*70.124*/("""" role="button">
                                            <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>BLOKIRAJ</span></button>
                                        </a>
                                    """)))}),format.raw/*73.38*/("""
                                    """),format.raw/*74.37*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" data-role="delete-user" title="Obriši korisnika" href=""""),_display_(/*76.119*/routes/*76.125*/.AppUsers.deleteUser(user.id)),format.raw/*76.154*/("""" role="button">
                                            <i class=" fa fa-trash-o fa-lg"></i>
                                        </a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*81.30*/("""
                        """)))}),format.raw/*82.26*/("""
                        """),format.raw/*83.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*89.66*/routes/*89.72*/.AppUsers.createUserRender()),format.raw/*89.100*/("""" >
                            <div class="buttons-set">
                                <button class="button create-account"><span>DODAJ KORISNIKA</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*103.65*/(""""></script>
    <script src='"""),_display_(/*104.19*/routes/*104.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*104.74*/("""'></script>
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
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfUsers.scala.html
                  HASH: 65a07473cf4a2898c2e5e6f24c745f7e0a881bf7
                  MATRIX: 845->33|972->65|999->67|1010->71|1047->72|1078->77|1320->292|1361->324|1401->326|1446->343|1666->536|1680->541|1716->556|1792->601|1833->615|1872->645|1912->647|1957->664|2205->885|2219->890|2253->903|2298->920|2349->940|2385->949|3519->2056|3553->2074|3593->2076|3650->2106|3708->2155|3748->2157|3809->2190|3897->2251|3910->2255|3936->2260|4010->2307|4023->2311|4050->2317|4144->2384|4157->2388|4184->2394|4278->2461|4291->2465|4317->2470|4411->2537|4424->2541|4453->2549|4634->2703|4649->2709|4697->2735|5061->3072|5077->3078|5140->3119|5453->3405|5513->3456|5553->3458|5622->3499|5697->3547|5712->3553|5765->3584|6036->3837|6049->3842|6088->3843|6157->3884|6230->3930|6245->3936|6298->3967|6579->4217|6644->4254|6857->4439|6873->4445|6924->4474|7207->4726|7264->4752|7317->4777|7586->5019|7601->5025|7651->5053|8037->5411|8053->5417|8115->5457|8173->5487|8189->5493|8260->5542
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|44->11|44->11|44->11|45->12|47->14|47->14|47->14|50->17|51->18|51->18|51->18|52->19|55->22|55->22|55->22|56->23|57->24|58->25|79->46|79->46|79->46|80->47|80->47|80->47|81->48|82->49|82->49|82->49|83->50|83->50|83->50|84->51|84->51|84->51|85->52|85->52|85->52|86->53|86->53|86->53|88->55|88->55|88->55|93->60|93->60|93->60|98->65|98->65|98->65|99->66|99->66|99->66|99->66|102->69|102->69|102->69|103->70|103->70|103->70|103->70|106->73|107->74|109->76|109->76|109->76|114->81|115->82|116->83|122->89|122->89|122->89|136->103|136->103|136->103|137->104|137->104|137->104
                  -- GENERATED --
              */
          