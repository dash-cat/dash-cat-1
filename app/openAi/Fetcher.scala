package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
 
@Singleton
class HomeController @Inject()(
    val controllerComponents: ControllerComponents,
    ws: WSClient,
    implicit val ec: ExecutionContext) extends BaseController {

  def index() = Action.async { implicit request: Request[AnyContent] =>
    val requestBody = Json.obj(
      "model" -> "gpt-3.5-turbo",
      "messages" -> Json.arr(
        Json.obj(
          "role" -> "system",
          "content" -> "You are a poetic assistant, skilled in explaining complex programming concepts with creative flair."
        ),
        Json.obj(
          "role" -> "user",
          "content" -> "Compose a poem that explains the concept of recursion in programming."
        )
      )
    )

   


    ws.url("https://api.openai.com/v1/chat/completions")
      .addHttpHeaders("Content-Type" -> "application/json")
      .addHttpHeaders("Authorization" -> s"Bearer $openAiApiKey")
      .post(requestBody)
      .map { response =>
        Ok(response.body)
      }
  }


}

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object Logger {
  def log(message: String): Unit = macro logImpl

  def logImpl(c: blackbox.Context)(message: c.Expr[String]): c.Expr[Unit] = {
    import c.universe._

    val pos = c.enclosingPosition
    val file = pos.source.file.name
    val line = pos.line

    reify {
      println(s"[$file:$line] " + message.splice)
    }
  }
}

