// Unit 5 - Exercise 30

public class FindTwinPrimes
{
	public static void main( String[] args )
	{
		for( int i = 2 ; i < 1000 ; i++ )
		{
			FindTwinPrimes( i );
		}
	}
	
	public static void FindTwinPrimes( int number )
	{
		boolean isNumberPrime = IsPrime( number );
		
		if( isNumberPrime )
		{
			int twinValue = number + 2;
			boolean isTwinPrime = IsPrime( twinValue );
			
			if( isTwinPrime )
				System.out.printf( "(%d, %d)\n" , number , twinValue );
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
