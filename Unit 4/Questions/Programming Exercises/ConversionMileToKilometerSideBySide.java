// Unit 4 - Exercise 6

public class ConversionMileToKilometerSideBySide
{
	public static void main ( String[] args )
	{
		// Creates variables and multiplier for table
		int milesOne = 1;
		float milesTwo = 1f;
		float kilometerOne = 1f;
		int kilometerTwo = 1;
		final float Multiplier = 1.609f;
		
		// Displays the table
		System.out.println( "Miles		Kilometers	Kilometers	Miles\n" );
		
		for ( int leftIncrement = 1 , rightIncrement = 20 ; leftIncrement < 11 ;
				 leftIncrement++ , rightIncrement += 5 )
		{
			milesOne = leftIncrement;
			kilometerTwo = rightIncrement;
			
			kilometerOne = milesOne * Multiplier;
			milesTwo = kilometerTwo / Multiplier;
			
			System.out.printf( "%d		%.3f		%d		%.3f\n" , 
								milesOne , kilometerOne , kilometerTwo , milesTwo );
		}
	}
}
