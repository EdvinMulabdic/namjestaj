
package views.html.partner

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object partnerMain_Scope0 {
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

     object partnerMain_Scope1 {
import helpers.UserAccessLevel

class partnerMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[AppUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: java.util.List[AppUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    """),format.raw/*4.5*/("""<!-- Main Container -->
    <section class="main-container col2-left-layout bounceInUp animated">
        <div class="container">
            <div class="row">
                <div class="col-main col-md-12">
                    <article class="col-main">
                        <div class="page-title">
                            <h2>Partneri</h2>
                        </div>
                        <div class="toolbar">
                            <div class="pager">
                                <div class="pages">
                                    <ul class="pagination">
                                        <div id='page_navigation' class="pagination-custom"></div>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="category-products">
                            <ol class="products-list" id="easyPaginate">
                                """),_display_(/*24.34*/for(user <- users) yield /*24.52*/ {_display_(Seq[Any](format.raw/*24.54*/("""
                                    """),format.raw/*25.37*/("""<li class="item first">
                                        <div class="product-image">
                                            """),_display_(/*27.46*/if(user.images.size() != 0 )/*27.74*/ {_display_(Seq[Any](format.raw/*27.76*/("""
                                                """),format.raw/*28.49*/("""<img class="small-image" src='"""),_display_(/*28.80*/user/*28.84*/.images.get(0).getSize(200,100)),format.raw/*28.115*/("""' alt="300X200">
                                            """)))}),format.raw/*29.46*/("""
                                            """),_display_(/*30.46*/if(user.images.size() == 0)/*30.73*/ {_display_(Seq[Any](format.raw/*30.75*/("""
                                                """),format.raw/*31.49*/("""<img class="small-image" src='' alt=""""),_display_(/*31.87*/user/*31.91*/.name),format.raw/*31.96*/("""">
                                            """)))}),format.raw/*32.46*/("""

                                        """),format.raw/*34.41*/("""</div>
                                        <div class="product-shop">
                                            <h2 class="product-name"><a href="product_detail.html" title="Naziv">"""),_display_(/*36.115*/user/*36.119*/.name),format.raw/*36.124*/("""</a></h2>
                                            <div class="desc std">
                                                <p>Adresa: """),_display_(/*38.61*/user/*38.65*/.address),format.raw/*38.73*/(""", """),_display_(/*38.76*/user/*38.80*/.city),format.raw/*38.85*/(""" """),format.raw/*38.86*/("""</p>
                                                <p>Email: """),_display_(/*39.60*/user/*39.64*/.email),format.raw/*39.70*/("""</p>
                                                <p>Radno vrijeme: """),_display_(/*40.68*/user/*40.72*/.workTime),format.raw/*40.81*/("""</p>
                                                """),format.raw/*41.99*/("""
                                            """),format.raw/*42.45*/("""</div>
                                            <form method="GET" role="form" action=""""),_display_(/*43.85*/routes/*43.91*/.Partners.partnerPageRender(user.id)),format.raw/*43.127*/("""">
                                                <div class="actions">
                                                    <button class="button" title="Pročitaj"><i class="fa fa-eye"></i> <span>Pročitaj</span></button>

                                                </div>
                                            </form>
                                        </div>
                                    </li>
                                """)))}),format.raw/*51.34*/("""
                            """),format.raw/*52.29*/("""</ol>
                        </div>
                    </article>
                        <!--	///*///======    End article  ========= //*/// -->
                </div>
            </div>
        </div>
    </section>
    <input type='hidden' id='current_page' />
    <input type='hidden' id='show_per_page' />

    <script src='"""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("javascripts/paginacija.js")),format.raw/*63.71*/("""'></script>
    <!-- Main Container End -->
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
object partnerMain extends partnerMain_Scope0.partnerMain_Scope1.partnerMain
              /*
                  -- GENERATED --
                  DATE: Mon May 16 18:07:10 CEST 2016
                  SOURCE: E:/namjestaj/app/views/partner/partnerMain.scala.html
                  HASH: 4af19da9d8b52184ee3006720a86fcc50e78c54e
                  MATRIX: 847->33|974->65|1001->67|1012->71|1050->73|1081->78|2104->1074|2138->1092|2178->1094|2243->1131|2407->1268|2444->1296|2484->1298|2561->1347|2619->1378|2632->1382|2685->1413|2778->1475|2851->1521|2887->1548|2927->1550|3004->1599|3069->1637|3082->1641|3108->1646|3187->1694|3257->1736|3473->1924|3487->1928|3514->1933|3678->2070|3691->2074|3720->2082|3750->2085|3763->2089|3789->2094|3818->2095|3909->2159|3922->2163|3949->2169|4048->2241|4061->2245|4091->2254|4172->2357|4245->2402|4363->2493|4378->2499|4436->2535|4919->2987|4976->3016|5335->3348|5350->3354|5417->3400
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|57->24|57->24|57->24|58->25|60->27|60->27|60->27|61->28|61->28|61->28|61->28|62->29|63->30|63->30|63->30|64->31|64->31|64->31|64->31|65->32|67->34|69->36|69->36|69->36|71->38|71->38|71->38|71->38|71->38|71->38|71->38|72->39|72->39|72->39|73->40|73->40|73->40|74->41|75->42|76->43|76->43|76->43|84->51|85->52|96->63|96->63|96->63
                  -- GENERATED --
              */
          