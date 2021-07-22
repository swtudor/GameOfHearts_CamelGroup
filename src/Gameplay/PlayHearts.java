package Gameplay;

import Gameplay.Game;
import Players.ComputerPlayer;
import Players.HumanPlayer;
import Players.Player;

import java.util.ArrayList;
import java.util.*;

public class PlayHearts {


    public static void main(String args[]){


        //List of player names
        List<String> names = new LinkedList<String>();
        names.add(P1);
        names.add(P2);
        names.add(You);
        names.add(P3);

        //list of whether each player is human(Later Use)
        List<Boolean> isHuman = new LinkedList<Boolean>();
        isHuman.add(true);
        isHuman.add(true);
        isHuman.add(true);
        isHuman.add(true);
        }

        //create the list of players for the game
    List<Player> players = new ArrayList<Player>(4);
    for (int index = 0; index < names.size(); index++) {
        if(isHuman.get(index)) {
            players.add(new HumanPlayer(names.get(index)));
        } else {
            players.add(new ComputerPlayer(names.get(index)));
        }
    }

    //create game
    Game game = new Game(players);

    //play game
    game.play();

    }
 }
