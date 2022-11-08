// Unit 6 - Exercise 4

import java.util.Scanner;

public class Exercise_6_4 // AnalyzeScores
{
	public static void main( String[] args )
	{
		final int Array_Size = 11; // Why: Because 10 inclusive in our array 
		int[] score_array = new int[ Array_Size ]; 
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter a couple of number between 0 and 10 " + 
							"(If you enter a negative number, input process will end.) : ");		
		int inputNumber = input.nextInt();
		int inputCount = 0;
		
		while( inputNumber >= 0 )
		{
			inputCount++;
			score_array[ inputNumber ] = score_array[ inputNumber ] + 1;
			inputNumber = input.nextInt();
		}
		
		int averageOfScores = FindAverage( score_array , inputCount );
		
		PrintAboveAndBelowCount( score_array , averageOfScores );
	}

	public static int FindAverage( int[] values , int countOfValues )
	{
		int average = 0;
		
		for( int i = 0 ; i < values.length ; i++)
			average += i * values[ i ];
			
		average /= countOfValues;
		
		return average;
	}
	
	public static void PrintAboveAndBelowCount( int[] values , int average )
	{
		int aboveOrEqual = 0;
		int below = 0;

		for( int i = 0 ; i < values.length ; i++)
		{
			if( i < average && values[ i ] > 0)
				below += values[ i ];
			else if( values[ i ] > 0 )
				aboveOrEqual += values[ i ];
		}
			
		System.out.printf( "Average of number is %d.\n" + 
							"%d numbers above or equal to average.\n" + 
							"%d numbers are below the average.\n" , 
								average , aboveOrEqual , below );
	}
}
