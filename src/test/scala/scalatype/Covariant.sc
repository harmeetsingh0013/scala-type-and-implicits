class T[+A] ()

val x = new T[AnyRef]

val y = new T[Any]

//val z: T[String] = x

val yy: T[Any] = x
yy.hashCode()

/*trait TT[+A] {
  def thisWillNowWork(a: A) = a
}*/

