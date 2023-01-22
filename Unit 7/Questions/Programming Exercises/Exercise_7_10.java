// Unit 7 - Exercise 10

public class Exercise_7_10 // CreateRandomTicTacToe
{
	public static void main( String[] args )
	{
		int[][] game_board = new int[ 3 ][ 3 ];
		
		for( int i = 0; i < game_board.length; i++ )
		{
			for( int j = 0; j < game_board[ 0 ].length; j++ )
			{
				game_board[ i ][ j ] = ( int )( Math.random() * 2);				
				System.out.print( game_board[ i ][ j ] );
			}
			System.out.println();
		}
		
		// Diagonal counts
		int majorDiagonalCount = 0;
		int subDiagonalCount = 0;
		for( int i = 0; i < game_board.length; i++ )
		{
			// Counts
			int horizontalCount = 0;
			int verticalCount = 0;
			for( int j = 0; j < game_board[ 0 ].length; j++ )
			{
				horizontalCount += game_board[ i ][ j ];
				verticalCount += game_board[ j ][ i ];
			}
			
			majorDiagonalCount += game_board[ i ][ i ];
			subDiagonalCount += game_board[ game_board.length - 1 - i ][ i ];
			
			/*	Checks sum of counts whether 1 or 0.
			*	Why: i + 1 -> Because value and array index starts from different numbers.*/
			if( horizontalCount == 0 || horizontalCount == 3 )
				System.out.printf( "All %ds on row %d.\n" , horizontalCount / 3 , i + 1  );
				
			if( verticalCount == 0 || verticalCount == 3 )
				System.out.printf( "All %ds on column %d.\n" , verticalCount / 3 , i + 1  );
		}
		//	Checks diagonal sum of counts whether 1 or 0.
		if( majorDiagonalCount == 0 || majorDiagonalCount == 3 )
			System.out.printf( "All %ds on major diagonals.\n" , majorDiagonalCount / 3 );
			
		if( subDiagonalCount == 0 || subDiagonalCount == 3 )
			System.out.printf( "All %ds on minor diagonals.\n" , subDiagonalCount / 3 );
		
	}
	
}
