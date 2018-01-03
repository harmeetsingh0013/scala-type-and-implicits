package scalatype

import scala.collection.mutable.ArrayBuffer

class ListInt {
  var mem = new ArrayBuffer[Int]()
  def add(int: Int) = {
    mem = mem :+ int
  }
  def remove(index: Int) = {
    mem.drop(index)
  }
  def get(index: Int): Int = {
    mem.apply(index)
  }
}

class ListString {
  var mem = new ArrayBuffer[String]()
  def add(string: String) = {
    mem = mem :+ string
  }
  def remove(index: Int) = {
    mem.drop(index)
  }
  def get(index: Int): String = {
    mem.apply(index)
  }
}

object WithoutType2 extends App {

  val intList = new ListInt
  intList.add(1)
  intList.add(2)
  intList.add(3)

  val intVal1: Int = intList.get(0)
  val intVal2: Int = intList.get(1)
  val intVal3: Int = intList.get(2)

  println(s"$intVal1 -- $intVal2 -- $intVal3")
}
