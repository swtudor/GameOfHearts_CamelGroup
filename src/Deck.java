import java.util.ArrayList;

public class Deck {
    private static final int deckSize = 52;
    boolean initCounter;

    public static void main(String args[]){
        // Creates a deck 1-52 in that order.
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for(int x = 1; x <= deckSize; x++){
            deck.add(x);
        }

        // Shuffles the array above and creates a new array of random order cards
        ArrayList<Integer> shuffleDeck = new ArrayList<Integer>();

        while(deck.size() > 0){
            int index = (int) (Math.random() * deck.size());
            shuffleDeck.add(deck.remove(index));
            System.out.println(shuffleDeck.toString());
        }
    }
    void initDeck(){
        if (initCounter) {
            System.out.println("The deck has been initialized.");
        }
    }
}
