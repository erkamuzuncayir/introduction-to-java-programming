// Unit 3 - Exercise 16

import java.util.Scanner;

public class CreatingRandomUppercaseChar
{
	public static void main( String[] args ) 
	{
		// Sets constant values and generate random number
		final double Alphabet_Number_Count = 26;
		final double Random_Number = Math.random() * Alphabet_Number_Count;
		
		// Converts number to char
		int randomNumber = ( int ) ( Random_Number % 26 ) + 65;
		char randomChar = ( char ) randomNumber;
		
		// Displays result
		System.out.print( randomChar );
	}
}