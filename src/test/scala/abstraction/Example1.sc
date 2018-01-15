// Abstract members

trait Abstract {
  type T
  def transform(x: T)
  val initial: T
  var current: T
}