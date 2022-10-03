// Unit 5 - Exercise 12

public class DisplayCharacters
{
	public static void main( String[] args )
	{
		PrintChars( '1' , 'Z' , 10 );
	}
	
	// Takes two chars and prints chars between them, according to third integer value.
	public static void PrintChars( char ch1 , char ch2 , int NumberPerLine )
	{
		int count = 1;
		
		for( int i = ch1 ; i <= ch2 ; i++ )
		{
			System.out.print( ( char )i );
			
			count++;
			if( count > NumberPerLine )
			{
				System.out.println();
				count = 1;
			}
		}
	}
}
