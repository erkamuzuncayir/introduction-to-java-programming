// Unit 5 - Listing 10

public class RandomCharacter
{
	// Generate a random character between ch1 and ch2
	public static char GetRandomCharacter( char ch1 , char ch2 )
	{
		return ( char )( ch1 + Math.random() * ( ch2 - ch1 + 1 ) );
	}
	
	// Generate a random lowercase letter
	public static char GetRandomLowerCaseLetter()
	{
		return GetRandomCharacter( 'a' , 'z' );
	}
	
	// Generate a random uppercase letter
	public static char GetRandomUpperCaseLetter()
	{
		return GetRandomCharacter( 'A' , 'Z' );
	}
	
	// Generate a random digit character
	public static char GetRandomDigitCharacter()
	{
		return GetRandomCharacter( '0' , '9' );
	}
	
	// Generate a random character
	public static char GetRandomCharacter()
	{
		return GetRandomCharacter( '\u0000' , '\uFFFF' );
	}
}	
