organization := "org.chipsalliance"

name := "tilelink"

scalaVersion := "2.13.12"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

Compile / scalaSource := baseDirectory.value / "tilelink/src"

addCompilerPlugin(("org.chipsalliance" % "chisel-plugin" % "6.4.0").cross(CrossVersion.full))
libraryDependencies += "org.chipsalliance" %% "chisel" % "6.4.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"
Test / testForkedParallel := true
