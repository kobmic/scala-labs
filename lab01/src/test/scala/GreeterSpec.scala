package lab01

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class GreeterSpec extends Spec with ShouldMatchers {

  describe("A morning greeter") {
    val greeter = new MorningGreeter
    it("should say god morning") {
      greeter.sayHello should equal("God morning! Have fun with Scala.")
    }
  }
  
  describe("A default greeter") {
    val greeter = new DefaultGreeter
    it("should say hello") {
      greeter.sayHello should equal("Hello! Scala is fun.")
    }
  }
  
  describe("A simple greeter") {
    val greeter = new SimpleGreeter("Hej!")
    it("should say Hej") {
      greeter.sayHello should equal("Hej! Scala is fun.")
    }
  }
}