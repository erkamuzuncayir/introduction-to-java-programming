// Unit 4 - Exercise 1

import java.util.Scanner;

public class CountNumbersComputeAverage 
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		int positiveCount = 0;
		int negativeCount = 0;
		double sumOfNumbers = 0;
		double average = 0;
		int number = 0;
		
		// Prompts user to numbers
		System.out.println( "Enter an int value, the program exits if the input is 0: " );
		
		// Computes total
		do{	
			number = input.nextInt();
			if ( number < 0 )
				negativeCount++;
			else if ( number > 0 )
				positiveCount++;
			
			sumOfNumbers += number;
			
		} while ( number != 0 );
		
		// Computes average
		average = sumOfNumbers / ( positiveCount + negativeCount );
		
		// Displays result
		System.out.printf( "The number of positives is %d\n" , positiveCount );
		System.out.printf( "The number of negatives is %d\n" , negativeCount );
		System.out.printf( "The total is %.0f\n" , sumOfNumbers );
		System.out.printf( "The average is %.2f\n" , average );
	}
}
