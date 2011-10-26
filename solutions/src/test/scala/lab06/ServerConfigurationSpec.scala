package lab06

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ServerConfigurationSpec extends Spec with ShouldMatchers {

  describe("The server configuartion companion object") {
    it("should allow to construct server configurations without 'new'") {
      val conf1 = ServerConfiguration("servername", 9001)
      conf1.host should equal("servername")
      val conf2 = ServerConfiguration()
      conf2.host should equal("localhost")
    }
  }
}