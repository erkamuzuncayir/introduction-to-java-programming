// Unit 3 - Exercise 29

import java.util.Scanner;

public class DeterminingCollisionTwoCircles
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		boolean isInside = false;
		boolean isOverlap = false;
		
		// Prompts the user to enter a circles' values
		System.out.print( "Enter circle1’s center x-, y-coordinates, and radius: " );
		double cOneCenterCoordinateX = input.nextDouble();
		double cOneCenterCoordinateY = input.nextDouble();
		double cOneRadius = input.nextDouble();

		
		System.out.print( "Enter circle2’s center x-, y-coordinates, and radius: " );
		double cTwoCenterCoordinateX = input.nextDouble();
		double cTwoCenterCoordinateY = input.nextDouble();
		double cTwoRadius = input.nextDouble();
		
		// Finds distance between circles
		double distanceBetweenCenters = Math.pow( Math.pow( cOneCenterCoordinateX - cTwoCenterCoordinateX , 2 ) + 
										Math.pow( cOneCenterCoordinateY - cTwoCenterCoordinateY , 2 ) , 0.5);	

		// Determines whetheter inside, overlap or neither
		if( ( cTwoRadius + distanceBetweenCenters ) < cOneRadius )
			isInside = true;
		else if( ( ( distanceBetweenCenters + cTwoRadius ) > cOneRadius ) && ( ( distanceBetweenCenters - cTwoRadius ) < cOneRadius ) )
			isOverlap = true;

		// Displays result
		if( isInside )
			System.out.println( "circle2 is inside circle1" );
		else if( isOverlap )
			System.out.println( "circle2 overlaps circle1" );
		else
			System.out.println( "circle2 does not overlap circle1" );
	}
}