
trait List[-ItemType] {
  def ++[OtherItemType <: ItemType](other: List[OtherItemType]): List[OtherItemType]
}

class EmptyList[ItemType] extends List[ItemType] {
  override def ++[OtherItemType <: ItemType](other: List[OtherItemType]) = other
}

val list1 = new EmptyList[String]
val list2 = new EmptyList[Char]

val result: List[Char with String] = list1.++(list2)