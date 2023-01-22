// Unit 7 - Exercise 23

import java.util.Scanner;

public class Exercise_7_23 // FindInverseOf3x3Matrix
{
	public static void main(String[] args) 
	{
		double[][] matrix = new double[ 3 ][ 3 ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Enter a11, a12, a13, a21, a22, a23, a31, a32, a33:  " );
		for( int i = 0; i < matrix.length ; i++ )
		{
			for( int j = 0; j < matrix[ i ].length ; j++ )
			{
				matrix[ i ][ j ] = input.nextDouble();
			}
		}
		if( FindDeterminant( matrix ) == 0 )
			System.out.println( "null" );
		else
		{
			double[][] inversed_matrix = FindInverse( matrix );
			for( int i = 0; i < inversed_matrix.length ; i++ )
			{
				for( int j = 0; j < inversed_matrix[ i ].length ; j++ )
					System.out.printf( "%.4f " , inversed_matrix[ i ][ j ] );

				System.out.println();		
			}
		}
	}

	public static double[][] FindInverse( double[][] m )
	{		 
		double det = FindDeterminant( m );
		
		// Formula implementation
		double[][] inv_m = {
								{	m[ 1 ][ 1 ] * m[ 2 ][ 2 ] - m[ 1 ][ 2 ] * m[ 2 ][ 1 ] ,
									m[ 0 ][ 2 ] * m[ 2 ][ 1 ] - m[ 0 ][ 1 ] * m[ 2 ][ 2 ] ,
									m[ 0 ][ 1 ] * m[ 1 ][ 2 ] - m[ 0 ][ 2 ] * m[ 1 ][ 1 ]
								},
								{	m[ 1 ][ 2 ] * m[ 2 ][ 0 ] - m[ 1 ][ 0 ] * m[ 2 ][ 2 ] ,
									m[ 0 ][ 0 ] * m[ 2 ][ 2 ] - m[ 0 ][ 2 ] * m[ 2 ][ 0 ] ,
									m[ 0 ][ 2 ] * m[ 1 ][ 0 ] - m[ 0 ][ 0 ] * m[ 1 ][ 2 ]
								},
								{	m[ 1 ][ 0 ] * m[ 2 ][ 1 ] - m[ 1 ][ 1 ] * m[ 2 ][ 0 ] ,
									m[ 0 ][ 1 ] * m[ 2 ][ 0 ] - m[ 0 ][ 0 ] * m[ 2 ][ 1 ] ,
									m[ 0 ][ 0 ] * m[ 1 ][ 1 ] - m[ 0 ][ 1 ] * m[ 1 ][ 0 ]
								}
							};
		// Multiply with det
		for( int i = 0; i < inv_m.length ; i++ )
		{
			for( int j = 0; j < inv_m[ i ].length ; j++ )
			{
				inv_m[ i ][ j ] *= 1.0 / det;
			}
		}
		return inv_m;
	}
	
	public static double FindDeterminant( double[][] m )
	{
			return m[ 0 ][ 0 ] * m[ 1 ][ 1 ] * m[ 2 ][ 2 ] +
					m[ 2 ][ 0 ] * m[ 0 ][ 1 ] * m[ 1 ][ 2 ] +
					m[ 0 ][ 2 ] * m[ 1 ][ 0 ] * m[ 2 ][ 1 ] -
					m[ 0 ][ 2 ] * m[ 1 ][ 1 ] * m[ 2 ][ 0 ] -
					m[ 0 ][ 0 ] * m[ 1 ][ 2 ] * m[ 2 ][ 1 ] -
					m[ 2 ][ 2 ] * m[ 1 ][ 0 ] * m[ 0 ][ 1 ];
	}
}
