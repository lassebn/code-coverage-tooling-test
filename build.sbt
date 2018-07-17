import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "testing-code-coverage-tools",
    libraryDependencies += scalaTest,
    libraryDependencies += pegdown,
    testOptions in Test ++= Seq(
      Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/report/unittest"),
      Tests.Argument(TestFrameworks.ScalaTest, "-o")
    )
  )
