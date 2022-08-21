// Unit 2 - Exercise 9

import java.util.Scanner;

public class MonetaryUnits
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter desired amount of money
		System.out.print( "Enter desired amount of money with last two digits represents the cents: " );
		Scanner scannerGetInput = new Scanner( System.in );
		var money = scannerGetInput.nextInt();
		
		// Compute change
		var centDigitOne = money % 10;
		var centDigitTwo = ( money / 10 ) % 10;
		var cents = centDigitOne + ( centDigitTwo * 10 );
		var dollars = ( money - cents ) / 100;
		
		// Display result
		System.out.println( "The amount of money is " + dollars + " dollars and " + cents + " cents." );
	}
}