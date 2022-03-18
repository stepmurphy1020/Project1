package poker;

public class Tester {
	public static void main(String[] args) {
		HandEvaluator g = new HandEvaluator();
		pokerhand Deal = new pokerhand();
		Deal.draw();
		System.out.println("Your Hand:");
		System.out.println(g.hand);
		}
	}

