package lab02

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class DuckSpec extends Spec with ShouldMatchers {

  describe("A Mallard duck") {
    val duck = new MallardDuck
    it("should fly and quack") {
      duck.fly should equal("I'm flying")
      duck.quack should equal("Quack")
    }
  }
  
  describe("A rubber duck") {
    val duck = new RubberDuck
    it("should not fly") {
      duck.fly should equal("I can't fly")
      duck.quack should equal("Squeak")
    }
  }
  
  describe("A muted rocket powered model duck") {
    val duck = new ModelDuck with FlyRocketPowered with MuteQuack
    it("should fly rocket powered silently") {
      duck.fly should equal("I'm flying with a rocket")
      duck.quack should equal("<< Silence >>")
    }
  }
 
}