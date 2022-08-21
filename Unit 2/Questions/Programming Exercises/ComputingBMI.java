// Unit 2 - Exercise 14

import java.util.Scanner;

public class ComputingBMI
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter weight and height
		System.out.print( "Enter weight in pounds: " );
		Scanner scannerGetInputOne = new Scanner( System.in );
		var weight = scannerGetInputOne.nextDouble();
		
		System.out.print( "Enter height in inches: " );
		Scanner scannerGetInputTwo = new Scanner( System.in );
		var height = scannerGetInputOne.nextDouble();
		
		// Compute BMI
		final double Multiplier = 0.45359237;
		var BMI = ( weight * Multiplier ) / Math.pow( ( height * 0.0254 ) , 2 );
		
		// Display result
		System.out.println( "BMI is: " + BMI );
	}
}