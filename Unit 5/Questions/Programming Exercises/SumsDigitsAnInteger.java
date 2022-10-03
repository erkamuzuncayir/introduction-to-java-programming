// Unit 5 - Exercise 2

import java.util.Scanner;

public class SumsDigitsAnInteger
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a number: " );
		int number = input.nextInt();
		
		int sumOfDigits = SumDigits( number );
		
		System.out.printf( "Sum of digits of %d is %d\n" , number , sumOfDigits);
		
	}	

	public static int SumDigits( long n )
	{
		final int Divider = 10;
		int sumOfDigits = 0;
		
		while( n > 1 )
		{
			sumOfDigits += n % Divider; // Takes every digit and sums them
			n = n / 10; // Deletes taken digit
		}
		return sumOfDigits;
	}
}
