package scalatype

class B
class A extends B

class T[E]

object Invariance extends App {

  val a: T[A] = new T[A]
//  val b: T[A] = new T[B]

  val str = Array[String] { "KIP" }
//  val obj: Array[Any] = str
}
