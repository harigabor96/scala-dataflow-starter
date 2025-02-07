scalaVersion := "2.12.18"

lazy val `scala-dataflow-starter` = (project in file("."))
  .settings(
    scalacOptions ++= Seq("-Ywarn-unused-import", "-Xfatal-warnings"),
    libraryDependencies ++= Seq(
      "org.rogach" %% "scallop" % "5.2.0",
      "org.scalatest" %% "scalatest" % "3.2.19" % Test,
      "org.mockito" %% "mockito-scala-scalatest" % "1.17.37" % Test
    )
  )
