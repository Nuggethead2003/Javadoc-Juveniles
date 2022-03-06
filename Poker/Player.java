/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Javadoc-Juveniles 
 * 
 */
public abstract class Player {

    private String name; 

   
    public Player(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public abstract void play();

}
