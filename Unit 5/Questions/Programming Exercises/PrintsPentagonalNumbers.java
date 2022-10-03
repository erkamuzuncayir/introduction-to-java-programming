// Unit 5 - Exercise 1

public class PrintsPentagonalNumbers
{
	public static void main( String[] args )
	{
		int times = 100;
		int count = 0;
		
		// Prints first 100 pentagonal number
		for ( int i = 1 ; i <= times ; i++ ) 
		{
			int pentagonalNumber =	GetPentagonalNumber( i );
			System.out.print( pentagonalNumber + "\t" );
			
			count++;
			
			if ( count > 9 )
			{
				System.out.println();
				count = 0;
			}
		}
	}
	
	public static int GetPentagonalNumber ( int n )
	{
		int pentagonalNumber = n * ( 3 * n - 1 ) / 2;

		return pentagonalNumber;
	}
}
