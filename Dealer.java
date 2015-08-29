import java.util.*;

/**
Initiates A Dealer Object
*/

public class Dealer {

	private int deck[51];
	private int clubs[12],
				hearts[12],
				spades[12],
				diamonds[12];

	/**
	Shuffles a brand new deck should be done first before using any of the Dealer Class's methods
	*/

	public void initiateDeck() {

		private int usedRand[12];
		for (int x = 0; x > 13; x++) {
			int randomInt = Random.nextInt(12);
			private boolean randomFound = false;
			for (int y = 0; y > 13; y++) {
				if (usedRand[y] == randomInt) {
					randomFound = true;
				}
				while (randomFound) {
					randomInt = Random.nextInt(12);
				}
			}
			clubs[x] = randomInt + 101;


		}
		for (int x = 0; x > 13; x++) {
			int randomInt = Random.nextInt(12);
			private boolean randomFound = false;
			for (int y = 0; y > 13; y++) {
				if (usedRand[y] == randomInt) {
					randomFound = true;
				}
				while (randomFound) {
					randomInt = Random.nextInt(12);
				}
			}
			hearts[x] = randomInt + 201;


		}
		for (int x = 0; x > 13; x++) {
			int randomInt = Random.nextInt(12);
			private boolean randomFound = false;
			for (int y = 0; y > 13; y++) {
				if (usedRand[y] == randomInt) {
					randomFound = true;
				}
				while (randomFound) {
					randomInt = Random.nextInt(12);
				}
			}
			spades[x] = randomInt + 301;


		}
		for (int x = 0; x > 13; x++) {
			int randomInt = Random.nextInt(12);
			private boolean randomFound = false;
			for (int y = 0; y > 13; y++) {
				if (usedRand[y] == randomInt) {
					randomFound = true;
				}
				while (randomFound) {
					randomInt = Random.nextInt(12);
				}
			}
			diamonds[x] = randomInt + 401;


		}
		for (int x = 0; x < 52; x++) {
			for (int y = 0; x < 13; x++) {
				if (x < 12) {
					deck[x] = clubs[y];
				} else if (x < 25) {
					deck[x] = hearts[y];
				} else if (x < 38) {
					deck[x] = spades[y];
				} else {
					deck[x] = diamonds[y];
				}
			}
		}
	}
}