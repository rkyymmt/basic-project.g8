name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

libraryDependencies := Seq(
  "org.specs2" %% "specs2" % "1.9" % "test"
)

initialCommands := "import $organization$.$name$._"
