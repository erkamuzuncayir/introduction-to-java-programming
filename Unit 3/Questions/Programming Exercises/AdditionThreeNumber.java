// Unit 3 - Exercise 5

import java.util.Scanner;

public class AdditionThreeNumber
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Creates three random numbers
		int number1 = ( int )( System.currentTimeMillis() % 100 );
		int number2 = ( int )( System.currentTimeMillis() * 7 % 100 );
		int number3 = ( int )( System.currentTimeMillis() * 5 % 100 );

		// Prompts the user to enter answer
		System.out.printf( "What is %d + %d + %d?\n", number1, number2, number3 );
		int answer = input.nextInt();

		// Determines answer is true or not
		boolean isAnswerTrue = number1 + number2 + number3 == answer;

		// Displays result
		System.out.printf( "Your answer is %b " , isAnswerTrue );
	}
}