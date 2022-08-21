// Unit 2 - Exercise 6

import java.util.Scanner;

public class SumOfDigits
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter a number
		System.out.print( "Enter a number between 0 and 1000: " );
		Scanner scannerGetInput = new Scanner( System.in );
		var number = scannerGetInput.nextInt();
		
		// Compute sum of digits
		var firstDigit = number % 10;
		var secondDigit = ( number / 10 ) % 10;
		var thirdDigit = ( number / 100 ) % 10;
		var result = thirdDigit + secondDigit + firstDigit;
		
		// Display result
		System.out.println( "The sum of the digits is: " + result );
	}
}