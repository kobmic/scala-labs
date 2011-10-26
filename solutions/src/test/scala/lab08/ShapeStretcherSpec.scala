package lab08

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ShapeStretcherSpec extends Spec with ShouldMatchers {

  describe("A shape stretcher") {
    val stretcher = new ShapeStretcher()
    
    it("should double the radius of circles") {
      val circle = Circle(Point(0.0, 1.0), 2.0)
      stretcher.stretch(circle) should equal(Circle(Point(0.0, 1.0), 4.0)) 
    }
    
    it("should double the height of a square") {
      val square = Square(Point(2.0, 2.0), 3.0)
      stretcher.stretch(square) should equal(Square(Point(2.0, 2.0), 6.0)) 
    }
    
    it("should double the height and width of a rectangle") {
      val rect = Rectangle(Point(2.0, 2.0), 2.0, 3.0)
      stretcher.stretch(rect) should equal(Rectangle(Point(2.0, 2.0), 4.0, 6.0)) 
    }
    
    it("should throw IllegalArgumentException when trying to stretch other shapes") {
      val otherShape = new SomeOtherShape(Point(1.0, 1.0))
      intercept[IllegalArgumentException] {
        stretcher.stretch(otherShape)
      }
    }
    
  }
  
}