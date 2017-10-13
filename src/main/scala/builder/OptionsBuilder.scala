package builder

import org.querki.jsext
import org.querki.jsext.{JSOptionBuilder, OptMap}

import scala.scalajs.js

trait Options extends js.Object {
  val name: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  val data: js.UndefOr[String] = js.undefined
}

object Options {
  val name = "name"
  val `type` = "type"
  val data = "data"
}

class OptionsBuilder(val dict: OptMap) extends JSOptionBuilder[Options, OptionsBuilder](new OptionsBuilder(_)) {
  def name(n: String) = jsOpt(Options.name, n)

  def `type`(t: NodeType) = jsOpt(Options.`type`, t.name)

  def data(d: String) = jsOpt(Options.data, d)
}

object OptionsBuilder extends OptionsBuilder((jsext.noOpts))