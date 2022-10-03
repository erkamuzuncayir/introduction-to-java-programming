// Unit 5 - Exercise 7

import java.util.Scanner;

public class ComputeFIV
{	
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter investment amount: " );
		double investmentAmount = input.nextDouble();
		System.out.println( "Please enter annual interest rate: " );
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200; // Converts annual interest rate to monthly interest rate
		
		
		System.out.printf( "\nThe amount invested: %.2f\n" , investmentAmount );
		System.out.printf( "Annual interest rate: %.2f%%\n" , annualInterestRate );
		System.out.println( "Years\tFuture Value" );
		for( int i = 1 ; i < 31 ; i++ )
		{
			double futureValue = GetFutureInvestmentValue( investmentAmount , monthlyInterestRate , i );
			System.out.printf( "%d\t%.2f" , i , futureValue );
			System.out.println();
		}
	}
	
	public static double GetFutureInvestmentValue( double investmentAmount , double monthlyInterestRate , int years )
	{
		double futureValue = investmentAmount * Math.pow( ( 1.0 + monthlyInterestRate ) , ( years * 12 ) );
		
		return futureValue;
	}
}
