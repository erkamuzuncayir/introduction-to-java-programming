// Unit 6 - Exercise 19

import java.util.Scanner;

public class Exercise_6_19 //SortStudents
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter the number of students: " );
		final int Number_Of_Students = input.nextInt();

		String[] name_array = new String[ Number_Of_Students ];
		int[] score_array = new int[ Number_Of_Students ];
		
		for( int i = 0 ; i < name_array.length ; i++ )
		{
			System.out.print( "Enter one student's name : " );
			name_array[ i ] = input.next();
		}
		
		for( int i = 0 ; i < score_array.length ; i++ )
		{
			System.out.printf( "Enter %s student's score : " , name_array[ i ] );
			score_array[ i ] = input.nextInt();
		}

		SortAndDisplayStudentsScores( name_array , score_array );
	}
	
	public static void SortAndDisplayStudentsScores( String[] name_array , int[] score_array )
	{
		boolean isSorted = false;
		while( !isSorted )
		{
			isSorted = true;
			for( int i = 0 ; i < score_array.length - 1 ; i++ )
			{
				if( score_array[ i ] < score_array[ i + 1 ] )
				{
					isSorted = false;
					int tempScore = score_array[ i ];
					score_array[ i ] = score_array[ i + 1 ];
					score_array[ i + 1 ] = tempScore;
				
					String tempName = name_array[ i ];
					name_array[ i ] = name_array[ i + 1 ];
					name_array[ i + 1 ] = tempName;					
				}
			}
		}
		for( int i = 0 ; i < score_array.length ; i++ )
		{
			System.out.printf( "%s's score is: " , name_array[ i ] );
			System.out.printf( "%d\n" , score_array[ i ] );			
		}	
	}
}
