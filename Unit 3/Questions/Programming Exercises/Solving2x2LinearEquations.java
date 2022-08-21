// Unit 3 - Exercise 3

import java.util.Scanner;

public class Solving2x2LinearEquations
{
	public static void main ( String args[] )
	{
		// Creates a Scanner and variables
		Scanner input = new Scanner( System.in );
		double a, b, c, d, e, f, x = 0, y = 0;
		boolean equationHasSolution;
	
		// Prompts the user to enter values for a, b, c, d, e and f
		System.out.print( "Enter a, b, c, d, e, f: " );	
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
	
		// Checks whetheter equation has solution or not
		equationHasSolution = ( ( a * d ) - ( b * c ) ) != 0;
		
		// Checks discriminant value
		if( !equationHasSolution )
			System.out.println ( "The equation has no solution" );
		else // Calculates and prints roots
		{
			x = ( ( e * d ) - ( b * f ) ) / ( ( a * d ) - ( b * c ) );
			y = ( ( a * f ) - ( e * c ) ) / ( ( a * d ) - ( b * c ) );
			System.out.printf( "x is %.1f and y is %.1f", x , y );
		}
	}
}