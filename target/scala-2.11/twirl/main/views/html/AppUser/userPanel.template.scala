
package views.html.AppUser

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userPanel_Scope0 {
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

class userPanel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[AppUser,play.twirl.api.HtmlFormat.Appendable] {

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
                            <h2>Korisnički Panel</h2>
                        </div>
                        <div class="dashboard">
                            <div class="welcome-msg"> <strong>Zdravo, """),_display_(/*31.72*/user/*31.76*/.name),format.raw/*31.81*/("""!</strong>
                                <p> Na korisničkom panelu imate mogućnost ažuriranja svojih informacija, dodavanja, ažuriranja, te brisanja objekata i proizvoda.</p>
                            </div>

                            <div class="box-account">
                                <div class="col2-set">
                                    <div class="col-1">
                                        <form  method="GET" role="form" action=""""),_display_(/*38.82*/routes/*38.88*/.AppUsers.updateUserInformationsRender(user.id)),format.raw/*38.135*/("""" >
                                            <h5>Korisnički podaci</h5>
                                            <p> Ime: """),_display_(/*40.55*/user/*40.59*/.name),format.raw/*40.64*/(""" """),format.raw/*40.65*/("""<br>
                                                Adresa: """),_display_(/*41.58*/user/*41.62*/.address),format.raw/*41.70*/("""<br>
                                                Grad: """),_display_(/*42.56*/user/*42.60*/.city),format.raw/*42.65*/("""<br>
                                                Telefon: """),_display_(/*43.59*/user/*43.63*/.phone),format.raw/*43.69*/("""
                                                """),format.raw/*44.49*/("""<br>
                                                <br>
                                            </p>
                                            <div class="buttons-set">
                                                <button id="send2" name="send" type="submit" class="button"> <i class="fa fa-pencil"></i> <span> Ažuriraj</span></button>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="col-2">
                                        <form  method="POST" role="form" action=""""),_display_(/*53.83*/routes/*53.89*/.AppUsers.updateUserPassword(user.id)),format.raw/*53.126*/("""" >
                                            <h5>Pristupne informacije</h5>
                                            <p>"""),_display_(/*55.49*/user/*55.53*/.email),format.raw/*55.59*/("""</p>
                                            <input type="password" title="Password" class="input-text" name="password" required>
                                            <br>
                                            <br>
                                            <br>
                                            <div class="buttons-set">
                                                <button id="send2" name="send" type="submit" class="button "> <i class="fa fa-pencil"></i><span> Ažuriraj</span></button>
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
                                <li class="current"><a>Korisnički panel</a></li>
                                <li><a href=""""),_display_(/*76.47*/routes/*76.53*/.Stores.listOfStores(user.id)),format.raw/*76.82*/("""">Objekti</a></li>
                                <li><a href=""""),_display_(/*77.47*/routes/*77.53*/.Stores.createStoreRender(user.id)),format.raw/*77.87*/("""">Dodaj objekat</a></li>
                                <li><a href=""""),_display_(/*78.47*/routes/*78.53*/.Items.listOfItems(user.id)),format.raw/*78.80*/("""">Poizvodi</a></li>
                                <li><a href=""""),_display_(/*79.47*/routes/*79.53*/.Items.createItem(user.id)),format.raw/*79.79*/("""">Dodaj proizvod</a></li>
                                <li><a href="#">My Orders</a></li>
                                <li><a href="#">Billing Agreements</a></li>
                                <li><a href="#">Recurring Profiles</a></li>
                                <li><a href="#">My Product Reviews</a></li>
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
object userPanel extends userPanel_Scope0.userPanel
              /*
                  -- GENERATED --
                  DATE: Tue Mar 29 19:10:50 CEST 2016
                  SOURCE: E:/namjestaj/app/views/AppUser/userPanel.scala.html
                  HASH: 13f049709e9f2427498fcdbc28ba5b79173cb9e1
                  MATRIX: 762->1|872->16|899->18|910->22|947->23|978->28|1055->79|1095->111|1134->113|1178->130|1397->323|1410->328|1445->343|1521->388|1562->402|1601->432|1641->434|1686->451|1934->672|1948->677|1982->690|2027->707|2078->727|2114->736|2679->1274|2692->1278|2718->1283|3204->1742|3219->1748|3288->1795|3444->1924|3457->1928|3483->1933|3512->1934|3601->1996|3614->2000|3643->2008|3730->2068|3743->2072|3769->2077|3859->2140|3872->2144|3899->2150|3976->2199|4630->2826|4645->2832|4704->2869|4858->2996|4871->3000|4898->3006|6145->4226|6160->4232|6210->4261|6302->4326|6317->4332|6372->4366|6470->4437|6485->4443|6533->4470|6626->4536|6641->4542|6688->4568
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|49->18|50->19|62->31|62->31|62->31|69->38|69->38|69->38|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|84->53|84->53|84->53|86->55|86->55|86->55|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79
                  -- GENERATED --
              */
          