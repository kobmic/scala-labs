package lab07

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import scala.collection.mutable.ArrayBuffer

@RunWith(classOf[JUnitRunner])
class MatcherSpec extends Spec with ShouldMatchers {
  
  describe("A Matcher") {
    val matcher = new Matcher()
    it("should match nice activties for weekends") {
      matcher.activity("saturday") should equal("go out with friends")
      matcher.activity("sunday") should equal("sleep")
    }
    it("should match to work for any other day") {
      matcher.activity("monday") should equal("work")
      matcher.activity("talk like a priate day") should equal("work")
    }

  }
 
}  