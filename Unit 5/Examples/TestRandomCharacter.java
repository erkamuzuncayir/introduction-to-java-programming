// Unit 5 - Listing 11

public class TestRandomCharacter
{
	// Main method
	public static void main( String[] args )
	{
		final int Number_Of_Chars = 175;
		final int Chars_Per_Line = 25;
		
		// Print random characters between 'a' and 'z', 25 chars per line
		for( int i = 0 ; i < Number_Of_Chars ; i++ )
		{
			char ch = RandomCharacter.GetRandomLowerCaseLetter();
			if( ( i + 1 ) % Chars_Per_Line == 0 )
				System.out.println( ch );
			else
				System.out.print( ch );
		}
	}
}


