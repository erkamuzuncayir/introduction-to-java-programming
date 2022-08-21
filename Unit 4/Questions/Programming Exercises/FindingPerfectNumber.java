// Unit 4 - Exercise 33

public class FindingPerfectNumber
{
	public static void main ( String[] args )
	{
	
		System.out.print( "Perfect numbers are: " );
		
		// Finds perfect numbers and prints
		for ( int number = 1 ; number < 10000 ; number++)
		{
			int perfect = 0;
			
			for ( int i = 1 ; i <= number / 2 ; i++ )
			{
				if ( number % i == 0 )
					perfect += i; 
			}
			
			// Determines perfect number or not
			if ( perfect == number )
				System.out.printf( "%d " , perfect );	
		}
	}
}
