package lab02

abstract class Duck {
  def display() : String
 
  def swim() {
    println("All ducks float, even decoys!")
  }
}

class ModelDuck extends Duck {
  // FIXME
  // override the display method
  // remeber that 'override' is a keyword and is required in Scala
}

// FIXME
// add Mixins FlyNoWay and Squeak to the rubber duck
class RubberDuck extends Duck {
  override def display() = {
    "I'm a rubber duck";
  }
}

// FIXME
// define subclass MallardDuck with Mixins Fly and Quack







