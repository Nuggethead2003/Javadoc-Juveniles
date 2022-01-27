package Poker.ca.sheridancollege.project;
class Poker{
    private static int globalId = 0;
    public final int GAME_ID = globalId++;
    private int initialChips;
    
    public void play(int a){

    }
    public Poker(int initialChips){
        this.initialChips = initialChips;
    }
}