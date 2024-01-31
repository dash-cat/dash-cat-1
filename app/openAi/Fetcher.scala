package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json._
import scala.concurrent.ExecutionContext
import java.nio.file.{Files, Paths}
import scala.concurrent.Future

@Singleton
class HomeController @Inject()(
    val controllerComponents: ControllerComponents,
    ws: WSClient,
    implicit val ec: ExecutionContext) extends BaseController {

  def index() = Action.async { implicit request: Request[AnyContent] =>
    val requestBody = Json.obj(
      "model" -> "dall-e-3",
      "prompt" -> "A cute baby sea otter",
      "n" -> 1,
      "size" -> "1024x1024"
    )

    ws.url("https://api.openai.com/v1/images/generations")
      .addHttpHeaders("Content-Type" -> "application/json")
      .addHttpHeaders("Authorization" -> s"Bearer ${System.getenv(openAiApiKey)}")
      .post(requestBody)
      .map { response =>
        val imagePath = Paths.get("/app/src/main/resources/images/image.jpg")
        Files.createDirectories(imagePath.getParent)
        Files.write(imagePath, response.bodyAsBytes.toArray)
        Ok("Image saved successfully.")
      }
  }
}
