name := "ScalaFX-Sandbox"

version := "1.0"

scalaVersion := "2.11.7"

resourceDirectory in Compile := (scalaSource in Compile).value

// Add managed dependency on ScalaFX library
libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "8.0.60-R9",
  "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"
)


// Fork a new JVM for 'run' and 'test:run'
fork := true
