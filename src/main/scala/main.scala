import java.net.URL

import play.api.libs.json.{JsValue, Json}
import src.main.scala.ScalajHttpClientSample.httpRequest


object main extends App{
    var GithubUser: JsValue = Json.parse(httpRequest("GET","http://localhost:9000/v1/posts",Map(),"").body)
    println(GithubUser)
}
