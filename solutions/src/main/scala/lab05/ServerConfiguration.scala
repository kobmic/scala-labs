package lab05

object ServerConfiguration {
  val port = 8080
  val host = "localhost"
  def url = "http://" + host + ":" + port  
}