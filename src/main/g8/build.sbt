import ScalaxbKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

libraryDependencies := Seq(
  "org.specs2" %% "specs2" % "1.9" % "test"
)

initialCommands := "import $organization$.$name$._"

//// for Scalaxb
seq(scalaxbSettings: _*)

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-http" % "0.8.8" % "compile->default" withSources()
)
