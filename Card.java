public class Card {
// this is the code for the 4 suits + Joker suit.
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    public final static int JOKER = 4;

    //the rest of the Non Numeric cards.
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;


private final int suit;
private final int value;

//Creates Joker card with a value of 1.
public Card() {
    suit = JOKER;
    value = 1;
}
    
//creates a card with a specific value and suit.

public Card(int theValue, int theSuit) {
    if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS 
    && theSuit != CLUBS && theSuit != JOKER)
    throw new IllegalArgumentException("Illegal playing card suit");
    if(theSuit != JOKER && (theValue < 1 || theValue > 13))
    throw new IllegalArgumentException("Illegal playing card value");
    value = theValue;
    suit = theSuit;
}

    public int getValue() {
        return value;
    }


    public int getSuit() {
        return suit;
    }


    public String getSuitAsString() {
        switch (suit) {
            case SPADES: return "Spades";
            case HEARTS: return "Hearts";
            case DIAMONDS: return "Diamonds";
            case CLUBS: return "Clubs";
            default:    return "Joker";

        }
    }

    public String getValueAsString() {
        if (suit == JOKER)
        return "" + value;
        else {
            switch (value) {
                case 1 : return "Ace";
                case 2 : return "2";
                case 3 : return "3";
                case 4 : return "4";
                case 5 : return "5";
                case 6 : return "6";
                case 7 : return "7";
                case 8 : return "8";
                case 9 : return "9";
                case 10 : return "10";
                case 11 : return "Jack";
                default    : return "King";

            }
        }
    }
public String toString() {
    if (suit == JOKER) {
        if (value ==1)
        return "joker";
        else
        return "joker #" + value;
    }
    else return getValueAsString() + " of " + getSuitAsString();
}



}

