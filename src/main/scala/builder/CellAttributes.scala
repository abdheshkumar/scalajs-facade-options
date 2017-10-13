package builder

import org.querki.jsext
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap}

import scala.scalajs.js
import scala.scalajs.js.|

trait CellAttributes extends js.Object {
  val key: js.UndefOr[String | js.Any] = js.undefined
}

class CellAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[CellAttributes, CellAttributesBuilder](new CellAttributesBuilder(_))
    with CellAttributesSetters[CellAttributes, CellAttributesBuilder]

trait CellAttributesSetters[T <: js.Object, B <: JSOptionBuilder[T, _]] extends JSOptionSetter[T, B] {
  def key(k: String | js.Any) = jsOpt("key", k)
}

object CellAttributes extends CellAttributesBuilder(jsext.noOpts)