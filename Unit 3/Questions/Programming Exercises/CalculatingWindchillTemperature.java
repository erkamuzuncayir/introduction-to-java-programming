// Unit 3 - Exercise 20

import java.util.Scanner;

public class CalculatingWindchillTemperature
{
	public static void main( String[] args ) 
	{
		// Creates a scanner and variables
		Scanner getInput = new Scanner( System.in );
		boolean isTemperatureValid = false;
		boolean isWindSpeedValid = false;
		
		// Prompts the user to enter temperature and wind speed
		System.out.print( "Enter the temperature in Fahrenheit: " );
		var temperature = getInput.nextDouble();
		System.out.print( "Enter the wind speed miles per hour: " );
		var windSpeed = getInput.nextDouble();
		
		// Determines values are valid or not
		if( (temperature > -58) && ( temperature < 41 ) )
			isTemperatureValid = true;
		if( windSpeed >= 2 )
			isWindSpeedValid = true;
	
		// Displays result
		if( ( isTemperatureValid == true ) && ( isWindSpeedValid == true ) ) // Calculates wind chill index
		{
			var windChillIndex = 35.74 + ( 0.6215 * temperature ) - 
								( 35.75 * Math.pow ( windSpeed , 0.16 ) ) + 
								( 0.4275 * temperature * Math.pow ( windSpeed , 0.16 ) );
			System.out.println( "The wind chill index is: " + windChillIndex );
		}
		else if( ( isTemperatureValid == false ) && ( isWindSpeedValid == true ) )
			System.out.println( "Temperature value is not valid" );
		else if( ( isTemperatureValid == true ) && ( isWindSpeedValid == false ) )
			System.out.println( "Wind speed value is not valid" );
		else
			System.out.println( "Both values are not valid" );
	}
}