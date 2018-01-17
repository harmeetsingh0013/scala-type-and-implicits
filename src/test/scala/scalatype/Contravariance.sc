def foo(x: Any): String = {
  s"Hello, I received a $x"
}

def bar(x: String): Any = {
  foo(x)
}

bar("Test")

foo("KIP")

foo(1)

//bar(1)

trait Function1[Arg, Return]