// Unit 
// Unit 8 - Exercise 13

import java.util.Scanner;

public class Location
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Enter the number of rows and columns of the array: " );
		int row = input.nextInt();
		int column = input.nextInt();
		
		double[][] number_array = new double[ row ][ column ];
		
		for( int i = 0 ; i < row; i++ )
		{
			for( int j = 0; j < column; j++ )
				number_array[ i ][ j ] = input.nextDouble();
		}
		
		Location test = Location.LocateLargest( number_array );
		
		System.out.printf( "The location of the largest element is %.0f at (%d, %d)\n", 
							test.maxValue, test.row, test.column );
	}
	
	public int row, column; 
	public double maxValue;

	public static Location LocateLargest( double[][] array )
	{
		double largestNumber = array[ 0 ][ 0 ];
		int largestNumberRow = 0;
		int largestNumberColumn = 0;
		
		for( int i = 0 ; i < array.length; i++ )
		{
			for( int j = 0; j < array[ 0 ].length; j++ )
			{
				if( array[ i ][ j ] > largestNumber )
				{
					largestNumber = array[ i ][ j ];
					largestNumberRow = i;
					largestNumberColumn = j;
				}
			}
		}
		
		Location test = new Location();
		test.maxValue = largestNumber;
		test.row = largestNumberRow;
		test.column = largestNumberColumn;
		
		return test;
	}
}