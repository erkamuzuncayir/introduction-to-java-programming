// Unit 4 - Exercise 42

import java.util.Scanner;

public class FindingSalesAmountModified
{
	public static void main ( String[] args )
	{
		// Creates a scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter soughted commision
		System.out.print( "Please enter soughted commision: " );
		double commisionSought = input.nextDouble();

		double sale = 0;
		double commisionAmount = 0;
		
		// Determines needed sales amount 
		for ( int i = 0 ; ; i++ )
		{
			if ( commisionAmount > commisionSought )
				break;
			sale += 0.01;
			if( sale > 10000 )
				commisionAmount = ( 5000 * 0.08 ) + ( 5000 * 0.1 )
									 + ( ( sale - 10000 ) * 0.12 );
			else if( sale > 5000 )
				commisionAmount = ( 5000 * 0.08 ) + ( ( sale - 5000 ) * 0.1 );
			else
				commisionAmount = sale * 0.08;
		}
		
		// Displays result
		System.out.println( sale );
	}
}
