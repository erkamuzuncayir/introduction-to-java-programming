// Unit 4 - Exercise 30

import java.util.Scanner;

public class ComputingCompoundValue
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		double compoundValue = 0;
		
		// Prompts user to enter amount, annual interest rate and number of months
		System.out.print( "Please enter amount of money, interest rate and number of months: " );
		double amount = input.nextDouble();
		double interestRate = input.nextDouble();
		int numberOfMonths = input.nextInt();
		
		double monthlyInterestRate = interestRate / 1200;
		
		// Computes compound value
		for ( int i = 0 ; i < numberOfMonths ; i++ )
		{
			compoundValue = ( amount + compoundValue ) * ( 1.0 + monthlyInterestRate );
		}
		
		// Displays result
		System.out.printf( "Compound value is %f at the end of the %d months." , compoundValue , numberOfMonths );
	}
}
