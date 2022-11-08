// Unit 6 - Exercise 1

import java.util.Scanner;

public class Exercise_6_1 // AssignGrades
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter the number of students: " );
		final int Number_Of_Students = input.nextInt();
		
		int[] student_score_array = GetStudentScores( input , Number_Of_Students );
	
		int bestScore = FindMax( student_score_array );
		
		EvaluateAndDisplayGrades( bestScore , student_score_array );
	}
	
	public static int[] GetStudentScores( Scanner input , int count )
	{
		int[] score_array = new int[ count ];
		for( int i = 0 ; i < score_array.length ; i++ )
		{
			System.out.print( "Enter one student's score : " );
			score_array[ i ] = input.nextInt();
		}
	
		return score_array;	
	}
	
	public static int FindMax( int[] values )
	{
		int max = values[ 0 ];
		for( int i = 0 ; i < values.length ; i++ )
		{
			if( values[ i ] > max )
				max = values[ i ];
		}
		
		return max;
	}
	
	public static void EvaluateAndDisplayGrades( int best , int[] score_array )
	{
		for( int i = 0 ; i < score_array.length ; i++ )
		{
			if( score_array[ i ] >= best - 10 )
				System.out.printf( "Student %d score is %d and grade is A\n" , i , score_array[ i ] );  
			else if( score_array[ i ] >= best - 20 )
				System.out.printf( "Student %d score is %d and grade is B\n" , i , score_array[ i ] );  				
			else if( score_array[ i ] >= best - 30 )
				System.out.printf( "Student %d score is %d and grade is C\n" , i , score_array[ i ] ); 
			else if( score_array[ i ] >= best - 40 )
				System.out.printf( "Student %d score is %d and grade is D\n" , i , score_array[ i ] );  
			else
				System.out.printf( "Student %d score is %d and grade is F\n" , i , score_array[ i ] );  
		}
	}
}
