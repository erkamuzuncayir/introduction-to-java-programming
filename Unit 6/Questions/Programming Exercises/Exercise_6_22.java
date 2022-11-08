// Unit 6 - Exercise 22

/*
	Bu siteden sondaki indexlerin duplicate olup olmadığını kontrol edebilirsin.
	https://www.somacon.com/p568.php
*/

import java.util.Arrays;

public class Exercise_6_22 // EightQueensGameAllSolutions
{
	public static void main( String[] args )
	{
		String[] all_solutions_print = new String[ 92 ];
		long[] all_solutions_compare = new long[ 92 ];
		int solutionCount = 0;

		while( solutionCount < 92 )
		{

			int[] solutionArray = FindSolution();
			long solutionComparable = MakeSolutionComparable( solutionArray );
			if( !IsSolutionDuplicate( all_solutions_compare , solutionComparable ) )
			{
				all_solutions_compare[ solutionCount ] = solutionComparable;
				all_solutions_print[ solutionCount ] = MakeSolutionText( solutionArray );
				solutionCount++;

				// Prints chessboard
				char[] chessboard = new char[ 64 ];
				Arrays.fill( chessboard , 'X' );
				System.out.printf("Solution count: %d\n" , solutionCount );
				for( int i = 0 ; i < solutionArray.length ; i++ )
				{
					chessboard[ solutionArray[ i ] ] = 'Q';
				}
				for( int i = 0 ; i < chessboard.length ; i++ )
				{
					System.out.print( chessboard[ i ] );
					if( ( i + 1 ) % 8 == 0 )
						System.out.println();
						
				}
				System.out.println();
			}
		}
		
		System.out.println( "Queen's Indexes for Every Solutions" );
		for( String solution : all_solutions_print )
			System.out.println( solution );
	}
	
	public static boolean IsSolutionDuplicate( long[] all_solutions_compare , long solution )
	{
		for( int i = 0 ; i < all_solutions_compare.length ; i++ )
		{
			if( all_solutions_compare[ i ] == solution )
				return true;
		}
		
		return false;
	}
	
	public static int[] FindSolution()
	{	
		int[] placed_queens = new int[ 8 ];
		final int Per_Line_Square_Count = 8;
		final char Queen_Symbol = 'Q';
		int queenCount = 0;
		int nextQueen = 0;
		boolean wrongPlace = true;
		
		while( queenCount < 8 )
		{
			wrongPlace = true;
			int tryCount = 0;
			
			while( wrongPlace )
			{
				// Creates a place randomly one after another for every row 
				nextQueen = ( queenCount * Per_Line_Square_Count ) + ( int )( Math.random() * Per_Line_Square_Count );
				
				// Counts tries
				tryCount++;
				
				// Checks column and diagonal intersection
				if( ColumnCheck( placed_queens , nextQueen , queenCount ) && 
					DiagonalCheck( placed_queens , nextQueen , queenCount ) ) 
				{
					wrongPlace = false;
					placed_queens[ queenCount ] = nextQueen;
					queenCount++;
				}
				
				/*
					If loop try that much, this means our solution stuck.
					We have to reset loop to find solution.
				*/
				if( tryCount > 20000 )
				{
					// Fills array with -1, because of prevent missing solutions bound to index 0.
					Arrays.fill( placed_queens , -1 ); 
					wrongPlace = false;
					queenCount = 0;
				}
			}
		}
		
		return placed_queens;
	}

	public static String MakeSolutionText( int[] placed_queens )
	{
		String solutionText = " ";
		for( int i = 0 ; i < placed_queens.length ; i++ )
			solutionText = solutionText + placed_queens[ i ] + " ";

		 return solutionText;
	}
	
	public static long MakeSolutionComparable( int[] placed_queens )
	{
		String solutionText = "";
		for( int i = 0 ; i < placed_queens.length ; i++ )
			solutionText = placed_queens[ i ] + solutionText;

		 return Long.parseLong( solutionText );
	}
	public static boolean DiagonalCheck( int[] placed_queens , int nextQueen , int queenCount )
	{
		for( int i = 0 ; i < queenCount ; i++ )
		{
			if( ( placed_queens[ i ] + ( ( queenCount - i ) * 9) == nextQueen ) || 
				( placed_queens[ i ] + ( ( queenCount - i ) * 7 ) == nextQueen ) )
			return false;
		}
		
		return true;
	}
	
	public static boolean ColumnCheck( int[] placed_queens , int nextQueen , int queenCount )
	{
		for( int i = 0 ; i < placed_queens.length ; i++ )
		{
			if( ( placed_queens[ i ] + ( ( queenCount - i ) * 8 ) == nextQueen ) )
			return false;
		}
		return true;
	}
}
