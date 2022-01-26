package Poker;
class Poker{
    private static int globalId = 0;
    public final int GAME_ID = globalId++;
    private int initialChips;
    
    public Poker(int initialChips){
        this.initialChips = initialChips;
    }
}