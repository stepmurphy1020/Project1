package poker;

public class Tester {
	public static void main(String[] args) {
		Deck test = new Deck();
		
		for(int i = 0; i<5; i++) {
			System.out.println(test.drawcard());
		}
	}
}
