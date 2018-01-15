// var member abstraction

trait AbstractTime {
  var hour: Int
  var minute: Int
}

class ConcreteAbstractTime extends AbstractTime {
  override var hour: Int = 1
  override var minute: Int = 3
}

trait AbstractTimeV2 {
  def hour: Int
  def hour_(x: Int): Int
  def minute: Int
  def minute_(x: Int): Int
}