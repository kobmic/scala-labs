package lab01

abstract class Greeter(greeting: String, msg: String) {
  def sayHello() = greeting + " " + msg
}

// FIXME:
// add subclasses MorningGreeter, DefaultGreeter, SimpleGreeter

// TIP:
// Scala does not require every public class to be declared
// in a file of the same name. Organizationally, it makes sense
// for all of these trivial classes to be contained within the same file.