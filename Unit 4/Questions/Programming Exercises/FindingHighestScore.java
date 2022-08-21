// Unit 4 - Exercise 8

import java.util.Scanner;

public class FindingHighestScore
{
	public static void main ( String[] args )
	{
		// Creates a Scanner and variables
		Scanner input = new Scanner ( System.in );
		String highestName = "";
		int highestScore = 0;
		
		// Prompts amount of students
		System.out.println( "Please enter how many students' information you will enter?" );
		int amountOfStudent = input.nextInt();
		
		// Determines highest score
		for ( int i = 0 ; i < amountOfStudent ; i++ )
		{
			System.out.println( "Please enter student's name?" );
			String studentName = input.next();
			System.out.println( "Please enter student's score?" );
			int studentScore = input.nextInt();
			
			// Stores highest student's informations
			if ( studentScore > highestScore )
			{
				highestScore = studentScore;
				highestName = studentName;
			}
		}
		// Displays result
		System.out.printf( "%s is the highest scored student with %d score.\n" 
							, highestName , highestScore );
	}
} 
