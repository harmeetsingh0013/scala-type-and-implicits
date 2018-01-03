
// Let's declare return type as a covariant and arg type
// contravariance

trait Function[-Arg, +Return]

val x = new Function[Any, String] {}

val y: Function[String, Any] = x

val yy: Function[Any, Any] = x