import org.apache.http.impl.client.HttpClients
import org.apache.http.client.methods.HttpGet
import org.apache.http.ssl.SSLContextBuilder
import org.apache.http.conn.ssl.NoopHostnameVerifier

object SslExample {
  def main(args: Array[String]): Unit = {
    // Create a custom SSL context.
    val sslContext = SSLContexts.createSystemDefault()
    val httpClient = HttpClients.custom()
      .setSSLContext(sslContext)
      .build()
    // Create a GET request to an HTTPS URL.
    val getRequest = new HttpGet("https://your-https-url.com")

    // Execute the request.
    val response = httpClient.execute(getRequest)

    // Print the response status line.
    println(response.getStatusLine)

    // Always close the response.
    response.close()
  }
}
