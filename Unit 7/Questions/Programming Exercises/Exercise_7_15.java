// Unit 7 - Exercise 15

import java.util.Scanner;

public class Exercise_7_15 // CheckWhetherSameLineOrNot
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "How many point do you want to enter: " );
		int pointCount = input.nextInt();
		
		double[][] point_array = new double[ pointCount ][ 2 ];
		
		// Why: Because value and array index starts from different numbers.
		while( --pointCount >= 0 )
		{
			System.out.println( "Please enter x and y coordinates of the point: " );
			point_array[ pointCount ][ 0 ] = input.nextDouble();
			point_array[ pointCount ][ 1 ] = input.nextDouble();
		}

		System.out.println();

		double firstSlope = ( point_array[ 1 ][ 1 ] - point_array[ 0 ][ 1 ] ) / 
							( point_array[ 1 ][ 0 ] - point_array[ 0 ][ 0 ] );
		boolean isSameLine = true;
		for( int i = 0; i < point_array.length ; i++ )
		{
			for( int j = i + 1; j < point_array.length - 1 ; j++ )
			{
				double currentSlope = ( point_array[ j ][ 1 ] - point_array[ i ][ 1 ] ) / 
										( point_array[ j ][ 0 ] - point_array[ i ][ 0 ] );

				if( firstSlope != currentSlope )
					isSameLine = false;
			}
		}

		if( isSameLine)
			System.out.println( "All of the points are the same line." );
		else
			System.out.println( "All of the points aren't the same line." );
	}
}

