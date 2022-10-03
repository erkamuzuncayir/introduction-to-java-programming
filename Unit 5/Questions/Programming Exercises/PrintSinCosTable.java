// Unit - Exercise 20

public class PrintSinCosTable
{
	public static void main( String[] args )
	{
		System.out.println( "Degree\tSin\t\tCos" );
		
		// Traverses all degrees
		for( int degree = 0 ; degree <= 360 ; degree += 10 )
		{
			PrintSinCosTable( degree );
		}
	}
	
	public static void PrintSinCosTable( int degree )
	{
		double sinValue = Math.sin( Math.toRadians( degree ) );
		double cosValue = Math.cos( Math.toRadians( degree ) );
		
		System.out.printf( "%d\t%.4f\t\t%.4f\n" , degree , sinValue , cosValue );
	}
}
