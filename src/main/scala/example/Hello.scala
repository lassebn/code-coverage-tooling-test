package example

object Hello extends Greeting with App {
  println(greeting)

  def add() = 2 + 2

  def multiply() = 5 * 5
}

trait Greeting {
  lazy val greeting: String = "hello"
}
