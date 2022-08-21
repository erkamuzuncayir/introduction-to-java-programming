// Unit 4 - Exercise 44 

public class MonteCarloSimulation
{
	public static void main ( String[] args )
	{
		int count = 1000000;
		int oddCount = 0;
		
		// Computes Monte Carlo simulation 
		for ( int i = 0 ; i < count ; i++ )
		{
			int sequence = ( int )( ( Math.random() * 10 ) % 8 );
			if ( sequence < 5 )
				oddCount++;
		}
		
		// Displays result
		System.out.printf( "%d times will fall into an odd-numbered region in %d times.\n" , 
							oddCount , count );
	}
}
