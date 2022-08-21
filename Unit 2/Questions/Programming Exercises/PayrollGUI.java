// Unit 2 - Exercise 11B

import javax.swing.JOptionPane;

public class PayrollGUI
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter name, work hours, hourly pay rate and tax rates
		String employeeName = JOptionPane.showInputDialog( null , "Enter employee's name:" ,  "Enter an input" , JOptionPane.QUESTION_MESSAGE );

		String workHoursInput = JOptionPane.showInputDialog( null , "Enter number of hours worked in a week:" ,  "Enter an input" , JOptionPane.QUESTION_MESSAGE );
		var workHours = Double.parseDouble( workHoursInput );
		
		String hourlyPayRateInput = JOptionPane.showInputDialog( null , "Enter hourly pay rate:" ,  "Enter an input" , JOptionPane.QUESTION_MESSAGE );
		var hourlyPayRate = Double.parseDouble( hourlyPayRateInput );
		
		String fedTaxWithholdingRateInput = JOptionPane.showInputDialog( null , "Enter federal tax withholding rate:" ,  "Enter an input" , JOptionPane.QUESTION_MESSAGE );
		var fedTaxWithholdingRate = Double.parseDouble( fedTaxWithholdingRateInput ) * 100;
		
		String stateTaxWithholdingRateInput = JOptionPane.showInputDialog( null , "Enter state tax withholding rate:" ,  "Enter an input" , JOptionPane.QUESTION_MESSAGE );
		var stateTaxWithholdingRate = Double.parseDouble( stateTaxWithholdingRateInput ) * 100;
		
		// Calculations for employee
		var grossPay = hourlyPayRate * workHours;
		var federalWithholding = ( grossPay * fedTaxWithholdingRate ) / 100;
		var stateWithholding = ( grossPay * stateTaxWithholdingRate ) / 100;
		var totalDeductions = federalWithholding + stateWithholding;
		var netPay = grossPay - totalDeductions;
		
		// Display result
		JOptionPane.showMessageDialog( null , "Employee Name: " + employeeName + "\n" +
		"Hours Worked: " + workHours + "\n" +
		"Pay Rate: " + hourlyPayRate + "\n" +
		"Gross Pay: " + grossPay + "\n" +
		"Deductions: " + "\n" +
		"\t Federal Withholding (" + fedTaxWithholdingRate / 100 + "%): $" + federalWithholding + "\n" +
		"\t State Withholding (" + stateTaxWithholdingRate / 100 + "%): $" + stateWithholding + "\n" +
		"\t Total Deduction: " + totalDeductions + "\n" +
		"Net Pay: " + netPay , employeeName, 1 );
	}
}