// Unit 7 - Exercise 16

import java.util.Arrays;

public class Exercise_7_16 // SortTwoDimensionalArray
{
	public static void main(String[] args) 
	{
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		
		Sort( matrix );
	}
	
	public static void Sort( int m[][] )
	{
		// Sorts second dimensional arrays
		for( int i = 0; i < m.length ; i++ )
		{
			Arrays.sort( m[ i ] );
		}
		
		// Sorts first dimensional arrays
		for( int i = 0; i < m.length - 1; i++ )
		{
			for( int j = i + 1; j < m.length; j++ )
			{
				if( m[ i ][ 0 ] > m[ j ][ 0 ] )
				{
					int[] temp = m[ i ];
					m[ i ] = m[ j ];
					m[ j ] = temp;
				}
				/*	If first dimensions equals, 
				*	it compares inside of theirs and if necessary switches them. */
				else if( m[ i ][ 0 ] == m[ j ][ 0 ] )
				{
					if( m[ i ][ 1 ] > m[ j ][ 1 ] )
					{
						int temp = m[ i ][ 1 ];
						m[ i ][ 1 ] = m[ j ][ 1 ];
						m[ j ][ 1 ] = temp;
					}
				}
			}
		}
		
		for( int i = 0; i < m.length ; i++ )
		{
			for( int j = 0; j < m[ i ].length ; j++ )
				System.out.printf( "%d " , m[ i ][ j ] );
			
			System.out.println();
		}
	}
}
