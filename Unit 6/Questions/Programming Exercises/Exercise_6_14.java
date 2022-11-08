// Unit 6 - Exercise 14 

import java.util.Scanner;

public class Exercise_6_14 // ComputeGCD
{
	public static void main( String[] args )
	{
		final int Array_Size = 5;
		int[] number_array = new int[ Array_Size ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter five numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextInt();
	
		int gcdOfNumbers = FindGCD( number_array );

		System.out.printf( "The GCD of array is %d." , gcdOfNumbers );
	}

	public static int FindGCD( int... values )
	{
		int smallestNumber = FindSmallestValue( values );
		int gcd = 1;
		for( int j = 2 ; j <= smallestNumber ; j++ )
		{
			boolean allDivisible = true;
			for( int value: values )
			{
				if( ( value % j != 0 ) || 
					( smallestNumber % j != 0 ) )
					allDivisible = false;
			}
			if( allDivisible )
				gcd = j;			
		}
		
		return gcd;
	}
	
	public static int FindSmallestValue( int[] values )
	{
		int smallestValue = values[ 0 ];
		
		for( int i = 0 ; i < values.length ; i++ )
		{
			if( smallestValue > values[ i ] )
				smallestValue = values[ i ];
		}
		
		return smallestValue;
	}
}
