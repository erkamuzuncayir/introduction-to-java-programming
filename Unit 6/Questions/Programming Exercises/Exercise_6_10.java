// Unit 6 - Exercise 10

import java.util.Scanner;

public class Exercise_6_10 // FindIndexOfSmallestElement
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] input_array = new double[ Array_Size ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < input_array.length ; i++ )
			input_array[ i ] = input.nextDouble();
	
		int indexOfSmallestElement = FindIndexOfSmallestElement( input_array );
		
		System.out.printf( "The index of smallest element of our array is %d.\n" , indexOfSmallestElement );
	}
	
	public static int FindIndexOfSmallestElement( double[] values )
	{
		double min = values[ 0 ];
		int minIndex = 0;
		
		for( int i = 0 ; i < values.length ; i++ )
		{
			if( min > values[ i ] )
			{
				min = values[ i ];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
}
