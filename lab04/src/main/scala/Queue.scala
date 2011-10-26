package lab04

import scala.collection.mutable.ArrayBuffer
  abstract class IntQueue {
    def get(): Int
    def put(x: Int)
  }

  class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def get() = buf.remove(0)
    def put(x: Int) { buf += x }
    def underlyingBuffer = buf
  }

  //FIXME:
  // define stackable traits Doubling and Incrementing as subclasses of IntQueue
  // you have to mark your put method with 'abstract override' to 
  // make the stackable modifications work
 
  