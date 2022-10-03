// Unit 5 - Exercise 31

import java.util.Scanner;

public class ValidateCreditCardNumber
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter your credit card number for validation: " );
		long creditCardNumber = input.nextLong();
		boolean isNumberValid = IsValid( creditCardNumber );
		
		if( isNumberValid )
			System.out.printf( "Credit card number %d is valid\n" , creditCardNumber );
		if( !isNumberValid )
			System.out.printf( "Credit card number %d is not valid\n" , creditCardNumber );
	}
	
	public static boolean IsValid( long creditCardNumber )
	{
		int numberSize = GetSize( creditCardNumber ); // Gets card number digit count
		boolean isPrefixValid = PrefixMatched( creditCardNumber , numberSize ); // Finds out is prefix valid or not
		int sumOfDoubleEvenPlace = SumOfDoubleEvenPlace( creditCardNumber ); // Calculate sum of doubled-even digits 
		int sumOfOddPlace = SumOfOddPlace( creditCardNumber ); // Calculate sum of odd digits
		
		if ( numberSize < 13 & numberSize > 16 ) // Determine digit count valid or not
			return false;
		if( !isPrefixValid ) // Determine prefix valid according to boolean value
			return false;
		if( ( sumOfOddPlace + sumOfDoubleEvenPlace ) % 10 == 0 ) // Determine number is Luhn checked
			return true;
		else
			return false;
	}
	
	public static int SumOfDoubleEvenPlace( long creditCardNumber )
	{
		int sumOfDoubleEvenPlace = 0;
		int number = 0;
		while( creditCardNumber > 10 )
		{
			creditCardNumber = creditCardNumber / 10; // Delete digit 
			number = ( int )( creditCardNumber % 10 ) * 2; // Takes digit
			creditCardNumber = creditCardNumber / 10; // Delete digit
			number = GetDigit( number ); // Finds out digit bigger than 10 or not and take it
			sumOfDoubleEvenPlace += number;
		}

		return sumOfDoubleEvenPlace;
	}
	
	// Determine digit is bigger than 10 or didn't. If it so, sums both digit and return it.
	public static int GetDigit( int number )
	{
		if( number < 10 )
			return number;
		else
		{
				int tempNumber = ( int )number % 10;
				number = tempNumber + 1;
				return number;
		}
	}
	
	public static int SumOfOddPlace( long creditCardNumber )
	{
		int sumOfOddPlace = 0;
		int number = 0;
		while( creditCardNumber > 10 )
		{
			number = ( int )( creditCardNumber % 10 ); // Takes digit
			creditCardNumber = creditCardNumber / 100; // Delete digits
			sumOfOddPlace += number;
		}
		return sumOfOddPlace;
	}
	
	public static boolean PrefixMatched( long creditCardNumber , int digitCount )
	{
		int prefix = GetPrefix( creditCardNumber , digitCount );
		if( prefix == 4 || prefix == 5 || prefix == 6 )
			return true;
		else if( prefix == 3 )
		{
			prefix = GetPrefix( creditCardNumber , digitCount - 1 );
			if( prefix == 7 )
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static int GetSize( long d )
	{
		int size = 0;
		while( d > 1 )
		{
			d /= 10;
			size++;
		}
		return size;
	}

	public static int GetPrefix( long creditCardNumber , int digitCount )
	{
		int count = 1;
		long mod = 1;
		
		while( count < digitCount )
		{
			mod *= 10;
			count++;
		}
		int prefix = ( int )( creditCardNumber / mod );

		return prefix;
	}
	
}
