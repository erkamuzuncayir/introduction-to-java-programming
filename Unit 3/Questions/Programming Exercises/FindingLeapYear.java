// Unit 3 - Exercise 18

import javax.swing.JOptionPane;

public class FindingLeapYear
{
	public static void main( String[] args ) 
	{
		// Prompts the user to enter a year
		String input = JOptionPane.showInputDialog( null , "Enter a year" , "Leap Year" , JOptionPane.QUESTION_MESSAGE );
		int year = Integer.parseInt( input );
		
		// Checks if the year is a leap year
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0  || year % 400 == 0;

		// Displays the result
		JOptionPane.showMessageDialog( null, year + " is a leap year? \n" + isLeapYear ); 
	}
}