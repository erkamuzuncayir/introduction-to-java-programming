// Unit 5 - Listing 7

public class PrimeNumberMethod
{
	public static void main( String[] args )
	{
		System.out.println( "The first 50 prime numbers are \n" );
		PrintPrimeNumbers( 50 );
	}
	
	public static void PrintPrimeNumbers( int numberOfPrimes )
	{
		final int Number_Of_Primes_Per_Line = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		
		// Repeatedly find prime numbers
		while( count < numberOfPrimes )
		{
			// Print the prime number and increase the count
			if( IsPrime( number ) )
			{
				count++; // Increase the count 
				
				if( count % Number_Of_Primes_Per_Line == 0 )
				{
					// Print the number and advance to the new line
					System.out.printf( "%-5s\n" , number );
				}
				else
					System.out.printf( "%-5s" , number );
			}
			
			// Check whether the next number is prime
			number++;
		}
	}
	
	// Check whether number is prime
	public static boolean IsPrime( int number )
	{
		for( int divisor = 2 ; divisor <= number / 2 ; divisor++ )
		{
			if( number % divisor == 0 ) // If true, number is not prime
			{
				return false; // number is not a prime
			}
		}
		
		return true; // number is prime
	}
}
