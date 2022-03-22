package poker;
/**
 * Creates an ArrayList<Card> "deck" with cards numbered 1-13, Ace = 1, J = 11, Q = 12, K = 13.
 * it then shuffles this deck 
 * the drawCard() method draws a random card from the shuffled deck and puts it into the ArrayList<Card> "Hand"
 * which is used in the HandEvaluator class
 * 
 * @author Stephen Murphy Jr
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<Card> deck;
	
	HandEvaluator K = new HandEvaluator();
	
	public Deck() {
		deck = new ArrayList<Card>();
		for(int i = 1; i < 14; i++) {
			deck.add(new Card("Diamonds", i));
			deck.add(new Card("Clubs", i));
			deck.add(new Card("Hearts", i));
			deck.add(new Card("Spades", i));
		}
		 Collections.shuffle(deck);
	}
	
	public ArrayList<Card> getDeck(){
		return deck;
	}
		
	public Card drawCard() {
		K.hand.add(deck.get(0));
		return deck.remove(0);
	}
}
