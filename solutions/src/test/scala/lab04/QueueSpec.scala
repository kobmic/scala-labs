package lab04

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import scala.collection.mutable.ArrayBuffer

@RunWith(classOf[JUnitRunner])
class QueueSpec extends Spec with ShouldMatchers {
  
  describe("An IntQueue with incrementing and doubling") {
    val queue = new BasicIntQueue with Incrementing with Doubling
    it("should double first, then increment") {
      List(1, 2, 3).foreach(queue.put(_))
      queue.underlyingBuffer should equal(ArrayBuffer(3,5,7))
    }
  }
  
  describe("An IntQueue with doubling and incrementing") {
    val queue = new BasicIntQueue with Doubling with Incrementing
    it("should increment first, then double") {
      List(1, 2, 3).foreach(queue.put(_))
      queue.underlyingBuffer should equal(ArrayBuffer(4,6,8))
    }
  }
 
}  