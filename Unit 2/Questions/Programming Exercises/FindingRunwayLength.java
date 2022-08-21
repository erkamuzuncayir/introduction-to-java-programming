// Unit 2 - Exercise 24

import java.util.Scanner;

public class FindingRunwayLength
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter points of triangle
		System.out.print( "Enter v and a: " );
		Scanner scannerGetInput = new Scanner( System.in );
		double v = scannerGetInput.nextDouble();
		double a = scannerGetInput.nextDouble();

		// Compute runway length
		double result = Math.pow ( v , 2 ) / ( 2 * a );

		// Display result
		System.out.println( "The minimum runway length for this airplane is " + result );
	}
}