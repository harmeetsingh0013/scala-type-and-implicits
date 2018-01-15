// val member abstraction and criteria

abstract class Fruit {
  val v: String
  def m: String
}

abstract class Apple extends Fruit {
  val v: String
  val m: String
}

abstract class BadApple extends Fruit {
  def v: String
  def m: String
}

class ConcreteApple extends Fruit {
  val v: String = "Concrete Apple"
  def m: String = " Yes This is Concrete Apple"
}