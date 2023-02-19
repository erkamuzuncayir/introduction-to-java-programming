// Chapter 9 - Exercise 5 | FindOccurrenceOfDigits

import java.util.*;

public class Exercise_9_5
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a String: " );
		String str = input.nextLine();
	
		int[] digit_count_in_str = FindDigitCounts( str );
		System.out.printf( "Digit count of in %s\n", str );
		for( int i = 0; i < digit_count_in_str.length ; i++ )
		{
			if( digit_count_in_str[ i ] > 0 )
				System.out.printf( "Digit count of %d is %d.\n",
									i, digit_count_in_str[ i ] );
		}
	}
	
	public static int[] FindDigitCounts( String str )
	{
		int[] digit_count = new int[ 10 ];
		for( int i = 0; i < str.length(); i++ )
		{
			if( Character.isDigit( str.charAt( i ) ) )
				/* 	charAt() methods gives us a char variable not int. 
				*	Therefore when we want store it we can store ASCII values of it.
				*	Convert it from char to int we simply subtract of start index of numbers in ASCII tables (48).*/
				digit_count[ str.charAt( i ) - 48 ]++;
		}
		
		return digit_count;
	}
}	