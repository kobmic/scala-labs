package lab08

case class Point(x: Double, y: Double)

abstract class Shape()
case class Circle(center: Point, radius: Double) extends Shape()
case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape()
case class Square(lowerLeft: Point, height: Double) extends Shape()
case class SomeOtherShape(lowerLeft: Point) extends Shape()

class ShapeStretcher {
  def stretch(s: Shape): Shape = s match {
    case Circle(c, r) => Circle(c, r * 2)
    case Square(l, h) => Square(l, h * 2)
    case Rectangle(l, h, w) => Rectangle(l, h * 2, w * 2)
    case _ => throw new IllegalArgumentException("don't know how to stretch")
  }
}