package lab09

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ImplicitsSpec extends Spec with ShouldMatchers {

  describe("the rich int conversion") {
    import Implicits._
    it("should allow to call double() on integers") {
      2.double() should equal(4)
    }
  }
  
 describe("the elvis operator conversion") {
    import Implicits._
    it("should allow to use the elvis operator ?: on strings") {
      "not null" ?: "default" should equal("not null")
      val someString: String = null
      someString ?: "default" should equal("default")
    }
  }
}