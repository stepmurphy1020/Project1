package poker;

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
	}
	public void tok() {
		
	}
	public void twopair() {
		
	}
	public void straight() {
		
	}
	public void fullhouse() {
		
	}
	public void flush() {
		
	}
	public void fok() {
		
	}
}
