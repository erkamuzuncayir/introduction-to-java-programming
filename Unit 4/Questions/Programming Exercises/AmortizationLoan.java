// Unit 4 - Exercise 22

import java.util.Scanner;

public class AmortizationLoan
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts to enter loan amount, number of years and annual interest rate
		System.out.println( "Please enter loan amount, number of years and annual interest rate" );
		double loanAmount = input.nextDouble();
		double numberOfYears = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / 
									( 1 - 1 / Math.pow( 1 + monthlyInterestRate, numberOfYears * 12 ) );
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Displays monthly and total payments
		System.out.printf( "Monthly Payment: %.2f\nTotal Payment: %.2f\n\n" , 
							monthlyPayment , totalPayment );
		
		// Sets balance
		double balance = loanAmount;
	
		// Prints table
		System.out.println( "Payment\t\tInterest\t\tPrincipal\t\tBalance\n" );
		for ( int i = 1 ; i <= ( numberOfYears * 12 ) ; i++ )
		{
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf( "%d\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n" , 
								i , interest , principal , balance );
		}
	}
}
