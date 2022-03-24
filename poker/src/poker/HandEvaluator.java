package poker;
/**
 * Evaluates the "hand" ArrayList<Card> to see what the outcome of it was 
 * 
 * 
 */
import java.util.ArrayList;

public class HandEvaluator {
	
	public static ArrayList<Card> hand = new ArrayList<Card>(4);
	
	//Card a = hand.get(0);
	
	public void pair() { //this is for comparing two elements
		int count = 0;
		int comp = 0;
		int b = 0;
		for(int i = 0; i<hand.size(); i++) {
			comp++;
			for(int j = i+1; j<hand.size(); j++) {
				count++;
				if(hand.get(i)==hand.get(j)){
					 b = 1;
				}
			}
		}
		if(b==1) {System.out.println("True");}
		System.out.println(count+" "+ comp);
		System.out.println("You have One Pair");
	}
	public void tok() {
		System.out.println("You have Three of a Kind");
	}
	public void twopair() {
		System.out.println("You have Two Pair");
	}
	public void straight() {
		System.out.println("You have a Straight");
	}
	public void fullhouse() {
		System.out.println("You have a Full House");
	}
	public void flush() {
		System.out.println("You have a Flush");
	}
	public void fok() {
		System.out.println("You Four of a Kind");
	}
}
