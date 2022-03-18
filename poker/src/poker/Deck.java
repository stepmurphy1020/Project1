package poker;

import java.util.ArrayList;

public class Deck {
	public ArrayList<card> deck;
	
	public Deck() {
		deck = new ArrayList<card>();
		for(int i = 1; i < 13; i++) {
			deck.add(new card("Diamonds", i));
			deck.add(new card("Clubs", i));
			deck.add(new card("Hearts", i));
			deck.add(new card("Spades", i));
		}
	}
	public ArrayList<card> getDeck(){
		return deck;
	}
	public card drawcard() {
		return deck.remove(0);
	}
}
