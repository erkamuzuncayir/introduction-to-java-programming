// Unit 4 - Exercise 7

public class ComputingFutureTuition
{
	public static void main ( String[] args )
	{
		final double Interest_Rate = 1.05;
		float tuition = 10000f;
		float sumOfFourYears = 0;
		int year = 0;
		
		// Calculates tuitions
		for( int i = 0 ; i < 10 ; i++ )
		{
			tuition *= Interest_Rate;
			year++;	
			System.out.printf( "Tuition of %d. year is %.2f\n" , year , tuition ); 
		}
		
		// Calculates sum of four years from now
		for( int j = 0 ; j < 4 ; j++ )
		{
			tuition *= Interest_Rate;
			sumOfFourYears += tuition;
		}
		
		// Displays total cost
		System.out.printf( "Total cost of 4 years ten years from now is %.2f\n"
							 , sumOfFourYears );
	}
}
