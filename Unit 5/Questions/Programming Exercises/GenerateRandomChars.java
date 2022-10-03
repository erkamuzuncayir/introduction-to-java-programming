// Unit 5 - Exercise 23

public class GenerateRandomChars
{
	public static void main( String[] args )
	{
		final int Number_Of_Chars = 100;
		final int Chars_Per_Line = 10;
		
		for( int i = 0 ; i < Number_Of_Chars ; i++ ) // Generate Uppercase letters
		{
			char ch = GetRandomUpperCaseLetter();
			if( ( i + 1 ) % Chars_Per_Line == 0 )
				System.out.println( ch );
			else
				System.out.print( ch );
		}
		
		for( int i = 0 ; i < Number_Of_Chars ; i++ ) // Generate digits
		{
			char ch = GetRandomDigit();
			if( ( i + 1 ) % Chars_Per_Line == 0 )
				System.out.println( ch );
			else
				System.out.print( ch );
		}
	}
	
	public static char GetRandomUpperCaseLetter()
	{
		return GetRandomChar( 'A' , 'Z' );
	}
	
	public static char GetRandomDigit()
	{
		return GetRandomChar( '0' , '9' );
	}

	public static char GetRandomChar( char ch1 , char ch2 )
	{
		return ( char )( ch1 + Math.random() * ( ch2 - ch1 + 1 ) );
	}
}
