// Unit 7 - Exercise 6

import java.util.Scanner;

public class Exercise_7_6 // ProductOfTwoMatrices
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		double[][] matrix_one = new double[ 3 ][ 3 ];
		double[][] matrix_two = new double[ 3 ][ 3 ];
	
		System.out.println( "Please enter first matrix: " );
		for( int i = 0; i < matrix_one.length; i++ )
		{
			for( int j = 0; j < matrix_one[ i ].length; j++ )
				matrix_one[ i ][ j ] = input.nextDouble();
		}
		
		System.out.println( "Please enter second matrix: " );
		for( int i = 0; i < matrix_two.length; i++ )
		{
			for( int j = 0; j < matrix_two[ i ].length; j++ )
				matrix_two[ i ][ j ] = input.nextDouble();
		}

		double[][] product_of_matrices = MultiplyMatrices( matrix_one , matrix_two );
	
		System.out.println("The matrices are added as follows ");
		for( int i = 0; i < product_of_matrices.length; i++ )
		{
			for( int j = 0; j < matrix_one[ i ].length; j++ )
				System.out.printf( "%.1f\t" , matrix_one[ i ][ j ] );
			
			// For plus sign
			if( i == 1 )
				System.out.print("+\t");
			else
				System.out.print("\t");	
				
			for( int j = 0; j < matrix_two[ i ].length; j++ )
				System.out.printf( "%.1f\t" , matrix_two[ i ][ j ] );

			// For equal sign
			if( i == 1 )
				System.out.print("=\t");
			else
				System.out.print("\t");

			for( int j = 0; j < product_of_matrices[ i ].length; j++ )
				System.out.printf( "%.1f\t" , product_of_matrices[ i ][ j ] );
			
			System.out.println();
		}
	}
	
	public static double[][] MultiplyMatrices( double[][] first_matrix , double[][] second_matrix )
	{		
		double[][] product_of_matrices = new double[ first_matrix.length ][ first_matrix[ 0 ].length ];
		for( int i = 0; i < first_matrix.length; i++ )
		{
			for( int j = 0; j < first_matrix[ i ].length; j++ )
			{
				double temp = 0;
				for( int k = 0; k < first_matrix[ j ].length; k++ )
				{
					temp += first_matrix[ i ][ k ] * second_matrix[ k ][ j ];
					product_of_matrices[ i ][ j ] = temp;
				}
			}
		}
		
		return product_of_matrices;
	}
}
