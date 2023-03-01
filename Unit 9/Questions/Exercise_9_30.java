// Unit 9 - Exercise 30

/*
(Financial: credit card number validation) Rewrite Exercise 5.31 using a
string input for credit card number. Redesign the program using the following
method:
/** Return true if the card number is valid 
public static boolean isValid(String cardNumber)
/** Get the result from Step 2 
public static int sumOfDoubleEvenPlace(String cardNumber)
/** Return this number if it is a single digit; otherwise,
* return the sum of the two digits 
public static int getDigit(int number)
 Return sum of odd place digits in number 
public static int sumOfOddPlace(String cardNumber)
*/

import java.util.Scanner;

public class Exercise_9_30
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter your credit card number for validation: " );
		String creditCardNumber = input.nextLine();
		boolean isNumberValid = IsValid( creditCardNumber );
		
		if( isNumberValid )
			System.out.printf( "Credit card number %s is valid\n" , creditCardNumber );
		if( !isNumberValid )
			System.out.printf( "Credit card number %s is not valid\n" , creditCardNumber );
	}
	
	public static boolean IsValid( String creditCardNumber )
	{
		int numberSize = creditCardNumber.length(); // Gets card number digit count
		boolean isPrefixValid = false;
		if( creditCardNumber.charAt( 0 ) == '4' ||
			creditCardNumber.charAt( 0 ) == '5' ||
			creditCardNumber.charAt( 0 ) == '6' ||
			( 	creditCardNumber.charAt( 0 ) == '3' &&
				creditCardNumber.charAt( 1 ) == '7' ) )
			isPrefixValid = true;
			
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
	
	public static int SumOfDoubleEvenPlace( String creditCardNumber )
	{
		int sumOfDoubleEvenPlace = 0;
		
		// Start from second digit due to algorithm
		for( int i = creditCardNumber.length() - 2; i >= 0; i -= 2 )
		{
			int digit = ( creditCardNumber.charAt( i ) - '0' ) * 2;
			if( digit > 9 )
			{
				int digitFirst = digit % 10;
				int digitSecond = digit / 10;
				digit = digitFirst + digitSecond;
			}
			sumOfDoubleEvenPlace += digit;
		}

		return sumOfDoubleEvenPlace;
	}
	
	public static int SumOfOddPlace( String creditCardNumber )
	{
		int sumOfOddPlace = 0;
		
		// Start from first digit due to algorithm
		for( int i = creditCardNumber.length() - 1; i >= 0; i -= 2 )
		{
			int digit = ( creditCardNumber.charAt( i ) - '0' );
			sumOfOddPlace += digit;
		}
		return sumOfOddPlace;
	}
}
