// Unit 2 - Exercise 10

import javax.swing.JOptionPane;

public class ComputeChangeWithGUI
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter desired amount of money
		String JOptionPaneInput = JOptionPane.showInputDialog( null , "Enter an amount in double, for example 11.56: ", "ComputeChangeWithGUI" , JOptionPane.QUESTION_MESSAGE );
		double amount = Double.parseDouble( JOptionPaneInput );
		
		// Compute change
		int remainingAmount = ( int )( amount * 100 );
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;

		// Display result
		JOptionPane.showMessageDialog( null , "Your amount " + amount + " consists of \n" +
		"\t" + numberOfOneDollars + " dollars\n" +
		"\t" + numberOfQuarters + " quarters\n" +
		"\t" + numberOfDimes + " dimes\n" +
		"\t" + numberOfNickels + " nickels\n" +
		"\t" + numberOfPennies + " pennies" );
	}
}