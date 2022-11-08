// Unit 7 - Listing 3

import java.util.Scanner;

public class CheckSudokuSolution
{
	public static void main( String[] args )
	{
		// Read a Sudoku solution
		int[][] grid = ReadASolution();
		
		System.out.println( IsValid( grid ) ? "Valid solution" : "Invalid Solution" );
	}
	
	// Read a Sudoku solution from the console
	public static int[][] ReadASolution()
	{
		// Create a Scanner
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter a Sudoku puzzle solution: " );
		int[][] grid = new int[ 9 ][ 9 ];
		for( int i = 0; i < 9; i++ )
			for( int j = 0; j < 9; j++ )
				grid[ i ][ j ] = input.nextInt();
				
		return grid;
	}
	
	// Check whether a solution is valid
	public static boolean IsValid( int[][] grid )
	{
		// Check whether each row has numbers 1 to 9
		for( int i = 0; i < 9; i++ )
			if( !IsOneToNine( grid[ i ] ) ) // If grid[ i ] does not contain 1 to 9
				return false;
				
		// Check whether each column has numbers 1 to 9
		for( int j = 0; j < 9; j++ )
		{
			// Obtain a column in the one-dimensional array
			int[] column = new int[ 9 ];
			for( int i = 0; i < 9; i++)
				column[ i ] = grid[ i ][ j ];
		
			if( !IsOneToNine( column ) ) // If column does not contain 1 to 9
				return false;
		}
	
		// Check whether each 3-by-3 box has numbers 1 to 9
		for( int i = 0; i < 3; i++ )
		{
			for( int j = 0; j < 3; j++ )
			{
				// The starting element in a small 3-by-3 box
				int k = 0;
				int[] list = new int[ 9 ]; // Get all numbers in the box to list
				for( int row = i * 3; row < i * 3 + 3; row++ )
					for( int column = j * 3; column < j * 3 + 3; column++ )
						list[ k++ ] = grid[ row ][ column ];
						
				if( !IsOneToNine( list ) ) // If list does not contain 1 to 9
					return false;
			}
		}
	
		return true; // The fixed cells are valid
	}
	
	// Check whether the one-dimensional array contains 1 to 9
	public static boolean IsOneToNine( int[] list )
	{
		// Make a copy of the array
		int[] temp = new int[ list.length ];
		System.arraycopy( list , 0 , temp , 0 , list.length );
		
		// Sort the array
		java.util.Arrays.sort( temp );
		
		// Check whether the list contains 1 to 9
		for( int i = 0; i < 9; i++ )
			if( temp[ i ] != i + 1 )
				return false;
				
		return true; // The list contains exactly 1 to 9
	}
}
	
	
	
	
	
	
	
	
	
