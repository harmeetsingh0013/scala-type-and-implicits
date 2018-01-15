// problem initializing val members

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int

  require(denomArg != 0)
}

new RationalTrait {
  val numerArg = 1
  val denomArg = 2
}