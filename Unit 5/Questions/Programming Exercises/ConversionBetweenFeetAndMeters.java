// Unit 5 - Exercise 9

public class ConversionBetweenFeetAndMeters
{
	public static void main( String[] args )
	{
		System.out.println( "Feet\tMeters\t\tMeters\tFeet" );
		
		final double Modifier = 0.305;
		
		for( int i = 1 , j = 20 ; i < 11 ; i++ , j += 5 )
		{
			double meter = FootToMeter( i , Modifier );
			
			double foot = MeterToFoot( j , Modifier );
			
			System.out.printf( "%d\t%.3f\t\t%d\t%.3f" , i , meter , j , foot );
			System.out.println();
		}
	}
	
	public static double FootToMeter( double foot , double Modifier )
	{
		double meter = Modifier * foot;
		
		return meter;
	}
	
	public static double MeterToFoot( double meter , double Modifier )
	{
		double foot = meter / Modifier;
	
		return foot;
	}
}
