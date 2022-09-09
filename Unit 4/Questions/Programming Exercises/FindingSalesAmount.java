// Unit 4 - Exercise 39

public class FindingSalesAmount
{
	public static void main ( String[] args )
	{
		double sale = 0;
		double commisionAmount = 0;

		// Calculates sale amount 
		while ( commisionAmount <= 25000 ) // Subtracted 5000 from 30000 for find the commision amount
		{
			commisionAmount = 0;
			sale += 0.01;
			
			if( sale > 10000 )
				commisionAmount = ( 5000 * 0.08 ) + ( 5000 * 0.1 )
									 + ( ( sale - 10000 ) * 0.12 );
			else if( sale > 5000 )
				commisionAmount = ( 5000 * 0.08 ) + ( ( sale - 5000 ) * 0.1 );
			else
				commisionAmount = sale * 0.08;
		}
		
		// Displays result
		System.out.println( sale );
	}
}
