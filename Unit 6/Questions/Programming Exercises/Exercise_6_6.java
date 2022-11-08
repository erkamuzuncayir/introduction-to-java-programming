// Unit 6 - Exercise 6

public class Exercise_6_6 // FindPrimeNumber
{
	public static void main( String[] args )
	{
		final int Prime_Numbers_Count = 50;
		int[] prime_number_array = new int[ Prime_Numbers_Count ];
		int count = 0;
		int number = 2; // Why: Prime numbers starts from 2.
		
		while( count < Prime_Numbers_Count )
		{
			if( IsPrime( number ) )
			{
				prime_number_array[ count ] = number;
				count++;
				if( count % 10 == 0 )
					System.out.printf( "%d\t\n" , number );
				else
					System.out.printf( "%d\t" , number );
			}
			number++;
		}
	}
	
	public static boolean IsPrime( int number )
	{
		for( int i = 2 ; i <= Math.sqrt( number ) ; i++ )
		{
			if( number % i == 0 )
				return false;
		}
		
		return true;		 
	}
}
