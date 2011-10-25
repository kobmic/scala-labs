package com.jayway.scala-labs.lab01

abstract class Greeter(greeting: String, msg: String) {
  def sayHello() = greeting + " " + msg
}

class GreeterSE extends Greeter("Hej!", "Scala Šr kul")

class GreeterEN extends Greeter("Hi!", "Scala is fun")
