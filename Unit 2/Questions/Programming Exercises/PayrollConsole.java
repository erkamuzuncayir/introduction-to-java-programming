// Unit 2 - Exercise 11A

import java.util.Scanner;

public class PayrollConsole
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter name, work hours, hourly pay rate and tax rates
		System.out.print( "Enter employee's name: " );
		Scanner scannerGetInputOne = new Scanner( System.in );
		var name = scannerGetInputOne.next();
		
		System.out.print( "Enter number of hours worked in a week: " );
		Scanner scannerGetInputTwo = new Scanner( System.in );
		var workHours = scannerGetInputTwo.nextDouble();
		
		System.out.print( "Enter hourly pay rate: " );
		Scanner scannerGetInputThree = new Scanner( System.in );
		var hourlyPayRate = scannerGetInputThree.nextDouble();
		
		System.out.print( "Enter federal tax withholding rate: " );
		Scanner scannerGetInputFour = new Scanner( System.in );
		var fedTaxWithholdingRate = scannerGetInputFour.nextDouble() * 100;
		
		System.out.print( "Enter state tax withholding rate: " );
		Scanner scannerGetInputFive = new Scanner( System.in );
		var stateTaxWithholdingRate = scannerGetInputFive.nextDouble() * 100;
		
		// Calculations for employee
		var grossPay = hourlyPayRate * workHours;
		var federalWithholding = ( grossPay * fedTaxWithholdingRate ) / 100;
		var stateWithholding = ( grossPay * stateTaxWithholdingRate ) / 100;
		var totalDeductions = federalWithholding + stateWithholding;
		var netPay = grossPay - totalDeductions;

		// Display result
		System.out.println( "Employee Name: " + name );
		System.out.println( "Hours Worked: " + workHours );
		System.out.println( "Pay Rate: " + hourlyPayRate );
		System.out.println( "Gross Pay: " + grossPay );
		System.out.println( "Deductions:" );
		System.out.println( "\t Federal Withholding (" + fedTaxWithholdingRate / 100 + "%): $" + federalWithholding );
		System.out.println( "\t State Withholding (" + stateTaxWithholdingRate / 100 + "%): $" + stateWithholding );
		System.out.println( "\t Total Deduction: " + totalDeductions );
		System.out.println( "Net Pay: " + netPay );
	}
}