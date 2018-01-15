// lazy val

object EagerVal {
  val x = {
    println("Eager Initialize x")
    "KIP"
  }
}

object LazyVal {
  lazy val x = {
    println("Lazy Initialize x")
    "KIP"
  }
}

LazyVal.x

// lazy val using cyclic dependencies

trait FooEager { val foo: FooEager }
case class FeeEager() extends FooEager { val foo = FaaEager() }
case class FaaEager() extends FooEager { val foo = FeeEager() }

//println(FeeEager().foo)

trait FooLazy { val foo: FooLazy }
case class FeeLazy() extends FooLazy { lazy val foo = FaaLazy() }
case class FaaLazy() extends FooLazy { lazy val foo = FeeLazy() }

println(FaaLazy().foo)

