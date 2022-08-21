// Unit 4 - Exercise 2

import java.util.Scanner;

public class RepeatingAdditions
{
	public static void main( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Stores start time
		long startTime = System.currentTimeMillis();
		int numberOne = 0;
		int numberTwo = 0;
		int correctCount = 0;
		
		for ( int i = 0 ; i < 10 ; i++ )
		{
			System.out.println( "Enter two integers between 1 and 15 for addition: " );

			// Determine numbers between 1 and 15 and gets input
			while ( ( numberOne < 1 ) || ( numberOne > 14 ) && 
					( numberTwo < 1 ) || ( numberTwo > 14 ) )
			{
				numberOne = input.nextInt();
				numberTwo = input.nextInt();
			}
			
			// Asks addition
			System.out.printf( "What is the sum of %d and %d\n" , numberOne, numberTwo );
			int userAnswer = input.nextInt();
			
			// Sums numbers
			int sumOfNumbers = numberOne + numberTwo;
			
			// Determines answer true or not
			if ( userAnswer == sumOfNumbers )
			{	
				System.out.printf( "\nYou're right! Sum of %d and %d is %d.\n\n" , 
								numberOne , numberTwo, userAnswer );
				correctCount++;
				numberOne = 0;
				numberTwo = 0;
			}
			else
			{
				System.out.printf( "\nYou're wrong! Sum of %d and %d is %d.\n" , 
							numberOne , numberTwo, sumOfNumbers );
				numberOne = 0;
				numberTwo = 0;
			}
		}
		
		// Calculates passing time
		long exitTime = System.currentTimeMillis();
		int secondsPassed = ( int )( ( ( exitTime - startTime ) / 1000 ) % 60 );
		int minutesPassed = ( int )( ( ( exitTime - startTime ) / 1000 ) / 60 );

		// Prints passing time
		System.out.printf( "You found correct answer %d time(s).\n%d minute(s) and %d second(s) passed.\n" 
							, correctCount, minutesPassed, secondsPassed );

	}
}
