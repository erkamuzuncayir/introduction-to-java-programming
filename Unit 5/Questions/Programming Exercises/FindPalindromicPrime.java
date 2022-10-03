// Unit 5 - Exercise 26

public class FindPalindromicPrime
{
	public static void main( String[] args )
	{
		int count = 0;
		int number = 1;
		
		while( count < 100 )
		{
			number ++;
			boolean isNumberPalindrome = IsPalindrome( number );
			boolean isNumberPrime = IsPrime( number );
			
			if( isNumberPalindrome & isNumberPrime )
			{
				count ++;
				System.out.print( number + "\t" );			
				
				if( count % 10 == 0 )
					System.out.println();
			}
		}
	}
	
	public static boolean IsPalindrome( int number )
	{
		boolean isPalindrome;
		
		int reversedNumber = Reverse( number );
		
		if( reversedNumber != number )
			isPalindrome = false;
		else
			isPalindrome = true;
		
		return isPalindrome;
	}
	
	public static int Reverse( int number )
	{
		final int Divider = 10;
		int reversedNumber = 0;
		int digitCount = 1;

		int temp = number;
		
		// Loop finds how many digit number has
		while ( temp >= 10 )
		{
			temp = temp / Divider;
			digitCount *= 10;
		}
		
		// Loop finds reversed number with using mod operator and multiply them with digit (count) value.
		while ( digitCount > 0 )
		{
			reversedNumber += ( number % Divider ) * digitCount;
			number /= Divider;
			digitCount /= Divider; 
		}
		
		return reversedNumber;
	}
	
	public static boolean IsPrime( int number ) 
	{
		for ( int divisor = 2 ; divisor <= number / 2 ; divisor++ ) 
		{
			if ( number % divisor == 0 ) 
			{	// If true, number is not prime
				return false; // number is not a primes
			}
		}
		
		return true;
	}

}
