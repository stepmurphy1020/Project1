package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<Card> deck;
	public ArrayList<Card> shuffled;
	
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
