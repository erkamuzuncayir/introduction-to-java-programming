// Unit 5 - Exercise 17

public class DisplayMatrix0And1
{
	public static void main( String[] args )
	{
		PrintMatrix( 3 );
	}	
	
	public static void PrintMatrix( int n )
	{
		for( int row = 0 ; row < n ; row++ )
		{
			for( int column = 0 ; column < n ; column++ )
			{
				long number = Math.round( Math.random() );
				System.out.print( number );
			}
			System.out.println(); // Creates new row
		}
	}
}
