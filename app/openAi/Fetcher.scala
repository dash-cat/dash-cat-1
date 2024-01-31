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


    def safeDivide(x: Int, y: Int): Option[Int] = if (y != 0) Some(x / y) else None
    val result = safeDivide(10, 2).flatMap(r => safeDivide(r, 3)) // возвращает Option[Int]

    val numbers = List(1, 2, 3)
    val result = numbers.flatMap(n => List(n, n * 10)) // List(1, 10, 2, 20, 3, 30)

    import scala.concurrent.Future
    import scala.concurrent.ExecutionContext.Implicits.global

    def asyncOperation1(): Future[Int] = Future { /* асинхронная операция */ }
    def asyncOperation2(x: Int): Future[String] = Future { /* еще одна асинхронная операция */ }

    val result = asyncOperation1().flatMap(n => asyncOperation2(n))


}