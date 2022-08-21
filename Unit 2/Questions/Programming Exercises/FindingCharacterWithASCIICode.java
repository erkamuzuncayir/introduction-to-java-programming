// Unit 2 - Exercise 8

import java.util.Scanner;

public class FindingCharacterWithASCIICode
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter an ASCII code
		System.out.print( "Enter an ASCII code: " );
		Scanner scannerGetInput = new Scanner( System.in );
		var scannerInput = scannerGetInput.nextInt();
		
		// Finding char
		char result = ( char ) scannerInput;
		
		// Display result
		System.out.println( "The sum of the digits is: " + result );
	}
}