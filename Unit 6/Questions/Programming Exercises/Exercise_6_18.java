// Unit 6 - Exercise 18

import java.util.Scanner;

public class Exercise_6_18 // BubbleSort
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] number_array = new double[ Array_Size ];
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextDouble();
		
		double[] sorted_number_array = BubbleSort( number_array );
		
		System.out.print("Sorted Array: ");		
		for( double element: sorted_number_array )
			System.out.printf( "%.2f  " , element);
			
	}
	
	public static double[] BubbleSort( double[] values )
	{	
		boolean isSorted = false;
		while( !isSorted )
		{
			isSorted = true;
			for( int i = 0 ; i < values.length - 1 ; i++ )
			{
				if( values[ i ] > values[ i + 1 ] )
				{
					isSorted = false;
					double temp = values[ i ];
					values[ i ] = values[ i + 1 ];
					values[ i + 1 ] = temp;
				}
			}
		}
		
		return values;
	}
}
