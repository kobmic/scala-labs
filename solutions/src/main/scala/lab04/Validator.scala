package lab04

case class Person(val name: String, val age: Int, val country: String, email: String)
 
abstract class Validator {
 def validate(p: Person) : Boolean
}

class BasicValidator extends Validator {
 override def validate(p: Person) : Boolean = !p.name.isEmpty && !p.country.isEmpty && !p.email.isEmpty
}

trait AgeValidator extends Validator {
  abstract override def validate(p: Person) = super.validate(p) && (p.age >= 18)
}

trait CountryValidator extends Validator {
  abstract override def validate(p: Person) = super.validate(p) && (p.country == "SE")
}
