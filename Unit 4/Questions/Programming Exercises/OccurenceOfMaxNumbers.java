// Unit 4 - Exercise 41

import java.util.Scanner;

public class OccurenceOfMaxNumbers
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		int number = 1;
		int max = 0;
		int count = 1;
		
		// Prompts user to enter number
		System.out.print( "Please enter couple of numbers (0, ends program.): " );
		
		// Gets input and determines max number and occurence of its
		while ( number != 0 )
		{
			number = input.nextInt();
			if ( number > max )
			{
				max = number;
				count = 1;
			}
			else if ( number == max )
				count++;
		}
		
		// Displays result
		System.out.printf( "The largest number is %d\n" , max );
		System.out.printf( "The occurence count of the largest number is %d\n" , count );
	}
}
