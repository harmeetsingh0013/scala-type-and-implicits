// simple implicit

implicit def intToString(int: Int) = int.toString

val str: String = 23


// implicit scope
case class Dollar(amt: Double)
case class Rupee(amt: Double)
case class Pound(amt: Double)

object Dollar {
  implicit def rupeeToDollar(rupee: Rupee): Dollar = {
    println("Companion Scope")
    Dollar(rupee.amt / 65)
  }
  implicit def poundToDollar(pound: Pound): Dollar = {
    println("Companion Scope")
    Dollar(pound.amt * 1.50 )
  }
}

object Rupee {
  implicit def dollarToRupee(dollar: Dollar): Rupee = Rupee(dollar.amt * 65)
  implicit def poundToRupee(pound: Pound): Rupee = Rupee(pound.amt * 88)
}

val rupee: Rupee = Rupee(70)
println(s"Rupee: $rupee")
val dollar: Dollar = rupee
println(s"Dollar: $dollar")

// implicit scope
/*

implicit def rupeeToDollar(rupee: Rupee): Dollar = {
  println("Outer Scope")
  Dollar(rupee.amt / 65)
}
implicit def poundToDollar(pound: Pound): Dollar = {
  println("Outer Scope")
  Dollar(pound.amt * 1.50 )
}

val rupee1: Rupee = Rupee(70)
println(s"Rupee: $rupee1")
val dollar1: Dollar = rupee1
println(s"Dollar: $dollar1")
*/
