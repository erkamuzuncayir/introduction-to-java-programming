// Unit 2 - Exercise 3

import java.util.Scanner;

public class FeetIntoMeters
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter feet
		System.out.print( "Enter a value for feet: " );
		Scanner scannerGetInput = new Scanner( System.in );
		var feet = scannerGetInput.nextDouble();

		// Convert feet into meters
		final double Multiplier = 0.305;
		double meter = feet * Multiplier;

		// Display result
		System.out.println( feet + " feet is " + meter );
	}
}