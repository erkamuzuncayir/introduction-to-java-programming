// Unit 6 - Exercise 5

import java.util.Scanner;
import java.util.Arrays;

public class Exercise_6_5 // PrintDistinctNumbers
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
		
		if( zeroCheck )
			number_array[ distinctArrayIndex ] = 0;
			
		System.out.printf("The distinct numbers are: ");
		for( int i = 0 ; i < distinctArrayIndex + 1 ; i++ ) //
			System.out.print( number_array[ i ] );
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
}
