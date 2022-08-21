// Unit 3 - Exercise 22

import java.util.Scanner;

public class DeterminingPointInCircle
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Prompts the user to enter a point
		System.out.print( "Enter a point with two coordinates: " );
		double coordinateX = input.nextDouble();
		double coordinateY = input.nextDouble();
		
		// Determines user point whetheter in circle or not
		boolean isInCircle = ( 10 >= Math.pow( Math.pow( coordinateX - 0 , 2 ) + Math.pow( coordinateY - 0 , 2 ) , 0.5) );
		
		// Displays result
		if( isInCircle )
			System.out.printf( "Point (%.1f, %.1f) is in the circle", coordinateX, coordinateY );
		else
			System.out.printf( "Point (%.1f, %.1f) is not in the circle", coordinateX, coordinateY );
	}
}