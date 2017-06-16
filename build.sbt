name := "minasm"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.9.1" % "test")

val root = (project in file(".")).settings(NoTestPlugin.settings: _*)
