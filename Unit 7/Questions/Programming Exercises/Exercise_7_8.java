// Unit 7 - Exercise 8

import java.util.Scanner;

public class Exercise_7_8 // FindAllNearestPointsWithSameDistance
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter the number of points: " );
		int numberOfPoints = input.nextInt();
		
		// Create an array for store of the pair of same minimum distance points
		double[][][] pairOfMinimumDistancePoints = new double[ numberOfPoints ][ 2 ][ 2 ];
		// Create a variable for pair count
		int pairCount = 0;
		
		// Create an array to store points
		double[][] points = new double[ numberOfPoints ][ 2 ];
		System.out.printf( "Enter %d points: " , numberOfPoints );
		for( int i = 0; i < points.length; i++ )
		{
			points[ i ][ 0 ] = input.nextDouble();
			points[ i ][ 1 ] = input.nextDouble();
		}
		
		// p1 and p2 are the indices in the points array
		int p1 = 0, p2 = 1; // Initial two points
		
		// Initialize shortestDistance
		double shortestDistance = distance( points[ p1 ][ 0 ], points[ p1 ][ 1 ],
											points[ p2 ][ 0 ], points[ p2 ][ 1 ] );
		
		// Compute distance for every two points
		for( int i = 0; i < points.length; i++ )
		{
			for( int j = i + 1; j < points.length; j++ )
			{
				// Find distance
				double distance = distance( points[ i ][ 0 ], points[ i ][ 1 ],
											points[ j ][ 0 ], points[ j ][ 1 ] );

				if( shortestDistance > distance )
				{
					p1 = i; // Update p1
					p2 = j; // Update p2
					shortestDistance = distance; // Update shortestDistance
					// Resets pair points array
					pairOfMinimumDistancePoints = new double[ numberOfPoints ][ 2 ][ 2 ];
					pairOfMinimumDistancePoints[ 0 ][ 0 ] = points[ p1 ];
					pairOfMinimumDistancePoints[ 0 ][ 1 ] = points[ p2 ];
					pairCount = 1; // First pair
				}
				else if( shortestDistance == distance )
				{
					// Add pair array
					pairOfMinimumDistancePoints[ pairCount ][ 0 ] = points[ i ];
					pairOfMinimumDistancePoints[ pairCount ][ 1 ] = points[ j ];
					pairCount++; // Increment to pair count
				}
			}
		}
	
		// Display result
		System.out.println( "The all closest pairs of points with same minimum distance are: " );
		// Print until pairCount
		for( int i = 0; i < pairCount; i++ )
		{
			System.out.printf("(%.2f, %.2f) and (%.2f, %.2f)\n" ,
								pairOfMinimumDistancePoints[ i ][ 0 ][ 0 ],
								pairOfMinimumDistancePoints[ i ][ 0 ][ 1 ],
								pairOfMinimumDistancePoints[ i ][ 1 ][ 0 ],
								pairOfMinimumDistancePoints[ i ][ 1 ][ 1 ] );
		}
	}
	
	// Compute the distance between two points (x1 , y1) and (x2 , y2)
	
	public static double distance( double x1 , double y1, double x2, double y2 )
	{
		return Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) );
	}
}
