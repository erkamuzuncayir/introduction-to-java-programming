// Unit 7 - Exercise 7

import java.util.Scanner;

public class Exercise_7_7 // FindNearestPoints
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter the number of points: " );
		int numberOfPoints = input.nextInt();
		
		// Create an array to store points
		double[][] points = new double[ numberOfPoints ][ 3 ];
		System.out.printf( "Enter %d points: \n" , numberOfPoints );
		for( int i = 0; i < points.length; i++ )
		{
			points[ i ][ 0 ] = input.nextDouble();
			points[ i ][ 1 ] = input.nextDouble();
			points[ i ][ 2 ] = input.nextDouble();
		}
		
		// p1 and p2 are the indices in the points array
		int p1 = 0, p2 = 1; // Initial two points
		
		// Initialize shortestDistance
		double shortestDistance = distance( points[ p1 ][ 0 ], points[ p1 ][ 1 ], points[ p1 ][ 2 ], 
											points[ p2 ][ 0 ], points[ p2 ][ 1 ], points[ p2 ][ 2 ] );
		
		// Compute distance for every two points
		for( int i = 0; i < points.length; i++ )
		{
			for( int j = i + 1; j < points.length; j++ )
			{
				// Find distance
				double distance = distance( points[ i ][ 0 ], points[ i ][ 1 ], points[ j ][ 2 ], 
											points[ j ][ 0 ], points[ j ][ 1 ], points[ j ][ 2 ] );
		
				if( shortestDistance > distance )
				{
					p1 = i; // Update p1
					p2 = j; // Update p2
					shortestDistance = distance; // Update shortestDistance
				}
			}
		}
	
	// Display result
	System.out.printf( "The closest two points are (%.2f, %.2f, %.2f) and (%.2f, %.2f, %.2f)." , 
						points[ p1 ][ 0 ], points[ p1 ][ 1 ], points[ p1 ][ 2 ], 
						points[ p2 ][ 0 ], points[ p2 ][ 1 ], points[ p2 ][ 2 ] );
		
	}
	
	// Compute the distance between two points (x1 , y1) and (x2 , y2)
	
	public static double distance( double x1, double y1, double x2, double y2, double z1, double z2 )
	{
		return Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) + ( z2 - z1 ) * ( z2 - z1 ) );
	}
}
