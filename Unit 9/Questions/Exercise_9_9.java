// Chapter 9 - Exercise 9 | BinaryToHex

import java.util.*;

public class Exercise_9_9
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a binary number: " );
		String str = input.nextLine();
		
		System.out.printf( "Hexadecimal number is %s", BinaryToHex( str ) ); 
	}
	
	public static String BinaryToHex( String bn )
	{
		final int Hex_Divider = 16;
		String hexNum = "";

		int decimalNumber = BinaryToDecimal( bn );		
		// Because index always -1 of count
		int digitIndex = FindDigitCountInHex( decimalNumber ) - 1;
		
		while( digitIndex >= 0 )
		{
			int divider = ( int )( Math.pow( Hex_Divider, digitIndex ) );
			int division = decimalNumber / divider;

			if( division > 9 ) 
				hexNum += (char)( division % 9 + 'A' - 1 );
			else if( division > 0  )
				hexNum += division;

			decimalNumber %= divider;
			digitIndex--;
		}
		
		return hexNum;
	}
	
	public static int FindDigitCountInHex( int num )
	{
		final int Hex_Divider = 16;
		int digitCount = 0;
		
		while( num > 0 )
		{
			int divider = ( int )( Math.pow( Hex_Divider, digitCount ) );
			num /= divider;
			digitCount++;
		}
	
		return digitCount;
	}
	
	public static int BinaryToDecimal( String bn )
	{
		int digitIndex = bn.length() - 1;
		int decimalNumber = 0;
		
		for( int i = 0; i < bn.length() ; i++ )
		{
			decimalNumber += ( bn.charAt( i ) - 48 )
								* Math.pow( 2, digitIndex );
			digitIndex--;
		}
		return decimalNumber;
	}
}