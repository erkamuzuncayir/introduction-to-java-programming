// Unit 3 - Exercise 1

import java.util.Scanner;

public class SolvingQuadraticEquations
{
	public static void main ( String args[] )
	{
		// Creates a Scanner and variables
		Scanner input = new Scanner( System.in );
		double a, b, c, rootOne, rootTwo, discriminant;
	
		// Prompts the user to values for a, b and c
		System.out.print( "Enter a, b, c: " );	
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
	
		// Calculates discriminant
		discriminant = Math.pow( b, 2 ) - 4 * a * c;
		
		// Checks discriminant value, calculates and prints roots
		if( discriminant > 0 )
		{	
			rootOne = ( - b + ( Math.pow( Math.pow( b, 2 ) - 4 * a * c, 0.5 ) ) ) / ( 2 * a );
			rootTwo = ( - b - ( Math.pow( Math.pow( b, 2 ) - 4 * a * c, 0.5 ) ) ) / ( 2 * a );
			System.out.printf ( "The roots are %f and %f", rootOne , rootTwo );
		}
		else if ( discriminant == 0 )			
		{	
			rootOne = ( - b + ( Math.pow( Math.pow( b, 2 ) - 4 * a * c, 0.5 ) ) ) / ( 2 * a );
			System.out.printf ( "The root is %f" , rootOne );
		}
		else
			System.out.println( "The equation has no real roots" );
	}
}