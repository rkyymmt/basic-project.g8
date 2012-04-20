// for Akka plugin
resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.akka" % "akka-sbt-plugin" % "2.0")

//// for eclipse plugin
//resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

//// for idea intellij plugin
resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

//// for scalaxb plugin
resolvers ++= Seq(
  "sonatype-public" at "https://oss.sonatype.org/content/repositories/public",
  "repo.codahale.com" at "http://repo.codahale.com")

addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "0.7.0")

//// for dependency graph plugin
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.5.2")
