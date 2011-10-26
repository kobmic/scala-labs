package lab02

abstract class Duck {
  def display() : String
 
  def swim() {
    println("All ducks float, even decoys!")
  }
}

class MallardDuck extends Duck with Fly with Quack {
  override def display() = {
    "I'm a Mallard duck"
  }
}

class RubberDuck extends Duck with FlyNoWay with Squeak {
  override def display() = {
    "I'm a rubber duck";
  }
}

class ModelDuck extends Duck {
  override def display() = {
    "I'm a model duck";
  }
}



