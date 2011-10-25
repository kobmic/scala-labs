package lab06;

object Duck {
  // Factory method
  def create() = new Duck()
}

object Duck {
  def apply() = new Duck()
}

class Duck private() {
 def quack() = "quack"
}

object GooseFactory {
 private[this] class Goose() {
    def quack() = "quack"
 }
  // Factory method
  def create() = new Goose()

}