/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = new String[3];
        ranks[0] = "one";
        ranks[1] = "three";
        ranks[2] = "five";
        
        String[] suits = new String[3];
        suits[0] = "yes";
        suits[1] = "maybe";
        suits[2] = "no";
        
        int[] pointValues = new int[3];
        pointValues[0] = 1;
        pointValues[1] = 2;
        pointValues[2] = 3;
        
        Deck deck = new Deck(ranks, suits, pointValues);
        
        System.out.println(deck.isEmpty());
        System.out.println(deck.size());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.size());
        System.out.println(deck.isEmpty());
    }
}
