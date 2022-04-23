package Poker.ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends GroupOfCards{
    private ArrayList<Card> deck;

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    
    public Deck() {
        super(52);
        deck = new ArrayList<Card>();
        makeDeck();
        //shuffle();
        
    }



    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    private void makeDeck(){
        for(int i = 1;i<size+1;i++){
            deck.add(new Card(i<14?i:(i<27)?(i-13):(i<40)?(i-26):(i<53)?(i-39):i-13,i<27?(i<14?Enums.SUIT.CLUBS:Enums.SUIT.SPADES):(i<40?Enums.SUIT.HEARTS:Enums.SUIT.DIAMONDS),i<27?Enums.COLOR.BLACK:Enums.COLOR.RED));
        }

    }
    public void printDeckOfCards(){
        for(int i = 0;i<deck.size();i++){
            System.out.println(deck.get(i));
        }
    }
}
