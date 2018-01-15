// pre-initialize

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int

  require(denomArg != 0)
}

new {
  val numerArg = 1
  val denomArg = 2
} with RationalTrait

object PreInitObject extends {
  val numerArg = 1
  val denomArg = 2
} with RationalTrait

class PreInitClass(n: Int, d: Int) extends {
  val numerArg = n
  val denomArg = d
} with RationalTrait

// issue
/*
new {
  val numerArg = 1
  val denomArg = this.denomArg
} with RationalTrait*/
