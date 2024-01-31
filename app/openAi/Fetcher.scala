package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json._
import scala.concurrent.ExecutionContext
import java.nio.file.{Files, Paths}
import scala.concurrent.Future

@Singleton
class FetchController @Inject()(
    val controllerComponents: ControllerComponents,
    ws: WSClient,
    implicit val ec: ExecutionContext) extends BaseController {


    val logger = play.api.Logger("application")

  def index() = Action.async { implicit request: Request[AnyContent] =>
    val requestBody = Json.obj(
      "model" -> "dall-e-3",
      "prompt" -> "A cute cat",
      "n" -> 1,
      "size" -> "1024x1024"
    )
    
        logger.debug("Отправка запроса на API")
    

    ws.url("https://api.openai.com/v1/images/generations")
      .addHttpHeaders("Content-Type" -> "application/json")
      .addHttpHeaders("Authorization" -> s"Bearer ${System.getenv(openAiApiKey)}")
      .post(requestBody)
      .map { response =>
        logger.debug("Получен ответ от API")
        val imagePath = Paths.get("/app/src/main/resources/images/image.jpg")
        Files.createDirectories(imagePath.getParent)
        Files.write(imagePath, response.bodyAsBytes.toArray)
        logger.debug(" ответ от API")

        Ok("Image saved successfully.")
      }
  }
}
