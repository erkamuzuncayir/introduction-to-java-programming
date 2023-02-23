// Chapter 9 - Exercise 8 | BinaryToDecimal

import java.util.*;

public class Exercise_9_8
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a binary number: " );
		String str = input.nextLine();
		
		System.out.printf( "Decimal number is %d", BinaryToDecimal( str ) ); 
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