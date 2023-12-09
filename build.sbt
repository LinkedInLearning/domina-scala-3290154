val scala3Version = "3.3.1"
val jedisVersion = "4.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Domina-Scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "redis.clients" % "jedis" % jedisVersion,
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )