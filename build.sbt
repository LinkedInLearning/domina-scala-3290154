val scala3Version = "3.3.1"
val mysqlConnectorVersion = "8.0.23"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Domina-Scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "mysql" % "mysql-connector-java" % mysqlConnectorVersion,
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )