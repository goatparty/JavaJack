/** 
This class creates and manages a players hands and money
*/
public class BJHand {
		
	private int whiteChips = 10,redChips = 5,greenChips = 2,blackChips = 1;
	private double euro = 0.89, pound = 0.65;


	/**
	Initiates a players money if default amount is not wanted
	*/

	public boolean setChips(int white,int red,int green,int black) {
		whiteChips = white;
		redChips = red;
		greenChips = green;
		blackChips = black;

		return true;
	}

	/**
	Totals players money to a specific currency:  $e,£p,€d
	*/

	public double getMoney(char currencyType) {
		double amtMoney = 0;

		
		if (currencyType == 'e'){
			amtMoney += 1.00 * whiteChips;
			amtMoney += 5.00 * redChips;
			amtMoney += 25.00 * greenChips;
			amtMoney += 100.00 * blackChips;
			amtMoney = amtMoney * pound;
		}
		else if (currencyType == 'p'){
			amtMoney += 1.00 * whiteChips;
			amtMoney += 5.00 * redChips;
			amtMoney += 25.00 * greenChips;
			amtMoney += 100.00 * blackChips;
			amtMoney = amtMoney * euro;
		}
		else if (currencyType == 'd' ) {
			amtMoney += 1.00 * whiteChips;
			amtMoney += 5.00 * redChips;
			amtMoney += 25.00 * greenChips;
			amtMoney += 100.00 * blackChips;
		}
		else {
			amtMoney += 1.00 * whiteChips;
			amtMoney += 5.00 * redChips;
			amtMoney += 25.00 * greenChips;
			amtMoney += 100.00 * blackChips;
		}
		
		return amtMoney;

	}

	/**
	Sets the exchange rate for currency conversion (Optional)
	*/

	public void setExchangeRate(double eur,double pnd) {
		euro = eur;
		pound = pnd;

	}
	

}