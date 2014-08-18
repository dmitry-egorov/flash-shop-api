import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

organization  := "de.flashshop"

version       := "0.1"

scalaVersion  := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies ++= {
  val akkaV = "2.3.5"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %% "spray-can"      % sprayV,
    "io.spray"            %% "spray-routing"  % sprayV,
    "io.spray"            %% "spray-httpx"    % sprayV,
    "io.spray"            %% "spray-testkit"  % sprayV  % "test",
    "com.typesafe.akka"   %% "akka-actor"     % akkaV,
    "com.typesafe.akka"   %% "akka-testkit"   % akkaV   % "test",
    "org.specs2"          %% "specs2-core"    % "2.4.1" % "test",
    "org.json4s"          %% "json4s-native"  % "3.2.9"
  )
}

Revolver.settings

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](version)

buildInfoPackage := "de.flashshop"