package ca.sheridancollege.project;
class Poker extends Game{
    public Poker(String name) {
        super(name);
        //TODO Auto-generated constructor stub
        System.out.println();
    }

    private static int globalId = 0;
    public final int GAME_ID = globalId++;
    private int initialChips;
    
    public void play(int a){

    }
    /* public Poker(int initialChips){
        this.initialChips = initialChips;
    } */

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void declareWinner() { //last thing that gets run
        // TODO Auto-generated method stub
        
    }
}