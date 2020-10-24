name := "http-scalaj"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
    //scalaj
    "org.scalaj" %% "scalaj-http" % "2.4.2",
    "com.typesafe.play" %% "play-json" % "2.9.1",
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)