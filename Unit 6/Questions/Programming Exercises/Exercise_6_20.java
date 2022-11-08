// Unit 6 - Exercise 20

import java.util.Arrays;

public class Exercise_6_20 // EightQueensGame
{
	public static void main( String[] args )
	{
		final int ChessboardSquareSize = 64;
		final int Per_Line_Square_Count = 8;
		final char Queen_Symbol = 'Q';
		char[] chessboard = new char[ ChessboardSquareSize ];
		Arrays.fill( chessboard , 'X' );
		int[] placedQueens = new int[ 8 ];
		int queenCount = 0;
		boolean wrongPlace = true;
		int nextQueen = 0;
		
		while( queenCount < 8 )
		{	
			wrongPlace = true;
			int tryCount = 0;
			while( wrongPlace )
			{
				// Why: Creates a place randomly one after another for every row 
				nextQueen = ( queenCount * Per_Line_Square_Count ) + ( int )( Math.random() * Per_Line_Square_Count );
				tryCount++;
				if( ColumnCheck( placedQueens , nextQueen , queenCount ) && 
					DiagonalCheck( placedQueens , nextQueen , queenCount ) ) 
				{
					wrongPlace = false;
					chessboard[ nextQueen ] = Queen_Symbol;
					placedQueens[ queenCount ] = nextQueen;
					queenCount++;
				}
				
				/*
				*	Info: If loop try that much, this means our solution stuck.
				*	We have to reset loop to find solution.
				*/	
				if( tryCount > 2000 )
				{
					Arrays.fill( placedQueens , 0 );
					Arrays.fill( chessboard , 'X' );
					wrongPlace = false;
					queenCount = 0;
				}
			}
		}
		
		// Prints chessboard
		for( int i = 0 ; i < chessboard.length ; i++ )
		{
			System.out.print( chessboard[ i ] );
			if( ( i + 1 ) % Per_Line_Square_Count == 0 )
				System.out.println();
		}
	}
	
	public static boolean DiagonalCheck( int[] placedQueens , int nextQueen , int queenCount )
	{
		for( int i = 0 ; i < queenCount ; i++ )
		{
			if( ( placedQueens[ i ] + ( ( queenCount - i ) * 9 ) == nextQueen ) || 
				( placedQueens[ i ] + ( ( queenCount - i ) * 7 ) == nextQueen ) )
			return false;
		}
		
		return true;
	}
	
	public static boolean ColumnCheck( int[] placedQueens , int nextQueen , int queenCount )
	{
		for( int i = 0 ; i < placedQueens.length ; i++ )
		{
			if( ( placedQueens[ i ] + ( ( queenCount - i ) * 8 ) == nextQueen ) )
			return false;
		}
		return true;
	}
}
