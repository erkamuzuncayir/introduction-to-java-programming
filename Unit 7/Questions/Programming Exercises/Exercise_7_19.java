// Unit 7 - Exercise 19

import java.util.Scanner;

public class Exercise_7_19 // FindConsecutiveFourNumbers
{
	public static void main( String[] args )
	{
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter the size for the matrix: " );
		final int Size_Of_Matrix = input.nextInt();
		int[][] matrix = new int[ Size_Of_Matrix ][ Size_Of_Matrix ];
		
		for( int i = 0; i < matrix.length; i++ )
		{
			System.out.printf( "Enter %d. row of the matrix: " , i + 1 );
			for( int j = 0; j < Size_Of_Matrix ; j++ )
				matrix[ i ][ j ] = input.nextInt();
		}
		
		/*		
		It can be usable for testing
		int Size_Of_Matrix = 8;
		int[][] matrix = new int[ Size_Of_Matrix ][ Size_Of_Matrix ];
		int[] values_of_matrix = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 };
		
		for( int i = 0; i < matrix.length; i++ )
		{
			for( int j = 0; j < matrix[ 0 ].length; j++ )
			{
				int randomIndex = ( int )( Math.random() * Size_Of_Matrix );
				matrix[ i ][ j ] = values_of_matrix[ randomIndex ];				
				System.out.printf( "%d " , matrix[ i ][ j ] );
			}
			System.out.println();
		}
		*/

		// Prints matrix
		for( int i = 0; i < matrix.length; i++ )
		{
			for( int j = 0; j < matrix[ 0 ].length; j++ )
				System.out.printf( "%d " , matrix[ i ][ j ] );

			System.out.println();
		}
		
		System.out.println( IsConsecutiveFour( matrix ) ? "\nTrue" : "\nFalse" );
	}
	
	public static boolean IsConsecutiveFour( int[][] matrix )
	{
		final int Size_Of_Matrix = matrix.length;
		// Boolean conditions
		boolean anyHorizontal = false;
		boolean anyVertical = false;
		boolean anyMajorDiagonal = false;
		boolean anySubDiagonal = false;
		
		for( int i = 0; i < matrix.length; i++ )
		{
			// Counts
			int horizontalCount = 0;
			int verticalCount = 0;
			int majorDiagonalCount = 0;
			int subDiagonalCount = 0;
			
			//	Consecutive checks
			int horizontalConsecutive = 0;
			int verticalConsecutive = 0;
			int majorDiagonalConsecutive = 0;
			int subDiagonalConsecutive = 0;
			
			// Starts number count from this
			for( int j = 0; j < matrix[ 0 ].length; j++ )
			{
				// Horizontal Consecutives Check
				if( !anyHorizontal )
				{
					if( horizontalConsecutive == matrix[ i ][ j ] )
					{
						horizontalCount++;
						if( horizontalCount > 3 )
							anyHorizontal = true;
					}
					else
					{
						horizontalConsecutive = matrix[ i ][ j ];
						horizontalCount = 1;
					}
				}
				// Vertical Consecutives Check
				if( !anyVertical )
				{
					if( verticalConsecutive == matrix[ j ][ i ] )
					{
						verticalCount++;
						if( verticalCount > 3 )
							anyVertical = true;
					}
					else
					{
						verticalConsecutive = matrix[ j ][ i ];
						verticalCount = 1;
					}
				}
				/*	Major diagonal Consecutives  Check
				*	i + j - matrix.length / 2 -> This is our major diagonal traverse formula. */
				if( !anyMajorDiagonal )
				{
					if( ( i + j - matrix.length / 2 ) >= 0 && // This is necessary due to limit of cross check
						( i + j - matrix.length / 2 ) < Size_Of_Matrix ) // This is necessary due to limit of cross check
					{
						if( majorDiagonalConsecutive == matrix[ j ][ i + j - matrix.length / 2 ] )
						{
							majorDiagonalCount++;
							if( majorDiagonalCount > 3 )
								anyMajorDiagonal = true;
						}
						else
						{
							majorDiagonalConsecutive = matrix[ j ][ i + j - matrix.length / 2 ];
							majorDiagonalCount = 1;
						}
					}
				}
				/*	Sub-diagonal Consecutives  Check
				*	matrix.length - 1 - i - j + matrix.length / 2 -> This is our sub diagonal traverse formula. */
				if( !anySubDiagonal )
				{
					if( ( matrix.length - 1 - i - j + matrix.length / 2 ) >= 0 && // This is necessary due to limit of cross check
						( matrix.length - 1 - i - j + matrix.length / 2 ) < Size_Of_Matrix ) // This is necessary due to limit of cross check
					{
						if( subDiagonalConsecutive == matrix[ j ][ matrix.length - 1 - i - j + matrix.length / 2 ] )
						{
							subDiagonalCount++;
							if( subDiagonalCount > 3 )
								anySubDiagonal = true;
						}
						else
						{
							subDiagonalConsecutive = matrix[ j ][ matrix.length - 1 - i - j + matrix.length / 2 ];
							subDiagonalCount = 1;
						}
					}
				}
			}
		}
		
		if( anyHorizontal )
			System.out.println( "\nThere are four consecutive numbers on a row" );
		if( anyVertical )
			System.out.println( "\nThere are four consecutive numbers on a column" );
		if( anyMajorDiagonal )
			System.out.println( "\nThere are four consecutive numbers on the major diagonal" );
		if( anySubDiagonal )
			System.out.println( "\nThere are four consecutive numbers on the sub-diagonal" );

		if( anyHorizontal || anyVertical ||
			anyMajorDiagonal || anySubDiagonal )
			return true;
			
		return false;
	}
}
