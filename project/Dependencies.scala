import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % Test
  lazy val pegdown = "org.pegdown" % "pegdown" % "1.6.0" % Test
}
