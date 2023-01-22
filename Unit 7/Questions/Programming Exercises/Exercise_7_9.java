// Unit 7 - Exercise 9

import java.util.Scanner;

public class Exercise_7_9 // PlayTicTacToeGame
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		// Create the game board as a two-dimensional array
		char[][] game_board = new char[ 3 ][ 3 ];
		boolean game_end = false;
		char playerTurn = 'X';
		int remainingPlace = game_board.length * game_board[ 0 ].length;
		while( !game_end )
		{	
			char[] move = GetInput( input );
			if( DoesPlaceAvailable( game_board , move ) )
			{
				playerTurn = playerTurn == 'X' ? 'O':'X';
				game_board[ move[ 0 ] ][ move[ 1 ] ] = playerTurn;
				game_end = DrawBoard( game_board );
				remainingPlace--; // Decrement remaining place for draw state.
				/* !game_end -> Otherwise if last turn somebody win 
				*	it prints both of win statement and draw statement */
				if( remainingPlace <= 0 && !game_end )
				{
					System.out.println( "Draw!" );
					game_end = true;
				}	
			}
			else
			{
				System.out.println( "Place is not available. Please select different place." );
				continue;			
			}
		}
	}
	
	public static boolean DrawBoard( char[][] game_board )
	{		
		boolean playerXWon = false;
		boolean playerOWon = false;
		
		// Player object counts
		for( int i = 0; i < game_board.length; i++ )
		{
			// Players conditions
			int horizontalXCount = 0;
			int horizontalYCount = 0;
			int verticalXCount = 0;
			int verticalYCount = 0;
			int diagonalXCount = 0;
			int diagonalYCount = 0;
			int inverseDiagonalXCount = 0;
			int inverseDiagonalYCount = 0;
			

			System.out.println( "---------------" );
			for( int j = 0; j < game_board[ 0 ].length; j++ )
			{
				// Print section				
				System.out.print("| ");
				System.out.print( game_board[ i ][ j ] );	
				System.out.print(" |");

				// Increment for check
				if( game_board[ i ][ j ] == 'X' )
					horizontalXCount++;
				else if( game_board[ i ][ j ] == 'O' )
					horizontalYCount++;
				if( game_board[ j ][ i ] == 'X' )
					verticalXCount++;
				else if( game_board[ j ][ i ] == 'O' )
					verticalYCount++;							
				if( game_board[ j ][ j ] == 'X' )
					diagonalXCount++;
				else if( game_board[ j ][ j ] == 'O' )
					diagonalYCount++;
				if( game_board[ game_board.length - 1 - j ][ j ] == 'X' )
					inverseDiagonalXCount++;
				else if( game_board[ game_board.length - 1 - j ][ j ] == 'O' )
					inverseDiagonalYCount++;
			}
					
			System.out.println("");
				
			// Check players conditions
			if( horizontalXCount == 3 || verticalXCount == 3 || 
				diagonalXCount == 3 || inverseDiagonalXCount == 3 )
				playerXWon = true;
			else if( horizontalYCount == 3 || verticalYCount == 3 || 
				diagonalYCount == 3 || inverseDiagonalYCount == 3 )
				playerOWon = true; 
		}
		
		// Prints outside from for loop otherwise it interrupts printing of game board
		if( playerXWon )
		{
			System.out.println( "Player X won!" );
			return true;
		}
		else if( playerOWon )
		{
			System.out.println( "Player O won!" );
			return true;
		}	
		
		return false;
	}
	
	public static char[] GetInput( Scanner input )
	{
		char[] move = new char[ 2 ];
		
		System.out.print( "Enter a row (1, 2, or 3) for player X: ");
		move[ 0 ] = ( char )( input.nextInt() - 1 );		
		System.out.print( "Enter a column (1, 2, or 3) for player X: ");
		move[ 1 ] = ( char )( input.nextInt() - 1 );
		
		return move;
	}
	
	public static boolean DoesPlaceAvailable( char[][] game_board , char[] input_move )
	{
		int n1 = input_move[ 0 ];
		int n2 = input_move[ 1 ];
		
		if( game_board[ n1 ][ n2 ] == 'X' || game_board[ n1 ][ n2 ] == 'O' ) 
			return false;
			
		return true; 
	} 
}
