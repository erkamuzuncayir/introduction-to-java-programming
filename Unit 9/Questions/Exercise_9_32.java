// Chapter 9 - Exercise 32 | CheckingISBNSimplified

import java.util.Scanner;

public class Exercise_9_32
{
	public static void main( String[] args ) 
	{
		// Creates a scanner
		Scanner input = new Scanner( System.in );
		
		// Prompts the user to enter ISBN numbers		
		System.out.print( "Enter an ISBN number's first 9 digits : " );
		String ISBN = input.nextLine();
		
		int lastDigit = 0;
		for( int i = 0; i < ISBN.length(); i++ )
			lastDigit += ( int )( ISBN.charAt( i ) - '0' ) * ( i + 1 ); 
			
		lastDigit %= 11;

		System.out.printf( "%s%d", ISBN, lastDigit );
	}
}
