package poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	public ArrayList<Card> deck;
	public static ArrayList<Card> hand = new ArrayList<Card>(4);
	
	public Deck() {
		deck = new ArrayList<Card>();
		for(int i = 1; i < 14; i++) {
			deck.add(new Card("Diamonds", i));
			deck.add(new Card("Clubs", i));
			deck.add(new Card("Hearts", i));
			deck.add(new Card("Spades", i));
		}
	}
	Random pick = new Random();
	
	public ArrayList<Card> getDeck(){
		return deck;
	}
	public Card drawCard() {
		int d = pick.nextInt(deck.size());
		System.out.println(deck.get(d));
		hand.add(deck.get(d));
		return deck.remove(d);
	}
	public static ArrayList<Card> getHand() {
		return hand;
	}
}
