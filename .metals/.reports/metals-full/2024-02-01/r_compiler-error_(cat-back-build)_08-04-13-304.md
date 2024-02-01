file://<WORKSPACE>/build.sbt
### file%3A%2F%2F%2Fhome%2Fgriggy%2Fcode%2Fcat-back%2Fbuild.sbt:27: error: unclosed string literal
  "com.typesafe.play" %% "play-ws" % "3
                                     ^

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/build.sbt
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.JUnitXmlReportPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._, _root_.play.sbt.Play.autoImport._, _root_.play.sbt.PlayService.autoImport._, _root_.play.sbt.routes.RoutesCompiler.autoImport._, _root_.giter8.ScaffoldPlugin.autoImport._, _root_.play.twirl.sbt.SbtTwirl.autoImport._, _root_.com.typesafe.sbt.SbtNativePackager.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.JavaAppPackaging.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.JavaServerAppPackaging.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.jar.ClasspathJarPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.jar.LauncherJarPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.jlink.JlinkPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.scripts.BashStartScriptPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.scripts.BatStartScriptPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemdPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemloaderPlugin.autoImport._, _root_.com.typesafe.sbt.packager.debian.DebianPlugin.autoImport._, _root_.com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._, _root_.com.typesafe.sbt.packager.graalvmnativeimage.GraalVMNativeImagePlugin.autoImport._, _root_.com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin.autoImport._, _root_.com.typesafe.sbt.packager.linux.LinuxPlugin.autoImport._, _root_.com.typesafe.sbt.packager.rpm.RpmPlugin.autoImport._, _root_.com.typesafe.sbt.packager.universal.UniversalPlugin.autoImport._, _root_.com.typesafe.sbt.packager.windows.WindowsPlugin.autoImport._, _root_.com.typesafe.sbt.web.SbtWeb.autoImport._, _root_.com.typesafe.sbt.jse.SbtJsEngine.autoImport._, _root_.com.typesafe.sbt.jse.SbtJsTask.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin, _root_.play.sbt.Play, _root_.play.sbt.PlayFilters, _root_.play.sbt.PlayJava, _root_.play.sbt.PlayLayoutPlugin, _root_.play.sbt.PlayLogback, _root_.play.sbt.PlayMinimalJava, _root_.play.sbt.PlayNettyServer, _root_.play.sbt.PlayPekkoHttp2Support, _root_.play.sbt.PlayPekkoHttpServer, _root_.play.sbt.PlayScala, _root_.play.sbt.PlayService, _root_.play.sbt.PlayWeb, _root_.play.sbt.routes.RoutesCompiler, _root_.giter8.ScaffoldPlugin, _root_.play.twirl.sbt.SbtTwirl, _root_.com.typesafe.sbt.SbtNativePackager, _root_.com.typesafe.sbt.packager.archetypes.JavaAppPackaging, _root_.com.typesafe.sbt.packager.archetypes.JavaServerAppPackaging, _root_.com.typesafe.sbt.packager.archetypes.jar.ClasspathJarPlugin, _root_.com.typesafe.sbt.packager.archetypes.jar.LauncherJarPlugin, _root_.com.typesafe.sbt.packager.archetypes.jlink.JlinkPlugin, _root_.com.typesafe.sbt.packager.archetypes.scripts.AshScriptPlugin, _root_.com.typesafe.sbt.packager.archetypes.scripts.BashStartScriptPlugin, _root_.com.typesafe.sbt.packager.archetypes.scripts.BatStartScriptPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemVPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemdPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemloaderPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.UpstartPlugin, _root_.com.typesafe.sbt.packager.debian.DebianDeployPlugin, _root_.com.typesafe.sbt.packager.debian.DebianPlugin, _root_.com.typesafe.sbt.packager.debian.JDebPackaging, _root_.com.typesafe.sbt.packager.docker.DockerPlugin, _root_.com.typesafe.sbt.packager.docker.DockerSpotifyClientPlugin, _root_.com.typesafe.sbt.packager.graalvmnativeimage.GraalVMNativeImagePlugin, _root_.com.typesafe.sbt.packager.jdkpackager.JDKPackagerDeployPlugin, _root_.com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin, _root_.com.typesafe.sbt.packager.linux.LinuxPlugin, _root_.com.typesafe.sbt.packager.rpm.RpmDeployPlugin, _root_.com.typesafe.sbt.packager.rpm.RpmPlugin, _root_.com.typesafe.sbt.packager.universal.UniversalDeployPlugin, _root_.com.typesafe.sbt.packager.universal.UniversalPlugin, _root_.com.typesafe.sbt.packager.windows.WindowsDeployPlugin, _root_.com.typesafe.sbt.packager.windows.WindowsPlugin, _root_.com.typesafe.sbt.web.SbtWeb, _root_.com.typesafe.sbt.jse.SbtJsEngine, _root_.com.typesafe.sbt.jse.SbtJsTask
name := """cat-back"""
organization := "cat-science.org"

version := "1.0-SNAPSHOT"

Global / onChangedBuildSource := ReloadOnSourceChanges


scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
libraryDependencies += "org.python" % "jython-standalone" % "2.7.2"
libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.13"
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies += "org.playframework" %% "play-ahc-ws-standalone" % "3.0.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.25"
libraryDependencies ++= Seq(
  guice,
  "com.typesafe.play" %% "play-ws" % "3
)


lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"

```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:33)
	scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:33)
	scala.meta.internal.tokenizers.LegacyScanner.getStringLit(LegacyScanner.scala:553)
	scala.meta.internal.tokenizers.LegacyScanner.fetchDoubleQuote$1(LegacyScanner.scala:372)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:376)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:211)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:1011)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:24)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:17)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:895)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:17)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:332)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:25)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:14)
	scala.meta.internal.parsers.ScannerTokens$.apply(ScannerTokens.scala:914)
	scala.meta.internal.parsers.ScalametaParser.<init>(ScalametaParser.scala:33)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:35)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:374)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fgriggy%2Fcode%2Fcat-back%2Fbuild.sbt:27: error: unclosed string literal
  "com.typesafe.play" %% "play-ws" % "3
                                     ^