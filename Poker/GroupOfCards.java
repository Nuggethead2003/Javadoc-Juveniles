/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Javadoc-Juveniles 
 */
import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {

    
    private ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        makeDeck(cards = new ArrayList<Card>());
        shuffle();
    }

    
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    
    public int getSize() {
        return size;
    }

   
    public void setSize(int size) {
        this.size = size;
    }


    private void makeDeck(ArrayList<Card> cards){
        int cardNumber = 1;
        for(int i = 1;i<=this.size;i++){
            if(cardNumber==14)
            cardNumber = 1;
            cards.add(new Card(cardNumber++,i<27?(i<14?suite.CLUBS:suite.SPADES):(i<40?suite.HEARTS:suite.DIAMONDS),i<27?color.BLACK:color.RED));
        }
    }

}
