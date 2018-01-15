implicit class StringExtension(val string: String) {
  def isAllUperCase: Boolean = {
    (0 to string.size - 1 ) find {
      case index => !string.charAt(index).isUpper
    }
  }.isEmpty
}

var string = "test"
println(s"${string} is all upper ${string.isAllUperCase}")
string = "Test"
println(s"${string} is all upper ${string.isAllUperCase}")
string = "TESt"
println(s"${string} is all upper ${string.isAllUperCase}")
string = "TEST"
println(s"${string} is all upper ${string.isAllUperCase}")