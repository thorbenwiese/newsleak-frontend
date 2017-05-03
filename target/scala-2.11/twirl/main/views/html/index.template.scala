
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object index_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply(): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.1*/ ("""<!--
 Copyright (C) 2016 Language Technology Group and Interactive Graphics Systems Group, Technische Universität Darmstadt, Germany

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License as
 published by the Free Software Foundation, either version 3 of the
 License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with this program. If not, see <http://www.gnu.org/licenses/>.
-->

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="shortcut icon" href="./assets/images/favicon.ico" type="image/x-icon" />
        <link rel="icon" href="./assets/images/favicon.ico" type="image/x-icon" />

        <title>new/s/leak</title>

        <link type="text/css" rel="stylesheet" href=""""), _display_( /*28.55*/ routes /*28.61*/ .Assets.at("javascripts/libs/bootstrap/dist/css/bootstrap.min.css")), format.raw /*28.128*/ ("""">
        <link type="text/css" rel="stylesheet" href=""""), _display_( /*29.55*/ routes /*29.61*/ .Assets.at("javascripts/libs/font-awesome/css/font-awesome.min.css")), format.raw /*29.129*/ ("""">
        <link type="text/css" rel="stylesheet" href=""""), _display_( /*30.55*/ routes /*30.61*/ .Assets.at("javascripts/libs/angular-ui-layout/src/ui-layout.css")), format.raw /*30.127*/ ("""" />
        <link type="text/css" rel="stylesheet" href=""""), _display_( /*31.55*/ routes /*31.61*/ .Assets.at("javascripts/libs/angular-resizable/angular-resizable.min.css")), format.raw /*31.135*/ ("""">
        <link type="text/css" rel="stylesheet" href=""""), _display_( /*32.55*/ routes /*32.61*/ .Assets.at("javascripts/libs/vis/dist/vis.css")), format.raw /*32.108*/ ("""">
        <link type="text/css" rel="stylesheet" href=""""), _display_( /*33.55*/ routes /*33.61*/ .Assets.at("stylesheets/style.css")), format.raw /*33.96*/ ("""">


        <link type="text/css" rel="stylesheet" href=""""), _display_( /*36.55*/ routes /*36.61*/ .Assets.at("javascripts/libs/angular-material/angular-material.min.css")), format.raw /*36.133*/ ("""">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,400italic">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

        <style>
        body """), format.raw /*41.14*/ ("""{"""), format.raw /*41.15*/ ("""
            """), format.raw /*42.13*/ ("""overflow: hidden;
        """), format.raw /*43.9*/ ("""}"""), format.raw /*43.10*/ ("""
        """), format.raw /*44.9*/ ("""</style>
        <script data-main=""""), _display_( /*45.29*/ routes /*45.35*/ .Assets.at("javascripts/main.js")), format.raw /*45.68*/ ("""" type="text/javascript" src=""""), _display_( /*45.99*/ routes /*45.105*/ .Assets.at("javascripts/libs/requirejs/require.js")), format.raw /*45.156*/ (""""></script>
    </head>

    <body ng-controller="AppController as app" ngsf-fullscreen>

        <div id="wrapper" layout="column" ng-cloak layout-fill>
            <header><div ui-view="header"></div></header>
            <div id="top-container" layout="row" resizable r-directions="['bottom']" r-flex="true">
                <div id="search-bar" flex="25" resizable r-directions="['right']" r-flex="true"><div ui-view="search"></div></div>
                <div id="history" flex><div ui-view="history"></div></div>
            </div>
            <div id="flex-body" flex="none" class="flex-row" layout="row"  resizable r-directions="['bottom']">
                <nav id="document" flex="initial" resizable r-directions="['right']" r-flex="true">
                    <div ui-view="documentlist"></div>
                </nav>

                <main id="center-box" resizable r-directions="['right']" r-flex="true" flex="none">
                    <!-- selectedTab is defined in AppController -->
                    <md-tabs md-selected="selectedTab.index" md-border-bottom md-autoselect layout-fill ngsf-fullscreen="NetworkController">

                        <md-tab flex label="Network">
                            <div id="network" ui-view="network"></div>
                        </md-tab>

                        <div id="docii" ui-view="document"></div>
                   </md-tabs>
                </main>

                <aside id="right-side" flex="" layout="column">
                    <!--<div id="filter-view" ui-view="filter" flex="none" resizable r-directions="['bottom']" r-flex="true"></div>-->
                    <div id="metadata-view" ui-view="metadata"></div>
                </aside>

            </div>
            <footer id="footer" flex="" r-flex="true">
                <md-tabs>
                    <md-tab md-on-select="">
                        <md-tab-label>
                            <md-icon class-="material-icons">"""), format.raw /*83.62*/ ("""{"""), format.raw /*83.63*/ ("""{"""), format.raw /*83.64*/ (""" """), format.raw /*83.65*/ ("""historyFactory.getIcon('time') """), format.raw /*83.96*/ ("""}"""), format.raw /*83.97*/ ("""}"""), format.raw /*83.98*/ ("""</md-icon> Document Date
                        </md-tab-label>
                        <md-tab-body>
                            <div ui-view="histogram"></div>
                        </md-tab-body>
                    </md-tab>
                    <md-tab md-on-select="">
                        <md-tab-label>
                            <md-icon class-="material-icons">"""), format.raw /*91.62*/ ("""{"""), format.raw /*91.63*/ ("""{"""), format.raw /*91.64*/ (""" """), format.raw /*91.65*/ ("""historyFactory.getIcon('timeX') """), format.raw /*91.97*/ ("""}"""), format.raw /*91.98*/ ("""}"""), format.raw /*91.99*/ ("""</md-icon> Date Expression
                        </md-tab-label>
                        <md-tab-body>
                            <div ui-view="histogramX"></div>
                        </md-tab-body>
                    </md-tab>
                </md-tabs>
            </footer>
        </div>
        <!-- context menu for metadata bar charts -->
        <!--<div id="constext-menu-div" class="popupMenu" style="display: none;">
            <ul>
                <li action="edit">Edit Entity</li>
                <li action="filter">Add as filter</li>
                <li action="hide">Hide</li>
                <li action="blacklist">Blacklist</li>
            </ul>
        </div>-->
    </body>
</html>
"""))
        }
      }
    }

    def render(): play.twirl.api.HtmlFormat.Appendable = apply()

    def f: (() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

    def ref: this.type = this

  }

}

