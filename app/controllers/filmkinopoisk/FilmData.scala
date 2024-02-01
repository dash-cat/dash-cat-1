package controllers.filmkinopoisk
import play.api.libs.json._

case class Country(country: String)
object Country {
  implicit val format: Format[Country] = Json.format[Country]
}

case class Genre(genre: String)
object Genre {
  implicit val format: Format[Genre] = Json.format[Genre]
}

case class FilmDataItem(
  completed: Option[Boolean],
  countries: Option[List[Country]],
  coverUrl: Option[String],
  description: Option[String],
  editorAnnotation: Option[String],
  endYear: Option[String],
  filmLength: Option[Int],
  genres: Option[List[Genre]],
  has3D: Option[Boolean],
  hasImax: Option[Boolean],
  imdbId: Option[String],
  isTicketsAvailable: Option[Boolean],
  kinopoiskHDId: Option[String],
  kinopoiskId: Option[Int],
  lastSync: Option[String],
  logoUrl: Option[String],
  nameEn: Option[String],
  nameOriginal: Option[String],
  nameRu: Option[String],
  posterUrl: Option[String],
  posterUrlPreview: Option[String],
  productionStatus: Option[String],
  ratingAgeLimits: Option[String],
  ratingAwait: Option[String],
  ratingAwaitCount: Option[Int],
  ratingFilmCritics: Option[Double],
  ratingFilmCriticsVoteCount: Option[Int],
  ratingGoodReview: Option[Double],
  ratingGoodReviewVoteCount: Option[Int],
  ratingImdb: Option[Double],
  ratingImdbVoteCount: Option[Int],
  ratingKinopoisk: Option[Double],
  ratingKinopoiskVoteCount: Option[Int],
  ratingMpaa: Option[String],
  ratingRfCritics: Option[Double],
  ratingRfCriticsVoteCount: Option[Int],
  reviewsCount: Option[Int],
  serial: Option[Boolean],
  shortDescription: Option[String],
  shortFilm: Option[Boolean],
  slogan: Option[String],
  startYear: Option[String],
  `type`: Option[String],
  webUrl: Option[String],
  year: Option[Int]
)

case class Movie(
  countries: List[Country],
  duration: Int,
  genres: List[Genre],
  kinopoiskId: Int,
  nameEn: String,
  nameRu: String,
  posterUrl: String,
  posterUrlPreview: String,
  premiereRu: String,
  year: Int
)
object Movie {
  implicit val format: Format[Movie] = Json.format[Movie]
}
case class ListPremiere(
  items: List[Movie],
  total: Int
)

object ListPremiere {
  implicit val format: Format[ListPremiere] = Json.format[ListPremiere]
}


object FilmDataItem {
  implicit val format: Format[FilmDataItem] = Json.format[FilmDataItem]
}
