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
  // remember that 'override' is a keyword and is required in Scala
}

// FIXME
// add Mixins FlyNoWay and Squeak to the rubber duck
class RubberDuck extends Duck // FIXME
  
}

// FIXME
// define subclass MallardDuck with Mixins Fly and Quack







