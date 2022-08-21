// Unit 3 - Exercise 4

import java.util.Scanner;

public class AdditionTwoNumber
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Creates two random numbers
		int number1 = ( int )( System.currentTimeMillis() % 100 );
		int number2 = ( int )( System.currentTimeMillis() * 7 % 100 );

		// Prompts the user to enter answer
		System.out.printf( "What is %d + %d?\n", number1, number2 );
		int answer = input.nextInt();
		
		// Determines answer is true or not
		boolean isAnswerTrue = ( number1 + number2 == answer );

		// Prints result
		System.out.printf( "Your answer is %b " , isAnswerTrue );
	}
}