// Unit 4 - Exercise 3

public class ConversionKilogramToPound
{
	public static void main ( String[] args )
	{
		// Creates variable and multiplier for table
		float pounds = 1f;
		final float Multiplier = 2.2f;
		
		// Displays table
		System.out.println( "Kilograms	Pounds\n" );
		
		for ( int kilograms = 1 ; kilograms < 200 ; kilograms += 2 )
		{
			pounds = kilograms * Multiplier;
			System.out.printf( "%d		%.1f\n" , kilograms , pounds );
		}
	}
}
