// Unit 4 - Exercise 21

import java.util.Scanner;

public class ComparingLoansWithInterestRates
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );

		// Prompts user to enter loan amount and number of years
		System.out.println( "Please enter loan amount and number of years: " );
		int loanAmount = input.nextInt();
		int numberOfYears = input.nextInt();
		
		// Computes rates and payments and prints them
		System.out.println( "Interest Rate\t\tMonthly Payment\tTotal Payment" );
		for ( double i = 5 ; i <= 8 ; i += 0.125 )
		{
			double monthlyInterestRate = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / 
									( 1 - 1 / Math.pow( 1 + monthlyInterestRate, numberOfYears * 12 ) );
			double totalPayment = monthlyPayment * numberOfYears * 12;
	
			System.out.printf( "%.3f%% \t\t\t%.2f\t\t%.2f\n" , 
								i , monthlyPayment , totalPayment );
		}
	}
}
