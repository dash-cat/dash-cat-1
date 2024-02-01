package controllers.filmkinopoisk
import sttp.client._
import play.api.libs.json._
import scala.concurrent.Future

import sttp.client._
import play.api.libs.json._
import scala.concurrent.{Future, ExecutionContext}

trait IRetrofitClient {
  def getMovies(year: Int, month: String): Future[ListPremiere]
  def getFilm(id: String): Future[FilmDataItem]
}

class RetrofitClient(implicit ec: ExecutionContext) extends IRetrofitClient {
  private val baseUrl = "https://kinopoiskapiunofficial.tech/api/v2.2/"
  private val apiKey = "0161a006-38d5-448a-9ce4-9c72e615dbf5"

  implicit val backend: SttpBackend[Future, Nothing, NothingT] = AsyncHttpClientFutureBackend()

  override def getMovies(year: Int, month: String): Future[ListPremiere] = {
    val request = basicRequest
      .get(uri"$baseUrl/movies/$year/$month")
      .header("X-API-KEY", apiKey)
      .header("accept", "application/json")

    request.send().map { response =>
      if (response.is200) {
        Json.parse(response.body).as[ListPremiere]
      } else {
        throw new Exception(s"API Error: ${response.code} ${response.statusText}")
      }
    }
  }

  override def getFilm(id: String): Future[FilmDataItem] = {
    val request = basicRequest
      .get(uri"$baseUrl/film/$id")
      .header("X-API-KEY", apiKey)
      .header("accept", "application/json")

    request.send().map { response =>
      if (response.is200) {
        Json.parse(response.body).as[FilmDataItem]
      } else {
        throw new Exception("Failed to load film data")
      }
    }
  }
}
