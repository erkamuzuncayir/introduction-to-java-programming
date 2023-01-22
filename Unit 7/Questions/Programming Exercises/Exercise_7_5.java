// Unit 7 - Exercise 5

import java.util.Scanner;

public class Exercise_7_5 // SumOfTwoMatrices
{
	public static void main( String[] args )
	{
		int firstMatrixDimensionSize;
		int secondMatrixDimensionSize;
		
		Scanner input = new Scanner( System.in );
		double[][] matrix_one = new double[ 3 ][ 3 ];
		double[][] matrix_two = new double[ 3 ][ 3 ];
	
		// Checks if dimensions of matrices are the same or not
		do
		{
			System.out.println( "Enter dimension of first matrix: " );
			firstMatrixDimensionSize = input.nextInt();
			
			System.out.println( "Enter dimension of second matrix: " );
			secondMatrixDimensionSize = input.nextInt();
			
			if( firstMatrixDimensionSize != secondMatrixDimensionSize )
				System.out.println( "Two matrices' dimensions are not the same. " );
		} while( firstMatrixDimensionSize != secondMatrixDimensionSize );
		
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

		double[][] sum_of_matrices = SumMatrices( matrix_one , matrix_two );
	
		System.out.println("The matrices are added as follows ");
		for( int i = 0; i < sum_of_matrices.length; i++ )
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

			for( int j = 0; j < sum_of_matrices[ i ].length; j++ )
				System.out.printf( "%.1f\t" , sum_of_matrices[ i ][ j ] );
			
			System.out.println();
		}
	}
	
	public static double[][] SumMatrices( double[][] first_matrix , double[][] second_matrix )
	{		
		double[][] sum_of_matrices = new double[ first_matrix.length ][ first_matrix[ 0 ].length ];
		for( int i = 0; i < first_matrix.length; i++ )
		{
			for( int j = 0; j < first_matrix[ i ].length; j++ )
			{
				sum_of_matrices[ i ][ j ] = first_matrix[ i ][ j ] + second_matrix[ i ][ j ];
			}
		}
		
		return sum_of_matrices;
	}
}
