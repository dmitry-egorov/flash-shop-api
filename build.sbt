import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

organization  := "de.flashshop"

version       := "0.1"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.0"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %  "spray-can"      % sprayV,
    "io.spray"            %  "spray-routing"  % sprayV,
    "io.spray"            %  "spray-httpx"    % sprayV,
    "io.spray"            %  "spray-testkit"  % sprayV  % "test",
    "com.typesafe.akka"   %% "akka-actor"     % akkaV,
    "com.typesafe.akka"   %% "akka-testkit"   % akkaV   % "test",
    "org.specs2"          %% "specs2-core"    % "2.3.7" % "test",
    "org.json4s"          %% "json4s-native"  % "3.2.9"
  )
}

Revolver.settings
