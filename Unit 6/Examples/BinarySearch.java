// Unit 6 - Listing 7

public class BinarySearch
{
	public static void main( String[] args )
	{
		int result = BinarySearch( new int[] { -6 , 2 , 5 , 23 , 66 , 83 } , 23 );
		System.out.println( result );
	}	
	// Use binary search to find the key in the list
	public static int BinarySearch( int[] list , int key )
	{
		int low = 0;
		int high = list.length - 1;
		
		while( high >= low )
		{
			int mid = ( low + high ) / 2;
			if( key < list[ mid ] )
				high = mid - 1;
			else if( key == list[ mid ] )
				return mid;
			else
				low = mid + 1;
		}
		
		return -low - 1; // Now high < low, key not found
	}
}
