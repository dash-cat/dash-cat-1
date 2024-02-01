package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import play.api.Logger
import play.api.libs.json.Json
import scala.concurrent.Future
import play.api.libs.json.Json
import scala.util.{Success, Failure}

@Singleton
class HomeController @Inject()(
  val controllerComponents: ControllerComponents
) extends BaseController {


  val logger: play.api.Logger = play.api.Logger(this.getClass)
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  } 

  
  def generateImage: Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
  val payload = Json.obj(
    "model" -> "dall-e-3",
    "prompt" -> "A cute cat",
    "n" -> 1,
    "size" -> "1024x1024"
  ).toString()

   val futureResponse = Future.fromTry(OpenAiApiClient.callOpenAiApi(payload))

  futureResponse.map { response =>
    Ok("Image generated successfully.")
  }.recover {
    case exception: Throwable =>
      logger.error("Error generating image", exception)
      InternalServerError("Error generating image")
  }
}
}