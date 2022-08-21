// Unit 2 - Exercise 7

import javax.swing.JOptionPane;

public class FindingNumberOfYears
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter the number of minutes
		String JOptionPaneInput = JOptionPane.showInputDialog( null , "Enter the number of minutes:" ,  "Finding Number of Years" , JOptionPane.QUESTION_MESSAGE);
		var inputMinutes = Long.parseLong( JOptionPaneInput );
		
		// Calculating number of years
		var totalHours = inputMinutes / 60;
		var totalDays = totalHours / 24;
		var calculatedYears = totalDays / 365;
		var calculatedDays = totalDays % 365;

		// Display result
		JOptionPane.showMessageDialog( null , inputMinutes + " minutes is approximately " + calculatedYears + " years and " + calculatedDays + " days" );
	}
}