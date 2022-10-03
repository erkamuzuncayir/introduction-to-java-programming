// Unit 5 - Exercise 14

public class ComputeSeries
{
	public static void main( String[] args )
	{
		System.out.printf( "i\tm(i)\n" );
		ComputeSeries( 10 , 100 , 10 );		
	}
	
	public static void ComputeSeries( int start , int end , int delta )
	{
		double sum = 0;
		
		for( int i = start ; i <= end ; i += delta )
		{
			for( int j = 1 ; j <= i ; j += 2 ) // Computes odd values
			{
				sum += 1.0 / ( 2 * j - 1 );
			}
			
			for( int k = 2 ; k <= i ; k += 2 ) // Computes even values
			{
				sum -= 1.0 / ( 2 * k - 1 );
			}
			
			sum *= 4;
			
			System.out.printf( "%d\t%.5f" , i , sum );
			System.out.println();
			sum = 0;
		}
	}
}
