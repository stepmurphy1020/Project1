package poker;
/**
 * Makes a data type Card, that is used in the Deck class to make a deck of cards
 * @author Jr
 *
 */
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
