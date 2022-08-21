// Unit 2 - Exercise 22

import java.util.Scanner;

public class AreaOfHexagon
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter side of the hexagon
		System.out.print( "Enter the side: " );
		Scanner scannerGetInput = new Scanner( System.in );
		double side = scannerGetInput.nextDouble();
		
		// Compute area of hexagon
		double area = ( ( 3 * Math.pow ( 3 , 0.5) ) / 2 ) * Math.pow ( side , 2 );
		
		// Display result
		System.out.println( "The area of the hexagon is " + area );
	}
}