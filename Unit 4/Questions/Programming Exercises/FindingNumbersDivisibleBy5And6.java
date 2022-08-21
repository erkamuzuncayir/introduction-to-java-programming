// Unit 4 - Exercise 10

public class FindingNumbersDivisibleBy5And6
{
	public static void main ( String[] args )
	{
	// Creates checker
	int checker = 0;
	
		// Finds numbers and prints
		for( int i = 100 ; i < 1001 ; i++ )
		{
			if ( ( i % 5 == 0 ) && ( i % 6 == 0 ) )
			{
				System.out.printf( "%d " , i );
				checker++;
			}
			if ( checker == 10 )
				{
					System.out.println();
					checker = 0;
				}
		}
	}
}
