// Unit 5 - Exercise 18

public class FindSquareRoot
{
	public static void main( String[] args)
	{
		System.out.println( "Number\tSquare Root" );
		FindAndPrintSquareRoot( 20 );
	}
	
	public static void FindAndPrintSquareRoot( int lastNumber )
	{
		for( int start = 0 ; start <= lastNumber ; start += 2 )
		{
			double squareRoot = Math.sqrt( start );
			System.out.printf( "%d\t%.4f\n" , start , squareRoot );
		}
	}
}
