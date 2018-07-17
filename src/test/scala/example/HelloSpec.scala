package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }

  it should "be able to add" in {
    Hello.add() shouldEqual 4
  }

  it should "be able to sub" in {
    Hello.sub() shouldEqual 15
  }
}
