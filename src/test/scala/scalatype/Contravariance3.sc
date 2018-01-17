
// Let's declare return type as a covariant and arg type
// contravariance

trait Function[-Arg, +Return]{
  def method(arg: Arg): Return
}

val x: Function[AnyRef, String] = new Function[AnyRef, String] {
  def method(arg: AnyRef): String = {
    arg.toString
  }
}

val y: Function[String, Any] = x

//val yy: Function[Any, Any] = x