import sbt._
import Keys._

object Settings {

  val predef = Vector(
    "java.lang",
    "scala",
    "scala.Predef",
    "scala.util.chaining",
    "cats",
    "cats.syntax.all"
  ).mkString("-Yimports:", ",", "")

  val common = Seq(
    name := "Application",
    version := "0.1",
    scalaVersion := "2.13.6",
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
    addCompilerPlugin(
      "org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full
    )
  )
}
