package Players;

import playingCards.Card;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;


public abstract class Player {

    //player name.
    private String name;
    //the cards in the players hand.
    private ArrayList<Card> hand = new ArrayList<>();
    //where to get input
    protected InputStream inputStream = System.in;
    //Where to get output
    protected PrintStream printStream = System.out;

    //constructor : sets the players name.
    public Player(String name) {
        this.name = name;
    }

    //get Player Name
    public String getName() {
        return name;
    }


     public void receiveCard(Card card, int position) {
        //cards[position] = card;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    public void removeCard(int index) {
        hand.remove(index);
    }
    public Card selectCard(int index) {
        Card Heart = hand.get(index);
        removeCard(index);
        return Heart;

    }
}
