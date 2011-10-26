package lab07

class Matcher {
  def activity(day: String) = {
    // FIXME
    // use pattern matching 
  }
    
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "true"
    case "ping" => "pong"
    case x: String => "a string"
    case (a: Int, b: Int) => "a tuple of ints"
    case (host: String, port: Int) => "host=" + host + " port=<" + port
    case List(_, 1, _) => "a list with 3 elems, with a 1 as second element"
    case 1 :: tail => "a list starting with a 1"
    case head :: List(_,_,3) => "a list with 4 elements, first elemnt=" + head
    case Nil => "empty list"  
    case _ => "something else"
  }
}