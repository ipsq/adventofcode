ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.riemers"

lazy val commonSettings = Seq(
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % "1.4.0",
    "org.typelevel" %% "cats-effect" % "1.0.0",
    "io.monix" %% "monix" % "3.0.0-RC2",
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )
)

lazy val adventofcode = (project in file("."))
  .aggregate(common, day1, day2, day3, day4, day5, day6, day7)

lazy val common = (project in file("common"))
  .settings(commonSettings)
  .settings(
    libraryDependencies += "com.github.mpilquist" %% "simulacrum" % "0.14.0",
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.8"),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
  )

lazy val day1 = (project in file("day1"))
  .settings(commonSettings)
  .dependsOn(common)

lazy val day2 = (project in file("day2"))
  .settings(commonSettings)
  .dependsOn(common)

lazy val day3 = (project in file("day3"))
  .settings(commonSettings)
  .dependsOn(common)

lazy val day4 = (project in file("day4"))
  .settings(commonSettings)
  .dependsOn(common)

lazy val day5 = (project in file("day5"))
  .settings(commonSettings)
  .dependsOn(common)

lazy val day6 = (project in file("day6"))
  .settings(commonSettings)
  .dependsOn(common)

lazy val day7 = (project in file("day7"))
  .settings(commonSettings)
  .dependsOn(common)