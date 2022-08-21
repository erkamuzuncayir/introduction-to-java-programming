// Unit 4 - Exercise 4

public class ConversionMileToKilometer
{
	public static void main ( String[] args )
	{
		// Creates variable and multiplier for table
		float miles = 1f;
		final float Multiplier = 1.609f;
		
		// Displays table
		System.out.println( "Miles		Kilometers\n" );
		
		for ( int kilometers = 1 ; kilometers < 11 ; kilometers++ )
		{
			miles = kilometers * Multiplier;
			System.out.printf( "%d		%.3f\n" , kilometers , miles );
		}
	}
}
