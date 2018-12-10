// See LICENSE for license details.
// import _root_.sbtcrossproject.CrossPlugin.autoImport._

// sbt-site - sbt-ghpages

enablePlugins(Antlr4Plugin)
enablePlugins(ProtobufPlugin)
enablePlugins(ScalaUnidocPlugin)
enablePlugins(SiteScaladocPlugin)
// enablePlugins(GhpagesPlugin)

val sharedSettings = Seq(
  // Firrtl code
  organization := "edu.berkeley.cs",
  name := "firrtl",
  version := "1.2-SNAPSHOT",
  scalaVersion := "2.12.7",
  scalacOptions := scalacOptionsVersion(scalaVersion.value) ++ Seq(
    "-deprecation"
  ),
  javacOptions ++= javacOptionsVersion(scalaVersion.value),
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
  libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3",
  // sbt 1.2.6 fails with `Symbol 'term org.junit' is missing from the classpath`
  // when compiling tests under 2.11.12
  // An explicit dependency on junit seems to alleviate this.
  libraryDependencies += "junit" % "junit" % "4.12" % "test",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
  libraryDependencies += "com.github.scopt" %%% "scopt" % "3.7.0",
  libraryDependencies += "net.jcazevedo" %% "moultingyaml" % "0.4.0",
  publishMavenStyle := true,
  publishArtifact in Test := false,
  pomIncludeRepository := { x => false },
  // Don't add 'scm' elements if we have a git.remoteRepo definition.
  pomExtra := <url>http://chisel.eecs.berkeley.edu/</url>
    <licenses>
      <license>
        <name>BSD-style</name>
        <url>http://www.opensource.org/licenses/bsd-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <developers>
      <developer>
        <id>jackbackrack</id>
        <name>Jonathan Bachrach</name>
        <url>http://www.eecs.berkeley.edu/~jrb/</url>
      </developer>
    </developers>,
  publishTo := {
    val v = version.value
    val nexus = "https://oss.sonatype.org/"
    if (v.trim.endsWith("SNAPSHOT")) {
      Some("snapshots" at nexus + "content/repositories/snapshots")
    } else {
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
    }
  },
  // ScalaDoc
  doc in Compile := (doc in ScalaUnidoc).value,
  //target in unidoc in ScalaUnidoc := crossTarget.value / "api"
  autoAPIMappings := true,
  scalacOptions in Compile in doc ++= Seq(
    "-diagrams",
    "-diagrams-max-classes", "25",
    "-doc-version", version.value,
    "-doc-title", name.value,
    "-doc-root-content", baseDirectory.value+"/root-doc.txt"
  ) ++ scalacOptionsVersion(scalaVersion.value),
  scalaJSUseMainModuleInitializer := true,
  mainClass in Compile := Some("firrtl.Driver"),
  // ANTLRv4
  antlr4GenVisitor in Antlr4 := true, // default = false
  antlr4GenListener in Antlr4 := false, // default = true
  antlr4PackageName in Antlr4 := Option("firrtl.antlr"),
  antlr4Version in Antlr4 := "4.7.1",
  javaSource in Antlr4 := (sourceManaged in Compile).value,
  // Java PB
  sourceDirectory in ProtobufConfig := baseDirectory.value / "src" / "main" / "proto",
  protobufRunProtoc in ProtobufConfig := (args =>
    com.github.os72.protocjar.Protoc.runProtoc("-v351" +: args.toArray)),
  javaSource in ProtobufConfig := (sourceManaged in Compile).value,
  // Assembly
  assemblyJarName in assembly := "firrtl.jar",
  test in assembly := {}, // Should there be tests?
  assemblyOutputPath in assembly := file("./utils/bin/firrtl.jar"),
  crossScalaVersions := Seq("2.12.7", "2.11.12"),
  // git.remoteRepo := "git@github.com:freechipsproject/firrtl.git",
)

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

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

lazy val root = project.in(file(".")).
  aggregate(firrtlJS, firrtlJVM)

lazy val firrtl = sbtcrossproject.CrossPlugin.autoImport.crossProject(JSPlatform, JVMPlatform)
  .in(file("."))
  // .crossType(CrossType.Pure)
  .enablePlugins(SiteScaladocPlugin)
  // .enablePlugins(GhpagesPlugin)
  .enablePlugins(ScalaUnidocPlugin)
  .settings(sharedSettings)
  .jvmSettings(
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.1",
    // ANTLRv4
    antlr4GenVisitor in Antlr4 := true, // default = false
    antlr4GenListener in Antlr4 := false, // default = true
    antlr4PackageName in Antlr4 := Option("firrtl.antlr"),
    antlr4Version in Antlr4 := "4.7.1",
    javaSource in Antlr4 := (sourceManaged in Compile).value,
  )
  .jsSettings(
    scalaJSModuleKind := ModuleKind.CommonJSModule,
  )

lazy val firrtlJVM = firrtl.jvm
  .enablePlugins(Antlr4Plugin)
  .enablePlugins(ProtobufPlugin)
lazy val firrtlJS = firrtl.js
