// Unit 4 - Exercise 15

import java.util.Scanner;

public class ComputingGCD
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		int gcd = 0;
		int smallestNumber = 0;
		
		// Prompts user to enter two numbers
		System.out.println ( "Enter two numbers for finding the greatest common divisor" );
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		
		// Determines smallest number of inputs
		if ( numberOne < numberTwo )
			smallestNumber = numberOne;
		else
			smallestNumber = numberTwo;
		
		// Finds greatest common divisor
		for ( int i = 1 ; i <= smallestNumber ; i++ )
		{
			if ( ( numberOne % i == 0 ) && ( numberTwo % i == 0 ) )
				gcd = i;
		}
		
		// Displays result
		System.out.printf ( "The greatest common divisor of %d and %d is %d.\n" , 
							numberOne , numberTwo , gcd );		
	}
}
