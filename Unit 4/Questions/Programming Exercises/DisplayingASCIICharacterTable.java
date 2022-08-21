// Unit 4 - Exercise 14

public class DisplayingASCIICharacterTable
{
	public static void main ( String[] args )
	{
		// Creates checker
		int checker = 0;
	
		// Prints table
		for ( int i = 33 ; i < 127 ; i++ )
		{
			char ASCII = (char)i;
			System.out.print( ASCII );
			checker++;
			if ( checker > 9 )
			{
				System.out.println();
				checker = 0;
			}
		}
	}
} 
