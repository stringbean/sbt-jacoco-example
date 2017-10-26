name := "sbt-jacoco-example"
organization := "org.scala-sbt.jacoco"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % "test"
)

enablePlugins(JacocoCoverallsPlugin)
