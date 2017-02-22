package elevens;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card cardone = new Card("One","Hearts",1);
		Card cardtwo = new Card("Two","Spades",2);
		Card cardthree = new Card("One","Hearts",1);
		
		System.out.println(cardone.matches(cardthree));
	}
}
