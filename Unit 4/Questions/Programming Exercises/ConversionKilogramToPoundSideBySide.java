// Unit 4 - Exercise 5

public class ConversionKilogramToPoundSideBySide
{
	public static void main ( String[] args )
	{
		// Creates variables and multiplier for table
		int kilogramsOne = 1;
		float kilogramsTwo = 1f;
		float poundsOne = 1f;
		int poundsTwo = 1;
		final float Multiplier = 2.2f;
		
		// Displays the table
		System.out.println( "Kilograms	Pounds		Pounds	Kilograms\n" );
		
		for ( int leftIncrement = 1 , rightIncrement = 20 ; leftIncrement < 200 ; 
				leftIncrement += 2 , rightIncrement += 5 )
		{
			kilogramsOne = leftIncrement;
			poundsTwo = rightIncrement;
			
			poundsOne = kilogramsOne * Multiplier;
			kilogramsTwo = poundsTwo / Multiplier;
			
			System.out.printf( "%d		%.1f		%d		%.2f\n" , 
								kilogramsOne , poundsOne , poundsTwo , kilogramsTwo );
		}
	}
}
