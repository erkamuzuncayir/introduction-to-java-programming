// Unit 7 - Exercise 2

import java.util.Scanner;

public class Exercise_7_2 // SumOfMajorDiagonalOfMatrix
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
		
		System.out.printf( "Sum of the elements in the major diagonal is %d\n" ,
							SumMajorDiagonal( input_matrix ) );
		
	}
	
	public static int SumMajorDiagonal( int[][] matrix )
	{
		int sumOfMajorDiagonal = 0;
		
		for( int i = 0; i < matrix.length; i++ )
			sumOfMajorDiagonal += matrix[ i ][ i ];
		
		return sumOfMajorDiagonal;
	}
}
