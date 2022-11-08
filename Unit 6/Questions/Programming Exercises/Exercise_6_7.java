// Unit 6 - Exercise 7

public class Exercise_6_7 // CountDigits
{
	public static void main( String[] args )
	{
		final int Generate_Number_Count = 100;
		int[] count_array = new int[ 10 ];
		
		for( int i = 0 ; i < Generate_Number_Count ; i++ )
		{
			int randomNumber = ( int )( Math.random() * 10 ); 
			// Why: Program don't store numbers, simply adds 1 to the index corresponding to the number
			count_array[ randomNumber ] = count_array[ randomNumber ] + 1; 
		}
		
		for( int i = 0 ; i < count_array.length ; i++ )
			System.out.printf( "There are %d %d's in our array.\n" , count_array[ i ] , i );
	}
}
