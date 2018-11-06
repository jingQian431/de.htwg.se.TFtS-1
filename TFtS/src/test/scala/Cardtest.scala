import org.scalatest.{Matchers, WordSpec}

class Cardtest extends WordSpec with Matchers {
  "A Card" when {
    "is a numbercard" should {
      val Numbercard = Card(Colors.Red,Contents.one)
    }
  }
}