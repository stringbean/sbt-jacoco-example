name := "sbt-jacoco-example"
organization := "org.scala-sbt.jacoco"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % "test"
)

// enable uploading coverage to coveralls.io
enablePlugins(JacocoCoverallsPlugin)

// add XML report for codecov.io
jacocoReportSettings := JacocoReportSettings(
  "Jacoco Coverage Report",
  None,
  JacocoThresholds(),
  Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.XML),
  "utf-8")
