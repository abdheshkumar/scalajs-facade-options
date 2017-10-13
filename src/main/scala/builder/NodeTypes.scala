package builder

sealed trait NodeType extends Product with Serializable{
  val name: String
}

case object BaseType extends NodeType {
  override val name: String = "ngage.BaseNode"
}

case object PlayType extends NodeType {
  override val name: String = "ngage.PlayNode"
}

case object StartType extends NodeType {
  override val name: String = "ngage.StartNode"
}

case object GatherType extends NodeType {
  override val name: String = "ngage.GatherNode"
}