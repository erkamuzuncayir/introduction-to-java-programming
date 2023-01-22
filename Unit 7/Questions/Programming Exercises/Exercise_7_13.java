// Unit 7 - Exercise 13

import java.util.Scanner;
	
public class Exercise_7_13 // LocateTheLargestElement
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print("Enter the number of rows and columns of the array: ");
		double[][] number_array = new double[ input.nextInt() ][ input.nextInt() ];
		
		System.out.println( "Enter the array:" );
		for( int i = 0; i < number_array.length ; i++ )
		{
			for( int j = 0; j < number_array[ 0 ].length ; j++ )
			{
				number_array[ i ][ j ] = input.nextDouble();
			}
		}
		
		
		int[] maxNumberIndex = LocateLargest( number_array );
		
		System.out.printf("The location of the largest element is at (%d, %d)\n" ,
							 maxNumberIndex[ 0 ], maxNumberIndex[ 1 ] );
			
	}
	
	public static int[] LocateLargest( double[][] values )
	{
		int[] max = { 0 , 0 };
		for( int i = 0; i < values.length ; i++ )
		{
			for( int j = 0; j < values.length ; j++ )
			{
				// Checks number whether is the largest or not
				if( values[ i ][ j ] > values[ max[ 0 ] ][ max[ 1 ] ] )
				{
					// Assigns max number index into max array. 
					max[ 0 ] = i;
					max[ 1 ] = j;
				}
			}
		}
		
		return max;
	}
	
}
