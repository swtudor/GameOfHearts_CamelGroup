package Gameplay;

import Players.Player;
import playingCards.Card;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Game {

    //the players playing the game
    public List<Player> players = new ArrayList<Player>();
    //Num Of Players
    private int numberOfPlayers;
    //print stream of the game displayed to all players.
    private PrintStream printStream = System.out;
    //The card that must lead first each round
    private Card startingCard;
    //a list of cumulative scores after each round
    private List<GameScoreList> scoreHistory = new ArrayList<GameScoreList>(10);

    public Game(List<Player> players) {
    }
}
