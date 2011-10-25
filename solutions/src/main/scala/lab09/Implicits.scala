package lab09

object Implicits {
  implicit def int2RichInt(i: Int) = new RichInt(i)

  implicit def elvisOperator(alt: String) = new {
    def ?:(pred: String) = if (pred == null) alt else pred
  }

  class RichInt(val i: Int) {
    def double() = i * 2
  }
  
  import scala.collection.JavaConversions._
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
      seq mkString " "
    }
  }
  
}


