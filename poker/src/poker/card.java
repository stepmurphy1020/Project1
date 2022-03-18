package poker;

public class Card {
	public String suite;
	public int number;
	
	public Card(String inputS, int inputNum) {
		suite = inputS;
		number = inputNum;
	}
	@Override
	public String toString() {
		return number + " of " + suite;
	}
}
