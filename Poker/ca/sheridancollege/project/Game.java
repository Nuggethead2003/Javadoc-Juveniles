package Poker.ca.sheridancollege.project;

import java.util.ArrayList;


public abstract class Game {

    private final String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        players = new ArrayList<Player>();
    }

    
    public String getName() {
        return name;
    }

    
    public ArrayList<Player> getPlayers() {
        return players;
    }

    
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    
    public abstract void play(); // figure out how poker works first lmao


    public abstract void declareWinner(); //last thing that gets called before program exists

}
