// Unit 4 - Exercise 36

import java.util.Scanner;

public class CheckingISBN
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter ISBN numbers
		System.out.print( "Enter an ISBN number's first 9 digits: " );
		String ISBNString = input.nextLine();
		int ISBN = Integer.parseInt( ISBNString );
		
		int lastDigit = 0;
		
		// Calculates the last digit
		for ( int i = 100000000 , j = 1 ; i >= 1 ; i /= 10 , j++ )
		{
			lastDigit += ( ISBN / i ) * j;
		}
		
		lastDigit = lastDigit % 11;
		
		// Displays result
		System.out.printf( "ISBN number is %s%d\n" , ISBNString , lastDigit );
	}
}
