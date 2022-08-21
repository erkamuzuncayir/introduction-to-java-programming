// Unit 4 - Exercise 46

import java.util.Scanner;

public class BitLevelOperations
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter a number
		System.out.print( "Enter a number: " );
		short number = input.nextShort();
		
		String bitNumber = "";
		
		// Computes bitwise number
		for ( int i = 0 ; i < 16 ; i++ )
		{
			bitNumber = ( number & 1 ) + bitNumber;
			number >>= 1;
		}
	
		// Displays result
		System.out.printf( "The bitwise number is %s\n" , bitNumber );
	}
}
