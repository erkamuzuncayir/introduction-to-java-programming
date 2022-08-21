// Unit 3 - Exercise 27

import java.util.Scanner;

public class DeterminingPointInTriangle
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner and variable
		Scanner input = new Scanner( System.in );
		boolean isInTriangle = false;
		
		// Prompts the user to enter a point
		System.out.print( "Enter a point with two coordinates: " );
		double coordinateX = input.nextDouble();
		double coordinateY = input.nextDouble();
		
		// Determines user point whetheter in circle or not
		if( ( coordinateX + ( 2 * coordinateY ) <= 200 ) && 
			( coordinateX < 200 ) && ( coordinateY < 100 ) )
			isInTriangle = true;
			
		// Displays result
		if( isInTriangle )
			System.out.printf( "Point (%.1f, %.1f) is in the triangle", coordinateX, coordinateY );
		else
			System.out.printf( "Point (%.1f, %.1f) is not in the triangle", coordinateX, coordinateY );
	}
}