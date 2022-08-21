// Unit 4 - Exercise 37

import java.util.Scanner;

public class IntegerToBinary
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter decimal integer
		System.out.print( "Please enter a decimal integer: " );
		int decimalNumber = input.nextInt();
		String binaryNumber = "";
		
		// Converts decimal integer to binary number.
		while ( decimalNumber != 0 ) 
		{
			binaryNumber = ( decimalNumber % 2 ) + binaryNumber;
			decimalNumber /= 2;
		}
		
		// Displays result
		System.out.printf( "Integer's binary form is %s\n" , binaryNumber );
	}
}
