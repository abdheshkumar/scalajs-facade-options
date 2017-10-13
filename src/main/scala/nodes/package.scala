import scala.scalajs.js.annotation.JSExportTopLevel

package object nodes {
  object ViewsName {
    final val BASE_NODE_VIEW ="BaseNodeView"
  }
  @JSExportTopLevel(ViewsName.BASE_NODE_VIEW)
  val foo: String = "hello"
}
