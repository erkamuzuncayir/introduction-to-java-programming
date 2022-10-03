// Unit 5 - Exercise 13

public class SumSeries
{
	public static void main( String[] args )
	{
		System.out.printf( "i\tm(i)\n" );
		SumSeries( 20 );
	}

	public static void SumSeries( int number )
	{
		double sum = 0;
		
		for( int i = 1 ; i <= number ; i++ )
		{
			sum += ( i / ( i + 1.0 ) );
			System.out.printf( "%d\t%.4f\n" , i , sum );
		}
	}
}
