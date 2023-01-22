// Unit 7 - Exercise 3

public class Exercise_7_3 // SortStudentsGrades
{
	public static void main( String[] args )
	{
		// Students' answers to the questions
		char[][] answers = 
			{
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }
			};
		
		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		// Array for student and their grades
		int[][] students_and_grades = new int[ answers.length ][ 2 ];
		
		// Grade all answers
		for( int i = 0; i < answers.length; i++ )
		{
			int correctCount = 0;
			for( int j = 0; j < answers[ i ].length; j++ )
			{
				if( answers[ i ][ j ] == keys[ j ] )
					correctCount++;
			}
			
			// Adds every students grades to array according to input order
			students_and_grades[ i ][ 0 ] = correctCount;
			students_and_grades[ i ][ 1 ] = i;	
		}

		// Sort grades
		int[][] sorted_grades = SortGrades( students_and_grades );
		
		// Print grades
		for( int i = 0; i < sorted_grades.length; i++ )
				System.out.printf( "The student %d's grade is %d.\n" , 
									sorted_grades[ i ][ 1 ] , sorted_grades[ i ][ 0 ] );
	}
	
	public static int[][] SortGrades( int[][] students_and_grades )
	{	
		for( int i = 0; i < students_and_grades.length - 1; i++ )
		{
			for( int j = i + 1; j < students_and_grades.length ; j++ )
			{
				if( students_and_grades[ i ][ 0 ] > students_and_grades[ j ][ 0 ] )
				{
					int[] temp = students_and_grades[ i ];
					students_and_grades[ i ] = students_and_grades[ j ]; 
					students_and_grades[ j ] = temp;
				}
			}
		}
		
		return students_and_grades;
	}
}
