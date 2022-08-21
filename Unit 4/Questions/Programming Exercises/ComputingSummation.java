// Unit 4 - Exercise 35

public class ComputingSummation
{
	public static void main ( String[] args )
	{
		double sum = 0;
		
		// Computes summation
		for ( int i = 1 ; i < 626 ; i++ )
		{
			sum += 1.0 / ( Math.pow( i , 0.5 ) + Math.pow( i + 1 , 0.5 ) ); 
		}
		
		// Displays result
		System.out.printf( "The sum is %.14f\n" , sum );
	}
}
