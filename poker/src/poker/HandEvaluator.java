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
		int match1 = 0;
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++) {
				if(hand.get(i).getNumber()==hand.get(j).getNumber()){
					match1++;
					System.out.println(hand.get(i).getNumber()+ ", "+hand.get(j).getNumber());
					if(match1==2) {
						if(match1<=1) {
							System.out.println("You have One Pair");
					}else {
						
					}
				}
			}
		}
	}
}
	
	public void tok() {
		int match = 0;
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++) {
				if(hand.get(i).getNumber()==hand.get(j).getNumber()) {
					match++;
					if(match<=4) {
						if(match==3) {
							System.out.println("You have Three of a Kind");
						}else {
							
						}
					}
				}
			}
		}
	}
	
	
	public void twopair() { //checks to see if there are two different pairs
		int match = 0;
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++) {
				if(hand.get(i).getNumber()==hand.get(i+1).getNumber()){
					match++;
					if(match==2) {
							System.out.println("You have Two Pair");
						}else {
					
						}
					}
				}
			}
		}
	
	public void straight() {//sorts array and checks to see if each card is 1 less than the next card
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++) {
				if(hand.get(i).getNumber()==hand.get(i+1).getNumber()) {
					}
			}
		}
	}
	/*public void fullhouse() {
		int match = 0;
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++){
				if(hand.get(i).getNumber()==hand.get(i+1).getNumber()) {
					match++;
					if(match<4) {
						if(match==3) {
						
					}
					
				}
			}
		}
	}
		
	}*/
	
	public void flush() {
		int match = 0;
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++) {
			if(hand.get(i).getSuite()==hand.get(i+1).getSuite()) {
				match++;
				if(match==5) {
					System.out.println("You have a Flush");
				}
			}
		}
	}
}

	public void fok() {
		int match = 0;
		for(int i = 0; i<hand.size();i++) {
			for(int j=i+1; j<hand.size();j++) {
			if(hand.get(i).getNumber()==hand.get(i+1).getNumber()) {
				match++;
				if(match==4) {
					System.out.println("You have Four of a Kind");
				}
				}
			}
		}
	}
}

