// See LICENSE for license details.

// sbt-site - sbt-ghpages

enablePlugins(SiteScaladocPlugin)

enablePlugins(GhpagesPlugin)

// ANTLRv4
// antlr4Settings
scalaVersion := "2.11.11"

// ScalaDoc
enablePlugins(ScalaUnidocPlugin)

git.remoteRepo := "git@github.com:freechipsproject/firrtl.git"

resolvers += Resolver.jcenterRepo

val commonSettings = Seq(
    organization := "edu.berkeley.cs",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.11",
    // crossScalaVersions := Seq("2.11.11", "2.12.3"),
    // scalacOptions := scalacOptionsVersion(scalaVersion.value),
    // javacOptions ++= javacOptionsVersion(scalaVersion.value),
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
    libraryDependencies += "com.github.scopt" %%% "scopt" % "3.7.0",
)

val jsSettings  = Seq(
    resolvers += Resolver.jcenterRepo,
    libraryDependencies += "biz.enef" %%% "slogging" % "0.5.3",
    libraryDependencies += "com.definitelyscala" %%% "scala-js-yamljs" % "1.0.2"
)

val jvmSettings = Seq(
    assemblyJarName in assembly := "firrtl.jar",
    test in assembly := {}, // Should there be tests?
    assemblyOutputPath in assembly := file("./utils/bin/firrtl.jar"),
    antlr4GenVisitor in Antlr4 := true, // default = false
    antlr4GenListener in Antlr4 := false, // default = true
    antlr4PackageName in Antlr4 := Option("firrtl.antlr"),
    antlr4Version in Antlr4 := "4.7",
    scalacOptions in Compile in doc ++= Seq(
      "-diagrams",
      "-diagrams-max-classes", "25",
      "-doc-version", version.value,
      "-doc-title", name.value,
      "-doc-root-content", baseDirectory.value+"/root-doc.txt"
    ) ++ scalacOptionsVersion(scalaVersion.value),
    // libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
    libraryDependencies += "biz.enef" %% "slogging-slf4j" % "0.5.3",
    libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.+",  // or another slf4j implementation
    libraryDependencies += "net.jcazevedo" %% "moultingyaml" % "0.4.0"
)

lazy val firrtl  = project.in(file("."))
    .settings(moduleName := "firrtl")
    .settings(commonSettings)
    .aggregate(coreJVM, coreJS)
    .dependsOn(coreJVM, coreJS)

// lazy val firrtlJVM = project.in(file(".firrtlJVM"))
//     .settings(moduleName := "firrtl-aggregate")
//     .settings(commonSettings)
//     .aggregate(coreJVM)
//     .dependsOn(coreJVM)
// 
// lazy val firrtlJS = project.in(file(".firrtlJS"))
//     .settings(moduleName := "firrtl-aggregate")
//     .settings(commonSettings)
//     .aggregate(coreJS)
//     .dependsOn(coreJS)
//     .enablePlugins(ScalaJSPlugin)

lazy val core = crossProject.in(file("core"))
    .settings(moduleName := "firrtl-core")
    .settings(commonSettings)
    .jvmSettings(jvmSettings)
    .jsSettings(jsSettings)
    .enablePlugins(Antlr4Plugin)

lazy val coreJVM = core.jvm

lazy val coreJS  = core.js

def scalacOptionsVersion(scalaVersion: String): Seq[String] = {
  Seq() ++ {
    // If we're building with Scala > 2.11, enable the compile option
    //  switch to support our anonymous Bundle definitions:
    //  https://github.com/scala/bug/issues/10047
    CrossVersion.partialVersion(scalaVersion) match {
      case Some((2, scalaMajor: Long)) if scalaMajor < 12 => Seq()
      case _ => Seq("-Xsource:2.11")
    }
  }
}


def javacOptionsVersion(scalaVersion: String): Seq[String] = {
  Seq() ++ {
    // Scala 2.12 requires Java 8, but we continue to generate
    //  Java 7 compatible code until we need Java 8 features
    //  for compatibility with old clients.
    CrossVersion.partialVersion(scalaVersion) match {
      case Some((2, scalaMajor: Long)) if scalaMajor < 12 =>
        Seq("-source", "1.7", "-target", "1.7")
      case _ =>
        Seq("-source", "1.8", "-target", "1.8")
    }
  }
}

doc in Compile := (doc in ScalaUnidoc).value


//target in unidoc in ScalaUnidoc := crossTarget.value / "api"

autoAPIMappings := true


// This is an application with a main method
// scalaJSUseMainModuleInitializer := true

