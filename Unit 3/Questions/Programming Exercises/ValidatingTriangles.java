// Unit 3 - Exercise 19

import java.util.Scanner;

public class ValidatingTriangles
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
		System.out.printf( "Can edges %d, %d, and %d form a triangle? \n%b", edgeOne, edgeTwo, edgeThree, isTriangle );


	}
}