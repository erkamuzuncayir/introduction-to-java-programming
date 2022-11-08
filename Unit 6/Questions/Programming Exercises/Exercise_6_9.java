// Unit 6 - Exercise 9

import java.util.Scanner;

public class Exercise_6_9 // FindSmallestElement
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] number_array = new double[ Array_Size ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextDouble();
	
		double smallestOfArray = FindSmallestElement( number_array );
		
		System.out.printf( "The smallest number of our array is %.2f.\n" , smallestOfArray );
	}
	
	public static double FindSmallestElement( double[] values )
	{
		double smallestNumber = values[ 0 ];
		
		for( int i = 0 ; i < values.length ; i++ )
		{
			if( smallestNumber > values[ i ] )
				smallestNumber = values[ i ];
		}
		
		return smallestNumber;
	}
}
