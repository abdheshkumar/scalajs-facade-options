package builder

import org.querki.jsext
import org.querki.jsext.{JSOptionSetter, OptMap}

import scala.scalajs.js

trait GenericAttributes extends CellAttributes {
  val angel: js.UndefOr[Int] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
}

object GenericAttributes {
  val angel = "angel"
  val `type` = "type"
}

class GenericAttributesBuilder(override val dict: OptMap) extends
  CellAttributesBuilder(dict) with JSOptionSetter[GenericAttributes, GenericAttributesBuilder] {
  def angel(a: Int) = jsOpt(GenericAttributes.angel, a)

  def `type`(t: String) = jsOpt(GenericAttributes.`type`, t)
}

object GenericAttributesBuilder extends GenericAttributesBuilder(jsext.noOpts)