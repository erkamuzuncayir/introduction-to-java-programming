// Unit 7 - Exercise 21

// SOLUTION DIDN'T COMPLETE.

import java.util.Scanner;

public class Exercise_7_21 // FindMultipleSudokuSolutions
{
	public static void main(String[] args) 
	{
		// Create a Scanner
		Scanner input = new Scanner( System.in );
		// Read a Sudoku puzzle
		int[][] grid = new int[ 9 ][ 9 ];
		System.out.println( "Enter a Sudoku puzzle:" );
		for ( int i = 0; i < 9; i++ ) 
		  for ( int j = 0; j < 9; j++ )
			grid[ i ][ j ] = input.nextInt();
		
		if ( IsEmptyGridValid( grid ) )
		  System.out.println( "Invalid input" );
		else if ( Search( grid ) ) 
		{
		  System.out.println( "The solution is found:" );
		  PrintGrid( grid );
		}   
		else
		  System.out.println( "No solution" );
	}
	/*
	/** Obtain a list of free cells from the puzzle 
	public static int[][] GetFreeCellList( int[][] grid ) 
	{
		// Determine the number of free cells 
		int numberOfFreeCells = 0;   
		for ( int i = 0; i < 9; i++ )
		  for ( int j = 0; j < 9; j++ ) 
			if ( grid[ i ][ j ] == 0 ) 
			  numberOfFreeCells++;

		// Store free cell positions into freeCellList 
		int[][] freeCellList = new int[ numberOfFreeCells ][ 2 ];
		int count = 0;
		for ( int i = 0; i < 9; i++ )
		  for ( int j = 0; j < 9; j++ ) 
			if ( grid[ i ][ j ] == 0 ) 
			{
			  freeCellList[ count ][ 0 ] = i;
			  freeCellList[ count++ ][ 1 ] = j;
			}

		return freeCellList;
		}
	*/
	/** Print the values in the grid */
	public static void PrintGrid( int[][] grid ) 
	{
		for ( int i = 0; i < 9; i++ ) 
		{
		  for ( int j = 0; j < 9; j++ )
			System.out.print( grid[ i ][ j ] + " " );

		  System.out.println();
		}
	}

	/** Search for a solution */
	public static boolean Search( int[][] grid ) 
	{
		boolean solutionFound = false;

		while( !solutionFound )
		{  	
		  	int[][] solutionGrid = new int[ grid.length ][ grid.length ];
			for( int i = 0; i < solutionGrid.length ; i++ )
			{
				for( int j = 0; j < solutionGrid[ i ].length; j++ )
					solutionGrid[ i ][ j ] = grid[ i ][ j ];
			}


			for( int i = 0; i < solutionGrid.length ; i++ )
			{
				for( int j = 0; j < solutionGrid[ 0 ].length ; j++ )
				{
					if( solutionGrid[ i ][ j ] == 0 )
					{
						boolean isNumberValid = false;
						int tryCount = 0;
						while( !isNumberValid )
						{
							tryCount++;
							solutionGrid[ i ][ j ] = ( int )( Math.random() * solutionGrid.length ) + 1;
							isNumberValid = IsValid( i , j , solutionGrid );
							if( !isNumberValid )
								solutionGrid[ i ][ j ] = 0;

							if( tryCount > 200 )
							{
							/*	Solution is stucked and it have to restart solution loop, 
							*	Therefore it make condition to true to go back to first loop */
								isNumberValid = true; 
								tryCount = 0;
							}
						}
					}
				}
			}
			for( int i = 0; i < solutionGrid.length ; i++ )
			{
				for( int j = 0; j < solutionGrid.length ; j++ )
				{
	System.out.printf( "%d " , solutionGrid[ i ][ j ]);
				}
				System.out.println();
				
				
			}
			if( IsValid( solutionGrid ) )
			{
				solutionFound = true;
				grid = solutionGrid;
			}
			
		}

		return true;

	}

	/** Check whether grid[i][j] is valid in the grid */
	public static boolean IsValid( int i, int j, int[][] grid ) 
	{
		// Check whether grid[i][j] is valid at the i's row
		for ( int column = 0; column < 9; column++ )
		  if ( column != j && grid[ i ][ column ] == grid[ i ][ j ] )
			return false;

		// Check whether grid[i][j] is valid at the j's column
		for ( int row = 0; row < 9; row++ )
		  if ( row != i && grid[ row ][ j ] == grid[ i ][ j ] )
			return false;

		// Check whether grid[i][j] is valid in the 3 by 3 box
		for ( int row = ( i / 3 ) * 3; row < ( i / 3 ) * 3 + 3; row++ )
		  for ( int col = ( j / 3 ) * 3; col < ( j / 3 ) * 3 + 3; col++ )
			if ( !( row == i && col == j ) && grid[ row ][ col ] == grid[ i ][ j ] )
			  return false;

		return true; // The current value at grid[i][j] is valid
	}

	/** Check whether a solution is valid */
	public static boolean IsValid( int[][] grid ) 
	{
		for ( int i = 0; i < 9; i++ )
		  for ( int j = 0; j < 9; j++ )
			if ( grid[ i ][ j ] < 1 || grid[ i ][ j ] > 9 
				|| !IsValid( i, j, grid ) )
			  return false;
			  
		return true; // The solution is valid
	}
	/** Check whether the fixed cells are valid in the grid */
	public static boolean IsEmptyGridValid( int[][] grid ) 
	{
		for ( int i = 0; i < 9; i++ )
		for ( int j = 0; j < 9; j++ )
		if ( grid[ i ][ j ] < 0 || grid[ i ][ j ] > 9 ||
		   ( grid[ i ][ j ] != 0 && IsValid( i, j, grid ) ) ) 
		  return false;

		return true; // The fixed cells are valid
	}
}
