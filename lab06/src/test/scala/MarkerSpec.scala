package lab06

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class MarkerFactorySpec extends Spec with ShouldMatchers {

  describe("The marker object") {
    it("should return the eprimary colors") {
      Marker.primaryColors should equal("red, green, blue")
    }
    
    it("should provide an apply method for new marker instances") {
      Marker("red").toString should equal("red")
    }
    
    it("should provide an apply method that returns null for non primary colors") {
      Marker("yellow") should equal(null)
    }
  }
}