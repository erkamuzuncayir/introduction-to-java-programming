// Unit 7 - Exercise 14

import java.util.Scanner;

public class Exercise_7_14 // ExploreMatrix
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter the size for the matrix: " );
		final int Size_Of_Matrix = input.nextInt();
		
		int[][] matrix = new int[ Size_Of_Matrix ][ Size_Of_Matrix ];
		
		for( int i = 0; i < matrix.length; i++ )
		{
			for( int j = 0; j < matrix[ 0 ].length; j++ )
			{
				matrix[ i ][ j ] = ( int )( Math.random() * 2);				
				System.out.print( matrix[ i ][ j ] );
			}
			System.out.println();
		}
		
		// Boolean conditions
		boolean anyHorizontal = false;
		boolean anyVertical = false;
		boolean anyMajorDiagonal = false;
		boolean anySubDiagonal = false;
		
		// Diagonal counts
		int majorDiagonalCount = 0;
		int subDiagonalCount = 0;
		for( int i = 0; i < matrix.length; i++ )
		{
			// Counts
			int horizontalCount = 0;
			int verticalCount = 0;
			for( int j = 0; j < matrix[ 0 ].length; j++ )
			{
				// counts every row and column in inner interval
				horizontalCount += matrix[ i ][ j ];
				verticalCount += matrix[ j ][ i ];
			}
			
			// counts every diagonals in outer interval
			majorDiagonalCount += matrix[ i ][ i ];
			subDiagonalCount += matrix[ matrix.length - 1 - i ][ i ];
			
			//	Checks sum of counts whether 1 or 0.
			if( horizontalCount == 0 || horizontalCount == Size_Of_Matrix )
			{
				anyHorizontal = true;
				System.out.printf( "All %ds on row %d.\n" , 
									horizontalCount / Size_Of_Matrix , i );
			}	
			if( verticalCount == 0 || verticalCount == Size_Of_Matrix )
			{
				anyVertical = true;
				System.out.printf( "All %ds on column %d.\n" , 
									verticalCount / Size_Of_Matrix , i );
			}
		}
		//	Checks sum of diagonal counts whether 1 or 0.
		if( majorDiagonalCount == 0 || majorDiagonalCount == Size_Of_Matrix )
		{
			anyMajorDiagonal = true;
			System.out.printf( "All %ds on major diagonals.\n" , majorDiagonalCount / Size_Of_Matrix );
		}	
		if( subDiagonalCount == 0 || subDiagonalCount == Size_Of_Matrix )
		{
			anySubDiagonal = true;
			System.out.printf( "All %ds on sub-diagonals.\n" , subDiagonalCount / Size_Of_Matrix );
		}
		
		if( !anyHorizontal )
			System.out.println( "No same numbers on a row" );
		if( !anyVertical )
			System.out.println( "No same numbers on a column" );
		if( !anyMajorDiagonal )
			System.out.println( "No same numbers on the major diagonal" );
		if( !anySubDiagonal )
			System.out.println( "No same numbers on the sub-diagonal" );
	}
	
}
