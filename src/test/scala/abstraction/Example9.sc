// Scala Enumeration

object color extends Enumeration {
  val Red = Value
  val Green = Value
  val Blue = Value
}

object Direction extends Enumeration {
  val North, East, West, South = Value
}

// Overloaded Enumeration

object Direction2 extends Enumeration {
  val North = Value("north")
  val East = Value("east")
  val West = Value("west")
  val South = Value("south")
}

for (d <- Direction2.values) {
  println(d + " ")
}