package example

object Hello extends Greeting with App {
  println(greeting)

  def add() = 2 + 2

  def blackMagic(value: Int): String = {
    if (value > 5) {
      "Wauw"
    } else {
      "Meh"
    }
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
