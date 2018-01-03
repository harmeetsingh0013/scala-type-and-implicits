package scalatype

trait Function[-Arg, +Return] {
  def apply(arg: Arg): Return
}

object Contravariance extends App {

  val foo = new Function[Any, String] {
    override def apply(arg: Any): String = {
      s"Hello, I received a $arg"
    }
  }

  val bar: Function[String, Any] = foo

  println(bar("Test"))
}
