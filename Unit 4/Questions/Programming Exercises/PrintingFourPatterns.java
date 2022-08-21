// Unit 4 - Exercise 18

public class PrintingFourPatterns
{
	public static void main ( String[] args )
	{
		// Pattern I
		System.out.println( "Pattern I" );
		for ( int i = 1 ; i <= 6 ; i++ )
		{
			for ( int j = 1 ; j <= i ; j++ )
				System.out.print( j );
			for ( int k = 6 - i ; k >= 0 ; k-- )
				System.out.print( " " );
			
			System.out.println();
		}
		
		// Pattern II
		System.out.println( "Pattern II" );
		for ( int i = 6 ; i > 0 ; i-- )
		{
			for ( int j = 1 ; j <= i ; j++ )
				System.out.print( j );
			for ( int k = 6 - i ; k >= 0 ; k-- )
				System.out.print( " " );
			
			System.out.println();
		}
		
		// Pattern III
		System.out.println( "Pattern III" );
		for ( int i = 6 ; i > 0 ; i-- )
		{
			for ( int j = 1 ; j <= i ; j++ )
				System.out.print( " " );
			for ( int k = 7 - i ; k > 0 ; k-- )
				System.out.print( k );
			
			System.out.println();
		}
		
		// Pattern IV
		System.out.println( "Pattern IV" );
		for ( int i = 0 ; i < 6 ; i++ )
		{
			for ( int j = 1 ; j <= i ; j++ )
				System.out.print( " " );
			for ( int k = 1 ; k <= 6 - i ; k++ )
				System.out.print( k );
			
			System.out.println();
		}

	}
}
