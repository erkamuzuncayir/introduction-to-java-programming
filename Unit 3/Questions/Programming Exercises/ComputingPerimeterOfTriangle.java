// Unit 3 - Exercise 25

import java.util.Scanner;

public class ComputingPerimeterOfTriangle
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner and variable
		Scanner input = new Scanner( System.in );
		boolean isTriangle = false;
		
		// Prompts the user to enter edges
		System.out.print( "Please enter triangle's edges: " );
		int edgeOne = input.nextInt();
		int edgeTwo = input.nextInt();
		int edgeThree = input.nextInt();

		// Determines whetheter there is a triangle or not
		if( ( edgeOne + edgeTwo > edgeThree ) &&
			( edgeOne + edgeThree > edgeTwo ) &&
			( edgeTwo + edgeThree > edgeOne ) )
				isTriangle = true;
		
		// Displays result
		if( isTriangle )
		{		
			int perimeterOfTriangle = edgeOne + edgeTwo + edgeThree;
			System.out.printf( "Perimeter of the triangle is %d", perimeterOfTriangle );
		}
		else
			System.out.println( "The edges are invalid" );
	}
}