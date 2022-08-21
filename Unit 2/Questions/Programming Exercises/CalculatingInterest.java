// Unit 2 - Exercise 12

import java.util.Scanner;

public class CalculatingInterest
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter balance and interest rate
		System.out.print( "Enter balance and interest rate (e.g., 3 for 3%): " );
		Scanner scannerGetInput = new Scanner( System.in );
		var balance = scannerGetInput.nextDouble();
		var interestRate = scannerGetInput.nextDouble();
		
		// Compute interest
		var interest = balance * ( interestRate / 1200 );
		
		// Display result
		System.out.println( "The interest is: " + interest );
	}
}