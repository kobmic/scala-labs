package lab03

abstract class Duck(val fly: () => String, val quack: () => String) {
  def display() : String
 
  def swim() {
    println("All ducks float, even decoys!")
  }
}

// FIXME
// extend Duck and use FlyBehaviors.fly and a function literal returning "quack quack"
// in the call of the super constructor
class MallardDuck // FIXME...
  override def display() = {
    "I'm a real Mallard duck"
  }
}

// FIXME
// define subclass ModelDuck that takes fly and quack functions in it's
// primary constructor.
class ModelDuck




