// Unit 6 - Listing 3

public class TestPassArray
{
	public static void main( String[] args )
	{
		int[] a = { 1 , 2 };
		
		// Swap elements using the swap method
		System.out.print( "Before invoking Swap" );
		System.out.printf( " array is {%d, %d}\n" , a[ 0 ] , a [ 1 ] );
		Swap( a[ 0 ] , a [ 1 ] );
		System.out.print( "After invoking Swap" );
		System.out.printf( " array is {%d, %d}\n" , a[ 0 ] , a [ 1 ] );
		
		// Swap elements using the swapFirstTwoInArray method

		System.out.print( "Before invoking SwapFirstTwoInArray" );
		System.out.printf( " array is {%d, %d}\n" , a[ 0 ] , a [ 1 ] );
		SwapFirstTwoInArray( a );
		System.out.print( "After invoking SwapFirstTwoInArray" );
		System.out.printf( " array is {%d, %d}\n" , a[ 0 ] , a [ 1 ] );
	}
	
	// Swap two variables
	public static void Swap( int n1 , int n2 )
	{
		int temp = n1;
		n1 = n2;
		n2 =temp;
	}
	
	// Swap the first two elements in the array
	public static void SwapFirstTwoInArray( int[] array )
	{
		int temp = array[ 0 ];
		array[ 0 ] = array[ 1 ];
		array[ 1 ] = temp;
	}
}
