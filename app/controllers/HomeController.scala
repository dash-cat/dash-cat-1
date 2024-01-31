package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import play.api.Logger
@Singleton
class HomeController @Inject()(
  val controllerComponents: ControllerComponents
) extends BaseController {


  val logger: Logger = Logger(this.getClass)

  def generateImage(): Future[Result] = {
  val payload = Json.obj(
      "model" -> "dall-e-3",
      "prompt" -> "A cute cat",
      "n" -> 1,
      "size" -> "1024x1024"
  ).toString()

  Future {
    OpenAiApiClient.callOpenAiApi(payload) match {
      case Success(response) =>
        logger.debug("Отправка запроса на API")
        Ok("Image generated successfully.")

      case Failure(exception) =>
        InternalServerError("Error generating image")
    }
  }
}

  def index() = Action.async { implicit request: Request[AnyContent] =>
    generateImage().map { imageResult =>
      Ok(views.html.index(imageResult))
    }
  }
}
