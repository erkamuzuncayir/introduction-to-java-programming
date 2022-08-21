// Unit 2 - Exercise 19

public class RandomCharacter
{
	public static void main( String[] args ) 
	{
		// Getting random number in Unix time
		long randomLongNumber = System.currentTimeMillis();
		
		// Set to uppercase range
		int randomNumber = ( int ) ( randomLongNumber % 26 ) + 65;
		char randomChar = ( char ) randomNumber;
		
		// Display result
		System.out.println( randomChar );
	}
}