// Unit 2 - Exercise 23

import java.util.Scanner;

public class Acceleration
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter velocities and time
		System.out.print( "Enter v0, v1, and t: " );
		Scanner scannerGetInput = new Scanner ( System.in );
		double v0 = scannerGetInput.nextDouble();
		double v1 = scannerGetInput.nextDouble();
		double t = scannerGetInput.nextDouble();
	
		// Compute acceleration
		double acceleration = ( v1 - v0 ) / t;
		
		// Display result
		System.out.println( "The average acceleration is " + acceleration );
	}
}