file://<WORKSPACE>/.g8/form/app/controllers/$model__Camel$Controller.scala
### file%3A%2F%2F%2Fhome%2Fgriggy%2Fcode%2Fcat-back%2F.g8%2Fform%2Fapp%2Fcontrollers%2F%24model__Camel%24Controller.scala:9: error: case classes must have a parameter list; try 'case class $model()' or 'case object $model'
case class $model;format="Camel"$Data(name: String, age: Int)
                 ^

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/.g8/form/app/controllers/$model__Camel$Controller.scala
text:
```scala
package controllers

import javax.inject._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._

case class $model;format="Camel"$Data(name: String, age: Int)
object $model;format="Camel"$Data {
  def unapply(data: $model;format="Camel"$Data): Option[(String, Int)] = Some((data.name, data.age))
}

// NOTE: Add the following to conf/routes to enable compilation of this class:
/*
GET     /$model;format="camel"$        controllers.$model;format="Camel"$Controller.$model;format="camel"$Get()
POST    /$model;format="camel"$        controllers.$model;format="Camel"$Controller.$model;format="camel"$Post()
*/

/**
 * $model;format="Camel"$ form controller for Play Scala
 */
class $model;format="Camel"$Controller @Inject()(mcc: MessagesControllerComponents) extends MessagesAbstractController(mcc) {

  val $model;format="camel"$Form = Form(
    mapping(
      "name" -> text,
      "age" -> number
    )($model;format="Camel"$Data.apply)($model;format="Camel"$Data.unapply)
  )

  def $model;format="camel"$Get() = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.$model;format="camel"$.form($model;format="camel"$Form))
  }

  def $model;format="camel"$Post() = Action { implicit request: MessagesRequest[AnyContent] =>
    $model;format="camel"$Form.bindFromRequest().fold(
      formWithErrors => {
        // binding failure, you retrieve the form containing errors:
        BadRequest(views.html.$model;format="camel"$.form(formWithErrors))
      },
      $model;format="camel"$Data => {
        /* binding success, you get the actual value. */       
        /* flashing uses a short lived cookie */ 
        Redirect(routes.$model;format="Camel"$Controller.$model;format="camel"$Get()).flashing("success" -> ("Successful " + $model;format="camel"$Data.toString))
      }
    )
  }
}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$classDef$1(ScalametaParser.scala:3953)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:368)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:373)
	scala.meta.internal.parsers.ScalametaParser.classDef(ScalametaParser.scala:3933)
	scala.meta.internal.parsers.ScalametaParser.tmplDef(ScalametaParser.scala:3894)
	scala.meta.internal.parsers.ScalametaParser.topLevelTmplDef(ScalametaParser.scala:3877)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4483)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4471)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4462)
	scala.meta.internal.parsers.ScalametaParser.bracelessPackageStats$1(ScalametaParser.scala:4681)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$11(ScalametaParser.scala:4692)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:368)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$10(ScalametaParser.scala:4692)
	scala.meta.internal.parsers.ScalametaParser.tryParse(ScalametaParser.scala:216)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4684)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4652)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4650)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:135)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:132)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:59)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:374)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fgriggy%2Fcode%2Fcat-back%2F.g8%2Fform%2Fapp%2Fcontrollers%2F%24model__Camel%24Controller.scala:9: error: case classes must have a parameter list; try 'case class $model()' or 'case object $model'
case class $model;format="Camel"$Data(name: String, age: Int)
                 ^