package controllers.filmkinopoisk
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
class FilmController {
    private val client = new RetrofitClient()

    def getMovies(year: Int, month: String): Future[ListPremiere] = {
        client.getMovies(year, month)
    }

    def getFilm(id: String): Future[FilmDataItem] = {
        client.getFilm(id)
    }
    
}

