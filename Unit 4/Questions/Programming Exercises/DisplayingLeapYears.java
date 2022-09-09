// Unit 4 - Exercise 27

public class DisplayingLeapYears
{
	public static void main ( String[] args )
	{
		int checker = 0;
		
		// Calculate leap years
		for ( int i = 2001 ; i < 2100 ; i++ )
		{
			if ( i % 4 == 0 )
			{
				System.out.print( i + " ");
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
