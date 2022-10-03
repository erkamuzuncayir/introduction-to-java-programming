// Unit 6 - Listing 8

public class SelectionSort
{
	public static void main( String[] args )
	{
		double[] list = new double[] { 3.2 , 0.5 , 6 , 98 , 0 };
		SelectionSort( list );
		
		for( double l: list )
			System.out.println( l );
	}

	// The method for sorting the number
	public static void SelectionSort( double[] list )
	{
		for( int i = 0 ; i < list.length - 1; i++ )
		{
			// Find the minimum in the list[ i .. list.length - 1 ]
			double currentMin = list[ i ];
			int currentMinIndex = i;
			
			for( int j = i + 1 ; j < list.length ; j++ )
			{
				if( currentMin > list[ j ] )
				{
					currentMin = list[ j ];
					currentMinIndex = j;
				}
			}
			
			// Swap list[ i ] with list[ currentMinIndex ] if necessary;
			if( currentMinIndex != i )
			{
				list[ currentMinIndex ] = list[ i ];
				list[ i ] = currentMin;
			}
		}
	}
}
