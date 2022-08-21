// Unit 4 - Exercise 45

public class Combinations
{
	public static void main ( String[] args )
	{
		int sum = 0;
		
		// Computes and displays all combinations
		for ( int i = 1 ; i < 8 ; i++ )
		{
			for ( int j = 1 ; j < 8 ; j++ )
			{
				System.out.printf( "%d %d\n" , i , j );
				sum += i + j;
			}
		}

		// Displays sum of all combinations
		System.out.printf( "Sum of the all numbers is %d\n" , sum );
	}
}
