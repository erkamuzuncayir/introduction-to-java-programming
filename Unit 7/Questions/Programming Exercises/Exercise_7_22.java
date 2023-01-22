// Unit 7 - Exercise_7_22

import java.util.Scanner;

public class Exercise_7_22 // FindInverseOf2x2Matrix
{
	public static void main(String[] args) 
	{
		double[][] matrix = new double[ 2 ][ 2 ];
		double[][] inversed_matrix = new double[ 2 ][ 2 ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Enter a, b, c, d: " );
		for( int i = 0; i < matrix.length ; i++ )
		{
			for( int j = 0; j < matrix[ i ].length ; j++ )
			{
				matrix[ i ][ j ] = input.nextDouble();
			}
		}
		
		// It checks null
		if( matrix[ 0 ][ 0 ] * matrix[ 1 ][ 1 ] - matrix[ 0 ][ 1 ] * matrix[ 1 ][ 0 ] == 0 )
			System.out.println( "null" );
		else
		{
			inversed_matrix = FindInverse( matrix );			
			for( int i = 0; i < inversed_matrix.length ; i++ )
			{
				for( int j = 0; j < inversed_matrix[ i ].length ; j++ )
					System.out.printf( "%.2f " , inversed_matrix[ i ][ j ] );
			
				System.out.println();
			}
		}
	}
	
	public static double[][] FindInverse( double[][] matrix )
	{
		double det = 1 / ( matrix[ 0 ][ 0 ] * matrix[ 1 ][ 1 ] - 
								matrix[ 0 ][ 1 ] * matrix[ 1 ][ 0 ] );		
		
		double tempOne = matrix[ 0 ][ 0 ];
		matrix[ 0 ][ 0 ] = matrix[ 1 ][ 1 ];
		matrix[ 1 ][ 1 ] = tempOne;
		
		matrix[ 0 ][ 1 ] *= -1;
		matrix[ 1 ][ 0 ] *= -1;
		 
		for( int i = 0; i < matrix.length ; i++ )
		{
			for( int j = 0; j < matrix[ i ].length ; j++ )
			{
				matrix[ i ][ j ] *= det;
			}
		}
		
		return matrix;
	}
}
