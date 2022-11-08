// Unit 6 - Exercise 16

import java.util.Arrays;

public class Exercise_6_16 // ExecutionTimeCompare
{
	public static void main( String[] args )
	{
		final int Array_Size = 100000; 
		final int Min_Random_Number = 0;
		final int Max_Random_Number = 2147483647;
		int[] number_array = CreateArray( Min_Random_Number , Max_Random_Number , Array_Size );		
		int key = number_array[ GetRandomNumber( 0 , Array_Size ) ];
			
		long linearSearchExecutionTime = LinearSearch( number_array , key );
		long binarySearchExecutionTime = BinarySearch( number_array , key );
	
		System.out.printf( "Linear search execution time is %d ms.\n" + 
							"Binary search execution time is %d ms." , 
							linearSearchExecutionTime , 
							binarySearchExecutionTime);
	}
	
	public static long BinarySearch ( int[] number_array , int key )
	{
		Arrays.sort( number_array );
		long startTime = System.currentTimeMillis();
		int low = 0;
		int high = number_array.length - 1;
	
		while( high >= low )
		{
			int mid = ( high + low ) / 2;
			if( key == number_array[ mid ] )
			{
				long endTime = System.currentTimeMillis();
				return endTime - startTime;
			}
			else if( key < number_array[ mid ] )
				high = mid - 1;
			else
				low = mid + 1;
		}	
		// Info: This is a dummy return, because we know the key in the array. 
		return -1;
	}
	public static long LinearSearch ( int[] number_array , int key )
	{
		long startTime = System.currentTimeMillis();
		for( int i = 0 ; i < number_array.length ; i++ )
		{
			if( key == number_array[ i ] )
				return System.currentTimeMillis() - startTime;
		}
		
		// Info: This is a dummy return, because we know the key in the array. 
		return -1; 
	}
	
	public static int[] CreateArray( int minNumber , int maxNumber , int arraySize )
	{
		int[] number_array = new int[ arraySize ];
		for( int i = 0 ; i < number_array.length ; i++ )
		{
			number_array[ i ] = GetRandomNumber( minNumber , maxNumber );
		}
		
		return number_array;
	}
	
	public static int GetRandomNumber( int minNumber , int maxNumber )
	{
		return ( int )( minNumber + Math.random() * ( maxNumber ) );
	}	
}
