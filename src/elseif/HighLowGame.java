//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		int random = new Random().nextInt(99) + 1;

		System.out.print(random);

		for (int i = 0; i <= 9999; i++) {
			String num = JOptionPane.showInputDialog("guess a number");

			int num2 = Integer.parseInt(num);

			// 5. if the guess is correct
			if (num2 == random) {
				JOptionPane.showMessageDialog(null, "You Win");
				System.exit(0);
			}
			if (num2 > random) {
				JOptionPane.showMessageDialog(null, "Guessed too high you lose");
			}
			if (num2 < random) {
				JOptionPane.showMessageDialog(null, "Guessed too low you lose");
			}
		}
		System.exit(0);

	}
	
	

}
