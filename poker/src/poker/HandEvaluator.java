package poker;
/**
 * Evaluates the "hand" ArrayList<Card> to see what the outcome of it was 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;

public class HandEvaluator {
		
	public static ArrayList<Card> hand = new ArrayList<Card>(4);
	public void pair() { //this is for comparing two elements
		int match = 0;
		for(int i = 0; i<hand.size()-1;i++) {
			if(hand.get(i).getNumber()==hand.get(i+1).getNumber()){
				match++;
				System.out.println(match);
				if(match<2) {
					if(match==1) {
						System.out.println("You have One Pair");
					}
				}
			}
		}
	}
	
	public void tok() {
		int match = 0;
		for(int i = 0; i<hand.size()-1;i++) {
			for(int j=1; j<i;j++) {
				if(hand.get(i).getNumber()==hand.get(j).getNumber()) {
					match++;
					if(match<=4) {
						if(match==3) {
							System.out.println("You have Three of a Kind");
						}
					}
				}
			}
		}
	}
	
	
	public void twopair() { //checks to see if there are two different pairs
		int match = 0;
		for(int i = 0; i<hand.size()-1;i++) {
			if(hand.get(i).getNumber()==hand.get(i+1).getNumber()){
				int a = i;
				match++;
				if(match==2) {
						System.out.println("You have Two Pair");
					}else {
						System.out.println("You do not have Two Pair");
					}
				}
			}
		}
	
	public void straight() {//sorts array and checks to see if each card is 1 less than the next card
		for(int i = 0; i<hand.size()-1;i++) {
			if(hand.get(i).getNumber()==hand.get(i+1).getNumber()) {
				}
			}
	}
	/*public void fullhouse() {
		int match = 0;
		for(int i = 0; i<hand.size()-1;i++) {
			if(hand.get(i).getNumber()==hand.get(i+1).getNumber()) {
				match++;
				if(match<4) {
					if(match==3) {
						
					}
					
				}
			}
		}
		
	}*/
	
	public void flush() {
		int match = 0;
		for(int i = 0; i<hand.size()-1;i++) {
			if(hand.get(i).getSuite()==hand.get(i+1).getSuite()) {
				match++;
				if(match==5) {
					System.out.println("You have a Fush");
				}
				}
			}
		}

	public void fok() {
		int match = 0;
		for(int i = 0; i<hand.size()-1;i++) {
			if(hand.get(i).getNumber()==hand.get(i+1).getNumber()) {
				match++;
				if(match==4) {
					System.out.println("You have Four of a Kind");
				}
				}
			}
		}

}

