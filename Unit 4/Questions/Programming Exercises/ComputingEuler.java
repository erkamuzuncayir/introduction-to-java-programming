// Unit 4 - Exercise 26

public class ComputingEuler
{
	public static void main ( String[] args )
	{
		double euler = 1;
		double keeper = 1;
		
		// Computes euler number
		for ( double i = 10000 ; i <= 100000 ; i+= 10000 )
		{
			for ( double j = 1.0 ; j <= i ; j++ )
			{
				keeper *= j;
				euler += 1 / keeper;
			}
		
			System.out.printf( "When i is %.0f , e is %.10f\n" , i , euler );
		
			euler = 1;
			keeper = 1;
		}
	}
}
