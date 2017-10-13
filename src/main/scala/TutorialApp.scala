import builder.{GenericAttributesBuilder, OptionsBuilder, PlayType}

import scala.scalajs.js.Dynamic.{global => g}

object TutorialApp {


  def main(args: Array[String]): Unit = {

    val op = OptionsBuilder
      .name("Test Name")
      .`type`(PlayType)
      ._result
    val b = GenericAttributesBuilder.key("key")
    g.console.log(op)
  }
}



