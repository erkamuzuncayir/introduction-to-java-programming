// Unit 5 - Listing 8

import java.util.Scanner;

public class Decimal2HexConversion
{
	// Main method
	public static void main( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Prompt the user to enter a decimal integer
		System.out.print( "Enter a decimal number: " );
		int decimal = input.nextInt();
		
		System.out.printf( "The hex number for decimal %d is %s" , decimal , DecimalToHex( decimal ) );
	}
	
	// Convert a decimal to a hex as a string
	public static String DecimalToHex( int decimal )
	{
		String hex = "";
		
		while( decimal != 0 )
		{
			int hexValue = decimal % 16;
			hex = ToHexChar( hexValue ) + hex;
			decimal /= 16;
		}
		
		return hex;
	}
	
	// Convert an integer to a single hex digit in a character
	public static char ToHexChar( int hexValue )
	{
		if( hexValue <= 9 && hexValue >= 0 )
			return ( char )( hexValue + '0' );
		else // hexValue <= 15 && hexValue >= 10
			return ( char )( hexValue - 10 + 'A' );
	}
}
