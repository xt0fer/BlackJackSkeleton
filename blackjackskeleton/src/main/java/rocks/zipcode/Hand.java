package rocks.zipcode.blackjackskeleton;

/**
 * A hand of cards to play with
 */
public class Hand {

    public Hand(){
    }

    /**
     * Take a single card from the top of this deck and add it to the hand, removing it from the previous deck
     * @param deck The deck of cards we're taking from
     */
    public void takeCardFromDeck(Deck deck){
    }

    /**
     * Add a single card to this hand
     * @param c The card being added
     */
    /**
     *
     * @param discardDeck The deck we're discarding this hand to
     */
    public void discardHandToDeck(Deck discardDeck){
    }

    /**
     *
     * @return The hand with all its cards in a single line String
     */
    public String toString(){
        return null;
    }


    /**
     *
     * @return The calculated numerical value of the hand as an integer
     */
    public int calculatedValue(){
        return 0;
    }


    /**
     *
     * @param idx the index of the card we're getting
     * @return the card we got
     */
    public Card getCard(int idx){
        return null;
    }

    // last Card added to Hand
    public Card lastCard(){
        return null;
    }



}
