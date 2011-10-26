package lab04

case class Person(val name: String, val age: Int, val country: String, email: String)
 
abstract class Validator {
 def validate(p: Person) : Boolean
}

class BasicValidator extends Validator {
 override def validate(p: Person) : Boolean = !p.name.isEmpty && !p.country.isEmpty && !p.email.isEmpty
}

//FIXME:
// define stackable traits AgeValidator and CountryValidator as subclasses of Validator
// you have to mark your put method with 'abstract override' to 
// make the stackable modifications work
// AgeValidator: age >= 18 
// CountryValidator: country == "SE"

