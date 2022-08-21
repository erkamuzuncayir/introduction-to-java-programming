// Unit 3 - Exercise 12

import java.util.Scanner;

public class CheckingNumberDivision
{
	public static void main( String[] args ) 
	{
		// Creates a scanner and variables
		Scanner input = new Scanner( System.in );

		// Prompts the user to enter an integer
		System.out.print( "Enter an integer: " );
		int num = input.nextInt();
		
		// Displays result
		if ( ( num % 5 == 0 ) ^ ( num % 6 == 0 ) )
			System.out.printf( "%d is divisible by 5 or 6, but not both" , num );
		else if ( ( num % 5 == 0 ) && ( num % 6 == 0 ) )
			System.out.printf( "%d is divisible by both 5 and 6" , num );
		else if ( ( num % 5 != 0 ) && ( num % 6 != 0 ) )
			System.out.printf( "%d is not divisible by either 5 or 6" , num );
	}
}