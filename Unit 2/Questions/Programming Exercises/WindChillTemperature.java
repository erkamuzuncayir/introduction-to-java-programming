// Unit 2 - Exercise 17

import java.util.Scanner;

public class WindChillTemperature
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter temperature and wind speed
		System.out.print( "Enter the temperature in Fahrenheit: " );
		Scanner scannerGetInputOne = new Scanner( System.in );
		var temperature = scannerGetInputOne.nextDouble();
		
		System.out.print( "Enter the wind speed miles per hour: " );
		Scanner scannerGetInputTwo = new Scanner( System.in );
		var windSpeed = scannerGetInputTwo.nextDouble();
		
		// Compute wind chill temperature
		var windChillIndex = 35.74 + ( 0.6215 * temperature ) - ( 35.75 * Math.pow ( windSpeed , 0.16 ) ) + ( 0.4275 * temperature * Math.pow ( windSpeed , 0.16 ) );
		
		// Display result
		System.out.println( "The wind chill index is: " + windChillIndex );
	}
}