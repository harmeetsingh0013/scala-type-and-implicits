package scalatype

trait TypeAnotomy[T] {
  def method[U](u: U): T
}
