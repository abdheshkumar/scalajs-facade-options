import scala.scalajs.js

trait JOptionsImmutable extends js.Object {
  val name: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  val markup: js.UndefOr[String] = js.undefined
  val `class`: js.UndefOr[String] = js.undefined
  val tag: js.UndefOr[String] = js.undefined
}


object JOptionsImmutable1 {
  @inline
  def apply(name0: js.UndefOr[String] = js.undefined,
            type0: js.UndefOr[String] = js.undefined,
            markup0: js.UndefOr[String] = js.undefined,
            class0: js.UndefOr[String] = js.undefined,
            tag0: js.UndefOr[String] = js.undefined): JOptionsImmutable = new JOptionsImmutable {
    //override val `class`: js.UndefOr[String] = class0
    //override val markup: js.UndefOr[String] = markup0
    override val name: js.UndefOr[String] = name0
    //override val tag: js.UndefOr[String] = tag0
    //override val `type`: js.UndefOr[String] = type0
  }


}

object JOptionsImmutable2 {
  @inline
  def apply(name: js.UndefOr[String] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            markup: js.UndefOr[String] = js.undefined,
            `class`: js.UndefOr[String] = js.undefined,
            tag: js.UndefOr[String] = js.undefined): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    `type`.foreach(result.`type` = _)
    markup.foreach(result.markup = _)
    tag.foreach(result.tag = _)
    `class`.foreach(result.`class` = _)
    result.asInstanceOf[JOptionsImmutable]
  }
}

object JOptionsImmutable3 {
  @inline
  def apply(name: js.UndefOr[String] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            markup: js.UndefOr[String] = js.undefined,
            `class`: js.UndefOr[String] = js.undefined,
            tag: js.UndefOr[String] = js.undefined): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    result.name = name
    result.`type` = `type`
    result.markup = markup
    result.tag = tag
    result.`class` = `class`
    result.asInstanceOf[JOptionsImmutable]
  }
}

object JOptionsImmutable4 {
  @inline
  def apply(name: js.UndefOr[String]): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    result.asInstanceOf[JOptionsImmutable]
  }

  @inline
  def apply(name: js.UndefOr[String],
            `type`: js.UndefOr[String]): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    `type`.foreach(result.`type` = _)
    result.asInstanceOf[JOptionsImmutable]
  }

  @inline
  def apply(name: js.UndefOr[String],
            `type`: js.UndefOr[String],
            markup: js.UndefOr[String]): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    `type`.foreach(result.`type` = _)
    markup.foreach(result.markup = _)
    result.asInstanceOf[JOptionsImmutable]
  }

  @inline
  def apply(name: js.UndefOr[String],
            `type`: js.UndefOr[String],
            markup: js.UndefOr[String],
            `class`: js.UndefOr[String]): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    `type`.foreach(result.`type` = _)
    markup.foreach(result.markup = _)
    `class`.foreach(result.`class` = _)
    result.asInstanceOf[JOptionsImmutable]
  }

  @inline
  def apply(name: js.UndefOr[String],
            `type`: js.UndefOr[String],
            markup: js.UndefOr[String],
            `class`: js.UndefOr[String],
            tag: js.UndefOr[String]): JOptionsImmutable = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    `type`.foreach(result.`type` = _)
    markup.foreach(result.markup = _)
    tag.foreach(result.tag = _)
    `class`.foreach(result.`class` = _)
    result.asInstanceOf[JOptionsImmutable]
  }


}