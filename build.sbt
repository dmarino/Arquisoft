name := """Arquisoft"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean, LauncherJarPlugin)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  cache,
  javaWs,
  "org.postgresql" % "postgresql" % "9.4-1206-jdbc42",
  "org.webjars" % "bootstrap" % "4.0.0-alpha.6-1",
  "org.webjars" % "jquery" % "2.1.4",
  "com.adrianhurt" %% "play-bootstrap3" % "0.4.5-P24",
  "com.amazonaws" % "aws-java-sdk" % "1.11.46"

)

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.46"
