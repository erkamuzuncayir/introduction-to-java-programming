// Unit 6 - Listing 6

public class LinearSearch
{
	public static void main( String[] args )
	{
		int result = LinearSearch( new int[]{ 3 , 5 , 2 , 4 , -1 } , 2 ); 
		System.out.println( result );
	}
	
	// The method for finding a key in the list
	public static int LinearSearch( int[] list , int key )
	{
		for( int i = 0 ; i < list.length ; i++ )
		{
			if( key == list[ i ] )
				return i;
		}
		return -1;
	}
}
