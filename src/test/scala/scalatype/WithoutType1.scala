package scalatype

import scala.collection.mutable.ArrayBuffer

class List {
  var mem = new ArrayBuffer[Any]() // TODO: Need to test with Array class
  def add(any: Any) = {
    mem = mem :+ any
  }
  def remove(index: Int) = {
    mem.drop(index)
  }
  def get(index: Int): Any = {
    mem.apply(index)
  }
}

object WithoutType extends App {

  val list = new List
  list.add(1)
  list.add("string")
  list.add(1.0)

  val value = list.get(0).asInstanceOf[Int]
  println(s"Value 1: $value")
//  val value2 = list.get(1).asInstanceOf[Int]
//  println(s"Value 2: $value2")
}