/**/
object index extends index_Scope0.index
/*
                  -- GENERATED --
                  DATE: Thu Apr 06 19:07:55 CEST 2017
                  SOURCE: /Users/wiese/Documents/UHH/Master/2.Semester/Projekt/newsleak-frontend/app/views/index.scala.html
                  HASH: 29b8ad4848ef7e700a6c28b8297cae5027c14115
                  MATRIX: 609->0|1868->1232|1883->1238|1972->1305|2056->1362|2071->1368|2161->1436|2245->1493|2260->1499|2348->1565|2434->1624|2449->1630|2545->1704|2629->1761|2644->1767|2713->1814|2797->1871|2812->1877|2868->1912|2954->1971|2969->1977|3063->2049|3331->2289|3360->2290|3401->2303|3454->2329|3483->2330|3519->2339|3583->2376|3598->2382|3652->2415|3710->2446|3726->2452|3799->2503|5787->4463|5816->4464|5845->4465|5874->4466|5933->4497|5962->4498|5991->4499|6396->4876|6425->4877|6454->4878|6483->4879|6543->4911|6572->4912|6601->4913
                  LINES: 25->1|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|60->36|60->36|60->36|65->41|65->41|66->42|67->43|67->43|68->44|69->45|69->45|69->45|69->45|69->45|69->45|107->83|107->83|107->83|107->83|107->83|107->83|107->83|115->91|115->91|115->91|115->91|115->91|115->91|115->91
                  -- GENERATED --
              */
