// Unit 4 - Exercise 40

public class HeadOrTail
{
	public static void main ( String[] args )
	{
		final int Head = 0;
		
		int headCount = 0;
		int tailCount = 0;
		
		// Counts heads and tails
		for ( int i = 0 ; i < 1000000 ; i++ )
		{
			int result = ( int ) ( ( Math.random() * 10 ) % 2 );
			
			if ( result == Head )
				headCount++;
			else
				tailCount++;
		}
		
		// Displays result
		System.out.printf( "Head count is %d and tail count is %d\n" , 
							headCount , tailCount );
	}
}
