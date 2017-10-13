package builder

import org.querki.jsext
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap}

import scala.scalajs.js

trait GenericAttributes extends CellAttributes {
  val angel: js.UndefOr[Int] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
}

trait GenericAttributesSetters[T <: js.Object, B <: JSOptionBuilder[T, _]]
  extends JSOptionSetter[T, B]
    with CellAttributesSetters[T, B] {
  def angel(a: Int) = jsOpt("angel", a)

  def `type`(t: String) = jsOpt("type", t)
}

class GenericAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[GenericAttributes, GenericAttributesBuilder](new GenericAttributesBuilder(_))
    with GenericAttributesSetters[GenericAttributes, GenericAttributesBuilder]


object GenericAttributes extends GenericAttributesBuilder(jsext.noOpts)