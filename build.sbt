name := "scalajs-options"

version := "0.1"

scalaVersion := "2.12.3"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.2",
  "org.querki" %%% "querki-jsext" % "0.8")


enablePlugins(ScalaJSPlugin)



        