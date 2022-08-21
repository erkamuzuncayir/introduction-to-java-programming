// Unit 3 - Exercise 2

import java.util.Scanner;

public class CheckingNumberEven
{
	public static void main ( String args[] )
	{
		// Creating a Scanner and variables
		Scanner input = new Scanner( System.in );
		int number;
		boolean evenChecker;
		
		// Prompt the user to enter an integer
		System.out.print( "Enter an integer: " );
		number = input.nextInt();
		
		// Check whether a number is even or not
		evenChecker = ( number % 2 == 0 );
		
		// Print result
		System.out.printf( "Is %d an even number? %b" , number , evenChecker );
	}
}