// Unit 3 - Exercise 7

import java.util.Scanner;

public class ComputingChange 
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Prompts the user to enter amount
		System.out.print( "Enter an amount in double, for example 11.56: " );
		double amount = input.nextDouble();
		
		int remainingAmount = ( int )( amount * 100 );
		
		// Finds the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Finds the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Finds the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
	
		// Finds the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Finds the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Displays results
		System.out.printf( "Your amount %.2f consists of \n", amount );
		
		if( numberOfOneDollars == 1 )
			System.out.printf( "%d dollar\n", numberOfOneDollars );
		else if ( numberOfOneDollars > 1 )
			System.out.printf( "%d dollars\n", numberOfOneDollars );

		if( numberOfQuarters == 1 )
			System.out.printf( "%d quarter\n", numberOfQuarters );
		else if( numberOfQuarters > 1 )
			System.out.printf( "%d quarters\n", numberOfQuarters );

		if( numberOfDimes == 1 )
			System.out.printf( "%d dime\n", numberOfDimes );
		else if( numberOfDimes > 1 )
			System.out.printf( "%d dimes\n", numberOfDimes );

		if( numberOfNickels == 1 )
			System.out.printf( "%d nickel\n", numberOfNickels );
		else if( numberOfNickels > 1 )
			System.out.printf( "%d nickels\n", numberOfNickels );

		if( numberOfPennies == 1 )
			System.out.printf( "%d penny\n", numberOfPennies );
		else if( numberOfPennies > 1 )
			System.out.printf( "%d pennies\n", numberOfPennies );		
	}
}