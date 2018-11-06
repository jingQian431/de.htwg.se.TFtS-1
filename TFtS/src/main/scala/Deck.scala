case class Deck(){
  var deck: List[Card] = List()
  def deckcreator: List[Card] = {
    for (i <- 0 to 3){
      var color = Colors.apply(i)
      for (j <- 0 to 12) {
        var content = Contents.apply(j)
        if (j == 0){
          deck = new Card(color, content) :: deck
        } else {
          deck = new Card(color, content) :: deck
          deck = new Card(color, content) :: deck
        }
      }
    }
    deck = new Card(Colors.Black, Contents.PL4) :: deck
    deck = new Card(Colors.Black, Contents.PL4) :: deck
    deck = new Card(Colors.Black, Contents.PL4) :: deck
    deck = new Card(Colors.Black, Contents.PL4) :: deck
    deck = new Card(Colors.Black, Contents.CC) :: deck
    deck = new Card(Colors.Black, Contents.CC) :: deck
    deck = new Card(Colors.Black, Contents.CC) :: deck
    deck = new Card(Colors.Black, Contents.CC) :: deck
    deck
  }

  def remove(card: Card): Card ={
    deck = deck diff List(card)
    card
  }
}
