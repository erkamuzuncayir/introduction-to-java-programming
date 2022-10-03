// Unit 5 - Exercise 11

public class ComputeCommision
{
	public static void main( String[] args )
	{
		System.out.println( "Sales Amount\tCommision" );
		for( int i = 10000 ; i <= 100000 ; i += 5000 )
		{
			double commisionAmount = ComputeCommision( i );
			System.out.printf( "%d\t\t%.1f\n" , i , commisionAmount );
		}
	}

	public static double ComputeCommision( double salesAmount )
	{
		double sale = 0;
		double commisionAmount = 0;

		// Calculates sale amount 
		while ( sale <= salesAmount )
		{
			commisionAmount = 0;
			sale += 0.01;
			
			if( sale > 10000 ) // Computes sales more than 10000
				commisionAmount = ( 5000 * 0.08 ) + ( 5000 * 0.1 )
									 + ( ( sale - 10000 ) * 0.12 );
			else if( sale > 5000 ) // Computes sales more than 5000
				commisionAmount = ( 5000 * 0.08 ) + ( ( sale - 5000 ) * 0.1 );
			else // Computes sales less than 5000
				commisionAmount = sale * 0.08;
		}
		
		return commisionAmount;
	}

}
