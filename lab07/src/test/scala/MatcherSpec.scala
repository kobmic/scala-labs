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
    
  it("should describe 5 as 'five'") {
    matcher.describe(5) should equal("five")
  }

it("should describe 'ping' as 'pong'") {
  matcher.describe("ping") should equal("pong")
}

it("should describe every other String as 'a string'") {
  matcher.describe("other than ping") should equal("a string")
  for (i <- 0 until 100) {
    matcher.describe("pong" + i) should equal("a string")
  }
}

it("should describe every tuple of integers as 'a tuple of ints'") {
  for (i <- 0 until 100) {
    matcher.describe((i,i+1)) should equal("a tuple of ints: (" + i + "," + (i + 1) + ")")
  }
}

it("should lists with 3 elems, with a 1 as second element'") {
  matcher.describe(List(9,1,4)) should equal("a list with 3 elems, with a 1 as second element")
  for (i <- 0 until 100) {
    matcher.describe(List(i,1,i+1)) should equal("a list with 3 elems, with a 1 as second element")
  }
}

it("should describe lists of arbitrary length starting with a 1") {
  matcher.describe(List(1,2,4)) should equal("a list starting with a 1")
  matcher.describe(List(1,3,4,5,7,8)) should equal("a list starting with a 1")
  matcher.describe(List(1,5,4,5,7,8,9,0,1,3,4,5,6)) should equal("a list starting with a 1")
}

it("should describe Nil as empty list") {
  matcher.describe(Nil) should equal("empty list")
}

it("should describe everything else as something else") {
  matcher.describe(Map(1 -> "a")) should equal("something else")
  matcher.describe(2.6) should equal("something else")
}


  }
 
}  