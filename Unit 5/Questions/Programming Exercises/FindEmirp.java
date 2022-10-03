// Unit 5 - Exercise 27

public class FindEmirp
{
	public static void main( String[] args )
	{
		int count = 0;
		int number = 0;
		
		while( count < 100 )
		{
			number ++;
			int reversedNumber = Reverse( number );
			boolean isNumberPrime = IsPrime( number );
			boolean isReversedNumberPrime = IsPrime( reversedNumber );
			
			boolean isPalindrome = IsPalindrome( number );
			
			if( !isPalindrome & isNumberPrime & isReversedNumberPrime )
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
		
		// Loop finds digit count of number
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
				return false; // number is not a prime
			}
		}
		
		return true;
	}

}
