// Unit 2 - Exercise 22

import java.util.Scanner;

public class AreaOfATriangle
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter points of triangle
		System.out.print( "Enter three points for a triangle: " );
		Scanner scannerGetInput = new Scanner( System.in );
		double x1 = scannerGetInput.nextDouble();
		double y1 = scannerGetInput.nextDouble();
		double x2 = scannerGetInput.nextDouble();
		double y2 = scannerGetInput.nextDouble();
		double x3 = scannerGetInput.nextDouble();
		double y3 = scannerGetInput.nextDouble();

		// Compute area of triangle
		double side1 = Math.pow ( Math.pow ( x2 - x1 , 2 ) + Math.pow ( y2 - y1 , 2 ) , 0.5 );
		double side2 = Math.pow ( Math.pow ( x3 - x2 , 2 ) + Math.pow ( y3 - y2 , 2 ) , 0.5 );
		double side3 = Math.pow ( Math.pow ( x1 - x3 , 2 ) + Math.pow ( y1 - y3 , 2 ) , 0.5 );
		double s = ( side1 + side2 + side3 ) / 2;
		double area = Math.pow ( s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ) , 0.5 );

		// Display result
		System.out.println( "The area of the triangle is " + area );
	}
}