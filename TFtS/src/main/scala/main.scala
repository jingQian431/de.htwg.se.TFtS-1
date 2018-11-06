object TFtS {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    //Karte, Deck, AI, Ablage, Spieler
    //4 +4, 4 Farbwechsel, jeweils 2 +2, jeweils 2 Richtungswechsel, jede Farbe 1 bis 9 zweimal ausser null
    println(new Card(Colors.apply(0),Contents.CC))
    var deck = new Deck();
    println(deck.deckcreator)
    println(deck.deck.length)
    val card = deck.deck.apply(7)
    deck.remove(card)
    println(deck.deck)
  }
}