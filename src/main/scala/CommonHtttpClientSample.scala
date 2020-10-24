package src.main.scala


trait WebMethod {
    def Get(url: String, headers: Map[String, String]): CustomResponse

}

abstract class CommonHttpClientSample extends WebMethod {

    val readTimeoutMillis = 5000
    var connectTimeoutMillis = 5000
}

case class CustomResponse(statusCode: Int, status: String, body: String)

