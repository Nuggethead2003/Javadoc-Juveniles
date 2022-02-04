package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {

    
    private ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        makeDeck(cards = new ArrayList<Card>());
        System.out.println(cards.get(32));
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
        for(int i = 1;i<=this.size;i++){
            cards.add(new Card(i,i<27?(i<14?suite.CLUBS:suite.SPADES):(i<40?suite.HEARTS:suite.DIAMONDS),i<27?color.BLACK:color.RED));
        }
    }
}
