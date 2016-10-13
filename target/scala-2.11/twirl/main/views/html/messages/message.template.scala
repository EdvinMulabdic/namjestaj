
package views.html.messages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object message_Scope0 {
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

     object message_Scope1 {
import helpers.UserAccessLevel

class message extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Message,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message: Message):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.20*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    """),format.raw/*4.5*/("""<section class="main-container col2-right-layout wow bounceInUp animated">
        <div class="main container">
            <div class="row">
                <section class="col-main col-sm-9">
                    <div class="page-title">
                        <h2>"""),_display_(/*9.30*/message/*9.37*/.subject),format.raw/*9.45*/("""</h2>
                    </div>
                    <div class="static-contain">
                        <p> """),_display_(/*12.30*/message/*12.37*/.customerEmail),format.raw/*12.51*/("""</p>
                        <br>
                    </div>
                    <div class="static-contain">
                        <p> """),_display_(/*16.30*/message/*16.37*/.messageText),format.raw/*16.49*/("""</p>

                    </div>

                </section>
                <aside class="col-right sidebar col-sm-3">
                    <div class="block block-company">
                        <div class="block-title">NAVIGACIJA </div>
                        <div class="block-content">
                            <ol id="recently-viewed-items">
                                <li class="item even"><a href=""""),_display_(/*26.65*/routes/*26.71*/.Messages.listOfMessages(message.user.id)),format.raw/*26.112*/("""">Poruke</a></li>
                                """),_display_(/*27.34*/if(UserAccessLevel.getCurrentUser(ctx()).userAccessLevel.equals(UserAccessLevel.USER))/*27.120*/ {_display_(Seq[Any](format.raw/*27.122*/("""

                                    """),format.raw/*29.37*/("""<li class="item  odd"><a href=""""),_display_(/*29.69*/routes/*29.75*/.AppUsers.userPanelRender(message.user.id)),format.raw/*29.117*/("""">
                                        Korisnički panel</a></li>
                                """)))}),format.raw/*31.34*/("""
                            """),format.raw/*32.29*/("""</ol>
                        </div>
                    </div>
                </aside>
            </div>
        </div>
    </section>
    <!-- Main Container End -->
""")))}))
      }
    }
  }

  def render(message:Message): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((Message) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}
}

/**/
object message extends message_Scope0.message_Scope1.message
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 01:58:53 CEST 2016
                  SOURCE: E:/namjestaj/app/views/messages/message.scala.html
                  HASH: f9a5371d270d413945dd04ced7d7db1f2dd48fad
                  MATRIX: 820->33|933->51|960->53|971->57|1009->59|1040->64|1334->332|1349->339|1377->347|1515->458|1531->465|1566->479|1732->618|1748->625|1781->637|2225->1054|2240->1060|2303->1101|2381->1152|2477->1238|2518->1240|2584->1278|2643->1310|2658->1316|2722->1358|2855->1460|2912->1489
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|42->9|42->9|42->9|45->12|45->12|45->12|49->16|49->16|49->16|59->26|59->26|59->26|60->27|60->27|60->27|62->29|62->29|62->29|62->29|64->31|65->32
                  -- GENERATED --
              */
          