package controllers.filmkinopoisk
import sttp.client._
import play.api.libs.json._
import scala.concurrent.Future

trait IRetrofitClient {
  def getMovies(year: Int, month: String): Future[ListPremiere]
  def getFilm(id: String): Future[FilmDataItem]
}

class RetrofitClient extends IRetrofitClient {
  private val baseUrl = "https://kinopoiskapiunofficial.tech/api/v2.2/"
  private val apiKey = "0161a006-38d5-448a-9ce4-9c72e615dbf5"

  implicit val backend: SttpBackend[Identity, Nothing, NothingT] = HttpURLConnectionBackend()

  override def getMovies(year: Int, month: String): Future[ListPremiere] = Future {
    val request = basicRequest
      .get(uri"$baseUrl/movies/$year/$month")
      .header("X-API-KEY", apiKey)
      .header("accept", "application/json")

    val response = request.send()
    if (response.is200) {
      Json.parse(response.body).as[ListPremiere]
    } else {
      throw new Exception("API Error: ${response.code} ${response.statusText}")
    }
  }

  override def getFilm(id: String): Future[FilmDataItem] = Future {
    val request = basicRequest
      .get(uri"$baseUrl/film/$id")
      .header("X-API-KEY", apiKey)
      .header("accept", "application/json")

    val response = request.send()
    if (response.is200) {
      Json.parse(response.body).as[FilmDataItem]
    } else {
      throw new Exception("Failed to load film data")
    }
  }
}
