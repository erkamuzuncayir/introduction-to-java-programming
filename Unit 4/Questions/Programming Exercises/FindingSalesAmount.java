// Unit 4 - Exercise 39

public class FindingSalesAmount
{
	public static void main ( String[] args )
	{
		double sale = 0;
		double commisionAmount = 0;

		// Calculates sale amount 
		while ( commisionAmount <= 25000 )
		{
			sale += 0.01;
			if ( sale <= 5000 )
				commisionAmount = sale * 0.08;
			else if ( sale <= 10000 )
				commisionAmount = sale * 0.1;
			else
				commisionAmount = sale * 0.12;
		}
		
		// Displays result
		System.out.println( sale );
	}
}
