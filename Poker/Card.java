/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Javadoc-Juveniles 
 */
public class Card{
    
    
    private int cardNumber;
    private suite suite;
    private color color;

    public int getCardNumber() {
        return this.cardNumber;
    }

    public suite getSuite() {
        return this.suite;
    }


    public color getColor() {
        return this.color;
    }


    public Card(int cardNumber, suite suite, color color){
        this.cardNumber = cardNumber;
        this.suite = suite;
        this.color = color;
    }
    @Override
    public String toString(){
        return color + ",  " + (cardNumber > 10?higherCards(cardNumber):cardNumber) + " of " + suite;
    }
    private String higherCards(int cardNumber){
        String card = "Jack";
        switch (cardNumber) {
            case 12:
                card = "Queen";
                break;
            case 13:
                card = "King";
        }
        return card;
    }

}
