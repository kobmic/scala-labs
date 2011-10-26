package lab03

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class DuckSpec extends Spec with ShouldMatchers {

  describe("A Mallard duck") {
    val duck = new MallardDuck
    it("should fly and quack") {
      duck.fly() should equal("I'm flying")
      duck.quack() should equal("quack quack")
    }
  }
  
  describe("A model duck with philosophers fly and quack behaviour") {
    val duck = new ModelDuck(() => "I fly therefore I am", () => "I quack therefore I am")
    it("should fly and quack like a philsopher") {
      duck.fly() should equal("I fly therefore I am")
      duck.quack() should equal("I quack therefore I am")
    }
  }

  
  
 
}