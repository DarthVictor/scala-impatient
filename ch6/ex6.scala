object CardSuit extends Enumeration {
    type CardSuit = Value
    val Spades = Value("♠")
    val Hearts = Value("♥")
    val Diamonds = Value("♦")
    val Clubs = Value("♣")
}
CardSuit.values foreach println