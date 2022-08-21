// Unit 4 - Exercise 37

import java.util.Scanner;

public class IntegerToHex
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter an integer for convert a hexadecimal number
		System.out.print( "Please enter an integer to convert hexadecimal: " );
		int decimalNumber = input.nextInt();
		
		String hexNumber = "";
		
		// Converts integer to hexadecimal number
		while ( decimalNumber != 0 )
		{
			int digit = decimalNumber % 16;
			
			if ( digit < 10 )
			{
				hexNumber = digit + hexNumber;	
			}
			else if ( digit == 10 )
			{
				hexNumber = 'A' + hexNumber;
			}
			else if ( digit == 11 )
			{
				hexNumber = 'B' + hexNumber;
			}			
			else if ( digit == 12 )
			{
				hexNumber = 'C' + hexNumber;
			}			
			else if ( digit == 13 )
			{
				hexNumber = 'D' + hexNumber;
			}			
			else if ( digit == 14 )
			{
				hexNumber = 'E' + hexNumber;
			}			
			else if ( digit == 15 )
			{
				hexNumber = 'F' + hexNumber;
			}			
			
			decimalNumber /= 16;	
		}
		
		// Displays result
		System.out.printf( "Integer's hexadecimal form is %s\n" , hexNumber );
	}
}
