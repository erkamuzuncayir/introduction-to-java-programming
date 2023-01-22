// Unit 7 - Exercise 1

import java.util.Scanner;

public class Exercise_7_1 // SumOfAllNumbersOfMatrix
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Enter a 4-by-4 matrix row by row:" );

		int[][] input_matrix = new int[ 4 ][ 4 ];		
		for( int i = 0; i < input_matrix.length; i++ )
		{
			for( int j = 0; j < input_matrix.length; j++ )
			{
				input_matrix[ i ][ j ] = input.nextInt();
			}
		}
		
		System.out.printf( "Sum of the matrix is %.2f\n" , SumMatrix( input_matrix ) );
	}
	
	public static double SumMatrix( int[][] matrix )
	{
		double sumOfMatrix = 0;
		for( int i = 0; i < matrix.length; i++ )
		{
			for( int j = 0; j < matrix.length; j++ )
			{
				sumOfMatrix += matrix[ i ][ j ];
			}
		}
		
		return sumOfMatrix;
	}
}
