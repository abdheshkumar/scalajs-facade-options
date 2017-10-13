import builder.GenericAttributes

import scala.scalajs.js.Dynamic.{global => g}

object TutorialApp {
  def main(args: Array[String]): Unit = {
    g.console.log(GenericAttributes.key("Test")._result)
  }
}



