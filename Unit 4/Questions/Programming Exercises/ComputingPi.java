// Unit 4 - Exercise 25

public class ComputingPi
{
	public static void main ( String[] args )
	{
		for ( double i = 10000 ; i <= 100000 ; i += 10000 )
		{
			double sum = 0;
			
			// Computes pi
			for ( double j = 1.0 ; j <= ( 2 * i - 1 ) ; j += 4 )
			{
				sum += 1.0 / j;
				sum -= 1.0 / ( j + 2 ); 
			}

			double pi = 4 * sum;
			
			// Displays result
			System.out.printf( "Pi is %.10f when i is %.0f.\n" , pi , i ); 
		} 
	}
}
