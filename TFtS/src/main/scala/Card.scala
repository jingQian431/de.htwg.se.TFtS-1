object Colors extends Enumeration {
  val Red, Green, Blue, Yellow, Black = Value
}
object Contents extends Enumeration {
  val zero,one,two,three,four,five,six,seven,eight,nine,TC,J,PL2,PL4,CC = Value
}
case class Card(color: Colors.Value,
                content: Contents.Value){
  override def toString: String = {
    val cardcolor = color match {
      case Colors.Red => "Red"
      case Colors.Green => "Green"
      case Colors.Blue => "Blue"
      case Colors.Yellow => "Yellow"
      case Colors.Black => "Black"
    }
    val cardcontent = content match {
      case Contents.zero => "0"
      case Contents.one => "1"
      case Contents.two => "2"
      case Contents.three => "3"
      case Contents.four => "4"
      case Contents.five => "5"
      case Contents.six => "6"
      case Contents.seven => "7"
      case Contents.eight => "8"
      case Contents.nine => "9"
      case Contents.PL2 => "Plus2"
      case Contents.PL4 => "Plus4"
      case Contents.CC => "ColorChange"
      case Contents.TC => "TurnChange"
      case Contents.J => "Jump"
    }
    cardcolor + "." + cardcontent
  }
}