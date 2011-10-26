package lab05

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ServerConfigurationSpec extends Spec with ShouldMatchers {

  describe("A server configuration") {
    it("should hold host and port") {
      ServerConfiguration.host should equal("localhost")
      ServerConfiguration.port should equal(8080)
    }
    
    it("should generate an url") {
      ServerConfiguration.url should equal("http://localhost:8080")
    }
  }
}