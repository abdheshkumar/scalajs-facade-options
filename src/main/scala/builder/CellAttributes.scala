package builder

import org.querki.jsext
import org.querki.jsext.{JSOptionBuilder, OptMap}

import scala.scalajs.js
import scala.scalajs.js.|

trait CellAttributes extends js.Object {
  val key: js.UndefOr[String | js.Any] = js.undefined
}

object CellAttributes {
  val key = "key"
}

class CellAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[CellAttributes, CellAttributesBuilder](new CellAttributesBuilder(_)) {
  def key(k: String | js.Any) = jsOpt(CellAttributes.key, k)
}

object CellAttributesBuilder extends CellAttributesBuilder(jsext.noOpts)