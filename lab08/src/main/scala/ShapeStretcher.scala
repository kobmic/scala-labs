package lab08

case class Point(x: Double, y: Double)

abstract class Shape()
case class Circle(center: Point, radius: Double) extends Shape()
case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape()
case class Square(lowerLeft: Point, height: Double) extends Shape()
case class SomeOtherShape(lowerLeft: Point) extends Shape()

class ShapeStretcher {
  def stretch(s: Shape): Shape = s match {
    // FIXME
  }
}