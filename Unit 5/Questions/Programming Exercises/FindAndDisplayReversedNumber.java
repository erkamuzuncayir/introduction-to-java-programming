// Unit 5 - Exercise 4

import java.util.Scanner;

public class FindAndDisplayReversedNumber
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a number: " );
		int number = input.nextInt();

		FindAndDisplayReversedNumber( number );
	}
	
	public static void FindAndDisplayReversedNumber( int number )
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
		
		System.out.println( reversedNumber );
	}
}
