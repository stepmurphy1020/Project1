package poker;

public class card {
	public String suite;
	public int number;
	
	public card(String inputS, int inputNum) {
		suite = inputS;
		number = inputNum;
	}
	@Override
	public String toString() {
		return number + " of " + suite;
	}
}
