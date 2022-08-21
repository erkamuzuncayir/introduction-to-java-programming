// Unit 2 - Exercise 13

import java.util.Scanner;

public class CalculatingFIV
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter investment amount, annual interest rate and years
		System.out.print( "Enter investment amount: " );
		Scanner scannerGetInputOne = new Scanner( System.in );
		var investmentAmount = scannerGetInputOne.nextInt();

		System.out.print( "Enter annual interest rate: " );
		Scanner scannerGetInputTwo = new Scanner( System.in );
		var monthlyInterestRate = scannerGetInputTwo.nextDouble() / 1200;

		System.out.print( "Enter number of years: " );
		Scanner scannerGetInputThree = new Scanner( System.in );
		var years = scannerGetInputThree.nextInt();

		// Calculate future investment value
		var futureInvestmentValue = investmentAmount * Math.pow( ( 1.0 + monthlyInterestRate ) , ( years * 12 ) );

		// Display result
		System.out.println( "Accumulated value is: " + ( float ) futureInvestmentValue );
	}
}