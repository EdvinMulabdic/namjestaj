
package views.html.Admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminPanel_Scope0 {
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

class adminPanel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[AppUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: AppUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div>
            """),_display_(/*5.14*/if(flash.containsKey("success"))/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
                """),format.raw/*6.17*/("""<div class="alert alert-success" role="alert">
                    <i class="fa fa-check-square-o" style="font-size:30px"></i>
                    <span  aria-hidden="true" class="flash-font">"""),_display_(/*8.67*/flash/*8.72*/.get("success")),format.raw/*8.87*/("""</span>

                </div>
            """)))}),format.raw/*11.14*/("""
            """),_display_(/*12.14*/if(flash.containsKey("error"))/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
                """),format.raw/*13.17*/("""<div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span>
                    """),_display_(/*16.22*/flash/*16.27*/.get("error")),format.raw/*16.40*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
        """),format.raw/*19.9*/("""</div>
    </div>
    <!-- Main Container -->
    <section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <div class="col-main col-sm-9">
                    <div class="my-account">
                        <div class="page-title">
                            <h2>Admin Panel</h2>
                            <br>
                        </div>
                        <div class="dashboard">
                            <div class="box-account">
                                <div class="page-title">
                                    <h2>Informacije o profilu</h2>
                                </div>
                                <div class="col2-set">
                                    <div class="col-1">
                                        <form  method="GET" role="form" action=""""),_display_(/*38.82*/routes/*38.88*/.AppUsers.updateAdminInformationsRender(user.id)),format.raw/*38.136*/("""" >
                                            <h5>Kontakt Informacije</h5>
                                            <p> Ime: """),_display_(/*40.55*/user/*40.59*/.name),format.raw/*40.64*/(""" """),format.raw/*40.65*/("""<br>
                                                Adresa: """),_display_(/*41.58*/user/*41.62*/.address),format.raw/*41.70*/("""<br>
                                                Grad: """),_display_(/*42.56*/user/*42.60*/.city),format.raw/*42.65*/("""<br>
                                                Telefon: """),_display_(/*43.59*/user/*43.63*/.phone),format.raw/*43.69*/("""
                                                """),format.raw/*44.49*/("""<br>
                                                <br>
                                            </p>
                                            <div class="buttons-set">
                                                <button id="send2" name="send" type="submit" class="button login"><span>Ažuriraj</span></button>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="col-2">
                                        <form  method="POST" role="form" action=""""),_display_(/*53.83*/routes/*53.89*/.AppUsers.updateAdminPassword(user.id)),format.raw/*53.127*/("""" >
                                            <h5>Pristupne informacije</h5>
                                            <p>"""),_display_(/*55.49*/user/*55.53*/.email),format.raw/*55.59*/("""</p>
                                            <input type="password" title="Password" class="input-text" name="password" required>
                                            <br>
                                            <br>
                                            <br>
                                            <div class="buttons-set">
                                                <button id="send2" name="send" type="submit" class="button login"><span>Ažuriraj</span></button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <aside class="col-right sidebar col-sm-3">
                    <div class="block block-account">
                        <div class="block-title">Upravljanje stranicom</div>
                        <div class="block-content">
                            <ul>
                                <li class="current"><a>Admin Panel</a></li>
                                <li><a href=""""),_display_(/*76.47*/routes/*76.53*/.AppUsers.listOfUsersRender()),format.raw/*76.82*/("""">Korisnici</a></li>
                                <li><a href=""""),_display_(/*77.47*/routes/*77.53*/.AppUsers.createUserRender()),format.raw/*77.81*/("""">Dodaj korisnika</a></li>
                                <li><a href=""""),_display_(/*78.47*/routes/*78.53*/.Items.allItems()),format.raw/*78.70*/("""">Proizvodi</a></li>
                                <li><a href=""""),_display_(/*79.47*/routes/*79.53*/.Categories.listOfCategories()),format.raw/*79.83*/("""">Kategorije</a></li>
                                <li><a href=""""),_display_(/*80.47*/routes/*80.53*/.Categories.createCategory()),format.raw/*80.81*/("""">Dodaj kategoriju</a></li>
                                <li><a href=""""),_display_(/*81.47*/routes/*81.53*/.NewsController.newsPanelRender()),format.raw/*81.86*/("""">Vijesti</a></li>
                                <li><a href=""""),_display_(/*82.47*/routes/*82.53*/.NewsController.createNewsRender()),format.raw/*82.87*/("""">Kreiraj Vijest</a></li>
                                <li><a href="#">My Tags</a></li>
                                <li><a href="wishlist.html">My Wishlist</a></li>
                                <li><a href="#">My Downloadable</a></li>
                                <li class="last"><a href="#">Newsletter Subscriptions</a></li>
                            </ul>
                        </div>
                    </div>
                </aside>
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
object adminPanel extends adminPanel_Scope0.adminPanel
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 20:13:50 CEST 2016
                  SOURCE: E:/namjestaj/app/views/Admin/adminPanel.scala.html
                  HASH: b59e3c46802d7063f987282a7fe7f53849216393
                  MATRIX: 762->1|872->16|899->18|910->22|947->23|978->28|1055->79|1095->111|1134->113|1178->130|1397->323|1410->328|1445->343|1521->388|1562->402|1601->432|1641->434|1686->451|1934->672|1948->677|1982->690|2027->707|2078->727|2114->736|3045->1640|3060->1646|3130->1694|3288->1825|3301->1829|3327->1834|3356->1835|3445->1897|3458->1901|3487->1909|3574->1969|3587->1973|3613->1978|3703->2041|3716->2045|3743->2051|3820->2100|4449->2702|4464->2708|4524->2746|4678->2873|4691->2877|4718->2883|5935->4073|5950->4079|6000->4108|6094->4175|6109->4181|6158->4209|6258->4282|6273->4288|6311->4305|6405->4372|6420->4378|6471->4408|6566->4476|6581->4482|6630->4510|6731->4584|6746->4590|6800->4623|6892->4688|6907->4694|6962->4728
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|49->18|50->19|69->38|69->38|69->38|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|84->53|84->53|84->53|86->55|86->55|86->55|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82
                  -- GENERATED --
              */
          