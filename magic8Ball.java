package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class magic8Ball {
	public static void main(String[] args) {
		
		// 1. Make a main method that includes all the steps below….

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random r1 = new Random();
		int num = r1.nextInt(4);
		// 3. Print out this variable
		System.out.println(r1);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Enter your question for the 8 ball");
		// 5. If the random number is 0
		if(num == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		if(num == 1){
			JOptionPane.showMessageDialog(null, "No");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if(num == 2){
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if(num == 3){
			JOptionPane.showMessageDialog(null, "Check back later");
		}
		// -- write your own answer


		
		
	}

}
