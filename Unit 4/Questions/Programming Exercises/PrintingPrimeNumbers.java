// Unit 4 - Exercise 20

public class PrintingPrimeNumbers
{
	public static void main ( String[] args )
	{
		int number = 2;
		int count = 0;
		boolean isPrime = true;
		
		while ( number < 1001 )
		{
			// Finds prime numbers
			for ( int i = 2 ; i < number ; i++ )
			{	
				if ( number % i == 0 )
					isPrime = false;
			}
			
			if ( isPrime )
			{
				System.out.print( number + " " );
				count++;
				isPrime = false;
			}
				
			if ( count >= 8 )
			{	
				System.out.println();
				count = 0;
			}

			number++;
			isPrime = true;
		}
	}
}
