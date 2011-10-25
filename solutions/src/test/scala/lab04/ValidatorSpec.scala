package lab04

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ValidatorSpec extends Spec with ShouldMatchers {
  val p1 = Person("Max", 15, "SE", "max@gmail.com")
  val p2 = Person("Tom", 25, "SE", "tom@gmail.com")
  val p3 = Person("Joe", 35, "US", "max@gmail.com")
  val persons = List(p1, p2, p3)

  describe("A basic validator with age validator") {
   val validator = new BasicValidator() with AgeValidator
   it("should filter persons under 18") {
      persons.filter(validator.validate(_)).size should equal(2)
   }
  }
  
  describe("A basic validator with age and country validator") {
   val validator = new BasicValidator() with AgeValidator with CountryValidator
   it("should filter persons under 18 and non swedish persons") {
      persons.filter(validator.validate(_)).size should equal(1)
   }
  }
}  