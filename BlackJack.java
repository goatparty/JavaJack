import javax.swing.*;
import java.awt.*;
public class BlackJack {
	public static void main(String [] args) {
		BJHand burger = new BJHand();
		Dealer burga = new Dealer();
		int bin =burga.getCard(2);
		System.out.print(bin);
	}
}