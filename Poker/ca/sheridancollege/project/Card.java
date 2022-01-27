package Poker.ca.sheridancollege.project;

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
        return color + ",  " + cardNumber + " of " + suite;
    }

}
