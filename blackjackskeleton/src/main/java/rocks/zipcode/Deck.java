package rocks.zipcode.blackjackskeleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A deck of cards
 */
public class Deck {

    //An arraylist to hold the deck of Cards
    private ArrayList<Card> deck;


    /**
     * Create an empty deck of cards
     */
    public Deck(){
    }

    /**
     * Copy Constructor
     * @param c deck being copied
     */
    public Deck(Deck c){
    }

    /**
     * Create a standard deck of cards
     * @param makeDeck makes a standard deck of cards if true
     */
    public Deck(boolean makeDeck){}

    /**
     *
     * @param card The card being added to this deck
     */
    public void addCard(Card card){
    }

    /**
     *
     * @param cards an arraylist of cards to be added to this deck
     */
    public void addCards(ArrayList<Card> cards){
    }

    /**
     *
     * @return Every value of the deck as a String with line separators
     */
    public String toString(){
        return null;
    }

    /**
     * Shuffle the deck of Cards at random
     */
    public void shuffle(){
    }

    /**
     *
     * @return The card taken from the deck
     */
    public Card takeCard(){

            //Take a copy of the first card from the deck
            //Remove the card from the deck
            //Give the card back
            return null;

    }

    /**
     *
     * @return true if the deck still has cards left
     */
    public boolean hasCards(){
     return false;
    }

    /**
     *
     * @return The number of cards left in the deck
     */
    public int cardsLeft(){
        return 0;
    }

    /**
     *
     * @return the arraylist containing all the cards in this deck
     */
    public ArrayList<Card> getCards() {
        return null;
    }

    /**
     * Empties out this Deck
     */
    public void emptyDeck(){
    }


    /**
     * Take all the cards from a discarded deck and place them in this deck, shuffled.
     * Clear the old deck
     * @param discard - the deck we're getting the cards from
     */
    public void reloadDeckFromDiscard(Deck discard){}


}
