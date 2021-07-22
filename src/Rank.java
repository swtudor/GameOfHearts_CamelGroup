public enum Rank {
    ACE(1), DEUCE(2), THREE(3),
    FOUR(4), FIVE(5), SIX(6),
    SEVEN(7), EIGHT(8), NINE(9),
    TEN(10), JACK(10), QUEEN(10),
    KING(10);

    // Private Fields
    private final int rankValaue;

    // Constructor
    private Rank(int rankValaue){
        this.rankValaue = rankValaue;
    }
    // Public Methods
    public  int getRank() {
        return rankValaue;
    }
}
