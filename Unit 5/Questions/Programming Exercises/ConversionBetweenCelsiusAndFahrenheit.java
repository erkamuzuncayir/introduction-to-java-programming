// Unit 5 - Exercise 8

public class ConversionBetweenCelsiusAndFahrenheit
{
	public static void main( String[] args )
	{
		System.out.println( "Celsius\tFahrenheit\tFahrenheit\tCelsius" );
		for( int i = 40 , j = 120 ; i > 30 ; i-- , j -= 10 )
		{
			double fahrenheit = CelsiusToFahrenheit( i );
			
			double celsius = FahrenheitToCelsius( j );
			
			System.out.printf( "%d\t%.1f\t\t%d\t\t%.2f" , i , fahrenheit , j , celsius );
			System.out.println();
		}
	}
	
	public static double CelsiusToFahrenheit( double celsius )
	{
		double fahrenheit = ( 9.0 / 5 ) * celsius + 32;
		
		return fahrenheit;
	}
	
	public static double FahrenheitToCelsius( double fahrenheit )
	{
		double celsius = ( fahrenheit - 32 ) / ( 9.0 / 5 );
	
		return celsius;
	}
}
