// Unit 2 - Exercise 5

import java.util.Scanner;

public class CalculatingTips
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter subtotal and gratuity
		System.out.print( "Enter the subtotal and a gratuity rate: " );
		Scanner scannerGetInput = new Scanner( System.in );
		var subtotal = scannerGetInput.nextDouble();
		var gratuityRate = scannerGetInput.nextDouble();
		
		// Compute tips
		double gratuity = ( subtotal * gratuityRate ) / 100;
		double total = subtotal + gratuity;
		
		// Display result
		System.out.println( "The gratuity is " + gratuity + " and total is " + total );
	}
}