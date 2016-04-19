
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
                                <th class="text-center">Poruke</th>
                                <th class="text-center">Blokiraj</th>
                                <th class="text-center">Obriši</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*45.26*/for(user <- users) yield /*45.44*/ {_display_(Seq[Any](format.raw/*45.46*/("""
                            """),_display_(/*46.30*/if(user.userAccessLevel != UserAccessLevel.ADMIN)/*46.79*/ {_display_(Seq[Any](format.raw/*46.81*/("""
                                """),format.raw/*47.33*/("""<tr class="about" >
                                    <td>"""),_display_(/*48.42*/user/*48.46*/.name),format.raw/*48.51*/("""</td>
                                    <td>"""),_display_(/*49.42*/user/*49.46*/.email),format.raw/*49.52*/("""</td>
                                    <td class="text-center">"""),_display_(/*50.62*/user/*50.66*/.phone),format.raw/*50.72*/("""</td>
                                    <td class="text-center">"""),_display_(/*51.62*/user/*51.66*/.city),format.raw/*51.71*/("""</td>
                                    <td class="text-center">"""),_display_(/*52.62*/user/*52.66*/.address),format.raw/*52.74*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" title="Poruke korisnika" href=""""),_display_(/*54.95*/routes/*54.101*/.Messages.listOfMessagesForAdmin(user.id)),format.raw/*54.142*/("""" role="button">
                                            <i class=" fa fa-envelope-o fa-lg"></i>
                                        </a>
                                    </td>
                                    <td class="text-center">
                                    """),_display_(/*59.38*/if(user.isActive == null || user.isActive == false)/*59.89*/ {_display_(Seq[Any](format.raw/*59.91*/("""
                                        """),format.raw/*60.41*/("""<a class="fa-buttons"  title="AKTIVIRAJ" href=""""),_display_(/*60.89*/routes/*60.95*/.AppUsers.isUserActive(user.id)),format.raw/*60.126*/("""" role="button">
                                            <button id="send2"  type="submit" class="button"><i class="fa fa-check"></i> <span>AKTIVIRAJ</span></button>
                                        </a>
                                    """)))}/*63.39*/else/*63.44*/{_display_(Seq[Any](format.raw/*63.45*/("""
                                        """),format.raw/*64.41*/("""<a class="fa-buttons" title="BLOKIRAJ" href=""""),_display_(/*64.87*/routes/*64.93*/.AppUsers.isUserActive(user.id)),format.raw/*64.124*/("""" role="button">
                                            <button id="send2" type="submit" class="button"><i class="fa fa-close"></i> <span>BLOKIRAJ</span></button>
                                        </a>
                                    """)))}),format.raw/*67.38*/("""
                                    """),format.raw/*68.37*/("""</td>
                                    <td class="text-center">
                                        <a class="fa-buttons" data-role="delete-user" title="Obriši korisnika" href=""""),_display_(/*70.119*/routes/*70.125*/.AppUsers.deleteUser(user.id)),format.raw/*70.154*/("""" role="button">
                                            <i class=" fa fa-trash-o fa-lg"></i>
                                        </a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*75.30*/("""
                        """)))}),format.raw/*76.26*/("""
                        """),format.raw/*77.25*/("""</tbody>
                    </table>
                </section>

                <section>
                    <div class="col-md-6 col-md-offset-5" id="margin-bottom-header">
                        <form  method="GET" role="form" action=""""),_display_(/*83.66*/routes/*83.72*/.AppUsers.createUserRender()),format.raw/*83.100*/("""" >
                            <div class="buttons-set">
                                <button class="button create-account"><span>DODAJ KORISNIKA</span></button>
                            </div>
                        </form>

                    </div>
                </section>

            </div>

        </div>
    </section>

    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("javascripts/sort.js")),format.raw/*97.65*/(""""></script>
    <script src='"""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("javascripts/deleteConfirm.js")),format.raw/*98.74*/("""'></script>
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
                  DATE: Mon Apr 18 19:38:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/listOfUsers.scala.html
                  HASH: aec4fce8f329d46fce63a12a7bfd002694e70a2d
                  MATRIX: 845->33|972->65|999->67|1010->71|1047->72|1078->77|1320->292|1361->324|1401->326|1446->343|1666->536|1680->541|1716->556|1792->601|1833->615|1872->645|1912->647|1957->664|2205->885|2219->890|2253->903|2298->920|2349->940|2385->949|3448->1985|3482->2003|3522->2005|3579->2035|3637->2084|3677->2086|3738->2119|3826->2180|3839->2184|3865->2189|3939->2236|3952->2240|3979->2246|4073->2313|4086->2317|4113->2323|4207->2390|4220->2394|4246->2399|4340->2466|4353->2470|4382->2478|4570->2639|4586->2645|4649->2686|4962->2972|5022->3023|5062->3025|5131->3066|5206->3114|5221->3120|5274->3151|5545->3404|5558->3409|5597->3410|5666->3451|5739->3497|5754->3503|5807->3534|6088->3784|6153->3821|6366->4006|6382->4012|6433->4041|6716->4293|6773->4319|6826->4344|7095->4586|7110->4592|7160->4620|7545->4978|7560->4984|7621->5024|7678->5054|7693->5060|7763->5109
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|44->11|44->11|44->11|45->12|47->14|47->14|47->14|50->17|51->18|51->18|51->18|52->19|55->22|55->22|55->22|56->23|57->24|58->25|78->45|78->45|78->45|79->46|79->46|79->46|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|84->51|84->51|84->51|85->52|85->52|85->52|87->54|87->54|87->54|92->59|92->59|92->59|93->60|93->60|93->60|93->60|96->63|96->63|96->63|97->64|97->64|97->64|97->64|100->67|101->68|103->70|103->70|103->70|108->75|109->76|110->77|116->83|116->83|116->83|130->97|130->97|130->97|131->98|131->98|131->98
                  -- GENERATED --
              */
          