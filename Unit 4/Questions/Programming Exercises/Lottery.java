// Unit 4 - Exercise 32

import java.util.Scanner;

public class Lottery
{
	public static void main ( String[] args )
	{
		// Creates a Scanner 
		Scanner input = new Scanner ( System.in );
		
		// Generates first lottery number
		int lotteryOne = ( int )( Math.random() * 10 );
		int lotteryTwo = lotteryOne;
		
		// Prompts user to enter two digit
		System.out.print( "Please enter two separate digits for lottery! " );
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		
		// Generates second lottery number
		while ( lotteryOne == lotteryTwo )
		{
			lotteryTwo = ( int )( Math.random() * 10 );
		}
		
		// Displays result
		if ( ( numberOne == lotteryOne ) && ( numberTwo == lotteryTwo ) )
			System.out.println( "Exact match: you win $10,000" );
		else if ( ( numberOne == lotteryTwo ) && ( numberTwo == lotteryOne ) )
			System.out.println( "Match all digits: you win $3,000" );
		else if ( ( numberOne == lotteryOne ) || ( numberOne == lotteryOne )
			|| ( numberTwo == lotteryOne ) || ( numberTwo == lotteryTwo ) )
			System.out.println( "Match one digit: you win $1,000" );
		else
			System.out.println( "Sorry, no match" );		
	}
}
