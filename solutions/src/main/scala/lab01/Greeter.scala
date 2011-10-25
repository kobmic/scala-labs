package lab01

abstract class Greeter(greeting: String, msg: String) {
  def sayHello() = greeting + " " + msg
}

class MorningGreeter extends Greeter("God morning!", "Have fun with Scala.")  

class DefaultGreeter extends Greeter("Hello!", "Scala is fun.")

class SimpleGreeter(greeting: String) extends Greeter(greeting, "Scala is fun.")

