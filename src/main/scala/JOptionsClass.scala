import scala.scalajs.js

class JOptionsClass(
                     val name: js.UndefOr[String] = js.undefined,
                     val `type`: js.UndefOr[String] = js.undefined,
                     val markup: js.UndefOr[String] = js.undefined,
                     val `class`: js.UndefOr[String] = js.undefined,
                     val `tag`: js.UndefOr[String] = js.undefined) extends js.Object

object JOptionsClass {
  def apply(name: js.UndefOr[String] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            markup: js.UndefOr[String] = js.undefined,
            `class`: js.UndefOr[String] = js.undefined,
            `tag`: js.UndefOr[String] = js.undefined): JOptionsClass =
    new JOptionsClass(name, `type`, markup, `class`, `tag`)

}