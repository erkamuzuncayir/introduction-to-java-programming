// Unit 2 - Exercise 4

import java.util.Scanner;

public class PoundsIntoKilograms
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter pounds
		System.out.print( "Enter a number in pounds: ");
		Scanner scannerGetInput = new Scanner( System.in );
		var pound = scannerGetInput.nextDouble();

		// Convert pounds into kilograms
		final double Multiplier = 0.454;
		double kilogram = pound * Multiplier;

		// Display result
		System.out.println( pound + " pound is " + kilogram );
	}
}