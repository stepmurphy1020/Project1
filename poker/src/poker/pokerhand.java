package poker;

public class pokerhand {
	public pokerhand(){
		Deck test = new Deck();
		for(int i = 0; i<5; i++) {
			test.drawCard();
			//System.out.println(test.drawCard());
		}
		
	}
}
