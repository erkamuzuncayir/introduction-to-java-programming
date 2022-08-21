// Unit 4 - Exercise 9

import java.util.Scanner;

public class FindingHighestTwoScore
{
	public static void main ( String[] args )
	{
		// Creates a Scanner and variables
		Scanner input = new Scanner ( System.in );
		String highestName = "";
		int highestScore = 0;
		String secondHighestName = "";
		int secondHighestScore = 0;
		
		// Prompts user to enter amount of students
		System.out.println( "Please enter how many students' information you will enter?" );
		int amountOfStudent = input.nextInt();
		
		// Determines highest score
		for ( int i = 0 ; i < amountOfStudent ; i++ )
		{
			System.out.println( "Please enter student's name?" );
			String studentName = input.next();
			System.out.println( "Please enter student's score?" );
			int studentScore = input.nextInt();
			
			// Stores highest two students' informations
			if ( studentScore > highestScore )
			{
				secondHighestScore = highestScore;
				secondHighestName = highestName;
				highestScore = studentScore;
				highestName = studentName;
			}
			else if ( studentScore > secondHighestScore )
			{
				secondHighestScore = studentScore;
				secondHighestName = studentName;
			}
		}
		
		// Displays result
		System.out.printf( "%s is the highest scored student with %d score.\n" 
							, highestName , highestScore );
	
		System.out.printf( "%s is the second highest scored student with %d score.\n" 
							, secondHighestName , secondHighestScore );
	
	}
} 
