// Unit 7 - Listing 5

import java.util.Scanner;

public class Weather
{
	public static void main( String[] args )
	{
		final int Number_Of_Days = 10;
		final int Number_Of_Hours = 24;
		double[][][] data = new double[ Number_Of_Days ][ Number_Of_Hours ][ 2 ];
		
		Scanner input = new Scanner( System.in );
		// Read input using input redirection from a file
		for( int k = 0; k < Number_Of_Days * Number_Of_Hours; k++ )
		{
			int day = input.nextInt();
			int hour = input.nextInt();
			double temperature = input.nextDouble();
			double humidity = input.nextDouble();
			data[ day - 1 ][ hour - 1 ][ 0 ] = temperature;
			data[ day - 1 ][ hour - 1 ][ 1 ] = humidity;
		}
		
		// Find the average daily temperature and humidity
		for( int i = 0; i < Number_Of_Days; i++ )
		{
			double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
			for( int j = 0; j < Number_Of_Hours; j++ )
			{
				dailyTemperatureTotal += data[ i ][ j ][ 0 ];
				dailyHumidityTotal += data[ i ][ j ][ 1 ];
			}
			
			// Display result
			System.out.printf( "Day %d's average temperature is %.2f\n" ,
								 i , dailyTemperatureTotal / Number_Of_Hours );
			System.out.printf( "Day %d's average humidity is %.2f\n" ,
								 i , dailyHumidityTotal / Number_Of_Hours );
		}
	}
}
