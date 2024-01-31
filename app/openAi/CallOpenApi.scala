import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils
import scala.util.{Try, Failure, Success}
package controllers

def callOpenAiApi(payload: String): Try[String] = {
  val client = HttpClients.createDefault()
  val post = new HttpPost("URL_API_ENDPOINT") // Замените URL_API_ENDPOINT на реальный URL
  post.setHeader("Content-type", "application/json")
  post.setHeader("Authorization", s"Bearer ${System.getenv(openAiApiKey)}") 

  post.setEntity(new StringEntity(payload))

  Try(client.execute(post)) match {
    case Success(response) =>
      val entity = response.getEntity
      val result = EntityUtils.toString(entity)
      response.close()
      Success(result)

    case Failure(exception) =>
      Failure(exception)
  }
}

import org.apache.http.HttpResponse
import scala.util.{Try, Success, Failure}
import org.json4s._
import org.json4s.native.JsonMethods._

def processApiResponse(response: Try[HttpResponse]): Try[JValue] = response match {
  case Success(res) =>
    res.getStatusLine.getStatusCode match {
      case 200 =>
        val entity = res.getEntity
        val content = EntityUtils.toString(entity)
        res.close()
        Try(parse(content))

      case _ =>
        Failure(new RuntimeException(s"Failed with HTTP error code: ${res.getStatusLine.getStatusCode}"))
    }

  case Failure(ex) =>
    Failure(ex)
}
