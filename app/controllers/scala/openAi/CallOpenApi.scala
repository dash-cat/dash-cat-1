package controllers
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils
import scala.util.{Try, Success, Failure}

// Class for handling OpenAI API requests
object OpenAiApiClient {
  // val openAiApiKey = sys.env.getOrElse("sk-", "default-key-if-not-set")

  def callOpenAiApi(payload: String): Try[String] = {
    val client = HttpClients.createDefault()
    val post = new HttpPost("https://api.openai.com/v1/images/generations") 
    post.setHeader("Content-type", "application/json")
    post.setHeader("Authorization", s"Bearer sk-") 

    post.setEntity(new StringEntity(payload))

    Try(client.execute(post)) match {
      case Success(response) =>
        val result = EntityUtils.toString(response.getEntity)
        response.close()
        Success(result)

      case Failure(exception) =>
        Failure(exception)
    }
  }
}
