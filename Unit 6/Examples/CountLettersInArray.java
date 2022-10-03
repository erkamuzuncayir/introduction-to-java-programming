// Unit 6 - Listing 4

public class CountLettersInArray
{
	public static void main( String[] args )
	{
		// Declare and create an array
		char[] chars = CreateArray();
		
		// Display the array
		System.out.println( "The lowercase letters are:" );
		DisplayArray( chars );
		
		// Count the occurences of each letter
		int[] counts = CountLetters( chars );
		
		// Display counts
		System.out.println();
		System.out.println( "The occurences of each letter are:" );
		DisplayCounts( counts );
	}
	
	// Create an array of characters
	public static char[] CreateArray()
	{
		// Declare an array of characters and create it
		char[] chars = new char[ 100 ];
		
		// Create lowercase letters randomly and assign them to the array
		for( int i = 0 ; i < chars.length ; i++ )
			chars[ i ] = GetRandomLowerCaseLetter();
			
		// Return the array
		return chars;
	}
	
	// Display the array of characters
	public static void DisplayArray( char[] chars )
	{
		// Display the characters in the array 20 on each line
		for( int i = 0 ; i < chars.length ; i++ )
		{
			if( ( i + 1 ) % 20 == 0 )
				System.out.println( chars[ i ] );
			else
				System.out.print( chars[ i ] + " " );
		}	
	}
	
	// Count the occurences of each letter
	public static int[] CountLetters( char[] chars )
	{
		// Declare and create an array of 26 int
		int[] counts = new int[ 26 ];
		
		// For each lowercase letter in the array, count it
		for( int i = 0 ; i < chars.length ; i++ )
			counts[ chars[ i ] - 'a' ]++;
			
		return counts;
	}
	
	
	// Display counts
	public static void DisplayCounts( int[] counts )
	{
		for( int i = 0 ; i < counts.length ; i++ )
		{
			if( ( i + 1 ) % 10 == 0 )
				System.out.printf( "%d %c\n" , counts[ i ] , ( char )( i + 'a' ) );
			else
				System.out.printf( "%d %c " , counts[ i ] , ( char )( i + 'a' ) );
		}
	}
	
	public static char GetRandomLowerCaseLetter()
	{
		return ( char )( 'a' + Math.random() * ( 'z' - 'a' + 1 ) );
	}
}
