// Chapter 9 - Exercise 10 | DecimalToBinary

import java.util.*;

public class Exercise_9_10
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a decimal number: " );
		int num = input.nextInt();
		
		System.out.printf( "Binary number is %s", DecimalToBinary( num ) ); 
	}
	
	public static String DecimalToBinary( int num )
	{
		final int Binary_Divider = 2;
		String bitNum = "";

		while( num >= Binary_Divider )
		{
			bitNum = num % Binary_Divider + bitNum;
			num /= Binary_Divider;
			
			if( num < 2 )
				bitNum = num + bitNum;
		}
		
		return bitNum;
	}
}
	