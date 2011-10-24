abstract class Greeter(greeting: String, msg: String) {
  def sayHello() = greeting + " " + msg
}

class GreeterSE extends Greeter("Hej!", "Scala är kul")

class GreeterEN extends Greeter("Hi!", "Scala is fun")
