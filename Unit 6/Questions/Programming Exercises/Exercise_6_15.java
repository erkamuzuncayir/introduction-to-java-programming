// Unit 6 - Exercise 15

import java.util.Scanner;
import java.util.Arrays;

public class Exercise_6_15 // EliminateDuplicateElements
{
	public static void main( String[] args )
	{
		final int Number_Count = 10;
		int[] number_array = new int[ Number_Count ];			
		Scanner input = new Scanner( System.in );
		boolean zeroCheck = false;
		int distinctArrayIndex = 0;
		
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
		{
			int inputNumber = input.nextInt();
			
			if( inputNumber == 0 )
				zeroCheck = true;
			else if ( !IsDuplicate( number_array , inputNumber ) )
				number_array[ distinctArrayIndex++ ] = inputNumber;
		}
		
		int[] distinct_number_array;
		if( zeroCheck )
		{
			number_array[ distinctArrayIndex ] = 0;
			distinct_number_array = CreateDistinctArray( number_array , distinctArrayIndex + 1 );
		}
		else
			distinct_number_array = CreateDistinctArray( number_array , distinctArrayIndex );
		
		System.out.printf("The distinct array's elements are :");
		for( int i = 0 ; i < distinct_number_array.length ; i++ )
			System.out.print( distinct_number_array[ i ] );
	}
	
	public static boolean IsDuplicate( int[] number_array , int number )
	{
		for( int i = 0 ; i < number_array.length ; i++ )
		{
			if( number == number_array[ i ] )	
				return true;
		}
		
		return false;
	}

	public static int[] CreateDistinctArray( int[] number_array , int distinctArraySize )
	{
		int[] distinct_number_array = new int[ distinctArraySize ];
		System.arraycopy( number_array , 0 , distinct_number_array , 0 , distinctArraySize );
		return distinct_number_array;
	}
}
