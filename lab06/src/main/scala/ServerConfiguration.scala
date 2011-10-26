package lab06

object ServerConfiguration {
  // FIXME:
  // add apply methods 
}

class ServerConfiguration(val host: String, val port: Int) {
  def url = "http://" + host + ":" + port
}