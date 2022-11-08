// Unit 6 - Exercise 25

import java.util.Scanner;

public class Exercise_6_25 // SolveQuadraticEquations
{
	public static void main( String[] args )
	{
		final int Equation_Array_Size = 3;
		final int Roots_Array_Size= 2;
		double[] eqn_cofs = new double[ Equation_Array_Size ];
		double[] roots = new double[ Roots_Array_Size ];
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter a, b and c (Values should fit this form: ax^2 + bx + c) : " );
		for( int i = 0 ; i < eqn_cofs.length ; i++ )
			eqn_cofs[ i ] = input.nextDouble();
		
		int rootCount = SolveQuadraticEquation( eqn_cofs , roots );
		
		System.out.printf( "Root count is %d\n" , rootCount );
	}
	
	public static int SolveQuadraticEquation( double[] eqn_cofs , double[] roots )
	{
		int rootCount = 0;
		double discriminant = Math.pow( eqn_cofs[ 1 ] , 2 ) - 4 * 
								eqn_cofs[ 0 ] * eqn_cofs[ 2 ];
	
		if( discriminant > 0 )
		{	
			double rootOne = ( - eqn_cofs[ 1 ] + ( Math.pow( Math.pow( eqn_cofs[ 1 ] , 2 )
								- 4 * eqn_cofs[ 0 ] * eqn_cofs[ 2 ] , 0.5 ) ) ) / ( 2 * eqn_cofs[ 0 ] );
			double rootTwo = ( - eqn_cofs[ 1 ] - ( Math.pow( Math.pow( eqn_cofs[ 1 ] , 2 ) 
								- 4 * eqn_cofs[ 0 ]  * eqn_cofs[ 2 ] , 0.5 ) ) ) / ( 2 * eqn_cofs[ 0 ]  );
			roots[ 0 ] = rootOne;
			roots[ 1 ] = rootTwo;
			System.out.printf ( "The roots are %.2f and %.2f\n", rootOne , rootTwo );
		}
		else if ( discriminant == 0 )			
		{	
			double rootOne = ( - eqn_cofs[ 1 ] + ( Math.pow( Math.pow( eqn_cofs[ 1 ] , 2 ) 
								- 4 * eqn_cofs[ 0 ] * eqn_cofs[ 2 ] , 0.5 ) ) ) / ( 2 * eqn_cofs[ 0 ] );
			roots[ 0 ] = rootOne;
			System.out.printf ( "The root is %.2f\n" , rootOne );
		}

		
		for( double root: roots )
		{
			if( root != 0 )
				rootCount++;
		}
		
		return rootCount;
	}
	
}
