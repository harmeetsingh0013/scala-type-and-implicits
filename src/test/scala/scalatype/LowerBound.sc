
/* ********** Problem 1 ***********************
// problem of contravariant
trait List[+ItemType] {
  def ++(other: List[ItemType]): List[ItemType]
}

*/

/* ********** Problem 2 ***********************

// how can we resolve that problem?
trait List[+ItemType] {
  def ++[OtherItemType](other: List[OtherItemType]): List[ItemType]
}

// The problem with above example
class EmptyList[ItemType] extends List[ItemType] {
  override def ++[OtherItemType](other: List[OtherItemType]) = other
}
*/

/* *********** Solution ************** */

trait List[+ItemType] {
  def ++[OtherItemType >: ItemType](other: List[OtherItemType]): List[OtherItemType]
}

class EmptyList[ItemType] extends List[ItemType] {
  override def ++[OtherItemType >: ItemType](other: List[OtherItemType]) = other
}

val list1 = new EmptyList[AnyRef]
val list2 = new EmptyList[String]

val result: List[AnyRef] = list1.++(list2)