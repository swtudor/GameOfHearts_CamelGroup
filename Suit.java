
public enum Suit {
    CLUBS("Clubs"), 
    DIAMONDS("Diamond"), 
    SPADES("Spades"), 
    HEARTS("Hearts"); 

    private final String suitText;
//constructors in a enum have to be private.

private suit(String suitText ) {
    this.suitText = suitText;

}

public String printSuit() {
    return suitText;
}

}
