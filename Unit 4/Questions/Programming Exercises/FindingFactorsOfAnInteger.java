// Unit 4 - Exercise 16

import java.util.Scanner;

public class FindingFactorsOfAnInteger
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts the user to enter an input
		System.out.print( "Please enter an integer for finding its factor: " );
		int number = input.nextInt();
		
		// Determines factors and prints them
		int i = 2;
		while ( i <= number )
		{
			if ( number % i == 0 )
			{
				number = number / i;
				System.out.printf( "%d " , i );
			}
			else
			i++;
		}
	}
}
