// Unit 5 - Exercise 28

public class FindMersennePrimeNumbers
{
	public static void main( String[] args )
	{
		System.out.println( "p\t2^p - 1" );
		for( int i = 2 ; i < 32 ; i++ )
		{
			FindMersennePrime( i );
		} 
	}

	public static void FindMersennePrime( int number )
	{
		boolean isNumberPrime = IsPrime( number );
		
		if( isNumberPrime )
		{
			int mersenneValue = ( int )Math.pow( 2 , number ) - 1;
			boolean isMersennePrime = IsPrime( mersenneValue );

			if( isMersennePrime )
				System.out.printf( "%d\t%d\n" , number , mersenneValue );
		}
	}
	
	public static boolean IsPrime( int number ) 
	{
		for ( int divisor = 2 ; divisor <= number / 2 ; divisor++ ) 
		{
			if ( number % divisor == 0 ) 
			{	// If true, number is not prime
				return false; // number is not a prime
			}
		}
		
		return true;
	}
}
