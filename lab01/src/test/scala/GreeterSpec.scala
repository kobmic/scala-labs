package com.jayway.scala-labs.lab01

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class GreeterSpec extends Spec with ShouldMatchers {

  describe("A swedish greeter") {
    val greeter = new GreeterSE
    it("should greet in swedish") {
      greeter.sayHello should equal("Hej! Scala Šr kul")
    }
  }
}