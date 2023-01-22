// Unit 7 - Exercise 18

public class Exercise_7_18 // ShuffleMatrix
{
	public static void main(String[] args) 
	{
		int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		Shuffle( matrix );
	}
	
	public static void Shuffle( int m[][] )
	{
		// Row shuffle	
		for( int i = 0; i < m.length ; i++ )
		{
			int randomIndex = ( int )( Math.random() * m.length );
			if( i != randomIndex )
			{
				int[] temp = m[ i ];
				m[ i ] = m[ randomIndex ];
				m[ randomIndex ] = temp;
			}
		}
		
		// Print shuffled matrix
		for( int i = 0; i < m.length ; i++ )
		{
			for( int j = 0; j < m[ i ].length ; j++ )
			{
				System.out.printf( "%d " , m[ i ][ j ] );
			}
			System.out.print("\t");
		}
	}
}
