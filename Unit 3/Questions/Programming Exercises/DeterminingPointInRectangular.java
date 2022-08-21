// Unit 3 - Exercise 23

import java.util.Scanner;

public class DeterminingPointInRectangular
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		boolean isInRectangular = false;
		
		// Prompts the user to enter a point
		System.out.print( "Enter a point with two coordinates: " );
		double coordinateX = input.nextDouble();
		double coordinateY = input.nextDouble();
		
		// Determines user point whetheter in circle or not
		if( ( coordinateX <= 5 ) && ( coordinateX >= -5 ) &&
			( coordinateY <= 2.5 ) && ( coordinateX >= -2.5 ) )
			isInRectangular = true;
		
		// Displays result
		if( isInRectangular )
			System.out.printf( "Point (%.1f, %.1f) is in the rectangular", coordinateX, coordinateY );
		else
			System.out.printf( "Point (%.1f, %.1f) is not in the rectangular", coordinateX, coordinateY );
	}
}