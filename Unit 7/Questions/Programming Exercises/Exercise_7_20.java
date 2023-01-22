// Unit 7 - Exercise 20

import java.util.Scanner;

public class Exercise_7_20 // PlayConnectFour
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		final int Column_Count = 7;
		final int Row_Count = 6;
		char[][] game_board = new char[ Row_Count ][ Column_Count ];
		boolean game_end = false;
		char playerTurn = 'R';

		while( !game_end )
		{	
			boolean isInputCorrect = false;
			while( !isInputCorrect )
			{
				
				System.out.print( playerTurn == 'R' ? "Drop a red disk at column (0-6):" : 
														"Drop a yellow disk at column (0-6):" );
				int[] player_move = { ' ' , ' ' };
				player_move[ 0 ] = input.nextInt();
				player_move[ 1 ] = PlaceDisk( game_board , player_move );
				
				if( player_move[ 1 ] != -1 )
				{
					isInputCorrect = true;
					game_board[ player_move[ 1 ] ][ player_move[ 0 ] ] = playerTurn;
					DrawBoard( game_board );
					playerTurn = playerTurn == 'R' ? 'Y' : 'R';	// Switches player turns		
					char gameStatus = IsConsecutiveFour( game_board );
					switch( gameStatus )
					{
						case 'R':
							{
								System.out.println( "Player Red Won!" );
								game_end = true;
								break;
							}
						case 'Y':
							{
								System.out.println( "Player Yellow Won!" );
								game_end = true;	
								break;
							}
						case 'D':
							{
								System.out.println( "Draw!" );
								game_end = true;	
								break;
							}
					}
				}
				else
					System.out.println( "There is any empty place in that column." );
			}
		}
	}
	
	public static void DrawBoard( char[][] game_board )
	{		
		for( int i = 0; i < game_board.length; i++ )
		{
			for( int j = 0; j < game_board[ 0 ].length; j++ )
			{
				System.out.print("|  ");
				System.out.print( game_board[ i ][ j ] == 0 ? ' ' : game_board[ i ][ j ] );	
				System.out.print("  |");
			}
			System.out.println();
		}
	}
	
	public static char IsConsecutiveFour( char[][] matrix )
	{
		final int Row_Size_Of_Matrix = matrix.length;
		final int Column_Size_Of_Matrix = matrix[ 0 ].length;
		int totalDiskCount = 0;
		// Win Condition
		char whichPlayer = 'N'; // 'N' stands for non-winner
		
		for( int i = 0; i < matrix.length; i++ )
		{			
			// Counts
			int horizontalCount = 0;
			int verticalCount = 0;
			int majorDiagonalCount = 0;
			int subDiagonalCount = 0;
			
			//	Consecutive checks
			char horizontalConsecutive = 'a';
			char verticalConsecutive = 'a';
			char majorDiagonalConsecutive = 'a';
			char subDiagonalConsecutive = 'a';
			
			for( int j = 0; j < matrix[ 0 ].length; j++ )
			{
				// 'D' stands for draw condition
				if( matrix[ i ][ j ] == 'Y' || matrix[ i ][ j ] == 'R' )
					totalDiskCount++;
				
				// For check all places are full or not
				whichPlayer = totalDiskCount == matrix.length * matrix[ 0 ].length ? 'D' : 'N';
				
				// Horizontal Consecutives Check
				char horizontalTraverse = matrix[ i ][ j ];
				if( horizontalConsecutive == horizontalTraverse )
				{
					horizontalCount++;
					if( horizontalCount > 3 )
						whichPlayer = horizontalConsecutive;
				}
				else if( horizontalTraverse == 'Y' || horizontalTraverse == 'R' )
				{
					horizontalConsecutive = horizontalTraverse;
					horizontalCount = 1; // Adds first element
				}
				else
					horizontalCount = 0;
				
				if( j < 6 ) // Due to unsymmetrical matrix structure
				{
					char verticalTraverse = matrix[ j ][ i ];
					// Vertical Consecutives Check
					if( verticalConsecutive == verticalTraverse )
					{
						verticalCount++;
						if( verticalCount > 3 )
							whichPlayer = verticalConsecutive;
					}
					else if( verticalTraverse == 'Y' || verticalTraverse == 'R' )
					{
						verticalConsecutive = verticalTraverse;
						verticalCount = 1; // Adds first element
					}
					else
						verticalCount = 0;
				}
				
				/*	Major diagonal Consecutives Check
				*	i + j - matrix[ 0 ].length / 2 -> This is our major diagonal traverse formula. */
				if( j < 6 && // Due to unsymmetrical matrix structure
					( i + j - matrix[ 0 ].length / 2 ) >= 0 && // This is necessary due to limit of cross check
					( i + j - matrix[ 0 ].length / 2 ) < Column_Size_Of_Matrix ) // This is necessary due to limit of cross check
				{
					char majorDiagonalTraverse = matrix[ j ][ i + j - matrix[ 0 ].length / 2 ];
					if( majorDiagonalConsecutive == majorDiagonalTraverse )
					{
						majorDiagonalCount++;
						if( majorDiagonalCount > 3 )
							whichPlayer = majorDiagonalConsecutive;
					}
					else if( majorDiagonalTraverse == 'Y' || 
								majorDiagonalTraverse == 'R' )
					{
						majorDiagonalConsecutive = majorDiagonalTraverse;
						majorDiagonalCount = 1; // Adds first element
					}
					else
						majorDiagonalCount = 0;
				}

				/*	Sub-diagonal Consecutives Check
				*	matrix[ 0 ].length - 1 - i - j + matrix[ 0 ].length / 2 -> This is our sub diagonal traverse formula. */
				if( j < 6 && // Due to unsymmetrical matrix structure
					( matrix[ 0 ].length - 1 - i - j + matrix[ 0 ].length / 2 ) >= 0 && // This is necessary due to limit of cross check
					( matrix[ 0 ].length - 1 - i - j + matrix[ 0 ].length / 2 ) < Column_Size_Of_Matrix ) // This is necessary due to limit of cross check
				{
					char subDiagonalTraverse = matrix[ j ][ matrix[ 0 ].length - 1 - i - j + matrix[ 0 ].length / 2 ];
					if( subDiagonalConsecutive == subDiagonalTraverse )
					{
						subDiagonalCount++;
						if( subDiagonalCount > 3 )
							whichPlayer = subDiagonalConsecutive;
					}
					else if( subDiagonalTraverse == 'Y' || subDiagonalTraverse == 'R' )
					{
						subDiagonalConsecutive = subDiagonalTraverse;
						subDiagonalCount = 1; // Adds first element
					}
					else
						subDiagonalCount = 0;
				}

				// If there is solution it returns it.
				if( whichPlayer != 'N' )
					return whichPlayer;
			}
		}
		
		return whichPlayer;
	}
	
	public static int PlaceDisk( char[][] game_board , int[] move )
	{
		int column = move[ 0 ];
		int row = 5; // It places disks starts from at the bottom.
		while( row >= 0 )
		{
			if( game_board[ row ][ column ] == 'R' || game_board[ row ][ column ] == 'Y' )
				row--;
			else
				return row;
		}
			
		return -1; 
	} 
}
