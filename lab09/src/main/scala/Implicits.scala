package lab09

object Implicits {
  
  class RichInt(val i: Int) {
    def double() = i * 2
  }
  
  // FIXME
  // add implicit conversion from Int to RichInt
  // Remember: use implicit keyword to mark an implicit conversion  
  
  // FIXME def...
  
  // FIXME
  // Add implicit conversion for source type String by
  // adding elvis operator '?:' for strings
 
  // FIXME: def .... 
 
 
  // --- 
  // TIP
  // When dealing with Java libraries , you often have to convert
  // between Scala and Java collection classes
  // Use scala.collection.JavaConversions to do that
  // Remember that the implicit conversion has to be in scope 
  
  // FIXME: Use scala.collection.JavaConversions to convert
  // between Java and Scala collections
  import scala.collection.mutable.Buffer
  class ScalaAdapter {
    
    val javaApi = new ThirdPartyJavaApi()
    
    def doSomething(words: List[String]) = {
      javaApi.doSomething(words)
    }
    
    def getWordList() : Buffer[String] = {
      javaApi.getWordList()
    }
    
    def makeString() = {
      val seq: Seq[String] = javaApi.getWordList()
      // FIXME
    }
  }
  
}


