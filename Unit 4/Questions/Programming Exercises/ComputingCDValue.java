// Unit 4 - Exercise 31 

import java.util.Scanner;

public class ComputingCDValue
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter amount, annual percentage yield, number of months
		System.out.print( "Please enter amount, annual percentage yield, number of months: " );
		double amount = input.nextDouble();
		double annualPercentage = input.nextDouble();
		int numberOfMonths = input.nextInt();
		
		double cdValue = amount;
		
		System.out.println( "Month \t\tCD Value" );
		
		// Computes and displays result
		for ( int i = 0 ; i < numberOfMonths ; i++ )
		{
			cdValue = cdValue + cdValue * annualPercentage / 1200;

			System.out.printf( "%d\t\t%.2f\n" , i + 1 , cdValue ); 
		}
	}
}
