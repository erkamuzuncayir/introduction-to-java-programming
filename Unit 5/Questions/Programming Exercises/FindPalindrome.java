// Unit 5 - Exercise 3

import java.util.Scanner;

public class FindPalindrome
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a number: " );
		int number = input.nextInt();
		
		boolean isNumberPalindrome = IsPalindrome( number );
		
		if( isNumberPalindrome )
			System.out.printf( "%d is a palindrome number\n" , number);			
		else
			System.out.printf( "%d is not a palindrome number\n" , number);			
		
	}
	
	public static boolean IsPalindrome( int number )
	{
		boolean isNumberPalindrome;
		
		int reversedNumber = Reverse( number );
		
		if( reversedNumber != number )
			isNumberPalindrome = false;
		else
			isNumberPalindrome = true;
		
		return isNumberPalindrome;
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
	

}
