
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "Feburary 13th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String who = JOptionPane.showInputDialog("which persons birthday do you want to know");

		

		if (who.equals("mom")) {
			System.out.print("moms birthday is "+momsBirthday);
		} else if (who.equals("dad")) {
			System.out.print("dads birthday is "+dadsBirthday);
		} else if (who.equals("my")) {
			System.out.print("my birthday is "+ myBirthday);
		} else {
			System.out.print("Sorry, i don't remember that person's birthday!");
		}
		// 4. if user asked for "mom"
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
