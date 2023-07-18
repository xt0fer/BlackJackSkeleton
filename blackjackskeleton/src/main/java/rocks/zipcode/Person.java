package rocks.zipcode.blackjackskeleton;

/**
 * Used for shared logic between the dealer and player
 */
public abstract class Person {

    private Hand hand;
    private String name;

    /**
     * Create a new Person
     */
    public Person(){
    }


    //Setters and Getters
    public Hand getHand(){
        return null;
    }
    
    public void setHand(Hand hand){
    }

    public String getName(){
        return null;
    }

    public void setName(String name){
    }

    /**
     * Prints a formatted version of the Person's hand
     */
    public void printHand(){
    }

    /**
     * Player takes a card from the deck
     * @param deck
     */
    public void hit(Deck deck, Deck discard){
    }

    public boolean hasBlackjack(){
        return false;
    }



}
