// Unit 2 - Exercise 20

import java.util.Scanner;

public class DistanceOfTwoPoints
{
	public static void main( String[] args ) 
	{
		//Prompt the user to enter two points' x's and y's
		System.out.print( "Enter x1 and y1: ");
		Scanner scannerGetInputOne = new Scanner( System.in );
        var x1 = scannerGetInputOne.nextDouble();	
        var y1 = scannerGetInputOne.nextDouble();	
		
		System.out.print( "Enter x2 and y2: ");
		Scanner scannerGetInputTwo = new Scanner( System.in );
        var x2 = scannerGetInputTwo.nextDouble();	
        var y2 = scannerGetInputTwo.nextDouble();	
		
		// Compute distance
		var result = Math.pow ( Math.pow ( x2 - x1 , 2 ) + Math.pow ( y2 - y1 , 2 ) , 0.5);
		
		// Display result
		System.out.println( "The distance of the two points is: " + result );
	}
}