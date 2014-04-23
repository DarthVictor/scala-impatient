object CardSuit extends Enumeration {
    type CardSuit = Value
    val Spades = Value("♠")
    val Hearts = Value("♥")
    val Diamonds = Value("♦")
    val Clubs = Value("♣")
}
import CardSuit._

def isRed(suit: CardSuit) = (suit == Hearts || suit == Diamonds)
for(suit <- CardSuit.values) println(isRed(suit))