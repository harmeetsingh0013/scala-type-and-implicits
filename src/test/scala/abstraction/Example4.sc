// initialize val members

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
}

new RationalTrait {
  val numerArg = 1
  val denomArg = 2
}

val exper1 = 1
val exper2 = 2

new RationalTrait {
  override val denomArg: Int = exper1
  override val numerArg: Int = exper2
}
