package example

object Hello extends Greeting with App {
  println(greeting)

  def add() = 2 + 2

  def sub() = 17 - 2
}

trait Greeting {
  lazy val greeting: String = "hello"
}
