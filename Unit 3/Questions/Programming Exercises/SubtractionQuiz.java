// Unit 3 - Exercise 10

import java.util.Scanner;

public class SubtractionQuiz
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Creates two random numbers
		int number1 = ( int )( System.currentTimeMillis() % 100 );
		int number2 = ( int )( System.currentTimeMillis() * 7 % 100 );

		// Changes numbers' positions for substraction operator
		if ( number1 < number2 )
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// Prompts the user to enter answer
		System.out.printf( "What is %d - %d?\n", number1, number2 );
		int answer = input.nextInt();

		// Determines answer is true or not
		boolean isAnswerTrue = ( number1 - number2 ) == answer;

		// Displays result
		System.out.printf( "Your answer is %b " , isAnswerTrue );
	}
}