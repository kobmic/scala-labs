package lab06

object ServerConfiguration {
  def apply(host: String, port: Int) = new ServerConfiguration(host, port)
  def apply() = new ServerConfiguration("localhost", 8080)
}

class ServerConfiguration(val host: String, val port: Int) {
  def url = "http://" + host + ":" + port
}