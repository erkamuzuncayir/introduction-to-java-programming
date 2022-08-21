// Unit 4 - Exercise 24

public class SummingSeries
{
	public static void main ( String[] args ) 
	{
		double sum = 0;
		
		// Sums series
		for ( double i = 1 ; i < 100 ; i += 2 )
		{
			sum += i / ( i + 2 );		
		}
		
		// Displays result
		System.out.printf( "Sum is %f." , sum );
	}
}
