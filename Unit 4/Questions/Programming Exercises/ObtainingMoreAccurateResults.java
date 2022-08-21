// Unit 4 - Exercise 23

public class ObtainingMoreAccurateResults
{
	public static void main ( String[] args )
	{
		double number = 0;
		
		// Sums and prints left to right
		for ( double i = 1 ; i <= 50000 ; i++ )
		{
			number += ( 1 / i );
		}
		System.out.println( "Left to right: " + number);
	
		number = 0;
		for ( double i = 50000 ; i >= 1 ; i-- )
		{
			number += ( 1 / i );
		}
		System.out.println( "Right to left: " + number);
	}
}
