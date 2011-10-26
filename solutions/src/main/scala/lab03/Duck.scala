package lab03

abstract class Duck(val fly: () => String, val quack: () => String) {
  def display() : String
 
  def swim() {
    println("All ducks float, even decoys!")
  }
}

class MallardDuck extends Duck(FlyBehaviors.fly, () => {"quack quack"}) {
  override def display() = {
    "I'm a real Mallard duck"
  }
}

class ModelDuck(fly: () => String, quack: () => String) extends Duck(fly, quack) {
  override def display() = {
    "I'm a model duck"
  }
}



