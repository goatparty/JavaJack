/**
For converting card array to actual cards, among other things
*/
public class CardMgmt {
	
	/**
	Converts internal card system to numeric value used in blackjack
	*/

	public int getCardValue(int cardValue) {
		string bin,place2,place3;
		int intPlace,intPlace1,findCardValue;
		bin = Integer.toString(cardValue);
		place2 = bin.charAt(1);
		place3 = bin.charAt(3);
		intPlace = Integer.parseString(place2);
		intPlace = Integer.parseString(place3);
		findCardValue = (place2 * 10) + place3;

		return findCardValue;
	}
}