// Unit 6 - Exercise 17

import java.util.Scanner;

public class Exercise_6_17 // StartsFromMaxSelectionSort
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] number_array = new double[ Array_Size ];
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextInt();
	
		double[] sorted_number_array = SelectionSort( number_array );	
 		
 		System.out.print("Sorted Array: ");
		for( double number: sorted_number_array) 
			System.out.printf( "%.2f  " , number );
	}
	
	public static double[] SelectionSort( double[] values )
	{
		for( int i = values.length - 1 ; i > 0 ; i-- )
		{
			double currentMax = values[ i ];
			int currentMaxIndex = i;
			
			for( int j = i - 1 ; j >= 0 ; j-- )
			{
				if( currentMax < values[ j ] )
				{
					currentMax = values[ j ];
					currentMaxIndex = j;
				}
			}
			if( currentMaxIndex != i )
			{
				values[ currentMaxIndex ] = values[ i ];
				values[ i ] = currentMax;
			}
		}
		return values;
	}
	
}
