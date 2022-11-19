package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		public static void main(String[] args) {
			
		
		// 2. Make a variable that will hold a random whole number
		int randomNumber;

		Random ran = new Random();
		
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		randomNumber = ran.nextInt(4);
		
		// 3. Print your variable to the console
		System.out.println(randomNumber);
		// 4. Get the user to enter something that they think is awesome
		Object what;
		JOptionPane.showInputDialog("what is something you think is awesome?");
		// 5. If your variable is  0
		if(randomNumber==0){
		JOptionPane.showMessageDialog(null, "that is awesome!");
		}
			// -- tell the user whatever they entered is awesome!
		// 6. If your variable is  1
		if(randomNumber==1) {
			JOptionPane.showMessageDialog(null,"that is ok");
		}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
		if (randomNumber==2) {
		JOptionPane.showMessageDialog(null,"that is boring");
		}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
		if (randomNumber==3) {
			JOptionPane.showMessageDialog(null,"that is not nice,please respect evreyone");
		}
			// -- invent your own message to give to the user (be nice).
		}
}
