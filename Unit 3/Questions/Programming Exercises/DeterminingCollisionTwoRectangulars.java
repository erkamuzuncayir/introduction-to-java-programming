// Unit 3 - Exercise 28

import java.util.Scanner;

public class DeterminingCollisionTwoRectangulars
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		boolean isInside = false;
		boolean isOverlap = false;
		
		// Prompts the user to enter a rectangulars' values
		System.out.print( "Enter r1’s center x-, y-coordinates, width, and height: " );
		double rOneCenterCoordinateX = input.nextDouble();
		double rOneCenterCoordinateY = input.nextDouble();
		double rOneWidth = input.nextDouble();
		double rOneHeight = input.nextDouble();
		
		System.out.print( "Enter r2’s center x-, y-coordinates, width, and height: " );
		double rTwoCenterCoordinateX = input.nextDouble();
		double rTwoCenterCoordinateY = input.nextDouble();
		double rTwoWidth = input.nextDouble();
		double rTwoHeight = input.nextDouble();		
		
		// Finds rectangulars' extreme points
		double rOneUpEdge = rOneCenterCoordinateY + ( rOneHeight / 2 );
		double rOneDownEdge = rOneCenterCoordinateY - ( rOneHeight / 2 );
		double rOneLeftEdge = rOneCenterCoordinateX - ( rOneWidth / 2 );
		double rOneRightEdge = rOneCenterCoordinateX + ( rOneWidth / 2 );
		
		double rTwoUpEdge = rTwoCenterCoordinateY + ( rTwoHeight / 2 );
		double rTwoDownEdge = rTwoCenterCoordinateY - ( rTwoHeight / 2 );
		double rTwoLeftEdge = rTwoCenterCoordinateX - ( rTwoWidth / 2 );
		double rTwoRightEdge = rTwoCenterCoordinateX + ( rTwoWidth / 2 );
		
		// Determines whetheter inside, overlap or neither
		if( ( rOneUpEdge >= rTwoUpEdge ) && ( rOneDownEdge <= rTwoDownEdge ) && 
			( rOneLeftEdge <= rTwoLeftEdge ) && (  rOneRightEdge >= rTwoRightEdge ) )
			isInside = true;
		else if( ( rOneUpEdge > rTwoUpEdge ) || ( rOneUpEdge > rTwoDownEdge ) &&
				( rOneRightEdge > rTwoLeftEdge ) || (  rOneRightEdge > rTwoRightEdge ) )
			isOverlap = true;

		// Display result
		if( isInside )
			System.out.println( "r2 is inside r1" );
		else if( isOverlap )
			System.out.println( "r2 overlaps r1" );
		else
			System.out.println( "r2 does not overlap r1" );
	}
}