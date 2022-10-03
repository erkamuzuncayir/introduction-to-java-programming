// Unit 5 - Exercise 10

public class FindPrime
{
	public static void main( String[] args )
	{
		for( int i = 2 ; i <= 1000 ; i++ )
		{
			boolean isNumberPrime = IsPrime( i );
			if( isNumberPrime )
				System.out.println( i );
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
