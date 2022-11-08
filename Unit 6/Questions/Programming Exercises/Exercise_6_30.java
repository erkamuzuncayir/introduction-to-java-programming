// Unit 6 - Exercise 30

import java.util.Scanner;
import java.util.Arrays;

public class Exercise_6_30 // FindConsecutiveFourEqualNumbers
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter list (First input will be array's length):" );
		final int Array_Size = input.nextInt();
		
		int[] number_array = new int[ Array_Size ];
	
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextInt();
	
		boolean IsThereFourConsecutiveNumber = FindFourConsecutive( number_array );
		
		System.out.println( IsThereFourConsecutiveNumber ? true : false );	
	}
	
	public static boolean FindFourConsecutive( int[] values )
	{
		int consecutiveCount = 1; // because first number in consecutive already there
		Arrays.sort( values );
		for( int i = 0 ; i < values.length - 1 ; i++ )
		{
			if( values[ i ] == values[ i + 1 ] )
				consecutiveCount++;
			else if( values[ i ] != values[ i + 1 ] && consecutiveCount != 4 )
				consecutiveCount = 0;
		}
		
		return consecutiveCount == 4 ? true : false;
	}
	
}
