// Unit 3 - Exercise 9 

import java.util.Scanner;

public class CheckingISBN
{
	public static void main( String[] args ) 
	{
		// Creates a scanner
		Scanner input = new Scanner( System.in );
		
		// Prompts the user to enter ISBN numbers		
		System.out.print( "Enter an ISBN number's first 9 digits : " );
		String ISBNString = input.nextLine();
		int ISBN = Integer.parseInt( ISBNString );
		
		// Calculates last digit
		int lastDigit = ( ( ( ISBN / 100000000 ) * 1 ) +
						( ( ISBN / 10000000 ) * 2 ) +
						( ( ISBN / 1000000 ) * 3 ) +
						( ( ISBN / 100000 ) * 4 ) +
						( ( ISBN / 10000 ) * 5 ) +
						( ( ISBN / 1000 ) * 6 ) +
						( ( ISBN / 100 ) * 7 ) +
						( ( ISBN / 10 ) * 8 ) +
						( ( ISBN / 1 ) * 9 ) ) % 11; 
						
		// Displays result
		System.out.printf( "%s%d" , ISBNString , lastDigit );
	}
}