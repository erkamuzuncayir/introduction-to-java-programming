// Unit 4 - Exercise 7

public class ComputingFutureTuition
{
	public static void main ( String[] args )
	{
		float tuition = 10000f;
		float sumOfFourYears = 0;
		int year = 0;
		
		// Calculates tuitions and sums
		for( int i = 0 ; i < 10 ; i++ )
		{
			tuition *= 1.05;
			year++;	
			System.out.printf( "Tuition of %d. year is %.2f\n" , year , tuition ); 

			if ( i < 4 )
			{
				sumOfFourYears += tuition;
			}
		}
		
		// Displays total cost
		System.out.printf( "Total cost of 4 years is %.2f\n" , sumOfFourYears );
	}
}
